package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures;

public class VkSubresourceLayout
{
    private long    offset;
    private long    size;
    private long    rowPitch;
    private long    arrayPitch;
    private long    depthPitch;
    public long getOffset()
    {
        return offset;
    }
    public void setOffset(long offset)
    {
        this.offset = offset;
    }
    public long getSize()
    {
        return size;
    }
    public void setSize(long size)
    {
        this.size = size;
    }
    public long getRowPitch()
    {
        return rowPitch;
    }
    public void setRowPitch(long rowPitch)
    {
        this.rowPitch = rowPitch;
    }
    public long getArrayPitch()
    {
        return arrayPitch;
    }
    public void setArrayPitch(long arrayPitch)
    {
        this.arrayPitch = arrayPitch;
    }
    public long getDepthPitch()
    {
        return depthPitch;
    }
    public void setDepthPitch(long depthPitch)
    {
        this.depthPitch = depthPitch;
    }
    
}
