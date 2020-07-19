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

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkPipelineStageFlagBits;

class VkPipelineStageFlagBitsTest
{
    @Test
    void testNumberOfElements()
    {
        VkPipelineStageFlagBits[] values = VkPipelineStageFlagBits.values();
        assertEquals(27, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }


    @Test
    void testValues()
    {
        assertEquals(0x00000001, VkPipelineStageFlagBits.VK_PIPELINE_STAGE_TOP_OF_PIPE_BIT.valueOf(), VkPipelineStageFlagBits.VK_PIPELINE_STAGE_TOP_OF_PIPE_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000002, VkPipelineStageFlagBits.        VK_PIPELINE_STAGE_DRAW_INDIRECT_BIT.valueOf(), VkPipelineStageFlagBits.        VK_PIPELINE_STAGE_DRAW_INDIRECT_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000004, VkPipelineStageFlagBits.        VK_PIPELINE_STAGE_VERTEX_INPUT_BIT.valueOf(), VkPipelineStageFlagBits.        VK_PIPELINE_STAGE_VERTEX_INPUT_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000008, VkPipelineStageFlagBits.        VK_PIPELINE_STAGE_VERTEX_SHADER_BIT.valueOf(), VkPipelineStageFlagBits.        VK_PIPELINE_STAGE_VERTEX_SHADER_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000010, VkPipelineStageFlagBits.        VK_PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT.valueOf(), VkPipelineStageFlagBits.        VK_PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000020, VkPipelineStageFlagBits.        VK_PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT.valueOf(), VkPipelineStageFlagBits.        VK_PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000040, VkPipelineStageFlagBits.        VK_PIPELINE_STAGE_GEOMETRY_SHADER_BIT.valueOf(), VkPipelineStageFlagBits.        VK_PIPELINE_STAGE_GEOMETRY_SHADER_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000080, VkPipelineStageFlagBits.        VK_PIPELINE_STAGE_FRAGMENT_SHADER_BIT.valueOf(), VkPipelineStageFlagBits.        VK_PIPELINE_STAGE_FRAGMENT_SHADER_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000100, VkPipelineStageFlagBits.        VK_PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT.valueOf(), VkPipelineStageFlagBits.        VK_PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000200, VkPipelineStageFlagBits.        VK_PIPELINE_STAGE_LATE_FRAGMENT_TESTS_BIT.valueOf(), VkPipelineStageFlagBits.        VK_PIPELINE_STAGE_LATE_FRAGMENT_TESTS_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000400, VkPipelineStageFlagBits.        VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT.valueOf(), VkPipelineStageFlagBits.        VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000800, VkPipelineStageFlagBits.        VK_PIPELINE_STAGE_COMPUTE_SHADER_BIT.valueOf(), VkPipelineStageFlagBits.        VK_PIPELINE_STAGE_COMPUTE_SHADER_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00001000, VkPipelineStageFlagBits.        VK_PIPELINE_STAGE_TRANSFER_BIT.valueOf(), VkPipelineStageFlagBits.        VK_PIPELINE_STAGE_TRANSFER_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00002000, VkPipelineStageFlagBits.        VK_PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT.valueOf(), VkPipelineStageFlagBits.        VK_PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00004000, VkPipelineStageFlagBits.        VK_PIPELINE_STAGE_HOST_BIT.valueOf(), VkPipelineStageFlagBits.        VK_PIPELINE_STAGE_HOST_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00008000, VkPipelineStageFlagBits.        VK_PIPELINE_STAGE_ALL_GRAPHICS_BIT.valueOf(), VkPipelineStageFlagBits.        VK_PIPELINE_STAGE_ALL_GRAPHICS_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00010000, VkPipelineStageFlagBits.        VK_PIPELINE_STAGE_ALL_COMMANDS_BIT.valueOf(), VkPipelineStageFlagBits.        VK_PIPELINE_STAGE_ALL_COMMANDS_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00020000, VkPipelineStageFlagBits.        VK_PIPELINE_STAGE_COMMAND_PROCESS_BIT_NVX.valueOf(), VkPipelineStageFlagBits.        VK_PIPELINE_STAGE_COMMAND_PROCESS_BIT_NVX.toString() + " has an unexpected value.");
        assertEquals(0x00040000, VkPipelineStageFlagBits.        VK_PIPELINE_STAGE_CONDITIONAL_RENDERING_BIT_EXT.valueOf(), VkPipelineStageFlagBits.        VK_PIPELINE_STAGE_CONDITIONAL_RENDERING_BIT_EXT.toString() + " has an unexpected value.");
        assertEquals(0x00080000, VkPipelineStageFlagBits.        VK_PIPELINE_STAGE_TASK_SHADER_BIT_NV.valueOf(), VkPipelineStageFlagBits.        VK_PIPELINE_STAGE_TASK_SHADER_BIT_NV.toString() + " has an unexpected value.");
        assertEquals(0x00100000, VkPipelineStageFlagBits.        VK_PIPELINE_STAGE_MESH_SHADER_BIT_NV.valueOf(), VkPipelineStageFlagBits.        VK_PIPELINE_STAGE_MESH_SHADER_BIT_NV.toString() + " has an unexpected value.");
        assertEquals(0x00200000, VkPipelineStageFlagBits.        VK_PIPELINE_STAGE_RAY_TRACING_SHADER_BIT_NV.valueOf(), VkPipelineStageFlagBits.        VK_PIPELINE_STAGE_RAY_TRACING_SHADER_BIT_NV.toString() + " has an unexpected value.");
        assertEquals(0x00400000, VkPipelineStageFlagBits.        VK_PIPELINE_STAGE_SHADING_RATE_IMAGE_BIT_NV.valueOf(), VkPipelineStageFlagBits.        VK_PIPELINE_STAGE_SHADING_RATE_IMAGE_BIT_NV.toString() + " has an unexpected value.");
        assertEquals(0x00800000, VkPipelineStageFlagBits.        VK_PIPELINE_STAGE_FRAGMENT_DENSITY_PROCESS_BIT_EXT.valueOf(), VkPipelineStageFlagBits.        VK_PIPELINE_STAGE_FRAGMENT_DENSITY_PROCESS_BIT_EXT.toString() + " has an unexpected value.");
        assertEquals(0x01000000, VkPipelineStageFlagBits.        VK_PIPELINE_STAGE_TRANSFORM_FEEDBACK_BIT_EXT.valueOf(), VkPipelineStageFlagBits.        VK_PIPELINE_STAGE_TRANSFORM_FEEDBACK_BIT_EXT.toString() + " has an unexpected value.");
        assertEquals(0x02000000, VkPipelineStageFlagBits.        VK_PIPELINE_STAGE_ACCELERATION_STRUCTURE_BUILD_BIT_NV.valueOf(), VkPipelineStageFlagBits.        VK_PIPELINE_STAGE_ACCELERATION_STRUCTURE_BUILD_BIT_NV.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkPipelineStageFlagBits.        VK_PIPELINE_STAGE_FLAG_BITS_MAX_ENUM.valueOf(), VkPipelineStageFlagBits.        VK_PIPELINE_STAGE_FLAG_BITS_MAX_ENUM.toString() + " has an unexpected value.");
    }
}
