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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.CIMthetics.jvulkan.Wayland.Enums.WlShellSurfaceEventOpCodes;
import com.CIMthetics.jvulkan.Wayland.Enums.WlShellSurfaceResize;
import com.CIMthetics.jvulkan.Wayland.Handles.WlShellSurfaceHandle;


public class WlShellSurfaceEvents extends WaylandEventObject
{
    private Logger log = LoggerFactory.getLogger(WlShellSurfaceEvents.class.getName());
    private WlShellSurfaceEventOpCodes    eventType;
    private int serialNumber = 0;
    private WlShellSurfaceResize edges;
    private int width;
    private int height;

    WlShellSurfaceEvents(WlShellSurfaceHandle handle, int serialNumber)
    {
        super(handle);
        this.eventType = WlShellSurfaceEventOpCodes.PING;
        this.serialNumber = serialNumber;
        log.debug("Handle is {}", handle.toString());
    }

    WlShellSurfaceEvents(WlShellSurfaceHandle handle, WlShellSurfaceResize edges, int width, int height)
    {
        super(handle);
        this.eventType = WlShellSurfaceEventOpCodes.CONFIGURE;
        this.edges = edges;
        this.width = width;
        this.height = height;
        log.debug("Handle is {}", handle.toString());
    }

    WlShellSurfaceEvents(WlShellSurfaceHandle handle)
    {
        super(handle);
        this.eventType = WlShellSurfaceEventOpCodes.POPUP_DONE;
        log.debug("Handle is {}", handle.toString());
    }

    public WlShellSurfaceEventOpCodes getEventType()
    {
        return eventType;
    }

    public int getSerialNumber()
    {
        return serialNumber;
    }

    public WlShellSurfaceResize getEdges()
    {
        return edges;
    }

    public int getWidth()
    {
        return width;
    }

    public int getHeight()
    {
        return height;
    }
}
