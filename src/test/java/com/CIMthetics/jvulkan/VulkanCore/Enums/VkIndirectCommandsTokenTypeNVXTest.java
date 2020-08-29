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

import com.CIMthetics.jvulkan.VulkanExtensions.Enums.VkIndirectCommandsTokenTypeNV;

class VkIndirectCommandsTokenTypeNVXTest
{
    @Test
    void testNumberOfElements()
    {
        VkIndirectCommandsTokenTypeNV[] values = VkIndirectCommandsTokenTypeNV.values();
        assertEquals(12, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }


    @Test
    void testValues()
    {
        assertEquals(0, VkIndirectCommandsTokenTypeNV.VK_INDIRECT_COMMANDS_TOKEN_TYPE_SHADER_GROUP_NV.valueOf(), VkIndirectCommandsTokenTypeNV.VK_INDIRECT_COMMANDS_TOKEN_TYPE_SHADER_GROUP_NV.toString() + " has an unexpected value.");
        assertEquals(1, VkIndirectCommandsTokenTypeNV.VK_INDIRECT_COMMANDS_TOKEN_TYPE_STATE_FLAGS_NV.valueOf(), VkIndirectCommandsTokenTypeNV.VK_INDIRECT_COMMANDS_TOKEN_TYPE_STATE_FLAGS_NV.toString() + " has an unexpected value.");
        assertEquals(2, VkIndirectCommandsTokenTypeNV.VK_INDIRECT_COMMANDS_TOKEN_TYPE_INDEX_BUFFER_NV.valueOf(), VkIndirectCommandsTokenTypeNV.VK_INDIRECT_COMMANDS_TOKEN_TYPE_INDEX_BUFFER_NV.toString() + " has an unexpected value.");
        assertEquals(3, VkIndirectCommandsTokenTypeNV.VK_INDIRECT_COMMANDS_TOKEN_TYPE_VERTEX_BUFFER_NV.valueOf(), VkIndirectCommandsTokenTypeNV.VK_INDIRECT_COMMANDS_TOKEN_TYPE_VERTEX_BUFFER_NV.toString() + " has an unexpected value.");
        assertEquals(4, VkIndirectCommandsTokenTypeNV.VK_INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_NV.valueOf(), VkIndirectCommandsTokenTypeNV.VK_INDIRECT_COMMANDS_TOKEN_TYPE_PUSH_CONSTANT_NV.toString() + " has an unexpected value.");
        assertEquals(5, VkIndirectCommandsTokenTypeNV.VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_INDEXED_NV.valueOf(), VkIndirectCommandsTokenTypeNV.VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_INDEXED_NV.toString() + " has an unexpected value.");
        assertEquals(6, VkIndirectCommandsTokenTypeNV.VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_NV.valueOf(), VkIndirectCommandsTokenTypeNV.VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_NV.toString() + " has an unexpected value.");
        assertEquals(7, VkIndirectCommandsTokenTypeNV.VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_TASKS_NV.valueOf(), VkIndirectCommandsTokenTypeNV.VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_TASKS_NV.toString() + " has an unexpected value.");
        assertEquals(VkIndirectCommandsTokenTypeNV.VK_INDIRECT_COMMANDS_TOKEN_TYPE_SHADER_GROUP_NV.valueOf(), VkIndirectCommandsTokenTypeNV.VK_INDIRECT_COMMANDS_TOKEN_TYPE_BEGIN_RANGE_NVX.valueOf(), VkIndirectCommandsTokenTypeNV.VK_INDIRECT_COMMANDS_TOKEN_TYPE_BEGIN_RANGE_NVX.toString() + " has an unexpected value.");
        assertEquals(VkIndirectCommandsTokenTypeNV.VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_TASKS_NV.valueOf(), VkIndirectCommandsTokenTypeNV.VK_INDIRECT_COMMANDS_TOKEN_TYPE_END_RANGE_NVX.valueOf(), VkIndirectCommandsTokenTypeNV.VK_INDIRECT_COMMANDS_TOKEN_TYPE_END_RANGE_NVX.toString() + " has an unexpected value.");
        assertEquals((VkIndirectCommandsTokenTypeNV.VK_INDIRECT_COMMANDS_TOKEN_TYPE_DRAW_TASKS_NV.valueOf() - VkIndirectCommandsTokenTypeNV.VK_INDIRECT_COMMANDS_TOKEN_TYPE_SHADER_GROUP_NV.valueOf() + 1), VkIndirectCommandsTokenTypeNV.VK_INDIRECT_COMMANDS_TOKEN_TYPE_RANGE_SIZE_NVX.valueOf(), VkIndirectCommandsTokenTypeNV.VK_INDIRECT_COMMANDS_TOKEN_TYPE_RANGE_SIZE_NVX.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkIndirectCommandsTokenTypeNV.VK_INDIRECT_COMMANDS_TOKEN_TYPE_MAX_ENUM_NVX.valueOf(), VkIndirectCommandsTokenTypeNV.VK_INDIRECT_COMMANDS_TOKEN_TYPE_MAX_ENUM_NVX.toString() + " has an unexpected value.");
    }
}
