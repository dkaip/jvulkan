package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures;

import java.util.EnumSet;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkMemoryPropertyFlagBits;

public class VkMemoryType
{
    private EnumSet<VkMemoryPropertyFlagBits>   propertyFlags = EnumSet.noneOf(VkMemoryPropertyFlagBits.class);
    private int                                 heapIndex;
    
    public VkMemoryType()
    {
    }
    
    public VkMemoryType(EnumSet<VkMemoryPropertyFlagBits> propertyFlags, int heapIndex)
    {
        if (propertyFlags == null)
            this.propertyFlags = EnumSet.noneOf(VkMemoryPropertyFlagBits.class);
        else
            this.propertyFlags = propertyFlags;
        
        this.heapIndex     = heapIndex;
    }
    
    public EnumSet<VkMemoryPropertyFlagBits> getPropertyFlags()
    {
        return propertyFlags;
    }
    
    public void setPropertyFlags(EnumSet<VkMemoryPropertyFlagBits> propertyFlags)
    {
        this.propertyFlags = propertyFlags;
    }
    
    public int getHeapIndex()
    {
        return heapIndex;
    }
    
    public void setHeapIndex(int heapIndex)
    {
        this.heapIndex = heapIndex;
    }
}
