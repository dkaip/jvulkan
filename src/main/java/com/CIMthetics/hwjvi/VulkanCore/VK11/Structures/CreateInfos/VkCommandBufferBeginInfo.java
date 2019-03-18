package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos;

import java.util.EnumSet;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkCommandBufferUsageFlagBits;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;

public class VkCommandBufferBeginInfo extends VulkanCreateInfoStructure
{
    private long                                    pNext;
    private EnumSet<VkCommandBufferUsageFlagBits>   flags = EnumSet.noneOf(VkCommandBufferUsageFlagBits.class);
    private VkCommandBufferInheritanceInfo          inheritanceInfo;
    
    public VkCommandBufferBeginInfo()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_COMMAND_BUFFER_BEGIN_INFO);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public EnumSet<VkCommandBufferUsageFlagBits> getFlags()
    {
        return flags;
    }

    public void setFlags(EnumSet<VkCommandBufferUsageFlagBits> flags)
    {
        this.flags = flags;
    }

    public VkCommandBufferInheritanceInfo getInheritanceInfo()
    {
        return inheritanceInfo;
    }

    public void setInheritanceInfo(VkCommandBufferInheritanceInfo inheritanceInfo)
    {
        this.inheritanceInfo = inheritanceInfo;
    }
    
}
