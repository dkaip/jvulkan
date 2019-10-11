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

import java.util.Collection;

import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Handles.VkBuffer;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Handles.VkCommandBuffer;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Handles.VkIndirectCommandsLayoutNVX;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Handles.VkObjectTableNVX;

public class VkCmdProcessCommandsInfoNVX extends VulkanCreateInfoStructure
{
    private VkObjectTableNVX                        objectTable;
    private VkIndirectCommandsLayoutNVX             indirectCommandsLayout;
    private Collection<VkIndirectCommandsTokenNVX>  indirectCommandsTokens;
    private int                                     maxSequencesCount;
    private VkCommandBuffer                         targetCommandBuffer;
    private VkBuffer                                sequencesCountBuffer;
    private long                                    sequencesCountOffset;
    private VkBuffer                                sequencesIndexBuffer;
    private long                                    sequencesIndexOffset;

    public VkCmdProcessCommandsInfoNVX()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_CMD_PROCESS_COMMANDS_INFO_NVX);
    }

    public VkObjectTableNVX getObjectTable()
    {
        return objectTable;
    }

    public void setObjectTable(VkObjectTableNVX objectTable)
    {
        this.objectTable = objectTable;
    }

    public VkIndirectCommandsLayoutNVX getIndirectCommandsLayout()
    {
        return indirectCommandsLayout;
    }

    public void setIndirectCommandsLayout(
            VkIndirectCommandsLayoutNVX indirectCommandsLayout)
    {
        this.indirectCommandsLayout = indirectCommandsLayout;
    }

    public Collection<VkIndirectCommandsTokenNVX> getIndirectCommandsTokens()
    {
        return indirectCommandsTokens;
    }

    public void setIndirectCommandsTokens(
            Collection<VkIndirectCommandsTokenNVX> indirectCommandsTokens)
    {
        this.indirectCommandsTokens = indirectCommandsTokens;
    }

    public int getMaxSequencesCount()
    {
        return maxSequencesCount;
    }

    public void setMaxSequencesCount(int maxSequencesCount)
    {
        this.maxSequencesCount = maxSequencesCount;
    }

    public VkCommandBuffer getTargetCommandBuffer()
    {
        return targetCommandBuffer;
    }

    public void setTargetCommandBuffer(VkCommandBuffer targetCommandBuffer)
    {
        this.targetCommandBuffer = targetCommandBuffer;
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
