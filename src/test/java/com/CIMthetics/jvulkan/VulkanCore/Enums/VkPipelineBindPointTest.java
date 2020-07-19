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

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkPipelineBindPoint;

class VkPipelineBindPointTest
{
    @Test
    void testNumberOfElements()
    {
        VkPipelineBindPoint[] values = VkPipelineBindPoint.values();
        assertEquals(7, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }


    @Test
    void testValues()
    {
        assertEquals(0, VkPipelineBindPoint.VK_PIPELINE_BIND_POINT_GRAPHICS.valueOf(), VkPipelineBindPoint.VK_PIPELINE_BIND_POINT_GRAPHICS.toString() + " has an unexpected value.");
        assertEquals(1, VkPipelineBindPoint.VK_PIPELINE_BIND_POINT_COMPUTE.valueOf(), VkPipelineBindPoint.VK_PIPELINE_BIND_POINT_COMPUTE.toString() + " has an unexpected value.");
        assertEquals(1000165000, VkPipelineBindPoint.VK_PIPELINE_BIND_POINT_RAY_TRACING_NV.valueOf(), VkPipelineBindPoint.VK_PIPELINE_BIND_POINT_RAY_TRACING_NV.toString() + " has an unexpected value.");
        assertEquals(VkPipelineBindPoint.VK_PIPELINE_BIND_POINT_GRAPHICS.valueOf(), VkPipelineBindPoint.VK_PIPELINE_BIND_POINT_BEGIN_RANGE.valueOf(), VkPipelineBindPoint.VK_PIPELINE_BIND_POINT_BEGIN_RANGE.toString() + " has an unexpected value.");
        assertEquals(VkPipelineBindPoint.VK_PIPELINE_BIND_POINT_COMPUTE.valueOf(), VkPipelineBindPoint.VK_PIPELINE_BIND_POINT_END_RANGE.valueOf(), VkPipelineBindPoint.VK_PIPELINE_BIND_POINT_END_RANGE.toString() + " has an unexpected value.");
        assertEquals((VkPipelineBindPoint.VK_PIPELINE_BIND_POINT_COMPUTE.valueOf() - VkPipelineBindPoint.VK_PIPELINE_BIND_POINT_GRAPHICS.valueOf() + 1), VkPipelineBindPoint.VK_PIPELINE_BIND_POINT_RANGE_SIZE.valueOf(), VkPipelineBindPoint.VK_PIPELINE_BIND_POINT_RANGE_SIZE.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkPipelineBindPoint.VK_PIPELINE_BIND_POINT_MAX_ENUM.valueOf(), VkPipelineBindPoint.VK_PIPELINE_BIND_POINT_MAX_ENUM.toString() + " has an unexpected value.");
    }
}
