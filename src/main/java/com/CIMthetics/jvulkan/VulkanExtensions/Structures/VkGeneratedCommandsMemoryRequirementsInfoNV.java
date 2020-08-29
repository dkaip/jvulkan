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
package com.CIMthetics.jvulkan.VulkanExtensions.Structures;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkPipelineBindPoint;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Handles.VkPipeline;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VulkanCreateInfoStructure;
import com.CIMthetics.jvulkan.VulkanExtensions.Handles.VkIndirectCommandsLayoutNV;

public class VkGeneratedCommandsMemoryRequirementsInfoNV extends VulkanCreateInfoStructure
{
    private VkPipelineBindPoint         pipelineBindPoint;
    private VkPipeline                  pipeline;
    private VkIndirectCommandsLayoutNV  indirectCommandsLayout;
    private int                         maxSequencesCount;

    public VkGeneratedCommandsMemoryRequirementsInfoNV()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_GENERATED_COMMANDS_MEMORY_REQUIREMENTS_INFO_NV);
    }

    public VkPipelineBindPoint getPipelineBindPoint()
    {
        return pipelineBindPoint;
    }

    public void setPipelineBindPoint(VkPipelineBindPoint pipelineBindPoint)
    {
        this.pipelineBindPoint = pipelineBindPoint;
    }

    public VkPipeline getPipeline()
    {
        return pipeline;
    }

    public void setPipeline(VkPipeline pipeline)
    {
        this.pipeline = pipeline;
    }

    public VkIndirectCommandsLayoutNV getIndirectCommandsLayout()
    {
        return indirectCommandsLayout;
    }

    public void setIndirectCommandsLayout(VkIndirectCommandsLayoutNV indirectCommandsLayout)
    {
        this.indirectCommandsLayout = indirectCommandsLayout;
    }

    public int getMaxSequencesCount()
    {
        return maxSequencesCount;
    }

    public void setMaxSequencesCount(int maxSequencesCount)
    {
        this.maxSequencesCount = maxSequencesCount;
    }
}
