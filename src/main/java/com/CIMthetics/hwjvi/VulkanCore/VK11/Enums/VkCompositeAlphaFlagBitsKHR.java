package com.CIMthetics.hwjvi.VulkanCore.VK11.Enums;

public enum VkCompositeAlphaFlagBitsKHR
{
    VK_COMPOSITE_ALPHA_OPAQUE_BIT_KHR(0x00000001),
    VK_COMPOSITE_ALPHA_PRE_MULTIPLIED_BIT_KHR(0x00000002),
    VK_COMPOSITE_ALPHA_POST_MULTIPLIED_BIT_KHR(0x00000004),
    VK_COMPOSITE_ALPHA_INHERIT_BIT_KHR(0x00000008),
    VK_COMPOSITE_ALPHA_FLAG_BITS_MAX_ENUM_KHR(0x7FFFFFFF);

    private int value;
    
    private VkCompositeAlphaFlagBitsKHR(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
