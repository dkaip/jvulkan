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
package com.CIMthetics.jvulkan.VulkanCore.Structures;

import java.util.EnumSet;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkAccessFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Handles.VkBuffer;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkBufferMemoryBarrier extends VulkanCreateInfoStructure
{
    private EnumSet<VkAccessFlagBits>   srcAccessMask = EnumSet.noneOf(VkAccessFlagBits.class);
    private EnumSet<VkAccessFlagBits>   dstAccessMask = EnumSet.noneOf(VkAccessFlagBits.class);
    private int                         srcQueueFamilyIndex;
    private int                         dstQueueFamilyIndex;
    private VkBuffer                    buffer;
    private long                        offset;
    private long                        size;

    public VkBufferMemoryBarrier()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER);
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

    public int getSrcQueueFamilyIndex()
    {
        return srcQueueFamilyIndex;
    }

    public void setSrcQueueFamilyIndex(int srcQueueFamilyIndex)
    {
        this.srcQueueFamilyIndex = srcQueueFamilyIndex;
    }

    public int getDstQueueFamilyIndex()
    {
        return dstQueueFamilyIndex;
    }

    public void setDstQueueFamilyIndex(int dstQueueFamilyIndex)
    {
        this.dstQueueFamilyIndex = dstQueueFamilyIndex;
    }

    public VkBuffer getBuffer()
    {
        return buffer;
    }

    public void setBuffer(VkBuffer buffer)
    {
        this.buffer = buffer;
    }

    public long getOffset()
    {
        return offset;
    }

    public void setOffset(long offset)
    {
        this.offset = offset;
    }

    public long getSize()
    {
        return size;
    }

    public void setSize(long size)
    {
        this.size = size;
    }
    
}
