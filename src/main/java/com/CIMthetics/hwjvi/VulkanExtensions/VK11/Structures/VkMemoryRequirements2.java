package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.VkMemoryRequirements;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkMemoryRequirements2 extends VulkanCreateInfoStructure
{
    private long                    pNext;
    private VkMemoryRequirements    memoryRequirements;

    public VkMemoryRequirements2()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_MEMORY_REQUIREMENTS_2);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public VkMemoryRequirements getMemoryRequirements()
    {
        return memoryRequirements;
    }

    public void setMemoryRequirements(VkMemoryRequirements memoryRequirements)
    {
        this.memoryRequirements = memoryRequirements;
    }
}
