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
package com.CIMthetics.jvulkan.VulkanCore.VK11.Structures;

import java.util.EnumSet;

import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkDeviceQueueCreateFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkDeviceQueueInfo2 extends VulkanCreateInfoStructure
{
    private EnumSet<VkDeviceQueueCreateFlagBits>    flags;
    private int                                     queueFamilyIndex;
    private int                                     queueIndex;

    public VkDeviceQueueInfo2()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_DEVICE_QUEUE_INFO_2);
    }

    public EnumSet<VkDeviceQueueCreateFlagBits> getFlags()
    {
        return flags;
    }

    public void setFlags(EnumSet<VkDeviceQueueCreateFlagBits> flags)
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

    public int getQueueIndex()
    {
        return queueIndex;
    }

    public void setQueueIndex(int queueIndex)
    {
        this.queueIndex = queueIndex;
    }

}
