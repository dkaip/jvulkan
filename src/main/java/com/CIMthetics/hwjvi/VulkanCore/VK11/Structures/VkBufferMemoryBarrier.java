package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures;

import java.util.EnumSet;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkAccessFlagBits;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Handles.VkBuffer;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkBufferMemoryBarrier extends VulkanCreateInfoStructure
{
    private long                        pNext;
    private EnumSet<VkAccessFlagBits>   srcAccessMask = EnumSet.noneOf(VkAccessFlagBits.class);
    private EnumSet<VkAccessFlagBits>   dstAccessMask = EnumSet.noneOf(VkAccessFlagBits.class);
    private int                         srcQueueFamilyIndex;
    private int                         dstQueueFamilyIndex;
    private VkBuffer                    buffer;
    private long                        offset;
    private long                        size;

    public VkBufferMemoryBarrier()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_BUFFER_MEMORY_BARRIER);
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

    public int getSrcQueueFamilyIndex()
    {
        return srcQueueFamilyIndex;
    }

    public void setSrcQueueFamilyIndex(int srcQueueFamilyIndex)
    {
        this.srcQueueFamilyIndex = srcQueueFamilyIndex;
    }

    public int getDstQueueFamilyIndex()
    {
        return dstQueueFamilyIndex;
    }

    public void setDstQueueFamilyIndex(int dstQueueFamilyIndex)
    {
        this.dstQueueFamilyIndex = dstQueueFamilyIndex;
    }

    public VkBuffer getBuffer()
    {
        return buffer;
    }

    public void setBuffer(VkBuffer buffer)
    {
        this.buffer = buffer;
    }

    public long getOffset()
    {
        return offset;
    }

    public void setOffset(long offset)
    {
        this.offset = offset;
    }

    public long getSize()
    {
        return size;
    }

    public void setSize(long size)
    {
        this.size = size;
    }
    
}
