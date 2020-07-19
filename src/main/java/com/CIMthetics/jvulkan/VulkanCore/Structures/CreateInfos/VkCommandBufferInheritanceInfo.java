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
package com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos;

import java.util.EnumSet;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkQueryControlFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkQueryPipelineStatisticFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Handles.VkFramebuffer;
import com.CIMthetics.jvulkan.VulkanCore.Handles.VkRenderPass;

public class VkCommandBufferInheritanceInfo extends VulkanCreateInfoStructure
{
    private VkRenderPass                                renderPass;
    private int                                         subpass;
    private VkFramebuffer                               framebuffer;
    private boolean                                     occlusionQueryEnable;
    private EnumSet<VkQueryControlFlagBits>             queryFlags = EnumSet.noneOf(VkQueryControlFlagBits.class);
    private EnumSet<VkQueryPipelineStatisticFlagBits>   pipelineStatistics = EnumSet.noneOf(VkQueryPipelineStatisticFlagBits.class);

    public VkCommandBufferInheritanceInfo()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_INFO);
    }

    public VkRenderPass getRenderPass()
    {
        return renderPass;
    }

    public void setRenderPass(VkRenderPass renderPass)
    {
        this.renderPass = renderPass;
    }

    public int getSubpass()
    {
        return subpass;
    }

    public void setSubpass(int subpass)
    {
        this.subpass = subpass;
    }

    public VkFramebuffer getFramebuffer()
    {
        return framebuffer;
    }

    public void setFramebuffer(VkFramebuffer framebuffer)
    {
        this.framebuffer = framebuffer;
    }

    public boolean isOcclusionQueryEnable()
    {
        return occlusionQueryEnable;
    }

    public void setOcclusionQueryEnable(boolean occlusionQueryEnable)
    {
        this.occlusionQueryEnable = occlusionQueryEnable;
    }

    public EnumSet<VkQueryControlFlagBits> getQueryFlags()
    {
        return queryFlags;
    }

    public void setQueryFlags(EnumSet<VkQueryControlFlagBits> queryFlags)
    {
        this.queryFlags = queryFlags;
    }

    public EnumSet<VkQueryPipelineStatisticFlagBits> getPipelineStatistics()
    {
        return pipelineStatistics;
    }

    public void setPipelineStatistics(
            EnumSet<VkQueryPipelineStatisticFlagBits> pipelineStatistics)
    {
        this.pipelineStatistics = pipelineStatistics;
    }
    
}
