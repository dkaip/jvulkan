/*
 * Copyright 2019-2020 Douglas Kaip
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

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VulkanCreateInfoStructure;
import com.CIMthetics.jvulkan.VulkanExtensions.Enums.VkCoverageReductionModeNV;
import com.CIMthetics.jvulkan.VulkanExtensions.Enums.VkPipelineCoverageReductionStateCreateFlagBitsNV;

public class VkPipelineCoverageReductionStateCreateInfoNV extends VulkanCreateInfoStructure
{
    private EnumSet<VkPipelineCoverageReductionStateCreateFlagBitsNV>   flags = EnumSet.noneOf(VkPipelineCoverageReductionStateCreateFlagBitsNV.class);
    private VkCoverageReductionModeNV                                   coverageReductionMode;
    
    public VkPipelineCoverageReductionStateCreateInfoNV()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_COVERAGE_REDUCTION_STATE_CREATE_INFO_NV);
    }

    public EnumSet<VkPipelineCoverageReductionStateCreateFlagBitsNV> getFlags()
    {
        return flags;
    }

    public void setFlags(
            EnumSet<VkPipelineCoverageReductionStateCreateFlagBitsNV> flags)
    {
        this.flags = flags;
    }

    public VkCoverageReductionModeNV getCoverageReductionMode()
    {
        return coverageReductionMode;
    }

    public void setCoverageReductionMode(
            VkCoverageReductionModeNV coverageReductionMode)
    {
        this.coverageReductionMode = coverageReductionMode;
    }
}
