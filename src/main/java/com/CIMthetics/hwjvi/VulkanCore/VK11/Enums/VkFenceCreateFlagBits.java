package com.CIMthetics.hwjvi.VulkanCore.VK11.Enums;

public enum VkFenceCreateFlagBits
{
    VK_FENCE_CREATE_SIGNALED_BIT(0x00000001),
    VK_FENCE_CREATE_FLAG_BITS_MAX_ENUM(0x7FFFFFFF);

    private int value;
    
    private VkFenceCreateFlagBits(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
