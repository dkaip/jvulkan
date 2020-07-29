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

import com.CIMthetics.jvulkan.VulkanExtensions.Enums.VkDisplayEventTypeEXT;

class VkDisplayEventTypeEXTTest
{
    @Test
    void testNumberOfElements()
    {
        VkDisplayEventTypeEXT[] values = VkDisplayEventTypeEXT.values();
        assertEquals(5, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }


    @Test
    void testValues()
    {
        assertEquals(0, VkDisplayEventTypeEXT.VK_DISPLAY_EVENT_TYPE_FIRST_PIXEL_OUT_EXT.valueOf(), VkDisplayEventTypeEXT.VK_DISPLAY_EVENT_TYPE_FIRST_PIXEL_OUT_EXT.toString() + " has an unexpected value.");
        assertEquals(VkDisplayEventTypeEXT.VK_DISPLAY_EVENT_TYPE_FIRST_PIXEL_OUT_EXT.valueOf(), VkDisplayEventTypeEXT.VK_DISPLAY_EVENT_TYPE_BEGIN_RANGE_EXT.valueOf(), VkDisplayEventTypeEXT.VK_DISPLAY_EVENT_TYPE_BEGIN_RANGE_EXT.toString() + " has an unexpected value.");
        assertEquals(VkDisplayEventTypeEXT.VK_DISPLAY_EVENT_TYPE_FIRST_PIXEL_OUT_EXT.valueOf(), VkDisplayEventTypeEXT.VK_DISPLAY_EVENT_TYPE_END_RANGE_EXT.valueOf(), VkDisplayEventTypeEXT.VK_DISPLAY_EVENT_TYPE_END_RANGE_EXT.toString() + " has an unexpected value.");
        assertEquals((VkDisplayEventTypeEXT.VK_DISPLAY_EVENT_TYPE_FIRST_PIXEL_OUT_EXT.valueOf() - VkDisplayEventTypeEXT.VK_DISPLAY_EVENT_TYPE_FIRST_PIXEL_OUT_EXT.valueOf() + 1), VkDisplayEventTypeEXT.VK_DISPLAY_EVENT_TYPE_RANGE_SIZE_EXT.valueOf(), VkDisplayEventTypeEXT.VK_DISPLAY_EVENT_TYPE_RANGE_SIZE_EXT.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkDisplayEventTypeEXT.VK_DISPLAY_EVENT_TYPE_MAX_ENUM_EXT.valueOf(), VkDisplayEventTypeEXT.VK_DISPLAY_EVENT_TYPE_MAX_ENUM_EXT.toString() + " has an unexpected value.");
    }
}
