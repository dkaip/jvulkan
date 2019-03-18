package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkComponentSwizzle;

public class VkComponentMapping
{
    private VkComponentSwizzle    r;
    private VkComponentSwizzle    g;
    private VkComponentSwizzle    b;
    private VkComponentSwizzle    a;
    
    public VkComponentSwizzle getR()
    {
        return r;
    }
    
    public void setR(VkComponentSwizzle r)
    {
        this.r = r;
    }
    
    public VkComponentSwizzle getG()
    {
        return g;
    }
    
    public void setG(VkComponentSwizzle g)
    {
        this.g = g;
    }
    
    public VkComponentSwizzle getB()
    {
        return b;
    }
    
    public void setB(VkComponentSwizzle b)
    {
        this.b = b;
    }
    
    public VkComponentSwizzle getA()
    {
        return a;
    }
    
    public void setA(VkComponentSwizzle a)
    {
        this.a = a;
    }
}
