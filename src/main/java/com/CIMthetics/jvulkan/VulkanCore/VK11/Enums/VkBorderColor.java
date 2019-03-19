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
package com.CIMthetics.jvulkan.VulkanCore.VK11.Enums;

public enum VkBorderColor
{
    VK_BORDER_COLOR_FLOAT_TRANSPARENT_BLACK(0),
    VK_BORDER_COLOR_INT_TRANSPARENT_BLACK(1),
    VK_BORDER_COLOR_FLOAT_OPAQUE_BLACK(2),
    VK_BORDER_COLOR_INT_OPAQUE_BLACK(3),
    VK_BORDER_COLOR_FLOAT_OPAQUE_WHITE(4),
    VK_BORDER_COLOR_INT_OPAQUE_WHITE(5),
    VK_BORDER_COLOR_BEGIN_RANGE(VK_BORDER_COLOR_FLOAT_TRANSPARENT_BLACK.valueOf()),
    VK_BORDER_COLOR_END_RANGE(VK_BORDER_COLOR_INT_OPAQUE_WHITE.valueOf()),
    VK_BORDER_COLOR_RANGE_SIZE((VK_BORDER_COLOR_INT_OPAQUE_WHITE.valueOf() - VK_BORDER_COLOR_FLOAT_TRANSPARENT_BLACK.valueOf() + 1)),
    VK_BORDER_COLOR_MAX_ENUM(0x7FFFFFFF);

    private int value;
    
    private VkBorderColor(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}