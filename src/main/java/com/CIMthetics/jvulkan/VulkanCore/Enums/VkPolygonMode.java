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
package com.CIMthetics.jvulkan.VulkanCore.Enums;

public enum VkPolygonMode
{
    VK_POLYGON_MODE_FILL(0),
    VK_POLYGON_MODE_LINE(1),
    VK_POLYGON_MODE_POINT(2),
    VK_POLYGON_MODE_FILL_RECTANGLE_NV(1000153000),
    VK_POLYGON_MODE_BEGIN_RANGE(VK_POLYGON_MODE_FILL.valueOf()),
    VK_POLYGON_MODE_END_RANGE(VK_POLYGON_MODE_POINT.valueOf()),
    VK_POLYGON_MODE_RANGE_SIZE((VK_POLYGON_MODE_POINT.valueOf() - VK_POLYGON_MODE_FILL.valueOf() + 1)),
    VK_POLYGON_MODE_MAX_ENUM(0x7FFFFFFF);

    private int value;
    
    private VkPolygonMode(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
