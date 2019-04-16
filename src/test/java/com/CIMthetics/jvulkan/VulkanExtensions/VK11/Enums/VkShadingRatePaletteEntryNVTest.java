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

class VkShadingRatePaletteEntryNVTest
{
    @Test
    void testNumberOfElements()
    {
        VkShadingRatePaletteEntryNV[] values = VkShadingRatePaletteEntryNV.values();
        assertEquals(16, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }


    @Test
    void testValues()
    {
        assertEquals(0, VkShadingRatePaletteEntryNV.VK_SHADING_RATE_PALETTE_ENTRY_NO_INVOCATIONS_NV.valueOf(), VkShadingRatePaletteEntryNV.VK_SHADING_RATE_PALETTE_ENTRY_NO_INVOCATIONS_NV.toString() + " has an unexpected value.");
        assertEquals(1, VkShadingRatePaletteEntryNV.VK_SHADING_RATE_PALETTE_ENTRY_16_INVOCATIONS_PER_PIXEL_NV.valueOf(), VkShadingRatePaletteEntryNV.VK_SHADING_RATE_PALETTE_ENTRY_16_INVOCATIONS_PER_PIXEL_NV.toString() + " has an unexpected value.");
        assertEquals(2, VkShadingRatePaletteEntryNV.VK_SHADING_RATE_PALETTE_ENTRY_8_INVOCATIONS_PER_PIXEL_NV.valueOf(), VkShadingRatePaletteEntryNV.VK_SHADING_RATE_PALETTE_ENTRY_8_INVOCATIONS_PER_PIXEL_NV.toString() + " has an unexpected value.");
        assertEquals(3, VkShadingRatePaletteEntryNV.VK_SHADING_RATE_PALETTE_ENTRY_4_INVOCATIONS_PER_PIXEL_NV.valueOf(), VkShadingRatePaletteEntryNV.        VK_SHADING_RATE_PALETTE_ENTRY_4_INVOCATIONS_PER_PIXEL_NV.toString() + " has an unexpected value.");
        assertEquals(4, VkShadingRatePaletteEntryNV.VK_SHADING_RATE_PALETTE_ENTRY_2_INVOCATIONS_PER_PIXEL_NV.valueOf(), VkShadingRatePaletteEntryNV.        VK_SHADING_RATE_PALETTE_ENTRY_2_INVOCATIONS_PER_PIXEL_NV.toString() + " has an unexpected value.");
        assertEquals(5, VkShadingRatePaletteEntryNV.VK_SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_PIXEL_NV.valueOf(), VkShadingRatePaletteEntryNV.        VK_SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_PIXEL_NV.toString() + " has an unexpected value.");
        assertEquals(6, VkShadingRatePaletteEntryNV.VK_SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_2X1_PIXELS_NV.valueOf(), VkShadingRatePaletteEntryNV.        VK_SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_2X1_PIXELS_NV.toString() + " has an unexpected value.");
        assertEquals(7, VkShadingRatePaletteEntryNV.VK_SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_1X2_PIXELS_NV.valueOf(), VkShadingRatePaletteEntryNV.        VK_SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_1X2_PIXELS_NV.toString() + " has an unexpected value.");
        assertEquals(8, VkShadingRatePaletteEntryNV.VK_SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_2X2_PIXELS_NV.valueOf(), VkShadingRatePaletteEntryNV.        VK_SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_2X2_PIXELS_NV.toString() + " has an unexpected value.");
        assertEquals(9, VkShadingRatePaletteEntryNV.VK_SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_4X2_PIXELS_NV.valueOf(), VkShadingRatePaletteEntryNV.        VK_SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_4X2_PIXELS_NV.toString() + " has an unexpected value.");
        assertEquals(10, VkShadingRatePaletteEntryNV.VK_SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_2X4_PIXELS_NV.valueOf(), VkShadingRatePaletteEntryNV.        VK_SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_2X4_PIXELS_NV.toString() + " has an unexpected value.");
        assertEquals(11, VkShadingRatePaletteEntryNV.VK_SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_4X4_PIXELS_NV.valueOf(), VkShadingRatePaletteEntryNV.        VK_SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_4X4_PIXELS_NV.toString() + " has an unexpected value.");
        assertEquals(VkShadingRatePaletteEntryNV.VK_SHADING_RATE_PALETTE_ENTRY_NO_INVOCATIONS_NV.valueOf(), VkShadingRatePaletteEntryNV.        VK_SHADING_RATE_PALETTE_ENTRY_BEGIN_RANGE_NV.valueOf(), VkShadingRatePaletteEntryNV.        VK_SHADING_RATE_PALETTE_ENTRY_BEGIN_RANGE_NV.toString() + " has an unexpected value.");
        assertEquals(VkShadingRatePaletteEntryNV.VK_SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_4X4_PIXELS_NV.valueOf(), VkShadingRatePaletteEntryNV.        VK_SHADING_RATE_PALETTE_ENTRY_END_RANGE_NV.valueOf(), VkShadingRatePaletteEntryNV.        VK_SHADING_RATE_PALETTE_ENTRY_END_RANGE_NV.toString() + " has an unexpected value.");
        assertEquals((VkShadingRatePaletteEntryNV.VK_SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_4X4_PIXELS_NV.valueOf() - VkShadingRatePaletteEntryNV.VK_SHADING_RATE_PALETTE_ENTRY_NO_INVOCATIONS_NV.valueOf() + 1), VkShadingRatePaletteEntryNV.        VK_SHADING_RATE_PALETTE_ENTRY_RANGE_SIZE_NV.valueOf(), VkShadingRatePaletteEntryNV.        VK_SHADING_RATE_PALETTE_ENTRY_RANGE_SIZE_NV.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkShadingRatePaletteEntryNV.        VK_SHADING_RATE_PALETTE_ENTRY_MAX_ENUM_NV.valueOf(), VkShadingRatePaletteEntryNV.        VK_SHADING_RATE_PALETTE_ENTRY_MAX_ENUM_NV.toString() + " has an unexpected value.");
    }
}
