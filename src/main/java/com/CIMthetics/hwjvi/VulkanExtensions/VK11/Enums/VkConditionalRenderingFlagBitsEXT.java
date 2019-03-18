package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Enums;

public enum VkConditionalRenderingFlagBitsEXT
{
    VK_CONDITIONAL_RENDERING_INVERTED_BIT_EXT(0x00000001),
    VK_CONDITIONAL_RENDERING_FLAG_BITS_MAX_ENUM_EXT(0x7FFFFFFF);

    private int value;
    
    private VkConditionalRenderingFlagBitsEXT(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
