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

import java.util.EnumSet;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkPipelineBindPoint;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VulkanCreateInfoStructure;
import com.CIMthetics.jvulkan.VulkanExtensions.Enums.VkIndirectCommandsLayoutUsageFlagBitsNV;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.VkIndirectCommandsLayoutTokenNV;

public class VkIndirectCommandsLayoutCreateInfoNV extends VulkanCreateInfoStructure
{
    private EnumSet<VkIndirectCommandsLayoutUsageFlagBitsNV>    flags = EnumSet.noneOf(VkIndirectCommandsLayoutUsageFlagBitsNV.class);
    private VkPipelineBindPoint                                 pipelineBindPoint;
    private VkIndirectCommandsLayoutTokenNV[]                   tokens;
    private int[]                                               streamStrides;

    public VkIndirectCommandsLayoutCreateInfoNV()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_CREATE_INFO_NV);
    }

    public EnumSet<VkIndirectCommandsLayoutUsageFlagBitsNV> getFlags()
    {
        return flags;
    }

    public void setFlags(EnumSet<VkIndirectCommandsLayoutUsageFlagBitsNV> flags)
    {
        this.flags = flags;
    }

    public VkPipelineBindPoint getPipelineBindPoint()
    {
        return pipelineBindPoint;
    }

    public void setPipelineBindPoint(VkPipelineBindPoint pipelineBindPoint)
    {
        this.pipelineBindPoint = pipelineBindPoint;
    }

    public VkIndirectCommandsLayoutTokenNV[] getTokens()
    {
        return tokens;
    }

    public void setTokens(VkIndirectCommandsLayoutTokenNV[] tokens)
    {
        this.tokens = tokens;
    }

    public int[] getStreamStrides()
    {
        return streamStrides;
    }

    public void setStreamStrides(int[] streamStrides)
    {
        this.streamStrides = streamStrides;
    }
}
