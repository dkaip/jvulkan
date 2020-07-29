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

import java.util.EnumSet;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VulkanCreateInfoStructure;
import com.CIMthetics.jvulkan.VulkanExtensions.Enums.VkPerformanceCounterDescriptionFlagBitsKHR;

public class VkPerformanceCounterDescriptionKHR extends VulkanCreateInfoStructure
{
    private EnumSet<VkPerformanceCounterDescriptionFlagBitsKHR> flags = EnumSet.noneOf(VkPerformanceCounterDescriptionFlagBitsKHR.class);
    private String                                              name;
    private String                                              category;
    private String                                              description;

    public VkPerformanceCounterDescriptionKHR()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PERFORMANCE_COUNTER_DESCRIPTION_KHR);
    }

    public EnumSet<VkPerformanceCounterDescriptionFlagBitsKHR> getFlags()
    {
        return flags;
    }

    public void setFlags(EnumSet<VkPerformanceCounterDescriptionFlagBitsKHR> flags)
    {
        this.flags = flags;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getCategory()
    {
        return category;
    }

    public void setCategory(String category)
    {
        this.category = category;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }
}
