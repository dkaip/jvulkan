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

import java.util.Collection;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkPipelineBindPoint;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Handles.VkBuffer;
import com.CIMthetics.jvulkan.VulkanCore.Handles.VkPipeline;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VulkanCreateInfoStructure;
import com.CIMthetics.jvulkan.VulkanExtensions.Handles.VkIndirectCommandsLayoutNV;

public class VkGeneratedCommandsInfoNV extends VulkanCreateInfoStructure
{
    private VkPipelineBindPoint                     pipelineBindPoint;
    private VkPipeline                              pipeline;
    private VkIndirectCommandsLayoutNV              indirectCommandsLayout;
    private Collection<VkIndirectCommandsStreamNV>  streams;
    private int                                     sequencesCount;
    private VkBuffer                                preprocessBuffer;
    private long                                    preprocessOffset;
    private long                                    preprocessSize;
    private VkBuffer                                sequencesCountBuffer;
    private long                                    sequencesCountOffset;
    private VkBuffer                                sequencesIndexBuffer;
    private long                                    sequencesIndexOffset;

    public VkGeneratedCommandsInfoNV()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_GENERATED_COMMANDS_INFO_NV);
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

    public Collection<VkIndirectCommandsStreamNV> getStreams()
    {
        return streams;
    }

    public void setStreams(Collection<VkIndirectCommandsStreamNV> streams)
    {
        this.streams = streams;
    }

    public int getSequencesCount()
    {
        return sequencesCount;
    }

    public void setSequencesCount(int sequencesCount)
    {
        this.sequencesCount = sequencesCount;
    }

    public VkBuffer getPreprocessBuffer()
    {
        return preprocessBuffer;
    }

    public void setPreprocessBuffer(VkBuffer preprocessBuffer)
    {
        this.preprocessBuffer = preprocessBuffer;
    }

    public long getPreprocessOffset()
    {
        return preprocessOffset;
    }

    public void setPreprocessOffset(long preprocessOffset)
    {
        this.preprocessOffset = preprocessOffset;
    }

    public long getPreprocessSize()
    {
        return preprocessSize;
    }

    public void setPreprocessSize(long preprocessSize)
    {
        this.preprocessSize = preprocessSize;
    }

    public VkBuffer getSequencesCountBuffer()
    {
        return sequencesCountBuffer;
    }

    public void setSequencesCountBuffer(VkBuffer sequencesCountBuffer)
    {
        this.sequencesCountBuffer = sequencesCountBuffer;
    }

    public long getSequencesCountOffset()
    {
        return sequencesCountOffset;
    }

    public void setSequencesCountOffset(long sequencesCountOffset)
    {
        this.sequencesCountOffset = sequencesCountOffset;
    }

    public VkBuffer getSequencesIndexBuffer()
    {
        return sequencesIndexBuffer;
    }

    public void setSequencesIndexBuffer(VkBuffer sequencesIndexBuffer)
    {
        this.sequencesIndexBuffer = sequencesIndexBuffer;
    }

    public long getSequencesIndexOffset()
    {
        return sequencesIndexOffset;
    }

    public void setSequencesIndexOffset(long sequencesIndexOffset)
    {
        this.sequencesIndexOffset = sequencesIndexOffset;
    }
}
