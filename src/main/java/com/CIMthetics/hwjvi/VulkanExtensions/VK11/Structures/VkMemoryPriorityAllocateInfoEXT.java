package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkMemoryPriorityAllocateInfoEXT extends VulkanCreateInfoStructure
{
    private long    pNext;
    private float   priority;

    public VkMemoryPriorityAllocateInfoEXT()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_MEMORY_PRIORITY_ALLOCATE_INFO_EXT);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public float getPriority()
    {
        return priority;
    }

    public void setPriority(float priority)
    {
        this.priority = priority;
    }

}
