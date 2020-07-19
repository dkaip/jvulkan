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

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkPipelineBindPoint;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VulkanCreateInfoStructure;
import com.CIMthetics.jvulkan.VulkanExtensions.Enums.VkIndirectCommandsLayoutUsageFlagBitsNVX;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.VkIndirectCommandsLayoutTokenNVX;

public class VkIndirectCommandsLayoutCreateInfoNVX extends VulkanCreateInfoStructure
{
    private VkPipelineBindPoint                                 pipelineBindPoint;
    private EnumSet<VkIndirectCommandsLayoutUsageFlagBitsNVX>   flags = EnumSet.noneOf(VkIndirectCommandsLayoutUsageFlagBitsNVX.class);
    private Collection<VkIndirectCommandsLayoutTokenNVX>        tokens;

    public VkIndirectCommandsLayoutCreateInfoNVX()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_INDIRECT_COMMANDS_LAYOUT_CREATE_INFO_NVX);
    }

    public VkPipelineBindPoint getPipelineBindPoint()
    {
        return pipelineBindPoint;
    }

    public void setPipelineBindPoint(VkPipelineBindPoint pipelineBindPoint)
    {
        this.pipelineBindPoint = pipelineBindPoint;
    }

    public EnumSet<VkIndirectCommandsLayoutUsageFlagBitsNVX> getFlags()
    {
        return flags;
    }

    public void setFlags(EnumSet<VkIndirectCommandsLayoutUsageFlagBitsNVX> flags)
    {
        this.flags = flags;
    }

    public Collection<VkIndirectCommandsLayoutTokenNVX> getTokens()
    {
        return tokens;
    }

    public void setTokens(Collection<VkIndirectCommandsLayoutTokenNVX> tokens)
    {
        this.tokens = tokens;
    }

}
