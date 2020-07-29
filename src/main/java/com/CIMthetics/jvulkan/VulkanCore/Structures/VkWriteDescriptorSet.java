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

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkDescriptorType;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Handles.VkBufferView;
import com.CIMthetics.jvulkan.VulkanCore.Handles.VkDescriptorSet;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkWriteDescriptorSet extends VulkanCreateInfoStructure
{
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
        if (bufferInfo != null ||
            texelBufferView != null)
        {
            throw new IllegalArgumentException("Only one of imageInfo, bufferInfo, or texelBufferView may be used at a time in a single VkWriteDescriptorSet object.");
        }
        
        this.imageInfo = imageInfo;
    }

    public Collection<VkDescriptorBufferInfo> getBufferInfo()
    {
        return bufferInfo;
    }

    public void setBufferInfo(Collection<VkDescriptorBufferInfo> bufferInfo)
    {
        if (imageInfo != null ||
            texelBufferView != null)
        {
            throw new IllegalArgumentException("Only one of imageInfo, bufferInfo, or texelBufferView may be used at a time in a single VkWriteDescriptorSet object.");
        }

        this.bufferInfo = bufferInfo;
    }

    public Collection<VkBufferView> getTexelBufferView()
    {
        return texelBufferView;
    }

    public void setTexelBufferView(Collection<VkBufferView> texelBufferView)
    {
        if (imageInfo != null ||
            bufferInfo != null)
        {
            throw new IllegalArgumentException("Only one of imageInfo, bufferInfo, or texelBufferView may be used at a time in a single VkWriteDescriptorSet object.");
        }

        this.texelBufferView = texelBufferView;
    }
    
}