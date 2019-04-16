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
package com.CIMthetics.jvulkan.VulkanExtensions.VK11.Enums;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VkComponentTypeNVTest
{
    @Test
    void testNumberOfElements()
    {
        VkComponentTypeNV[] values = VkComponentTypeNV.values();
        assertEquals(15, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }


    @Test
    void testValues()
    {
        assertEquals(0, VkComponentTypeNV.VK_COMPONENT_TYPE_FLOAT16_NV.valueOf(), VkComponentTypeNV.VK_COMPONENT_TYPE_FLOAT16_NV.toString() + " has an unexpected value.");
        assertEquals(1, VkComponentTypeNV.VK_COMPONENT_TYPE_FLOAT32_NV.valueOf(), VkComponentTypeNV.VK_COMPONENT_TYPE_FLOAT32_NV.toString() + " has an unexpected value.");
        assertEquals(2, VkComponentTypeNV.VK_COMPONENT_TYPE_FLOAT64_NV.valueOf(), VkComponentTypeNV.VK_COMPONENT_TYPE_FLOAT64_NV.toString() + " has an unexpected value.");
        assertEquals(3, VkComponentTypeNV.VK_COMPONENT_TYPE_SINT8_NV.valueOf(), VkComponentTypeNV.VK_COMPONENT_TYPE_SINT8_NV.toString() + " has an unexpected value.");
        assertEquals(4, VkComponentTypeNV.VK_COMPONENT_TYPE_SINT16_NV.valueOf(), VkComponentTypeNV.VK_COMPONENT_TYPE_SINT16_NV.toString() + " has an unexpected value.");
        assertEquals(5, VkComponentTypeNV.VK_COMPONENT_TYPE_SINT32_NV.valueOf(), VkComponentTypeNV.VK_COMPONENT_TYPE_SINT32_NV.toString() + " has an unexpected value.");
        assertEquals(6, VkComponentTypeNV.VK_COMPONENT_TYPE_SINT64_NV.valueOf(), VkComponentTypeNV.VK_COMPONENT_TYPE_SINT64_NV.toString() + " has an unexpected value.");
        assertEquals(7, VkComponentTypeNV.VK_COMPONENT_TYPE_UINT8_NV.valueOf(), VkComponentTypeNV.VK_COMPONENT_TYPE_UINT8_NV.toString() + " has an unexpected value.");
        assertEquals(8, VkComponentTypeNV.VK_COMPONENT_TYPE_UINT16_NV.valueOf(), VkComponentTypeNV.VK_COMPONENT_TYPE_UINT16_NV.toString() + " has an unexpected value.");
        assertEquals(9, VkComponentTypeNV.VK_COMPONENT_TYPE_UINT32_NV.valueOf(), VkComponentTypeNV.VK_COMPONENT_TYPE_UINT32_NV.toString() + " has an unexpected value.");
        assertEquals(10, VkComponentTypeNV.VK_COMPONENT_TYPE_UINT64_NV.valueOf(), VkComponentTypeNV.VK_COMPONENT_TYPE_UINT64_NV.toString() + " has an unexpected value.");
        assertEquals(VkComponentTypeNV.VK_COMPONENT_TYPE_FLOAT16_NV.valueOf(), VkComponentTypeNV.VK_COMPONENT_TYPE_BEGIN_RANGE_NV.valueOf(), VkComponentTypeNV.VK_COMPONENT_TYPE_BEGIN_RANGE_NV.toString() + " has an unexpected value.");
        assertEquals(VkComponentTypeNV.VK_COMPONENT_TYPE_UINT64_NV.valueOf(), VkComponentTypeNV.VK_COMPONENT_TYPE_END_RANGE_NV.valueOf(), VkComponentTypeNV.VK_COMPONENT_TYPE_END_RANGE_NV.toString() + " has an unexpected value.");
        assertEquals(VkComponentTypeNV.VK_COMPONENT_TYPE_UINT64_NV.valueOf() - VkComponentTypeNV.VK_COMPONENT_TYPE_FLOAT16_NV.valueOf() + 1, VkComponentTypeNV.VK_COMPONENT_TYPE_RANGE_SIZE_NV.valueOf(), VkComponentTypeNV.VK_COMPONENT_TYPE_RANGE_SIZE_NV.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkComponentTypeNV.VK_COMPONENT_TYPE_MAX_ENUM_NV.valueOf(), VkComponentTypeNV.VK_COMPONENT_TYPE_MAX_ENUM_NV.toString() + " has an unexpected value.");
    }
}
