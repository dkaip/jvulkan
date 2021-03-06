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

import java.util.EnumSet;

import com.CIMthetics.jvulkan.Wayland.Enums.WlOutputMode;
import com.CIMthetics.jvulkan.Wayland.Enums.WlOutputSubpixel;
import com.CIMthetics.jvulkan.Wayland.Enums.WlOutputTransform;

class WlOutputData
{
    int     x;
    int     y;
    int     physicalWidth;
    int     physicalHeight;
    WlOutputSubpixel subpixel;
    String  make;
    String  model;
    WlOutputTransform transform;
    
    EnumSet<WlOutputMode> flags = EnumSet.noneOf(WlOutputMode.class);
    int     width;
    int     height;
    int     refresh;
    
    int     scaleFactor = 1;
    

}
