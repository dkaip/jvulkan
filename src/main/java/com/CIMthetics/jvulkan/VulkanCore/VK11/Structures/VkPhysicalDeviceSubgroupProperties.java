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
package com.CIMthetics.jvulkan.VulkanCore.VK11.Structures;

import java.util.EnumSet;

import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkShaderStageFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkSubgroupFeatureFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkPhysicalDeviceSubgroupProperties extends VulkanCreateInfoStructure
{
    private int                                 subgroupSize;
    private EnumSet<VkShaderStageFlagBits>      supportedStages;
    private EnumSet<VkSubgroupFeatureFlagBits>  supportedOperations;
    private boolean                             quadOperationsInAllStages;

    public VkPhysicalDeviceSubgroupProperties()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_PROPERTIES);
    }

    public int getSubgroupSize()
    {
        return subgroupSize;
    }

    void setSubgroupSize(int subgroupSize)
    {
        this.subgroupSize = subgroupSize;
    }

    public EnumSet<VkShaderStageFlagBits> getSupportedStages()
    {
        return supportedStages;
    }

    void setSupportedStages(EnumSet<VkShaderStageFlagBits> supportedStages)
    {
        this.supportedStages = supportedStages;
    }

    public EnumSet<VkSubgroupFeatureFlagBits> getSupportedOperations()
    {
        return supportedOperations;
    }

    void setSupportedOperations(EnumSet<VkSubgroupFeatureFlagBits> supportedOperations)
    {
        this.supportedOperations = supportedOperations;
    }

    public boolean isQuadOperationsInAllStages()
    {
        return quadOperationsInAllStages;
    }

    void setQuadOperationsInAllStages(boolean quadOperationsInAllStages)
    {
        this.quadOperationsInAllStages = quadOperationsInAllStages;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%nVkPhysicalDeviceSubgroupProperties%n"));
        sb.append(String.format("    subgroupSize:%d%n", subgroupSize));
        sb.append(String.format("    supportedStages:%s%n", supportedStages != null ? supportedStages.toString() : "null"));
        sb.append(String.format("    supportedOperations:%s%n", supportedOperations != null ? supportedOperations.toString() : "null"));
        sb.append(String.format("    quadOperationsInAllStages:%b%n", quadOperationsInAllStages));
        
        return sb.toString();
    }
}
