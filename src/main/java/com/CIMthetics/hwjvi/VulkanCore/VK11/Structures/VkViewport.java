package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures;

public class VkViewport
{
    private float    x;
    private float    y;
    private float    width;
    private float    height;
    private float    minDepth;
    private float    maxDepth;
    
    public float getX()
    {
        return x;
    }
    
    public void setX(float x)
    {
        this.x = x;
    }
    
    public float getY()
    {
        return y;
    }
    
    public void setY(float y)
    {
        this.y = y;
    }
    
    public float getWidth()
    {
        return width;
    }
    
    public void setWidth(float width)
    {
        this.width = width;
    }
    
    public float getHeight()
    {
        return height;
    }
    
    public void setHeight(float height)
    {
        this.height = height;
    }
    
    public float getMinDepth()
    {
        return minDepth;
    }
    
    public void setMinDepth(float minDepth)
    {
        this.minDepth = minDepth;
    }
    
    public float getMaxDepth()
    {
        return maxDepth;
    }
    
    public void setMaxDepth(float maxDepth)
    {
        this.maxDepth = maxDepth;
    }
}
