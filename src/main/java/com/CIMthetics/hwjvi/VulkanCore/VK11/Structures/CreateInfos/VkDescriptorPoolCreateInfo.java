package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos;

import java.util.Collection;
import java.util.EnumSet;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkDescriptorPoolCreateFlagBits;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.VkDescriptorPoolSize;

public class VkDescriptorPoolCreateInfo extends VulkanCreateInfoStructure
{
    private long                                    pNext;
    private EnumSet<VkDescriptorPoolCreateFlagBits> flags = EnumSet.noneOf(VkDescriptorPoolCreateFlagBits.class);
    private int                                     maxSets;
    private Collection<VkDescriptorPoolSize>        poolSizes;

    public VkDescriptorPoolCreateInfo()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_DESCRIPTOR_POOL_CREATE_INFO);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public EnumSet<VkDescriptorPoolCreateFlagBits> getFlags()
    {
        return flags;
    }

    public void setFlags(EnumSet<VkDescriptorPoolCreateFlagBits> flags)
    {
        this.flags = flags;
    }

    public int getMaxSets()
    {
        return maxSets;
    }

    public void setMaxSets(int maxSets)
    {
        this.maxSets = maxSets;
    }

    public Collection<VkDescriptorPoolSize> getPoolSizes()
    {
        return poolSizes;
    }

    public void setPoolSizes(Collection<VkDescriptorPoolSize> poolSizes)
    {
        this.poolSizes = poolSizes;
    }
    
}
