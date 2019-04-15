package com.CIMthetics.jvulkan.VulkanCore.VK11.Enums;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VkAttachmentDescriptionFlagBitsTest
{
    @Test
    void testNumberOfElements()
    {
        VkAttachmentDescriptionFlagBits[] values = VkAttachmentDescriptionFlagBits.values();
        assertEquals(2, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }

    @Test
    void testValues()
    {
        assertEquals(0x00000001, VkAttachmentDescriptionFlagBits.VK_ATTACHMENT_DESCRIPTION_MAY_ALIAS_BIT.valueOf(), VkAttachmentDescriptionFlagBits.VK_ATTACHMENT_DESCRIPTION_MAY_ALIAS_BIT.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkAttachmentDescriptionFlagBits.VK_ATTACHMENT_DESCRIPTION_FLAG_BITS_MAX_ENUM.valueOf(), VkAttachmentDescriptionFlagBits.VK_ATTACHMENT_DESCRIPTION_FLAG_BITS_MAX_ENUM.toString() + " has an unexpected value.");
    }
}
