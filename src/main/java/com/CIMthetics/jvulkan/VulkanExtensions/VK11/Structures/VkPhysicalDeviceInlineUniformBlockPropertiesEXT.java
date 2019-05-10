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

import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkPhysicalDeviceInlineUniformBlockPropertiesEXT extends VulkanCreateInfoStructure
{
    private long    maxInlineUniformBlockSize;
    private long    maxPerStageDescriptorInlineUniformBlocks;
    private long    maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks;
    private long    maxDescriptorSetInlineUniformBlocks;
    private long    maxDescriptorSetUpdateAfterBindInlineUniformBlocks;

    public VkPhysicalDeviceInlineUniformBlockPropertiesEXT()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_PROPERTIES_EXT);
    }

    public long getMaxInlineUniformBlockSize()
    {
        return maxInlineUniformBlockSize;
    }

    public void setMaxInlineUniformBlockSize(long maxInlineUniformBlockSize)
    {
        this.maxInlineUniformBlockSize = maxInlineUniformBlockSize;
    }

    public long getMaxPerStageDescriptorInlineUniformBlocks()
    {
        return maxPerStageDescriptorInlineUniformBlocks;
    }

    public void setMaxPerStageDescriptorInlineUniformBlocks(
            long maxPerStageDescriptorInlineUniformBlocks)
    {
        this.maxPerStageDescriptorInlineUniformBlocks = maxPerStageDescriptorInlineUniformBlocks;
    }

    public long getMaxPerStageDescriptorUpdateAfterBindInlineUniformBlocks()
    {
        return maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks;
    }

    public void setMaxPerStageDescriptorUpdateAfterBindInlineUniformBlocks(
            long maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks)
    {
        this.maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks = maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks;
    }

    public long getMaxDescriptorSetInlineUniformBlocks()
    {
        return maxDescriptorSetInlineUniformBlocks;
    }

    public void setMaxDescriptorSetInlineUniformBlocks(
            long maxDescriptorSetInlineUniformBlocks)
    {
        this.maxDescriptorSetInlineUniformBlocks = maxDescriptorSetInlineUniformBlocks;
    }

    public long getMaxDescriptorSetUpdateAfterBindInlineUniformBlocks()
    {
        return maxDescriptorSetUpdateAfterBindInlineUniformBlocks;
    }

    public void setMaxDescriptorSetUpdateAfterBindInlineUniformBlocks(
            long maxDescriptorSetUpdateAfterBindInlineUniformBlocks)
    {
        this.maxDescriptorSetUpdateAfterBindInlineUniformBlocks = maxDescriptorSetUpdateAfterBindInlineUniformBlocks;
    }
}
