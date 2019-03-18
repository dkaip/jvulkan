package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Enums;

public enum VkDisplayPlaneAlphaFlagBitsKHR
{
    VK_DISPLAY_PLANE_ALPHA_OPAQUE_BIT_KHR(0x00000001),
    VK_DISPLAY_PLANE_ALPHA_GLOBAL_BIT_KHR(0x00000002),
    VK_DISPLAY_PLANE_ALPHA_PER_PIXEL_BIT_KHR(0x00000004),
    VK_DISPLAY_PLANE_ALPHA_PER_PIXEL_PREMULTIPLIED_BIT_KHR(0x00000008),
    VK_DISPLAY_PLANE_ALPHA_FLAG_BITS_MAX_ENUM_KHR(0x7FFFFFFF);

    private int value;
    
    private VkDisplayPlaneAlphaFlagBitsKHR(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
