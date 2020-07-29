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

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkBufferCreateFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkBufferUsageFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkExternalMemoryHandleTypeFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkPhysicalDeviceExternalBufferInfo extends VulkanCreateInfoStructure
{
    private EnumSet<VkBufferCreateFlagBits>     flags = EnumSet.noneOf(VkBufferCreateFlagBits.class);
    private EnumSet<VkBufferUsageFlagBits>      usage = EnumSet.noneOf(VkBufferUsageFlagBits.class);
    private VkExternalMemoryHandleTypeFlagBits  handleType;

    public VkPhysicalDeviceExternalBufferInfo()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_BUFFER_INFO);
    }

    public EnumSet<VkBufferCreateFlagBits> getFlags()
    {
        return flags;
    }

    public void setFlags(EnumSet<VkBufferCreateFlagBits> flags)
    {
        this.flags = flags;
    }

    public EnumSet<VkBufferUsageFlagBits> getUsage()
    {
        return usage;
    }

    public void setUsage(EnumSet<VkBufferUsageFlagBits> usage)
    {
        this.usage = usage;
    }

    public VkExternalMemoryHandleTypeFlagBits getHandleType()
    {
        return handleType;
    }

    public void setHandleType(VkExternalMemoryHandleTypeFlagBits handleType)
    {
        this.handleType = handleType;
    }

}
