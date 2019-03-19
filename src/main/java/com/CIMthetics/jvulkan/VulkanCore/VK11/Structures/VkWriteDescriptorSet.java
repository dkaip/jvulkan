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
package com.CIMthetics.jvulkan.VulkanCore.VK11.Structures;

import java.util.Collection;

import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkDescriptorType;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Handles.VkBufferView;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Handles.VkDescriptorSet;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

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
