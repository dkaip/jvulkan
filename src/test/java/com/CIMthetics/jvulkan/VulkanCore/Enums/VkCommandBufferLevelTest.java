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
package com.CIMthetics.jvulkan.VulkanCore.Enums;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkCommandBufferLevel;

class VkCommandBufferLevelTest
{
    @Test
    void testNumberOfElements()
    {
        VkCommandBufferLevel[] values = VkCommandBufferLevel.values();
        assertEquals(6, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }


    @Test
    void testValues()
    {
        assertEquals(0, VkCommandBufferLevel.VK_COMMAND_BUFFER_LEVEL_PRIMARY.valueOf(), VkCommandBufferLevel.VK_COMMAND_BUFFER_LEVEL_PRIMARY.toString() + " has an unexpected value.");
        assertEquals(1, VkCommandBufferLevel.VK_COMMAND_BUFFER_LEVEL_SECONDARY.valueOf(), VkCommandBufferLevel.VK_COMMAND_BUFFER_LEVEL_SECONDARY.toString() + " has an unexpected value.");
        assertEquals(VkCommandBufferLevel.VK_COMMAND_BUFFER_LEVEL_PRIMARY.valueOf(), VkCommandBufferLevel.VK_COMMAND_BUFFER_LEVEL_BEGIN_RANGE.valueOf(), VkCommandBufferLevel.VK_COMMAND_BUFFER_LEVEL_BEGIN_RANGE.toString() + " has an unexpected value.");
        assertEquals(VkCommandBufferLevel.VK_COMMAND_BUFFER_LEVEL_SECONDARY.valueOf(), VkCommandBufferLevel.VK_COMMAND_BUFFER_LEVEL_END_RANGE.valueOf(), VkCommandBufferLevel.VK_COMMAND_BUFFER_LEVEL_END_RANGE.toString() + " has an unexpected value.");
        assertEquals((VkCommandBufferLevel.VK_COMMAND_BUFFER_LEVEL_SECONDARY.valueOf() - VkCommandBufferLevel.VK_COMMAND_BUFFER_LEVEL_PRIMARY.valueOf() + 1), VkCommandBufferLevel.VK_COMMAND_BUFFER_LEVEL_RANGE_SIZE.valueOf(), VkCommandBufferLevel.VK_COMMAND_BUFFER_LEVEL_RANGE_SIZE.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkCommandBufferLevel.VK_COMMAND_BUFFER_LEVEL_MAX_ENUM.valueOf(), VkCommandBufferLevel.VK_COMMAND_BUFFER_LEVEL_MAX_ENUM.toString() + " has an unexpected value.");
    }
}
