package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures;

public class VkRect2D
{
    private VkOffset2D offset;
    private VkExtent2D extent;
    
    /**
     * 
     * @param offset
     * @param extent
     */
    public VkRect2D(VkOffset2D offset, VkExtent2D extent)
    {
        this.offset = offset;
        this.extent = extent;
    }

    public VkOffset2D getOffset()
    {
        return offset;
    }

    public void setOffset(VkOffset2D offset)
    {
        this.offset = offset;
    }

    public VkExtent2D getExtent()
    {
        return extent;
    }

    public void setExtent(VkExtent2D extent)
    {
        this.extent = extent;
    }
    
}
