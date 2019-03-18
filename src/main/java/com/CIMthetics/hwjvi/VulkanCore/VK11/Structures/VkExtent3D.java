package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures;

public class VkExtent3D
{
    private int width;
    private int height;
    private int depth;
    
    /**
     * 
     * @param width
     * @param height
     * @param depth
     */
    public VkExtent3D(int width, int height, int depth)
    {
        this.width  = width;
        this.height = height;
        this.depth  = depth;
    }
    
    public VkExtent3D()
    {
    }
    
    public int getWidth()
    {
        return width;
    }
    
    void setWidth(int width)
    {
        this.width = width;
    }
    
    public int getHeight()
    {
        return height;
    }
    
    void setHeight(int height)
    {
        this.height = height;
    }
    
    public int getDepth()
    {
        return depth;
    }
    
    void setDepth(int depth)
    {
        this.depth = depth;
    }
    
}
