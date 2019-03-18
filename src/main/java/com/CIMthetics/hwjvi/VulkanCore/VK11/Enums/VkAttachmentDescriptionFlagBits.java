package com.CIMthetics.hwjvi.VulkanCore.VK11.Enums;

public enum VkAttachmentDescriptionFlagBits
{
    VK_ATTACHMENT_DESCRIPTION_MAY_ALIAS_BIT(0x00000001),
    VK_ATTACHMENT_DESCRIPTION_FLAG_BITS_MAX_ENUM(0x7FFFFFFF);

    private int value;
    
    private VkAttachmentDescriptionFlagBits(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
