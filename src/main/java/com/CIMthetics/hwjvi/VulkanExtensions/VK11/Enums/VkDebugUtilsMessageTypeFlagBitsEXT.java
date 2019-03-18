package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Enums;

public enum VkDebugUtilsMessageTypeFlagBitsEXT
{
    VK_DEBUG_UTILS_MESSAGE_TYPE_GENERAL_BIT_EXT(0x00000001),
    VK_DEBUG_UTILS_MESSAGE_TYPE_VALIDATION_BIT_EXT(0x00000002),
    VK_DEBUG_UTILS_MESSAGE_TYPE_PERFORMANCE_BIT_EXT(0x00000004),
    VK_DEBUG_UTILS_MESSAGE_TYPE_FLAG_BITS_MAX_ENUM_EXT(0x7FFFFFFF);

    private int value;
    
    private VkDebugUtilsMessageTypeFlagBitsEXT(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
