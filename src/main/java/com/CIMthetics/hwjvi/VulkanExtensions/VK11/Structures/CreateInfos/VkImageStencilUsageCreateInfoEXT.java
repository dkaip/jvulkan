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
package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures.CreateInfos;

import java.util.EnumSet;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkImageUsageFlagBits;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkImageStencilUsageCreateInfoEXT extends VulkanCreateInfoStructure
{
    private long                            pNext;
    private EnumSet<VkImageUsageFlagBits>   stencilUsage;

    public VkImageStencilUsageCreateInfoEXT()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_IMAGE_STENCIL_USAGE_CREATE_INFO_EXT);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public EnumSet<VkImageUsageFlagBits> getStencilUsage()
    {
        return stencilUsage;
    }

    public void setStencilUsage(EnumSet<VkImageUsageFlagBits> stencilUsage)
    {
        this.stencilUsage = stencilUsage;
    }

}
