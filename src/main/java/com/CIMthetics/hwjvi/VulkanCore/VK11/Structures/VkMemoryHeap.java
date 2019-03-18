package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures;

import java.util.EnumSet;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkMemoryHeapFlagBits;

public class VkMemoryHeap
{
    private long                            size;
    private EnumSet<VkMemoryHeapFlagBits>   flags = EnumSet.noneOf(VkMemoryHeapFlagBits.class);
    
    public VkMemoryHeap()
    {
    }
    
    public VkMemoryHeap(long size, EnumSet<VkMemoryHeapFlagBits> flags)
    {
        this.size = size;
        
        if (flags == null)
            flags = EnumSet.noneOf(VkMemoryHeapFlagBits.class);
        else
            this.flags = flags;
    }

    public long getSize()
    {
        return size;
    }

    public void setSize(long size)
    {
        this.size = size;
    }

    public EnumSet<VkMemoryHeapFlagBits> getFlags()
    {
        return flags;
    }

    public void setFlags(EnumSet<VkMemoryHeapFlagBits> flags)
    {
        this.flags = flags;
    }
    
}
