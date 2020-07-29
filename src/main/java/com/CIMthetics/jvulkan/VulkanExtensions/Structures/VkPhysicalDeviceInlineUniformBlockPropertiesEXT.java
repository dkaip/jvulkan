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
package com.CIMthetics.jvulkan.VulkanExtensions.Structures;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkPhysicalDeviceInlineUniformBlockPropertiesEXT extends VulkanCreateInfoStructure
{
    private int maxInlineUniformBlockSize;
    private int maxPerStageDescriptorInlineUniformBlocks;
    private int maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks;
    private int maxDescriptorSetInlineUniformBlocks;
    private int maxDescriptorSetUpdateAfterBindInlineUniformBlocks;

    public VkPhysicalDeviceInlineUniformBlockPropertiesEXT()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_PROPERTIES_EXT);
    }

    public int getMaxInlineUniformBlockSize()
    {
        return maxInlineUniformBlockSize;
    }

    public void setMaxInlineUniformBlockSize(int maxInlineUniformBlockSize)
    {
        this.maxInlineUniformBlockSize = maxInlineUniformBlockSize;
    }

    public int getMaxPerStageDescriptorInlineUniformBlocks()
    {
        return maxPerStageDescriptorInlineUniformBlocks;
    }

    public void setMaxPerStageDescriptorInlineUniformBlocks(
            int maxPerStageDescriptorInlineUniformBlocks)
    {
        this.maxPerStageDescriptorInlineUniformBlocks = maxPerStageDescriptorInlineUniformBlocks;
    }

    public int getMaxPerStageDescriptorUpdateAfterBindInlineUniformBlocks()
    {
        return maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks;
    }

    public void setMaxPerStageDescriptorUpdateAfterBindInlineUniformBlocks(
            int maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks)
    {
        this.maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks = maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks;
    }

    public int getMaxDescriptorSetInlineUniformBlocks()
    {
        return maxDescriptorSetInlineUniformBlocks;
    }

    public void setMaxDescriptorSetInlineUniformBlocks(
            int maxDescriptorSetInlineUniformBlocks)
    {
        this.maxDescriptorSetInlineUniformBlocks = maxDescriptorSetInlineUniformBlocks;
    }

    public int getMaxDescriptorSetUpdateAfterBindInlineUniformBlocks()
    {
        return maxDescriptorSetUpdateAfterBindInlineUniformBlocks;
    }

    public void setMaxDescriptorSetUpdateAfterBindInlineUniformBlocks(
            int maxDescriptorSetUpdateAfterBindInlineUniformBlocks)
    {
        this.maxDescriptorSetUpdateAfterBindInlineUniformBlocks = maxDescriptorSetUpdateAfterBindInlineUniformBlocks;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\nVkPhysicalDeviceInlineUniformBlockPropertiesEXT\n"));
        sb.append(String.format("    maxInlineUniformBlockSize:%d\n", maxInlineUniformBlockSize));
        sb.append(String.format("    maxPerStageDescriptorInlineUniformBlocks:%d\n", maxPerStageDescriptorInlineUniformBlocks));
        sb.append(String.format("    maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks:%d\n", maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks));
        sb.append(String.format("    maxDescriptorSetInlineUniformBlocks:%d\n", maxDescriptorSetInlineUniformBlocks));
        sb.append(String.format("    maxDescriptorSetUpdateAfterBindInlineUniformBlocks:%d\n", maxDescriptorSetUpdateAfterBindInlineUniformBlocks));
        
        return sb.toString();
    }
}
