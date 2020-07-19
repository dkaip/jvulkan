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

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkImageViewType;

class VkImageViewTypeTest
{
    @Test
    void testNumberOfElements()
    {
        VkImageViewType[] values = VkImageViewType.values();
        assertEquals(11, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }


    @Test
    void testValues()
    {
        assertEquals(0, VkImageViewType.VK_IMAGE_VIEW_TYPE_1D.valueOf(), VkImageViewType.VK_IMAGE_VIEW_TYPE_1D.toString() + " has an unexpected value.");
        assertEquals(1, VkImageViewType.VK_IMAGE_VIEW_TYPE_2D.valueOf(), VkImageViewType.VK_IMAGE_VIEW_TYPE_2D.toString() + " has an unexpected value.");
        assertEquals(2, VkImageViewType.VK_IMAGE_VIEW_TYPE_3D.valueOf(), VkImageViewType.VK_IMAGE_VIEW_TYPE_3D.toString() + " has an unexpected value.");
        assertEquals(3, VkImageViewType.VK_IMAGE_VIEW_TYPE_CUBE.valueOf(), VkImageViewType.VK_IMAGE_VIEW_TYPE_CUBE.toString() + " has an unexpected value.");
        assertEquals(4, VkImageViewType.VK_IMAGE_VIEW_TYPE_1D_ARRAY.valueOf(), VkImageViewType.VK_IMAGE_VIEW_TYPE_1D_ARRAY.toString() + " has an unexpected value.");
        assertEquals(5, VkImageViewType.VK_IMAGE_VIEW_TYPE_2D_ARRAY.valueOf(), VkImageViewType.VK_IMAGE_VIEW_TYPE_2D_ARRAY.toString() + " has an unexpected value.");
        assertEquals(6, VkImageViewType.VK_IMAGE_VIEW_TYPE_CUBE_ARRAY.valueOf(), VkImageViewType.VK_IMAGE_VIEW_TYPE_CUBE_ARRAY.toString() + " has an unexpected value.");
        assertEquals(VkImageViewType.VK_IMAGE_VIEW_TYPE_1D.valueOf(), VkImageViewType.VK_IMAGE_VIEW_TYPE_BEGIN_RANGE.valueOf(), VkImageViewType.VK_IMAGE_VIEW_TYPE_BEGIN_RANGE.toString() + " has an unexpected value.");
        assertEquals(VkImageViewType.VK_IMAGE_VIEW_TYPE_CUBE_ARRAY.valueOf(), VkImageViewType.VK_IMAGE_VIEW_TYPE_END_RANGE.valueOf(), VkImageViewType.VK_IMAGE_VIEW_TYPE_END_RANGE.toString() + " has an unexpected value.");
        assertEquals((VkImageViewType.VK_IMAGE_VIEW_TYPE_CUBE_ARRAY.valueOf() - VkImageViewType.VK_IMAGE_VIEW_TYPE_1D.valueOf() + 1), VkImageViewType.VK_IMAGE_VIEW_TYPE_RANGE_SIZE.valueOf(), VkImageViewType.VK_IMAGE_VIEW_TYPE_RANGE_SIZE.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkImageViewType.VK_IMAGE_VIEW_TYPE_MAX_ENUM.valueOf(), VkImageViewType.VK_IMAGE_VIEW_TYPE_MAX_ENUM.toString() + " has an unexpected value.");
    }
}
