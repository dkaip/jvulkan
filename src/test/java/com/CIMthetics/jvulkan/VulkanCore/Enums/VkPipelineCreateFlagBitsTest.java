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

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkPipelineCreateFlagBits;

class VkPipelineCreateFlagBitsTest
{
    @Test
    void testNumberOfElements()
    {
        VkPipelineCreateFlagBits[] values = VkPipelineCreateFlagBits.values();
        assertEquals(9, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }


    @Test
    void testValues()
    {
        assertEquals(0x00000001, VkPipelineCreateFlagBits.VK_PIPELINE_CREATE_DISABLE_OPTIMIZATION_BIT.valueOf(), VkPipelineCreateFlagBits.VK_PIPELINE_CREATE_DISABLE_OPTIMIZATION_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000002, VkPipelineCreateFlagBits.VK_PIPELINE_CREATE_ALLOW_DERIVATIVES_BIT.valueOf(), VkPipelineCreateFlagBits.VK_PIPELINE_CREATE_ALLOW_DERIVATIVES_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000004, VkPipelineCreateFlagBits.VK_PIPELINE_CREATE_DERIVATIVE_BIT.valueOf(), VkPipelineCreateFlagBits.VK_PIPELINE_CREATE_DERIVATIVE_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000008, VkPipelineCreateFlagBits.VK_PIPELINE_CREATE_VIEW_INDEX_FROM_DEVICE_INDEX_BIT.valueOf(), VkPipelineCreateFlagBits.VK_PIPELINE_CREATE_VIEW_INDEX_FROM_DEVICE_INDEX_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000010, VkPipelineCreateFlagBits.VK_PIPELINE_CREATE_DISPATCH_BASE.valueOf(), VkPipelineCreateFlagBits.VK_PIPELINE_CREATE_DISPATCH_BASE.toString() + " has an unexpected value.");
        assertEquals(0x00000020, VkPipelineCreateFlagBits.VK_PIPELINE_CREATE_DEFER_COMPILE_BIT_NV.valueOf(), VkPipelineCreateFlagBits.VK_PIPELINE_CREATE_DEFER_COMPILE_BIT_NV.toString() + " has an unexpected value.");
        assertEquals(VkPipelineCreateFlagBits.VK_PIPELINE_CREATE_VIEW_INDEX_FROM_DEVICE_INDEX_BIT.valueOf(), VkPipelineCreateFlagBits.VK_PIPELINE_CREATE_VIEW_INDEX_FROM_DEVICE_INDEX_BIT_KHR.valueOf(), VkPipelineCreateFlagBits.VK_PIPELINE_CREATE_VIEW_INDEX_FROM_DEVICE_INDEX_BIT_KHR.toString() + " has an unexpected value.");
        assertEquals(VkPipelineCreateFlagBits.VK_PIPELINE_CREATE_DISPATCH_BASE.valueOf(), VkPipelineCreateFlagBits.VK_PIPELINE_CREATE_DISPATCH_BASE_KHR.valueOf(), VkPipelineCreateFlagBits.VK_PIPELINE_CREATE_DISPATCH_BASE_KHR.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkPipelineCreateFlagBits.VK_PIPELINE_CREATE_FLAG_BITS_MAX_ENUM.valueOf(), VkPipelineCreateFlagBits.VK_PIPELINE_CREATE_FLAG_BITS_MAX_ENUM.toString() + " has an unexpected value.");
    }
}
