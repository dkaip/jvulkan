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

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkExtent2D;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkPhysicalDeviceFragmentDensityMapPropertiesEXT extends VulkanCreateInfoStructure
{
    private VkExtent2D  minFragmentDensityTexelSize;
    private VkExtent2D  maxFragmentDensityTexelSize;
    private boolean     fragmentDensityInvocations;

    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_PROPERTIES_EXT);
    }

    public VkExtent2D getMinFragmentDensityTexelSize()
    {
        return minFragmentDensityTexelSize;
    }

    public void setMinFragmentDensityTexelSize(
            VkExtent2D minFragmentDensityTexelSize)
    {
        this.minFragmentDensityTexelSize = minFragmentDensityTexelSize;
    }

    public VkExtent2D getMaxFragmentDensityTexelSize()
    {
        return maxFragmentDensityTexelSize;
    }

    public void setMaxFragmentDensityTexelSize(
            VkExtent2D maxFragmentDensityTexelSize)
    {
        this.maxFragmentDensityTexelSize = maxFragmentDensityTexelSize;
    }

    public boolean isFragmentDensityInvocations()
    {
        return fragmentDensityInvocations;
    }

    public void setFragmentDensityInvocations(boolean fragmentDensityInvocations)
    {
        this.fragmentDensityInvocations = fragmentDensityInvocations;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\nVkPhysicalDeviceFragmentDensityMapPropertiesEXT\n"));
        sb.append(String.format("    minFragmentDensityTexelSize:%s\n", minFragmentDensityTexelSize.toString()));
        sb.append(String.format("    maxFragmentDensityTexelSize:%s\n", maxFragmentDensityTexelSize.toString()));
        sb.append(String.format("    fragmentDensityInvocations:%b\n", fragmentDensityInvocations));
        
        return sb.toString();
    }
}
