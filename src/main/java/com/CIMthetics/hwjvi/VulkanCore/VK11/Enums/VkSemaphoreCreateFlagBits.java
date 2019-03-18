package com.CIMthetics.hwjvi.VulkanCore.VK11.Enums;

public enum VkSemaphoreCreateFlagBits
{
    RESERVED_FOR_FUTURE_USE(0);
    
    private int value;
    
    private VkSemaphoreCreateFlagBits(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
