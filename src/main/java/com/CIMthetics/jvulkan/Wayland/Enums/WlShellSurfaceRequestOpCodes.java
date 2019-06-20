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

public enum WlShellSurfaceRequestOpCodes
{
    PONG((short)0),
    MOVE((short)1),
    RESIZE((short)2),
    SET_TOP_LEVEL((short)3),
    SET_TRANSIENT((short)4),
    SET_FULLSCREEN((short)5),
    SET_POPUP((short)6),
    SET_MAXIMIZED((short)7),
    SET_TITLE((short)8),
    SET_CLASS((short)9);
    
    private short value;
    
    private WlShellSurfaceRequestOpCodes(short value)
    {
        this.value = value;
    }
    
    public short valueOf()
    {
        return value;
    }
}
