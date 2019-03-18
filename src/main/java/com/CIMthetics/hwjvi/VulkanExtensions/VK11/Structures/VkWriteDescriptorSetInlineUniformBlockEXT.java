package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkWriteDescriptorSetInlineUniformBlockEXT extends VulkanCreateInfoStructure
{
    private long    pNext;
    private long    dataSize;
    // TODO may need to make a byte buffer
    private long    pData;

    public VkWriteDescriptorSetInlineUniformBlockEXT()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_INLINE_UNIFORM_BLOCK_EXT);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public long getDataSize()
    {
        return dataSize;
    }

    public void setDataSize(long dataSize)
    {
        this.dataSize = dataSize;
    }

    public long getpData()
    {
        return pData;
    }

    public void setpData(long pData)
    {
        this.pData = pData;
    }
}
