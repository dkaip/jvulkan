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

import static com.CIMthetics.jvulkan.VulkanCore.VK11.VulkanFunctions.wlKeyboardRelease;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.CIMthetics.jvulkan.Wayland.Enums.WlKeyboardKeyState;
import com.CIMthetics.jvulkan.Wayland.Enums.WlKeyboardKeymapFormat;
import com.CIMthetics.jvulkan.Wayland.Handles.WlKeyboardHandle;
import com.CIMthetics.jvulkan.Wayland.Handles.WlSurfaceHandle;

public class WlKeyboard extends WaylandInterfaceObject
{
    private Logger log = LoggerFactory.getLogger(WlKeyboard.class.getName());
    private WlDisplaySingleton wlDisplay = WlDisplaySingleton.getInstance();
    private int serialNumber = -1;
    private WlSurfaceHandle surfaceHandle;
    private byte[] keys;
    private WlKeyboardKeymapFormat keymapFormat;
    private int fileDescriptor;
    private int size;
    private long time;
    private int key;
    private WlKeyboardKeyState keyState;
    private int rate;
    private int delay;
    private int modsDepressed;
    private int modsLatched;
    private int modsLocked;
    private int group;

    public WlKeyboard(WlKeyboardHandle handle)
    {
        setHandle(handle);

        // Put myself on the proxy map
        wlDisplay.addToProxyMap(this);
    }
    
    public void release()
    {
        wlKeyboardRelease(getHandle());
    }
    
    @Override
    WlKeyboardHandle getHandle()
    {
        return (WlKeyboardHandle)handle;
    }

    @Override
    void handleEvent(WaylandEventObject eventObject)
    {
        WlKeyboardEvents event = (WlKeyboardEvents)eventObject;

        log.debug("Processing {} event.", event.getEventType());
        switch(event.getEventType())
        {
            case KEYMAP:
                keymapFormat = event.getKeymapFormat();
                fileDescriptor = event.getFileDescriptor();
                size = event.getSize();
                log.debug("KEYMAP format:{} fileDescriptor:{} size:{}", keymapFormat.toString(), fileDescriptor, size);
                break;
            case ENTER:
                serialNumber = event.getSerialNumber();
                surfaceHandle = event.getSurfaceHandle();
                keys = event.getKeys();
                log.debug("ENTER serialNumber:{} surfaceHandle:{} keys:{}", serialNumber, surfaceHandle.toString(), keys.toString());
                break;
            case LEAVE:
                serialNumber = event.getSerialNumber();
                surfaceHandle = event.getSurfaceHandle();
                log.debug("LEAVE serialNumber:{} surfaceHandle:{}", serialNumber, surfaceHandle.toString());
                break;
            case KEY:
                serialNumber = event.getSerialNumber();
                time = event.getTime();
                key = event.getKey();
                keyState = event.getKeyState();
                log.debug("KEY serialNumber:{} time:{} key:{} keyState:{}", serialNumber, time, key, keyState.toString());
                break;
            case MODIFIERS:
                serialNumber = event.getSerialNumber();
                modsDepressed = event.getModsDepressed();
                modsLatched = event.getModsLatched();
                modsLocked = event.getModsLocked();
                group = event.getGroup();
                log.debug("MODIFIERS serialNumber:{} modsDepressed:{} modsLatched:{} modsLocked:{} group:{}",
                        serialNumber, modsDepressed, modsLatched, modsLocked, group);
                break;
            case REPEAT_INFO:
                rate = event.getRate();
                delay = event.getDelay();
                log.debug("REPEAT_INFO rate:{} delay:{}", rate, delay);
                break;
            default:
                log.error("Unhandled case of {}." , event.getEventType().toString());
                break;
        }
    }

}
