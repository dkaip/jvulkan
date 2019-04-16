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
package com.CIMthetics.jvulkan.VulkanExtensions.VK11.Enums;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VkColorSpaceKHRTest
{
    @Test
    void testNumberOfElements()
    {
        VkColorSpaceKHR[] values = VkColorSpaceKHR.values();
        assertEquals(20, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }


    @Test
    void testValues()
    {
        assertEquals(0, VkColorSpaceKHR.VK_COLOR_SPACE_SRGB_NONLINEAR_KHR.valueOf(), VkColorSpaceKHR.VK_COLOR_SPACE_SRGB_NONLINEAR_KHR.toString() + " has an unexpected value.");
        assertEquals(1000104001, VkColorSpaceKHR.VK_COLOR_SPACE_DISPLAY_P3_NONLINEAR_EXT.valueOf(), VkColorSpaceKHR.VK_COLOR_SPACE_DISPLAY_P3_NONLINEAR_EXT.toString() + " has an unexpected value.");
        assertEquals(1000104002, VkColorSpaceKHR.VK_COLOR_SPACE_EXTENDED_SRGB_LINEAR_EXT.valueOf(), VkColorSpaceKHR.VK_COLOR_SPACE_EXTENDED_SRGB_LINEAR_EXT.toString() + " has an unexpected value.");
        assertEquals(1000104003, VkColorSpaceKHR.VK_COLOR_SPACE_DCI_P3_LINEAR_EXT.valueOf(), VkColorSpaceKHR.VK_COLOR_SPACE_DCI_P3_LINEAR_EXT.toString() + " has an unexpected value.");
        assertEquals(1000104004, VkColorSpaceKHR.VK_COLOR_SPACE_DCI_P3_NONLINEAR_EXT.valueOf(), VkColorSpaceKHR.VK_COLOR_SPACE_DCI_P3_NONLINEAR_EXT.toString() + " has an unexpected value.");
        assertEquals(1000104005, VkColorSpaceKHR.VK_COLOR_SPACE_BT709_LINEAR_EXT.valueOf(), VkColorSpaceKHR.VK_COLOR_SPACE_BT709_LINEAR_EXT.toString() + " has an unexpected value.");
        assertEquals(1000104006, VkColorSpaceKHR.VK_COLOR_SPACE_BT709_NONLINEAR_EXT.valueOf(), VkColorSpaceKHR.VK_COLOR_SPACE_BT709_NONLINEAR_EXT.toString() + " has an unexpected value.");
        assertEquals(1000104007, VkColorSpaceKHR.VK_COLOR_SPACE_BT2020_LINEAR_EXT.valueOf(), VkColorSpaceKHR.VK_COLOR_SPACE_BT2020_LINEAR_EXT.toString() + " has an unexpected value.");
        assertEquals(1000104008, VkColorSpaceKHR.VK_COLOR_SPACE_HDR10_ST2084_EXT.valueOf(), VkColorSpaceKHR.VK_COLOR_SPACE_HDR10_ST2084_EXT.toString() + " has an unexpected value.");
        assertEquals(1000104009, VkColorSpaceKHR.VK_COLOR_SPACE_DOLBYVISION_EXT.valueOf(), VkColorSpaceKHR.VK_COLOR_SPACE_DOLBYVISION_EXT.toString() + " has an unexpected value.");
        assertEquals(1000104010, VkColorSpaceKHR.VK_COLOR_SPACE_HDR10_HLG_EXT.valueOf(), VkColorSpaceKHR.VK_COLOR_SPACE_HDR10_HLG_EXT.toString() + " has an unexpected value.");
        assertEquals(1000104011, VkColorSpaceKHR.VK_COLOR_SPACE_ADOBERGB_LINEAR_EXT.valueOf(), VkColorSpaceKHR.VK_COLOR_SPACE_ADOBERGB_LINEAR_EXT.toString() + " has an unexpected value.");
        assertEquals(1000104012, VkColorSpaceKHR.VK_COLOR_SPACE_ADOBERGB_NONLINEAR_EXT.valueOf(), VkColorSpaceKHR.VK_COLOR_SPACE_ADOBERGB_NONLINEAR_EXT.toString() + " has an unexpected value.");
        assertEquals(1000104013, VkColorSpaceKHR.VK_COLOR_SPACE_PASS_THROUGH_EXT.valueOf(), VkColorSpaceKHR.VK_COLOR_SPACE_PASS_THROUGH_EXT.toString() + " has an unexpected value.");
        assertEquals(1000104014, VkColorSpaceKHR.VK_COLOR_SPACE_EXTENDED_SRGB_NONLINEAR_EXT.valueOf(), VkColorSpaceKHR.VK_COLOR_SPACE_EXTENDED_SRGB_NONLINEAR_EXT.toString() + " has an unexpected value.");
        assertEquals(VkColorSpaceKHR.VK_COLOR_SPACE_SRGB_NONLINEAR_KHR.valueOf(), VkColorSpaceKHR.VK_COLORSPACE_SRGB_NONLINEAR_KHR.valueOf(), VkColorSpaceKHR.VK_COLORSPACE_SRGB_NONLINEAR_KHR.toString() + " has an unexpected value.");
        assertEquals(VkColorSpaceKHR.VK_COLOR_SPACE_SRGB_NONLINEAR_KHR.valueOf(), VkColorSpaceKHR.VK_COLOR_SPACE_BEGIN_RANGE_KHR.valueOf(), VkColorSpaceKHR.VK_COLOR_SPACE_BEGIN_RANGE_KHR.toString() + " has an unexpected value.");
        assertEquals(VkColorSpaceKHR.VK_COLOR_SPACE_SRGB_NONLINEAR_KHR.valueOf(), VkColorSpaceKHR.VK_COLOR_SPACE_END_RANGE_KHR.valueOf(), VkColorSpaceKHR.VK_COLOR_SPACE_END_RANGE_KHR.toString() + " has an unexpected value.");
        assertEquals((VkColorSpaceKHR.VK_COLOR_SPACE_SRGB_NONLINEAR_KHR.valueOf() - VkColorSpaceKHR.VK_COLOR_SPACE_SRGB_NONLINEAR_KHR.valueOf() + 1), VkColorSpaceKHR.VK_COLOR_SPACE_RANGE_SIZE_KHR.valueOf(), VkColorSpaceKHR.VK_COLOR_SPACE_RANGE_SIZE_KHR.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkColorSpaceKHR.VK_COLOR_SPACE_MAX_ENUM_KHR.valueOf(), VkColorSpaceKHR.VK_COLOR_SPACE_MAX_ENUM_KHR.toString() + " has an unexpected value.");
    }
}
