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

public enum WlPointerEventOpCodes
{
    ENTER(0),
    LEAVE(1),
    MOTION(2),
    BUTTON(3),
    AXIS(4),
    FRAME(5),
    AXIS_SOURCE(6),
    AXIS_STOP(7),
    AXIS_DISCRETE(8);
    
    private int value;
    
    private WlPointerEventOpCodes(int value)
    {
        this.value = value;
    }
    
    public int valueOf()
    {
        return value;
    }

    static public WlPointerEventOpCodes fromValue(int value)
    {
        for(WlPointerEventOpCodes listValue : WlPointerEventOpCodes.values())
        {
            if (listValue.valueOf() == value)
            {
                return listValue;
            }
        }
        
        return null;
    }
}
