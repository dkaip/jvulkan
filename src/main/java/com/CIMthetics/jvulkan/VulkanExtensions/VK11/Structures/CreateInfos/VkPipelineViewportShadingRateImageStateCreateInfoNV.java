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
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkShadingRatePaletteNV;

public class VkPipelineViewportShadingRateImageStateCreateInfoNV extends VulkanCreateInfoStructure
{
    private boolean                             shadingRateImageEnable;
    private Collection<VkShadingRatePaletteNV>  shadingRatePalettes;

    public VkPipelineViewportShadingRateImageStateCreateInfoNV()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_SHADING_RATE_IMAGE_STATE_CREATE_INFO_NV);
    }

    public boolean isShadingRateImageEnable()
    {
        return shadingRateImageEnable;
    }

    public void setShadingRateImageEnable(boolean shadingRateImageEnable)
    {
        this.shadingRateImageEnable = shadingRateImageEnable;
    }

    public Collection<VkShadingRatePaletteNV> getShadingRatePalettes()
    {
        return shadingRatePalettes;
    }

    public void setShadingRatePalettes(
            Collection<VkShadingRatePaletteNV> shadingRatePalettes)
    {
        this.shadingRatePalettes = shadingRatePalettes;
    }
}
