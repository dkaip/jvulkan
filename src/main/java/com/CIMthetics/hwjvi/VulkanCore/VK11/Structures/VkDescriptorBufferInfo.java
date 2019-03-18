package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Handles.VkBuffer;

public class VkDescriptorBufferInfo
{
    private VkBuffer    buffer;
    private long        offset;
    private long        range;
    
    public VkDescriptorBufferInfo() {}
    
    public VkDescriptorBufferInfo(VkBuffer buffer, long offset, long range)
    {
        this.buffer = buffer;
        this.offset = offset;
        this.range  = range;
    }

    public VkBuffer getBuffer()
    {
        return buffer;
    }

    public void setBuffer(VkBuffer buffer)
    {
        this.buffer = buffer;
    }

    public long getOffset()
    {
        return offset;
    }

    public void setOffset(long offset)
    {
        this.offset = offset;
    }

    public long getRange()
    {
        return range;
    }

    public void setRange(long range)
    {
        this.range = range;
    }
    
}
