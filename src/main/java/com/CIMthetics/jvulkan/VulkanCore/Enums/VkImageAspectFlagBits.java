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

public enum VkImageAspectFlagBits
{
    VK_IMAGE_ASPECT_COLOR_BIT(0x00000001),
    VK_IMAGE_ASPECT_DEPTH_BIT(0x00000002),
    VK_IMAGE_ASPECT_STENCIL_BIT(0x00000004),
    VK_IMAGE_ASPECT_METADATA_BIT(0x00000008),
    VK_IMAGE_ASPECT_PLANE_0_BIT(0x00000010),
    VK_IMAGE_ASPECT_PLANE_1_BIT(0x00000020),
    VK_IMAGE_ASPECT_PLANE_2_BIT(0x00000040),
    VK_IMAGE_ASPECT_MEMORY_PLANE_0_BIT_EXT(0x00000080),
    VK_IMAGE_ASPECT_MEMORY_PLANE_1_BIT_EXT(0x00000100),
    VK_IMAGE_ASPECT_MEMORY_PLANE_2_BIT_EXT(0x00000200),
    VK_IMAGE_ASPECT_MEMORY_PLANE_3_BIT_EXT(0x00000400),
    VK_IMAGE_ASPECT_PLANE_0_BIT_KHR(VK_IMAGE_ASPECT_PLANE_0_BIT.valueOf()),
    VK_IMAGE_ASPECT_PLANE_1_BIT_KHR(VK_IMAGE_ASPECT_PLANE_1_BIT.valueOf()),
    VK_IMAGE_ASPECT_PLANE_2_BIT_KHR(VK_IMAGE_ASPECT_PLANE_2_BIT.valueOf()),
    VK_IMAGE_ASPECT_FLAG_BITS_MAX_ENUM(0x7FFFFFFF);

    private int value;
    
    private VkImageAspectFlagBits(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
