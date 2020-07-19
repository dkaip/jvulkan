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

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkSamplerAddressMode;

class VkSamplerAddressModeTest
{
    @Test
    void testNumberOfElements()
    {
        VkSamplerAddressMode[] values = VkSamplerAddressMode.values();
        assertEquals(9, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }


    @Test
    void testValues()
    {
        assertEquals(0, VkSamplerAddressMode.VK_SAMPLER_ADDRESS_MODE_REPEAT.valueOf(), VkSamplerAddressMode.VK_SAMPLER_ADDRESS_MODE_REPEAT.toString() + " has an unexpected value.");
        assertEquals(1, VkSamplerAddressMode.VK_SAMPLER_ADDRESS_MODE_MIRRORED_REPEAT.valueOf(), VkSamplerAddressMode.VK_SAMPLER_ADDRESS_MODE_MIRRORED_REPEAT.toString() + " has an unexpected value.");
        assertEquals(2, VkSamplerAddressMode.VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE.valueOf(), VkSamplerAddressMode.VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_EDGE.toString() + " has an unexpected value.");
        assertEquals(3, VkSamplerAddressMode.VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_BORDER.valueOf(), VkSamplerAddressMode.VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_BORDER.toString() + " has an unexpected value.");
        assertEquals(4, VkSamplerAddressMode.VK_SAMPLER_ADDRESS_MODE_MIRROR_CLAMP_TO_EDGE.valueOf(), VkSamplerAddressMode.VK_SAMPLER_ADDRESS_MODE_MIRROR_CLAMP_TO_EDGE.toString() + " has an unexpected value.");
        assertEquals(VkSamplerAddressMode.VK_SAMPLER_ADDRESS_MODE_REPEAT.valueOf(), VkSamplerAddressMode.VK_SAMPLER_ADDRESS_MODE_BEGIN_RANGE.valueOf(), VkSamplerAddressMode.VK_SAMPLER_ADDRESS_MODE_BEGIN_RANGE.toString() + " has an unexpected value.");
        assertEquals(VkSamplerAddressMode.VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_BORDER.valueOf(), VkSamplerAddressMode.VK_SAMPLER_ADDRESS_MODE_END_RANGE.valueOf(), VkSamplerAddressMode.VK_SAMPLER_ADDRESS_MODE_END_RANGE.toString() + " has an unexpected value.");
        assertEquals((VkSamplerAddressMode.VK_SAMPLER_ADDRESS_MODE_CLAMP_TO_BORDER.valueOf() - VkSamplerAddressMode.VK_SAMPLER_ADDRESS_MODE_REPEAT.valueOf() + 1), VkSamplerAddressMode.VK_SAMPLER_ADDRESS_MODE_RANGE_SIZE.valueOf(), VkSamplerAddressMode.VK_SAMPLER_ADDRESS_MODE_RANGE_SIZE.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkSamplerAddressMode.VK_SAMPLER_ADDRESS_MODE_MAX_ENUM.valueOf(), VkSamplerAddressMode.VK_SAMPLER_ADDRESS_MODE_MAX_ENUM.toString() + " has an unexpected value.");
    }
}
