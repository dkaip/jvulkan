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
package com.CIMthetics.jvulkan.VulkanExtensions.VK11.Enums;

public enum VkComponentTypeNV
{
    VK_COMPONENT_TYPE_FLOAT16_NV(0),
    VK_COMPONENT_TYPE_FLOAT32_NV(1),
    VK_COMPONENT_TYPE_FLOAT64_NV(2),
    VK_COMPONENT_TYPE_SINT8_NV(3),
    VK_COMPONENT_TYPE_SINT16_NV(4),
    VK_COMPONENT_TYPE_SINT32_NV(5),
    VK_COMPONENT_TYPE_SINT64_NV(6),
    VK_COMPONENT_TYPE_UINT8_NV(7),
    VK_COMPONENT_TYPE_UINT16_NV(8),
    VK_COMPONENT_TYPE_UINT32_NV(9),
    VK_COMPONENT_TYPE_UINT64_NV(10),
    VK_COMPONENT_TYPE_BEGIN_RANGE_NV(VK_COMPONENT_TYPE_FLOAT16_NV.valueOf()),
    VK_COMPONENT_TYPE_END_RANGE_NV(VK_COMPONENT_TYPE_UINT64_NV.valueOf()),
    VK_COMPONENT_TYPE_RANGE_SIZE_NV(VK_COMPONENT_TYPE_UINT64_NV.valueOf() - VK_COMPONENT_TYPE_FLOAT16_NV.valueOf() + 1),
    VK_COMPONENT_TYPE_MAX_ENUM_NV(0x7FFFFFFF);

    private int value;
    
    private VkComponentTypeNV(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
