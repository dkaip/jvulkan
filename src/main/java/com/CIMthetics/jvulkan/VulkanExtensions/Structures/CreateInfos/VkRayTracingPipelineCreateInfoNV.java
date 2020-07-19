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
package com.CIMthetics.jvulkan.VulkanExtensions.Structures.CreateInfos;

import java.util.Collection;
import java.util.EnumSet;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkPipelineCreateFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Handles.VkPipeline;
import com.CIMthetics.jvulkan.VulkanCore.Handles.VkPipelineLayout;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkRayTracingPipelineCreateInfoNV extends VulkanCreateInfoStructure
{
    private EnumSet<VkPipelineCreateFlagBits>               flags = EnumSet.noneOf(VkPipelineCreateFlagBits.class);
    private Collection<VkPipelineShaderStageCreateInfo>     stages;
    private Collection<VkRayTracingShaderGroupCreateInfoNV> groups;
    private int                                             maxRecursionDepth;
    private VkPipelineLayout                                layout;
    private VkPipeline                                      basePipelineHandle;
    private int                                             basePipelineIndex;

    public VkRayTracingPipelineCreateInfoNV()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_RAY_TRACING_PIPELINE_CREATE_INFO_NV);
    }

    public EnumSet<VkPipelineCreateFlagBits> getFlags()
    {
        return flags;
    }

    public void setFlags(EnumSet<VkPipelineCreateFlagBits> flags)
    {
        this.flags = flags;
    }

    public Collection<VkPipelineShaderStageCreateInfo> getStages()
    {
        return stages;
    }

    public void setStages(Collection<VkPipelineShaderStageCreateInfo> stages)
    {
        this.stages = stages;
    }

    public Collection<VkRayTracingShaderGroupCreateInfoNV> getGroups()
    {
        return groups;
    }

    public void setGroups(Collection<VkRayTracingShaderGroupCreateInfoNV> groups)
    {
        this.groups = groups;
    }

    public int getMaxRecursionDepth()
    {
        return maxRecursionDepth;
    }

    public void setMaxRecursionDepth(int maxRecursionDepth)
    {
        this.maxRecursionDepth = maxRecursionDepth;
    }

    public VkPipelineLayout getLayout()
    {
        return layout;
    }

    public void setLayout(VkPipelineLayout layout)
    {
        this.layout = layout;
    }

    public VkPipeline getBasePipelineHandle()
    {
        return basePipelineHandle;
    }

    public void setBasePipelineHandle(VkPipeline basePipelineHandle)
    {
        this.basePipelineHandle = basePipelineHandle;
    }

    public int getBasePipelineIndex()
    {
        return basePipelineIndex;
    }

    public void setBasePipelineIndex(int basePipelineIndex)
    {
        this.basePipelineIndex = basePipelineIndex;
    }
}
