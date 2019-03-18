package com.CIMthetics.hwjvi.VulkanCore.VK11.Enums;

public enum VkSubpassDescriptionFlagBits
{
    VK_SUBPASS_DESCRIPTION_PER_VIEW_ATTRIBUTES_BIT_NVX(0x00000001),
    VK_SUBPASS_DESCRIPTION_PER_VIEW_POSITION_X_ONLY_BIT_NVX(0x00000002),
    VK_SUBPASS_DESCRIPTION_FLAG_BITS_MAX_ENUM(0x7FFFFFFF);

    private int value;
    
    private VkSubpassDescriptionFlagBits(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
