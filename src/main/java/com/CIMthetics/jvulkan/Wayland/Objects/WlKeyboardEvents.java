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

import java.io.UnsupportedEncodingException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.CIMthetics.jvulkan.Wayland.Enums.WlKey;
import com.CIMthetics.jvulkan.Wayland.Enums.WlKeyboardEventOpCodes;
import com.CIMthetics.jvulkan.Wayland.Enums.WlKeyboardKeyState;
import com.CIMthetics.jvulkan.Wayland.Enums.WlKeyboardKeymapFormat;
import com.CIMthetics.jvulkan.Wayland.Handles.WlKeyboardHandle;
import com.CIMthetics.jvulkan.Wayland.Handles.WlSurfaceHandle;

public class WlKeyboardEvents extends WaylandEventObject
{
    private Logger log = LoggerFactory.getLogger(WlKeyboardEvents.class.getName());
    private WlKeyboardEventOpCodes    eventType;
    private int serialNumber = -1;
    private WlSurfaceHandle surfaceHandle;
    private int[] keys;
    private WlKeyboardKeymapFormat keymapFormat;
    private byte[] keymap;
    private int fileDescriptor;
    private int size;
    private long time;
    private WlKey key;
    private WlKeyboardKeyState keyState;
    private int rate;
    private int delay;
    private int modsDepressed;
    private int modsLatched;
    private int modsLocked;
    private int group;
    
    WlKeyboardEvents(
            WlKeyboardHandle handle,
            WlKeyboardKeymapFormat keymapFormat,
            byte[] keymap)
    {
        super(handle);
        this.eventType = WlKeyboardEventOpCodes.KEYMAP;
        this.keymapFormat = keymapFormat;
        this.keymap = keymap;
//        log.debug("Keymap size is {}", keymap.length);
//        try
//        {
//            String tempString = new String(keymap, "ISO-8859-1");
//            log.debug(tempString);
//        }
//        catch (UnsupportedEncodingException e)
//        {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//        StringBuilder sb = new StringBuilder();
//        for(int i = 0; i < 64; i++)
//        {
//            sb.append(String.format("%x", keymap[i]));
//            sb.append(" ");
//        }
//        log.debug(sb.toString());
    }

    WlKeyboardEvents(
            WlKeyboardHandle handle,
            int serialNumber,
            WlSurfaceHandle surfaceHandle,
            int[] keys)
    {
        super(handle);
        this.eventType = WlKeyboardEventOpCodes.ENTER;
        this.serialNumber = serialNumber;
        this.surfaceHandle = surfaceHandle;
        this.keys = keys;
    }

    WlKeyboardEvents(
            WlKeyboardHandle handle,
            int serialNumber,
            WlSurfaceHandle surfaceHandle)
    {
        super(handle);
        this.eventType = WlKeyboardEventOpCodes.LEAVE;
        this.serialNumber = serialNumber;
        this.surfaceHandle = surfaceHandle;
    }

    WlKeyboardEvents(
            WlKeyboardHandle handle,
            int serialNumber,
            long time,
            int key,
            WlKeyboardKeyState keyState)
    {
        super(handle);
        this.eventType = WlKeyboardEventOpCodes.KEY;
        this.serialNumber = serialNumber;
        this.time = time;
        this.key = WlKey.fromValue(key);
        this.keyState = keyState;
    }

    WlKeyboardEvents(
            WlKeyboardHandle handle,
            int serialNumber,
            int modsDepressed,
            int modsLatched,
            int modsLocked,
            int group)
    {
        super(handle);
        this.eventType = WlKeyboardEventOpCodes.MODIFIERS;
        this.serialNumber = serialNumber;
        this.modsDepressed = modsDepressed;
        this.modsLatched = modsLatched;
        this.modsLocked = modsLocked;
        this.group = group;
    }

    WlKeyboardEvents(
            WlKeyboardHandle handle,
            int rate,
            int delay)
    {
        super(handle);
        this.eventType = WlKeyboardEventOpCodes.REPEAT_INFO;
        this.rate = rate;
        this.delay = delay;
    }

    public WlKeyboardEventOpCodes getEventType()
    {
        return eventType;
    }

    public int getSerialNumber()
    {
        return serialNumber;
    }

    public WlSurfaceHandle getSurfaceHandle()
    {
        return surfaceHandle;
    }

    public int[] getKeys()
    {
        return keys;
    }

    public WlKeyboardKeymapFormat getKeymapFormat()
    {
        return keymapFormat;
    }

    public int getFileDescriptor()
    {
        return fileDescriptor;
    }

    public int getSize()
    {
        return size;
    }

    public long getTime()
    {
        return time;
    }

    public WlKey getKey()
    {
        return key;
    }

    public WlKeyboardKeyState getKeyState()
    {
        return keyState;
    }

    public int getRate()
    {
        return rate;
    }

    public int getDelay()
    {
        return delay;
    }

    public int getModsDepressed()
    {
        return modsDepressed;
    }

    public int getModsLatched()
    {
        return modsLatched;
    }

    public int getModsLocked()
    {
        return modsLocked;
    }

    public int getGroup()
    {
        return group;
    }

    public byte[] getKeymap()
    {
        return keymap;
    }

}
