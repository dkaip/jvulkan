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

class VkFullScreenExclusiveEXTTest
{
    @Test
    void testNumberOfElements()
    {
        VkFullScreenExclusiveEXT[] values = VkFullScreenExclusiveEXT.values();
        assertEquals(5, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }


    @Test
    void testValues()
    {
        assertEquals(0, VkFullScreenExclusiveEXT.VK_FULL_SCREEN_EXCLUSIVE_DEFAULT_EXT.valueOf(), VkFullScreenExclusiveEXT.VK_FULL_SCREEN_EXCLUSIVE_DEFAULT_EXT.toString() + " has an unexpected value.");
        assertEquals(1, VkFullScreenExclusiveEXT.VK_FULL_SCREEN_EXCLUSIVE_ALLOWED_EXT.valueOf(), VkFullScreenExclusiveEXT.VK_FULL_SCREEN_EXCLUSIVE_ALLOWED_EXT.toString() + " has an unexpected value.");
        assertEquals(2, VkFullScreenExclusiveEXT.VK_FULL_SCREEN_EXCLUSIVE_DISALLOWED_EXT.valueOf(), VkFullScreenExclusiveEXT.VK_FULL_SCREEN_EXCLUSIVE_DISALLOWED_EXT.toString() + " has an unexpected value.");
        assertEquals(3, VkFullScreenExclusiveEXT.VK_FULL_SCREEN_EXCLUSIVE_APPLICATION_CONTROLLED_EXT.valueOf(), VkFullScreenExclusiveEXT.VK_FULL_SCREEN_EXCLUSIVE_APPLICATION_CONTROLLED_EXT.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkFullScreenExclusiveEXT.VK_FULL_SCREEN_EXCLUSIVE_MAX_ENUM_EXT.valueOf(), VkFullScreenExclusiveEXT.VK_FULL_SCREEN_EXCLUSIVE_MAX_ENUM_EXT.toString() + " has an unexpected value.");
    }
}
