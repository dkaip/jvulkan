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

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkPipelineBindPoint;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkSubpassDescriptionFlagBits;

public class VkSubpassDescription
{
    private EnumSet<VkSubpassDescriptionFlagBits>  flags = EnumSet.noneOf(VkSubpassDescriptionFlagBits.class);
    private VkPipelineBindPoint                 pipelineBindPoint;
    private Collection<VkAttachmentReference>   inputAttachments;
    private Collection<VkAttachmentReference>   colorAttachments;
    private Collection<VkAttachmentReference>   resolveAttachments; // if this is not null or empty it must have the same number of elements as ColorAttachments
    private VkAttachmentReference               depthStencilAttachment;
    private int[]                               preserveAttachments;
    
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
    
    public Collection<VkAttachmentReference> getInputAttachments()
    {
        return inputAttachments;
    }
    
    public void setInputAttachments(
            Collection<VkAttachmentReference> inputAttachments)
    {
        this.inputAttachments = inputAttachments;
    }
    
    public Collection<VkAttachmentReference> getColorAttachments()
    {
        return colorAttachments;
    }
    public void setColorAttachments(
            Collection<VkAttachmentReference> colorAttachments)
    {
        this.colorAttachments = colorAttachments;
    }
    
    public Collection<VkAttachmentReference> getResolveAttachments()
    {
        return resolveAttachments;
    }
    
    public void setResolveAttachments(
            Collection<VkAttachmentReference> resolveAttachments)
    {
        this.resolveAttachments = resolveAttachments;
    }
    
    public VkAttachmentReference getDepthStencilAttachment()
    {
        return depthStencilAttachment;
    }
    
    public void setDepthStencilAttachment(
            VkAttachmentReference depthStencilAttachment)
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
