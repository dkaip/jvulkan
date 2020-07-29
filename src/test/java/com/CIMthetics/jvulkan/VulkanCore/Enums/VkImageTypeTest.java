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

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkImageType;

class VkImageTypeTest
{
    @Test
    void testNumberOfElements()
    {
        VkImageType[] values = VkImageType.values();
        assertEquals(7, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }


    @Test
    void testValues()
    {
        assertEquals(0, VkImageType.VK_IMAGE_TYPE_1D.valueOf(), VkImageType.VK_IMAGE_TYPE_1D.toString() + " has an unexpected value.");
        assertEquals(1, VkImageType.VK_IMAGE_TYPE_2D.valueOf(), VkImageType.VK_IMAGE_TYPE_2D.toString() + " has an unexpected value.");
        assertEquals(2, VkImageType.VK_IMAGE_TYPE_3D.valueOf(), VkImageType.VK_IMAGE_TYPE_3D.toString() + " has an unexpected value.");
        assertEquals(VkImageType.VK_IMAGE_TYPE_1D.valueOf(), VkImageType.VK_IMAGE_TYPE_BEGIN_RANGE.valueOf(), VkImageType.VK_IMAGE_TYPE_BEGIN_RANGE.toString() + " has an unexpected value.");
        assertEquals(VkImageType.VK_IMAGE_TYPE_3D.valueOf(), VkImageType.VK_IMAGE_TYPE_END_RANGE.valueOf(), VkImageType.VK_IMAGE_TYPE_END_RANGE.toString() + " has an unexpected value.");
        assertEquals(VkImageType.VK_IMAGE_TYPE_3D.valueOf() - VkImageType.VK_IMAGE_TYPE_1D.valueOf() + 1, VkImageType.VK_IMAGE_TYPE_RANGE_SIZE.valueOf(), VkImageType.VK_IMAGE_TYPE_RANGE_SIZE.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkImageType.VK_IMAGE_TYPE_MAX_ENUM.valueOf(), VkImageType.VK_IMAGE_TYPE_MAX_ENUM.toString() + " has an unexpected value.");
    }
}
