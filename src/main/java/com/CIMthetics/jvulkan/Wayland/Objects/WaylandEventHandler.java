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

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.CIMthetics.jvulkan.VulkanCore.Handles.VulkanHandle;

class WaylandEventHandler implements Runnable
{
    private Logger log = LoggerFactory.getLogger(WaylandEventHandler.class.getName());

    private ConcurrentHashMap<VulkanHandle,WaylandInterfaceObject> objectProxyMap = null;
    private LinkedBlockingQueue<WaylandEventObject> workQueue = new LinkedBlockingQueue<WaylandEventObject>();
    private LinkedBlockingQueue<WaylandEventObject> delayedCompletionQueue = new LinkedBlockingQueue<WaylandEventObject>();
    
    public WaylandEventHandler(ConcurrentHashMap<VulkanHandle,WaylandInterfaceObject> objectProxyMap)
    {
        log.debug("Object proxy map {}", objectProxyMap.toString());
        this.objectProxyMap = objectProxyMap;
    }
    
    @Override
    public void run()
    {
        log.debug("WaylandEventHandler handler started.");
        WaylandEventObject inboundEvent = null;
        
        while(true)
        {
            try
            {
                inboundEvent = workQueue.take();
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            
            if (inboundEvent.isTimeToDie() == true)
            {
                break;
            }
            
//            for (Enumeration<VulkanHandle> e = objectProxyMap.keys(); e.hasMoreElements();)
//                System.out.println(e.nextElement().getClass().getName());
            
            log.debug("Got a message {} {}.", inboundEvent.getClass().getName(), inboundEvent.getHandle() == null ? "null" : inboundEvent.getHandle().toString());
            WaylandInterfaceObject waylandObject = objectProxyMap.get(inboundEvent.getHandle());
            if (waylandObject == null)
            {
                /*
                 * The object is not registered in the Java Universe yet so
                 * put it on the delayed completion queue.
                 */
                try
                {
                    log.debug("Put {} {} event on delayed queue.", inboundEvent.getHandle() == null ? "null" : inboundEvent.getHandle().toString(), inboundEvent.getClass().getName());
                    delayedCompletionQueue.put(inboundEvent);
                }
                catch (InterruptedException e)
                {
                    log.warn("Interrupted while trying to put an entry on the delayedCompletionQueue. {}", e.getMessage());
                }
            }
            else
            {
                log.debug("Processing {}.", inboundEvent.getClass().getName());
                waylandObject.handleEvent(inboundEvent);
            }
        }

        log.debug("WaylandEventHandler handler terminated.");
    }

    public LinkedBlockingQueue<WaylandEventObject> getWorkQueue()
    {
        return workQueue;
    }
    
    void moveDelayedQueueToWorkQueue()
    {
        int count = delayedCompletionQueue.size();
        log.trace("Attempting to move {} delayed event(s) to work queue.", count);
        WaylandEventObject queueEntry = null;
        
        /*
         * We are limiting the number of entries we move because it is possible
         * that when we do the move the objects might end up right back on the
         * delayed completion queue and we do not want an endless loop.
         */
        for(int i = 0; i < count; i++)
        {
            queueEntry = delayedCompletionQueue.poll();
            if (queueEntry == null)
            {
                // The queue was empty so we are done.
                break;
            }
            
            try
            {
                workQueue.put(queueEntry);
            }
            catch (InterruptedException e)
            {
                log.warn("Interrupted while trying to put an entry on the workQueue. {}", e.getMessage());
            }
        }
    }
}
