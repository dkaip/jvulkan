package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures;

public class VkOffset3D
{
    private int x;
    private int y;
    private int z;
    
    /**
     * 
     * @param x
     * @param y
     * @param z
     */
    public VkOffset3D(int x, int y, int z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
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

    public int getZ()
    {
        return z;
    }

    public void setZ(int z)
    {
        this.z = z;
    }
    
}
