package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Enums;

public enum VkSurfaceCounterFlagBitsEXT
{
    VK_SURFACE_COUNTER_VBLANK_EXT(0x00000001),
    VK_SURFACE_COUNTER_FLAG_BITS_MAX_ENUM_EXT(0x7FFFFFFF);

    private int value;
    
    private VkSurfaceCounterFlagBitsEXT(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
