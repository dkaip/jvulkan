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
package com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkChromaLocation;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkFilter;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkFormat;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkSamplerYcbcrModelConversion;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkSamplerYcbcrRange;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkComponentMapping;

public class VkSamplerYcbcrConversionCreateInfo extends VulkanCreateInfoStructure
{
    private VkFormat                        format;
    private VkSamplerYcbcrModelConversion   ycbcrModel;
    private VkSamplerYcbcrRange             ycbcrRange;
    private VkComponentMapping              components;
    private VkChromaLocation                xChromaOffset;
    private VkChromaLocation                yChromaOffset;
    private VkFilter                        chromaFilter;
    private boolean                         forceExplicitReconstruction;

    public VkSamplerYcbcrConversionCreateInfo()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_CREATE_INFO);
    }

    public VkFormat getFormat()
    {
        return format;
    }

    public void setFormat(VkFormat format)
    {
        this.format = format;
    }

    public VkSamplerYcbcrModelConversion getYcbcrModel()
    {
        return ycbcrModel;
    }

    public void setYcbcrModel(VkSamplerYcbcrModelConversion ycbcrModel)
    {
        this.ycbcrModel = ycbcrModel;
    }

    public VkSamplerYcbcrRange getYcbcrRange()
    {
        return ycbcrRange;
    }

    public void setYcbcrRange(VkSamplerYcbcrRange ycbcrRange)
    {
        this.ycbcrRange = ycbcrRange;
    }

    public VkComponentMapping getComponents()
    {
        return components;
    }

    public void setComponents(VkComponentMapping components)
    {
        this.components = components;
    }

    public VkChromaLocation getxChromaOffset()
    {
        return xChromaOffset;
    }

    public void setxChromaOffset(VkChromaLocation xChromaOffset)
    {
        this.xChromaOffset = xChromaOffset;
    }

    public VkChromaLocation getyChromaOffset()
    {
        return yChromaOffset;
    }

    public void setyChromaOffset(VkChromaLocation yChromaOffset)
    {
        this.yChromaOffset = yChromaOffset;
    }

    public VkFilter getChromaFilter()
    {
        return chromaFilter;
    }

    public void setChromaFilter(VkFilter chromaFilter)
    {
        this.chromaFilter = chromaFilter;
    }

    public boolean isForceExplicitReconstruction()
    {
        return forceExplicitReconstruction;
    }

    public void setForceExplicitReconstruction(boolean forceExplicitReconstruction)
    {
        this.forceExplicitReconstruction = forceExplicitReconstruction;
    }

}
