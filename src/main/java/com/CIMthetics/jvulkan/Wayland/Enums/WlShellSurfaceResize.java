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
 * These values are used to indicate which edge of a surface is being dragged 
 * in a resize operation. The server may use this information to adapt its 
 * behavior, e.g. choose an appropriate cursor image.
 * 
 * @author Douglas Kaip
 *
 */
public enum WlShellSurfaceResize
{
    /**
     * 0 - no edge
     */
    NONE(0),
    
    /**
     * 1 - top edge
     */
    TOP(1),
    
    /**
     * 2 - bottom edge
     */
    BOTTOM(2),
    
    /**
     * 4 - left edge
     */
    LEFT(4),
    
    /**
     * 5 - top and left edges
     */
    TOP_LEFT(5),
    
    /**
     * 8 - right edge
     */
    RIGHT(8),
    
    /**
     * 9 - top and right edges
     */
    TOP_RIGHT(9),
    
    /**
     * 10 - bottom and right edges
     */
    BOTTOM_RIGHT(10);
    
    private int value;
    
    private WlShellSurfaceResize(int value)
    {
        this.value = value;
    }
    
    public int valueOf()
    {
        return value;
    }

    static public WlShellSurfaceResize fromValue(int value)
    {
        for(WlShellSurfaceResize listValue : WlShellSurfaceResize.values())
        {
            if (listValue.valueOf() == value)
            {
                return listValue;
            }
        }
        
        return null;
    }
}
