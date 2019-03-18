package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos;

import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedList;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkDescriptorSetLayoutCreateFlagBits;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.VkDescriptorSetLayoutBinding;

public class VkDescriptorSetLayoutCreateInfo extends VulkanCreateInfoStructure
{
    private long                                            pNext;
    private EnumSet<VkDescriptorSetLayoutCreateFlagBits>    flags = EnumSet.noneOf(VkDescriptorSetLayoutCreateFlagBits.class);
    private Collection<VkDescriptorSetLayoutBinding>        bindings;

    public VkDescriptorSetLayoutCreateInfo()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_CREATE_INFO);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public EnumSet<VkDescriptorSetLayoutCreateFlagBits> getFlags()
    {
        return flags;
    }

    public void setFlags(EnumSet<VkDescriptorSetLayoutCreateFlagBits> flags)
    {
        this.flags = flags;
    }

    public Collection<VkDescriptorSetLayoutBinding> getBindings()
    {
        return bindings;
    }

    public void setBindings(VkDescriptorSetLayoutBinding binding)
    {
        this.bindings = new LinkedList<VkDescriptorSetLayoutBinding>();
        this.bindings.add(binding);
    }
    
    public void setBindings(Collection<VkDescriptorSetLayoutBinding> bindings)
    {
        this.bindings = bindings;
    }
    
}
