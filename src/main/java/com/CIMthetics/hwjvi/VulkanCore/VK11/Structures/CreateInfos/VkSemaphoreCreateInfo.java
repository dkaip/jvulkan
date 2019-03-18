package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos;

import java.util.EnumSet;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkSemaphoreCreateFlagBits;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;

public class VkSemaphoreCreateInfo extends VulkanCreateInfoStructure
{
    private long                            pNext;
    private EnumSet<VkSemaphoreCreateFlagBits> flags = EnumSet.noneOf(VkSemaphoreCreateFlagBits.class);

    public VkSemaphoreCreateInfo()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_SEMAPHORE_CREATE_INFO);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public EnumSet<VkSemaphoreCreateFlagBits> getFlags()
    {
        return flags;
    }

    public void setFlags(EnumSet<VkSemaphoreCreateFlagBits> flags)
    {
        this.flags = flags;
    }
    
}
