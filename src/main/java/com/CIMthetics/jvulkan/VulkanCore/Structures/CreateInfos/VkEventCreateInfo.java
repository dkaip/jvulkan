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
package com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos;

import java.util.EnumSet;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkEventCreateFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;

public class VkEventCreateInfo extends VulkanCreateInfoStructure
{
    private EnumSet<VkEventCreateFlagBits>  flags = EnumSet.noneOf(VkEventCreateFlagBits.class);
    
    public VkEventCreateInfo()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_EVENT_CREATE_INFO);
    }

    public EnumSet<VkEventCreateFlagBits> getFlags()
    {
        return flags;
    }

    public void setFlags(EnumSet<VkEventCreateFlagBits> flags)
    {
        this.flags = flags;
    }
    
}
