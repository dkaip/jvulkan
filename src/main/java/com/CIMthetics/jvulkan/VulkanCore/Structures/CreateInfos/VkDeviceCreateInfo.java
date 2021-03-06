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
import java.util.LinkedList;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkDeviceCreateFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkPhysicalDeviceFeatures;

public class VkDeviceCreateInfo extends VulkanCreateInfoStructure
{
    private EnumSet<VkDeviceCreateFlagBits>         flags = EnumSet.noneOf(VkDeviceCreateFlagBits.class);
    private Collection<VkDeviceQueueCreateInfo>     queueCreateInfos;
    private Collection<String>                      enabledLayerNames;
    private Collection<String>                      enabledExtensionNames;
    private VkPhysicalDeviceFeatures                enabledFeatures;

    public VkDeviceCreateInfo()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_DEVICE_CREATE_INFO);
    }
    
    public EnumSet<VkDeviceCreateFlagBits> getFlags()
    {
        return flags;
    }

    public void setFlags(EnumSet<VkDeviceCreateFlagBits> flags)
    {
        this.flags = flags;
    }

    public Collection<VkDeviceQueueCreateInfo> getQueueCreateInfos()
    {
        return queueCreateInfos;
    }

    public void setQueueCreateInfos(
            Collection<VkDeviceQueueCreateInfo> queueCreateInfos)
    {
        this.queueCreateInfos = queueCreateInfos;
    }

    /**
     * A convienience method in the case where there is only one
     * VkDeviceQueueCreateInfo.
     * 
     * @param queueCreateInfo
     */
    public void setQueueCreateInfos(
            VkDeviceQueueCreateInfo queueCreateInfo)
    {
        this.queueCreateInfos = new LinkedList<VkDeviceQueueCreateInfo>();
        this.queueCreateInfos.add(queueCreateInfo);
    }

    public Collection<String> getEnabledLayerNames()
    {
        return enabledLayerNames;
    }

    public void setEnabledLayerNames(Collection<String> enabledLayerNames)
    {
        this.enabledLayerNames = enabledLayerNames;
    }

    public Collection<String> getEnabledExtensionNames()
    {
        return enabledExtensionNames;
    }

    public void setEnabledExtensionNames(Collection<String> enabledExtensionNames)
    {
        this.enabledExtensionNames = enabledExtensionNames;
    }

    public VkPhysicalDeviceFeatures getEnabledFeatures()
    {
        return enabledFeatures;
    }

    public void setEnabledFeatures(VkPhysicalDeviceFeatures enabledFeatures)
    {
        this.enabledFeatures = enabledFeatures;
    }
    
}
