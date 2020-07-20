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

public enum VkDescriptorType
{
    VK_DESCRIPTOR_TYPE_SAMPLER(0),
    VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER(1),
    VK_DESCRIPTOR_TYPE_SAMPLED_IMAGE(2),
    VK_DESCRIPTOR_TYPE_STORAGE_IMAGE(3),
    VK_DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER(4),
    VK_DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER(5),
    VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER(6),
    VK_DESCRIPTOR_TYPE_STORAGE_BUFFER(7),
    VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC(8),
    VK_DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC(9),
    VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT(10),
    VK_DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK_EXT(1000138000),
    VK_DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_KHR(1000165000),
    VK_DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_NV(VK_DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_KHR.valueOf()),
    VK_DESCRIPTOR_TYPE_MAX_ENUM(0x7FFFFFFF);

    private int value;
    
    private VkDescriptorType(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
