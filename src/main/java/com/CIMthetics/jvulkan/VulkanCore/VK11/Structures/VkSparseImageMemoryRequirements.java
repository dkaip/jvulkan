/*
 * Copyright 2019 Douglas Kaip
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
package com.CIMthetics.jvulkan.VulkanCore.VK11.Structures;

public class VkSparseImageMemoryRequirements
{
    private VkSparseImageFormatProperties   formatProperties;
    private int                             imageMipTailFirstLod;
    private long                            imageMipTailSize;
    private long                            imageMipTailOffset;
    private long                            imageMipTailStride;
    
    public VkSparseImageFormatProperties getFormatProperties()
    {
        return formatProperties;
    }
    
    public void setFormatProperties(VkSparseImageFormatProperties formatProperties)
    {
        this.formatProperties = formatProperties;
    }
    
    public int getImageMipTailFirstLod()
    {
        return imageMipTailFirstLod;
    }
    
    public void setImageMipTailFirstLod(int imageMipTailFirstLod)
    {
        this.imageMipTailFirstLod = imageMipTailFirstLod;
    }
    
    public long getImageMipTailSize()
    {
        return imageMipTailSize;
    }
    
    public void setImageMipTailSize(long imageMipTailSize)
    {
        this.imageMipTailSize = imageMipTailSize;
    }
    
    public long getImageMipTailOffset()
    {
        return imageMipTailOffset;
    }
    
    public void setImageMipTailOffset(long imageMipTailOffset)
    {
        this.imageMipTailOffset = imageMipTailOffset;
    }
    
    public long getImageMipTailStride()
    {
        return imageMipTailStride;
    }
    
    public void setImageMipTailStride(long imageMipTailStride)
    {
        this.imageMipTailStride = imageMipTailStride;
    }

}
