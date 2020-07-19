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
package com.CIMthetics.jvulkan.VulkanExtensions.Structures;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkExtent2D;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkPhysicalDeviceShadingRateImagePropertiesNV extends VulkanCreateInfoStructure
{
    private VkExtent2D  shadingRateTexelSize;
    private int         shadingRatePaletteSize;
    private int         shadingRateMaxCoarseSamples;

    public VkPhysicalDeviceShadingRateImagePropertiesNV()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADING_RATE_IMAGE_PROPERTIES_NV);
    }

    public VkExtent2D getShadingRateTexelSize()
    {
        return shadingRateTexelSize;
    }

    public void setShadingRateTexelSize(VkExtent2D shadingRateTexelSize)
    {
        this.shadingRateTexelSize = shadingRateTexelSize;
    }

    public int getShadingRatePaletteSize()
    {
        return shadingRatePaletteSize;
    }

    public void setShadingRatePaletteSize(int shadingRatePaletteSize)
    {
        this.shadingRatePaletteSize = shadingRatePaletteSize;
    }

    public int getShadingRateMaxCoarseSamples()
    {
        return shadingRateMaxCoarseSamples;
    }

    public void setShadingRateMaxCoarseSamples(int shadingRateMaxCoarseSamples)
    {
        this.shadingRateMaxCoarseSamples = shadingRateMaxCoarseSamples;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%nVkPhysicalDeviceShadingRateImagePropertiesNV%n"));
        sb.append(String.format("    shadingRateTexelSize:%s%n", shadingRateTexelSize.toString()));
        sb.append(String.format("    shadingRatePaletteSize:%d%n", shadingRatePaletteSize));
        sb.append(String.format("    shadingRateMaxCoarseSamples:%d%n", shadingRateMaxCoarseSamples));
        
        return sb.toString();
    }
}
