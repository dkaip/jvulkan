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

public class VkImageBlit
{
    private VkImageSubresourceLayers    srcSubresource;
    private VkOffset3D[]                srcOffsets;
    private VkImageSubresourceLayers    dstSubresource;
    private VkOffset3D[]                dstOffsets;
    
    public VkImageSubresourceLayers getSrcSubresource()
    {
        return srcSubresource;
    }
    
    public void setSrcSubresource(VkImageSubresourceLayers srcSubresource)
    {
        this.srcSubresource = srcSubresource;
    }
    
    public VkOffset3D[] getSrcOffsets()
    {
        return srcOffsets;
    }
    
    public void setSrcOffsets(VkOffset3D[] srcOffsets)
    {
        if (srcOffsets.length != 2)
        {
            throw new IllegalArgumentException("srcOffsets must have a lengen of 2.");
        }

        this.srcOffsets = srcOffsets;
    }
    
    public VkImageSubresourceLayers getDstSubresource()
    {
        return dstSubresource;
    }
    
    public void setDstSubresource(VkImageSubresourceLayers dstSubresource)
    {
        this.dstSubresource = dstSubresource;
    }
    
    public VkOffset3D[] getDstOffsets()
    {
        return dstOffsets;
    }
    
    public void setDstOffsets(VkOffset3D[] dstOffsets)
    {
        if (dstOffsets.length != 2)
        {
            throw new IllegalArgumentException("dstOffsets must have a lengen of 2.");
        }

        this.dstOffsets = dstOffsets;
    }
}
