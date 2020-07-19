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
package com.CIMthetics.jvulkan.VulkanCore.Structures;

import java.util.Collection;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Handles.VkPhysicalDevice;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkPhysicalDeviceGroupProperties extends VulkanCreateInfoStructure
{
    private Collection<VkPhysicalDevice>    physicalDevices;
    private boolean                         subsetAllocation;

    public VkPhysicalDeviceGroupProperties()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GROUP_PROPERTIES);
    }

    public Collection<VkPhysicalDevice> getPhysicalDevices()
    {
        return physicalDevices;
    }

    public void setPhysicalDevices(Collection<VkPhysicalDevice> physicalDevices)
    {
        this.physicalDevices = physicalDevices;
    }

    public boolean isSubsetAllocation()
    {
        return subsetAllocation;
    }

    public void setSubsetAllocation(boolean subsetAllocation)
    {
        this.subsetAllocation = subsetAllocation;
    }

}
