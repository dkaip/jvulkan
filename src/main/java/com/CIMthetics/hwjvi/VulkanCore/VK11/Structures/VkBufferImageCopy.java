package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures;

public class VkBufferImageCopy
{
    private long                        bufferOffset;
    private int                         bufferRowLength;
    private int                         bufferImageHeight;
    private VkImageSubresourceLayers    imageSubresource;
    private VkOffset3D                  imageOffset;
    private VkExtent3D                  imageExtent;
    
    public long getBufferOffset()
    {
        return bufferOffset;
    }
    
    public void setBufferOffset(long bufferOffset)
    {
        this.bufferOffset = bufferOffset;
    }
    
    public int getBufferRowLength()
    {
        return bufferRowLength;
    }
    
    public void setBufferRowLength(int bufferRowLength)
    {
        this.bufferRowLength = bufferRowLength;
    }
    
    public int getBufferImageHeight()
    {
        return bufferImageHeight;
    }
    
    public void setBufferImageHeight(int bufferImageHeight)
    {
        this.bufferImageHeight = bufferImageHeight;
    }
    
    public VkImageSubresourceLayers getImageSubresource()
    {
        return imageSubresource;
    }
    
    public void setImageSubresource(VkImageSubresourceLayers imageSubresource)
    {
        this.imageSubresource = imageSubresource;
    }
    
    public VkOffset3D getImageOffset()
    {
        return imageOffset;
    }
    
    public void setImageOffset(VkOffset3D imageOffset)
    {
        this.imageOffset = imageOffset;
    }
    
    public VkExtent3D getImageExtent()
    {
        return imageExtent;
    }
    
    public void setImageExtent(VkExtent3D imageExtent)
    {
        this.imageExtent = imageExtent;
    }
}
