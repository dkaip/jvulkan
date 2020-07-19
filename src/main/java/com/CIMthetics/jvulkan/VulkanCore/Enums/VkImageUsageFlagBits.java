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

public enum VkImageUsageFlagBits
{
    VK_IMAGE_USAGE_TRANSFER_SRC_BIT(0x00000001),
    VK_IMAGE_USAGE_TRANSFER_DST_BIT(0x00000002),
    VK_IMAGE_USAGE_SAMPLED_BIT(0x00000004),
    VK_IMAGE_USAGE_STORAGE_BIT(0x00000008),
    VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT(0x00000010),
    VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT(0x00000020),
    VK_IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT(0x00000040),
    VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT(0x00000080),
    VK_IMAGE_USAGE_SHADING_RATE_IMAGE_BIT_NV(0x00000100),
    VK_IMAGE_USAGE_FRAGMENT_DENSITY_MAP_BIT_EXT(0x00000200),
    VK_IMAGE_USAGE_FLAG_BITS_MAX_ENUM(0x7FFFFFFF);

    private int value;
    
    private VkImageUsageFlagBits(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
