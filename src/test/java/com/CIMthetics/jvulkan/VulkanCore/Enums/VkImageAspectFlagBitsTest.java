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

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkImageAspectFlagBits;

class VkImageAspectFlagBitsTest
{
    @Test
    void testNumberOfElements()
    {
        VkImageAspectFlagBits[] values = VkImageAspectFlagBits.values();
        assertEquals(15, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }


    @Test
    void testValues()
    {
        assertEquals(0x00000001, VkImageAspectFlagBits.VK_IMAGE_ASPECT_COLOR_BIT.valueOf(), VkImageAspectFlagBits.VK_IMAGE_ASPECT_COLOR_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000002, VkImageAspectFlagBits.VK_IMAGE_ASPECT_DEPTH_BIT.valueOf(), VkImageAspectFlagBits.VK_IMAGE_ASPECT_DEPTH_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000004, VkImageAspectFlagBits.VK_IMAGE_ASPECT_STENCIL_BIT.valueOf(), VkImageAspectFlagBits.VK_IMAGE_ASPECT_STENCIL_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000008, VkImageAspectFlagBits.VK_IMAGE_ASPECT_METADATA_BIT.valueOf(), VkImageAspectFlagBits.VK_IMAGE_ASPECT_METADATA_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000010, VkImageAspectFlagBits.VK_IMAGE_ASPECT_PLANE_0_BIT.valueOf(), VkImageAspectFlagBits.VK_IMAGE_ASPECT_PLANE_0_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000020, VkImageAspectFlagBits.VK_IMAGE_ASPECT_PLANE_1_BIT.valueOf(), VkImageAspectFlagBits.VK_IMAGE_ASPECT_PLANE_1_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000040, VkImageAspectFlagBits.VK_IMAGE_ASPECT_PLANE_2_BIT.valueOf(), VkImageAspectFlagBits.VK_IMAGE_ASPECT_PLANE_2_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000080, VkImageAspectFlagBits.VK_IMAGE_ASPECT_MEMORY_PLANE_0_BIT_EXT.valueOf(), VkImageAspectFlagBits.VK_IMAGE_ASPECT_MEMORY_PLANE_0_BIT_EXT.toString() + " has an unexpected value.");
        assertEquals(0x00000100, VkImageAspectFlagBits.VK_IMAGE_ASPECT_MEMORY_PLANE_1_BIT_EXT.valueOf(), VkImageAspectFlagBits.VK_IMAGE_ASPECT_MEMORY_PLANE_1_BIT_EXT.toString() + " has an unexpected value.");
        assertEquals(0x00000200, VkImageAspectFlagBits.VK_IMAGE_ASPECT_MEMORY_PLANE_2_BIT_EXT.valueOf(), VkImageAspectFlagBits.VK_IMAGE_ASPECT_MEMORY_PLANE_2_BIT_EXT.toString() + " has an unexpected value.");
        assertEquals(0x00000400, VkImageAspectFlagBits.VK_IMAGE_ASPECT_MEMORY_PLANE_3_BIT_EXT.valueOf(), VkImageAspectFlagBits.VK_IMAGE_ASPECT_MEMORY_PLANE_3_BIT_EXT.toString() + " has an unexpected value.");
        assertEquals(VkImageAspectFlagBits.VK_IMAGE_ASPECT_PLANE_0_BIT.valueOf(), VkImageAspectFlagBits.VK_IMAGE_ASPECT_PLANE_0_BIT_KHR.valueOf(), VkImageAspectFlagBits.VK_IMAGE_ASPECT_PLANE_0_BIT_KHR.toString() + " has an unexpected value.");
        assertEquals(VkImageAspectFlagBits.VK_IMAGE_ASPECT_PLANE_1_BIT.valueOf(), VkImageAspectFlagBits.VK_IMAGE_ASPECT_PLANE_1_BIT_KHR.valueOf(), VkImageAspectFlagBits.VK_IMAGE_ASPECT_PLANE_1_BIT_KHR.toString() + " has an unexpected value.");
        assertEquals(VkImageAspectFlagBits.VK_IMAGE_ASPECT_PLANE_2_BIT.valueOf(), VkImageAspectFlagBits.VK_IMAGE_ASPECT_PLANE_2_BIT_KHR.valueOf(), VkImageAspectFlagBits.VK_IMAGE_ASPECT_PLANE_2_BIT_KHR.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkImageAspectFlagBits.VK_IMAGE_ASPECT_FLAG_BITS_MAX_ENUM.valueOf(), VkImageAspectFlagBits.VK_IMAGE_ASPECT_FLAG_BITS_MAX_ENUM.toString() + " has an unexpected value.");
    }
}
