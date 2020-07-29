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
package com.CIMthetics.jvulkan.VulkanExtensions.Enums;

public enum VkCopyAccelerationStructureModeKHR
{
    VK_COPY_ACCELERATION_STRUCTURE_MODE_CLONE_KHR(0),
    VK_COPY_ACCELERATION_STRUCTURE_MODE_COMPACT_KHR(1),
    VK_COPY_ACCELERATION_STRUCTURE_MODE_SERIALIZE_KHR(2),
    VK_COPY_ACCELERATION_STRUCTURE_MODE_DESERIALIZE_KHR(3),
    VK_COPY_ACCELERATION_STRUCTURE_MODE_CLONE_NV(VK_COPY_ACCELERATION_STRUCTURE_MODE_CLONE_KHR.valueOf()),
    VK_COPY_ACCELERATION_STRUCTURE_MODE_COMPACT_NV(VK_COPY_ACCELERATION_STRUCTURE_MODE_COMPACT_KHR.valueOf()),
    VK_COPY_ACCELERATION_STRUCTURE_MODE_MAX_ENUM_NV(0x7FFFFFFF);

    private int value;
    
    private VkCopyAccelerationStructureModeKHR(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
