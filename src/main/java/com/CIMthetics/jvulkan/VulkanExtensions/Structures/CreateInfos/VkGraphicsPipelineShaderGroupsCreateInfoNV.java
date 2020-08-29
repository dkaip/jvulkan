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
import com.CIMthetics.jvulkan.VulkanCore.Handles.VkPipeline;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkGraphicsPipelineShaderGroupsCreateInfoNV extends VulkanCreateInfoStructure
{
    private Collection<VkGraphicsShaderGroupCreateInfoNV>   groups;
    private Collection<VkPipeline>                          pipelines;

    public VkGraphicsPipelineShaderGroupsCreateInfoNV()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_GRAPHICS_PIPELINE_SHADER_GROUPS_CREATE_INFO_NV);
    }

    public Collection<VkGraphicsShaderGroupCreateInfoNV> getGroups()
    {
        return groups;
    }

    public void setGroups(Collection<VkGraphicsShaderGroupCreateInfoNV> groups)
    {
        this.groups = groups;
    }

    public Collection<VkPipeline> getPipelines()
    {
        return pipelines;
    }

    public void setPipelines(Collection<VkPipeline> pipelines)
    {
        this.pipelines = pipelines;
    }
}
