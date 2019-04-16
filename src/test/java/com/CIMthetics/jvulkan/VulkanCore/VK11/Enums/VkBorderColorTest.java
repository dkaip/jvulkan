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

class VkBorderColorTest
{
    @Test
    void testNumberOfElements()
    {
        VkBorderColor[] values = VkBorderColor.values();
        assertEquals(10, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }


    @Test
    void testValues()
    {
        assertEquals(0, VkBorderColor.VK_BORDER_COLOR_FLOAT_TRANSPARENT_BLACK.valueOf(), VkBorderColor.VK_BORDER_COLOR_FLOAT_TRANSPARENT_BLACK.toString() + " has an unexpected value.");
        assertEquals(1, VkBorderColor.VK_BORDER_COLOR_INT_TRANSPARENT_BLACK.valueOf(), VkBorderColor.VK_BORDER_COLOR_INT_TRANSPARENT_BLACK.toString() + " has an unexpected value.");
        assertEquals(2, VkBorderColor.VK_BORDER_COLOR_FLOAT_OPAQUE_BLACK.valueOf(), VkBorderColor.VK_BORDER_COLOR_FLOAT_OPAQUE_BLACK.toString() + " has an unexpected value.");
        assertEquals(3, VkBorderColor.VK_BORDER_COLOR_INT_OPAQUE_BLACK.valueOf(), VkBorderColor.VK_BORDER_COLOR_INT_OPAQUE_BLACK.toString() + " has an unexpected value.");
        assertEquals(4, VkBorderColor.VK_BORDER_COLOR_FLOAT_OPAQUE_WHITE.valueOf(), VkBorderColor.VK_BORDER_COLOR_FLOAT_OPAQUE_WHITE.toString() + " has an unexpected value.");
        assertEquals(5, VkBorderColor.VK_BORDER_COLOR_INT_OPAQUE_WHITE.valueOf(), VkBorderColor.VK_BORDER_COLOR_INT_OPAQUE_WHITE.toString() + " has an unexpected value.");
        assertEquals(VkBorderColor.VK_BORDER_COLOR_FLOAT_TRANSPARENT_BLACK.valueOf(), VkBorderColor.VK_BORDER_COLOR_BEGIN_RANGE.valueOf(), VkBorderColor.VK_BORDER_COLOR_BEGIN_RANGE.toString() + " has an unexpected value.");
        assertEquals(VkBorderColor.VK_BORDER_COLOR_INT_OPAQUE_WHITE.valueOf(), VkBorderColor.VK_BORDER_COLOR_END_RANGE.valueOf(), VkBorderColor.VK_BORDER_COLOR_END_RANGE.toString() + " has an unexpected value.");
        assertEquals((VkBorderColor.VK_BORDER_COLOR_INT_OPAQUE_WHITE.valueOf() - VkBorderColor.VK_BORDER_COLOR_FLOAT_TRANSPARENT_BLACK.valueOf() + 1), VkBorderColor.VK_BORDER_COLOR_RANGE_SIZE.valueOf(), VkBorderColor.VK_BORDER_COLOR_RANGE_SIZE.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkBorderColor.VK_BORDER_COLOR_MAX_ENUM.valueOf(), VkBorderColor.VK_BORDER_COLOR_MAX_ENUM.toString() + " has an unexpected value.");
    }
}
