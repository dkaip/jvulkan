package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos;

import java.util.EnumSet;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkBufferCreateFlagBits;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkBufferUsageFlagBits;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkSharingMode;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;

public class VkBufferCreateInfo extends VulkanCreateInfoStructure
{
    private long                            pNext;
    private EnumSet<VkBufferCreateFlagBits> flags = EnumSet.noneOf(VkBufferCreateFlagBits.class);
    private long                            size;
    private EnumSet<VkBufferUsageFlagBits>  usage = EnumSet.noneOf(VkBufferUsageFlagBits.class);
    private VkSharingMode                   sharingMode;
    private int[]                           queueFamilyIndices;

    public VkBufferCreateInfo()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_BUFFER_CREATE_INFO);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public EnumSet<VkBufferCreateFlagBits> getFlags()
    {
        return flags;
    }

    public void setFlags(EnumSet<VkBufferCreateFlagBits> flags)
    {
        this.flags = flags;
    }

    public long getSize()
    {
        return size;
    }

    public void setSize(long size)
    {
        this.size = size;
    }

    public EnumSet<VkBufferUsageFlagBits> getUsage()
    {
        return usage;
    }

    public void setUsage(EnumSet<VkBufferUsageFlagBits> usage)
    {
        this.usage = usage;
    }

    public VkSharingMode getSharingMode()
    {
        return sharingMode;
    }

    public void setSharingMode(VkSharingMode sharingMode)
    {
        this.sharingMode = sharingMode;
    }

    public int[] getQueueFamilyIndices()
    {
        return queueFamilyIndices;
    }

    public void setQueueFamilyIndices(int[] queueFamilyIndices)
    {
        this.queueFamilyIndices = queueFamilyIndices;
    }
    
}
