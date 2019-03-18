package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Enums;

/**
 * 
 * @author Douglas Kaip
 *
 */
public enum VkDebugReportFlagBitsEXT
{
    VK_DEBUG_REPORT_INFORMATION_BIT_EXT(0x00000001),
    VK_DEBUG_REPORT_WARNING_BIT_EXT(0x00000002),
    VK_DEBUG_REPORT_PERFORMANCE_WARNING_BIT_EXT(0x00000004),
    VK_DEBUG_REPORT_ERROR_BIT_EXT(0x00000008),
    VK_DEBUG_REPORT_DEBUG_BIT_EXT(0x00000010),
    VK_DEBUG_REPORT_FLAG_BITS_MAX_ENUM_EXT(0x7FFFFFFF);
    
    private int value;
    
    private VkDebugReportFlagBitsEXT(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
