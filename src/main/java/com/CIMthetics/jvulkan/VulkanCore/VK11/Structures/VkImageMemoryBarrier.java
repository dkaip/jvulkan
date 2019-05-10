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

import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkAccessFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkImageLayout;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Handles.VkImage;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkImageMemoryBarrier extends VulkanCreateInfoStructure
{
    private EnumSet<VkAccessFlagBits>   srcAccessMask = EnumSet.noneOf(VkAccessFlagBits.class);
    private EnumSet<VkAccessFlagBits>   dstAccessMask = EnumSet.noneOf(VkAccessFlagBits.class);
    private VkImageLayout               oldLayout;
    private VkImageLayout               newLayout;
    private int                         srcQueueFamilyIndex;
    private int                         dstQueueFamilyIndex;
    private VkImage                     image;
    private VkImageSubresourceRange     subresourceRange;

    public VkImageMemoryBarrier()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_IMAGE_MEMORY_BARRIER);
    }

    public EnumSet<VkAccessFlagBits> getSrcAccessMask()
    {
        return srcAccessMask;
    }

    public void setSrcAccessMask(EnumSet<VkAccessFlagBits> srcAccessMask)
    {
        this.srcAccessMask = srcAccessMask;
    }

    public EnumSet<VkAccessFlagBits> getDstAccessMask()
    {
        return dstAccessMask;
    }

    public void setDstAccessMask(EnumSet<VkAccessFlagBits> dstAccessMask)
    {
        this.dstAccessMask = dstAccessMask;
    }

    public VkImageLayout getOldLayout()
    {
        return oldLayout;
    }

    public void setOldLayout(VkImageLayout oldLayout)
    {
        this.oldLayout = oldLayout;
    }

    public VkImageLayout getNewLayout()
    {
        return newLayout;
    }

    public void setNewLayout(VkImageLayout newLayout)
    {
        this.newLayout = newLayout;
    }

    public int getSrcQueueFamilyIndex()
    {
        return srcQueueFamilyIndex;
    }

    public void setSrcQueueFamilyIndex(int srcQueueFamilyIndex)
    {
        this.srcQueueFamilyIndex = srcQueueFamilyIndex;
    }

    public int getDstQueueFamilyIndex()
    {
        return dstQueueFamilyIndex;
    }

    public void setDstQueueFamilyIndex(int dstQueueFamilyIndex)
    {
        this.dstQueueFamilyIndex = dstQueueFamilyIndex;
    }

    public VkImage getImage()
    {
        return image;
    }

    public void setImage(VkImage image)
    {
        this.image = image;
    }

    public VkImageSubresourceRange getSubresourceRange()
    {
        return subresourceRange;
    }

    public void setSubresourceRange(VkImageSubresourceRange subresourceRange)
    {
        this.subresourceRange = subresourceRange;
    }
    
}
