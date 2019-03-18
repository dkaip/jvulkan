package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures;

public class VkSpecializationMapEntry
{
    private int     constantId;
    private int     offset;
    private long    size;
    
    public VkSpecializationMapEntry(int constantId, int offset, long size)
    {
        this.constantId = constantId;
        this.offset     = offset;
        this.size       = size;
    }
    
    public int getConstantId()
    {
        return constantId;
    }
    
    public int getOffset()
    {
        return offset;
    }
    
    public long getSize()
    {
        return size;
    }
}
