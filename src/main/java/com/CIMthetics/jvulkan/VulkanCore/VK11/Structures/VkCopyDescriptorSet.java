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

import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Handles.VkDescriptorSet;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkCopyDescriptorSet extends VulkanCreateInfoStructure
{
    private VkDescriptorSet srcSet;
    private int             srcBinding;
    private int             srcArrayElement;
    private VkDescriptorSet dstSet;
    private int             dstBinding;
    private int             dstArrayElement;
    private int             descriptorCount;

    public VkCopyDescriptorSet()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_COPY_DESCRIPTOR_SET);
    }

    public VkDescriptorSet getSrcSet()
    {
        return srcSet;
    }

    public void setSrcSet(VkDescriptorSet srcSet)
    {
        this.srcSet = srcSet;
    }

    public int getSrcBinding()
    {
        return srcBinding;
    }

    public void setSrcBinding(int srcBinding)
    {
        this.srcBinding = srcBinding;
    }

    public int getSrcArrayElement()
    {
        return srcArrayElement;
    }

    public void setSrcArrayElement(int srcArrayElement)
    {
        this.srcArrayElement = srcArrayElement;
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

    public int getDescriptorCount()
    {
        return descriptorCount;
    }

    public void setDescriptorCount(int descriptorCount)
    {
        this.descriptorCount = descriptorCount;
    }
    
}
