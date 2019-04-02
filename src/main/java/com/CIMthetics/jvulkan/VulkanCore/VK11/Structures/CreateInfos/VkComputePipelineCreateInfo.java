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

import java.util.EnumSet;

import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkPipelineCreateFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Handles.VkPipeline;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Handles.VkPipelineLayout;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.CreateInfos.VkPipelineShaderStageCreateInfo;

public class VkComputePipelineCreateInfo extends VulkanCreateInfoStructure
{
    private long                                pNext;
    private EnumSet<VkPipelineCreateFlagBits>   flags = EnumSet.noneOf(VkPipelineCreateFlagBits.class);
    private VkPipelineShaderStageCreateInfo     stage;
    private VkPipelineLayout                    layout;
    private VkPipeline                          basePipelineHandle;
    private int                                 basePipelineIndex;

    public VkComputePipelineCreateInfo()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_COMPUTE_PIPELINE_CREATE_INFO);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public EnumSet<VkPipelineCreateFlagBits> getFlags()
    {
        return flags;
    }

    public void setFlags(EnumSet<VkPipelineCreateFlagBits> flags)
    {
        this.flags = flags;
    }

    public VkPipelineShaderStageCreateInfo getStage()
    {
        return stage;
    }

    public void setStage(VkPipelineShaderStageCreateInfo stage)
    {
        this.stage = stage;
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
