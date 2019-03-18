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
package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos;

import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedList;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkPipelineViewportStateCreateFlagBits;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.VkRect2D;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.VkViewport;

/**
 * 
 * @author Douglas Kaip
 *
 */
public class VkPipelineViewportStateCreateInfo extends VulkanCreateInfoStructure
{
    private long                                            pNext;
    private EnumSet<VkPipelineViewportStateCreateFlagBits>  flags = EnumSet.noneOf(VkPipelineViewportStateCreateFlagBits.class);
    private Collection<VkViewport>                          viewports;
    private Collection<VkRect2D>                            scissors;
    
    public VkPipelineViewportStateCreateInfo()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_STATE_CREATE_INFO);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public EnumSet<VkPipelineViewportStateCreateFlagBits> getFlags()
    {
        return flags;
    }

    public void setFlags(EnumSet<VkPipelineViewportStateCreateFlagBits> flags)
    {
        this.flags = flags;
    }

    public Collection<VkViewport> getViewports()
    {
        return viewports;
    }

    /**
     * A convenience function for use in the case where there is only one
     * viewport.
     * @param viewport
     */
    public void setViewports(VkViewport viewport)
    {
        this.viewports = new LinkedList<VkViewport>();
        this.viewports.add(viewport);
    }

    public void setViewports(Collection<VkViewport> viewports)
    {
        this.viewports = viewports;
    }

    public Collection<VkRect2D> getScissors()
    {
        return scissors;
    }

    /**
     * A convenience function for use in the case where there is only one
     * scissor.
     * @param viewport
     */
    public void setScissors(VkRect2D scissor)
    {
        this.scissors = new LinkedList<VkRect2D>();
        this.scissors.add(scissor);
    }
    
    public void setScissors(Collection<VkRect2D> scissors)
    {
        this.scissors = scissors;
    }
}
