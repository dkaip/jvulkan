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

class VkImageUsageFlagBitsTest
{
    @Test
    void testNumberOfElements()
    {
        VkImageUsageFlagBits[] values = VkImageUsageFlagBits.values();
        assertEquals(11, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }


    @Test
    void testValues()
    {
        assertEquals(0x00000001, VkImageUsageFlagBits.VK_IMAGE_USAGE_TRANSFER_SRC_BIT.valueOf(), VkImageUsageFlagBits.VK_IMAGE_USAGE_TRANSFER_SRC_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000002, VkImageUsageFlagBits.VK_IMAGE_USAGE_TRANSFER_DST_BIT.valueOf(), VkImageUsageFlagBits.VK_IMAGE_USAGE_TRANSFER_DST_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000004, VkImageUsageFlagBits.VK_IMAGE_USAGE_SAMPLED_BIT.valueOf(), VkImageUsageFlagBits.VK_IMAGE_USAGE_SAMPLED_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000008, VkImageUsageFlagBits.VK_IMAGE_USAGE_STORAGE_BIT.valueOf(), VkImageUsageFlagBits.VK_IMAGE_USAGE_STORAGE_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000010, VkImageUsageFlagBits.VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT.valueOf(), VkImageUsageFlagBits.VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000020, VkImageUsageFlagBits.VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT.valueOf(), VkImageUsageFlagBits.VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000040, VkImageUsageFlagBits.VK_IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT.valueOf(), VkImageUsageFlagBits.VK_IMAGE_USAGE_TRANSIENT_ATTACHMENT_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000080, VkImageUsageFlagBits.VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT.valueOf(), VkImageUsageFlagBits.VK_IMAGE_USAGE_INPUT_ATTACHMENT_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000100, VkImageUsageFlagBits.VK_IMAGE_USAGE_SHADING_RATE_IMAGE_BIT_NV.valueOf(), VkImageUsageFlagBits.VK_IMAGE_USAGE_SHADING_RATE_IMAGE_BIT_NV.toString() + " has an unexpected value.");
        assertEquals(0x00000200, VkImageUsageFlagBits.VK_IMAGE_USAGE_FRAGMENT_DENSITY_MAP_BIT_EXT.valueOf(), VkImageUsageFlagBits.VK_IMAGE_USAGE_FRAGMENT_DENSITY_MAP_BIT_EXT.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkImageUsageFlagBits.VK_IMAGE_USAGE_FLAG_BITS_MAX_ENUM.valueOf(), VkImageUsageFlagBits.VK_IMAGE_USAGE_FLAG_BITS_MAX_ENUM.toString() + " has an unexpected value.");
    }
}
