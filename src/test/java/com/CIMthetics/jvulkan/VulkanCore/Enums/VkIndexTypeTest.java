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

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkIndexType;

class VkIndexTypeTest
{
    @Test
    void testNumberOfElements()
    {
        VkIndexType[] values = VkIndexType.values();
        assertEquals(7, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }


    @Test
    void testValues()
    {
        assertEquals(0, VkIndexType.VK_INDEX_TYPE_UINT16.valueOf(), VkIndexType.VK_INDEX_TYPE_UINT16.toString() + " has an unexpected value.");
        assertEquals(1, VkIndexType.VK_INDEX_TYPE_UINT32.valueOf(), VkIndexType.VK_INDEX_TYPE_UINT32.toString() + " has an unexpected value.");
        assertEquals(1000165000, VkIndexType.VK_INDEX_TYPE_NONE_NV.valueOf(), VkIndexType.VK_INDEX_TYPE_NONE_NV.toString() + " has an unexpected value.");
        assertEquals(VkIndexType.VK_INDEX_TYPE_UINT16.valueOf(), VkIndexType.VK_INDEX_TYPE_BEGIN_RANGE.valueOf(), VkIndexType.VK_INDEX_TYPE_BEGIN_RANGE.toString() + " has an unexpected value.");
        assertEquals(VkIndexType.VK_INDEX_TYPE_UINT32.valueOf(), VkIndexType.VK_INDEX_TYPE_END_RANGE.valueOf(), VkIndexType.VK_INDEX_TYPE_END_RANGE.toString() + " has an unexpected value.");
        assertEquals((VkIndexType.VK_INDEX_TYPE_UINT32.valueOf() - VkIndexType.VK_INDEX_TYPE_UINT16.valueOf() + 1), VkIndexType.VK_INDEX_TYPE_RANGE_SIZE.valueOf(), VkIndexType.VK_INDEX_TYPE_RANGE_SIZE.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkIndexType.VK_INDEX_TYPE_MAX_ENUM.valueOf(), VkIndexType.VK_INDEX_TYPE_MAX_ENUM.toString() + " has an unexpected value.");
    }
}
