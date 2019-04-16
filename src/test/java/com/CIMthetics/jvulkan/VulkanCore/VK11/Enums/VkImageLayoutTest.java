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
package com.CIMthetics.jvulkan.VulkanCore.VK11.Enums;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VkImageLayoutTest
{
    @Test
    void testNumberOfElements()
    {
        VkImageLayout[] values = VkImageLayout.values();
        assertEquals(21, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }


    @Test
    void testValues()
    {
        assertEquals(0, VkImageLayout.VK_IMAGE_LAYOUT_UNDEFINED.valueOf(), VkImageLayout.VK_IMAGE_LAYOUT_UNDEFINED.toString() + " has an unexpected value.");
        assertEquals(1, VkImageLayout.VK_IMAGE_LAYOUT_GENERAL.valueOf(), VkImageLayout.VK_IMAGE_LAYOUT_GENERAL.toString() + " has an unexpected value.");
        assertEquals(2, VkImageLayout.VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL.valueOf(), VkImageLayout.VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL.toString() + " has an unexpected value.");
        assertEquals(3, VkImageLayout.VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL.valueOf(), VkImageLayout.VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL.toString() + " has an unexpected value.");
        assertEquals(4, VkImageLayout.VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL.valueOf(), VkImageLayout.VK_IMAGE_LAYOUT_DEPTH_STENCIL_READ_ONLY_OPTIMAL.toString() + " has an unexpected value.");
        assertEquals(5, VkImageLayout.VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL.valueOf(), VkImageLayout.VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL.toString() + " has an unexpected value.");
        assertEquals(6, VkImageLayout.VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL.valueOf(), VkImageLayout.VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL.toString() + " has an unexpected value.");
        assertEquals(7, VkImageLayout.VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL.valueOf(), VkImageLayout.VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL.toString() + " has an unexpected value.");
        assertEquals(8, VkImageLayout.VK_IMAGE_LAYOUT_PREINITIALIZED.valueOf(), VkImageLayout.VK_IMAGE_LAYOUT_PREINITIALIZED.toString() + " has an unexpected value.");
        assertEquals(1000117000, VkImageLayout.VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL.valueOf(), VkImageLayout.VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL.toString() + " has an unexpected value.");
        assertEquals(1000117001, VkImageLayout.VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL.valueOf(), VkImageLayout.VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL.toString() + " has an unexpected value.");
        assertEquals(1000001002, VkImageLayout.VK_IMAGE_LAYOUT_PRESENT_SRC_KHR.valueOf(), VkImageLayout.VK_IMAGE_LAYOUT_PRESENT_SRC_KHR.toString() + " has an unexpected value.");
        assertEquals(1000111000, VkImageLayout.VK_IMAGE_LAYOUT_SHARED_PRESENT_KHR.valueOf(), VkImageLayout.VK_IMAGE_LAYOUT_SHARED_PRESENT_KHR.toString() + " has an unexpected value.");
        assertEquals(1000164003, VkImageLayout.VK_IMAGE_LAYOUT_SHADING_RATE_OPTIMAL_NV.valueOf(), VkImageLayout.VK_IMAGE_LAYOUT_SHADING_RATE_OPTIMAL_NV.toString() + " has an unexpected value.");
        assertEquals(1000218000, VkImageLayout.VK_IMAGE_LAYOUT_FRAGMENT_DENSITY_MAP_OPTIMAL_EXT.valueOf(), VkImageLayout.VK_IMAGE_LAYOUT_FRAGMENT_DENSITY_MAP_OPTIMAL_EXT.toString() + " has an unexpected value.");
        assertEquals(VkImageLayout.VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL.valueOf(), VkImageLayout.VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL_KHR.valueOf(), VkImageLayout.VK_IMAGE_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_OPTIMAL_KHR.toString() + " has an unexpected value.");
        assertEquals(VkImageLayout.VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL.valueOf(), VkImageLayout.VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL_KHR.valueOf(), VkImageLayout.VK_IMAGE_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_OPTIMAL_KHR.toString() + " has an unexpected value.");
        assertEquals(VkImageLayout.VK_IMAGE_LAYOUT_UNDEFINED.valueOf(), VkImageLayout.VK_IMAGE_LAYOUT_BEGIN_RANGE.valueOf(), VkImageLayout.VK_IMAGE_LAYOUT_BEGIN_RANGE.toString() + " has an unexpected value.");
        assertEquals(VkImageLayout.VK_IMAGE_LAYOUT_PREINITIALIZED.valueOf(), VkImageLayout.VK_IMAGE_LAYOUT_END_RANGE.valueOf(), VkImageLayout.VK_IMAGE_LAYOUT_END_RANGE.toString() + " has an unexpected value.");
        assertEquals((VkImageLayout.VK_IMAGE_LAYOUT_PREINITIALIZED.valueOf() - VkImageLayout.VK_IMAGE_LAYOUT_UNDEFINED.valueOf() + 1), VkImageLayout.VK_IMAGE_LAYOUT_RANGE_SIZE.valueOf(), VkImageLayout.VK_IMAGE_LAYOUT_RANGE_SIZE.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkImageLayout.VK_IMAGE_LAYOUT_MAX_ENUM.valueOf(), VkImageLayout.VK_IMAGE_LAYOUT_MAX_ENUM.toString() + " has an unexpected value.");
    }
}
