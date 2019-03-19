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
package com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos;

import java.util.Collection;
import java.util.EnumSet;

import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkPipelineVertexInputStateCreateFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkVertexInputAttributeDescription;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkVertexInputBindingDescription;

public class VkPipelineVertexInputStateCreateInfo extends VulkanCreateInfoStructure
{
    private long                                                pNext;
    private EnumSet<VkPipelineVertexInputStateCreateFlagBits>   flags = EnumSet.noneOf(VkPipelineVertexInputStateCreateFlagBits.class);
    private Collection<VkVertexInputBindingDescription>         vertexBindingDescriptions;
    private Collection<VkVertexInputAttributeDescription>       vertexAttributeDescriptions;

    public VkPipelineVertexInputStateCreateInfo()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_STATE_CREATE_INFO);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public EnumSet<VkPipelineVertexInputStateCreateFlagBits> getFlags()
    {
        return flags;
    }

    public void setFlags(EnumSet<VkPipelineVertexInputStateCreateFlagBits> flags)
    {
        this.flags = flags;
    }

    public Collection<VkVertexInputBindingDescription> getVertexBindingDescriptions()
    {
        return vertexBindingDescriptions;
    }

    public void setVertexBindingDescriptions(
            Collection<VkVertexInputBindingDescription> vertexBindingDescriptions)
    {
        this.vertexBindingDescriptions = vertexBindingDescriptions;
    }

    public Collection<VkVertexInputAttributeDescription> getVertexAttributeDescriptions()
    {
        return vertexAttributeDescriptions;
    }

    public void setVertexAttributeDescriptions(
            Collection<VkVertexInputAttributeDescription> vertexAttributeDescriptions)
    {
        this.vertexAttributeDescriptions = vertexAttributeDescriptions;
    }
    
}
