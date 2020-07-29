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

import java.util.Collection;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkBindImageMemoryDeviceGroupInfo extends VulkanCreateInfoStructure
{
    private int[]                   deviceIndices;
    private Collection<VkRect2D>    splitInstanceBindRegions;

    public VkBindImageMemoryDeviceGroupInfo()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_DEVICE_GROUP_INFO);
    }

    public int[] getDeviceIndices()
    {
        return deviceIndices;
    }

    public void setDeviceIndices(int[] deviceIndices)
    {
        this.deviceIndices = deviceIndices;
    }

    public Collection<VkRect2D> getSplitInstanceBindRegions()
    {
        return splitInstanceBindRegions;
    }

    public void setSplitInstanceBindRegions(
            Collection<VkRect2D> splitInstanceBindRegions)
    {
        this.splitInstanceBindRegions = splitInstanceBindRegions;
    }

}
