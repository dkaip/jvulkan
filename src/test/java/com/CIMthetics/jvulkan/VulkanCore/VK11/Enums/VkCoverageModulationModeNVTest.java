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

class VkCoverageModulationModeNVTest
{
    @Test
    void testNumberOfElements()
    {
        VkCoverageModulationModeNV[] values = VkCoverageModulationModeNV.values();
        assertEquals(8, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }


    @Test
    void testValues()
    {
        assertEquals(0, VkCoverageModulationModeNV.VK_COVERAGE_MODULATION_MODE_NONE_NV.valueOf(), VkCoverageModulationModeNV.VK_COVERAGE_MODULATION_MODE_NONE_NV.toString() + " has an unexpected value.");
        assertEquals(1, VkCoverageModulationModeNV.VK_COVERAGE_MODULATION_MODE_RGB_NV.valueOf(), VkCoverageModulationModeNV.VK_COVERAGE_MODULATION_MODE_RGB_NV.toString() + " has an unexpected value.");
        assertEquals(2, VkCoverageModulationModeNV.VK_COVERAGE_MODULATION_MODE_ALPHA_NV.valueOf(), VkCoverageModulationModeNV.VK_COVERAGE_MODULATION_MODE_ALPHA_NV.toString() + " has an unexpected value.");
        assertEquals(3, VkCoverageModulationModeNV.VK_COVERAGE_MODULATION_MODE_RGBA_NV.valueOf(), VkCoverageModulationModeNV.VK_COVERAGE_MODULATION_MODE_RGBA_NV.toString() + " has an unexpected value.");
        assertEquals(VkCoverageModulationModeNV.VK_COVERAGE_MODULATION_MODE_NONE_NV.valueOf(), VkCoverageModulationModeNV.VK_COVERAGE_MODULATION_MODE_BEGIN_RANGE_NV.valueOf(), VkCoverageModulationModeNV.VK_COVERAGE_MODULATION_MODE_BEGIN_RANGE_NV.toString() + " has an unexpected value.");
        assertEquals(VkCoverageModulationModeNV.VK_COVERAGE_MODULATION_MODE_RGBA_NV.valueOf(), VkCoverageModulationModeNV.VK_COVERAGE_MODULATION_MODE_END_RANGE_NV.valueOf(), VkCoverageModulationModeNV.VK_COVERAGE_MODULATION_MODE_END_RANGE_NV.toString() + " has an unexpected value.");
        assertEquals((VkCoverageModulationModeNV.VK_COVERAGE_MODULATION_MODE_RGBA_NV.valueOf() - VkCoverageModulationModeNV.VK_COVERAGE_MODULATION_MODE_NONE_NV.valueOf() + 1), VkCoverageModulationModeNV.VK_COVERAGE_MODULATION_MODE_RANGE_SIZE_NV.valueOf(), VkCoverageModulationModeNV.VK_COVERAGE_MODULATION_MODE_RANGE_SIZE_NV.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkCoverageModulationModeNV.VK_COVERAGE_MODULATION_MODE_MAX_ENUM_NV.valueOf(), VkCoverageModulationModeNV.VK_COVERAGE_MODULATION_MODE_MAX_ENUM_NV.toString() + " has an unexpected value.");
    }
}
