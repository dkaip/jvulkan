package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkPhysicalDeviceInlineUniformBlockFeaturesEXT extends VulkanCreateInfoStructure
{
    private long    pNext;
    private boolean inlineUniformBlock;
    private boolean descriptorBindingInlineUniformBlockUpdateAfterBind;

    public VkPhysicalDeviceInlineUniformBlockFeaturesEXT()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_INLINE_UNIFORM_BLOCK_FEATURES_EXT);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public boolean isInlineUniformBlock()
    {
        return inlineUniformBlock;
    }

    public void setInlineUniformBlock(boolean inlineUniformBlock)
    {
        this.inlineUniformBlock = inlineUniformBlock;
    }

    public boolean isDescriptorBindingInlineUniformBlockUpdateAfterBind()
    {
        return descriptorBindingInlineUniformBlockUpdateAfterBind;
    }

    public void setDescriptorBindingInlineUniformBlockUpdateAfterBind(
            boolean descriptorBindingInlineUniformBlockUpdateAfterBind)
    {
        this.descriptorBindingInlineUniformBlockUpdateAfterBind = descriptorBindingInlineUniformBlockUpdateAfterBind;
    }
    
}
