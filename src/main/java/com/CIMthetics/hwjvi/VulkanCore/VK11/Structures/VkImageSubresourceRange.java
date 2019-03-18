package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures;

import java.util.EnumSet;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkImageAspectFlagBits;

public class VkImageSubresourceRange
{
    private EnumSet<VkImageAspectFlagBits>  aspectMask = EnumSet.noneOf(VkImageAspectFlagBits.class);
    private int                             baseMipLevel;
    private int                             levelCount;
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
    
    public int getBaseMipLevel()
    {
        return baseMipLevel;
    }
    
    public void setBaseMipLevel(int baseMipLevel)
    {
        this.baseMipLevel = baseMipLevel;
    }
    
    public int getLevelCount()
    {
        return levelCount;
    }
    
    public void setLevelCount(int levelCount)
    {
        this.levelCount = levelCount;
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
