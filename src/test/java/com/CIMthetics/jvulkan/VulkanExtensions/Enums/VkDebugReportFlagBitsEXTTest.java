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
package com.CIMthetics.jvulkan.VulkanExtensions.Enums;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.CIMthetics.jvulkan.VulkanExtensions.Enums.VkDebugReportFlagBitsEXT;

class VkDebugReportFlagBitsEXTTest
{
    @Test
    void testNumberOfElements()
    {
        VkDebugReportFlagBitsEXT[] values = VkDebugReportFlagBitsEXT.values();
        assertEquals(6, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }


    @Test
    void testValues()
    {
        assertEquals(0x00000001, VkDebugReportFlagBitsEXT.VK_DEBUG_REPORT_INFORMATION_BIT_EXT.valueOf(), VkDebugReportFlagBitsEXT.VK_DEBUG_REPORT_INFORMATION_BIT_EXT.toString() + " has an unexpected value.");
        assertEquals(0x00000002, VkDebugReportFlagBitsEXT.VK_DEBUG_REPORT_WARNING_BIT_EXT.valueOf(), VkDebugReportFlagBitsEXT.VK_DEBUG_REPORT_WARNING_BIT_EXT.toString() + " has an unexpected value.");
        assertEquals(0x00000004, VkDebugReportFlagBitsEXT.VK_DEBUG_REPORT_PERFORMANCE_WARNING_BIT_EXT.valueOf(), VkDebugReportFlagBitsEXT.VK_DEBUG_REPORT_PERFORMANCE_WARNING_BIT_EXT.toString() + " has an unexpected value.");
        assertEquals(0x00000008, VkDebugReportFlagBitsEXT.VK_DEBUG_REPORT_ERROR_BIT_EXT.valueOf(), VkDebugReportFlagBitsEXT.VK_DEBUG_REPORT_ERROR_BIT_EXT.toString() + " has an unexpected value.");
        assertEquals(0x00000010, VkDebugReportFlagBitsEXT.VK_DEBUG_REPORT_DEBUG_BIT_EXT.valueOf(), VkDebugReportFlagBitsEXT.VK_DEBUG_REPORT_DEBUG_BIT_EXT.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkDebugReportFlagBitsEXT.VK_DEBUG_REPORT_FLAG_BITS_MAX_ENUM_EXT.valueOf(), VkDebugReportFlagBitsEXT.VK_DEBUG_REPORT_FLAG_BITS_MAX_ENUM_EXT.toString() + " has an unexpected value.");
    }
}
