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

public enum VkShaderStageFlagBits
{
    VK_SHADER_STAGE_VERTEX_BIT(0x00000001),
    VK_SHADER_STAGE_TESSELLATION_CONTROL_BIT(0x00000002),
    VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT(0x00000004),
    VK_SHADER_STAGE_GEOMETRY_BIT(0x00000008),
    VK_SHADER_STAGE_FRAGMENT_BIT(0x00000010),
    VK_SHADER_STAGE_ALL_GRAPHICS(0x0000001F),
    VK_SHADER_STAGE_COMPUTE_BIT(0x00000020),
    VK_SHADER_STAGE_TASK_BIT_NV(0x00000040),
    VK_SHADER_STAGE_MESH_BIT_NV(0x00000080),
    VK_SHADER_STAGE_RAYGEN_BIT_KHR(0x00000100),
    VK_SHADER_STAGE_ANY_HIT_BIT_KHR(0x00000200),
    VK_SHADER_STAGE_CLOSEST_HIT_BIT_KHR(0x00000400),
    VK_SHADER_STAGE_MISS_BIT_KHR(0x00000800),
    VK_SHADER_STAGE_INTERSECTION_BIT_KHR(0x00001000),
    VK_SHADER_STAGE_CALLABLE_BIT_KHR(0x00002000),
    VK_SHADER_STAGE_RAYGEN_BIT_NV(VK_SHADER_STAGE_RAYGEN_BIT_KHR.valueOf()),
    VK_SHADER_STAGE_ANY_HIT_BIT_NV(VK_SHADER_STAGE_ANY_HIT_BIT_KHR.valueOf()),
    VK_SHADER_STAGE_CLOSEST_HIT_BIT_NV(VK_SHADER_STAGE_CLOSEST_HIT_BIT_KHR.valueOf()),
    VK_SHADER_STAGE_MISS_BIT_NV(VK_SHADER_STAGE_MISS_BIT_KHR.valueOf()),
    VK_SHADER_STAGE_INTERSECTION_BIT_NV(VK_SHADER_STAGE_INTERSECTION_BIT_KHR.valueOf()),
    VK_SHADER_STAGE_CALLABLE_BIT_NV(VK_SHADER_STAGE_CALLABLE_BIT_KHR.valueOf()),
    VK_SHADER_STAGE_ALL(0x7FFFFFFF),
    VK_SHADER_STAGE_FLAG_BITS_MAX_ENUM(0x7FFFFFFF);

    private int value;
    
    private VkShaderStageFlagBits(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
