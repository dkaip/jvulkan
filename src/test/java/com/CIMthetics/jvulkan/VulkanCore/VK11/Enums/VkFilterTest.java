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

class VkFilterTest
{
    @Test
    void testNumberOfElements()
    {
        VkFilter[] values = VkFilter.values();
        assertEquals(8, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }


    @Test
    void testValues()
    {
        assertEquals(0, VkFilter.VK_FILTER_NEAREST.valueOf(), VkFilter.VK_FILTER_NEAREST.toString() + " has an unexpected value.");
        assertEquals(1, VkFilter.VK_FILTER_LINEAR.valueOf(), VkFilter.VK_FILTER_LINEAR.toString() + " has an unexpected value.");
        assertEquals(1000015000, VkFilter.VK_FILTER_CUBIC_IMG.valueOf(), VkFilter.VK_FILTER_CUBIC_IMG.toString() + " has an unexpected value.");
        assertEquals(VkFilter.VK_FILTER_CUBIC_IMG.valueOf(), VkFilter.VK_FILTER_CUBIC_EXT.valueOf(), VkFilter.VK_FILTER_CUBIC_EXT.toString() + " has an unexpected value.");
        assertEquals(VkFilter.VK_FILTER_NEAREST.valueOf(), VkFilter.VK_FILTER_BEGIN_RANGE.valueOf(), VkFilter.VK_FILTER_BEGIN_RANGE.toString() + " has an unexpected value.");
        assertEquals(VkFilter.VK_FILTER_LINEAR.valueOf(), VkFilter.VK_FILTER_END_RANGE.valueOf(), VkFilter.VK_FILTER_END_RANGE.toString() + " has an unexpected value.");
        assertEquals((VkFilter.VK_FILTER_LINEAR.valueOf() - VkFilter.VK_FILTER_NEAREST.valueOf() + 1), VkFilter.VK_FILTER_RANGE_SIZE.valueOf(), VkFilter.VK_FILTER_RANGE_SIZE.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkFilter.VK_FILTER_MAX_ENUM.valueOf(), VkFilter.VK_FILTER_MAX_ENUM.toString() + " has an unexpected value.");
    }
}
