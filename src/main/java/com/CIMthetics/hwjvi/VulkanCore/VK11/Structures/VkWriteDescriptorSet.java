package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures;

import java.util.Collection;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkDescriptorType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Handles.VkBufferView;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Handles.VkDescriptorSet;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkWriteDescriptorSet extends VulkanCreateInfoStructure
{
    private long                                pNext;
    private VkDescriptorSet                     dstSet;
    private int                                 dstBinding;
    private int                                 dstArrayElement;
    private VkDescriptorType                    descriptorType;
    private Collection<VkDescriptorImageInfo>   imageInfo;
    private Collection<VkDescriptorBufferInfo>  bufferInfo;
    private Collection<VkBufferView>            texelBufferView;
    
    public VkWriteDescriptorSet()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
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

    public VkDescriptorType getDescriptorType()
    {
        return descriptorType;
    }

    public void setDescriptorType(VkDescriptorType descriptorType)
    {
        this.descriptorType = descriptorType;
    }

    public Collection<VkDescriptorImageInfo> getImageInfo()
    {
        return imageInfo;
    }

    public void setImageInfo(Collection<VkDescriptorImageInfo> imageInfo)
    {
        this.imageInfo = imageInfo;
    }

    public Collection<VkDescriptorBufferInfo> getBufferInfo()
    {
        return bufferInfo;
    }

    public void setBufferInfo(Collection<VkDescriptorBufferInfo> bufferInfo)
    {
        this.bufferInfo = bufferInfo;
    }

    public Collection<VkBufferView> getTexelBufferView()
    {
        return texelBufferView;
    }

    public void setTexelBufferView(Collection<VkBufferView> texelBufferView)
    {
        this.texelBufferView = texelBufferView;
    }
    
}
