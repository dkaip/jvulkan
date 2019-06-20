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

public enum WlOutputTransform
{
    NORMAL(0),
    NORMAL_90(1),
    NORMAL_180(2),
    NORMAL_270(3),
    FLIPPED(4),
    FLIPPED_90(5),
    FLIPPED_180(6),
    FLIPPED_270(7);
    
    private int value;
    
    private WlOutputTransform(int value)
    {
        this.value = value;
    }
    
    public int valueOf()
    {
        return value;
    }

    static public WlOutputTransform fromValue(int value)
    {
        for(WlOutputTransform listValue : WlOutputTransform.values())
        {
            if (listValue.valueOf() == value)
            {
                return listValue;
            }
        }
        
        return null;
    }
}
