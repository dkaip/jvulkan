package com.CIMthetics.hwjvi.VulkanCore.VK11.Enums;

public enum VkPipelineMultisampleStateCreateFlagBits
{
    RESERVED_FOR_FUTURE_USE(0);
    
    private int value;
    
    private VkPipelineMultisampleStateCreateFlagBits(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
