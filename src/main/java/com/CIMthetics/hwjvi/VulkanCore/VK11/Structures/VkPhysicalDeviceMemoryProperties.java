package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures;

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
    
}
