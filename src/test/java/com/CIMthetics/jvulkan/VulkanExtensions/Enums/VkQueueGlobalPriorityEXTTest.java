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

import com.CIMthetics.jvulkan.VulkanExtensions.Enums.VkQueueGlobalPriorityEXT;

class VkQueueGlobalPriorityEXTTest
{
    @Test
    void testNumberOfElements()
    {
        VkQueueGlobalPriorityEXT[] values = VkQueueGlobalPriorityEXT.values();
        assertEquals(8, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }


    @Test
    void testValues()
    {
        assertEquals(128, VkQueueGlobalPriorityEXT.VK_QUEUE_GLOBAL_PRIORITY_LOW_EXT.valueOf(), VkQueueGlobalPriorityEXT.VK_QUEUE_GLOBAL_PRIORITY_LOW_EXT.toString() + " has an unexpected value.");
        assertEquals(256, VkQueueGlobalPriorityEXT.VK_QUEUE_GLOBAL_PRIORITY_MEDIUM_EXT.valueOf(), VkQueueGlobalPriorityEXT.VK_QUEUE_GLOBAL_PRIORITY_MEDIUM_EXT.toString() + " has an unexpected value.");
        assertEquals(512, VkQueueGlobalPriorityEXT.VK_QUEUE_GLOBAL_PRIORITY_HIGH_EXT.valueOf(), VkQueueGlobalPriorityEXT.VK_QUEUE_GLOBAL_PRIORITY_HIGH_EXT.toString() + " has an unexpected value.");
        assertEquals(1024, VkQueueGlobalPriorityEXT.VK_QUEUE_GLOBAL_PRIORITY_REALTIME_EXT.valueOf(), VkQueueGlobalPriorityEXT.VK_QUEUE_GLOBAL_PRIORITY_REALTIME_EXT.toString() + " has an unexpected value.");
        assertEquals(VkQueueGlobalPriorityEXT.VK_QUEUE_GLOBAL_PRIORITY_LOW_EXT.valueOf(), VkQueueGlobalPriorityEXT.VK_QUEUE_GLOBAL_PRIORITY_BEGIN_RANGE_EXT.valueOf(), VkQueueGlobalPriorityEXT.VK_QUEUE_GLOBAL_PRIORITY_BEGIN_RANGE_EXT.toString() + " has an unexpected value.");
        assertEquals(VkQueueGlobalPriorityEXT.VK_QUEUE_GLOBAL_PRIORITY_REALTIME_EXT.valueOf(), VkQueueGlobalPriorityEXT.VK_QUEUE_GLOBAL_PRIORITY_END_RANGE_EXT.valueOf(), VkQueueGlobalPriorityEXT.VK_QUEUE_GLOBAL_PRIORITY_END_RANGE_EXT.toString() + " has an unexpected value.");
        assertEquals((VkQueueGlobalPriorityEXT.VK_QUEUE_GLOBAL_PRIORITY_REALTIME_EXT.valueOf() - VkQueueGlobalPriorityEXT.VK_QUEUE_GLOBAL_PRIORITY_LOW_EXT.valueOf() + 1), VkQueueGlobalPriorityEXT.VK_QUEUE_GLOBAL_PRIORITY_RANGE_SIZE_EXT.valueOf(), VkQueueGlobalPriorityEXT.VK_QUEUE_GLOBAL_PRIORITY_RANGE_SIZE_EXT.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkQueueGlobalPriorityEXT.VK_QUEUE_GLOBAL_PRIORITY_MAX_ENUM_EXT.valueOf(), VkQueueGlobalPriorityEXT.VK_QUEUE_GLOBAL_PRIORITY_MAX_ENUM_EXT.toString() + " has an unexpected value.");
    }
}
