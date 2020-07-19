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
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkPhysicalDeviceConservativeRasterizationPropertiesEXT extends VulkanCreateInfoStructure
{
    private float   primitiveOverestimationSize;
    private float   maxExtraPrimitiveOverestimationSize;
    private float   extraPrimitiveOverestimationSizeGranularity;
    private boolean primitiveUnderestimation;
    private boolean conservativePointAndLineRasterization;
    private boolean degenerateTrianglesRasterized;
    private boolean degenerateLinesRasterized;
    private boolean fullyCoveredFragmentShaderInputVariable;
    private boolean conservativeRasterizationPostDepthCoverage;

    public VkPhysicalDeviceConservativeRasterizationPropertiesEXT()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CONSERVATIVE_RASTERIZATION_PROPERTIES_EXT);
    }

    public float getPrimitiveOverestimationSize()
    {
        return primitiveOverestimationSize;
    }

    void setPrimitiveOverestimationSize(float primitiveOverestimationSize)
    {
        this.primitiveOverestimationSize = primitiveOverestimationSize;
    }

    public float getMaxExtraPrimitiveOverestimationSize()
    {
        return maxExtraPrimitiveOverestimationSize;
    }

    void setMaxExtraPrimitiveOverestimationSize(float maxExtraPrimitiveOverestimationSize)
    {
        this.maxExtraPrimitiveOverestimationSize = maxExtraPrimitiveOverestimationSize;
    }

    public float getExtraPrimitiveOverestimationSizeGranularity()
    {
        return extraPrimitiveOverestimationSizeGranularity;
    }

    void setExtraPrimitiveOverestimationSizeGranularity(float extraPrimitiveOverestimationSizeGranularity)
    {
        this.extraPrimitiveOverestimationSizeGranularity = extraPrimitiveOverestimationSizeGranularity;
    }

    public boolean isPrimitiveUnderestimation()
    {
        return primitiveUnderestimation;
    }

    void setPrimitiveUnderestimation(boolean primitiveUnderestimation)
    {
        this.primitiveUnderestimation = primitiveUnderestimation;
    }

    public boolean isConservativePointAndLineRasterization()
    {
        return conservativePointAndLineRasterization;
    }

    void setConservativePointAndLineRasterization(boolean conservativePointAndLineRasterization)
    {
        this.conservativePointAndLineRasterization = conservativePointAndLineRasterization;
    }

    public boolean isDegenerateTrianglesRasterized()
    {
        return degenerateTrianglesRasterized;
    }

    void setDegenerateTrianglesRasterized(boolean degenerateTrianglesRasterized)
    {
        this.degenerateTrianglesRasterized = degenerateTrianglesRasterized;
    }

    public boolean isDegenerateLinesRasterized()
    {
        return degenerateLinesRasterized;
    }

    void setDegenerateLinesRasterized(boolean degenerateLinesRasterized)
    {
        this.degenerateLinesRasterized = degenerateLinesRasterized;
    }

    public boolean isFullyCoveredFragmentShaderInputVariable()
    {
        return fullyCoveredFragmentShaderInputVariable;
    }

    void setFullyCoveredFragmentShaderInputVariable(boolean fullyCoveredFragmentShaderInputVariable)
    {
        this.fullyCoveredFragmentShaderInputVariable = fullyCoveredFragmentShaderInputVariable;
    }

    public boolean isConservativeRasterizationPostDepthCoverage()
    {
        return conservativeRasterizationPostDepthCoverage;
    }

    void setConservativeRasterizationPostDepthCoverage(boolean conservativeRasterizationPostDepthCoverage)
    {
        this.conservativeRasterizationPostDepthCoverage = conservativeRasterizationPostDepthCoverage;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\nVkPhysicalDeviceConservativeRasterizationPropertiesEXT\n"));
        sb.append(String.format("    primitiveOverestimationSize:%f\n", primitiveOverestimationSize));
        sb.append(String.format("    maxExtraPrimitiveOverestimationSize:%f\n", maxExtraPrimitiveOverestimationSize));
        sb.append(String.format("    extraPrimitiveOverestimationSizeGranularity:%f\n", extraPrimitiveOverestimationSizeGranularity));
        sb.append(String.format("    primitiveUnderestimation:%b\n", primitiveUnderestimation));
        sb.append(String.format("    conservativePointAndLineRasterization:%b\n", conservativePointAndLineRasterization));
        sb.append(String.format("    degenerateTrianglesRasterized:%b\n", degenerateTrianglesRasterized));
        sb.append(String.format("    degenerateLinesRasterized:%b\n", degenerateLinesRasterized));
        sb.append(String.format("    fullyCoveredFragmentShaderInputVariable:%b", fullyCoveredFragmentShaderInputVariable));
        sb.append(String.format("    conservativeRasterizationPostDepthCoverage:%b", conservativeRasterizationPostDepthCoverage));
        
        return sb.toString();
    }
}
