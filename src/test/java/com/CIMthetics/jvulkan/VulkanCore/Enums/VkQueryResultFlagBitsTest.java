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

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkQueryResultFlagBits;

class VkQueryResultFlagBitsTest
{
    @Test
    void testNumberOfElements()
    {
        VkQueryResultFlagBits[] values = VkQueryResultFlagBits.values();
        assertEquals(5, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }


    @Test
    void testValues()
    {
        assertEquals(0x00000001, VkQueryResultFlagBits.VK_QUERY_RESULT_64_BIT.valueOf(), VkQueryResultFlagBits.VK_QUERY_RESULT_64_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000002, VkQueryResultFlagBits.VK_QUERY_RESULT_WAIT_BIT.valueOf(), VkQueryResultFlagBits.VK_QUERY_RESULT_WAIT_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000004, VkQueryResultFlagBits.VK_QUERY_RESULT_WITH_AVAILABILITY_BIT.valueOf(), VkQueryResultFlagBits.VK_QUERY_RESULT_WITH_AVAILABILITY_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000008, VkQueryResultFlagBits.VK_QUERY_RESULT_PARTIAL_BIT.valueOf(), VkQueryResultFlagBits.VK_QUERY_RESULT_PARTIAL_BIT.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkQueryResultFlagBits.VK_QUERY_RESULT_FLAG_BITS_MAX_ENUM.valueOf(), VkQueryResultFlagBits.VK_QUERY_RESULT_FLAG_BITS_MAX_ENUM.toString() + " has an unexpected value.");
    }
}
