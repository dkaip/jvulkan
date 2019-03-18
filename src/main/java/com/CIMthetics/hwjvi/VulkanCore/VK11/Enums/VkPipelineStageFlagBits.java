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
package com.CIMthetics.hwjvi.VulkanCore.VK11.Enums;

public enum VkPipelineStageFlagBits
{
    VK_PIPELINE_STAGE_TOP_OF_PIPE_BIT(0x00000001),
            VK_PIPELINE_STAGE_DRAW_INDIRECT_BIT(0x00000002),
            VK_PIPELINE_STAGE_VERTEX_INPUT_BIT(0x00000004),
            VK_PIPELINE_STAGE_VERTEX_SHADER_BIT(0x00000008),
            VK_PIPELINE_STAGE_TESSELLATION_CONTROL_SHADER_BIT(0x00000010),
            VK_PIPELINE_STAGE_TESSELLATION_EVALUATION_SHADER_BIT(0x00000020),
            VK_PIPELINE_STAGE_GEOMETRY_SHADER_BIT(0x00000040),
            VK_PIPELINE_STAGE_FRAGMENT_SHADER_BIT(0x00000080),
            VK_PIPELINE_STAGE_EARLY_FRAGMENT_TESTS_BIT(0x00000100),
            VK_PIPELINE_STAGE_LATE_FRAGMENT_TESTS_BIT(0x00000200),
            VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT(0x00000400),
            VK_PIPELINE_STAGE_COMPUTE_SHADER_BIT(0x00000800),
            VK_PIPELINE_STAGE_TRANSFER_BIT(0x00001000),
            VK_PIPELINE_STAGE_BOTTOM_OF_PIPE_BIT(0x00002000),
            VK_PIPELINE_STAGE_HOST_BIT(0x00004000),
            VK_PIPELINE_STAGE_ALL_GRAPHICS_BIT(0x00008000),
            VK_PIPELINE_STAGE_ALL_COMMANDS_BIT(0x00010000),
            VK_PIPELINE_STAGE_COMMAND_PROCESS_BIT_NVX(0x00020000),
            VK_PIPELINE_STAGE_CONDITIONAL_RENDERING_BIT_EXT(0x00040000),
            VK_PIPELINE_STAGE_TASK_SHADER_BIT_NV(0x00080000),
            VK_PIPELINE_STAGE_MESH_SHADER_BIT_NV(0x00100000),
            VK_PIPELINE_STAGE_RAY_TRACING_SHADER_BIT_NV(0x00200000),
            VK_PIPELINE_STAGE_SHADING_RATE_IMAGE_BIT_NV(0x00400000),
            VK_PIPELINE_STAGE_FRAGMENT_DENSITY_PROCESS_BIT_EXT(0x00800000),
            VK_PIPELINE_STAGE_TRANSFORM_FEEDBACK_BIT_EXT(0x01000000),
            VK_PIPELINE_STAGE_ACCELERATION_STRUCTURE_BUILD_BIT_NV(0x02000000),
            VK_PIPELINE_STAGE_FLAG_BITS_MAX_ENUM(0x7FFFFFFF);

    private int value;
    
    private VkPipelineStageFlagBits(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
