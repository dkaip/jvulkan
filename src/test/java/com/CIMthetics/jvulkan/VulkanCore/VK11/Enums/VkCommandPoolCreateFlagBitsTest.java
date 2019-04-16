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

class VkCommandPoolCreateFlagBitsTest
{
    @Test
    void testNumberOfElements()
    {
        VkCommandPoolCreateFlagBits[] values = VkCommandPoolCreateFlagBits.values();
        assertEquals(4, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }


    @Test
    void testValues()
    {
        assertEquals(0x00000001, VkCommandPoolCreateFlagBits.VK_COMMAND_POOL_CREATE_TRANSIENT_BIT.valueOf(), VkCommandPoolCreateFlagBits.VK_COMMAND_POOL_CREATE_TRANSIENT_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000002, VkCommandPoolCreateFlagBits.VK_COMMAND_POOL_CREATE_RESET_COMMAND_BUFFER_BIT.valueOf(), VkCommandPoolCreateFlagBits.VK_COMMAND_POOL_CREATE_RESET_COMMAND_BUFFER_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000004, VkCommandPoolCreateFlagBits.VK_COMMAND_POOL_CREATE_PROTECTED_BIT.valueOf(), VkCommandPoolCreateFlagBits.VK_COMMAND_POOL_CREATE_PROTECTED_BIT.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkCommandPoolCreateFlagBits.VK_COMMAND_POOL_CREATE_FLAG_BITS_MAX_ENUM.valueOf(), VkCommandPoolCreateFlagBits.VK_COMMAND_POOL_CREATE_FLAG_BITS_MAX_ENUM.toString() + " has an unexpected value.");
    }
}
