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

class VkBufferUsageFlagBitsTest
{
    @Test
    void testNumberOfElements()
    {
        VkBufferUsageFlagBits[] values = VkBufferUsageFlagBits.values();
        assertEquals(15, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }


    @Test
    void testValues()
    {
        assertEquals(0x00000001, VkBufferUsageFlagBits.VK_BUFFER_USAGE_TRANSFER_SRC_BIT.valueOf(), VkBufferUsageFlagBits.VK_BUFFER_USAGE_TRANSFER_SRC_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000002, VkBufferUsageFlagBits.VK_BUFFER_USAGE_TRANSFER_DST_BIT.valueOf(), VkBufferUsageFlagBits.VK_BUFFER_USAGE_TRANSFER_DST_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000004, VkBufferUsageFlagBits.VK_BUFFER_USAGE_UNIFORM_TEXEL_BUFFER_BIT.valueOf(), VkBufferUsageFlagBits.VK_BUFFER_USAGE_UNIFORM_TEXEL_BUFFER_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000008, VkBufferUsageFlagBits.VK_BUFFER_USAGE_STORAGE_TEXEL_BUFFER_BIT.valueOf(), VkBufferUsageFlagBits.VK_BUFFER_USAGE_STORAGE_TEXEL_BUFFER_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000010, VkBufferUsageFlagBits.VK_BUFFER_USAGE_UNIFORM_BUFFER_BIT.valueOf(), VkBufferUsageFlagBits.VK_BUFFER_USAGE_UNIFORM_BUFFER_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000020, VkBufferUsageFlagBits.VK_BUFFER_USAGE_STORAGE_BUFFER_BIT.valueOf(), VkBufferUsageFlagBits.VK_BUFFER_USAGE_STORAGE_BUFFER_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000040, VkBufferUsageFlagBits.VK_BUFFER_USAGE_INDEX_BUFFER_BIT.valueOf(), VkBufferUsageFlagBits.VK_BUFFER_USAGE_INDEX_BUFFER_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000080, VkBufferUsageFlagBits.VK_BUFFER_USAGE_VERTEX_BUFFER_BIT.valueOf(), VkBufferUsageFlagBits.VK_BUFFER_USAGE_VERTEX_BUFFER_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000100, VkBufferUsageFlagBits.VK_BUFFER_USAGE_INDIRECT_BUFFER_BIT.valueOf(), VkBufferUsageFlagBits.VK_BUFFER_USAGE_INDIRECT_BUFFER_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000200, VkBufferUsageFlagBits.VK_BUFFER_USAGE_CONDITIONAL_RENDERING_BIT_EXT.valueOf(), VkBufferUsageFlagBits.VK_BUFFER_USAGE_CONDITIONAL_RENDERING_BIT_EXT.toString() + " has an unexpected value.");
        assertEquals(0x00000400, VkBufferUsageFlagBits.VK_BUFFER_USAGE_RAY_TRACING_BIT_NV.valueOf(), VkBufferUsageFlagBits.VK_BUFFER_USAGE_RAY_TRACING_BIT_NV.toString() + " has an unexpected value.");
        assertEquals(0x00000800, VkBufferUsageFlagBits.VK_BUFFER_USAGE_TRANSFORM_FEEDBACK_BUFFER_BIT_EXT.valueOf(), VkBufferUsageFlagBits.VK_BUFFER_USAGE_TRANSFORM_FEEDBACK_BUFFER_BIT_EXT.toString() + " has an unexpected value.");
        assertEquals(0x00001000, VkBufferUsageFlagBits.VK_BUFFER_USAGE_TRANSFORM_FEEDBACK_COUNTER_BUFFER_BIT_EXT.valueOf(), VkBufferUsageFlagBits.VK_BUFFER_USAGE_TRANSFORM_FEEDBACK_COUNTER_BUFFER_BIT_EXT.toString() + " has an unexpected value.");
        assertEquals(0x00020000, VkBufferUsageFlagBits.VK_BUFFER_USAGE_SHADER_DEVICE_ADDRESS_BIT_EXT.valueOf(), VkBufferUsageFlagBits.VK_BUFFER_USAGE_SHADER_DEVICE_ADDRESS_BIT_EXT.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkBufferUsageFlagBits.VK_BUFFER_USAGE_FLAG_BITS_MAX_ENUM.valueOf(), VkBufferUsageFlagBits.VK_BUFFER_USAGE_FLAG_BITS_MAX_ENUM.toString() + " has an unexpected value.");
    }
}
