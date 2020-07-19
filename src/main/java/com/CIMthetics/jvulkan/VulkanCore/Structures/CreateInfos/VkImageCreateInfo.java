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
package com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos;

import java.util.EnumSet;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkFormat;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkImageCreateFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkImageLayout;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkImageTiling;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkImageType;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkImageUsageFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkSampleCountFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkSharingMode;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkExtent3D;

public class VkImageCreateInfo extends VulkanCreateInfoStructure
{
    private EnumSet<VkImageCreateFlagBits>  flags = EnumSet.noneOf(VkImageCreateFlagBits.class);
    private VkImageType                     imageType;
    private VkFormat                        format;
    private VkExtent3D                      extent;
    private int                             mipLevels;
    private int                             arrayLayers;
    private VkSampleCountFlagBits           samples;
    private VkImageTiling                   tiling;
    private EnumSet<VkImageUsageFlagBits>   usage;
    private VkSharingMode                   sharingMode;
    private int[]                           queueFamilyIndices;
    private VkImageLayout                   initialLayout;

    public VkImageCreateInfo()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_IMAGE_CREATE_INFO);
    }

    public EnumSet<VkImageCreateFlagBits> getFlags()
    {
        return flags;
    }

    public void setFlags(EnumSet<VkImageCreateFlagBits> flags)
    {
        this.flags = flags;
    }

    public VkImageType getImageType()
    {
        return imageType;
    }

    public void setImageType(VkImageType imageType)
    {
        this.imageType = imageType;
    }

    public VkFormat getFormat()
    {
        return format;
    }

    public void setFormat(VkFormat format)
    {
        this.format = format;
    }

    public VkExtent3D getExtent()
    {
        return extent;
    }

    public void setExtent(VkExtent3D extent)
    {
        this.extent = extent;
    }

    public int getMipLevels()
    {
        return mipLevels;
    }

    public void setMipLevels(int mipLevels)
    {
        this.mipLevels = mipLevels;
    }

    public int getArrayLayers()
    {
        return arrayLayers;
    }

    public void setArrayLayers(int arrayLayers)
    {
        this.arrayLayers = arrayLayers;
    }

    public VkSampleCountFlagBits getSamples()
    {
        return samples;
    }

    public void setSamples(VkSampleCountFlagBits samples)
    {
        this.samples = samples;
    }

    public VkImageTiling getTiling()
    {
        return tiling;
    }

    public void setTiling(VkImageTiling tiling)
    {
        this.tiling = tiling;
    }

    public EnumSet<VkImageUsageFlagBits> getUsage()
    {
        return usage;
    }

    public void setUsage(EnumSet<VkImageUsageFlagBits> usage)
    {
        this.usage = usage;
    }

    public VkSharingMode getSharingMode()
    {
        return sharingMode;
    }

    public void setSharingMode(VkSharingMode sharingMode)
    {
        this.sharingMode = sharingMode;
    }

    public int[] getQueueFamilyIndices()
    {
        return queueFamilyIndices;
    }

    public void setQueueFamilyIndices(int[] queueFamilyIndices)
    {
        this.queueFamilyIndices = queueFamilyIndices;
    }

    public VkImageLayout getInitialLayout()
    {
        return initialLayout;
    }

    public void setInitialLayout(VkImageLayout initialLayout)
    {
        this.initialLayout = initialLayout;
    }
    
}
