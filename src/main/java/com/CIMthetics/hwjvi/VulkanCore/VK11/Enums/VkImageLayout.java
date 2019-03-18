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

public enum VkImageLayout
{
    VK_IMAGE_LAYOUT_UNDEFINED(0),
    VK_IMAGE_LAYOUT_GENERAL(1),
    VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL(2),
    VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL(3),
    VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL(4),
    VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL(5),
    VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL(6),
    VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL(7),
    VK_IMAGE_LAYOUT_PREINITIALIZED(8),
    VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL(1000117000),
    VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL(1000117001),
    VK_IMAGE_LAYOUT_PRESENT_SRC_KHR(1000001002),
    VK_IMAGE_LAYOUT_SHARED_PRESENT_KHR(1000111000),
    VK_IMAGE_LAYOUT_SHADING_RATE_OPTIMAL_NV(1000164003),
    VK_IMAGE_LAYOUT_FRAGMENT_DENSITY_MAP_OPTIMAL_EXT(1000218000),
    VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL_KHR(VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL.valueOf()),
    VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL_KHR(VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL.valueOf()),
    VK_IMAGE_LAYOUT_BEGIN_RANGE(VK_IMAGE_LAYOUT_UNDEFINED.valueOf()),
    VK_IMAGE_LAYOUT_END_RANGE(VK_IMAGE_LAYOUT_PREINITIALIZED.valueOf()),
    VK_IMAGE_LAYOUT_RANGE_SIZE((VK_IMAGE_LAYOUT_PREINITIALIZED.valueOf() - VK_IMAGE_LAYOUT_UNDEFINED.valueOf() + 1)),
    VK_IMAGE_LAYOUT_MAX_ENUM(0x7FFFFFFF);

    private int value;
    
    private VkImageLayout(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
