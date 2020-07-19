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

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkSamplerYcbcrRange;

class VkSamplerYcbcrRangeTest
{
    @Test
    void testNumberOfElements()
    {
        VkSamplerYcbcrRange[] values = VkSamplerYcbcrRange.values();
        assertEquals(8, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }


    @Test
    void testValues()
    {
        assertEquals(0, VkSamplerYcbcrRange.VK_SAMPLER_YCBCR_RANGE_ITU_FULL.valueOf(), VkSamplerYcbcrRange.VK_SAMPLER_YCBCR_RANGE_ITU_FULL.toString() + " has an unexpected value.");
        assertEquals(1, VkSamplerYcbcrRange.VK_SAMPLER_YCBCR_RANGE_ITU_NARROW.valueOf(), VkSamplerYcbcrRange.VK_SAMPLER_YCBCR_RANGE_ITU_NARROW.toString() + " has an unexpected value.");
        assertEquals(VkSamplerYcbcrRange.VK_SAMPLER_YCBCR_RANGE_ITU_FULL.valueOf(), VkSamplerYcbcrRange.VK_SAMPLER_YCBCR_RANGE_ITU_FULL_KHR.valueOf(), VkSamplerYcbcrRange.VK_SAMPLER_YCBCR_RANGE_ITU_FULL_KHR.toString() + " has an unexpected value.");
        assertEquals(VkSamplerYcbcrRange.VK_SAMPLER_YCBCR_RANGE_ITU_NARROW.valueOf(), VkSamplerYcbcrRange.VK_SAMPLER_YCBCR_RANGE_ITU_NARROW_KHR.valueOf(), VkSamplerYcbcrRange.VK_SAMPLER_YCBCR_RANGE_ITU_NARROW_KHR.toString() + " has an unexpected value.");
        assertEquals(VkSamplerYcbcrRange.VK_SAMPLER_YCBCR_RANGE_ITU_FULL.valueOf(), VkSamplerYcbcrRange.VK_SAMPLER_YCBCR_RANGE_BEGIN_RANGE.valueOf(), VkSamplerYcbcrRange.VK_SAMPLER_YCBCR_RANGE_BEGIN_RANGE.toString() + " has an unexpected value.");
        assertEquals(VkSamplerYcbcrRange.VK_SAMPLER_YCBCR_RANGE_ITU_NARROW.valueOf(), VkSamplerYcbcrRange.VK_SAMPLER_YCBCR_RANGE_END_RANGE.valueOf(), VkSamplerYcbcrRange.VK_SAMPLER_YCBCR_RANGE_END_RANGE.toString() + " has an unexpected value.");
        assertEquals((VkSamplerYcbcrRange.VK_SAMPLER_YCBCR_RANGE_ITU_NARROW .valueOf()- VkSamplerYcbcrRange.VK_SAMPLER_YCBCR_RANGE_ITU_FULL.valueOf() + 1), VkSamplerYcbcrRange.VK_SAMPLER_YCBCR_RANGE_RANGE_SIZE.valueOf(), VkSamplerYcbcrRange.VK_SAMPLER_YCBCR_RANGE_RANGE_SIZE.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkSamplerYcbcrRange.VK_SAMPLER_YCBCR_RANGE_MAX_ENUM.valueOf(), VkSamplerYcbcrRange.VK_SAMPLER_YCBCR_RANGE_MAX_ENUM.toString() + " has an unexpected value.");
    }
}
