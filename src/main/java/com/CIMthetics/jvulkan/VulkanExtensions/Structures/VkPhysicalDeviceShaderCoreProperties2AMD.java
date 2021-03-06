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

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VulkanCreateInfoStructure;
import com.CIMthetics.jvulkan.VulkanExtensions.Enums.VkShaderCorePropertiesFlagBitsAMD;

public class VkPhysicalDeviceShaderCoreProperties2AMD extends VulkanCreateInfoStructure
{
    private EnumSet<VkShaderCorePropertiesFlagBitsAMD>  shaderCoreFeatures = EnumSet.noneOf(VkShaderCorePropertiesFlagBitsAMD.class);
    private int                                         activeComputeUnitCount;
    
    public VkPhysicalDeviceShaderCoreProperties2AMD()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CORE_PROPERTIES_2_AMD);
    }

    public EnumSet<VkShaderCorePropertiesFlagBitsAMD> getShaderCoreFeatures()
    {
        return shaderCoreFeatures;
    }

    public void setShaderCoreFeatures(
            EnumSet<VkShaderCorePropertiesFlagBitsAMD> shaderCoreFeatures)
    {
        this.shaderCoreFeatures = shaderCoreFeatures;
    }

    public int getActiveComputeUnitCount()
    {
        return activeComputeUnitCount;
    }

    public void setActiveComputeUnitCount(int activeComputeUnitCount)
    {
        this.activeComputeUnitCount = activeComputeUnitCount;
    }
}
