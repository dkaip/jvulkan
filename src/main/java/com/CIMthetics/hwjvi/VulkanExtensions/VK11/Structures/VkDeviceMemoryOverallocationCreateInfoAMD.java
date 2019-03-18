package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;
import com.CIMthetics.hwjvi.VulkanExtensions.VK11.Enums.VkMemoryOverallocationBehaviorAMD;

public class VkDeviceMemoryOverallocationCreateInfoAMD extends VulkanCreateInfoStructure
{
    private long                                pNext;
    private VkMemoryOverallocationBehaviorAMD   overallocationBehavior;

    public VkDeviceMemoryOverallocationCreateInfoAMD()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_DEVICE_MEMORY_OVERALLOCATION_CREATE_INFO_AMD);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public VkMemoryOverallocationBehaviorAMD getOverallocationBehavior()
    {
        return overallocationBehavior;
    }

    public void setOverallocationBehavior(
            VkMemoryOverallocationBehaviorAMD overallocationBehavior)
    {
        this.overallocationBehavior = overallocationBehavior;
    }

}
