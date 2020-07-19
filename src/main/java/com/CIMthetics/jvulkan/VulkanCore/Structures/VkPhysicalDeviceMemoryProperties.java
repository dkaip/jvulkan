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

import java.util.Collection;
import java.util.LinkedList;

public class VkPhysicalDeviceMemoryProperties
{
    private Collection<VkMemoryType> memoryTypes;
    private Collection<VkMemoryHeap> memoryHeaps;
    
    public VkPhysicalDeviceMemoryProperties()
    {
        memoryTypes = new LinkedList<VkMemoryType>();
        memoryHeaps = new LinkedList<VkMemoryHeap>();
    }

    public Collection<VkMemoryType> getMemoryTypes()
    {
        return memoryTypes;
    }

    public void setMemoryTypes(Collection<VkMemoryType> memoryTypes)
    {
        this.memoryTypes = memoryTypes;
    }

    public Collection<VkMemoryHeap> getMemoryHeaps()
    {
        return memoryHeaps;
    }

    public void setMemoryHeaps(Collection<VkMemoryHeap> memoryHeaps)
    {
        this.memoryHeaps = memoryHeaps;
    }
    
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\nVkPhysicalDeviceMemoryProperties\n"));
        sb.append("    VkMemoryTypes:\n");

        for(VkMemoryType temp : memoryTypes)
        {
            sb.append(String.format("    %s", temp.toString()));
        }

        for(VkMemoryHeap temp : memoryHeaps)
        {
            sb.append(String.format("    %s", temp.toString()));
        }
        
        return sb.toString();
    }
}
