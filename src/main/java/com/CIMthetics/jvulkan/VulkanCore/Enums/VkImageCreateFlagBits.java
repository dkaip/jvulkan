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

public enum VkImageCreateFlagBits
{
    VK_IMAGE_CREATE_SPARSE_BINDING_BIT(0x00000001),
    VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT(0x00000002),
    VK_IMAGE_CREATE_SPARSE_ALIASED_BIT(0x00000004),
    VK_IMAGE_CREATE_MUTABLE_FORMAT_BIT(0x00000008),
    VK_IMAGE_CREATE_CUBE_COMPATIBLE_BIT(0x00000010),
    VK_IMAGE_CREATE_ALIAS_BIT(0x00000400),
    VK_IMAGE_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT(0x00000040),
    VK_IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT(0x00000020),
    VK_IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT(0x00000080),
    VK_IMAGE_CREATE_EXTENDED_USAGE_BIT(0x00000100),
    VK_IMAGE_CREATE_PROTECTED_BIT(0x00000800),
    VK_IMAGE_CREATE_DISJOINT_BIT(0x00000200),
    VK_IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT(0x00001000),
    VK_IMAGE_CREATE_CORNER_SAMPLED_BIT_NV(0x00002000),
    VK_IMAGE_CREATE_SUBSAMPLED_BIT_EXT(0x00004000),
    VK_IMAGE_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT_KHR(VK_IMAGE_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT.valueOf()),
    VK_IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT_KHR(VK_IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT.valueOf()),
    VK_IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT_KHR(VK_IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT.valueOf()),
    VK_IMAGE_CREATE_EXTENDED_USAGE_BIT_KHR(VK_IMAGE_CREATE_EXTENDED_USAGE_BIT.valueOf()),
    VK_IMAGE_CREATE_DISJOINT_BIT_KHR(VK_IMAGE_CREATE_DISJOINT_BIT.valueOf()),
    VK_IMAGE_CREATE_ALIAS_BIT_KHR(VK_IMAGE_CREATE_ALIAS_BIT.valueOf()),
    VK_IMAGE_CREATE_FLAG_BITS_MAX_ENUM(0x7FFFFFFF);

    private int value;
    
    private VkImageCreateFlagBits(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
