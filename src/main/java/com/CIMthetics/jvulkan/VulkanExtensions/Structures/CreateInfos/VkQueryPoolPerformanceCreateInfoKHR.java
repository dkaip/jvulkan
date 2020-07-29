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
package com.CIMthetics.jvulkan.VulkanExtensions.Structures.CreateInfos;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkQueryPoolPerformanceCreateInfoKHR extends VulkanCreateInfoStructure
{
    private int     queueFamilyIndex;
    private int     counterIndexCount;
    private int[]   counterIndices;

    public VkQueryPoolPerformanceCreateInfoKHR()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_QUERY_POOL_PERFORMANCE_CREATE_INFO_KHR);
    }

    public int getQueueFamilyIndex()
    {
        return queueFamilyIndex;
    }

    public void setQueueFamilyIndex(int queueFamilyIndex)
    {
        this.queueFamilyIndex = queueFamilyIndex;
    }

    public int getCounterIndexCount()
    {
        return counterIndexCount;
    }

    public void setCounterIndexCount(int counterIndexCount)
    {
        this.counterIndexCount = counterIndexCount;
    }

    public int[] getCounterIndices()
    {
        return counterIndices;
    }

    public void setCounterIndices(int[] counterIndices)
    {
        this.counterIndices = counterIndices;
    }
}
