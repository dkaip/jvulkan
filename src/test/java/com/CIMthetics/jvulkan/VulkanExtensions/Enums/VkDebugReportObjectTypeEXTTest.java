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
package com.CIMthetics.jvulkan.VulkanExtensions.Enums;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.CIMthetics.jvulkan.VulkanExtensions.Enums.VkDebugReportObjectTypeEXT;

class VkDebugReportObjectTypeEXTTest
{
    @Test
    void testNumberOfElements()
    {
        VkDebugReportObjectTypeEXT[] values = VkDebugReportObjectTypeEXT.values();
        assertEquals(45, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }


    @Test
    void testValues()
    {
        assertEquals(0, VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT.valueOf(), VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT.toString() + " has an unexpected value.");
        assertEquals(1, VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_INSTANCE_EXT.valueOf(), VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_INSTANCE_EXT.toString() + " has an unexpected value.");
        assertEquals(2, VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_PHYSICAL_DEVICE_EXT.valueOf(), VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_PHYSICAL_DEVICE_EXT.toString() + " has an unexpected value.");
        assertEquals(3, VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_DEVICE_EXT.valueOf(), VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_DEVICE_EXT.toString() + " has an unexpected value.");
        assertEquals(4, VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_QUEUE_EXT.valueOf(), VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_QUEUE_EXT.toString() + " has an unexpected value.");
        assertEquals(5, VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_SEMAPHORE_EXT.valueOf(), VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_SEMAPHORE_EXT.toString() + " has an unexpected value.");
        assertEquals(6, VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_COMMAND_BUFFER_EXT.valueOf(), VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_COMMAND_BUFFER_EXT.toString() + " has an unexpected value.");
        assertEquals(7, VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_FENCE_EXT.valueOf(), VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_FENCE_EXT.toString() + " has an unexpected value.");
        assertEquals(8, VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_DEVICE_MEMORY_EXT.valueOf(), VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_DEVICE_MEMORY_EXT.toString() + " has an unexpected value.");
        assertEquals(9, VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_BUFFER_EXT.valueOf(), VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_BUFFER_EXT.toString() + " has an unexpected value.");
        assertEquals(10, VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_IMAGE_EXT.valueOf(), VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_IMAGE_EXT.toString() + " has an unexpected value.");
        assertEquals(11, VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_EVENT_EXT.valueOf(), VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_EVENT_EXT.toString() + " has an unexpected value.");
        assertEquals(12, VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_QUERY_POOL_EXT.valueOf(), VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_QUERY_POOL_EXT.toString() + " has an unexpected value.");
        assertEquals(13, VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_BUFFER_VIEW_EXT.valueOf(), VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_BUFFER_VIEW_EXT.toString() + " has an unexpected value.");
        assertEquals(14, VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_IMAGE_VIEW_EXT.valueOf(), VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_IMAGE_VIEW_EXT.toString() + " has an unexpected value.");
        assertEquals(15, VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_SHADER_MODULE_EXT.valueOf(), VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_SHADER_MODULE_EXT.toString() + " has an unexpected value.");
        assertEquals(16, VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_CACHE_EXT.valueOf(), VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_CACHE_EXT.toString() + " has an unexpected value.");
        assertEquals(17, VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_LAYOUT_EXT.valueOf(), VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_LAYOUT_EXT.toString() + " has an unexpected value.");
        assertEquals(18, VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_RENDER_PASS_EXT.valueOf(), VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_RENDER_PASS_EXT.toString() + " has an unexpected value.");
        assertEquals(19, VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_EXT.valueOf(), VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_EXT.toString() + " has an unexpected value.");
        assertEquals(20, VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_LAYOUT_EXT.valueOf(), VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_LAYOUT_EXT.toString() + " has an unexpected value.");
        assertEquals(21, VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_SAMPLER_EXT.valueOf(), VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_SAMPLER_EXT.toString() + " has an unexpected value.");
        assertEquals(22, VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_POOL_EXT.valueOf(), VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_POOL_EXT.toString() + " has an unexpected value.");
        assertEquals(23, VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_EXT.valueOf(), VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_EXT.toString() + " has an unexpected value.");
        assertEquals(24, VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_FRAMEBUFFER_EXT.valueOf(), VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_FRAMEBUFFER_EXT.toString() + " has an unexpected value.");
        assertEquals(25, VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_COMMAND_POOL_EXT.valueOf(), VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_COMMAND_POOL_EXT.toString() + " has an unexpected value.");
        assertEquals(26, VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_SURFACE_KHR_EXT.valueOf(), VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_SURFACE_KHR_EXT.toString() + " has an unexpected value.");
        assertEquals(27, VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_SWAPCHAIN_KHR_EXT.valueOf(), VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_SWAPCHAIN_KHR_EXT.toString() + " has an unexpected value.");
        assertEquals(28, VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_CALLBACK_EXT_EXT.valueOf(), VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_CALLBACK_EXT_EXT.toString() + " has an unexpected value.");
        assertEquals(29, VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_DISPLAY_KHR_EXT.valueOf(), VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_DISPLAY_KHR_EXT.toString() + " has an unexpected value.");
        assertEquals(30, VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_DISPLAY_MODE_KHR_EXT.valueOf(), VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_DISPLAY_MODE_KHR_EXT.toString() + " has an unexpected value.");
        assertEquals(31, VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_OBJECT_TABLE_NVX_EXT.valueOf(), VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_OBJECT_TABLE_NVX_EXT.toString() + " has an unexpected value.");
        assertEquals(32, VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_INDIRECT_COMMANDS_LAYOUT_NVX_EXT.valueOf(), VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_INDIRECT_COMMANDS_LAYOUT_NVX_EXT.toString() + " has an unexpected value.");
        assertEquals(33, VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_VALIDATION_CACHE_EXT_EXT.valueOf(), VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_VALIDATION_CACHE_EXT_EXT.toString() + " has an unexpected value.");
        assertEquals(1000156000, VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION_EXT.valueOf(), VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION_EXT.toString() + " has an unexpected value.");
        assertEquals(1000085000, VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_EXT.valueOf(), VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_EXT.toString() + " has an unexpected value.");
        assertEquals(1000165000, VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_ACCELERATION_STRUCTURE_NV_EXT.valueOf(), VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_ACCELERATION_STRUCTURE_NV_EXT.toString() + " has an unexpected value.");
        assertEquals(VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_CALLBACK_EXT_EXT.valueOf(), VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_EXT.valueOf(), VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_EXT.toString() + " has an unexpected value.");
        assertEquals(VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_VALIDATION_CACHE_EXT_EXT.valueOf(), VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_VALIDATION_CACHE_EXT.valueOf(), VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_VALIDATION_CACHE_EXT.toString() + " has an unexpected value.");
        assertEquals(VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_EXT.valueOf(), VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_KHR_EXT.valueOf(), VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_KHR_EXT.toString() + " has an unexpected value.");
        assertEquals(VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION_EXT.valueOf(), VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION_KHR_EXT.valueOf(), VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION_KHR_EXT.toString() + " has an unexpected value.");
        assertEquals(VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT.valueOf(), VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_BEGIN_RANGE_EXT.valueOf(), VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_BEGIN_RANGE_EXT.toString() + " has an unexpected value.");
        assertEquals(VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_VALIDATION_CACHE_EXT_EXT.valueOf(), VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_END_RANGE_EXT.valueOf(), VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_END_RANGE_EXT.toString() + " has an unexpected value.");
        assertEquals((VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_VALIDATION_CACHE_EXT_EXT.valueOf() - VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT.valueOf() + 1), VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_RANGE_SIZE_EXT.valueOf(), VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_RANGE_SIZE_EXT.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_MAX_ENUM_EXT.valueOf(), VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_MAX_ENUM_EXT.toString() + " has an unexpected value.");
    }
}
