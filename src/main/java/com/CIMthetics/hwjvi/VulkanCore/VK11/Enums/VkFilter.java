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
package com.CIMthetics.hwjvi.VulkanCore.VK11.Enums;

public enum VkFilter
{
    VK_FILTER_NEAREST(0),
    VK_FILTER_LINEAR(1),
    VK_FILTER_CUBIC_IMG(1000015000),
    VK_FILTER_CUBIC_EXT(VK_FILTER_CUBIC_IMG.valueOf()),
    VK_FILTER_BEGIN_RANGE(VK_FILTER_NEAREST.valueOf()),
    VK_FILTER_END_RANGE(VK_FILTER_LINEAR.valueOf()),
    VK_FILTER_RANGE_SIZE((VK_FILTER_LINEAR.valueOf() - VK_FILTER_NEAREST.valueOf() + 1)),
    VK_FILTER_MAX_ENUM(0x7FFFFFFF);

    private int value;
    
    private VkFilter(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
