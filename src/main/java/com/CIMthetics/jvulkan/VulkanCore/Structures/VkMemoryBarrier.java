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

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkAccessFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkMemoryBarrier extends VulkanCreateInfoStructure
{
    private EnumSet<VkAccessFlagBits>   srcAccessMask = EnumSet.noneOf(VkAccessFlagBits.class);
    private EnumSet<VkAccessFlagBits>   dstAccessMask = EnumSet.noneOf(VkAccessFlagBits.class);
    
    public VkMemoryBarrier()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_MEMORY_BARRIER);
    }

    public EnumSet<VkAccessFlagBits> getSrcAccessMask()
    {
        return srcAccessMask;
    }

    public void setSrcAccessMask(EnumSet<VkAccessFlagBits> srcAccessMask)
    {
        this.srcAccessMask = srcAccessMask;
    }

    public EnumSet<VkAccessFlagBits> getDstAccessMask()
    {
        return dstAccessMask;
    }

    public void setDstAccessMask(EnumSet<VkAccessFlagBits> dstAccessMask)
    {
        this.dstAccessMask = dstAccessMask;
    }
}
