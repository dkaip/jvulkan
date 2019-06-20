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

public enum WlShellSurfaceFullscreenMethod
{
    DEFAULT(0),
    SCALE(1),
    DRIVER(2),
    FILL(3);
    
    private int value;
    
    private WlShellSurfaceFullscreenMethod(int value)
    {
        this.value = value;
    }
    
    public int valueOf()
    {
        return value;
    }

    static public WlShellSurfaceFullscreenMethod fromValue(int value)
    {
        for(WlShellSurfaceFullscreenMethod listValue : WlShellSurfaceFullscreenMethod.values())
        {
            if (listValue.valueOf() == value)
            {
                return listValue;
            }
        }
        
        return null;
    }
}
