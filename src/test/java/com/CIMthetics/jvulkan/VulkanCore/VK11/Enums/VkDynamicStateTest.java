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
package com.CIMthetics.jvulkan.VulkanCore.VK11.Enums;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VkDynamicStateTest
{
    @Test
    void testNumberOfElements()
    {
        VkDynamicState[] values = VkDynamicState.values();
        assertEquals(19, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }


    @Test
    void testValues()
    {
        assertEquals(0, VkDynamicState.VK_DYNAMIC_STATE_VIEWPORT.valueOf(), VkDynamicState.VK_DYNAMIC_STATE_VIEWPORT.toString() + " has an unexpected value.");
        assertEquals(1, VkDynamicState.VK_DYNAMIC_STATE_SCISSOR.valueOf(), VkDynamicState.VK_DYNAMIC_STATE_SCISSOR.toString() + " has an unexpected value.");
        assertEquals(2, VkDynamicState.VK_DYNAMIC_STATE_LINE_WIDTH.valueOf(), VkDynamicState.VK_DYNAMIC_STATE_LINE_WIDTH.toString() + " has an unexpected value.");
        assertEquals(3, VkDynamicState.VK_DYNAMIC_STATE_DEPTH_BIAS.valueOf(), VkDynamicState.VK_DYNAMIC_STATE_DEPTH_BIAS.toString() + " has an unexpected value.");
        assertEquals(4, VkDynamicState.VK_DYNAMIC_STATE_BLEND_CONSTANTS.valueOf(), VkDynamicState.VK_DYNAMIC_STATE_BLEND_CONSTANTS.toString() + " has an unexpected value.");
        assertEquals(5, VkDynamicState.VK_DYNAMIC_STATE_DEPTH_BOUNDS.valueOf(), VkDynamicState.VK_DYNAMIC_STATE_DEPTH_BOUNDS.toString() + " has an unexpected value.");
        assertEquals(6, VkDynamicState.VK_DYNAMIC_STATE_STENCIL_COMPARE_MASK.valueOf(), VkDynamicState.VK_DYNAMIC_STATE_STENCIL_COMPARE_MASK.toString() + " has an unexpected value.");
        assertEquals(7, VkDynamicState.VK_DYNAMIC_STATE_STENCIL_WRITE_MASK.valueOf(), VkDynamicState.VK_DYNAMIC_STATE_STENCIL_WRITE_MASK.toString() + " has an unexpected value.");
        assertEquals(8, VkDynamicState.VK_DYNAMIC_STATE_STENCIL_REFERENCE.valueOf(), VkDynamicState.VK_DYNAMIC_STATE_STENCIL_REFERENCE.toString() + " has an unexpected value.");
        assertEquals(1000087000, VkDynamicState.VK_DYNAMIC_STATE_VIEWPORT_W_SCALING_NV.valueOf(), VkDynamicState.VK_DYNAMIC_STATE_VIEWPORT_W_SCALING_NV.toString() + " has an unexpected value.");
        assertEquals(1000099000, VkDynamicState.VK_DYNAMIC_STATE_DISCARD_RECTANGLE_EXT.valueOf(), VkDynamicState.VK_DYNAMIC_STATE_DISCARD_RECTANGLE_EXT.toString() + " has an unexpected value.");
        assertEquals(1000143000, VkDynamicState.VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT.valueOf(), VkDynamicState.VK_DYNAMIC_STATE_SAMPLE_LOCATIONS_EXT.toString() + " has an unexpected value.");
        assertEquals(1000164004, VkDynamicState.VK_DYNAMIC_STATE_VIEWPORT_SHADING_RATE_PALETTE_NV.valueOf(), VkDynamicState.VK_DYNAMIC_STATE_VIEWPORT_SHADING_RATE_PALETTE_NV.toString() + " has an unexpected value.");
        assertEquals(1000164006, VkDynamicState.VK_DYNAMIC_STATE_VIEWPORT_COARSE_SAMPLE_ORDER_NV.valueOf(), VkDynamicState.VK_DYNAMIC_STATE_VIEWPORT_COARSE_SAMPLE_ORDER_NV.toString() + " has an unexpected value.");
        assertEquals(1000205001, VkDynamicState.VK_DYNAMIC_STATE_EXCLUSIVE_SCISSOR_NV.valueOf(), VkDynamicState.VK_DYNAMIC_STATE_EXCLUSIVE_SCISSOR_NV.toString() + " has an unexpected value.");
        assertEquals(VkDynamicState.VK_DYNAMIC_STATE_VIEWPORT.valueOf(), VkDynamicState.VK_DYNAMIC_STATE_BEGIN_RANGE.valueOf(), VkDynamicState.VK_DYNAMIC_STATE_BEGIN_RANGE.toString() + " has an unexpected value.");
        assertEquals(VkDynamicState.VK_DYNAMIC_STATE_STENCIL_REFERENCE.valueOf(), VkDynamicState.VK_DYNAMIC_STATE_END_RANGE.valueOf(), VkDynamicState.VK_DYNAMIC_STATE_END_RANGE.toString() + " has an unexpected value.");
        assertEquals((VkDynamicState.VK_DYNAMIC_STATE_STENCIL_REFERENCE.valueOf() - VkDynamicState.VK_DYNAMIC_STATE_VIEWPORT.valueOf() + 1), VkDynamicState.VK_DYNAMIC_STATE_RANGE_SIZE.valueOf(), VkDynamicState.VK_DYNAMIC_STATE_RANGE_SIZE.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkDynamicState.VK_DYNAMIC_STATE_MAX_ENUM.valueOf(), VkDynamicState.VK_DYNAMIC_STATE_MAX_ENUM.toString() + " has an unexpected value.");
    }
}
