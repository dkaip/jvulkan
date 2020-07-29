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

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkExternalSemaphoreFeatureFlagBits;

class VkExternalSemaphoreFeatureFlagBitsTest
{
    @Test
    void testNumberOfElements()
    {
        VkExternalSemaphoreFeatureFlagBits[] values = VkExternalSemaphoreFeatureFlagBits.values();
        assertEquals(5, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }


    @Test
    void testValues()
    {
        assertEquals(0x00000001, VkExternalSemaphoreFeatureFlagBits.VK_EXTERNAL_SEMAPHORE_FEATURE_EXPORTABLE_BIT.valueOf(), VkExternalSemaphoreFeatureFlagBits.VK_EXTERNAL_SEMAPHORE_FEATURE_EXPORTABLE_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000002, VkExternalSemaphoreFeatureFlagBits.VK_EXTERNAL_SEMAPHORE_FEATURE_IMPORTABLE_BIT.valueOf(), VkExternalSemaphoreFeatureFlagBits.VK_EXTERNAL_SEMAPHORE_FEATURE_IMPORTABLE_BIT.toString() + " has an unexpected value.");
        assertEquals(VkExternalSemaphoreFeatureFlagBits.VK_EXTERNAL_SEMAPHORE_FEATURE_EXPORTABLE_BIT.valueOf(), VkExternalSemaphoreFeatureFlagBits.VK_EXTERNAL_SEMAPHORE_FEATURE_EXPORTABLE_BIT_KHR.valueOf(), VkExternalSemaphoreFeatureFlagBits.VK_EXTERNAL_SEMAPHORE_FEATURE_EXPORTABLE_BIT_KHR.toString() + " has an unexpected value.");
        assertEquals(VkExternalSemaphoreFeatureFlagBits.VK_EXTERNAL_SEMAPHORE_FEATURE_IMPORTABLE_BIT.valueOf(), VkExternalSemaphoreFeatureFlagBits.VK_EXTERNAL_SEMAPHORE_FEATURE_IMPORTABLE_BIT_KHR.valueOf(), VkExternalSemaphoreFeatureFlagBits.VK_EXTERNAL_SEMAPHORE_FEATURE_IMPORTABLE_BIT_KHR.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkExternalSemaphoreFeatureFlagBits.VK_EXTERNAL_SEMAPHORE_FEATURE_FLAG_BITS_MAX_ENUM.valueOf(), VkExternalSemaphoreFeatureFlagBits.VK_EXTERNAL_SEMAPHORE_FEATURE_FLAG_BITS_MAX_ENUM.toString() + " has an unexpected value.");
    }
}
