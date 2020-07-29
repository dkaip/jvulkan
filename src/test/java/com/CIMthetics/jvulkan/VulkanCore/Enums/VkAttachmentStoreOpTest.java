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
package com.CIMthetics.jvulkan.VulkanCore.Enums;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkAttachmentStoreOp;

class VkAttachmentStoreOpTest
{
    @Test
    void testNumberOfElements()
    {
        VkAttachmentStoreOp[] values = VkAttachmentStoreOp.values();
        assertEquals(6, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }


    @Test
    void testValues()
    {
        assertEquals(0, VkAttachmentStoreOp.VK_ATTACHMENT_STORE_OP_STORE.valueOf(), VkAttachmentStoreOp.VK_ATTACHMENT_STORE_OP_STORE.toString() + " has an unexpected value.");
        assertEquals(1, VkAttachmentStoreOp.VK_ATTACHMENT_STORE_OP_DONT_CARE.valueOf(), VkAttachmentStoreOp.VK_ATTACHMENT_STORE_OP_DONT_CARE.toString() + " has an unexpected value.");
        assertEquals(VkAttachmentStoreOp.VK_ATTACHMENT_STORE_OP_STORE.valueOf(), VkAttachmentStoreOp.VK_ATTACHMENT_STORE_OP_BEGIN_RANGE.valueOf(), VkAttachmentStoreOp.VK_ATTACHMENT_STORE_OP_BEGIN_RANGE.toString() + " has an unexpected value.");
        assertEquals(VkAttachmentStoreOp.VK_ATTACHMENT_STORE_OP_DONT_CARE.valueOf(), VkAttachmentStoreOp.VK_ATTACHMENT_STORE_OP_END_RANGE.valueOf(), VkAttachmentStoreOp.VK_ATTACHMENT_STORE_OP_END_RANGE.toString() + " has an unexpected value.");
        assertEquals((VkAttachmentStoreOp.VK_ATTACHMENT_STORE_OP_DONT_CARE.valueOf() - VkAttachmentStoreOp.VK_ATTACHMENT_STORE_OP_STORE.valueOf() + 1), VkAttachmentStoreOp.VK_ATTACHMENT_STORE_OP_RANGE_SIZE.valueOf(), VkAttachmentStoreOp.VK_ATTACHMENT_STORE_OP_RANGE_SIZE.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkAttachmentStoreOp.VK_ATTACHMENT_STORE_OP_MAX_ENUM.valueOf(), VkAttachmentStoreOp.VK_ATTACHMENT_STORE_OP_MAX_ENUM.toString() + " has an unexpected value.");
    }
}
