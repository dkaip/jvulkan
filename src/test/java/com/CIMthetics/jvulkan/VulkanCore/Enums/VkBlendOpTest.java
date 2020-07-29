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

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkBlendOp;

class VkBlendOpTest
{
    @Test
    void testNumberOfElements()
    {
        VkBlendOp[] values = VkBlendOp.values();
        assertEquals(55, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }


    @Test
    void testValues()
    {
        assertEquals(0, VkBlendOp.VK_BLEND_OP_ADD.valueOf(), VkBlendOp.VK_BLEND_OP_ADD.toString() + " has an unexpected value.");
        assertEquals(1, VkBlendOp.VK_BLEND_OP_SUBTRACT.valueOf(), VkBlendOp.VK_BLEND_OP_SUBTRACT.toString() + " has an unexpected value.");
        assertEquals(2, VkBlendOp.VK_BLEND_OP_REVERSE_SUBTRACT.valueOf(), VkBlendOp.VK_BLEND_OP_REVERSE_SUBTRACT.toString() + " has an unexpected value.");
        assertEquals(3, VkBlendOp.VK_BLEND_OP_MIN.valueOf(), VkBlendOp.VK_BLEND_OP_MIN.toString() + " has an unexpected value.");
        assertEquals(4, VkBlendOp.VK_BLEND_OP_MAX.valueOf(), VkBlendOp.VK_BLEND_OP_MAX.toString() + " has an unexpected value.");
        assertEquals(1000148000, VkBlendOp.VK_BLEND_OP_ZERO_EXT.valueOf(), VkBlendOp.VK_BLEND_OP_ZERO_EXT.toString() + " has an unexpected value.");
        assertEquals(1000148001, VkBlendOp.VK_BLEND_OP_SRC_EXT.valueOf(), VkBlendOp.VK_BLEND_OP_SRC_EXT.toString() + " has an unexpected value.");
        assertEquals(1000148002, VkBlendOp.VK_BLEND_OP_DST_EXT.valueOf(), VkBlendOp.VK_BLEND_OP_DST_EXT.toString() + " has an unexpected value.");
        assertEquals(1000148003, VkBlendOp.VK_BLEND_OP_SRC_OVER_EXT.valueOf(), VkBlendOp.VK_BLEND_OP_SRC_OVER_EXT.toString() + " has an unexpected value.");
        assertEquals(1000148004, VkBlendOp.VK_BLEND_OP_DST_OVER_EXT.valueOf(), VkBlendOp.VK_BLEND_OP_DST_OVER_EXT.toString() + " has an unexpected value.");
        assertEquals(1000148005, VkBlendOp.VK_BLEND_OP_SRC_IN_EXT.valueOf(), VkBlendOp.VK_BLEND_OP_SRC_IN_EXT.toString() + " has an unexpected value.");
        assertEquals(1000148006, VkBlendOp.VK_BLEND_OP_DST_IN_EXT.valueOf(), VkBlendOp.VK_BLEND_OP_DST_IN_EXT.toString() + " has an unexpected value.");
        assertEquals(1000148007, VkBlendOp.VK_BLEND_OP_SRC_OUT_EXT.valueOf(), VkBlendOp.VK_BLEND_OP_SRC_OUT_EXT.toString() + " has an unexpected value.");
        assertEquals(1000148008, VkBlendOp.VK_BLEND_OP_DST_OUT_EXT.valueOf(), VkBlendOp.VK_BLEND_OP_DST_OUT_EXT.toString() + " has an unexpected value.");
        assertEquals(1000148009, VkBlendOp.VK_BLEND_OP_SRC_ATOP_EXT.valueOf(), VkBlendOp.VK_BLEND_OP_SRC_ATOP_EXT.toString() + " has an unexpected value.");
        assertEquals(1000148010, VkBlendOp.VK_BLEND_OP_DST_ATOP_EXT.valueOf(), VkBlendOp.VK_BLEND_OP_DST_ATOP_EXT.toString() + " has an unexpected value.");
        assertEquals(1000148011, VkBlendOp.VK_BLEND_OP_XOR_EXT.valueOf(), VkBlendOp.VK_BLEND_OP_XOR_EXT.toString() + " has an unexpected value.");
        assertEquals(1000148012, VkBlendOp.VK_BLEND_OP_MULTIPLY_EXT.valueOf(), VkBlendOp.VK_BLEND_OP_MULTIPLY_EXT.toString() + " has an unexpected value.");
        assertEquals(1000148013, VkBlendOp.VK_BLEND_OP_SCREEN_EXT.valueOf(), VkBlendOp.VK_BLEND_OP_SCREEN_EXT.toString() + " has an unexpected value.");
        assertEquals(1000148014, VkBlendOp.VK_BLEND_OP_OVERLAY_EXT.valueOf(), VkBlendOp.VK_BLEND_OP_OVERLAY_EXT.toString() + " has an unexpected value.");
        assertEquals(1000148015, VkBlendOp.VK_BLEND_OP_DARKEN_EXT.valueOf(), VkBlendOp.VK_BLEND_OP_DARKEN_EXT.toString() + " has an unexpected value.");
        assertEquals(1000148016, VkBlendOp.VK_BLEND_OP_LIGHTEN_EXT.valueOf(), VkBlendOp.VK_BLEND_OP_LIGHTEN_EXT.toString() + " has an unexpected value.");
        assertEquals(1000148017, VkBlendOp.VK_BLEND_OP_COLORDODGE_EXT.valueOf(), VkBlendOp.VK_BLEND_OP_COLORDODGE_EXT.toString() + " has an unexpected value.");
        assertEquals(1000148018, VkBlendOp.VK_BLEND_OP_COLORBURN_EXT.valueOf(), VkBlendOp.VK_BLEND_OP_COLORBURN_EXT.toString() + " has an unexpected value.");
        assertEquals(1000148019, VkBlendOp.VK_BLEND_OP_HARDLIGHT_EXT.valueOf(), VkBlendOp.VK_BLEND_OP_HARDLIGHT_EXT.toString() + " has an unexpected value.");
        assertEquals(1000148020, VkBlendOp.VK_BLEND_OP_SOFTLIGHT_EXT.valueOf(), VkBlendOp.VK_BLEND_OP_SOFTLIGHT_EXT.toString() + " has an unexpected value.");
        assertEquals(1000148021, VkBlendOp.VK_BLEND_OP_DIFFERENCE_EXT.valueOf(), VkBlendOp.VK_BLEND_OP_DIFFERENCE_EXT.toString() + " has an unexpected value.");
        assertEquals(1000148022, VkBlendOp.VK_BLEND_OP_EXCLUSION_EXT.valueOf(), VkBlendOp.VK_BLEND_OP_EXCLUSION_EXT.toString() + " has an unexpected value.");
        assertEquals(1000148023, VkBlendOp.VK_BLEND_OP_INVERT_EXT.valueOf(), VkBlendOp.VK_BLEND_OP_INVERT_EXT.toString() + " has an unexpected value.");
        assertEquals(1000148024, VkBlendOp.VK_BLEND_OP_INVERT_RGB_EXT.valueOf(), VkBlendOp.VK_BLEND_OP_INVERT_RGB_EXT.toString() + " has an unexpected value.");
        assertEquals(1000148025, VkBlendOp.VK_BLEND_OP_LINEARDODGE_EXT.valueOf(), VkBlendOp.VK_BLEND_OP_LINEARDODGE_EXT.toString() + " has an unexpected value.");
        assertEquals(1000148026, VkBlendOp.VK_BLEND_OP_LINEARBURN_EXT.valueOf(), VkBlendOp.VK_BLEND_OP_LINEARBURN_EXT.toString() + " has an unexpected value.");
        assertEquals(1000148027, VkBlendOp.VK_BLEND_OP_VIVIDLIGHT_EXT.valueOf(), VkBlendOp.VK_BLEND_OP_VIVIDLIGHT_EXT.toString() + " has an unexpected value.");
        assertEquals(1000148028, VkBlendOp.VK_BLEND_OP_LINEARLIGHT_EXT.valueOf(), VkBlendOp.VK_BLEND_OP_LINEARLIGHT_EXT.toString() + " has an unexpected value.");
        assertEquals(1000148029, VkBlendOp.VK_BLEND_OP_PINLIGHT_EXT.valueOf(), VkBlendOp.VK_BLEND_OP_PINLIGHT_EXT.toString() + " has an unexpected value.");
        assertEquals(1000148030, VkBlendOp.VK_BLEND_OP_HARDMIX_EXT.valueOf(), VkBlendOp.VK_BLEND_OP_HARDMIX_EXT.toString() + " has an unexpected value.");
        assertEquals(1000148031, VkBlendOp.VK_BLEND_OP_HSL_HUE_EXT.valueOf(), VkBlendOp.VK_BLEND_OP_HSL_HUE_EXT.toString() + " has an unexpected value.");
        assertEquals(1000148032, VkBlendOp.VK_BLEND_OP_HSL_SATURATION_EXT.valueOf(), VkBlendOp.VK_BLEND_OP_HSL_SATURATION_EXT.toString() + " has an unexpected value.");
        assertEquals(1000148033, VkBlendOp.VK_BLEND_OP_HSL_COLOR_EXT.valueOf(), VkBlendOp.VK_BLEND_OP_HSL_COLOR_EXT.toString() + " has an unexpected value.");
        assertEquals(1000148034, VkBlendOp.VK_BLEND_OP_HSL_LUMINOSITY_EXT.valueOf(), VkBlendOp.VK_BLEND_OP_HSL_LUMINOSITY_EXT.toString() + " has an unexpected value.");
        assertEquals(1000148035, VkBlendOp.VK_BLEND_OP_PLUS_EXT.valueOf(), VkBlendOp.VK_BLEND_OP_PLUS_EXT.toString() + " has an unexpected value.");
        assertEquals(1000148036, VkBlendOp.VK_BLEND_OP_PLUS_CLAMPED_EXT.valueOf(), VkBlendOp.VK_BLEND_OP_PLUS_CLAMPED_EXT.toString() + " has an unexpected value.");
        assertEquals(1000148037, VkBlendOp.VK_BLEND_OP_PLUS_CLAMPED_ALPHA_EXT.valueOf(), VkBlendOp.VK_BLEND_OP_PLUS_CLAMPED_ALPHA_EXT.toString() + " has an unexpected value.");
        assertEquals(1000148038, VkBlendOp.VK_BLEND_OP_PLUS_DARKER_EXT.valueOf(), VkBlendOp.VK_BLEND_OP_PLUS_DARKER_EXT.toString() + " has an unexpected value.");
        assertEquals(1000148039, VkBlendOp.VK_BLEND_OP_MINUS_EXT.valueOf(), VkBlendOp.VK_BLEND_OP_MINUS_EXT.toString() + " has an unexpected value.");
        assertEquals(1000148040, VkBlendOp.VK_BLEND_OP_MINUS_CLAMPED_EXT.valueOf(), VkBlendOp.VK_BLEND_OP_MINUS_CLAMPED_EXT.toString() + " has an unexpected value.");
        assertEquals(1000148041, VkBlendOp.VK_BLEND_OP_CONTRAST_EXT.valueOf(), VkBlendOp.VK_BLEND_OP_CONTRAST_EXT.toString() + " has an unexpected value.");
        assertEquals(1000148042, VkBlendOp.VK_BLEND_OP_INVERT_OVG_EXT.valueOf(), VkBlendOp.VK_BLEND_OP_INVERT_OVG_EXT.toString() + " has an unexpected value.");
        assertEquals(1000148043, VkBlendOp.VK_BLEND_OP_RED_EXT.valueOf(), VkBlendOp.VK_BLEND_OP_RED_EXT.toString() + " has an unexpected value.");
        assertEquals(1000148044, VkBlendOp.VK_BLEND_OP_GREEN_EXT.valueOf(), VkBlendOp.VK_BLEND_OP_GREEN_EXT.toString() + " has an unexpected value.");
        assertEquals(1000148045, VkBlendOp.VK_BLEND_OP_BLUE_EXT.valueOf(), VkBlendOp.VK_BLEND_OP_BLUE_EXT.toString() + " has an unexpected value.");
        assertEquals(VkBlendOp.VK_BLEND_OP_ADD.valueOf(), VkBlendOp.VK_BLEND_OP_BEGIN_RANGE.valueOf(), VkBlendOp.VK_BLEND_OP_BEGIN_RANGE.toString() + " has an unexpected value.");
        assertEquals(VkBlendOp.VK_BLEND_OP_MAX.valueOf(), VkBlendOp.VK_BLEND_OP_END_RANGE.valueOf(), VkBlendOp.VK_BLEND_OP_END_RANGE.toString() + " has an unexpected value.");
        assertEquals((VkBlendOp.VK_BLEND_OP_MAX.valueOf() - VkBlendOp.VK_BLEND_OP_ADD.valueOf() + 1), VkBlendOp.VK_BLEND_OP_RANGE_SIZE.valueOf(), VkBlendOp.VK_BLEND_OP_RANGE_SIZE.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkBlendOp.VK_BLEND_OP_MAX_ENUM.valueOf(), VkBlendOp.VK_BLEND_OP_MAX_ENUM.toString() + " has an unexpected value.");
    }
}
