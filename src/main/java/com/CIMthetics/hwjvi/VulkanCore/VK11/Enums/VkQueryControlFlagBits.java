package com.CIMthetics.hwjvi.VulkanCore.VK11.Enums;

public enum VkQueryControlFlagBits
{
    VK_QUERY_CONTROL_PRECISE_BIT(0x00000001),
    VK_QUERY_CONTROL_FLAG_BITS_MAX_ENUM(0x7FFFFFFF);

    private int value;
    
    private VkQueryControlFlagBits(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
