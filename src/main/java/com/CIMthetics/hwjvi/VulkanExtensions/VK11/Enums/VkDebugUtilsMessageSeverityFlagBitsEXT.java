package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Enums;

public enum VkDebugUtilsMessageSeverityFlagBitsEXT
{
    VK_DEBUG_UTILS_MESSAGE_SEVERITY_VERBOSE_BIT_EXT(0x00000001),
    VK_DEBUG_UTILS_MESSAGE_SEVERITY_INFO_BIT_EXT(0x00000010),
    VK_DEBUG_UTILS_MESSAGE_SEVERITY_WARNING_BIT_EXT(0x00000100),
    VK_DEBUG_UTILS_MESSAGE_SEVERITY_ERROR_BIT_EXT(0x00001000),
    VK_DEBUG_UTILS_MESSAGE_SEVERITY_FLAG_BITS_MAX_ENUM_EXT(0x7FFFFFFF);

    private int value;
    
    private VkDebugUtilsMessageSeverityFlagBitsEXT(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
