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

import com.CIMthetics.jvulkan.VulkanExtensions.Enums.VkScopeNV;

class VkScopeNVTest
{
    @Test
    void testNumberOfElements()
    {
        VkScopeNV[] values = VkScopeNV.values();
        assertEquals(8, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }


    @Test
    void testValues()
    {
        assertEquals(1, VkScopeNV.VK_SCOPE_DEVICE_NV.valueOf(), VkScopeNV.VK_SCOPE_DEVICE_NV.toString() + " has an unexpected value.");
        assertEquals(2, VkScopeNV.VK_SCOPE_WORKGROUP_NV.valueOf(), VkScopeNV.VK_SCOPE_WORKGROUP_NV.toString() + " has an unexpected value.");
        assertEquals(3, VkScopeNV.VK_SCOPE_SUBGROUP_NV.valueOf(), VkScopeNV.VK_SCOPE_SUBGROUP_NV.toString() + " has an unexpected value.");
        assertEquals(5, VkScopeNV.VK_SCOPE_QUEUE_FAMILY_NV.valueOf(), VkScopeNV.VK_SCOPE_QUEUE_FAMILY_NV.toString() + " has an unexpected value.");
        assertEquals(VkScopeNV.VK_SCOPE_DEVICE_NV.valueOf(), VkScopeNV.VK_SCOPE_BEGIN_RANGE_NV.valueOf(), VkScopeNV.VK_SCOPE_BEGIN_RANGE_NV.toString() + " has an unexpected value.");
        assertEquals(VkScopeNV.VK_SCOPE_QUEUE_FAMILY_NV.valueOf(), VkScopeNV.VK_SCOPE_END_RANGE_NV.valueOf(), VkScopeNV.VK_SCOPE_END_RANGE_NV.toString() + " has an unexpected value.");
        assertEquals(VkScopeNV.VK_SCOPE_QUEUE_FAMILY_NV.valueOf() - VkScopeNV.VK_SCOPE_DEVICE_NV.valueOf() + 1, VkScopeNV.VK_SCOPE_RANGE_SIZE_NV.valueOf(), VkScopeNV.VK_SCOPE_RANGE_SIZE_NV.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkScopeNV.VK_SCOPE_MAX_ENUM_NV.valueOf(), VkScopeNV.VK_SCOPE_MAX_ENUM_NV.toString() + " has an unexpected value.");
    }
}
