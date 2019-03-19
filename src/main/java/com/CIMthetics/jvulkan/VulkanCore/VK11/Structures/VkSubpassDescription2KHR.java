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

import java.util.BitSet;
import java.util.Collection;
import java.util.EnumSet;

import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkPipelineBindPoint;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkSubpassDescriptionFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VkAttachmentReference2KHR;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkSubpassDescription2KHR extends VulkanCreateInfoStructure
{
    private long                                    pNext;
    private EnumSet<VkSubpassDescriptionFlagBits>   flags = EnumSet.noneOf(VkSubpassDescriptionFlagBits.class);
    private VkPipelineBindPoint                     pipelineBindPoint;
    private BitSet                                  viewMask = new BitSet(32); // The c++ variable is only 32 bits
    private Collection<VkAttachmentReference2KHR>   inputAttachments;
    private Collection<VkAttachmentReference2KHR>   colorAttachments;
    private Collection<VkAttachmentReference2KHR>   resolveAttachments;
    private VkAttachmentReference2KHR               depthStencilAttachment;
    private int[]                                   preserveAttachments;
    
    public VkSubpassDescription2KHR()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_SUBPASS_DESCRIPTION_2_KHR);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
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
    public Collection<VkAttachmentReference2KHR> getInputAttachments()
    {
        return inputAttachments;
    }

    public void setInputAttachments(
            Collection<VkAttachmentReference2KHR> inputAttachments)
    {
        this.inputAttachments = inputAttachments;
    }

    public Collection<VkAttachmentReference2KHR> getColorAttachments()
    {
        return colorAttachments;
    }

    public void setColorAttachments(
            Collection<VkAttachmentReference2KHR> colorAttachments)
    {
        this.colorAttachments = colorAttachments;
    }

    public Collection<VkAttachmentReference2KHR> getResolveAttachments()
    {
        return resolveAttachments;
    }

    public void setResolveAttachments(
            Collection<VkAttachmentReference2KHR> resolveAttachments)
    {
        this.resolveAttachments = resolveAttachments;
    }

    public VkAttachmentReference2KHR getDepthStencilAttachment()
    {
        return depthStencilAttachment;
    }

    public void setDepthStencilAttachment(
            VkAttachmentReference2KHR depthStencilAttachment)
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
