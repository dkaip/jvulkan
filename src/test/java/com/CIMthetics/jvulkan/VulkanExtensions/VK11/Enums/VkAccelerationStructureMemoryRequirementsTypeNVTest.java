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

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VkAccelerationStructureMemoryRequirementsTypeNVTest
{
    @Test
    void testNumberOfElements()
    {
        VkAccelerationStructureMemoryRequirementsTypeNV[] values = VkAccelerationStructureMemoryRequirementsTypeNV.values();
        assertEquals(7, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }


    @Test
    void testValues()
    {
        assertEquals(0, VkAccelerationStructureMemoryRequirementsTypeNV.VK_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_OBJECT_NV.valueOf(), VkAccelerationStructureMemoryRequirementsTypeNV.VK_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_OBJECT_NV.toString() + " has an unexpected value.");
        assertEquals(1, VkAccelerationStructureMemoryRequirementsTypeNV.VK_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_BUILD_SCRATCH_NV.valueOf(), VkAccelerationStructureMemoryRequirementsTypeNV.VK_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_BUILD_SCRATCH_NV.toString() + " has an unexpected value.");
        assertEquals(2, VkAccelerationStructureMemoryRequirementsTypeNV.VK_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_UPDATE_SCRATCH_NV.valueOf(), VkAccelerationStructureMemoryRequirementsTypeNV.VK_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_UPDATE_SCRATCH_NV.toString() + " has an unexpected value.");
        assertEquals(VkAccelerationStructureMemoryRequirementsTypeNV.VK_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_OBJECT_NV.valueOf(), VkAccelerationStructureMemoryRequirementsTypeNV.VK_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_BEGIN_RANGE_NV.valueOf(), VkAccelerationStructureMemoryRequirementsTypeNV.VK_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_BEGIN_RANGE_NV.toString() + " has an unexpected value.");
        assertEquals(VkAccelerationStructureMemoryRequirementsTypeNV.VK_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_UPDATE_SCRATCH_NV.valueOf(), VkAccelerationStructureMemoryRequirementsTypeNV.VK_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_END_RANGE_NV.valueOf(), VkAccelerationStructureMemoryRequirementsTypeNV.VK_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_END_RANGE_NV.toString() + " has an unexpected value.");
        assertEquals(VkAccelerationStructureMemoryRequirementsTypeNV.VK_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_UPDATE_SCRATCH_NV.valueOf() - VkAccelerationStructureMemoryRequirementsTypeNV.VK_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_OBJECT_NV.valueOf() + 1, VkAccelerationStructureMemoryRequirementsTypeNV.VK_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_RANGE_SIZE_NV.valueOf(), VkAccelerationStructureMemoryRequirementsTypeNV.VK_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_RANGE_SIZE_NV.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkAccelerationStructureMemoryRequirementsTypeNV.VK_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_MAX_ENUM_NV.valueOf(), VkAccelerationStructureMemoryRequirementsTypeNV.VK_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_MAX_ENUM_NV.toString() + " has an unexpected value.");
    }
}
