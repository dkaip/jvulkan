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
