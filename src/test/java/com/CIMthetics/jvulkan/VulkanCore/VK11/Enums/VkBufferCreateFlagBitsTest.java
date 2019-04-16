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

class VkBufferCreateFlagBitsTest
{
    @Test
    void testNumberOfElements()
    {
        VkBufferCreateFlagBits[] values = VkBufferCreateFlagBits.values();
        assertEquals(6, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }


    @Test
    void testValues()
    {
        assertEquals(0x00000001, VkBufferCreateFlagBits.VK_BUFFER_CREATE_SPARSE_BINDING_BIT.valueOf(), VkBufferCreateFlagBits.VK_BUFFER_CREATE_SPARSE_BINDING_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000002, VkBufferCreateFlagBits.VK_BUFFER_CREATE_SPARSE_RESIDENCY_BIT.valueOf(), VkBufferCreateFlagBits.VK_BUFFER_CREATE_SPARSE_RESIDENCY_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000004, VkBufferCreateFlagBits.VK_BUFFER_CREATE_SPARSE_ALIASED_BIT.valueOf(), VkBufferCreateFlagBits.VK_BUFFER_CREATE_SPARSE_ALIASED_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000008, VkBufferCreateFlagBits.VK_BUFFER_CREATE_PROTECTED_BIT.valueOf(), VkBufferCreateFlagBits.VK_BUFFER_CREATE_PROTECTED_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000010, VkBufferCreateFlagBits.VK_BUFFER_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT_EXT.valueOf(), VkBufferCreateFlagBits.VK_BUFFER_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT_EXT.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkBufferCreateFlagBits.VK_BUFFER_CREATE_FLAG_BITS_MAX_ENUM.valueOf(), VkBufferCreateFlagBits.VK_BUFFER_CREATE_FLAG_BITS_MAX_ENUM.toString() + " has an unexpected value.");
    }
}
