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
package com.CIMthetics.jvulkan.Wayland.Enums;

/**
 *  Describes the source types for axis events. This indicates to the client 
 *  how an axis event was physically generated; a client may adjust the user 
 *  interface accordingly. For example, scroll events from a "finger" source 
 *  may be in a smooth coordinate space with kinetic scrolling whereas a 
 *  "wheel" source may be in discrete steps of a number of lines.
 *  <p>
 *  The "continuous" axis source is a device generating events in a continuous 
 *  coordinate space, but using something other than a finger. One example for 
 *  this source is button-based scrolling where the vertical motion of a device 
 *  is converted to scroll events while a button is held down.
 *  <p>
 *  The "wheel tilt" axis source indicates that the actual device is a wheel 
 *  but the scroll event is not caused by a rotation but a (usually sideways) 
 *  tilt of the wheel. 
 * 
 * @author Douglas Kaip
 *
 */
public enum WlPointerAxisSource
{
    WHEEL(0),
    FINGER(1),
    CONTINUOUS(2),
    WHEEL_TILT(3);
    
    private int value;
    
    private WlPointerAxisSource(int value)
    {
        this.value = value;
    }
    
    public int valueOf()
    {
        return value;
    }

    static public WlPointerAxisSource fromValue(int value)
    {
        for(WlPointerAxisSource listValue : WlPointerAxisSource.values())
        {
            if (listValue.valueOf() == value)
            {
                return listValue;
            }
        }
        
        return null;
    }
}
