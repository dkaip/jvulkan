package com.CIMthetics.jvulkan.VulkanCore.VK11.Enums;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VkAttachmentLoadOpTest
{
    @Test
    void testNumberOfElements()
    {
        VkAttachmentLoadOp[] values = VkAttachmentLoadOp.values();
        assertEquals(7, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }

    @Test
    void testValues()
    {
        assertEquals(0, VkAttachmentLoadOp.VK_ATTACHMENT_LOAD_OP_LOAD.valueOf(), VkAttachmentLoadOp.VK_ATTACHMENT_LOAD_OP_LOAD.toString() + " has an unexpected value.");
        assertEquals(1, VkAttachmentLoadOp.VK_ATTACHMENT_LOAD_OP_CLEAR.valueOf(), VkAttachmentLoadOp.VK_ATTACHMENT_LOAD_OP_CLEAR.toString() + " has an unexpected value.");
        assertEquals(2, VkAttachmentLoadOp.VK_ATTACHMENT_LOAD_OP_DONT_CARE.valueOf(), VkAttachmentLoadOp.VK_ATTACHMENT_LOAD_OP_DONT_CARE.toString() + " has an unexpected value.");
        assertEquals(VkAttachmentLoadOp.VK_ATTACHMENT_LOAD_OP_LOAD.valueOf(), VkAttachmentLoadOp.VK_ATTACHMENT_LOAD_OP_BEGIN_RANGE.valueOf(), VkAttachmentLoadOp.VK_ATTACHMENT_LOAD_OP_BEGIN_RANGE.toString() + " has an unexpected value.");
        assertEquals(VkAttachmentLoadOp.VK_ATTACHMENT_LOAD_OP_DONT_CARE.valueOf(), VkAttachmentLoadOp.VK_ATTACHMENT_LOAD_OP_END_RANGE.valueOf(), VkAttachmentLoadOp.VK_ATTACHMENT_LOAD_OP_END_RANGE.toString() + " has an unexpected value.");
        assertEquals((VkAttachmentLoadOp.VK_ATTACHMENT_LOAD_OP_DONT_CARE.valueOf() - VkAttachmentLoadOp.VK_ATTACHMENT_LOAD_OP_LOAD.valueOf() + 1), VkAttachmentLoadOp.VK_ATTACHMENT_LOAD_OP_RANGE_SIZE.valueOf(), VkAttachmentLoadOp.VK_ATTACHMENT_LOAD_OP_RANGE_SIZE.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkAttachmentLoadOp.VK_ATTACHMENT_LOAD_OP_MAX_ENUM.valueOf(), VkAttachmentLoadOp.VK_ATTACHMENT_LOAD_OP_MAX_ENUM.toString() + " has an unexpected value.");
    }
}
