package com.CIMthetics.hwjvi.VulkanCore.VK11.Enums;

public enum VkPipelineTessellationStateCreateFlagBits
{
    RESERVED_FOR_FUTURE_USE(0);
    
    private int value;
    
    private VkPipelineTessellationStateCreateFlagBits(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
