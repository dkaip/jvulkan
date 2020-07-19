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

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkCompareOp;

class VkCompareOpTest
{
    @Test
    void testNumberOfElements()
    {
        VkCompareOp[] values = VkCompareOp.values();
        assertEquals(12, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }


    @Test
    void testValues()
    {
        assertEquals(0, VkCompareOp.VK_COMPARE_OP_NEVER.valueOf(), VkCompareOp.VK_COMPARE_OP_NEVER.toString() + " has an unexpected value.");
        assertEquals(1, VkCompareOp.VK_COMPARE_OP_LESS.valueOf(), VkCompareOp.VK_COMPARE_OP_LESS.toString() + " has an unexpected value.");
        assertEquals(2, VkCompareOp.VK_COMPARE_OP_EQUAL.valueOf(), VkCompareOp.VK_COMPARE_OP_EQUAL.toString() + " has an unexpected value.");
        assertEquals(3, VkCompareOp.VK_COMPARE_OP_LESS_OR_EQUAL.valueOf(), VkCompareOp.VK_COMPARE_OP_LESS_OR_EQUAL.toString() + " has an unexpected value.");
        assertEquals(4, VkCompareOp.VK_COMPARE_OP_GREATER.valueOf(), VkCompareOp.VK_COMPARE_OP_GREATER.toString() + " has an unexpected value.");
        assertEquals(5, VkCompareOp.VK_COMPARE_OP_NOT_EQUAL.valueOf(), VkCompareOp.VK_COMPARE_OP_NOT_EQUAL.toString() + " has an unexpected value.");
        assertEquals(6, VkCompareOp.VK_COMPARE_OP_GREATER_OR_EQUAL.valueOf(), VkCompareOp.VK_COMPARE_OP_GREATER_OR_EQUAL.toString() + " has an unexpected value.");
        assertEquals(7, VkCompareOp.VK_COMPARE_OP_ALWAYS.valueOf(), VkCompareOp.VK_COMPARE_OP_ALWAYS.toString() + " has an unexpected value.");
        assertEquals(VkCompareOp.VK_COMPARE_OP_NEVER.valueOf(), VkCompareOp.VK_COMPARE_OP_BEGIN_RANGE.valueOf(), VkCompareOp.VK_COMPARE_OP_BEGIN_RANGE.toString() + " has an unexpected value.");
        assertEquals(VkCompareOp.VK_COMPARE_OP_ALWAYS.valueOf(), VkCompareOp.VK_COMPARE_OP_END_RANGE.valueOf(), VkCompareOp.VK_COMPARE_OP_END_RANGE.toString() + " has an unexpected value.");
        assertEquals((VkCompareOp.VK_COMPARE_OP_ALWAYS.valueOf() - VkCompareOp.VK_COMPARE_OP_NEVER.valueOf() + 1), VkCompareOp.VK_COMPARE_OP_RANGE_SIZE.valueOf(), VkCompareOp.VK_COMPARE_OP_RANGE_SIZE.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkCompareOp.VK_COMPARE_OP_MAX_ENUM.valueOf(), VkCompareOp.VK_COMPARE_OP_MAX_ENUM.toString() + " has an unexpected value.");
    }
}
