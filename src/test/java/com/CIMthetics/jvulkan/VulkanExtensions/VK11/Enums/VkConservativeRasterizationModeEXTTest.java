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

class VkConservativeRasterizationModeEXTTest
{
    @Test
    void testNumberOfElements()
    {
        VkConservativeRasterizationModeEXT[] values = VkConservativeRasterizationModeEXT.values();
        assertEquals(7, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }


    @Test
    void testValues()
    {
        assertEquals(0, VkConservativeRasterizationModeEXT.VK_CONSERVATIVE_RASTERIZATION_MODE_DISABLED_EXT.valueOf(), VkConservativeRasterizationModeEXT.VK_CONSERVATIVE_RASTERIZATION_MODE_DISABLED_EXT.toString() + " has an unexpected value.");
        assertEquals(1, VkConservativeRasterizationModeEXT.VK_CONSERVATIVE_RASTERIZATION_MODE_OVERESTIMATE_EXT.valueOf(), VkConservativeRasterizationModeEXT.VK_CONSERVATIVE_RASTERIZATION_MODE_OVERESTIMATE_EXT.toString() + " has an unexpected value.");
        assertEquals(2, VkConservativeRasterizationModeEXT.VK_CONSERVATIVE_RASTERIZATION_MODE_UNDERESTIMATE_EXT.valueOf(), VkConservativeRasterizationModeEXT.VK_CONSERVATIVE_RASTERIZATION_MODE_UNDERESTIMATE_EXT.toString() + " has an unexpected value.");
        assertEquals(VkConservativeRasterizationModeEXT.VK_CONSERVATIVE_RASTERIZATION_MODE_DISABLED_EXT.valueOf(), VkConservativeRasterizationModeEXT.VK_CONSERVATIVE_RASTERIZATION_MODE_BEGIN_RANGE_EXT.valueOf(), VkConservativeRasterizationModeEXT.VK_CONSERVATIVE_RASTERIZATION_MODE_BEGIN_RANGE_EXT.toString() + " has an unexpected value.");
        assertEquals(VkConservativeRasterizationModeEXT.VK_CONSERVATIVE_RASTERIZATION_MODE_UNDERESTIMATE_EXT.valueOf(), VkConservativeRasterizationModeEXT.VK_CONSERVATIVE_RASTERIZATION_MODE_END_RANGE_EXT.valueOf(), VkConservativeRasterizationModeEXT.VK_CONSERVATIVE_RASTERIZATION_MODE_END_RANGE_EXT.toString() + " has an unexpected value.");
        assertEquals((VkConservativeRasterizationModeEXT.VK_CONSERVATIVE_RASTERIZATION_MODE_UNDERESTIMATE_EXT.valueOf() - VkConservativeRasterizationModeEXT.VK_CONSERVATIVE_RASTERIZATION_MODE_DISABLED_EXT.valueOf() + 1), VkConservativeRasterizationModeEXT.VK_CONSERVATIVE_RASTERIZATION_MODE_RANGE_SIZE_EXT.valueOf(), VkConservativeRasterizationModeEXT.VK_CONSERVATIVE_RASTERIZATION_MODE_RANGE_SIZE_EXT.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkConservativeRasterizationModeEXT.VK_CONSERVATIVE_RASTERIZATION_MODE_MAX_ENUM_EXT.valueOf(), VkConservativeRasterizationModeEXT.VK_CONSERVATIVE_RASTERIZATION_MODE_MAX_ENUM_EXT.toString() + " has an unexpected value.");
    }
}
