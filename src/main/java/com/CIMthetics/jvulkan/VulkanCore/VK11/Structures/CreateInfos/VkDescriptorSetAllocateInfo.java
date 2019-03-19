/*
 * Copyright 2019 Douglas Kaip
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
package com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos;

import java.util.Collection;

import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Handles.VkDescriptorPool;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Handles.VkDescriptorSetLayout;

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