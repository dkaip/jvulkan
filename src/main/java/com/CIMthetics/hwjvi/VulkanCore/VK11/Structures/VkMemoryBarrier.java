package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures;

import java.util.EnumSet;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkAccessFlagBits;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkMemoryBarrier extends VulkanCreateInfoStructure
{
    private long                        pNext;
    private EnumSet<VkAccessFlagBits>   srcAccessMask = EnumSet.noneOf(VkAccessFlagBits.class);
    private EnumSet<VkAccessFlagBits>   dstAccessMask = EnumSet.noneOf(VkAccessFlagBits.class);
    
    public VkMemoryBarrier()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_MEMORY_BARRIER);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public EnumSet<VkAccessFlagBits> getSrcAccessMask()
    {
        return srcAccessMask;
    }

    public void setSrcAccessMask(EnumSet<VkAccessFlagBits> srcAccessMask)
    {
        this.srcAccessMask = srcAccessMask;
    }

    public EnumSet<VkAccessFlagBits> getDstAccessMask()
    {
        return dstAccessMask;
    }

    public void setDstAccessMask(EnumSet<VkAccessFlagBits> dstAccessMask)
    {
        this.dstAccessMask = dstAccessMask;
    }
}
