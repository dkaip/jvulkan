package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures;

import java.util.BitSet;

public class VkMemoryRequirements
{
    private long   size;
    private long   alignment;
    private BitSet memoryTypeBits;
    
    public long getSize()
    {
        return size;
    }

    public void setSize(long size)
    {
        this.size = size;
    }

    public long getAlignment()
    {
        return alignment;
    }

    public void setAlignment(long alignment)
    {
        this.alignment = alignment;
    }

    public BitSet getMemoryTypeBits()
    {
        return memoryTypeBits;
    }

    public void setMemoryTypeBits(BitSet memoryTypeBits)
    {
        this.memoryTypeBits = memoryTypeBits;
    }
    
}
