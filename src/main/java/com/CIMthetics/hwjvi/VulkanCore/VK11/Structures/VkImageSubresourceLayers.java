package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures;

import java.util.EnumSet;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkImageAspectFlagBits;

public class VkImageSubresourceLayers
{
    private EnumSet<VkImageAspectFlagBits>  aspectMask;
    private int                             mipLevel;
    private int                             baseArrayLayer;
    private int                             layerCount;
    
    public EnumSet<VkImageAspectFlagBits> getAspectMask()
    {
        return aspectMask;
    }
    
    public void setAspectMask(EnumSet<VkImageAspectFlagBits> aspectMask)
    {
        this.aspectMask = aspectMask;
    }
    
    public int getMipLevel()
    {
        return mipLevel;
    }
    
    public void setMipLevel(int mipLevel)
    {
        this.mipLevel = mipLevel;
    }
    
    public int getBaseArrayLayer()
    {
        return baseArrayLayer;
    }
    
    public void setBaseArrayLayer(int baseArrayLayer)
    {
        this.baseArrayLayer = baseArrayLayer;
    }
    
    public int getLayerCount()
    {
        return layerCount;
    }

    public void setLayerCount(int layerCount)
    {
        this.layerCount = layerCount;
    }
}
