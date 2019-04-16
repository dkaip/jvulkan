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

class VkPrimitiveTopologyTest
{
    @Test
    void testNumberOfElements()
    {
        VkPrimitiveTopology[] values = VkPrimitiveTopology.values();
        assertEquals(15, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }


    @Test
    void testValues()
    {
        assertEquals(0, VkPrimitiveTopology.VK_PRIMITIVE_TOPOLOGY_POINT_LIST.valueOf(), VkPrimitiveTopology.VK_PRIMITIVE_TOPOLOGY_POINT_LIST.toString() + " has an unexpected value.");
        assertEquals(1, VkPrimitiveTopology.VK_PRIMITIVE_TOPOLOGY_LINE_LIST.valueOf(), VkPrimitiveTopology.VK_PRIMITIVE_TOPOLOGY_LINE_LIST.toString() + " has an unexpected value.");
        assertEquals(2, VkPrimitiveTopology.VK_PRIMITIVE_TOPOLOGY_LINE_STRIP.valueOf(), VkPrimitiveTopology.VK_PRIMITIVE_TOPOLOGY_LINE_STRIP.toString() + " has an unexpected value.");
        assertEquals(3, VkPrimitiveTopology.VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST.valueOf(), VkPrimitiveTopology.VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST.toString() + " has an unexpected value.");
        assertEquals(4, VkPrimitiveTopology.VK_PRIMITIVE_TOPOLOGY_TRIANGLE_STRIP.valueOf(), VkPrimitiveTopology.VK_PRIMITIVE_TOPOLOGY_TRIANGLE_STRIP.toString() + " has an unexpected value.");
        assertEquals(5, VkPrimitiveTopology.VK_PRIMITIVE_TOPOLOGY_TRIANGLE_FAN.valueOf(), VkPrimitiveTopology.VK_PRIMITIVE_TOPOLOGY_TRIANGLE_FAN.toString() + " has an unexpected value.");
        assertEquals(6, VkPrimitiveTopology.VK_PRIMITIVE_TOPOLOGY_LINE_LIST_WITH_ADJACENCY.valueOf(), VkPrimitiveTopology.VK_PRIMITIVE_TOPOLOGY_LINE_LIST_WITH_ADJACENCY.toString() + " has an unexpected value.");
        assertEquals(7, VkPrimitiveTopology.VK_PRIMITIVE_TOPOLOGY_LINE_STRIP_WITH_ADJACENCY.valueOf(), VkPrimitiveTopology.VK_PRIMITIVE_TOPOLOGY_LINE_STRIP_WITH_ADJACENCY.toString() + " has an unexpected value.");
        assertEquals(8, VkPrimitiveTopology.VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST_WITH_ADJACENCY.valueOf(), VkPrimitiveTopology.VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST_WITH_ADJACENCY.toString() + " has an unexpected value.");
        assertEquals(9, VkPrimitiveTopology.VK_PRIMITIVE_TOPOLOGY_TRIANGLE_STRIP_WITH_ADJACENCY.valueOf(), VkPrimitiveTopology.VK_PRIMITIVE_TOPOLOGY_TRIANGLE_STRIP_WITH_ADJACENCY.toString() + " has an unexpected value.");
        assertEquals(10, VkPrimitiveTopology.VK_PRIMITIVE_TOPOLOGY_PATCH_LIST.valueOf(), VkPrimitiveTopology.VK_PRIMITIVE_TOPOLOGY_PATCH_LIST.toString() + " has an unexpected value.");
        assertEquals(VkPrimitiveTopology.VK_PRIMITIVE_TOPOLOGY_POINT_LIST.valueOf(), VkPrimitiveTopology.VK_PRIMITIVE_TOPOLOGY_BEGIN_RANGE.valueOf(), VkPrimitiveTopology.VK_PRIMITIVE_TOPOLOGY_BEGIN_RANGE.toString() + " has an unexpected value.");
        assertEquals(VkPrimitiveTopology.VK_PRIMITIVE_TOPOLOGY_PATCH_LIST.valueOf(), VkPrimitiveTopology.VK_PRIMITIVE_TOPOLOGY_END_RANGE.valueOf(), VkPrimitiveTopology.VK_PRIMITIVE_TOPOLOGY_END_RANGE.toString() + " has an unexpected value.");
        assertEquals((VkPrimitiveTopology.VK_PRIMITIVE_TOPOLOGY_PATCH_LIST.valueOf() - VkPrimitiveTopology.VK_PRIMITIVE_TOPOLOGY_POINT_LIST.valueOf() + 1), VkPrimitiveTopology.VK_PRIMITIVE_TOPOLOGY_RANGE_SIZE.valueOf(), VkPrimitiveTopology.VK_PRIMITIVE_TOPOLOGY_RANGE_SIZE.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkPrimitiveTopology.VK_PRIMITIVE_TOPOLOGY_MAX_ENUM.valueOf(), VkPrimitiveTopology.VK_PRIMITIVE_TOPOLOGY_MAX_ENUM.toString() + " has an unexpected value.");
    }
}
