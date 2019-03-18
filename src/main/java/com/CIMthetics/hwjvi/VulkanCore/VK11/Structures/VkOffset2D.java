package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures;

public class VkOffset2D
{
    private int x;
    private int y;
    
    /**
     * 
     * @param x
     * @param y
     */
    public VkOffset2D(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public int getX()
    {
        return x;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public int getY()
    {
        return y;
    }

    public void setY(int y)
    {
        this.y = y;
    }
    
}
