package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkFormat;
import com.CIMthetics.hwjvi.VulkanExtensions.VK11.Enums.VkColorSpaceKHR;

public class VkSurfaceFormatKHR
{
    private VkFormat        format;
    private VkColorSpaceKHR colorSpace;
    
    VkSurfaceFormatKHR(VkFormat format, VkColorSpaceKHR colorSpace)
    {
        this.format     = format;
        this.colorSpace = colorSpace;
    }
    
    void setFormat(VkFormat format)
    {
        this.format = format;
    }
    
    void setColorSpace(VkColorSpaceKHR colorSpace)
    {
        this.colorSpace = colorSpace;
    }
    
    public VkFormat getFormat()
    {
        return format;
    }
    
    public VkColorSpaceKHR getColorSpace()
    {
        return colorSpace;
    }
}
