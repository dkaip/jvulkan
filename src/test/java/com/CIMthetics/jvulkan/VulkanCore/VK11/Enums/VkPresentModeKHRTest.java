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

class VkPresentModeKHRTest
{
    @Test
    void testNumberOfElements()
    {
        VkPresentModeKHR[] values = VkPresentModeKHR.values();
        assertEquals(10, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }


    @Test
    void testValues()
    {
        assertEquals(0, VkPresentModeKHR.VK_PRESENT_MODE_IMMEDIATE_KHR.valueOf(), VkPresentModeKHR.VK_PRESENT_MODE_IMMEDIATE_KHR.toString() + " has an unexpected value.");
        assertEquals(1, VkPresentModeKHR.VK_PRESENT_MODE_MAILBOX_KHR.valueOf(), VkPresentModeKHR.VK_PRESENT_MODE_MAILBOX_KHR.toString() + " has an unexpected value.");
        assertEquals(2, VkPresentModeKHR.VK_PRESENT_MODE_FIFO_KHR.valueOf(), VkPresentModeKHR.VK_PRESENT_MODE_FIFO_KHR.toString() + " has an unexpected value.");
        assertEquals(3, VkPresentModeKHR.VK_PRESENT_MODE_FIFO_RELAXED_KHR.valueOf(), VkPresentModeKHR.VK_PRESENT_MODE_FIFO_RELAXED_KHR.toString() + " has an unexpected value.");
        assertEquals(1000111000, VkPresentModeKHR.VK_PRESENT_MODE_SHARED_DEMAND_REFRESH_KHR.valueOf(), VkPresentModeKHR.VK_PRESENT_MODE_SHARED_DEMAND_REFRESH_KHR.toString() + " has an unexpected value.");
        assertEquals(1000111001, VkPresentModeKHR.VK_PRESENT_MODE_SHARED_CONTINUOUS_REFRESH_KHR.valueOf(), VkPresentModeKHR.VK_PRESENT_MODE_SHARED_CONTINUOUS_REFRESH_KHR.toString() + " has an unexpected value.");
        assertEquals(VkPresentModeKHR.VK_PRESENT_MODE_IMMEDIATE_KHR.valueOf(), VkPresentModeKHR.VK_PRESENT_MODE_BEGIN_RANGE_KHR.valueOf(), VkPresentModeKHR.VK_PRESENT_MODE_BEGIN_RANGE_KHR.toString() + " has an unexpected value.");
        assertEquals(VkPresentModeKHR.VK_PRESENT_MODE_FIFO_RELAXED_KHR.valueOf(), VkPresentModeKHR.VK_PRESENT_MODE_END_RANGE_KHR.valueOf(), VkPresentModeKHR.VK_PRESENT_MODE_END_RANGE_KHR.toString() + " has an unexpected value.");
        assertEquals((VkPresentModeKHR.VK_PRESENT_MODE_FIFO_RELAXED_KHR.valueOf() - VkPresentModeKHR.VK_PRESENT_MODE_IMMEDIATE_KHR.valueOf() + 1), VkPresentModeKHR.VK_PRESENT_MODE_RANGE_SIZE_KHR.valueOf(), VkPresentModeKHR.VK_PRESENT_MODE_RANGE_SIZE_KHR.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkPresentModeKHR.VK_PRESENT_MODE_MAX_ENUM_KHR.valueOf(), VkPresentModeKHR.VK_PRESENT_MODE_MAX_ENUM_KHR.toString() + " has an unexpected value.");
    }
}
