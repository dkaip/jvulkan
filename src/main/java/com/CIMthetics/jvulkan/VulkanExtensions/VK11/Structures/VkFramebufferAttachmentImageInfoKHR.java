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
package com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures;

import java.util.Collection;
import java.util.EnumSet;

import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkFormat;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkImageCreateFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkImageUsageFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkFramebufferAttachmentImageInfoKHR extends VulkanCreateInfoStructure
{
    private EnumSet<VkImageCreateFlagBits>  flags = EnumSet.noneOf(VkImageCreateFlagBits.class);
    private EnumSet<VkImageUsageFlagBits>   usage = EnumSet.noneOf(VkImageUsageFlagBits.class);
    private int                             width;
    private int                             height;
    private int                             layerCount;
    private Collection<VkFormat>            viewFormats;
    
    public VkFramebufferAttachmentImageInfoKHR()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_FRAMEBUFFER_ATTACHMENT_IMAGE_INFO_KHR);
    }

    public EnumSet<VkImageCreateFlagBits> getFlags()
    {
        return flags;
    }

    public void setFlags(EnumSet<VkImageCreateFlagBits> flags)
    {
        this.flags = flags;
    }

    public EnumSet<VkImageUsageFlagBits> getUsage()
    {
        return usage;
    }

    public void setUsage(EnumSet<VkImageUsageFlagBits> usage)
    {
        this.usage = usage;
    }

    public int getWidth()
    {
        return width;
    }

    public void setWidth(int width)
    {
        this.width = width;
    }

    public int getHeight()
    {
        return height;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    public int getLayerCount()
    {
        return layerCount;
    }

    public void setLayerCount(int layerCount)
    {
        this.layerCount = layerCount;
    }

    public Collection<VkFormat> getViewFormats()
    {
        return viewFormats;
    }

    public void setViewFormats(Collection<VkFormat> viewFormats)
    {
        this.viewFormats = viewFormats;
    }
}
