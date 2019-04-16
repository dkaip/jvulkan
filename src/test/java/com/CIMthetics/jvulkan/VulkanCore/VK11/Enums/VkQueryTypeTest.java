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

class VkQueryTypeTest
{
    @Test
    void testNumberOfElements()
    {
        VkQueryType[] values = VkQueryType.values();
        assertEquals(9, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }


    @Test
    void testValues()
    {
        assertEquals(0, VkQueryType.VK_QUERY_TYPE_OCCLUSION.valueOf(), VkQueryType.VK_QUERY_TYPE_OCCLUSION.toString() + " has an unexpected value.");
        assertEquals(1, VkQueryType.VK_QUERY_TYPE_PIPELINE_STATISTICS.valueOf(), VkQueryType.VK_QUERY_TYPE_PIPELINE_STATISTICS.toString() + " has an unexpected value.");
        assertEquals(2, VkQueryType.VK_QUERY_TYPE_TIMESTAMP.valueOf(), VkQueryType.VK_QUERY_TYPE_TIMESTAMP.toString() + " has an unexpected value.");
        assertEquals(1000028004, VkQueryType.VK_QUERY_TYPE_TRANSFORM_FEEDBACK_STREAM_EXT.valueOf(), VkQueryType.VK_QUERY_TYPE_TRANSFORM_FEEDBACK_STREAM_EXT.toString() + " has an unexpected value.");
        assertEquals(1000165000, VkQueryType.VK_QUERY_TYPE_ACCELERATION_STRUCTURE_COMPACTED_SIZE_NV.valueOf(), VkQueryType.VK_QUERY_TYPE_ACCELERATION_STRUCTURE_COMPACTED_SIZE_NV.toString() + " has an unexpected value.");
        assertEquals(VkQueryType.VK_QUERY_TYPE_OCCLUSION.valueOf(), VkQueryType.VK_QUERY_TYPE_BEGIN_RANGE.valueOf(), VkQueryType.VK_QUERY_TYPE_BEGIN_RANGE.toString() + " has an unexpected value.");
        assertEquals(VkQueryType.VK_QUERY_TYPE_TIMESTAMP.valueOf(), VkQueryType.VK_QUERY_TYPE_END_RANGE.valueOf(), VkQueryType.VK_QUERY_TYPE_END_RANGE.toString() + " has an unexpected value.");
        assertEquals((VkQueryType.VK_QUERY_TYPE_TIMESTAMP.valueOf() - VkQueryType.VK_QUERY_TYPE_OCCLUSION.valueOf() + 1), VkQueryType.VK_QUERY_TYPE_RANGE_SIZE.valueOf(), VkQueryType.VK_QUERY_TYPE_RANGE_SIZE.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkQueryType.VK_QUERY_TYPE_MAX_ENUM.valueOf(), VkQueryType.VK_QUERY_TYPE_MAX_ENUM.toString() + " has an unexpected value.");
    }
}
