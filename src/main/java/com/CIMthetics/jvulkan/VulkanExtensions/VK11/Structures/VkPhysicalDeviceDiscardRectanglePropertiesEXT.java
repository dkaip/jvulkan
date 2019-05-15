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

public class VkPhysicalDeviceDiscardRectanglePropertiesEXT extends VulkanCreateInfoStructure
{
    private int maxDiscardRectangles;

    public VkPhysicalDeviceDiscardRectanglePropertiesEXT()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DISCARD_RECTANGLE_PROPERTIES_EXT);
    }

    public int getMaxDiscardRectangles()
    {
        return maxDiscardRectangles;
    }

    void setMaxDiscardRectangles(int maxDiscardRectangles)
    {
        this.maxDiscardRectangles = maxDiscardRectangles;
    }

    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\nVkPhysicalDeviceDiscardRectanglePropertiesEXT\n"));
        sb.append(String.format("    maxDiscardRectangles:%d\n", maxDiscardRectangles));
        
        return sb.toString();
    }
}
