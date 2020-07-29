/*
 * Copyright 2019-2020 Douglas Kaip
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

import static com.CIMthetics.jvulkan.VulkanCore.VulkanFunctions.wlSurfaceCommit;
import static com.CIMthetics.jvulkan.VulkanCore.VulkanFunctions.wlSurfaceDamage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.CIMthetics.jvulkan.Wayland.Handles.WlSurfaceHandle;

public class WlSurface extends WaylandInterfaceObject
{
    private Logger log = LoggerFactory.getLogger(WlCompositor.class.getName());
    private WlDisplaySingleton wlDisplay = WlDisplaySingleton.getInstance();

    public WlSurface(WlSurfaceHandle handle)
    {
        setHandle(handle);

        // Put myself on the proxy map
        wlDisplay.addToProxyMap(this);
    }
    
    public void commit()
    {
        wlSurfaceCommit((WlSurfaceHandle)getHandle());
    }
    
    public void damage(int x, int y, int width, int height)
    {
        wlSurfaceDamage((WlSurfaceHandle)getHandle(), x, y, width, height);
    }
    
    @Override
    void handleEvent(WaylandEventObject eventObject)
    {
        WlSurfaceEvents event = (WlSurfaceEvents)eventObject;

        log.debug("Processing {} event.", event.getEventType());
        switch(event.getEventType())
        {
            case ENTER:
                // TODO we need to implement a java callback to be fired here
                WlOutput outputDevice = (WlOutput) wlDisplay.getObjectProxyMap().get(event.getOutputHandle());
                String outputDescription = "Unknown";
                if (outputDevice == null)
                {
                    log.warn("WlOutput device %s is not in the proxy map", event.getOutputHandle().toString());
                }
                outputDescription = outputDevice.getMake() + " " + outputDevice.getModel();
                log.debug("Surface {} has just ENTERED output device {}.", getHandle().toString(), outputDescription);
                break;
            case LEAVE:
                // TODO we need to implement a java callback to be fired here
                outputDevice = (WlOutput) wlDisplay.getObjectProxyMap().get(event.getOutputHandle());
                outputDescription = "Unknown";
                if (outputDevice == null)
                {
                    log.warn("WlOutput device %s is not in the proxy map", event.getOutputHandle().toString());
                }
                outputDescription = outputDevice.getMake() + " " + outputDevice.getModel();
                log.debug("Surface {} has just LEFT output device {}.", getHandle().toString(), outputDescription);
                break;
            case ERROR:
                log.error("Error case.");
                break;
            default:
                log.error("Unhandled case of {}." , event.getEventType().toString());
                break;
        }
    }
    
    @Override
    public WlSurfaceHandle getHandle()
    {
        return (WlSurfaceHandle)handle;
    }
}
