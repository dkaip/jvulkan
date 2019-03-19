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

public enum VkAccelerationStructureTypeNV
{
    VK_ACCELERATION_STRUCTURE_TYPE_TOP_LEVEL_NV(0),
    VK_ACCELERATION_STRUCTURE_TYPE_BOTTOM_LEVEL_NV(1),
    VK_ACCELERATION_STRUCTURE_TYPE_BEGIN_RANGE_NV(VK_ACCELERATION_STRUCTURE_TYPE_TOP_LEVEL_NV.valueOf()),
    VK_ACCELERATION_STRUCTURE_TYPE_END_RANGE_NV(VK_ACCELERATION_STRUCTURE_TYPE_BOTTOM_LEVEL_NV.valueOf()),
    VK_ACCELERATION_STRUCTURE_TYPE_RANGE_SIZE_NV((VK_ACCELERATION_STRUCTURE_TYPE_BOTTOM_LEVEL_NV.valueOf() - VK_ACCELERATION_STRUCTURE_TYPE_TOP_LEVEL_NV.valueOf() + 1)),
    VK_ACCELERATION_STRUCTURE_TYPE_MAX_ENUM_NV(0x7FFFFFFF);

    private int value;
    
    private VkAccelerationStructureTypeNV(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
