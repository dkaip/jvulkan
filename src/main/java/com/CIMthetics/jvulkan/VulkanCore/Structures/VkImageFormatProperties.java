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
package com.CIMthetics.jvulkan.VulkanCore.Structures;

import java.util.EnumSet;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkSampleCountFlagBits;

public class VkImageFormatProperties
{
    private VkExtent3D                      maxExtent = new VkExtent3D();
    private int                             maxMipLevels;
    private int                             maxArrayLayers;
    private EnumSet<VkSampleCountFlagBits>  sampleCounts = EnumSet.noneOf(VkSampleCountFlagBits.class);
    private long                            maxResourceSize;
    
    public VkExtent3D getMaxExtent()
    {
        return maxExtent;
    }
    
    public void setMaxExtent(VkExtent3D maxExtent)
    {
        this.maxExtent = maxExtent;
    }
    
    public int getMaxMipLevels()
    {
        return maxMipLevels;
    }
    
    public void setMaxMipLevels(int maxMipLevels)
    {
        this.maxMipLevels = maxMipLevels;
    }
    
    public int getMaxArrayLayers()
    {
        return maxArrayLayers;
    }
    
    public void setMaxArrayLayers(int maxArrayLayers)
    {
        this.maxArrayLayers = maxArrayLayers;
    }
    
    public EnumSet<VkSampleCountFlagBits> getSampleCounts()
    {
        return sampleCounts;
    }
    
    public void setSampleCounts(EnumSet<VkSampleCountFlagBits> sampleCounts)
    {
        this.sampleCounts = sampleCounts;
    }
    
    public long getMaxResourceSize()
    {
        return maxResourceSize;
    }
    
    public void setMaxResourceSize(long maxResourceSize)
    {
        this.maxResourceSize = maxResourceSize;
    }
    
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\nVkImageFormatProperties\n"));
        sb.append(String.format("    maxExtent:%s\n", maxExtent == null ? "null" : maxExtent.toString()));
        sb.append(String.format("    maxMipLevels:%d\n", maxMipLevels));
        sb.append(String.format("    maxArrayLayers:%d\n", maxArrayLayers));
        sb.append(String.format("    sampleCounts:%s\n", sampleCounts == null ? "null" : sampleCounts.toString()));
        sb.append(String.format("    maxResourceSize:%d\n", maxResourceSize));

        
        return sb.toString();
    }
}
