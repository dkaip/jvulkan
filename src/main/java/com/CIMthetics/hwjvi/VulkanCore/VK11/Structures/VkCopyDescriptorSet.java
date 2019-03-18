package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Handles.VkDescriptorSet;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkCopyDescriptorSet extends VulkanCreateInfoStructure
{
    private long            pNext;
    private VkDescriptorSet srcSet;
    private int             srcBinding;
    private int             srcArrayElement;
    private VkDescriptorSet dstSet;
    private int             dstBinding;
    private int             dstArrayElement;
    private int             descriptorCount;

    public VkCopyDescriptorSet()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_COPY_DESCRIPTOR_SET);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public VkDescriptorSet getSrcSet()
    {
        return srcSet;
    }

    public void setSrcSet(VkDescriptorSet srcSet)
    {
        this.srcSet = srcSet;
    }

    public int getSrcBinding()
    {
        return srcBinding;
    }

    public void setSrcBinding(int srcBinding)
    {
        this.srcBinding = srcBinding;
    }

    public int getSrcArrayElement()
    {
        return srcArrayElement;
    }

    public void setSrcArrayElement(int srcArrayElement)
    {
        this.srcArrayElement = srcArrayElement;
    }

    public VkDescriptorSet getDstSet()
    {
        return dstSet;
    }

    public void setDstSet(VkDescriptorSet dstSet)
    {
        this.dstSet = dstSet;
    }

    public int getDstBinding()
    {
        return dstBinding;
    }

    public void setDstBinding(int dstBinding)
    {
        this.dstBinding = dstBinding;
    }

    public int getDstArrayElement()
    {
        return dstArrayElement;
    }

    public void setDstArrayElement(int dstArrayElement)
    {
        this.dstArrayElement = dstArrayElement;
    }

    public int getDescriptorCount()
    {
        return descriptorCount;
    }

    public void setDescriptorCount(int descriptorCount)
    {
        this.descriptorCount = descriptorCount;
    }
    
}
