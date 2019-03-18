package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Enums;

public enum VkResolveModeFlagBitsKHR
{
    VK_RESOLVE_MODE_NONE_KHR(0),
    VK_RESOLVE_MODE_SAMPLE_ZERO_BIT_KHR(0x00000001),
    VK_RESOLVE_MODE_AVERAGE_BIT_KHR(0x00000002),
    VK_RESOLVE_MODE_MIN_BIT_KHR(0x00000004),
    VK_RESOLVE_MODE_MAX_BIT_KHR(0x00000008),
    VK_RESOLVE_MODE_FLAG_BITS_MAX_ENUM_KHR(0x7FFFFFFF);

    private int value;
    
    private VkResolveModeFlagBitsKHR(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
