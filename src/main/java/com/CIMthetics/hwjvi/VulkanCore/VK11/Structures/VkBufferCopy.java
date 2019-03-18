package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures;

public class VkBufferCopy
{
    private long srcOffset;
    private long dstOffset;
    private long size;
    
    public VkBufferCopy(long srcOffset, long dstOffset, long size)
    {
        this.srcOffset = srcOffset;
        this.dstOffset = dstOffset;
        this.size      = size;
    }

    public long getSrcOffset()
    {
        return srcOffset;
    }

    public void setSrcOffset(long srcOffset)
    {
        this.srcOffset = srcOffset;
    }

    public long getDstOffset()
    {
        return dstOffset;
    }

    public void setDstOffset(long dstOffset)
    {
        this.dstOffset = dstOffset;
    }

    public long getSize()
    {
        return size;
    }

    public void setSize(long size)
    {
        this.size = size;
    }
    
}
