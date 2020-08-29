/*
 * Copyright 2020 Douglas Kaip
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

public class VkPhysicalDeviceFragmentDensityMap2PropertiesEXT extends VulkanCreateInfoStructure
{
    private boolean subsampledLoads;
    private boolean subsampledCoarseReconstructionEarlyAccess;
    private int     maxSubsampledArrayLayers;
    private int     maxDescriptorSetSubsampledSamplers;

    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_2_PROPERTIES_EXT);
    }

    public boolean isSubsampledLoads()
    {
        return subsampledLoads;
    }

    public void setSubsampledLoads(boolean subsampledLoads)
    {
        this.subsampledLoads = subsampledLoads;
    }

    public boolean isSubsampledCoarseReconstructionEarlyAccess()
    {
        return subsampledCoarseReconstructionEarlyAccess;
    }

    public void setSubsampledCoarseReconstructionEarlyAccess(boolean subsampledCoarseReconstructionEarlyAccess)
    {
        this.subsampledCoarseReconstructionEarlyAccess = subsampledCoarseReconstructionEarlyAccess;
    }

    public int getMaxSubsampledArrayLayers()
    {
        return maxSubsampledArrayLayers;
    }

    public void setMaxSubsampledArrayLayers(int maxSubsampledArrayLayers)
    {
        this.maxSubsampledArrayLayers = maxSubsampledArrayLayers;
    }

    public int getMaxDescriptorSetSubsampledSamplers()
    {
        return maxDescriptorSetSubsampledSamplers;
    }

    public void setMaxDescriptorSetSubsampledSamplers(int maxDescriptorSetSubsampledSamplers)
    {
        this.maxDescriptorSetSubsampledSamplers = maxDescriptorSetSubsampledSamplers;
    }
}
