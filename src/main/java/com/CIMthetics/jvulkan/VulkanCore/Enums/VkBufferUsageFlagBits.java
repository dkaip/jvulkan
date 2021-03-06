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

public enum VkBufferUsageFlagBits
{
    VK_BUFFER_USAGE_TRANSFER_SRC_BIT(0x00000001),
    VK_BUFFER_USAGE_TRANSFER_DST_BIT(0x00000002),
    VK_BUFFER_USAGE_UNIFORM_TEXEL_BUFFER_BIT(0x00000004),
    VK_BUFFER_USAGE_STORAGE_TEXEL_BUFFER_BIT(0x00000008),
    VK_BUFFER_USAGE_UNIFORM_BUFFER_BIT(0x00000010),
    VK_BUFFER_USAGE_STORAGE_BUFFER_BIT(0x00000020),
    VK_BUFFER_USAGE_INDEX_BUFFER_BIT(0x00000040),
    VK_BUFFER_USAGE_VERTEX_BUFFER_BIT(0x00000080),
    VK_BUFFER_USAGE_INDIRECT_BUFFER_BIT(0x00000100),
    VK_BUFFER_USAGE_SHADER_DEVICE_ADDRESS_BIT(0x00020000),
    VK_BUFFER_USAGE_TRANSFORM_FEEDBACK_BUFFER_BIT_EXT(0x00000800),
    VK_BUFFER_USAGE_TRANSFORM_FEEDBACK_COUNTER_BUFFER_BIT_EXT(0x00001000),
    VK_BUFFER_USAGE_CONDITIONAL_RENDERING_BIT_EXT(0x00000200),
    VK_BUFFER_USAGE_RAY_TRACING_BIT_KHR(0x00000400),
    VK_BUFFER_USAGE_RAY_TRACING_BIT_NV(VK_BUFFER_USAGE_RAY_TRACING_BIT_KHR.valueOf()),
    VK_BUFFER_USAGE_SHADER_DEVICE_ADDRESS_BIT_EXT(VK_BUFFER_USAGE_SHADER_DEVICE_ADDRESS_BIT.valueOf()),
    VK_BUFFER_USAGE_SHADER_DEVICE_ADDRESS_BIT_KHR(VK_BUFFER_USAGE_SHADER_DEVICE_ADDRESS_BIT.valueOf()),
    VK_BUFFER_USAGE_FLAG_BITS_MAX_ENUM(0x7FFFFFFF);

    private int value;
    
    private VkBufferUsageFlagBits(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
