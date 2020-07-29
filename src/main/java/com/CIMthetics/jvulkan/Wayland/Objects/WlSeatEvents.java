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

import java.util.EnumSet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.CIMthetics.jvulkan.Wayland.Enums.WlSeatCapability;
import com.CIMthetics.jvulkan.Wayland.Enums.WlSeatEventOpCodes;
import com.CIMthetics.jvulkan.Wayland.Handles.WlSeatHandle;

public class WlSeatEvents extends WaylandEventObject
{
    private Logger log = LoggerFactory.getLogger(WlSeatEvents.class.getName());
    private WlSeatEventOpCodes    eventType;
    private String seatName;
    private EnumSet<WlSeatCapability> capabilities;
    
    WlSeatEvents(
            WlSeatHandle handle,
            EnumSet<WlSeatCapability> capabilities)
    {
        super(handle);
        this.eventType = WlSeatEventOpCodes.CAPABILITIES;
        this.capabilities = capabilities;
    }

    WlSeatEvents(
            WlSeatHandle handle,
            String seatName)
    {
        super(handle);
        this.eventType = WlSeatEventOpCodes.NAME;
        this.seatName = seatName;
    }

    public WlSeatEventOpCodes getEventType()
    {
        return eventType;
    }

    public String getSeatName()
    {
        return seatName;
    }

    public EnumSet<WlSeatCapability> getCapabilities()
    {
        return capabilities;
    }

}
