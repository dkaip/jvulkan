package com.CIMthetics.hwjvi.VulkanCore.VK11.Enums;

public enum VkRenderPassCreateFlagBits
{
    RESERVED_FOR_FUTURE_USE(0);
    
    private int value;
    
    private VkRenderPassCreateFlagBits(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
