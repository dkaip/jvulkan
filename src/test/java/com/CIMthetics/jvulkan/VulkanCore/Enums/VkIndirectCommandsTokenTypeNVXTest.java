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

import com.CIMthetics.jvulkan.VulkanExtensions.Enums.VkIndirectCommandsTokenTypeNVX;

class VkIndirectCommandsTokenTypeNVXTest
{
    @Test
    void testNumberOfElements()
    {
        VkIndirectCommandsTokenTypeNVX[] values = VkIndirectCommandsTokenTypeNVX.values();
        assertEquals(12, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }


    @Test
    void testValues()
    {
        assertEquals(0, VkIndirectCommandsTokenTypeNVX.VK_INDIRECT_COMMANDS_TOKEN_TYPE_PIPELINE_NVX.valueOf(), VkIndirectCommandsTokenTypeNVX.VK_INDIRECT_COMMANDS_TOKEN_TYPE_PIPELINE_NVX.toString() + " has an unexpected value.");
        assertEquals(1, VkIndirectCommandsTokenTypeNVX.VK_INDIRECT_COMMANDS_TOKEN_TYPE_DESCRIPTOR_SET_NVX.valueOf(), VkIndirectCommandsTokenTypeNVX.VK_INDIRECT_COMMANDS_TOKEN_TYPE_DESCRIPTOR_SET_NVX.toString() + " has an unexpected value.");
        assertEquals(2, VkIndirectCommandsTokenTypeNVX.VK_INDIRECT_COMMANDS_TOKEN_TYPE_INDEX_BUFFER_NVX.valueOf(), VkIndirectCommandsTokenTypeNVX.VK_INDIRECT_COMMANDS_TOKEN_TYPE_INDEX_BUFFER_NVX.toString() + " has an unexpected value.");
        assertEquals(3, VkIndirectCommandsTokenTypeNVX.VK_INDIRECT_COMMANDS_TOKEN_TYPE_VERTEX_BUFFER_NVX.valueOf(), VkIndirectCommandsTokenTypeNVX.VK_INDIRECT_COMMANDS_TOKEN_TYPE_VERTEX_BUFFER_NVX.toString() + " has an unexpected value.");
        assertEquals(4, VkIndirectCommandsTokenTypeNVX.VK_INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_NVX.valueOf(), VkIndirectCommandsTokenTypeNVX.VK_INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_NVX.toString() + " has an unexpected value.");
        assertEquals(5, VkIndirectCommandsTokenTypeNVX.VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_INDEXED_NVX.valueOf(), VkIndirectCommandsTokenTypeNVX.VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_INDEXED_NVX.toString() + " has an unexpected value.");
        assertEquals(6, VkIndirectCommandsTokenTypeNVX.VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_NVX.valueOf(), VkIndirectCommandsTokenTypeNVX.VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_NVX.toString() + " has an unexpected value.");
        assertEquals(7, VkIndirectCommandsTokenTypeNVX.VK_INDIRECT_COMMANDS_TOKEN_TYPE_DISPATCH_NVX.valueOf(), VkIndirectCommandsTokenTypeNVX.VK_INDIRECT_COMMANDS_TOKEN_TYPE_DISPATCH_NVX.toString() + " has an unexpected value.");
        assertEquals(VkIndirectCommandsTokenTypeNVX.VK_INDIRECT_COMMANDS_TOKEN_TYPE_PIPELINE_NVX.valueOf(), VkIndirectCommandsTokenTypeNVX.VK_INDIRECT_COMMANDS_TOKEN_TYPE_BEGIN_RANGE_NVX.valueOf(), VkIndirectCommandsTokenTypeNVX.VK_INDIRECT_COMMANDS_TOKEN_TYPE_BEGIN_RANGE_NVX.toString() + " has an unexpected value.");
        assertEquals(VkIndirectCommandsTokenTypeNVX.VK_INDIRECT_COMMANDS_TOKEN_TYPE_DISPATCH_NVX.valueOf(), VkIndirectCommandsTokenTypeNVX.VK_INDIRECT_COMMANDS_TOKEN_TYPE_END_RANGE_NVX.valueOf(), VkIndirectCommandsTokenTypeNVX.VK_INDIRECT_COMMANDS_TOKEN_TYPE_END_RANGE_NVX.toString() + " has an unexpected value.");
        assertEquals((VkIndirectCommandsTokenTypeNVX.VK_INDIRECT_COMMANDS_TOKEN_TYPE_DISPATCH_NVX.valueOf() - VkIndirectCommandsTokenTypeNVX.VK_INDIRECT_COMMANDS_TOKEN_TYPE_PIPELINE_NVX.valueOf() + 1), VkIndirectCommandsTokenTypeNVX.VK_INDIRECT_COMMANDS_TOKEN_TYPE_RANGE_SIZE_NVX.valueOf(), VkIndirectCommandsTokenTypeNVX.VK_INDIRECT_COMMANDS_TOKEN_TYPE_RANGE_SIZE_NVX.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkIndirectCommandsTokenTypeNVX.VK_INDIRECT_COMMANDS_TOKEN_TYPE_MAX_ENUM_NVX.valueOf(), VkIndirectCommandsTokenTypeNVX.VK_INDIRECT_COMMANDS_TOKEN_TYPE_MAX_ENUM_NVX.toString() + " has an unexpected value.");
    }
}
