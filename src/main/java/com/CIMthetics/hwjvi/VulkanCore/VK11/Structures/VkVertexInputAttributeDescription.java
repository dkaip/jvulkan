package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkFormat;

public class VkVertexInputAttributeDescription
{
    private int         location;
    private int         binding;
    private VkFormat    format;
    private int         offset;
    
    /**
     * 
     * @param location
     * @param binding
     * @param format
     * @param offset
     */
    public VkVertexInputAttributeDescription(int location, int binding, VkFormat format, int offset)
    {
        this.location   = location;
        this.binding    = binding;
        this.format     = format;
        this.offset     = offset;
    }

    public int getLocation()
    {
        return location;
    }

    public int getBinding()
    {
        return binding;
    }

    public VkFormat getFormat()
    {
        return format;
    }

    public int getOffset()
    {
        return offset;
    }
    
}
