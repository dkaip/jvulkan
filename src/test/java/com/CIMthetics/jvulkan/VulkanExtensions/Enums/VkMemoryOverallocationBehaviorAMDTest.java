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

import com.CIMthetics.jvulkan.VulkanExtensions.Enums.VkMemoryOverallocationBehaviorAMD;

class VkMemoryOverallocationBehaviorAMDTest
{
    @Test
    void testNumberOfElements()
    {
        VkMemoryOverallocationBehaviorAMD[] values = VkMemoryOverallocationBehaviorAMD.values();
        assertEquals(7, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }


    @Test
    void testValues()
    {
        assertEquals(0, VkMemoryOverallocationBehaviorAMD.VK_MEMORY_OVERALLOCATION_BEHAVIOR_DEFAULT_AMD.valueOf(), VkMemoryOverallocationBehaviorAMD.VK_MEMORY_OVERALLOCATION_BEHAVIOR_DEFAULT_AMD.toString() + " has an unexpected value.");
        assertEquals(1, VkMemoryOverallocationBehaviorAMD.VK_MEMORY_OVERALLOCATION_BEHAVIOR_ALLOWED_AMD.valueOf(), VkMemoryOverallocationBehaviorAMD.VK_MEMORY_OVERALLOCATION_BEHAVIOR_ALLOWED_AMD.toString() + " has an unexpected value.");
        assertEquals(2, VkMemoryOverallocationBehaviorAMD.VK_MEMORY_OVERALLOCATION_BEHAVIOR_DISALLOWED_AMD.valueOf(), VkMemoryOverallocationBehaviorAMD.VK_MEMORY_OVERALLOCATION_BEHAVIOR_DISALLOWED_AMD.toString() + " has an unexpected value.");
        assertEquals(VkMemoryOverallocationBehaviorAMD.VK_MEMORY_OVERALLOCATION_BEHAVIOR_DEFAULT_AMD.valueOf(), VkMemoryOverallocationBehaviorAMD.VK_MEMORY_OVERALLOCATION_BEHAVIOR_BEGIN_RANGE_AMD.valueOf(), VkMemoryOverallocationBehaviorAMD.VK_MEMORY_OVERALLOCATION_BEHAVIOR_BEGIN_RANGE_AMD.toString() + " has an unexpected value.");
        assertEquals(VkMemoryOverallocationBehaviorAMD.VK_MEMORY_OVERALLOCATION_BEHAVIOR_DISALLOWED_AMD.valueOf(), VkMemoryOverallocationBehaviorAMD.VK_MEMORY_OVERALLOCATION_BEHAVIOR_END_RANGE_AMD.valueOf(), VkMemoryOverallocationBehaviorAMD.VK_MEMORY_OVERALLOCATION_BEHAVIOR_END_RANGE_AMD.toString() + " has an unexpected value.");
        assertEquals(VkMemoryOverallocationBehaviorAMD.VK_MEMORY_OVERALLOCATION_BEHAVIOR_DISALLOWED_AMD.valueOf() - VkMemoryOverallocationBehaviorAMD.VK_MEMORY_OVERALLOCATION_BEHAVIOR_DEFAULT_AMD.valueOf() + 1, VkMemoryOverallocationBehaviorAMD.VK_MEMORY_OVERALLOCATION_BEHAVIOR_RANGE_SIZE_AMD.valueOf(), VkMemoryOverallocationBehaviorAMD.VK_MEMORY_OVERALLOCATION_BEHAVIOR_RANGE_SIZE_AMD.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkMemoryOverallocationBehaviorAMD.VK_MEMORY_OVERALLOCATION_BEHAVIOR_MAX_ENUM_AMD.valueOf(), VkMemoryOverallocationBehaviorAMD.VK_MEMORY_OVERALLOCATION_BEHAVIOR_MAX_ENUM_AMD.toString() + " has an unexpected value.");
    }
}
