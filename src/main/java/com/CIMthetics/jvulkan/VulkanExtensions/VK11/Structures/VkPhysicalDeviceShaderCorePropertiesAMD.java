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
package com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures;

import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkPhysicalDeviceShaderCorePropertiesAMD extends VulkanCreateInfoStructure
{
    private int shaderEngineCount;
    private int shaderArraysPerEngineCount;
    private int computeUnitsPerShaderArray;
    private int simdPerComputeUnit;
    private int wavefrontsPerSimd;
    private int wavefrontSize;
    private int sgprsPerSimd;
    private int minSgprAllocation;
    private int maxSgprAllocation;
    private int sgprAllocationGranularity;
    private int vgprsPerSimd;
    private int minVgprAllocation;
    private int maxVgprAllocation;
    private int vgprAllocationGranularity;

    public VkPhysicalDeviceShaderCorePropertiesAMD()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_PROPERTIES_AMD);
    }

    public int getShaderEngineCount()
    {
        return shaderEngineCount;
    }

    public void setShaderEngineCount(int shaderEngineCount)
    {
        this.shaderEngineCount = shaderEngineCount;
    }

    public int getShaderArraysPerEngineCount()
    {
        return shaderArraysPerEngineCount;
    }

    public void setShaderArraysPerEngineCount(int shaderArraysPerEngineCount)
    {
        this.shaderArraysPerEngineCount = shaderArraysPerEngineCount;
    }

    public int getComputeUnitsPerShaderArray()
    {
        return computeUnitsPerShaderArray;
    }

    public void setComputeUnitsPerShaderArray(int computeUnitsPerShaderArray)
    {
        this.computeUnitsPerShaderArray = computeUnitsPerShaderArray;
    }

    public int getSimdPerComputeUnit()
    {
        return simdPerComputeUnit;
    }

    public void setSimdPerComputeUnit(int simdPerComputeUnit)
    {
        this.simdPerComputeUnit = simdPerComputeUnit;
    }

    public int getWavefrontsPerSimd()
    {
        return wavefrontsPerSimd;
    }

    public void setWavefrontsPerSimd(int wavefrontsPerSimd)
    {
        this.wavefrontsPerSimd = wavefrontsPerSimd;
    }

    public int getWavefrontSize()
    {
        return wavefrontSize;
    }

    public void setWavefrontSize(int wavefrontSize)
    {
        this.wavefrontSize = wavefrontSize;
    }

    public int getSgprsPerSimd()
    {
        return sgprsPerSimd;
    }

    public void setSgprsPerSimd(int sgprsPerSimd)
    {
        this.sgprsPerSimd = sgprsPerSimd;
    }

    public int getMinSgprAllocation()
    {
        return minSgprAllocation;
    }

    public void setMinSgprAllocation(int minSgprAllocation)
    {
        this.minSgprAllocation = minSgprAllocation;
    }

    public int getMaxSgprAllocation()
    {
        return maxSgprAllocation;
    }

    public void setMaxSgprAllocation(int maxSgprAllocation)
    {
        this.maxSgprAllocation = maxSgprAllocation;
    }

    public int getSgprAllocationGranularity()
    {
        return sgprAllocationGranularity;
    }

    public void setSgprAllocationGranularity(int sgprAllocationGranularity)
    {
        this.sgprAllocationGranularity = sgprAllocationGranularity;
    }

    public int getVgprsPerSimd()
    {
        return vgprsPerSimd;
    }

    public void setVgprsPerSimd(int vgprsPerSimd)
    {
        this.vgprsPerSimd = vgprsPerSimd;
    }

    public int getMinVgprAllocation()
    {
        return minVgprAllocation;
    }

    public void setMinVgprAllocation(int minVgprAllocation)
    {
        this.minVgprAllocation = minVgprAllocation;
    }

    public int getMaxVgprAllocation()
    {
        return maxVgprAllocation;
    }

    public void setMaxVgprAllocation(int maxVgprAllocation)
    {
        this.maxVgprAllocation = maxVgprAllocation;
    }

    public int getVgprAllocationGranularity()
    {
        return vgprAllocationGranularity;
    }

    public void setVgprAllocationGranularity(int vgprAllocationGranularity)
    {
        this.vgprAllocationGranularity = vgprAllocationGranularity;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\nVkPhysicalDeviceShaderCorePropertiesAMD\n"));
        sb.append(String.format("    shaderEngineCount:%d\n", shaderEngineCount));
        sb.append(String.format("    shaderArraysPerEngineCount:%d\n", shaderArraysPerEngineCount));
        sb.append(String.format("    computeUnitsPerShaderArray:%d\n", computeUnitsPerShaderArray));
        sb.append(String.format("    simdPerComputeUnit:%d\n", simdPerComputeUnit));
        sb.append(String.format("    wavefrontsPerSimd:%d\n", wavefrontsPerSimd));
        sb.append(String.format("    wavefrontSize:%d\n", wavefrontSize));
        sb.append(String.format("    sgprsPerSimd:%d\n", sgprsPerSimd));
        sb.append(String.format("    minSgprAllocation:%d\n", minSgprAllocation));
        sb.append(String.format("    maxSgprAllocation:%d\n", maxSgprAllocation));
        sb.append(String.format("    sgprAllocationGranularity:%d\n", sgprAllocationGranularity));
        sb.append(String.format("    vgprsPerSimd:%d\n", vgprsPerSimd));
        sb.append(String.format("    minVgprAllocation:%d\n", minVgprAllocation));
        sb.append(String.format("    maxVgprAllocation:%d\n", maxVgprAllocation));
        sb.append(String.format("    vgprAllocationGranularity:%d\n", vgprAllocationGranularity));
        
        return sb.toString();
    }
}
