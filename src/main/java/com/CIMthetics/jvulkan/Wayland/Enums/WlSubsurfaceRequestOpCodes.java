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

public enum WlSubsurfaceRequestOpCodes
{
    DESTROY((short)0),
    SET_POSITION((short)1),
    PLACE_ABOVE((short)2),
    PLACE_BELOW((short)3),
    SET_SYNC((short)4),
    SET_DESYNC((short)5);

    private short value;
    
    private WlSubsurfaceRequestOpCodes(short value)
    {
        this.value = value;
    }
    
    public short valueOf()
    {
        return value;
    }
}
