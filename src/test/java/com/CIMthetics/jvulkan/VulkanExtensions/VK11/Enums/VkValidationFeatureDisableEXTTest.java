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

class VkValidationFeatureDisableEXTTest
{
    @Test
    void testNumberOfElements()
    {
        VkValidationFeatureDisableEXT[] values = VkValidationFeatureDisableEXT.values();
        assertEquals(11, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }


    @Test
    void testValues()
    {
        assertEquals(0, VkValidationFeatureDisableEXT.VK_VALIDATION_FEATURE_DISABLE_ALL_EXT.valueOf(), VkValidationFeatureDisableEXT.VK_VALIDATION_FEATURE_DISABLE_ALL_EXT.toString() + " has an unexpected value.");
        assertEquals(1, VkValidationFeatureDisableEXT.VK_VALIDATION_FEATURE_DISABLE_SHADERS_EXT.valueOf(), VkValidationFeatureDisableEXT.VK_VALIDATION_FEATURE_DISABLE_SHADERS_EXT.toString() + " has an unexpected value.");
        assertEquals(2, VkValidationFeatureDisableEXT.VK_VALIDATION_FEATURE_DISABLE_THREAD_SAFETY_EXT.valueOf(), VkValidationFeatureDisableEXT.VK_VALIDATION_FEATURE_DISABLE_THREAD_SAFETY_EXT.toString() + " has an unexpected value.");
        assertEquals(3, VkValidationFeatureDisableEXT.VK_VALIDATION_FEATURE_DISABLE_API_PARAMETERS_EXT.valueOf(), VkValidationFeatureDisableEXT.VK_VALIDATION_FEATURE_DISABLE_API_PARAMETERS_EXT.toString() + " has an unexpected value.");
        assertEquals(4, VkValidationFeatureDisableEXT.VK_VALIDATION_FEATURE_DISABLE_OBJECT_LIFETIMES_EXT.valueOf(), VkValidationFeatureDisableEXT.VK_VALIDATION_FEATURE_DISABLE_OBJECT_LIFETIMES_EXT.toString() + " has an unexpected value.");
        assertEquals(5, VkValidationFeatureDisableEXT.VK_VALIDATION_FEATURE_DISABLE_CORE_CHECKS_EXT.valueOf(), VkValidationFeatureDisableEXT.VK_VALIDATION_FEATURE_DISABLE_CORE_CHECKS_EXT.toString() + " has an unexpected value.");
        assertEquals(6, VkValidationFeatureDisableEXT.VK_VALIDATION_FEATURE_DISABLE_UNIQUE_HANDLES_EXT.valueOf(), VkValidationFeatureDisableEXT.VK_VALIDATION_FEATURE_DISABLE_UNIQUE_HANDLES_EXT.toString() + " has an unexpected value.");
        assertEquals(VkValidationFeatureDisableEXT.VK_VALIDATION_FEATURE_DISABLE_ALL_EXT.valueOf(), VkValidationFeatureDisableEXT.VK_VALIDATION_FEATURE_DISABLE_BEGIN_RANGE_EXT.valueOf(), VkValidationFeatureDisableEXT.VK_VALIDATION_FEATURE_DISABLE_BEGIN_RANGE_EXT.toString() + " has an unexpected value.");
        assertEquals(VkValidationFeatureDisableEXT.VK_VALIDATION_FEATURE_DISABLE_UNIQUE_HANDLES_EXT.valueOf(), VkValidationFeatureDisableEXT.VK_VALIDATION_FEATURE_DISABLE_END_RANGE_EXT.valueOf(), VkValidationFeatureDisableEXT.VK_VALIDATION_FEATURE_DISABLE_END_RANGE_EXT.toString() + " has an unexpected value.");
        assertEquals(VkValidationFeatureDisableEXT.VK_VALIDATION_FEATURE_DISABLE_UNIQUE_HANDLES_EXT.valueOf() - VkValidationFeatureDisableEXT.VK_VALIDATION_FEATURE_DISABLE_ALL_EXT.valueOf() + 1, VkValidationFeatureDisableEXT.VK_VALIDATION_FEATURE_DISABLE_RANGE_SIZE_EXT.valueOf(), VkValidationFeatureDisableEXT.VK_VALIDATION_FEATURE_DISABLE_RANGE_SIZE_EXT.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkValidationFeatureDisableEXT.VK_VALIDATION_FEATURE_DISABLE_MAX_ENUM_EXT.valueOf(), VkValidationFeatureDisableEXT.VK_VALIDATION_FEATURE_DISABLE_MAX_ENUM_EXT.toString() + " has an unexpected value.");
    }
}
