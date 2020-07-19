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

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkBufferViewCreateFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkFormat;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Handles.VkBuffer;

public class VkBufferViewCreateInfo extends VulkanCreateInfoStructure
{
    private EnumSet<VkBufferViewCreateFlagBits> flags = EnumSet.noneOf(VkBufferViewCreateFlagBits.class);
    private VkBuffer                            buffer;
    private VkFormat                            format;
    private long                                offset;
    private long                                range;

    public VkBufferViewCreateInfo()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_BUFFER_VIEW_CREATE_INFO);
    }

    public EnumSet<VkBufferViewCreateFlagBits> getFlags()
    {
        return flags;
    }

    public void setFlags(EnumSet<VkBufferViewCreateFlagBits> flags)
    {
        this.flags = flags;
    }

    public VkBuffer getBuffer()
    {
        return buffer;
    }

    public void setBuffer(VkBuffer buffer)
    {
        this.buffer = buffer;
    }

    public VkFormat getFormat()
    {
        return format;
    }

    public void setFormat(VkFormat format)
    {
        this.format = format;
    }

    public long getOffset()
    {
        return offset;
    }

    public void setOffset(long offset)
    {
        this.offset = offset;
    }

    public long getRange()
    {
        return range;
    }

    public void setRange(long range)
    {
        this.range = range;
    }
}
