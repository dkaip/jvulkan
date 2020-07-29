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

import java.util.BitSet;
import java.util.Collection;
import java.util.EnumSet;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkPipelineBindPoint;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkSubpassDescriptionFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkSubpassDescription2 extends VulkanCreateInfoStructure
{
    private EnumSet<VkSubpassDescriptionFlagBits>   flags = EnumSet.noneOf(VkSubpassDescriptionFlagBits.class);
    private VkPipelineBindPoint                     pipelineBindPoint;
    private BitSet                                  viewMask = new BitSet(32); // The c++ variable is only 32 bits
    private Collection<VkAttachmentReference2>      inputAttachments;
    private Collection<VkAttachmentReference2>      colorAttachments;
    private Collection<VkAttachmentReference2>      resolveAttachments;
    private VkAttachmentReference2                  depthStencilAttachment;
    private int[]                                   preserveAttachments;
    
    public VkSubpassDescription2()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_SUBPASS_DESCRIPTION_2);
    }

    public EnumSet<VkSubpassDescriptionFlagBits> getFlags()
    {
        return flags;
    }

    public void setFlags(EnumSet<VkSubpassDescriptionFlagBits> flags)
    {
        this.flags = flags;
    }

    public VkPipelineBindPoint getPipelineBindPoint()
    {
        return pipelineBindPoint;
    }

    public void setPipelineBindPoint(VkPipelineBindPoint pipelineBindPoint)
    {
        this.pipelineBindPoint = pipelineBindPoint;
    }

    public BitSet getViewMask()
    {
        return viewMask;
    }

//    public void setViewMask(BitSet viewMask)
//    {
//        this.viewMask = viewMask;
//    }
//
    public Collection<VkAttachmentReference2> getInputAttachments()
    {
        return inputAttachments;
    }

    public void setInputAttachments(
            Collection<VkAttachmentReference2> inputAttachments)
    {
        this.inputAttachments = inputAttachments;
    }

    public Collection<VkAttachmentReference2> getColorAttachments()
    {
        return colorAttachments;
    }

    public void setColorAttachments(
            Collection<VkAttachmentReference2> colorAttachments)
    {
        this.colorAttachments = colorAttachments;
    }

    public Collection<VkAttachmentReference2> getResolveAttachments()
    {
        return resolveAttachments;
    }

    public void setResolveAttachments(
            Collection<VkAttachmentReference2> resolveAttachments)
    {
        this.resolveAttachments = resolveAttachments;
    }

    public VkAttachmentReference2 getDepthStencilAttachment()
    {
        return depthStencilAttachment;
    }

    public void setDepthStencilAttachment(
            VkAttachmentReference2 depthStencilAttachment)
    {
        this.depthStencilAttachment = depthStencilAttachment;
    }

    public int[] getPreserveAttachments()
    {
        return preserveAttachments;
    }

    public void setPreserveAttachments(int[] preserveAttachments)
    {
        this.preserveAttachments = preserveAttachments;
    }
}
