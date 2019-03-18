package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos;

import java.util.EnumSet;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkFenceCreateFlagBits;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;

public class VkFenceCreateInfo extends VulkanCreateInfoStructure
{
    private long                            pNext;
    private EnumSet<VkFenceCreateFlagBits> flags = EnumSet.noneOf(VkFenceCreateFlagBits.class);

    public VkFenceCreateInfo()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_FENCE_CREATE_INFO);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public EnumSet<VkFenceCreateFlagBits> getFlags()
    {
        return flags;
    }

    public void setFlags(EnumSet<VkFenceCreateFlagBits> flags)
    {
        this.flags = flags;
    }
    
}
