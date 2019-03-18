package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos;

import java.util.Collection;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Handles.VkDescriptorPool;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Handles.VkDescriptorSetLayout;

public class VkDescriptorSetAllocateInfo extends VulkanCreateInfoStructure
{
    private long                                pNext;
    private VkDescriptorPool                    descriptorPool;
    private Collection<VkDescriptorSetLayout>   setLayouts;
    
    public VkDescriptorSetAllocateInfo()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_DESCRIPTOR_SET_ALLOCATE_INFO);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public VkDescriptorPool getDescriptorPool()
    {
        return descriptorPool;
    }

    public void setDescriptorPool(VkDescriptorPool descriptorPool)
    {
        this.descriptorPool = descriptorPool;
    }

    public Collection<VkDescriptorSetLayout> getSetLayouts()
    {
        return setLayouts;
    }

    public void setSetLayouts(Collection<VkDescriptorSetLayout> setLayouts)
    {
        this.setLayouts = setLayouts;
    }
    
}
