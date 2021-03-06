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

import java.util.EnumSet;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkMemoryAllocateFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkMemoryAllocateFlagsInfo extends VulkanCreateInfoStructure
{
    private EnumSet<VkMemoryAllocateFlagBits>   flags;
    private int                                 deviceMask;

    public VkMemoryAllocateFlagsInfo()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_FLAGS_INFO);
    }

    public EnumSet<VkMemoryAllocateFlagBits> getFlags()
    {
        return flags;
    }

    public void setFlags(EnumSet<VkMemoryAllocateFlagBits> flags)
    {
        this.flags = flags;
    }

    public int getDeviceMask()
    {
        return deviceMask;
    }

    public void setDeviceMask(int deviceMask)
    {
        this.deviceMask = deviceMask;
    }

}
