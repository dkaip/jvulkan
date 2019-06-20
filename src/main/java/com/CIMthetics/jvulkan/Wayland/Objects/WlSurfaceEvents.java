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

import com.CIMthetics.jvulkan.Wayland.Enums.WlSurfaceEventOpCodes;
import com.CIMthetics.jvulkan.Wayland.Handles.WlOutputHandle;
import com.CIMthetics.jvulkan.Wayland.Handles.WlSurfaceHandle;

public class WlSurfaceEvents extends WaylandEventObject
{
    private WlSurfaceEventOpCodes    eventType;
    private WlOutputHandle          outputHandle;
    
    WlSurfaceEvents(
            WlSurfaceHandle handle,
            WlOutputHandle outputHandle,
            int event)
    {
        super(handle);
        this.outputHandle = outputHandle;
        if (event == 0)
            this.eventType = WlSurfaceEventOpCodes.ENTER;
        else
            this.eventType = WlSurfaceEventOpCodes.LEAVE;
    }

    public WlSurfaceEventOpCodes getEventType()
    {
        return eventType;
    }

    public WlOutputHandle getOutputHandle()
    {
        return outputHandle;
    }

}
