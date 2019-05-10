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
package com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos;

import java.util.EnumSet;

import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkCommandPoolCreateFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkStructureType;

public class VkCommandPoolCreateInfo extends VulkanCreateInfoStructure
{
    private EnumSet<VkCommandPoolCreateFlagBits>    flags = EnumSet.noneOf(VkCommandPoolCreateFlagBits.class);
    private int                                     queueFamilyIndex;

    public VkCommandPoolCreateInfo()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_COMMAND_POOL_CREATE_INFO);
    }

    public EnumSet<VkCommandPoolCreateFlagBits> getFlags()
    {
        return flags;
    }

    public void setFlags(EnumSet<VkCommandPoolCreateFlagBits> flags)
    {
        this.flags = flags;
    }

    public int getQueueFamilyIndex()
    {
        return queueFamilyIndex;
    }

    public void setQueueFamilyIndex(int queueFamilyIndex)
    {
        this.queueFamilyIndex = queueFamilyIndex;
    }
    
}
