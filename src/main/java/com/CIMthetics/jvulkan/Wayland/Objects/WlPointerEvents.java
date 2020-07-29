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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.CIMthetics.jvulkan.Wayland.Enums.WlButton;
import com.CIMthetics.jvulkan.Wayland.Enums.WlPointerAxisSource;
import com.CIMthetics.jvulkan.Wayland.Enums.WlPointerAxisType;
import com.CIMthetics.jvulkan.Wayland.Enums.WlPointerButtonState;
import com.CIMthetics.jvulkan.Wayland.Enums.WlPointerEventOpCodes;
import com.CIMthetics.jvulkan.Wayland.Handles.WlPointerHandle;
import com.CIMthetics.jvulkan.Wayland.Handles.WlSurfaceHandle;

public class WlPointerEvents extends WaylandEventObject
{
    private Logger log = LoggerFactory.getLogger(WlPointerEvents.class.getName());
    private WlPointerEventOpCodes    eventType;
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

    WlPointerEvents(
            WlPointerHandle handle,
            int serialNumber,
            WlSurfaceHandle surfaceHandle,
            double surface_x,
            double surface_y)
    {
        super(handle);
        this.eventType = WlPointerEventOpCodes.ENTER;
        this.serialNumber = serialNumber;
        this.surfaceHandle = surfaceHandle;
        this.surface_x = surface_x;
        this.surface_y = surface_y;
    }

    WlPointerEvents(
            WlPointerHandle handle,
            int serialNumber,
            WlSurfaceHandle surfaceHandle)
    {
        super(handle);
        this.eventType = WlPointerEventOpCodes.LEAVE;
        this.serialNumber = serialNumber;
        this.surfaceHandle = surfaceHandle;
    }

    WlPointerEvents(
            WlPointerHandle handle,
            long time,
            double surface_x,
            double surface_y)
    {
        super(handle);
        this.eventType = WlPointerEventOpCodes.MOTION;
        this.time = time;
        this.surface_x = surface_x;
        this.surface_y = surface_y;
    }

    WlPointerEvents(
            WlPointerHandle handle,
            int serialNumber,
            long time,
            int button,
            WlPointerButtonState buttonState)
    {
        super(handle);
        this.eventType = WlPointerEventOpCodes.BUTTON;
        this.serialNumber = serialNumber;
        this.time = time;
        /*
         * I have decided to pass an int for the button because if the values
         * of the mapping change(i.e. perhaps on a different platform) this can
         * be taken care of in the Java code and not require a change in the
         * native library.
         */
        log.debug("Button {}", button);
        this.button = WlButton.fromValue(button);
        this.buttonState = buttonState;
    }

    WlPointerEvents(
            WlPointerHandle handle,
            long time,
            WlPointerAxisType pointerAxis,
            double axisValue)
    {
        super(handle);
        this.eventType = WlPointerEventOpCodes.AXIS;
        this.time = time;
        this.pointerAxis = pointerAxis;
        this.axisValue = axisValue;
    }

    WlPointerEvents(
            WlPointerHandle handle)
    {
        super(handle);
        this.eventType = WlPointerEventOpCodes.FRAME;
        frameComplete = true;
    }

    WlPointerEvents(
            WlPointerHandle handle,
            WlPointerAxisSource axisSource)
    {
        super(handle);
        this.eventType = WlPointerEventOpCodes.AXIS_SOURCE;
        this.axisSource = axisSource;
    }

    WlPointerEvents(
            WlPointerHandle handle,
            long time,
            WlPointerAxisType pointerAxis)
    {
        super(handle);
        this.eventType = WlPointerEventOpCodes.AXIS_STOP;
        this.time = time;
        this.pointerAxis = pointerAxis;
    }

    WlPointerEvents(
            WlPointerHandle handle,
            WlPointerAxisType pointerAxis,
            int numberOfSteps)
    {
        super(handle);
        this.eventType = WlPointerEventOpCodes.AXIS_DISCRETE;
        this.pointerAxis = pointerAxis;
        this.numberOfSteps = numberOfSteps;
    }

    public WlPointerEventOpCodes getEventType()
    {
        return eventType;
    }

    public WlSurfaceHandle getSurfaceHandle()
    {
        return surfaceHandle;
    }

    public int getSerialNumber()
    {
        return serialNumber;
    }

    public double getSurface_x()
    {
        return surface_x;
    }

    public double getSurface_y()
    {
        return surface_y;
    }

    public long getTime()
    {
        return time;
    }

    public WlPointerButtonState getButtonState()
    {
        return buttonState;
    }

    public WlPointerAxisType getPointerAxis()
    {
        return pointerAxis;
    }

    public WlPointerAxisSource getAxisSource()
    {
        return axisSource;
    }

    public double getAxisValue()
    {
        return axisValue;
    }

    public boolean isFrameComplete()
    {
        return frameComplete;
    }

    public int getNumberOfSteps()
    {
        return numberOfSteps;
    }

    public WlButton getButton()
    {
        return button;
    }


}
