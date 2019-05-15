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

public class VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT extends VulkanCreateInfoStructure
{
    private boolean filterMinmaxSingleComponentFormats;
    private boolean filterMinmaxImageComponentMapping;

    public VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLER_FILTER_MINMAX_PROPERTIES_EXT);
    }

    public boolean isFilterMinmaxSingleComponentFormats()
    {
        return filterMinmaxSingleComponentFormats;
    }

    public void setFilterMinmaxSingleComponentFormats(
            boolean filterMinmaxSingleComponentFormats)
    {
        this.filterMinmaxSingleComponentFormats = filterMinmaxSingleComponentFormats;
    }

    public boolean isFilterMinmaxImageComponentMapping()
    {
        return filterMinmaxImageComponentMapping;
    }

    public void setFilterMinmaxImageComponentMapping(
            boolean filterMinmaxImageComponentMapping)
    {
        this.filterMinmaxImageComponentMapping = filterMinmaxImageComponentMapping;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%nVkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT%n"));
        sb.append(String.format("    filterMinmaxSingleComponentFormats:%b%n", filterMinmaxSingleComponentFormats));
        sb.append(String.format("    filterMinmaxImageComponentMapping:%b%n", filterMinmaxImageComponentMapping));
        
        return sb.toString();
    }
}
