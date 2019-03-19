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

public enum VkShadingRatePaletteEntryNV
{
    VK_SHADING_RATE_PALETTE_ENTRY_NO_INVOCATIONS_NV(0),
    VK_SHADING_RATE_PALETTE_ENTRY_16_INVOCATIONS_PER_PIXEL_NV(1),
    VK_SHADING_RATE_PALETTE_ENTRY_8_INVOCATIONS_PER_PIXEL_NV(2),
            VK_SHADING_RATE_PALETTE_ENTRY_4_INVOCATIONS_PER_PIXEL_NV(3),
            VK_SHADING_RATE_PALETTE_ENTRY_2_INVOCATIONS_PER_PIXEL_NV(4),
            VK_SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_PIXEL_NV(5),
            VK_SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_2X1_PIXELS_NV(6),
            VK_SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_1X2_PIXELS_NV(7),
            VK_SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_2X2_PIXELS_NV(8),
            VK_SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_4X2_PIXELS_NV(9),
            VK_SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_2X4_PIXELS_NV(10),
            VK_SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_4X4_PIXELS_NV(11),
            VK_SHADING_RATE_PALETTE_ENTRY_BEGIN_RANGE_NV(VK_SHADING_RATE_PALETTE_ENTRY_NO_INVOCATIONS_NV.valueOf()),
            VK_SHADING_RATE_PALETTE_ENTRY_END_RANGE_NV(VK_SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_4X4_PIXELS_NV.valueOf()),
            VK_SHADING_RATE_PALETTE_ENTRY_RANGE_SIZE_NV((VK_SHADING_RATE_PALETTE_ENTRY_1_INVOCATION_PER_4X4_PIXELS_NV.valueOf() - VK_SHADING_RATE_PALETTE_ENTRY_NO_INVOCATIONS_NV.valueOf() + 1)),
            VK_SHADING_RATE_PALETTE_ENTRY_MAX_ENUM_NV(0x7FFFFFFF);

    private int value;
    
    private VkShadingRatePaletteEntryNV(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
