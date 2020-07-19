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
package com.CIMthetics.jvulkan.VulkanExtensions.Enums;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.CIMthetics.jvulkan.VulkanExtensions.Enums.VkBuildAccelerationStructureFlagBitsNV;

class VkBuildAccelerationStructureFlagBitsNVTest
{
    @Test
    void testNumberOfElements()
    {
        VkBuildAccelerationStructureFlagBitsNV[] values = VkBuildAccelerationStructureFlagBitsNV.values();
        assertEquals(6, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }


    @Test
    void testValues()
    {
        assertEquals(0x00000001, VkBuildAccelerationStructureFlagBitsNV.VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_UPDATE_BIT_NV.valueOf(), VkBuildAccelerationStructureFlagBitsNV.VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_UPDATE_BIT_NV.toString() + " has an unexpected value.");
        assertEquals(0x00000002, VkBuildAccelerationStructureFlagBitsNV.VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_COMPACTION_BIT_NV.valueOf(), VkBuildAccelerationStructureFlagBitsNV.VK_BUILD_ACCELERATION_STRUCTURE_ALLOW_COMPACTION_BIT_NV.toString() + " has an unexpected value.");
        assertEquals(0x00000004, VkBuildAccelerationStructureFlagBitsNV.VK_BUILD_ACCELERATION_STRUCTURE_PREFER_FAST_TRACE_BIT_NV.valueOf(), VkBuildAccelerationStructureFlagBitsNV.VK_BUILD_ACCELERATION_STRUCTURE_PREFER_FAST_TRACE_BIT_NV.toString() + " has an unexpected value.");
        assertEquals(0x00000008, VkBuildAccelerationStructureFlagBitsNV.VK_BUILD_ACCELERATION_STRUCTURE_PREFER_FAST_BUILD_BIT_NV.valueOf(), VkBuildAccelerationStructureFlagBitsNV.VK_BUILD_ACCELERATION_STRUCTURE_PREFER_FAST_BUILD_BIT_NV.toString() + " has an unexpected value.");
        assertEquals(0x00000010, VkBuildAccelerationStructureFlagBitsNV.VK_BUILD_ACCELERATION_STRUCTURE_LOW_MEMORY_BIT_NV.valueOf(), VkBuildAccelerationStructureFlagBitsNV.VK_BUILD_ACCELERATION_STRUCTURE_LOW_MEMORY_BIT_NV.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkBuildAccelerationStructureFlagBitsNV.VK_BUILD_ACCELERATION_STRUCTURE_FLAG_BITS_MAX_ENUM_NV.valueOf(), VkBuildAccelerationStructureFlagBitsNV.VK_BUILD_ACCELERATION_STRUCTURE_FLAG_BITS_MAX_ENUM_NV.toString() + " has an unexpected value.");
    }
}
