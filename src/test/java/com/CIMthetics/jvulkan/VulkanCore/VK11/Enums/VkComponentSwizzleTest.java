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

class VkComponentSwizzleTest
{
    @Test
    void testNumberOfElements()
    {
        VkComponentSwizzle[] values = VkComponentSwizzle.values();
        assertEquals(11, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }


    @Test
    void testValues()
    {
        assertEquals(0, VkComponentSwizzle.VK_COMPONENT_SWIZZLE_IDENTITY.valueOf(), VkComponentSwizzle.VK_COMPONENT_SWIZZLE_IDENTITY.toString() + " has an unexpected value.");
        assertEquals(1, VkComponentSwizzle.VK_COMPONENT_SWIZZLE_ZERO.valueOf(), VkComponentSwizzle.VK_COMPONENT_SWIZZLE_ZERO.toString() + " has an unexpected value.");
        assertEquals(2, VkComponentSwizzle.VK_COMPONENT_SWIZZLE_ONE.valueOf(), VkComponentSwizzle.VK_COMPONENT_SWIZZLE_ONE.toString() + " has an unexpected value.");
        assertEquals(3, VkComponentSwizzle.VK_COMPONENT_SWIZZLE_R.valueOf(), VkComponentSwizzle.VK_COMPONENT_SWIZZLE_R.toString() + " has an unexpected value.");
        assertEquals(4, VkComponentSwizzle.VK_COMPONENT_SWIZZLE_G.valueOf(), VkComponentSwizzle.VK_COMPONENT_SWIZZLE_G.toString() + " has an unexpected value.");
        assertEquals(5, VkComponentSwizzle.VK_COMPONENT_SWIZZLE_B.valueOf(), VkComponentSwizzle.VK_COMPONENT_SWIZZLE_B.toString() + " has an unexpected value.");
        assertEquals(6, VkComponentSwizzle.VK_COMPONENT_SWIZZLE_A.valueOf(), VkComponentSwizzle.VK_COMPONENT_SWIZZLE_A.toString() + " has an unexpected value.");
        assertEquals(VkComponentSwizzle.VK_COMPONENT_SWIZZLE_IDENTITY.valueOf(), VkComponentSwizzle.VK_COMPONENT_SWIZZLE_BEGIN_RANGE.valueOf(), VkComponentSwizzle.VK_COMPONENT_SWIZZLE_BEGIN_RANGE.toString() + " has an unexpected value.");
        assertEquals(VkComponentSwizzle.VK_COMPONENT_SWIZZLE_A.valueOf(), VkComponentSwizzle.VK_COMPONENT_SWIZZLE_END_RANGE.valueOf(), VkComponentSwizzle.VK_COMPONENT_SWIZZLE_END_RANGE.toString() + " has an unexpected value.");
        assertEquals((VkComponentSwizzle.VK_COMPONENT_SWIZZLE_A.valueOf() - VkComponentSwizzle.VK_COMPONENT_SWIZZLE_IDENTITY.valueOf() + 1), VkComponentSwizzle.VK_COMPONENT_SWIZZLE_RANGE_SIZE.valueOf(), VkComponentSwizzle.VK_COMPONENT_SWIZZLE_RANGE_SIZE.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkComponentSwizzle.VK_COMPONENT_SWIZZLE_MAX_ENUM.valueOf(), VkComponentSwizzle.VK_COMPONENT_SWIZZLE_MAX_ENUM.toString() + " has an unexpected value.");
    }
}
