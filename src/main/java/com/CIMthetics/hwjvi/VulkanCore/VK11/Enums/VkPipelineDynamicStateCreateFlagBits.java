package com.CIMthetics.hwjvi.VulkanCore.VK11.Enums;

public enum VkPipelineDynamicStateCreateFlagBits
{
    RESERVED_FOR_FUTURE_USE(0);
    
    private int value;
    
    private VkPipelineDynamicStateCreateFlagBits(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
