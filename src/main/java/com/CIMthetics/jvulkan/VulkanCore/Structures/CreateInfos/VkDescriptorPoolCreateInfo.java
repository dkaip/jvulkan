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
package com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos;

import java.util.Collection;
import java.util.EnumSet;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkDescriptorPoolCreateFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkDescriptorPoolSize;

public class VkDescriptorPoolCreateInfo extends VulkanCreateInfoStructure
{
    private EnumSet<VkDescriptorPoolCreateFlagBits> flags = EnumSet.noneOf(VkDescriptorPoolCreateFlagBits.class);
    private int                                     maxSets;
    private Collection<VkDescriptorPoolSize>        poolSizes;

    public VkDescriptorPoolCreateInfo()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_DESCRIPTOR_POOL_CREATE_INFO);
    }

    public EnumSet<VkDescriptorPoolCreateFlagBits> getFlags()
    {
        return flags;
    }

    public void setFlags(EnumSet<VkDescriptorPoolCreateFlagBits> flags)
    {
        this.flags = flags;
    }

    public int getMaxSets()
    {
        return maxSets;
    }

    public void setMaxSets(int maxSets)
    {
        this.maxSets = maxSets;
    }

    public Collection<VkDescriptorPoolSize> getPoolSizes()
    {
        return poolSizes;
    }

    public void setPoolSizes(Collection<VkDescriptorPoolSize> poolSizes)
    {
        this.poolSizes = poolSizes;
    }
    
}
