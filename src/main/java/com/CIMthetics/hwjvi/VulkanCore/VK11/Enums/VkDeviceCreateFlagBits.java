package com.CIMthetics.hwjvi.VulkanCore.VK11.Enums;

public enum VkDeviceCreateFlagBits
{
    RESERVED_FOR_FUTURE_USE(0);
    
    private int value;
    
    private VkDeviceCreateFlagBits(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
