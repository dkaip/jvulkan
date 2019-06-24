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

import static com.CIMthetics.jvulkan.VulkanCore.VK11.VulkanFunctions.wlSeatGetKeyboard;
import static com.CIMthetics.jvulkan.VulkanCore.VK11.VulkanFunctions.wlSeatGetPointer;
import static com.CIMthetics.jvulkan.VulkanCore.VK11.VulkanFunctions.wlSeatGetTouch;
import static com.CIMthetics.jvulkan.VulkanCore.VK11.VulkanFunctions.wlSeatRelease;

import java.util.EnumSet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.CIMthetics.jvulkan.Wayland.Enums.WlSeatCapability;
import com.CIMthetics.jvulkan.Wayland.Handles.WlKeyboardHandle;
import com.CIMthetics.jvulkan.Wayland.Handles.WlPointerHandle;
import com.CIMthetics.jvulkan.Wayland.Handles.WlSeatHandle;
import com.CIMthetics.jvulkan.Wayland.Handles.WlTouchHandle;

public class WlSeat extends WaylandInterfaceObject
{
    private Logger log = LoggerFactory.getLogger(WlSeat.class.getName());
    private WlDisplaySingleton wlDisplay = WlDisplaySingleton.getInstance();
    private String seatName;
    private EnumSet<WlSeatCapability> capabilities;

    public WlSeat(WlSeatHandle handle)
    {
        setHandle(handle);

        // Put myself on the proxy map
        wlDisplay.addToProxyMap(this);
    }
    
    public WlKeyboard getKeyboard()
    {
        WlKeyboardHandle handle = wlSeatGetKeyboard(getHandle());
        return new WlKeyboard(handle);
    }

    public WlPointer getPointer()
    {
        WlPointerHandle handle = wlSeatGetPointer(getHandle());
        return new WlPointer(handle);
    }
    
    public WlTouch getTouch()
    {
        WlTouchHandle handle = wlSeatGetTouch(getHandle());
        return new WlTouch(handle);
    }
    
    public void release()
    {
        wlSeatRelease(getHandle());
    }
    
    @Override
    void handleEvent(WaylandEventObject eventObject)
    {
        WlSeatEvents event = (WlSeatEvents)eventObject;

        log.debug("Processing {} event.", event.getEventType());
        switch(event.getEventType())
        {
            case CAPABILITIES:
                this.capabilities = event.getCapabilities();
                log.debug("Seat capabilities:{}", this.capabilities.toString());
                break;
            case NAME:
                this.seatName = event.getSeatName();
                log.debug("Seat name:{}", this.seatName);
                break;
            default:
                log.error("Unhandled case of {}." , event.getEventType().toString());
                break;
        }
    }
    
    @Override
    public WlSeatHandle getHandle()
    {
        return (WlSeatHandle)handle;
    }
}
