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

public enum WlSurfaceRequestOpCodes
{
    DESTROY((short)0),
    ATTACH((short)1),
    DAMAGE((short)2),
    FRAME((short)3),
    SET_OPAQUE_REGION((short)4),
    SET_INPUT_REGION((short)5),
    COMMIT((short)6),
    SET_BUFFER_TRANSFORM((short)7),
    SET_BUFFER_SCALE((short)8),
    DAMMAGE_BUFFER((short)9);
    
    private short value;
    
    private WlSurfaceRequestOpCodes(short value)
    {
        this.value = value;
    }
    
    public short valueOf()
    {
        return value;
    }
}
