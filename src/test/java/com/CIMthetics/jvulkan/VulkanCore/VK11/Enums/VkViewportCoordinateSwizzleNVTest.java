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

import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Enums.VkViewportCoordinateSwizzleNV;

class VkViewportCoordinateSwizzleNVTest
{
    @Test
    void testNumberOfElements()
    {
        VkViewportCoordinateSwizzleNV[] values = VkViewportCoordinateSwizzleNV.values();
        assertEquals(12, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }


    @Test
    void testValues()
    {
        assertEquals(0, VkViewportCoordinateSwizzleNV.VK_VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_X_NV.valueOf(), VkViewportCoordinateSwizzleNV.VK_VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_X_NV.toString() + " has an unexpected value.");
        assertEquals(1, VkViewportCoordinateSwizzleNV.VK_VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_X_NV.valueOf(), VkViewportCoordinateSwizzleNV.VK_VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_X_NV.toString() + " has an unexpected value.");
        assertEquals(2, VkViewportCoordinateSwizzleNV.VK_VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_Y_NV.valueOf(), VkViewportCoordinateSwizzleNV.VK_VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_Y_NV.toString() + " has an unexpected value.");
        assertEquals(3, VkViewportCoordinateSwizzleNV.VK_VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_Y_NV.valueOf(), VkViewportCoordinateSwizzleNV.VK_VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_Y_NV.toString() + " has an unexpected value.");
        assertEquals(4, VkViewportCoordinateSwizzleNV.VK_VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_Z_NV.valueOf(), VkViewportCoordinateSwizzleNV.VK_VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_Z_NV.toString() + " has an unexpected value.");
        assertEquals(5, VkViewportCoordinateSwizzleNV.VK_VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_Z_NV.valueOf(), VkViewportCoordinateSwizzleNV.VK_VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_Z_NV.toString() + " has an unexpected value.");
        assertEquals(6, VkViewportCoordinateSwizzleNV.VK_VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_W_NV.valueOf(), VkViewportCoordinateSwizzleNV.VK_VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_W_NV.toString() + " has an unexpected value.");
        assertEquals(7, VkViewportCoordinateSwizzleNV.VK_VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_W_NV.valueOf(), VkViewportCoordinateSwizzleNV.VK_VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_W_NV.toString() + " has an unexpected value.");
        assertEquals(VkViewportCoordinateSwizzleNV.VK_VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_X_NV.valueOf(), VkViewportCoordinateSwizzleNV.VK_VIEWPORT_COORDINATE_SWIZZLE_BEGIN_RANGE_NV.valueOf(), VkViewportCoordinateSwizzleNV.VK_VIEWPORT_COORDINATE_SWIZZLE_BEGIN_RANGE_NV.toString() + " has an unexpected value.");
        assertEquals(VkViewportCoordinateSwizzleNV.VK_VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_W_NV.valueOf(), VkViewportCoordinateSwizzleNV.VK_VIEWPORT_COORDINATE_SWIZZLE_END_RANGE_NV.valueOf(), VkViewportCoordinateSwizzleNV.VK_VIEWPORT_COORDINATE_SWIZZLE_END_RANGE_NV.toString() + " has an unexpected value.");
        assertEquals((VkViewportCoordinateSwizzleNV.VK_VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_W_NV.valueOf() - VkViewportCoordinateSwizzleNV.VK_VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_X_NV.valueOf() + 1), VkViewportCoordinateSwizzleNV.VK_VIEWPORT_COORDINATE_SWIZZLE_RANGE_SIZE_NV.valueOf(), VkViewportCoordinateSwizzleNV.VK_VIEWPORT_COORDINATE_SWIZZLE_RANGE_SIZE_NV.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkViewportCoordinateSwizzleNV.VK_VIEWPORT_COORDINATE_SWIZZLE_MAX_ENUM_NV.valueOf(), VkViewportCoordinateSwizzleNV.VK_VIEWPORT_COORDINATE_SWIZZLE_MAX_ENUM_NV.toString() + " has an unexpected value.");
    }
}
