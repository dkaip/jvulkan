package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos;

import java.util.EnumSet;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkCommandPoolCreateFlagBits;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;

public class VkCommandPoolCreateInfo extends VulkanCreateInfoStructure
{
    private long                                    pNext;
    private EnumSet<VkCommandPoolCreateFlagBits>    flags = EnumSet.noneOf(VkCommandPoolCreateFlagBits.class);
    private int                                     queueFamilyIndex;

    public VkCommandPoolCreateInfo()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_COMMAND_POOL_CREATE_INFO);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public EnumSet<VkCommandPoolCreateFlagBits> getFlags()
    {
        return flags;
    }

    public void setFlags(EnumSet<VkCommandPoolCreateFlagBits> flags)
    {
        this.flags = flags;
    }

    public int getQueueFamilyIndex()
    {
        return queueFamilyIndex;
    }

    public void setQueueFamilyIndex(int queueFamilyIndex)
    {
        this.queueFamilyIndex = queueFamilyIndex;
    }
    
}
