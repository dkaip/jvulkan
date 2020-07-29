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
package com.CIMthetics.jvulkan.VulkanCore.Structures;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkPhysicalDeviceMaintenance3Properties extends VulkanCreateInfoStructure
{
    private int     maxPerSetDescriptors;
    private long    maxMemoryAllocationSize;

    public VkPhysicalDeviceMaintenance3Properties()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_3_PROPERTIES);
    }

    public int getMaxPerSetDescriptors()
    {
        return maxPerSetDescriptors;
    }

    public void setMaxPerSetDescriptors(int maxPerSetDescriptors)
    {
        this.maxPerSetDescriptors = maxPerSetDescriptors;
    }

    public long getMaxMemoryAllocationSize()
    {
        return maxMemoryAllocationSize;
    }

    public void setMaxMemoryAllocationSize(long maxMemoryAllocationSize)
    {
        this.maxMemoryAllocationSize = maxMemoryAllocationSize;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\nVkPhysicalDeviceMaintenance3Properties\n"));
        sb.append(String.format("    maxPerSetDescriptors:%d\n", maxPerSetDescriptors));
        sb.append(String.format("    maxMemoryAllocationSize:%d\n", maxMemoryAllocationSize));
        
        return sb.toString();
    }
}
