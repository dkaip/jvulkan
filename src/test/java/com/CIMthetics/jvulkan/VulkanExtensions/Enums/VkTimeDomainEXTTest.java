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
package com.CIMthetics.jvulkan.VulkanExtensions.Enums;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.CIMthetics.jvulkan.VulkanExtensions.Enums.VkTimeDomainEXT;

class VkTimeDomainEXTTest
{
    @Test
    void testNumberOfElements()
    {
        VkTimeDomainEXT[] values = VkTimeDomainEXT.values();
        assertEquals(8, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }


    @Test
    void testValues()
    {
        assertEquals(0, VkTimeDomainEXT.VK_TIME_DOMAIN_DEVICE_EXT.valueOf(), VkTimeDomainEXT.VK_TIME_DOMAIN_DEVICE_EXT.toString() + " has an unexpected value.");
        assertEquals(1, VkTimeDomainEXT.VK_TIME_DOMAIN_CLOCK_MONOTONIC_EXT.valueOf(), VkTimeDomainEXT.VK_TIME_DOMAIN_CLOCK_MONOTONIC_EXT.toString() + " has an unexpected value.");
        assertEquals(2, VkTimeDomainEXT.VK_TIME_DOMAIN_CLOCK_MONOTONIC_RAW_EXT.valueOf(), VkTimeDomainEXT.VK_TIME_DOMAIN_CLOCK_MONOTONIC_RAW_EXT.toString() + " has an unexpected value.");
        assertEquals(3, VkTimeDomainEXT.VK_TIME_DOMAIN_QUERY_PERFORMANCE_COUNTER_EXT.valueOf(), VkTimeDomainEXT.VK_TIME_DOMAIN_QUERY_PERFORMANCE_COUNTER_EXT.toString() + " has an unexpected value.");
        assertEquals(VkTimeDomainEXT.VK_TIME_DOMAIN_DEVICE_EXT.valueOf(), VkTimeDomainEXT.VK_TIME_DOMAIN_BEGIN_RANGE_EXT.valueOf(), VkTimeDomainEXT.VK_TIME_DOMAIN_BEGIN_RANGE_EXT.toString() + " has an unexpected value.");
        assertEquals(VkTimeDomainEXT.VK_TIME_DOMAIN_QUERY_PERFORMANCE_COUNTER_EXT.valueOf(), VkTimeDomainEXT.VK_TIME_DOMAIN_END_RANGE_EXT.valueOf(), VkTimeDomainEXT.VK_TIME_DOMAIN_END_RANGE_EXT.toString() + " has an unexpected value.");
        assertEquals(VkTimeDomainEXT.VK_TIME_DOMAIN_QUERY_PERFORMANCE_COUNTER_EXT.valueOf() - VkTimeDomainEXT.VK_TIME_DOMAIN_DEVICE_EXT.valueOf() + 1, VkTimeDomainEXT.VK_TIME_DOMAIN_RANGE_SIZE_EXT.valueOf(), VkTimeDomainEXT.VK_TIME_DOMAIN_RANGE_SIZE_EXT.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkTimeDomainEXT.VK_TIME_DOMAIN_MAX_ENUM_EXT.valueOf(), VkTimeDomainEXT.VK_TIME_DOMAIN_MAX_ENUM_EXT.toString() + " has an unexpected value.");
    }
}
