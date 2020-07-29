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

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkObjectType;

class VkObjectTypeTest
{
    @Test
    void testNumberOfElements()
    {
        VkObjectType[] values = VkObjectType.values();
        assertEquals(44, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }


    @Test
    void testValues()
    {
        assertEquals(0, VkObjectType.VK_OBJECT_TYPE_UNKNOWN.valueOf(), VkObjectType.VK_OBJECT_TYPE_UNKNOWN.toString() + " has an unexpected value.");
        assertEquals(1, VkObjectType.VK_OBJECT_TYPE_INSTANCE.valueOf(), VkObjectType.VK_OBJECT_TYPE_INSTANCE.toString() + " has an unexpected value.");
        assertEquals(2, VkObjectType.VK_OBJECT_TYPE_PHYSICAL_DEVICE.valueOf(), VkObjectType.VK_OBJECT_TYPE_PHYSICAL_DEVICE.toString() + " has an unexpected value.");
        assertEquals(3, VkObjectType.VK_OBJECT_TYPE_DEVICE.valueOf(), VkObjectType.VK_OBJECT_TYPE_DEVICE.toString() + " has an unexpected value.");
        assertEquals(4, VkObjectType.VK_OBJECT_TYPE_QUEUE.valueOf(), VkObjectType.VK_OBJECT_TYPE_QUEUE.toString() + " has an unexpected value.");
        assertEquals(5, VkObjectType.VK_OBJECT_TYPE_SEMAPHORE.valueOf(), VkObjectType.VK_OBJECT_TYPE_SEMAPHORE.toString() + " has an unexpected value.");
        assertEquals(6, VkObjectType.VK_OBJECT_TYPE_COMMAND_BUFFER.valueOf(), VkObjectType.VK_OBJECT_TYPE_COMMAND_BUFFER.toString() + " has an unexpected value.");
        assertEquals(7, VkObjectType.VK_OBJECT_TYPE_FENCE.valueOf(), VkObjectType.VK_OBJECT_TYPE_FENCE.toString() + " has an unexpected value.");
        assertEquals(8, VkObjectType.VK_OBJECT_TYPE_DEVICE_MEMORY.valueOf(), VkObjectType.VK_OBJECT_TYPE_DEVICE_MEMORY.toString() + " has an unexpected value.");
        assertEquals(9, VkObjectType.VK_OBJECT_TYPE_BUFFER.valueOf(), VkObjectType.VK_OBJECT_TYPE_BUFFER.toString() + " has an unexpected value.");
        assertEquals(10, VkObjectType.VK_OBJECT_TYPE_IMAGE.valueOf(), VkObjectType.VK_OBJECT_TYPE_IMAGE.toString() + " has an unexpected value.");
        assertEquals(11, VkObjectType.VK_OBJECT_TYPE_EVENT.valueOf(), VkObjectType.VK_OBJECT_TYPE_EVENT.toString() + " has an unexpected value.");
        assertEquals(12, VkObjectType.VK_OBJECT_TYPE_QUERY_POOL.valueOf(), VkObjectType.VK_OBJECT_TYPE_QUERY_POOL.toString() + " has an unexpected value.");
        assertEquals(13, VkObjectType.VK_OBJECT_TYPE_BUFFER_VIEW.valueOf(), VkObjectType.VK_OBJECT_TYPE_BUFFER_VIEW.toString() + " has an unexpected value.");
        assertEquals(14, VkObjectType.VK_OBJECT_TYPE_IMAGE_VIEW.valueOf(), VkObjectType.VK_OBJECT_TYPE_IMAGE_VIEW.toString() + " has an unexpected value.");
        assertEquals(15, VkObjectType.VK_OBJECT_TYPE_SHADER_MODULE.valueOf(), VkObjectType.VK_OBJECT_TYPE_SHADER_MODULE.toString() + " has an unexpected value.");
        assertEquals(16, VkObjectType.VK_OBJECT_TYPE_PIPELINE_CACHE.valueOf(), VkObjectType.VK_OBJECT_TYPE_PIPELINE_CACHE.toString() + " has an unexpected value.");
        assertEquals(17, VkObjectType.VK_OBJECT_TYPE_PIPELINE_LAYOUT.valueOf(), VkObjectType.VK_OBJECT_TYPE_PIPELINE_LAYOUT.toString() + " has an unexpected value.");
        assertEquals(18, VkObjectType.VK_OBJECT_TYPE_RENDER_PASS.valueOf(), VkObjectType.VK_OBJECT_TYPE_RENDER_PASS.toString() + " has an unexpected value.");
        assertEquals(19, VkObjectType.VK_OBJECT_TYPE_PIPELINE.valueOf(), VkObjectType.VK_OBJECT_TYPE_PIPELINE.toString() + " has an unexpected value.");
        assertEquals(20, VkObjectType.VK_OBJECT_TYPE_DESCRIPTOR_SET_LAYOUT.valueOf(), VkObjectType.VK_OBJECT_TYPE_DESCRIPTOR_SET_LAYOUT.toString() + " has an unexpected value.");
        assertEquals(21, VkObjectType.VK_OBJECT_TYPE_SAMPLER.valueOf(), VkObjectType.VK_OBJECT_TYPE_SAMPLER.toString() + " has an unexpected value.");
        assertEquals(22, VkObjectType.VK_OBJECT_TYPE_DESCRIPTOR_POOL.valueOf(), VkObjectType.VK_OBJECT_TYPE_DESCRIPTOR_POOL.toString() + " has an unexpected value.");
        assertEquals(23, VkObjectType.VK_OBJECT_TYPE_DESCRIPTOR_SET.valueOf(), VkObjectType.VK_OBJECT_TYPE_DESCRIPTOR_SET.toString() + " has an unexpected value.");
        assertEquals(24, VkObjectType.VK_OBJECT_TYPE_FRAMEBUFFER.valueOf(), VkObjectType.VK_OBJECT_TYPE_FRAMEBUFFER.toString() + " has an unexpected value.");
        assertEquals(25, VkObjectType.VK_OBJECT_TYPE_COMMAND_POOL.valueOf(), VkObjectType.VK_OBJECT_TYPE_COMMAND_POOL.toString() + " has an unexpected value.");
        assertEquals(1000156000, VkObjectType.VK_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION.valueOf(), VkObjectType.VK_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION.toString() + " has an unexpected value.");
        assertEquals(1000085000, VkObjectType.VK_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE.valueOf(), VkObjectType.VK_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE.toString() + " has an unexpected value.");
        assertEquals(1000000000, VkObjectType.VK_OBJECT_TYPE_SURFACE_KHR.valueOf(), VkObjectType.VK_OBJECT_TYPE_SURFACE_KHR.toString() + " has an unexpected value.");
        assertEquals(1000001000, VkObjectType.VK_OBJECT_TYPE_SWAPCHAIN_KHR.valueOf(), VkObjectType.VK_OBJECT_TYPE_SWAPCHAIN_KHR.toString() + " has an unexpected value.");
        assertEquals(1000002000, VkObjectType.VK_OBJECT_TYPE_DISPLAY_KHR.valueOf(), VkObjectType.VK_OBJECT_TYPE_DISPLAY_KHR.toString() + " has an unexpected value.");
        assertEquals(1000002001, VkObjectType.VK_OBJECT_TYPE_DISPLAY_MODE_KHR.valueOf(), VkObjectType.VK_OBJECT_TYPE_DISPLAY_MODE_KHR.toString() + " has an unexpected value.");
        assertEquals(1000011000, VkObjectType.VK_OBJECT_TYPE_DEBUG_REPORT_CALLBACK_EXT.valueOf(), VkObjectType.VK_OBJECT_TYPE_DEBUG_REPORT_CALLBACK_EXT.toString() + " has an unexpected value.");
        assertEquals(1000086000, VkObjectType.VK_OBJECT_TYPE_OBJECT_TABLE_NVX.valueOf(), VkObjectType.VK_OBJECT_TYPE_OBJECT_TABLE_NVX.toString() + " has an unexpected value.");
        assertEquals(1000086001, VkObjectType.VK_OBJECT_TYPE_INDIRECT_COMMANDS_LAYOUT_NVX.valueOf(), VkObjectType.VK_OBJECT_TYPE_INDIRECT_COMMANDS_LAYOUT_NVX.toString() + " has an unexpected value.");
        assertEquals(1000128000, VkObjectType.VK_OBJECT_TYPE_DEBUG_UTILS_MESSENGER_EXT.valueOf(), VkObjectType.VK_OBJECT_TYPE_DEBUG_UTILS_MESSENGER_EXT.toString() + " has an unexpected value.");
        assertEquals(1000160000, VkObjectType.VK_OBJECT_TYPE_VALIDATION_CACHE_EXT.valueOf(), VkObjectType.VK_OBJECT_TYPE_VALIDATION_CACHE_EXT.toString() + " has an unexpected value.");
        assertEquals(1000165000, VkObjectType.VK_OBJECT_TYPE_ACCELERATION_STRUCTURE_NV.valueOf(), VkObjectType.VK_OBJECT_TYPE_ACCELERATION_STRUCTURE_NV.toString() + " has an unexpected value.");
        assertEquals(VkObjectType.VK_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE.valueOf(), VkObjectType.VK_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_KHR.valueOf(), VkObjectType.VK_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_KHR.toString() + " has an unexpected value.");
        assertEquals(VkObjectType.VK_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION.valueOf(), VkObjectType.VK_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION_KHR.valueOf(), VkObjectType.VK_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION_KHR.toString() + " has an unexpected value.");
        assertEquals(VkObjectType.VK_OBJECT_TYPE_UNKNOWN.valueOf(), VkObjectType.VK_OBJECT_TYPE_BEGIN_RANGE.valueOf(), VkObjectType.VK_OBJECT_TYPE_BEGIN_RANGE.toString() + " has an unexpected value.");
        assertEquals(VkObjectType.VK_OBJECT_TYPE_COMMAND_POOL.valueOf(), VkObjectType.VK_OBJECT_TYPE_END_RANGE.valueOf(), VkObjectType.VK_OBJECT_TYPE_END_RANGE.toString() + " has an unexpected value.");
        assertEquals((VkObjectType.VK_OBJECT_TYPE_COMMAND_POOL.valueOf() - VkObjectType.VK_OBJECT_TYPE_UNKNOWN.valueOf() + 1), VkObjectType.VK_OBJECT_TYPE_RANGE_SIZE.valueOf(), VkObjectType.VK_OBJECT_TYPE_RANGE_SIZE.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkObjectType.VK_OBJECT_TYPE_MAX_ENUM.valueOf(), VkObjectType.VK_OBJECT_TYPE_MAX_ENUM.toString() + " has an unexpected value.");
    }
}
