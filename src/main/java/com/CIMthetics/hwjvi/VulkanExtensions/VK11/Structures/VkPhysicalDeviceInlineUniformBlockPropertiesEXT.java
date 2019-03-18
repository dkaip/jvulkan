package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkPhysicalDeviceInlineUniformBlockPropertiesEXT extends VulkanCreateInfoStructure
{
    private long    pNext;
    private long    maxInlineUniformBlockSize;
    private long    maxPerStageDescriptorInlineUniformBlocks;
    private long    maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks;
    private long    maxDescriptorSetInlineUniformBlocks;
    private long    maxDescriptorSetUpdateAfterBindInlineUniformBlocks;

    public VkPhysicalDeviceInlineUniformBlockPropertiesEXT()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_PROPERTIES_EXT);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public long getMaxInlineUniformBlockSize()
    {
        return maxInlineUniformBlockSize;
    }

    public void setMaxInlineUniformBlockSize(long maxInlineUniformBlockSize)
    {
        this.maxInlineUniformBlockSize = maxInlineUniformBlockSize;
    }

    public long getMaxPerStageDescriptorInlineUniformBlocks()
    {
        return maxPerStageDescriptorInlineUniformBlocks;
    }

    public void setMaxPerStageDescriptorInlineUniformBlocks(
            long maxPerStageDescriptorInlineUniformBlocks)
    {
        this.maxPerStageDescriptorInlineUniformBlocks = maxPerStageDescriptorInlineUniformBlocks;
    }

    public long getMaxPerStageDescriptorUpdateAfterBindInlineUniformBlocks()
    {
        return maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks;
    }

    public void setMaxPerStageDescriptorUpdateAfterBindInlineUniformBlocks(
            long maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks)
    {
        this.maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks = maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks;
    }

    public long getMaxDescriptorSetInlineUniformBlocks()
    {
        return maxDescriptorSetInlineUniformBlocks;
    }

    public void setMaxDescriptorSetInlineUniformBlocks(
            long maxDescriptorSetInlineUniformBlocks)
    {
        this.maxDescriptorSetInlineUniformBlocks = maxDescriptorSetInlineUniformBlocks;
    }

    public long getMaxDescriptorSetUpdateAfterBindInlineUniformBlocks()
    {
        return maxDescriptorSetUpdateAfterBindInlineUniformBlocks;
    }

    public void setMaxDescriptorSetUpdateAfterBindInlineUniformBlocks(
            long maxDescriptorSetUpdateAfterBindInlineUniformBlocks)
    {
        this.maxDescriptorSetUpdateAfterBindInlineUniformBlocks = maxDescriptorSetUpdateAfterBindInlineUniformBlocks;
    }
}
