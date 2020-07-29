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
package com.CIMthetics.jvulkan.VulkanExtensions.Enums;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.CIMthetics.jvulkan.VulkanExtensions.Enums.VkValidationFeatureEnableEXT;

class VkValidationFeatureEnableEXTTest
{
    @Test
    void testNumberOfElements()
    {
        VkValidationFeatureEnableEXT[] values = VkValidationFeatureEnableEXT.values();
        assertEquals(6, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }


    @Test
    void testValues()
    {
        assertEquals(0, VkValidationFeatureEnableEXT.VK_VALIDATION_FEATURE_ENABLE_GPU_ASSISTED_EXT.valueOf(), VkValidationFeatureEnableEXT.VK_VALIDATION_FEATURE_ENABLE_GPU_ASSISTED_EXT.toString() + " has an unexpected value.");
        assertEquals(1, VkValidationFeatureEnableEXT.VK_VALIDATION_FEATURE_ENABLE_GPU_ASSISTED_RESERVE_BINDING_SLOT_EXT.valueOf(), VkValidationFeatureEnableEXT.VK_VALIDATION_FEATURE_ENABLE_GPU_ASSISTED_RESERVE_BINDING_SLOT_EXT.toString() + " has an unexpected value.");
        assertEquals(VkValidationFeatureEnableEXT.VK_VALIDATION_FEATURE_ENABLE_GPU_ASSISTED_EXT.valueOf(), VkValidationFeatureEnableEXT.VK_VALIDATION_FEATURE_ENABLE_BEGIN_RANGE_EXT.valueOf(), VkValidationFeatureEnableEXT.VK_VALIDATION_FEATURE_ENABLE_BEGIN_RANGE_EXT.toString() + " has an unexpected value.");
        assertEquals(VkValidationFeatureEnableEXT.VK_VALIDATION_FEATURE_ENABLE_GPU_ASSISTED_RESERVE_BINDING_SLOT_EXT.valueOf(), VkValidationFeatureEnableEXT.VK_VALIDATION_FEATURE_ENABLE_END_RANGE_EXT.valueOf(), VkValidationFeatureEnableEXT.VK_VALIDATION_FEATURE_ENABLE_END_RANGE_EXT.toString() + " has an unexpected value.");
        assertEquals(VkValidationFeatureEnableEXT.VK_VALIDATION_FEATURE_ENABLE_GPU_ASSISTED_RESERVE_BINDING_SLOT_EXT.valueOf() - VkValidationFeatureEnableEXT.VK_VALIDATION_FEATURE_ENABLE_GPU_ASSISTED_EXT.valueOf() + 1, VkValidationFeatureEnableEXT.VK_VALIDATION_FEATURE_ENABLE_RANGE_SIZE_EXT.valueOf(), VkValidationFeatureEnableEXT.VK_VALIDATION_FEATURE_ENABLE_RANGE_SIZE_EXT.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkValidationFeatureEnableEXT.VK_VALIDATION_FEATURE_ENABLE_MAX_ENUM_EXT.valueOf(), VkValidationFeatureEnableEXT.VK_VALIDATION_FEATURE_ENABLE_MAX_ENUM_EXT.toString() + " has an unexpected value.");
    }
}
