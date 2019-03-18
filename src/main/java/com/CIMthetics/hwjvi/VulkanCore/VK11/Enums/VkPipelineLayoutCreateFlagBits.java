package com.CIMthetics.hwjvi.VulkanCore.VK11.Enums;

public enum VkPipelineLayoutCreateFlagBits
{
    RESERVED_FOR_FUTURE_USE(0);
    
    private int value;
    
    private VkPipelineLayoutCreateFlagBits(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
