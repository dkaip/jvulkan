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

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkBlendFactor;

class VkBlendFactorTest
{
    @Test
    void testNumberOfElements()
    {
        VkBlendFactor[] values = VkBlendFactor.values();
        assertEquals(23, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }


    @Test
    void testValues()
    {
        assertEquals(0, VkBlendFactor.VK_BLEND_FACTOR_ZERO.valueOf(), VkBlendFactor.VK_BLEND_FACTOR_ZERO.toString() + " has an unexpected value.");
        assertEquals(1, VkBlendFactor.VK_BLEND_FACTOR_ONE.valueOf(), VkBlendFactor.VK_BLEND_FACTOR_ONE.toString() + " has an unexpected value.");
        assertEquals(2, VkBlendFactor.VK_BLEND_FACTOR_SRC_COLOR.valueOf(), VkBlendFactor.VK_BLEND_FACTOR_SRC_COLOR.toString() + " has an unexpected value.");
        assertEquals(3, VkBlendFactor.VK_BLEND_FACTOR_ONE_MINUS_SRC_COLOR.valueOf(), VkBlendFactor.VK_BLEND_FACTOR_ONE_MINUS_SRC_COLOR.toString() + " has an unexpected value.");
        assertEquals(4, VkBlendFactor.VK_BLEND_FACTOR_DST_COLOR.valueOf(), VkBlendFactor.VK_BLEND_FACTOR_DST_COLOR.toString() + " has an unexpected value.");
        assertEquals(5, VkBlendFactor.VK_BLEND_FACTOR_ONE_MINUS_DST_COLOR.valueOf(), VkBlendFactor.VK_BLEND_FACTOR_ONE_MINUS_DST_COLOR.toString() + " has an unexpected value.");
        assertEquals(6, VkBlendFactor.VK_BLEND_FACTOR_SRC_ALPHA.valueOf(), VkBlendFactor.VK_BLEND_FACTOR_SRC_ALPHA.toString() + " has an unexpected value.");
        assertEquals(7, VkBlendFactor.VK_BLEND_FACTOR_ONE_MINUS_SRC_ALPHA.valueOf(), VkBlendFactor.VK_BLEND_FACTOR_ONE_MINUS_SRC_ALPHA.toString() + " has an unexpected value.");
        assertEquals(8, VkBlendFactor.VK_BLEND_FACTOR_DST_ALPHA.valueOf(), VkBlendFactor.VK_BLEND_FACTOR_DST_ALPHA.toString() + " has an unexpected value.");
        assertEquals(9, VkBlendFactor.VK_BLEND_FACTOR_ONE_MINUS_DST_ALPHA.valueOf(), VkBlendFactor.VK_BLEND_FACTOR_ONE_MINUS_DST_ALPHA.toString() + " has an unexpected value.");
        assertEquals(10, VkBlendFactor.VK_BLEND_FACTOR_CONSTANT_COLOR.valueOf(), VkBlendFactor.VK_BLEND_FACTOR_CONSTANT_COLOR.toString() + " has an unexpected value.");
        assertEquals(11, VkBlendFactor.VK_BLEND_FACTOR_ONE_MINUS_CONSTANT_COLOR.valueOf(), VkBlendFactor.VK_BLEND_FACTOR_ONE_MINUS_CONSTANT_COLOR.toString() + " has an unexpected value.");
        assertEquals(12, VkBlendFactor.VK_BLEND_FACTOR_CONSTANT_ALPHA.valueOf(), VkBlendFactor.VK_BLEND_FACTOR_CONSTANT_ALPHA.toString() + " has an unexpected value.");
        assertEquals(13, VkBlendFactor.VK_BLEND_FACTOR_ONE_MINUS_CONSTANT_ALPHA.valueOf(), VkBlendFactor.VK_BLEND_FACTOR_ONE_MINUS_CONSTANT_ALPHA.toString() + " has an unexpected value.");
        assertEquals(14, VkBlendFactor.VK_BLEND_FACTOR_SRC_ALPHA_SATURATE.valueOf(), VkBlendFactor.VK_BLEND_FACTOR_SRC_ALPHA_SATURATE.toString() + " has an unexpected value.");
        assertEquals(15, VkBlendFactor.VK_BLEND_FACTOR_SRC1_COLOR.valueOf(), VkBlendFactor.VK_BLEND_FACTOR_SRC1_COLOR.toString() + " has an unexpected value.");
        assertEquals(16, VkBlendFactor.VK_BLEND_FACTOR_ONE_MINUS_SRC1_COLOR.valueOf(), VkBlendFactor.VK_BLEND_FACTOR_ONE_MINUS_SRC1_COLOR.toString() + " has an unexpected value.");
        assertEquals(17, VkBlendFactor.VK_BLEND_FACTOR_SRC1_ALPHA.valueOf(), VkBlendFactor.VK_BLEND_FACTOR_SRC1_ALPHA.toString() + " has an unexpected value.");
        assertEquals(18, VkBlendFactor.VK_BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA.valueOf(), VkBlendFactor.VK_BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA.toString() + " has an unexpected value.");
        assertEquals(VkBlendFactor.VK_BLEND_FACTOR_ZERO.valueOf(), VkBlendFactor.VK_BLEND_FACTOR_BEGIN_RANGE.valueOf(), VkBlendFactor.VK_BLEND_FACTOR_BEGIN_RANGE.toString() + " has an unexpected value.");
        assertEquals(VkBlendFactor.VK_BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA.valueOf(), VkBlendFactor.VK_BLEND_FACTOR_END_RANGE.valueOf(), VkBlendFactor.VK_BLEND_FACTOR_END_RANGE.toString() + " has an unexpected value.");
        assertEquals((VkBlendFactor.VK_BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA.valueOf() - VkBlendFactor.VK_BLEND_FACTOR_ZERO.valueOf() + 1), VkBlendFactor.VK_BLEND_FACTOR_RANGE_SIZE.valueOf(), VkBlendFactor.VK_BLEND_FACTOR_RANGE_SIZE.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkBlendFactor.VK_BLEND_FACTOR_MAX_ENUM.valueOf(), VkBlendFactor.VK_BLEND_FACTOR_MAX_ENUM.toString() + " has an unexpected value.");
    }
}
