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

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;

public class VkMemoryAllocateInfo extends VulkanCreateInfoStructure
{
    private long    pNext;
    private long    allocationSize;
    private int     memoryTypeIndex;
    
    public VkMemoryAllocateInfo()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_MEMORY_ALLOCATE_INFO);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public long getAllocationSize()
    {
        return allocationSize;
    }

    public void setAllocationSize(long allocationSize)
    {
        this.allocationSize = allocationSize;
    }

    public int getMemoryTypeIndex()
    {
        return memoryTypeIndex;
    }

    public void setMemoryTypeIndex(int memoryTypeIndex)
    {
        this.memoryTypeIndex = memoryTypeIndex;
    }
    
}
