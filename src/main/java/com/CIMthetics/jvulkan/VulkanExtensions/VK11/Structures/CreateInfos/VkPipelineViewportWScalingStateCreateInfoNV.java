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
package com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.CreateInfos;

import java.util.Collection;

import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkViewportWScalingNV;

public class VkPipelineViewportWScalingStateCreateInfoNV extends VulkanCreateInfoStructure
{
    private boolean                             viewportWScalingEnable;
    private Collection<VkViewportWScalingNV>    viewportWScalings;

    public VkPipelineViewportWScalingStateCreateInfoNV()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_W_SCALING_STATE_CREATE_INFO_NV);
    }

    public boolean isViewportWScalingEnable()
    {
        return viewportWScalingEnable;
    }

    public void setViewportWScalingEnable(boolean viewportWScalingEnable)
    {
        this.viewportWScalingEnable = viewportWScalingEnable;
    }

    public Collection<VkViewportWScalingNV> getViewportWScalings()
    {
        return viewportWScalings;
    }

    public void setViewportWScalings(
            Collection<VkViewportWScalingNV> viewportWScalings)
    {
        this.viewportWScalings = viewportWScalings;
    }

}