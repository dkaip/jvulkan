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

import java.util.EnumSet;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkFormat;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkImageTiling;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkImageType;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkImageUsageFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkSampleCountFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkPhysicalDeviceSparseImageFormatInfo2 extends VulkanCreateInfoStructure
{
    private VkFormat                        format;
    private VkImageType                     type;
    private VkSampleCountFlagBits           samples;
    private EnumSet<VkImageUsageFlagBits>   usage;
    private VkImageTiling                   tiling;

    public VkPhysicalDeviceSparseImageFormatInfo2()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SPARSE_IMAGE_FORMAT_INFO_2);
    }

    public VkFormat getFormat()
    {
        return format;
    }

    public void setFormat(VkFormat format)
    {
        this.format = format;
    }

    public VkImageType getType()
    {
        return type;
    }

    public void setType(VkImageType type)
    {
        this.type = type;
    }

    public VkSampleCountFlagBits getSamples()
    {
        return samples;
    }

    public void setSamples(VkSampleCountFlagBits samples)
    {
        this.samples = samples;
    }

    public EnumSet<VkImageUsageFlagBits> getUsage()
    {
        return usage;
    }

    public void setUsage(EnumSet<VkImageUsageFlagBits> usage)
    {
        this.usage = usage;
    }

    public VkImageTiling getTiling()
    {
        return tiling;
    }

    public void setTiling(VkImageTiling tiling)
    {
        this.tiling = tiling;
    }

}
