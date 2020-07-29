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

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkQueryPipelineStatisticFlagBits;

class VkQueryPipelineStatisticFlagBitsTest
{
    @Test
    void testNumberOfElements()
    {
        VkQueryPipelineStatisticFlagBits[] values = VkQueryPipelineStatisticFlagBits.values();
        assertEquals(12, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }


    @Test
    void testValues()
    {
        assertEquals(0x00000001, VkQueryPipelineStatisticFlagBits.VK_QUERY_PIPELINE_STATISTIC_INPUT_ASSEMBLY_VERTICES_BIT.valueOf(), VkQueryPipelineStatisticFlagBits.VK_QUERY_PIPELINE_STATISTIC_INPUT_ASSEMBLY_VERTICES_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000002, VkQueryPipelineStatisticFlagBits.VK_QUERY_PIPELINE_STATISTIC_INPUT_ASSEMBLY_PRIMITIVES_BIT.valueOf(), VkQueryPipelineStatisticFlagBits.VK_QUERY_PIPELINE_STATISTIC_INPUT_ASSEMBLY_PRIMITIVES_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000004, VkQueryPipelineStatisticFlagBits.VK_QUERY_PIPELINE_STATISTIC_VERTEX_SHADER_INVOCATIONS_BIT.valueOf(), VkQueryPipelineStatisticFlagBits.VK_QUERY_PIPELINE_STATISTIC_VERTEX_SHADER_INVOCATIONS_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000008, VkQueryPipelineStatisticFlagBits.VK_QUERY_PIPELINE_STATISTIC_GEOMETRY_SHADER_INVOCATIONS_BIT.valueOf(), VkQueryPipelineStatisticFlagBits.VK_QUERY_PIPELINE_STATISTIC_GEOMETRY_SHADER_INVOCATIONS_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000010, VkQueryPipelineStatisticFlagBits.VK_QUERY_PIPELINE_STATISTIC_GEOMETRY_SHADER_PRIMITIVES_BIT.valueOf(), VkQueryPipelineStatisticFlagBits.VK_QUERY_PIPELINE_STATISTIC_GEOMETRY_SHADER_PRIMITIVES_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000020, VkQueryPipelineStatisticFlagBits.VK_QUERY_PIPELINE_STATISTIC_CLIPPING_INVOCATIONS_BIT.valueOf(), VkQueryPipelineStatisticFlagBits.VK_QUERY_PIPELINE_STATISTIC_CLIPPING_INVOCATIONS_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000040, VkQueryPipelineStatisticFlagBits.VK_QUERY_PIPELINE_STATISTIC_CLIPPING_PRIMITIVES_BIT.valueOf(), VkQueryPipelineStatisticFlagBits.VK_QUERY_PIPELINE_STATISTIC_CLIPPING_PRIMITIVES_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000080, VkQueryPipelineStatisticFlagBits.VK_QUERY_PIPELINE_STATISTIC_FRAGMENT_SHADER_INVOCATIONS_BIT.valueOf(), VkQueryPipelineStatisticFlagBits.VK_QUERY_PIPELINE_STATISTIC_FRAGMENT_SHADER_INVOCATIONS_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000100, VkQueryPipelineStatisticFlagBits.VK_QUERY_PIPELINE_STATISTIC_TESSELLATION_CONTROL_SHADER_PATCHES_BIT.valueOf(), VkQueryPipelineStatisticFlagBits.VK_QUERY_PIPELINE_STATISTIC_TESSELLATION_CONTROL_SHADER_PATCHES_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000200, VkQueryPipelineStatisticFlagBits.VK_QUERY_PIPELINE_STATISTIC_TESSELLATION_EVALUATION_SHADER_INVOCATIONS_BIT.valueOf(), VkQueryPipelineStatisticFlagBits.VK_QUERY_PIPELINE_STATISTIC_TESSELLATION_EVALUATION_SHADER_INVOCATIONS_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000400, VkQueryPipelineStatisticFlagBits.VK_QUERY_PIPELINE_STATISTIC_COMPUTE_SHADER_INVOCATIONS_BIT.valueOf(), VkQueryPipelineStatisticFlagBits.VK_QUERY_PIPELINE_STATISTIC_COMPUTE_SHADER_INVOCATIONS_BIT.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkQueryPipelineStatisticFlagBits.VK_QUERY_PIPELINE_STATISTIC_FLAG_BITS_MAX_ENUM.valueOf(), VkQueryPipelineStatisticFlagBits.VK_QUERY_PIPELINE_STATISTIC_FLAG_BITS_MAX_ENUM.toString() + " has an unexpected value.");
    }
}
