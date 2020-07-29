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

import com.CIMthetics.jvulkan.VulkanExtensions.Enums.VkValidationCheckEXT;

class VkValidationCheckEXTTest
{
    @Test
    void testNumberOfElements()
    {
        VkValidationCheckEXT[] values = VkValidationCheckEXT.values();
        assertEquals(6, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }


    @Test
    void testValues()
    {
        assertEquals(0, VkValidationCheckEXT.VK_VALIDATION_CHECK_ALL_EXT.valueOf(), VkValidationCheckEXT.VK_VALIDATION_CHECK_ALL_EXT.toString() + " has an unexpected value.");
        assertEquals(1, VkValidationCheckEXT.VK_VALIDATION_CHECK_SHADERS_EXT.valueOf(), VkValidationCheckEXT.VK_VALIDATION_CHECK_SHADERS_EXT.toString() + " has an unexpected value.");
        assertEquals(VkValidationCheckEXT.VK_VALIDATION_CHECK_ALL_EXT.valueOf(), VkValidationCheckEXT.VK_VALIDATION_CHECK_BEGIN_RANGE_EXT.valueOf(), VkValidationCheckEXT.VK_VALIDATION_CHECK_BEGIN_RANGE_EXT.toString() + " has an unexpected value.");
        assertEquals(VkValidationCheckEXT.VK_VALIDATION_CHECK_SHADERS_EXT.valueOf(), VkValidationCheckEXT.VK_VALIDATION_CHECK_END_RANGE_EXT.valueOf(), VkValidationCheckEXT.VK_VALIDATION_CHECK_END_RANGE_EXT.toString() + " has an unexpected value.");
        assertEquals((VkValidationCheckEXT.VK_VALIDATION_CHECK_SHADERS_EXT.valueOf() - VkValidationCheckEXT.VK_VALIDATION_CHECK_ALL_EXT.valueOf() + 1), VkValidationCheckEXT.VK_VALIDATION_CHECK_RANGE_SIZE_EXT.valueOf(), VkValidationCheckEXT.VK_VALIDATION_CHECK_RANGE_SIZE_EXT.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkValidationCheckEXT.VK_VALIDATION_CHECK_MAX_ENUM_EXT.valueOf(), VkValidationCheckEXT.VK_VALIDATION_CHECK_MAX_ENUM_EXT.toString() + " has an unexpected value.");
    }
}
