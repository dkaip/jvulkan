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

public class VkImageCopy
{
    private VkImageSubresourceLayers    srcSubresource;
    private VkOffset3D                  srcOffset;
    private VkImageSubresourceLayers    dstSubresource;
    private VkOffset3D                  dstOffset;
    private VkExtent3D                  extent;
    
    public VkImageSubresourceLayers getSrcSubresource()
    {
        return srcSubresource;
    }
    
    public void setSrcSubresource(VkImageSubresourceLayers srcSubresource)
    {
        this.srcSubresource = srcSubresource;
    }
    
    public VkOffset3D getSrcOffset()
    {
        return srcOffset;
    }
    
    public void setSrcOffset(VkOffset3D srcOffset)
    {
        this.srcOffset = srcOffset;
    }
    
    public VkImageSubresourceLayers getDstSubresource()
    {
        return dstSubresource;
    }
    
    public void setDstSubresource(VkImageSubresourceLayers dstSubresource)
    {
        this.dstSubresource = dstSubresource;
    }
    
    public VkOffset3D getDstOffset()
    {
        return dstOffset;
    }
    
    public void setDstOffset(VkOffset3D dstOffset)
    {
        this.dstOffset = dstOffset;
    }
    
    public VkExtent3D getExtent()
    {
        return extent;
    }
    
    public void setExtent(VkExtent3D extent)
    {
        this.extent = extent;
    }
}
