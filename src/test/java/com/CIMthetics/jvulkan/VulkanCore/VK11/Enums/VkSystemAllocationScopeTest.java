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

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VkSystemAllocationScopeTest
{
    @Test
    void testNumberOfElements()
    {
        VkSystemAllocationScope[] values = VkSystemAllocationScope.values();
        assertEquals(9, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }


    @Test
    void testValues()
    {
        assertEquals(0, VkSystemAllocationScope.VK_SYSTEM_ALLOCATION_SCOPE_COMMAND.valueOf(), VkSystemAllocationScope.VK_SYSTEM_ALLOCATION_SCOPE_COMMAND.toString() + " has an unexpected value.");
        assertEquals(1, VkSystemAllocationScope.VK_SYSTEM_ALLOCATION_SCOPE_OBJECT.valueOf(), VkSystemAllocationScope.        VK_SYSTEM_ALLOCATION_SCOPE_OBJECT.toString() + " has an unexpected value.");
        assertEquals(2, VkSystemAllocationScope.VK_SYSTEM_ALLOCATION_SCOPE_CACHE.valueOf(), VkSystemAllocationScope.        VK_SYSTEM_ALLOCATION_SCOPE_CACHE.toString() + " has an unexpected value.");
        assertEquals(3, VkSystemAllocationScope.VK_SYSTEM_ALLOCATION_SCOPE_DEVICE.valueOf(), VkSystemAllocationScope.        VK_SYSTEM_ALLOCATION_SCOPE_DEVICE.toString() + " has an unexpected value.");
        assertEquals(4, VkSystemAllocationScope.VK_SYSTEM_ALLOCATION_SCOPE_INSTANCE.valueOf(), VkSystemAllocationScope.        VK_SYSTEM_ALLOCATION_SCOPE_INSTANCE.toString() + " has an unexpected value.");
        assertEquals(VkSystemAllocationScope.VK_SYSTEM_ALLOCATION_SCOPE_COMMAND.valueOf(), VkSystemAllocationScope.        VK_SYSTEM_ALLOCATION_SCOPE_BEGIN_RANGE.valueOf(), VkSystemAllocationScope.        VK_SYSTEM_ALLOCATION_SCOPE_BEGIN_RANGE.toString() + " has an unexpected value.");
        assertEquals(VkSystemAllocationScope.VK_SYSTEM_ALLOCATION_SCOPE_INSTANCE.valueOf(), VkSystemAllocationScope.        VK_SYSTEM_ALLOCATION_SCOPE_END_RANGE.valueOf(), VkSystemAllocationScope.        VK_SYSTEM_ALLOCATION_SCOPE_END_RANGE.toString() + " has an unexpected value.");
        assertEquals((VkSystemAllocationScope.VK_SYSTEM_ALLOCATION_SCOPE_INSTANCE.valueOf() - VkSystemAllocationScope.VK_SYSTEM_ALLOCATION_SCOPE_COMMAND.valueOf() + 1), VkSystemAllocationScope.        VK_SYSTEM_ALLOCATION_SCOPE_RANGE_SIZE.valueOf(), VkSystemAllocationScope.        VK_SYSTEM_ALLOCATION_SCOPE_RANGE_SIZE.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkSystemAllocationScope.        VK_SYSTEM_ALLOCATION_SCOPE_MAX_ENUM.valueOf(), VkSystemAllocationScope.        VK_SYSTEM_ALLOCATION_SCOPE_MAX_ENUM.toString() + " has an unexpected value.");
    }
}
