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
package com.CIMthetics.jvulkan.VulkanExtensions.Enums;

public enum VkRayTracingShaderGroupTypeKHR
{
    VK_RAY_TRACING_SHADER_GROUP_TYPE_GENERAL_KHR(0),
    VK_RAY_TRACING_SHADER_GROUP_TYPE_TRIANGLES_HIT_GROUP_KHR(1),
    VK_RAY_TRACING_SHADER_GROUP_TYPE_PROCEDURAL_HIT_GROUP_KHR(2),
    VK_RAY_TRACING_SHADER_GROUP_TYPE_GENERAL_NV(VK_RAY_TRACING_SHADER_GROUP_TYPE_GENERAL_KHR.valueOf()),
    VK_RAY_TRACING_SHADER_GROUP_TYPE_TRIANGLES_HIT_GROUP_NV(VK_RAY_TRACING_SHADER_GROUP_TYPE_TRIANGLES_HIT_GROUP_KHR.valueOf()),
    VK_RAY_TRACING_SHADER_GROUP_TYPE_PROCEDURAL_HIT_GROUP_NV(VK_RAY_TRACING_SHADER_GROUP_TYPE_PROCEDURAL_HIT_GROUP_KHR.valueOf()),
    VK_RAY_TRACING_SHADER_GROUP_TYPE_MAX_ENUM_NV(0x7FFFFFFF);

    private int value;
    
    private VkRayTracingShaderGroupTypeKHR(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
