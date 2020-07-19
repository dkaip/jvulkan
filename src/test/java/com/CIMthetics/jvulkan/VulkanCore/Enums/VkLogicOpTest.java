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

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkLogicOp;

class VkLogicOpTest
{
    @Test
    void testNumberOfElements()
    {
        VkLogicOp[] values = VkLogicOp.values();
        assertEquals(20, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }


    @Test
    void testValues()
    {
        assertEquals(0, VkLogicOp.VK_LOGIC_OP_CLEAR.valueOf(), VkLogicOp.VK_LOGIC_OP_CLEAR.toString() + " has an unexpected value.");
        assertEquals(1, VkLogicOp.VK_LOGIC_OP_AND.valueOf(), VkLogicOp.VK_LOGIC_OP_AND.toString() + " has an unexpected value.");
        assertEquals(2, VkLogicOp.VK_LOGIC_OP_AND_REVERSE.valueOf(), VkLogicOp.VK_LOGIC_OP_AND_REVERSE.toString() + " has an unexpected value.");
        assertEquals(3, VkLogicOp.VK_LOGIC_OP_COPY.valueOf(), VkLogicOp.VK_LOGIC_OP_COPY.toString() + " has an unexpected value.");
        assertEquals(4, VkLogicOp.VK_LOGIC_OP_AND_INVERTED.valueOf(), VkLogicOp.VK_LOGIC_OP_AND_INVERTED.toString() + " has an unexpected value.");
        assertEquals(5, VkLogicOp.VK_LOGIC_OP_NO_OP.valueOf(), VkLogicOp.VK_LOGIC_OP_NO_OP.toString() + " has an unexpected value.");
        assertEquals(6, VkLogicOp.VK_LOGIC_OP_XOR.valueOf(), VkLogicOp.VK_LOGIC_OP_XOR.toString() + " has an unexpected value.");
        assertEquals(7, VkLogicOp.VK_LOGIC_OP_OR.valueOf(), VkLogicOp.VK_LOGIC_OP_OR.toString() + " has an unexpected value.");
        assertEquals(8, VkLogicOp.VK_LOGIC_OP_NOR.valueOf(), VkLogicOp.VK_LOGIC_OP_NOR.toString() + " has an unexpected value.");
        assertEquals(9, VkLogicOp.VK_LOGIC_OP_EQUIVALENT.valueOf(), VkLogicOp.VK_LOGIC_OP_EQUIVALENT.toString() + " has an unexpected value.");
        assertEquals(10, VkLogicOp.VK_LOGIC_OP_INVERT.valueOf(), VkLogicOp.VK_LOGIC_OP_INVERT.toString() + " has an unexpected value.");
        assertEquals(11, VkLogicOp.VK_LOGIC_OP_OR_REVERSE.valueOf(), VkLogicOp.VK_LOGIC_OP_OR_REVERSE.toString() + " has an unexpected value.");
        assertEquals(12, VkLogicOp.VK_LOGIC_OP_COPY_INVERTED.valueOf(), VkLogicOp.VK_LOGIC_OP_COPY_INVERTED.toString() + " has an unexpected value.");
        assertEquals(13, VkLogicOp.VK_LOGIC_OP_OR_INVERTED.valueOf(), VkLogicOp.VK_LOGIC_OP_OR_INVERTED.toString() + " has an unexpected value.");
        assertEquals(14, VkLogicOp.VK_LOGIC_OP_NAND.valueOf(), VkLogicOp.VK_LOGIC_OP_NAND.toString() + " has an unexpected value.");
        assertEquals(15, VkLogicOp.VK_LOGIC_OP_SET.valueOf(), VkLogicOp.VK_LOGIC_OP_SET.toString() + " has an unexpected value.");
        assertEquals(VkLogicOp.VK_LOGIC_OP_CLEAR.valueOf(), VkLogicOp.VK_LOGIC_OP_BEGIN_RANGE.valueOf(), VkLogicOp.VK_LOGIC_OP_BEGIN_RANGE.toString() + " has an unexpected value.");
        assertEquals(VkLogicOp.VK_LOGIC_OP_SET.valueOf(), VkLogicOp.VK_LOGIC_OP_END_RANGE.valueOf(), VkLogicOp.VK_LOGIC_OP_END_RANGE.toString() + " has an unexpected value.");
        assertEquals((VkLogicOp.VK_LOGIC_OP_SET.valueOf() - VkLogicOp.VK_LOGIC_OP_CLEAR.valueOf() + 1), VkLogicOp.VK_LOGIC_OP_RANGE_SIZE.valueOf(), VkLogicOp.VK_LOGIC_OP_RANGE_SIZE.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkLogicOp.VK_LOGIC_OP_MAX_ENUM.valueOf(), VkLogicOp.VK_LOGIC_OP_MAX_ENUM.toString() + " has an unexpected value.");
    }
}
