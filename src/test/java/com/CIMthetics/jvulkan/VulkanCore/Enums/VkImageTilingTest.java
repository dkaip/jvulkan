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

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkImageTiling;

class VkImageTilingTest
{
    @Test
    void testNumberOfElements()
    {
        VkImageTiling[] values = VkImageTiling.values();
        assertEquals(7, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }


    @Test
    void testValues()
    {
        assertEquals(0, VkImageTiling.VK_IMAGE_TILING_OPTIMAL.valueOf(), VkImageTiling.VK_IMAGE_TILING_OPTIMAL.toString() + " has an unexpected value.");
        assertEquals(1, VkImageTiling.VK_IMAGE_TILING_LINEAR.valueOf(), VkImageTiling.VK_IMAGE_TILING_LINEAR.toString() + " has an unexpected value.");
        assertEquals(1000158000, VkImageTiling.VK_IMAGE_TILING_DRM_FORMAT_MODIFIER_EXT.valueOf(), VkImageTiling.VK_IMAGE_TILING_DRM_FORMAT_MODIFIER_EXT.toString() + " has an unexpected value.");
        assertEquals(VkImageTiling.VK_IMAGE_TILING_OPTIMAL.valueOf(), VkImageTiling.VK_IMAGE_TILING_BEGIN_RANGE.valueOf(), VkImageTiling.VK_IMAGE_TILING_BEGIN_RANGE.toString() + " has an unexpected value.");
        assertEquals(VkImageTiling.VK_IMAGE_TILING_LINEAR.valueOf(), VkImageTiling.VK_IMAGE_TILING_END_RANGE.valueOf(), VkImageTiling.VK_IMAGE_TILING_END_RANGE.toString() + " has an unexpected value.");
        assertEquals(VkImageTiling.VK_IMAGE_TILING_LINEAR.valueOf() - VkImageTiling.VK_IMAGE_TILING_OPTIMAL.valueOf() + 1, VkImageTiling.VK_IMAGE_TILING_RANGE_SIZE.valueOf(), VkImageTiling.VK_IMAGE_TILING_RANGE_SIZE.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkImageTiling.VK_IMAGE_TILING_MAX_ENUM.valueOf(), VkImageTiling.VK_IMAGE_TILING_MAX_ENUM.toString() + " has an unexpected value.");
    }
}
