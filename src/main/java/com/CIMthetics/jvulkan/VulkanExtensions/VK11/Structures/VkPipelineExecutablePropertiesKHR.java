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

import java.util.EnumSet;

import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkShaderStageFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkPipelineExecutablePropertiesKHR extends VulkanCreateInfoStructure
{
    private EnumSet<VkShaderStageFlagBits>  stages = EnumSet.noneOf(VkShaderStageFlagBits.class);
    private String                          name;
    private String                          description;
    int                                     subgroupSize;

    public VkPipelineExecutablePropertiesKHR()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_EXECUTABLE_PROPERTIES_KHR);
    }

    public EnumSet<VkShaderStageFlagBits> getStages()
    {
        return stages;
    }

    public void setStages(EnumSet<VkShaderStageFlagBits> stages)
    {
        this.stages = stages;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public int getSubgroupSize()
    {
        return subgroupSize;
    }

    public void setSubgroupSize(int subgroupSize)
    {
        this.subgroupSize = subgroupSize;
    }
}
