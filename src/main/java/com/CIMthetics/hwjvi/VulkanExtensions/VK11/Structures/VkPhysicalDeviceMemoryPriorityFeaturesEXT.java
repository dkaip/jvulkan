package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkPhysicalDeviceMemoryPriorityFeaturesEXT extends VulkanCreateInfoStructure
{
    private long    pNext;
    private boolean memoryPriority;

    public VkPhysicalDeviceMemoryPriorityFeaturesEXT()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_PRIORITY_FEATURES_EXT);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public boolean isMemoryPriority()
    {
        return memoryPriority;
    }

    public void setMemoryPriority(boolean memoryPriority)
    {
        this.memoryPriority = memoryPriority;
    }

}
