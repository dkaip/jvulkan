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

class VkDependencyFlagBitsTest
{
    @Test
    void testNumberOfElements()
    {
        VkDependencyFlagBits[] values = VkDependencyFlagBits.values();
        assertEquals(6, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }


    @Test
    void testValues()
    {
        assertEquals(0x00000001, VkDependencyFlagBits.VK_DEPENDENCY_BY_REGION_BIT.valueOf(), VkDependencyFlagBits.VK_DEPENDENCY_BY_REGION_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000004, VkDependencyFlagBits.VK_DEPENDENCY_DEVICE_GROUP_BIT.valueOf(), VkDependencyFlagBits.VK_DEPENDENCY_DEVICE_GROUP_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000002, VkDependencyFlagBits.VK_DEPENDENCY_VIEW_LOCAL_BIT.valueOf(), VkDependencyFlagBits.VK_DEPENDENCY_VIEW_LOCAL_BIT.toString() + " has an unexpected value.");
        assertEquals(VkDependencyFlagBits.VK_DEPENDENCY_VIEW_LOCAL_BIT.valueOf(), VkDependencyFlagBits.VK_DEPENDENCY_VIEW_LOCAL_BIT_KHR.valueOf(), VkDependencyFlagBits.VK_DEPENDENCY_VIEW_LOCAL_BIT_KHR.toString() + " has an unexpected value.");
        assertEquals(VkDependencyFlagBits.VK_DEPENDENCY_DEVICE_GROUP_BIT.valueOf(), VkDependencyFlagBits.VK_DEPENDENCY_DEVICE_GROUP_BIT_KHR.valueOf(), VkDependencyFlagBits.VK_DEPENDENCY_DEVICE_GROUP_BIT_KHR.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkDependencyFlagBits.VK_DEPENDENCY_FLAG_BITS_MAX_ENUM.valueOf(), VkDependencyFlagBits.VK_DEPENDENCY_FLAG_BITS_MAX_ENUM.toString() + " has an unexpected value.");
    }
}
