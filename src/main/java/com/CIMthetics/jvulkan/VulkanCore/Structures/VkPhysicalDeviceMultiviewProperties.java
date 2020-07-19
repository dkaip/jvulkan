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

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkPhysicalDeviceMultiviewProperties extends VulkanCreateInfoStructure
{
    private int maxMultiviewViewCount;
    private int maxMultiviewInstanceIndex;

    public VkPhysicalDeviceMultiviewProperties()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PROPERTIES);
    }

    public int getMaxMultiviewViewCount()
    {
        return maxMultiviewViewCount;
    }

    void setMaxMultiviewViewCount(int maxMultiviewViewCount)
    {
        this.maxMultiviewViewCount = maxMultiviewViewCount;
    }

    public int getMaxMultiviewInstanceIndex()
    {
        return maxMultiviewInstanceIndex;
    }

    void setMaxMultiviewInstanceIndex(int maxMultiviewInstanceIndex)
    {
        this.maxMultiviewInstanceIndex = maxMultiviewInstanceIndex;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\nVkPhysicalDeviceMultiviewProperties\n"));
        sb.append(String.format("    maxMultiviewViewCount:%d\n", maxMultiviewViewCount));
        sb.append(String.format("    maxMultiviewInstanceIndex:%d\n", maxMultiviewInstanceIndex));
        
        return sb.toString();
    }
}
