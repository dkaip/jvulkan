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

import java.util.EnumSet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.CIMthetics.jvulkan.Wayland.Enums.WlOutputEventOpCodes;
import com.CIMthetics.jvulkan.Wayland.Enums.WlOutputMode;
import com.CIMthetics.jvulkan.Wayland.Enums.WlOutputSubpixel;
import com.CIMthetics.jvulkan.Wayland.Enums.WlOutputTransform;
import com.CIMthetics.jvulkan.Wayland.Handles.WlOutputHandle;

public class WlOutputEvents extends WaylandEventObject
{
    private Logger log = LoggerFactory.getLogger(WlOutputEvents.class.getName());
    private WlOutputEventOpCodes    eventType;
    private WlOutputData            outputData = new WlOutputData();
    
    WlOutputEvents(
            WlOutputHandle handle)
    {
        super(handle);
        this.eventType = WlOutputEventOpCodes.DONE;
//        System.err.println("AAA");
//        log.debug("Handle is {}", handle.toString());
    }

    WlOutputEvents(
            WlOutputHandle handle,
            int x,
            int y,
            int physicalWidth,
            int physicalHeight,
            WlOutputSubpixel subpixel,
            String make,
            String model,
            WlOutputTransform transform)
    {
        super(handle);
//        System.err.println("BBB");
        this.eventType = WlOutputEventOpCodes.GEOMETRY;
        outputData.x = x;
        outputData.y = y;
        outputData.physicalWidth = physicalWidth;
        outputData.physicalHeight = physicalHeight;
        outputData.subpixel = subpixel;
        outputData.make = make;
        outputData.model = model;
        outputData.transform = transform;
//        log.debug("handle {} x {} x {} pW {} pH {} sub {} make {} model {} transform {}",
//                handle.toString(), x, y, physicalWidth, physicalHeight, subpixel.toString(), make, model, transform.toString());
    }

    WlOutputEvents(
            WlOutputHandle handle,
            EnumSet<WlOutputMode> flags,
            int width,
            int height,
            int refresh)
    {
        super(handle);
        this.eventType = WlOutputEventOpCodes.MODE;
        outputData.flags = flags;
        outputData.width = width;
        outputData.height = height;
        outputData.refresh = refresh;
//        log.debug("handle {} width {} height {} refresh {}", handle.toString(), width, height, refresh);
//        System.err.println("CCC");
    }

    WlOutputEvents(
            WlOutputHandle handle,
            int scaleFactor)
    {
        super(handle);
        this.eventType = WlOutputEventOpCodes.SCALE;
        outputData.scaleFactor = scaleFactor;
//        log.debug("handle {} scaleFactor {}", handle.toString(), scaleFactor);
//        System.err.println("DDD");
    }

    public WlOutputEventOpCodes getEventType()
    {
        return eventType;
    }

    public WlOutputData getOutputData()
    {
        return outputData;
    }
    
}
