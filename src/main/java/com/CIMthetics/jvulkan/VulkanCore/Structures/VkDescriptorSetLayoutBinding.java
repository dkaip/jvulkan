/*
 * Copyright 2019-2020 Douglas Kaip
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.CIMthetics.jvulkan.VulkanCore.Structures;

import java.util.Collection;
import java.util.EnumSet;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkDescriptorType;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkShaderStageFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.Handles.VkSampler;

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
