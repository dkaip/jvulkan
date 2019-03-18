package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures;

import java.util.Collection;
import java.util.EnumSet;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkDescriptorType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkShaderStageFlagBits;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Handles.VkSampler;

public class VkDescriptorSetLayoutBinding
{
    private int                             binding;
    private VkDescriptorType                descriptorType;
    private int                             descriptorCount;
    private EnumSet<VkShaderStageFlagBits>  stageFlags = EnumSet.noneOf(VkShaderStageFlagBits.class);
    private Collection<VkSampler>           immutableSamplers;
    
    public int getBinding()
    {
        return binding;
    }
    
    public void setBinding(int binding)
    {
        this.binding = binding;
    }
    
    public VkDescriptorType getDescriptorType()
    {
        return descriptorType;
    }
    
    public void setDescriptorType(VkDescriptorType descriptorType)
    {
        this.descriptorType = descriptorType;
    }
    
    public int getDescriptorCount()
    {
        return descriptorCount;
    }
    
    public void setDescriptorCount(int descriptorCount)
    {
        this.descriptorCount = descriptorCount;
    }
    
    public EnumSet<VkShaderStageFlagBits> getStageFlags()
    {
        return stageFlags;
    }
    
    public void setStageFlags(EnumSet<VkShaderStageFlagBits> stageFlags)
    {
        this.stageFlags = stageFlags;
    }
    
    public Collection<VkSampler> getImmutableSamplers()
    {
        return immutableSamplers;
    }
    
    public void setImmutableSamplers(Collection<VkSampler> immutableSamplers)
    {
        this.immutableSamplers = immutableSamplers;
    }
}
