/*
 * Copyright 2019-2020 Douglas Kaip
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.CIMthetics.jvulkan.VulkanCore.Structures;

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
