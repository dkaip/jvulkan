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

import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkCommandBufferUsageFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkStructureType;

public class VkCommandBufferBeginInfo extends VulkanCreateInfoStructure
{
    private EnumSet<VkCommandBufferUsageFlagBits>   flags = EnumSet.noneOf(VkCommandBufferUsageFlagBits.class);
    private VkCommandBufferInheritanceInfo          inheritanceInfo;
    
    public VkCommandBufferBeginInfo()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_COMMAND_BUFFER_BEGIN_INFO);
    }

    public EnumSet<VkCommandBufferUsageFlagBits> getFlags()
    {
        return flags;
    }

    public void setFlags(EnumSet<VkCommandBufferUsageFlagBits> flags)
    {
        this.flags = flags;
    }

    public VkCommandBufferInheritanceInfo getInheritanceInfo()
    {
        return inheritanceInfo;
    }

    public void setInheritanceInfo(VkCommandBufferInheritanceInfo inheritanceInfo)
    {
        this.inheritanceInfo = inheritanceInfo;
    }
    
}
