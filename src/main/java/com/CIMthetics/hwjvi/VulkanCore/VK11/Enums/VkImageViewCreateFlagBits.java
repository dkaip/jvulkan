package com.CIMthetics.hwjvi.VulkanCore.VK11.Enums;

public enum VkImageViewCreateFlagBits
{
    VK_IMAGE_VIEW_CREATE_FRAGMENT_DENSITY_MAP_DYNAMIC_BIT_EXT(0x00000001),
    VK_IMAGE_VIEW_CREATE_FLAG_BITS_MAX_ENUM(0x7FFFFFFF);
    
    private int value;
    
    private VkImageViewCreateFlagBits(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
