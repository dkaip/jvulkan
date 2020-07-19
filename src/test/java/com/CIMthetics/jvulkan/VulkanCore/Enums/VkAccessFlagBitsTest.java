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

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkAccessFlagBits;

class VkAccessFlagBitsTest
{
    @Test
    void testNumberOfElements()
    {
        VkAccessFlagBits[] values = VkAccessFlagBits.values();
        assertEquals(29, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }


    @Test
    void testValues()
    {
        assertEquals(0x00000001, VkAccessFlagBits.VK_ACCESS_INDIRECT_COMMAND_READ_BIT.valueOf(), VkAccessFlagBits.VK_ACCESS_INDIRECT_COMMAND_READ_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000002, VkAccessFlagBits.VK_ACCESS_INDEX_READ_BIT.valueOf(), VkAccessFlagBits.VK_ACCESS_INDEX_READ_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000004, VkAccessFlagBits.VK_ACCESS_VERTEX_ATTRIBUTE_READ_BIT.valueOf(), VkAccessFlagBits.VK_ACCESS_VERTEX_ATTRIBUTE_READ_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000008, VkAccessFlagBits.VK_ACCESS_UNIFORM_READ_BIT.valueOf(), VkAccessFlagBits.VK_ACCESS_UNIFORM_READ_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000010, VkAccessFlagBits.VK_ACCESS_INPUT_ATTACHMENT_READ_BIT.valueOf(), VkAccessFlagBits.VK_ACCESS_INPUT_ATTACHMENT_READ_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000020, VkAccessFlagBits.VK_ACCESS_SHADER_READ_BIT.valueOf(), VkAccessFlagBits.VK_ACCESS_SHADER_READ_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000040, VkAccessFlagBits.VK_ACCESS_SHADER_WRITE_BIT.valueOf(), VkAccessFlagBits.VK_ACCESS_SHADER_WRITE_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000080, VkAccessFlagBits.VK_ACCESS_COLOR_ATTACHMENT_READ_BIT.valueOf(), VkAccessFlagBits.VK_ACCESS_COLOR_ATTACHMENT_READ_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000100, VkAccessFlagBits.VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT.valueOf(), VkAccessFlagBits.VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000200, VkAccessFlagBits.VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_READ_BIT.valueOf(), VkAccessFlagBits.VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_READ_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000400, VkAccessFlagBits.VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT.valueOf(), VkAccessFlagBits.VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000800, VkAccessFlagBits.VK_ACCESS_TRANSFER_READ_BIT.valueOf(), VkAccessFlagBits.VK_ACCESS_TRANSFER_READ_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00001000, VkAccessFlagBits.VK_ACCESS_TRANSFER_WRITE_BIT.valueOf(), VkAccessFlagBits.VK_ACCESS_TRANSFER_WRITE_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00002000, VkAccessFlagBits.VK_ACCESS_HOST_READ_BIT.valueOf(), VkAccessFlagBits.VK_ACCESS_HOST_READ_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00004000, VkAccessFlagBits.VK_ACCESS_HOST_WRITE_BIT.valueOf(), VkAccessFlagBits.VK_ACCESS_HOST_WRITE_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00008000, VkAccessFlagBits.VK_ACCESS_MEMORY_READ_BIT.valueOf(), VkAccessFlagBits.VK_ACCESS_MEMORY_READ_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00010000, VkAccessFlagBits.VK_ACCESS_MEMORY_WRITE_BIT.valueOf(), VkAccessFlagBits.VK_ACCESS_MEMORY_WRITE_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00020000, VkAccessFlagBits.VK_ACCESS_COMMAND_PROCESS_READ_BIT_NVX.valueOf(), VkAccessFlagBits.VK_ACCESS_COMMAND_PROCESS_READ_BIT_NVX.toString() + " has an unexpected value.");
        assertEquals(0x00040000, VkAccessFlagBits.VK_ACCESS_COMMAND_PROCESS_WRITE_BIT_NVX.valueOf(), VkAccessFlagBits.VK_ACCESS_COMMAND_PROCESS_WRITE_BIT_NVX.toString() + " has an unexpected value.");
        assertEquals(0x00080000, VkAccessFlagBits.VK_ACCESS_COLOR_ATTACHMENT_READ_NONCOHERENT_BIT_EXT.valueOf(), VkAccessFlagBits.VK_ACCESS_COLOR_ATTACHMENT_READ_NONCOHERENT_BIT_EXT.toString() + " has an unexpected value.");
        assertEquals(0x00100000, VkAccessFlagBits.VK_ACCESS_CONDITIONAL_RENDERING_READ_BIT_EXT.valueOf(), VkAccessFlagBits.VK_ACCESS_CONDITIONAL_RENDERING_READ_BIT_EXT.toString() + " has an unexpected value.");
        assertEquals(0x00200000, VkAccessFlagBits.VK_ACCESS_ACCELERATION_STRUCTURE_READ_BIT_NV.valueOf(), VkAccessFlagBits.VK_ACCESS_ACCELERATION_STRUCTURE_READ_BIT_NV.toString() + " has an unexpected value.");
        assertEquals(0x00400000, VkAccessFlagBits.VK_ACCESS_ACCELERATION_STRUCTURE_WRITE_BIT_NV.valueOf(), VkAccessFlagBits.VK_ACCESS_ACCELERATION_STRUCTURE_WRITE_BIT_NV.toString() + " has an unexpected value.");
        assertEquals(0x00800000, VkAccessFlagBits.VK_ACCESS_SHADING_RATE_IMAGE_READ_BIT_NV.valueOf(), VkAccessFlagBits.VK_ACCESS_SHADING_RATE_IMAGE_READ_BIT_NV.toString() + " has an unexpected value.");
        assertEquals(0x01000000, VkAccessFlagBits.VK_ACCESS_FRAGMENT_DENSITY_MAP_READ_BIT_EXT.valueOf(), VkAccessFlagBits.VK_ACCESS_FRAGMENT_DENSITY_MAP_READ_BIT_EXT.toString() + " has an unexpected value.");
        assertEquals(0x02000000, VkAccessFlagBits.VK_ACCESS_TRANSFORM_FEEDBACK_WRITE_BIT_EXT.valueOf(), VkAccessFlagBits.VK_ACCESS_TRANSFORM_FEEDBACK_WRITE_BIT_EXT.toString() + " has an unexpected value.");
        assertEquals(0x04000000, VkAccessFlagBits.VK_ACCESS_TRANSFORM_FEEDBACK_COUNTER_READ_BIT_EXT.valueOf(), VkAccessFlagBits.VK_ACCESS_TRANSFORM_FEEDBACK_COUNTER_READ_BIT_EXT.toString() + " has an unexpected value.");
        assertEquals(0x08000000, VkAccessFlagBits.VK_ACCESS_TRANSFORM_FEEDBACK_COUNTER_WRITE_BIT_EXT.valueOf(), VkAccessFlagBits.VK_ACCESS_TRANSFORM_FEEDBACK_COUNTER_WRITE_BIT_EXT.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkAccessFlagBits.VK_ACCESS_FLAG_BITS_MAX_ENUM.valueOf(), VkAccessFlagBits.VK_ACCESS_FLAG_BITS_MAX_ENUM.toString() + " has an unexpected value.");
    }
}
