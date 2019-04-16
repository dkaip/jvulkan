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

class VkSampleCountFlagBitsTest
{
    @Test
    void testNumberOfElements()
    {
        VkSampleCountFlagBits[] values = VkSampleCountFlagBits.values();
        assertEquals(8, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }


    @Test
    void testValues()
    {
        assertEquals(0x00000001, VkSampleCountFlagBits.VK_SAMPLE_COUNT_1_BIT.valueOf(), VkSampleCountFlagBits.VK_SAMPLE_COUNT_1_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000002, VkSampleCountFlagBits.VK_SAMPLE_COUNT_2_BIT.valueOf(), VkSampleCountFlagBits.VK_SAMPLE_COUNT_2_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000004, VkSampleCountFlagBits.VK_SAMPLE_COUNT_4_BIT.valueOf(), VkSampleCountFlagBits.VK_SAMPLE_COUNT_4_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000008, VkSampleCountFlagBits.VK_SAMPLE_COUNT_8_BIT.valueOf(), VkSampleCountFlagBits.VK_SAMPLE_COUNT_8_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000010, VkSampleCountFlagBits.VK_SAMPLE_COUNT_16_BIT.valueOf(), VkSampleCountFlagBits.VK_SAMPLE_COUNT_16_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000020, VkSampleCountFlagBits.VK_SAMPLE_COUNT_32_BIT.valueOf(), VkSampleCountFlagBits.VK_SAMPLE_COUNT_32_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000040, VkSampleCountFlagBits.VK_SAMPLE_COUNT_64_BIT.valueOf(), VkSampleCountFlagBits.VK_SAMPLE_COUNT_64_BIT.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkSampleCountFlagBits.VK_SAMPLE_COUNT_FLAG_BITS_MAX_ENUM.valueOf(), VkSampleCountFlagBits.VK_SAMPLE_COUNT_FLAG_BITS_MAX_ENUM.toString() + " has an unexpected value.");
    }
}
