package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkDescriptorPoolInlineUniformBlockCreateInfoEXT extends VulkanCreateInfoStructure
{
    private long    pNext;
    private long    maxInlineUniformBlockBindings;

    public VkDescriptorPoolInlineUniformBlockCreateInfoEXT()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_DESCRIPTOR_POOL_INLINE_UNIFORM_BLOCK_CREATE_INFO_EXT);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public long getMaxInlineUniformBlockBindings()
    {
        return maxInlineUniformBlockBindings;
    }

    public void setMaxInlineUniformBlockBindings(long maxInlineUniformBlockBindings)
    {
        this.maxInlineUniformBlockBindings = maxInlineUniformBlockBindings;
    }
}
