package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkPhysicalDeviceMemoryBudgetPropertiesEXT extends VulkanCreateInfoStructure
{
    private long    pNext;
    private long[]  heapBudget;
    private long[]  heapUsage;

    public VkPhysicalDeviceMemoryBudgetPropertiesEXT()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_BUDGET_PROPERTIES_EXT);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public long[] getHeapBudget()
    {
        return heapBudget;
    }

    public void setHeapBudget(long[] heapBudget)
    {
        this.heapBudget = heapBudget;
    }

    public long[] getHeapUsage()
    {
        return heapUsage;
    }

    public void setHeapUsage(long[] heapUsage)
    {
        this.heapUsage = heapUsage;
    }

}
