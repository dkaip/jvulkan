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
package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos;

import java.util.EnumSet;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkFormat;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkImageViewCreateFlagBits;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkImageViewType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Handles.VkImage;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.VkComponentMapping;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.VkImageSubresourceRange;

public class VkImageViewCreateInfo extends VulkanCreateInfoStructure
{
    private long                                pNext;
    private EnumSet<VkImageViewCreateFlagBits>  flags = EnumSet.noneOf(VkImageViewCreateFlagBits.class);
    private VkImage                             image;
    private VkImageViewType                     viewType;
    private VkFormat                            format;
    private VkComponentMapping                  components;
    private VkImageSubresourceRange             subresourceRange;

    public VkImageViewCreateInfo()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_IMAGE_VIEW_CREATE_INFO);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public EnumSet<VkImageViewCreateFlagBits> getFlags()
    {
        return flags;
    }

    public void setFlags(EnumSet<VkImageViewCreateFlagBits> flags)
    {
        this.flags = flags;
    }

    public VkImage getImage()
    {
        return image;
    }

    public void setImage(VkImage image)
    {
        this.image = image;
    }

    public VkImageViewType getViewType()
    {
        return viewType;
    }

    public void setViewType(VkImageViewType viewType)
    {
        this.viewType = viewType;
    }

    public VkFormat getFormat()
    {
        return format;
    }

    public void setFormat(VkFormat format)
    {
        this.format = format;
    }

    public VkComponentMapping getComponents()
    {
        return components;
    }

    public void setComponents(VkComponentMapping components)
    {
        this.components = components;
    }

    public VkImageSubresourceRange getSubresourceRange()
    {
        return subresourceRange;
    }

    public void setSubresourceRange(VkImageSubresourceRange subresourceRange)
    {
        this.subresourceRange = subresourceRange;
    }
    
}
