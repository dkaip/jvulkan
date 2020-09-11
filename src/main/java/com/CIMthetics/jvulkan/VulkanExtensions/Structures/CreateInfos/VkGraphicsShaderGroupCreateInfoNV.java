/*
 * Copyright 2020 Douglas Kaip
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
package com.CIMthetics.jvulkan.VulkanExtensions.Structures.CreateInfos;

import java.util.Collection;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VkPipelineTessellationStateCreateInfo;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VkPipelineVertexInputStateCreateInfo;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkGraphicsShaderGroupCreateInfoNV extends VulkanCreateInfoStructure
{
    private Collection<VkPipelineShaderStageCreateInfo> stages;
    private VkPipelineVertexInputStateCreateInfo        vertexInputState;
    private VkPipelineTessellationStateCreateInfo       tessellationState;

    public VkGraphicsShaderGroupCreateInfoNV()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_GRAPHICS_SHADER_GROUP_CREATE_INFO_NV);
    }

    public Collection<VkPipelineShaderStageCreateInfo> getStages()
    {
        return stages;
    }

    public void setStages(Collection<VkPipelineShaderStageCreateInfo> stages)
    {
        this.stages = stages;
    }

    public VkPipelineVertexInputStateCreateInfo getVertexInputState()
    {
        return vertexInputState;
    }

    public void setVertexInputState(VkPipelineVertexInputStateCreateInfo vertexInputState)
    {
        this.vertexInputState = vertexInputState;
    }

    public VkPipelineTessellationStateCreateInfo getTessellationState()
    {
        return tessellationState;
    }

    public void setTessellationState(VkPipelineTessellationStateCreateInfo tessellationState)
    {
        this.tessellationState = tessellationState;
    }
}
