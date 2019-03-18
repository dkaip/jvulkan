package com.CIMthetics.hwjvi.VulkanCore.VK11.Enums;

public enum VkColorComponentFlagBits
{
    VK_COLOR_COMPONENT_R_BIT(0x00000001),
    VK_COLOR_COMPONENT_G_BIT(0x00000002),
    VK_COLOR_COMPONENT_B_BIT(0x00000004),
    VK_COLOR_COMPONENT_A_BIT(0x00000008),
    VK_COLOR_COMPONENT_FLAG_BITS_MAX_ENUM(0x7FFFFFFF);

    private int value;
    
    private VkColorComponentFlagBits(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
