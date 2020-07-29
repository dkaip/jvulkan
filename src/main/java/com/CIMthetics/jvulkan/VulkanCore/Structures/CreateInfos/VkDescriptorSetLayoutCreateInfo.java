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
package com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos;

import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedList;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkDescriptorSetLayoutCreateFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkDescriptorSetLayoutBinding;

public class VkDescriptorSetLayoutCreateInfo extends VulkanCreateInfoStructure
{
    private EnumSet<VkDescriptorSetLayoutCreateFlagBits>    flags = EnumSet.noneOf(VkDescriptorSetLayoutCreateFlagBits.class);
    private Collection<VkDescriptorSetLayoutBinding>        bindings;

    public VkDescriptorSetLayoutCreateInfo()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_CREATE_INFO);
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
