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

import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkFenceCreateFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkStructureType;

public class VkFenceCreateInfo extends VulkanCreateInfoStructure
{
    private EnumSet<VkFenceCreateFlagBits> flags = EnumSet.noneOf(VkFenceCreateFlagBits.class);

    public VkFenceCreateInfo()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_FENCE_CREATE_INFO);
    }

    public EnumSet<VkFenceCreateFlagBits> getFlags()
    {
        return flags;
    }

    public void setFlags(EnumSet<VkFenceCreateFlagBits> flags)
    {
        this.flags = flags;
    }
    
}
