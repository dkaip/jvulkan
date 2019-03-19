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

import java.util.EnumSet;

import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkImageAspectFlagBits;

public class VkImageSubresourceRange
{
    private EnumSet<VkImageAspectFlagBits>  aspectMask = EnumSet.noneOf(VkImageAspectFlagBits.class);
    private int                             baseMipLevel;
    private int                             levelCount;
    private int                             baseArrayLayer;
    private int                             layerCount;
    
    public EnumSet<VkImageAspectFlagBits> getAspectMask()
    {
        return aspectMask;
    }
    
    public void setAspectMask(EnumSet<VkImageAspectFlagBits> aspectMask)
    {
        this.aspectMask = aspectMask;
    }
    
    public int getBaseMipLevel()
    {
        return baseMipLevel;
    }
    
    public void setBaseMipLevel(int baseMipLevel)
    {
        this.baseMipLevel = baseMipLevel;
    }
    
    public int getLevelCount()
    {
        return levelCount;
    }
    
    public void setLevelCount(int levelCount)
    {
        this.levelCount = levelCount;
    }
    
    public int getBaseArrayLayer()
    {
        return baseArrayLayer;
    }
    
    public void setBaseArrayLayer(int baseArrayLayer)
    {
        this.baseArrayLayer = baseArrayLayer;
    }
    
    public int getLayerCount()
    {
        return layerCount;
    }
    
    public void setLayerCount(int layerCount)
    {
        this.layerCount = layerCount;
    }
}