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
package com.CIMthetics.jvulkan.VulkanCore.VK11.Structures;

import java.util.EnumSet;

import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkSparseMemoryBindFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Handles.VkDeviceMemory;

public class VkSparseMemoryBind
{
    private long                        resourceOffset;
    private long                        size;
    private VkDeviceMemory              memory;
    private long                        memoryOffset;
    EnumSet<VkSparseMemoryBindFlagBits> flags = EnumSet.noneOf(VkSparseMemoryBindFlagBits.class);
    
    public long getResourceOffset()
    {
        return resourceOffset;
    }
    
    public void setResourceOffset(long resourceOffset)
    {
        this.resourceOffset = resourceOffset;
    }
    
    public long getSize()
    {
        return size;
    }
    
    public void setSize(long size)
    {
        this.size = size;
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
