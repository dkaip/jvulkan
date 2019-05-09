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
package com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.CreateInfos;

import java.util.EnumSet;

import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Enums.VkDisplayModeCreateFlagBitsKHR;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkDisplayModeParametersKHR;

public class VkDisplayModeCreateInfoKHR extends VulkanCreateInfoStructure
{
    private long                                    pNext;
    private EnumSet<VkDisplayModeCreateFlagBitsKHR> flags = EnumSet.noneOf(VkDisplayModeCreateFlagBitsKHR.class);
    private VkDisplayModeParametersKHR              parameters;
    
    public VkDisplayModeCreateInfoKHR()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_DISPLAY_MODE_CREATE_INFO_KHR);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public EnumSet<VkDisplayModeCreateFlagBitsKHR> getFlags()
    {
        return flags;
    }

    public void setFlags(EnumSet<VkDisplayModeCreateFlagBitsKHR> flags)
    {
        this.flags = flags;
    }

    public VkDisplayModeParametersKHR getParameters()
    {
        return parameters;
    }

    public void setParameters(VkDisplayModeParametersKHR parameters)
    {
        this.parameters = parameters;
    }

}
