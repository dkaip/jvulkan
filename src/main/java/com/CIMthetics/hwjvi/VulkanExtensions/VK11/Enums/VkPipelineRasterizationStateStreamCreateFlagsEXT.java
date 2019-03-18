package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Enums;

public enum VkPipelineRasterizationStateStreamCreateFlagsEXT
{
    RESERVED_FOR_FUTURE_USE(0);
    
    private int value;
    
    private VkPipelineRasterizationStateStreamCreateFlagsEXT(int value) { this.value = value; }
    
    public int valueOf() { return value; }

}
