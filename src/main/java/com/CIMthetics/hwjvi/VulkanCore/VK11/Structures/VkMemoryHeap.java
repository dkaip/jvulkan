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
package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures;

import java.util.EnumSet;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkMemoryHeapFlagBits;

public class VkMemoryHeap
{
    private long                            size;
    private EnumSet<VkMemoryHeapFlagBits>   flags = EnumSet.noneOf(VkMemoryHeapFlagBits.class);
    
    public VkMemoryHeap()
    {
    }
    
    public VkMemoryHeap(long size, EnumSet<VkMemoryHeapFlagBits> flags)
    {
        this.size = size;
        
        if (flags == null)
            flags = EnumSet.noneOf(VkMemoryHeapFlagBits.class);
        else
            this.flags = flags;
    }

    public long getSize()
    {
        return size;
    }

    public void setSize(long size)
    {
        this.size = size;
    }

    public EnumSet<VkMemoryHeapFlagBits> getFlags()
    {
        return flags;
    }

    public void setFlags(EnumSet<VkMemoryHeapFlagBits> flags)
    {
        this.flags = flags;
    }
    
}
