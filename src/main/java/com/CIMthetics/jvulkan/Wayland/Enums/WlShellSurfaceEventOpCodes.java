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

public enum WlShellSurfaceEventOpCodes
{
    PING(0),
    CONFIGURE(1),
    POPUP_DONE(3);
    
    private int value;
    
    private WlShellSurfaceEventOpCodes(int value)
    {
        this.value = value;
    }
    
    public int valueOf()
    {
        return value;
    }

    static public WlShellSurfaceEventOpCodes fromValue(int value)
    {
        for(WlShellSurfaceEventOpCodes listValue : WlShellSurfaceEventOpCodes.values())
        {
            if (listValue.valueOf() == value)
            {
                return listValue;
            }
        }
        
        return null;
    }
}
