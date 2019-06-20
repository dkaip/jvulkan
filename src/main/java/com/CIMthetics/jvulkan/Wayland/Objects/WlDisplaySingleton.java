/*
 * Copyright 2019 Douglas Kaip
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.CIMthetics.jvulkan.Wayland.Objects;

import static com.CIMthetics.jvulkan.VulkanCore.VK11.VulkanFunctions.wlDisplayConnect;
import static com.CIMthetics.jvulkan.VulkanCore.VK11.VulkanFunctions.wlDisplayDisconnect;
import static com.CIMthetics.jvulkan.VulkanCore.VK11.VulkanFunctions.wlDisplayGetRegistry;
import static com.CIMthetics.jvulkan.VulkanCore.VK11.VulkanFunctions.wlDisplaySync;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.CIMthetics.jvulkan.VulkanCore.VK11.Handles.VulkanHandle;
import com.CIMthetics.jvulkan.Wayland.Handles.WlDisplayHandle;
import com.CIMthetics.jvulkan.Wayland.Handles.WlRegistryHandle;

public class WlDisplaySingleton extends WaylandInterfaceObject
{
    private Logger log = LoggerFactory.getLogger(WlDisplaySingleton.class.getName());
    private static final WlDisplaySingleton instance = new WlDisplaySingleton();

    private Thread                                  waylandEventHandlerThread;
    private WaylandEventHandler                     waylandEventHandler = null;
    private LinkedBlockingQueue<WaylandEventObject> eventHandlerWorkQueue = null;
    
    private ConcurrentHashMap<VulkanHandle,WaylandInterfaceObject>   objectProxyMap = new ConcurrentHashMap<VulkanHandle,WaylandInterfaceObject>();


    private WlDisplaySingleton()
    {
        /*
         * Start the message handler for the inbound messages
         */
        waylandEventHandler = new WaylandEventHandler(objectProxyMap);
        waylandEventHandlerThread = new Thread(waylandEventHandler);
        waylandEventHandlerThread.setName("Wayland event handler thread");
        waylandEventHandlerThread.start();

        // We will need this to send a shutdown event
        eventHandlerWorkQueue = waylandEventHandler.getWorkQueue();
    }
    
    public static WlDisplaySingleton getInstance()
    {
        return instance;
    }
    
    public void connect(String waylandServerName)
    {
        WlDisplayHandle waylandDisplay = wlDisplayConnect(waylandServerName, eventHandlerWorkQueue);
        if (waylandDisplay == null)
        {
            log.error("Could not connect to Wayland server:{}", waylandServerName == null ? "null(default wayland-0)" : waylandServerName);
        }
        
        // Set the object id for self
        setHandle(waylandDisplay);
        
        // Put myself on the proxy map
        objectProxyMap.put(waylandDisplay, this);
    }

    public void disconnect()
    {
        wlDisplayDisconnect((WlDisplayHandle)getHandle());

        /*
         * Note: This will kill the event handler...in a multi display environment
         * this may not be what you want, but, at the momen it will not happen since
         * this is a singleton object.
         */
        WaylandEventObject terminateEvent = new WaylandEventObject(getHandle()); // the handle here is just to appease the constructor
        terminateEvent.killEventHandler();
        try
        {
            eventHandlerWorkQueue.put(terminateEvent);
        }
        catch (InterruptedException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    public void sync()
    {
        wlDisplaySync((WlDisplayHandle)getHandle());
    }
    
    public WlRegistry getRegistry()
    {
        WlRegistryHandle waylandRegistry = wlDisplayGetRegistry((WlDisplayHandle)this.getHandle());
        WlRegistry registry = new WlRegistry(waylandRegistry);
        return registry;
    }

    @Override
    void handleEvent(WaylandEventObject eventObject)
    {
        // TODO Auto-generated method stub
        
    }
    
    public void addToProxyMap(WaylandInterfaceObject entry)
    {
//        log.debug("Adding handle {} to proxymap.", entry.getHandle().toString());
        objectProxyMap.put(entry.getHandle(), entry);
        
        /*
         * We have a new entry in the proxy map so make sure we handle any
         * events that might already be pending for it.
         */
        dispatchDelayedEvents();
    }
    
    public void dispatchDelayedEvents()
    {
        waylandEventHandler.moveDelayedQueueToWorkQueue();
    }
}
