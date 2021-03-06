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

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkSparseMemoryBindFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.Handles.VkDeviceMemory;

public class VkSparseImageMemoryBind
{
    private VkImageSubresource                  subresource;
    private VkOffset3D                          offset;
    private VkExtent3D                          extent;
    private VkDeviceMemory                      memory;
    private long                                memoryOffset;
    private EnumSet<VkSparseMemoryBindFlagBits> flags = EnumSet.noneOf(VkSparseMemoryBindFlagBits.class);
    
    public VkImageSubresource getSubresource()
    {
        return subresource;
    }
    
    public void setSubresource(VkImageSubresource subresource)
    {
        this.subresource = subresource;
    }
    
    public VkOffset3D getOffset()
    {
        return offset;
    }
    
    public void setOffset(VkOffset3D offset)
    {
        this.offset = offset;
    }
    
    public VkExtent3D getExtent()
    {
        return extent;
    }
    
    public void setExtent(VkExtent3D extent)
    {
        this.extent = extent;
    }
    
    public VkDeviceMemory getMemory()
    {
        return memory;
    }
    
    public void setMemory(VkDeviceMemory memory)
    {
        this.memory = memory;
    }
    
    public long getMemoryOffset()
    {
        return memoryOffset;
    }
    
    public void setMemoryOffset(long memoryOffset)
    {
        this.memoryOffset = memoryOffset;
    }
    
    public EnumSet<VkSparseMemoryBindFlagBits> getFlags()
    {
        return flags;
    }
    
    public void setFlags(EnumSet<VkSparseMemoryBindFlagBits> flags)
    {
        this.flags = flags;
    }
}
