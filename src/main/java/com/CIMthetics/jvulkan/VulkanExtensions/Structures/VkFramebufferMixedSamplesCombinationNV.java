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
package com.CIMthetics.jvulkan.VulkanExtensions.Structures;

import java.util.EnumSet;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkSampleCountFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VulkanCreateInfoStructure;
import com.CIMthetics.jvulkan.VulkanExtensions.Enums.VkCoverageReductionModeNV;

public class VkFramebufferMixedSamplesCombinationNV extends VulkanCreateInfoStructure
{
    private VkCoverageReductionModeNV       coverageReductionMode;
    private VkSampleCountFlagBits           rasterizationSamples;
    private EnumSet<VkSampleCountFlagBits>  depthStencilSamples = EnumSet.noneOf(VkSampleCountFlagBits.class);
    private EnumSet<VkSampleCountFlagBits>  colorSamples = EnumSet.noneOf(VkSampleCountFlagBits.class);

    public VkFramebufferMixedSamplesCombinationNV()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_FRAMEBUFFER_MIXED_SAMPLES_COMBINATION_NV);
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

    public VkSampleCountFlagBits getRasterizationSamples()
    {
        return rasterizationSamples;
    }

    public void setRasterizationSamples(VkSampleCountFlagBits rasterizationSamples)
    {
        this.rasterizationSamples = rasterizationSamples;
    }

    public EnumSet<VkSampleCountFlagBits> getDepthStencilSamples()
    {
        return depthStencilSamples;
    }

    public void setDepthStencilSamples(
            EnumSet<VkSampleCountFlagBits> depthStencilSamples)
    {
        this.depthStencilSamples = depthStencilSamples;
    }

    public EnumSet<VkSampleCountFlagBits> getColorSamples()
    {
        return colorSamples;
    }

    public void setColorSamples(EnumSet<VkSampleCountFlagBits> colorSamples)
    {
        this.colorSamples = colorSamples;
    }
}
