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

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkChromaLocation;

class VkChromaLocationTest
{
    @Test
    void testNumberOfElements()
    {
        VkChromaLocation[] values = VkChromaLocation.values();
        assertEquals(8, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }


    @Test
    void testValues()
    {
        assertEquals(0, VkChromaLocation.VK_CHROMA_LOCATION_COSITED_EVEN.valueOf(), VkChromaLocation.VK_CHROMA_LOCATION_COSITED_EVEN.toString() + " has an unexpected value.");
        assertEquals(1, VkChromaLocation.VK_CHROMA_LOCATION_MIDPOINT.valueOf(), VkChromaLocation.VK_CHROMA_LOCATION_MIDPOINT.toString() + " has an unexpected value.");
        assertEquals(VkChromaLocation.VK_CHROMA_LOCATION_COSITED_EVEN.valueOf(), VkChromaLocation.VK_CHROMA_LOCATION_COSITED_EVEN_KHR.valueOf(), VkChromaLocation.VK_CHROMA_LOCATION_COSITED_EVEN_KHR.toString() + " has an unexpected value.");
        assertEquals(VkChromaLocation.VK_CHROMA_LOCATION_MIDPOINT.valueOf(), VkChromaLocation.VK_CHROMA_LOCATION_MIDPOINT_KHR.valueOf(), VkChromaLocation.VK_CHROMA_LOCATION_MIDPOINT_KHR.toString() + " has an unexpected value.");
        assertEquals(VkChromaLocation.VK_CHROMA_LOCATION_COSITED_EVEN.valueOf(), VkChromaLocation.VK_CHROMA_LOCATION_BEGIN_RANGE.valueOf(), VkChromaLocation.VK_CHROMA_LOCATION_BEGIN_RANGE.toString() + " has an unexpected value.");
        assertEquals(VkChromaLocation.VK_CHROMA_LOCATION_MIDPOINT.valueOf(), VkChromaLocation.VK_CHROMA_LOCATION_END_RANGE.valueOf(), VkChromaLocation.VK_CHROMA_LOCATION_END_RANGE.toString() + " has an unexpected value.");
        assertEquals((VkChromaLocation.VK_CHROMA_LOCATION_MIDPOINT.valueOf() - VkChromaLocation.VK_CHROMA_LOCATION_COSITED_EVEN.valueOf() + 1), VkChromaLocation.VK_CHROMA_LOCATION_RANGE_SIZE.valueOf(), VkChromaLocation.VK_CHROMA_LOCATION_RANGE_SIZE.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkChromaLocation.VK_CHROMA_LOCATION_MAX_ENUM.valueOf(), VkChromaLocation.VK_CHROMA_LOCATION_MAX_ENUM.toString() + " has an unexpected value.");
    }
}
