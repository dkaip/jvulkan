package com.CIMthetics.hwjvi.VulkanCore.VK11.Enums;

public enum VkPipelineVertexInputStateCreateFlagBits
{
    RESERVED_FOR_FUTURE_USE(0);
    
    private int value;
    
    private VkPipelineVertexInputStateCreateFlagBits(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
