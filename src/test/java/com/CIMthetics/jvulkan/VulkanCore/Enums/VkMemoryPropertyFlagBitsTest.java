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
package com.CIMthetics.jvulkan.VulkanCore.Enums;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkMemoryPropertyFlagBits;

class VkMemoryPropertyFlagBitsTest
{
    @Test
    void testNumberOfElements()
    {
        VkMemoryPropertyFlagBits[] values = VkMemoryPropertyFlagBits.values();
        assertEquals(7, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }


    @Test
    void testValues()
    {
        assertEquals(0x00000001, VkMemoryPropertyFlagBits.VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT.valueOf(), VkMemoryPropertyFlagBits.VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000002, VkMemoryPropertyFlagBits.VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT.valueOf(), VkMemoryPropertyFlagBits.VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000004, VkMemoryPropertyFlagBits.VK_MEMORY_PROPERTY_HOST_COHERENT_BIT.valueOf(), VkMemoryPropertyFlagBits.VK_MEMORY_PROPERTY_HOST_COHERENT_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000008, VkMemoryPropertyFlagBits.VK_MEMORY_PROPERTY_HOST_CACHED_BIT.valueOf(), VkMemoryPropertyFlagBits.VK_MEMORY_PROPERTY_HOST_CACHED_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000010, VkMemoryPropertyFlagBits.VK_MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT.valueOf(), VkMemoryPropertyFlagBits.VK_MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000020, VkMemoryPropertyFlagBits.VK_MEMORY_PROPERTY_PROTECTED_BIT.valueOf(), VkMemoryPropertyFlagBits.VK_MEMORY_PROPERTY_PROTECTED_BIT.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkMemoryPropertyFlagBits.VK_MEMORY_PROPERTY_FLAG_BITS_MAX_ENUM.valueOf(), VkMemoryPropertyFlagBits.VK_MEMORY_PROPERTY_FLAG_BITS_MAX_ENUM.toString() + " has an unexpected value.");
    }
}
