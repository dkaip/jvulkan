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

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkResult;

class VkResultTest
{
    @Test
    void testNumberOfElements()
    {
        VkResult[] values = VkResult.values();
        assertEquals(38, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }


    @Test
    void testValues()
    {
        assertEquals(0, VkResult.VK_SUCCESS.valueOf(), VkResult.VK_SUCCESS.toString() + " has an unexpected value.");
        assertEquals(1, VkResult.VK_NOT_READY.valueOf(), VkResult.VK_NOT_READY.toString() + " has an unexpected value.");
        assertEquals(2, VkResult.VK_TIMEOUT.valueOf(), VkResult.VK_TIMEOUT.toString() + " has an unexpected value.");
        assertEquals(3, VkResult.VK_EVENT_SET.valueOf(), VkResult.VK_EVENT_SET.toString() + " has an unexpected value.");
        assertEquals(4, VkResult.VK_EVENT_RESET.valueOf(), VkResult.VK_EVENT_RESET.toString() + " has an unexpected value.");
        assertEquals(5, VkResult.VK_INCOMPLETE.valueOf(), VkResult.VK_INCOMPLETE.toString() + " has an unexpected value.");
        assertEquals(-1, VkResult.VK_ERROR_OUT_OF_HOST_MEMORY.valueOf(), VkResult.VK_ERROR_OUT_OF_HOST_MEMORY.toString() + " has an unexpected value.");
        assertEquals(-2, VkResult.VK_ERROR_OUT_OF_DEVICE_MEMORY.valueOf(), VkResult.VK_ERROR_OUT_OF_DEVICE_MEMORY.toString() + " has an unexpected value.");
        assertEquals(-3, VkResult.VK_ERROR_INITIALIZATION_FAILED.valueOf(), VkResult.VK_ERROR_INITIALIZATION_FAILED.toString() + " has an unexpected value.");
        assertEquals(-4, VkResult.VK_ERROR_DEVICE_LOST.valueOf(), VkResult.VK_ERROR_DEVICE_LOST.toString() + " has an unexpected value.");
        assertEquals(-5, VkResult.VK_ERROR_MEMORY_MAP_FAILED.valueOf(), VkResult.VK_ERROR_MEMORY_MAP_FAILED.toString() + " has an unexpected value.");
        assertEquals(-6, VkResult.VK_ERROR_LAYER_NOT_PRESENT.valueOf(), VkResult.VK_ERROR_LAYER_NOT_PRESENT.toString() + " has an unexpected value.");
        assertEquals(-7, VkResult.VK_ERROR_EXTENSION_NOT_PRESENT.valueOf(), VkResult.VK_ERROR_EXTENSION_NOT_PRESENT.toString() + " has an unexpected value.");
        assertEquals(-8, VkResult.VK_ERROR_FEATURE_NOT_PRESENT.valueOf(), VkResult.VK_ERROR_FEATURE_NOT_PRESENT.toString() + " has an unexpected value.");
        assertEquals(-9, VkResult.VK_ERROR_INCOMPATIBLE_DRIVER.valueOf(), VkResult.VK_ERROR_INCOMPATIBLE_DRIVER.toString() + " has an unexpected value.");
        assertEquals(-10, VkResult.VK_ERROR_TOO_MANY_OBJECTS.valueOf(), VkResult.VK_ERROR_TOO_MANY_OBJECTS.toString() + " has an unexpected value.");
        assertEquals(-11, VkResult.VK_ERROR_FORMAT_NOT_SUPPORTED.valueOf(), VkResult.VK_ERROR_FORMAT_NOT_SUPPORTED.toString() + " has an unexpected value.");
        assertEquals(-12, VkResult.VK_ERROR_FRAGMENTED_POOL.valueOf(), VkResult.VK_ERROR_FRAGMENTED_POOL.toString() + " has an unexpected value.");
        assertEquals(-1000069000, VkResult.VK_ERROR_OUT_OF_POOL_MEMORY.valueOf(), VkResult.VK_ERROR_OUT_OF_POOL_MEMORY.toString() + " has an unexpected value.");
        assertEquals(-1000072003, VkResult.VK_ERROR_INVALID_EXTERNAL_HANDLE.valueOf(), VkResult.VK_ERROR_INVALID_EXTERNAL_HANDLE.toString() + " has an unexpected value.");
        assertEquals(-1000000000, VkResult.VK_ERROR_SURFACE_LOST_KHR.valueOf(), VkResult.VK_ERROR_SURFACE_LOST_KHR.toString() + " has an unexpected value.");
        assertEquals(-1000000001, VkResult.VK_ERROR_NATIVE_WINDOW_IN_USE_KHR.valueOf(), VkResult.VK_ERROR_NATIVE_WINDOW_IN_USE_KHR.toString() + " has an unexpected value.");
        assertEquals(1000001003, VkResult.VK_SUBOPTIMAL_KHR.valueOf(), VkResult.VK_SUBOPTIMAL_KHR.toString() + " has an unexpected value.");
        assertEquals(-1000001004, VkResult.VK_ERROR_OUT_OF_DATE_KHR.valueOf(), VkResult.VK_ERROR_OUT_OF_DATE_KHR.toString() + " has an unexpected value.");
        assertEquals(-1000003001, VkResult.VK_ERROR_INCOMPATIBLE_DISPLAY_KHR.valueOf(), VkResult.VK_ERROR_INCOMPATIBLE_DISPLAY_KHR.toString() + " has an unexpected value.");
        assertEquals(-1000011001, VkResult.VK_ERROR_VALIDATION_FAILED_EXT.valueOf(), VkResult.VK_ERROR_VALIDATION_FAILED_EXT.toString() + " has an unexpected value.");
        assertEquals(-1000012000, VkResult.VK_ERROR_INVALID_SHADER_NV.valueOf(), VkResult.VK_ERROR_INVALID_SHADER_NV.toString() + " has an unexpected value.");
        assertEquals(-1000158000, VkResult.VK_ERROR_INVALID_DRM_FORMAT_MODIFIER_PLANE_LAYOUT_EXT.valueOf(), VkResult.VK_ERROR_INVALID_DRM_FORMAT_MODIFIER_PLANE_LAYOUT_EXT.toString() + " has an unexpected value.");
        assertEquals(-1000161000, VkResult.VK_ERROR_FRAGMENTATION_EXT.valueOf(), VkResult.VK_ERROR_FRAGMENTATION_EXT.toString() + " has an unexpected value.");
        assertEquals(-1000174001, VkResult.VK_ERROR_NOT_PERMITTED_EXT.valueOf(), VkResult.VK_ERROR_NOT_PERMITTED_EXT.toString() + " has an unexpected value.");
        assertEquals(-1000244000, VkResult.VK_ERROR_INVALID_DEVICE_ADDRESS_EXT.valueOf(), VkResult.VK_ERROR_INVALID_DEVICE_ADDRESS_EXT.toString() + " has an unexpected value.");
        assertEquals(-1000255000, VkResult.VK_ERROR_FULL_SCREEN_EXCLUSIVE_MODE_LOST_EXT.valueOf(), VkResult.VK_ERROR_FULL_SCREEN_EXCLUSIVE_MODE_LOST_EXT.toString() + " has an unexpected value.");
        assertEquals(VkResult.VK_ERROR_OUT_OF_POOL_MEMORY.valueOf(), VkResult.VK_ERROR_OUT_OF_POOL_MEMORY_KHR.valueOf(), VkResult.VK_ERROR_OUT_OF_POOL_MEMORY_KHR.toString() + " has an unexpected value.");
        assertEquals(VkResult.VK_ERROR_INVALID_EXTERNAL_HANDLE.valueOf(), VkResult.VK_ERROR_INVALID_EXTERNAL_HANDLE_KHR.valueOf(), VkResult.VK_ERROR_INVALID_EXTERNAL_HANDLE_KHR.toString() + " has an unexpected value.");
        assertEquals(VkResult.VK_ERROR_FRAGMENTED_POOL.valueOf(), VkResult.VK_RESULT_BEGIN_RANGE.valueOf(), VkResult.VK_RESULT_BEGIN_RANGE.toString() + " has an unexpected value.");
        assertEquals(VkResult.VK_INCOMPLETE.valueOf(), VkResult.VK_RESULT_END_RANGE.valueOf(), VkResult.VK_RESULT_END_RANGE.toString() + " has an unexpected value.");
        assertEquals((VkResult.VK_INCOMPLETE.valueOf() - VkResult.VK_ERROR_FRAGMENTED_POOL.valueOf() + 1), VkResult.VK_RESULT_RANGE_SIZE.valueOf(), VkResult.VK_RESULT_RANGE_SIZE.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkResult.VK_RESULT_MAX_ENUM.valueOf(), VkResult.VK_RESULT_MAX_ENUM.toString() + " has an unexpected value.");
    }
}
