package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkDescriptorType;

public class VkDescriptorPoolSize
{
    private VkDescriptorType    type;
    private int                 descriptorCount;
    
    public VkDescriptorPoolSize() {}
    
    public VkDescriptorPoolSize(VkDescriptorType type, int descriptorCount)
    {
        this.type            = type;
        this.descriptorCount = descriptorCount;
    }

    public VkDescriptorType getType()
    {
        return type;
    }

    public void setType(VkDescriptorType type)
    {
        this.type = type;
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
