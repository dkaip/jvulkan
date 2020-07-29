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

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkDescriptorType;

public class VkDescriptorUpdateTemplateEntry
{
    private int                 dstBinding;
    private int                 dstArrayElement;
    private int                 descriptorCount;
    private VkDescriptorType    descriptorType;
    private long                offset;
    private long                stride;
    
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
    public int getDescriptorCount()
    {
        return descriptorCount;
    }
    public void setDescriptorCount(int descriptorCount)
    {
        this.descriptorCount = descriptorCount;
    }
    public VkDescriptorType getDescriptorType()
    {
        return descriptorType;
    }
    public void setDescriptorType(VkDescriptorType descriptorType)
    {
        this.descriptorType = descriptorType;
    }
    public long getOffset()
    {
        return offset;
    }
    public void setOffset(long offset)
    {
        this.offset = offset;
    }
    public long getStride()
    {
        return stride;
    }
    public void setStride(long stride)
    {
        this.stride = stride;
    }
    
}
