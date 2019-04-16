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

class VkStencilOpTest
{
    @Test
    void testNumberOfElements()
    {
        VkStencilOp[] values = VkStencilOp.values();
        assertEquals(12, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }


    @Test
    void testValues()
    {
        assertEquals(0, VkStencilOp.VK_STENCIL_OP_KEEP.valueOf(), VkStencilOp.VK_STENCIL_OP_KEEP.toString() + " has an unexpected value.");
        assertEquals(1, VkStencilOp.VK_STENCIL_OP_ZERO.valueOf(), VkStencilOp.VK_STENCIL_OP_ZERO.toString() + " has an unexpected value.");
        assertEquals(2, VkStencilOp.VK_STENCIL_OP_REPLACE.valueOf(), VkStencilOp.VK_STENCIL_OP_REPLACE.toString() + " has an unexpected value.");
        assertEquals(3, VkStencilOp.VK_STENCIL_OP_INCREMENT_AND_CLAMP.valueOf(), VkStencilOp.VK_STENCIL_OP_INCREMENT_AND_CLAMP.toString() + " has an unexpected value.");
        assertEquals(4, VkStencilOp.VK_STENCIL_OP_DECREMENT_AND_CLAMP.valueOf(), VkStencilOp.VK_STENCIL_OP_DECREMENT_AND_CLAMP.toString() + " has an unexpected value.");
        assertEquals(5, VkStencilOp.VK_STENCIL_OP_INVERT.valueOf(), VkStencilOp.VK_STENCIL_OP_INVERT.toString() + " has an unexpected value.");
        assertEquals(6, VkStencilOp.VK_STENCIL_OP_INCREMENT_AND_WRAP.valueOf(), VkStencilOp.VK_STENCIL_OP_INCREMENT_AND_WRAP.toString() + " has an unexpected value.");
        assertEquals(7, VkStencilOp.VK_STENCIL_OP_DECREMENT_AND_WRAP.valueOf(), VkStencilOp.VK_STENCIL_OP_DECREMENT_AND_WRAP.toString() + " has an unexpected value.");
        assertEquals(VkStencilOp.VK_STENCIL_OP_KEEP.valueOf(), VkStencilOp.VK_STENCIL_OP_BEGIN_RANGE.valueOf(), VkStencilOp.VK_STENCIL_OP_BEGIN_RANGE.toString() + " has an unexpected value.");
        assertEquals(VkStencilOp.VK_STENCIL_OP_DECREMENT_AND_WRAP.valueOf(), VkStencilOp.VK_STENCIL_OP_END_RANGE.valueOf(), VkStencilOp.VK_STENCIL_OP_END_RANGE.toString() + " has an unexpected value.");
        assertEquals((VkStencilOp.VK_STENCIL_OP_DECREMENT_AND_WRAP.valueOf() - VkStencilOp.VK_STENCIL_OP_KEEP.valueOf() + 1), VkStencilOp.VK_STENCIL_OP_RANGE_SIZE.valueOf(), VkStencilOp.VK_STENCIL_OP_RANGE_SIZE.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkStencilOp.VK_STENCIL_OP_MAX_ENUM.valueOf(), VkStencilOp.VK_STENCIL_OP_MAX_ENUM.toString() + " has an unexpected value.");
    }
}
