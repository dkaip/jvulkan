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

import static com.CIMthetics.jvulkan.VulkanCore.VulkanFunctions.wlPointerRelease;
import static com.CIMthetics.jvulkan.VulkanCore.VulkanFunctions.wlPointerSetCursor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.CIMthetics.jvulkan.Wayland.Enums.WlButton;
import com.CIMthetics.jvulkan.Wayland.Enums.WlPointerAxisSource;
import com.CIMthetics.jvulkan.Wayland.Enums.WlPointerAxisType;
import com.CIMthetics.jvulkan.Wayland.Enums.WlPointerButtonState;
import com.CIMthetics.jvulkan.Wayland.Handles.WlPointerHandle;
import com.CIMthetics.jvulkan.Wayland.Handles.WlSurfaceHandle;

public class WlPointer extends WaylandInterfaceObject
{
    private Logger log = LoggerFactory.getLogger(WlPointer.class.getName());
    private WlDisplaySingleton wlDisplay = WlDisplaySingleton.getInstance();
    private WlSurfaceHandle surfaceHandle;
    private int serialNumber;
    private double surface_x;
    private double surface_y;
    private long time;
    private WlButton button;
    private WlPointerButtonState buttonState;
    private WlPointerAxisType pointerAxis;
    private WlPointerAxisSource axisSource;
    private double axisValue;
    private boolean frameComplete;
    private int numberOfSteps;
    

    public WlPointer(WlPointerHandle handle)
    {
        setHandle(handle);

        // Put myself on the proxy map
        wlDisplay.addToProxyMap(this);
    }
    
    public void setCursor(int serialNUmber, WlSurface surface, int x, int y)
    {
        wlPointerSetCursor(getHandle(), serialNumber, surface.getHandle(), x, y);
    }
    
    public void release()
    {
        wlPointerRelease(getHandle());
    }
    
    @Override
    WlPointerHandle getHandle()
    {
        return (WlPointerHandle)handle;
    }

    @Override
    void handleEvent(WaylandEventObject eventObject)
    {
        WlPointerEvents event = (WlPointerEvents)eventObject;

        log.debug("Processing {} event.", event.getEventType());
        switch(event.getEventType())
        {
            case ENTER:
                frameComplete = false;
                serialNumber = event.getSerialNumber();
                surfaceHandle = event.getSurfaceHandle();
                surface_x = event.getSurface_x();
                surface_y = event.getSurface_y();
                log.debug("ENTER serialNumber:{} surfaceHandle:{} surface_x:{} surface_y:{}", serialNumber, surfaceHandle, surface_x, surface_y);
                break;
            case LEAVE:
                frameComplete = false;
                serialNumber = event.getSerialNumber();
                surfaceHandle = event.getSurfaceHandle();
                log.debug("LEAVE serialNumber:{} surfaceHandle:{}", serialNumber, surfaceHandle);
                break;
            case MOTION:
                frameComplete = false;
                time = event.getTime();
                surface_x = event.getSurface_x();
                surface_y = event.getSurface_y();
                log.debug("MOTION time:{} surface_x:{} surface_y:{}", time, surface_x, surface_y);
                break;
            case BUTTON:
                frameComplete = false;
                serialNumber = event.getSerialNumber();
                time = event.getTime();
                button = event.getButton();
                buttonState = event.getButtonState();
                log.debug("BUTTON serialNumber:{} time:{} button:{} buttonState:{}", serialNumber, time, button.toString(), buttonState.toString());
                break;
            case AXIS:
                frameComplete = false;
                time = event.getTime();
                pointerAxis = event.getPointerAxis();
                axisValue = event.getAxisValue();
                log.debug("AXIS time:{} pointerAxis:{} axisValue:{}", time, pointerAxis.toString(), axisValue);
                break;
            case FRAME:
                frameComplete = event.isFrameComplete();
                log.debug("FRAME frameComplete:{}", frameComplete);
                break;
            case AXIS_SOURCE:
                frameComplete = false;
                axisSource = event.getAxisSource();
                log.debug("AXIS_SOURCE axisSource:{}", axisSource.toString());
                break;
            case AXIS_STOP:
                frameComplete = false;
                time = event.getTime();
                pointerAxis = event.getPointerAxis();
                log.debug("AXIS_STOP time:{} pointerAxis:{}", time, pointerAxis.toString());
                break;
            case AXIS_DISCRETE:
                frameComplete = false;
                pointerAxis = event.getPointerAxis();
                numberOfSteps = event.getNumberOfSteps();
                log.debug("AXIS_DISCRETE pointerAxis:{} numberOfSteps:{}", pointerAxis.toString(), numberOfSteps);
                break;
            default:
                log.error("Unhandled case of {}." , event.getEventType().toString());
                break;
        }
    }

}
