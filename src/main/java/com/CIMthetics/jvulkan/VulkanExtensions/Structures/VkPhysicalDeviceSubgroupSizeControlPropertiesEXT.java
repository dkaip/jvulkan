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

import java.util.EnumSet;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkShaderStageFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkPhysicalDeviceSubgroupSizeControlPropertiesEXT extends VulkanCreateInfoStructure
{
    private int minSubgroupSize;
    private int maxSubgroupSize;
    private int maxComputeWorkgroupSubgroups;
    private EnumSet<VkShaderStageFlagBits>  requiredSubgroupSizeStages = EnumSet.noneOf(VkShaderStageFlagBits.class);
    
    public VkPhysicalDeviceSubgroupSizeControlPropertiesEXT()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_PROPERTIES_EXT);
    }

    public int getMinSubgroupSize()
    {
        return minSubgroupSize;
    }

    public void setMinSubgroupSize(int minSubgroupSize)
    {
        this.minSubgroupSize = minSubgroupSize;
    }

    public int getMaxSubgroupSize()
    {
        return maxSubgroupSize;
    }

    public void setMaxSubgroupSize(int maxSubgroupSize)
    {
        this.maxSubgroupSize = maxSubgroupSize;
    }

    public int getMaxComputeWorkgroupSubgroups()
    {
        return maxComputeWorkgroupSubgroups;
    }

    public void setMaxComputeWorkgroupSubgroups(int maxComputeWorkgroupSubgroups)
    {
        this.maxComputeWorkgroupSubgroups = maxComputeWorkgroupSubgroups;
    }

    public EnumSet<VkShaderStageFlagBits> getRequiredSubgroupSizeStages()
    {
        return requiredSubgroupSizeStages;
    }

    public void setRequiredSubgroupSizeStages(
            EnumSet<VkShaderStageFlagBits> requiredSubgroupSizeStages)
    {
        this.requiredSubgroupSizeStages = requiredSubgroupSizeStages;
    }
}
