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

import java.util.EnumSet;

import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkAttachmentDescriptionFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkAttachmentLoadOp;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkAttachmentStoreOp;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkFormat;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkImageLayout;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkSampleCountFlagBits;

public class VkAttachmentDescription
{
    private EnumSet<VkAttachmentDescriptionFlagBits>    flags = EnumSet.noneOf(VkAttachmentDescriptionFlagBits.class);
    private VkFormat                        format;
    private VkSampleCountFlagBits           samples;
    private VkAttachmentLoadOp              loadOp;
    private VkAttachmentStoreOp             storeOp;
    private VkAttachmentLoadOp              stencilLoadOp;
    private VkAttachmentStoreOp             stencilStoreOp;
    private VkImageLayout                   initialLayout;
    private VkImageLayout                   finalLayout;
    
    public EnumSet<VkAttachmentDescriptionFlagBits> getFlags()
    {
        return flags;
    }
    
    public void setFlags(EnumSet<VkAttachmentDescriptionFlagBits> flags)
    {
        this.flags = flags;
    }
    
    public VkFormat getFormat()
    {
        return format;
    }
    
    public void setFormat(VkFormat format)
    {
        this.format = format;
    }
    
    public VkSampleCountFlagBits getSamples()
    {
        return samples;
    }
    
    public void setSamples(VkSampleCountFlagBits samples)
    {
        this.samples = samples;
    }
    
    public VkAttachmentLoadOp getLoadOp()
    {
        return loadOp;
    }
    
    public void setLoadOp(VkAttachmentLoadOp loadOp)
    {
        this.loadOp = loadOp;
    }
    
    public VkAttachmentStoreOp getStoreOp()
    {
        return storeOp;
    }
    
    public void setStoreOp(VkAttachmentStoreOp storeOp)
    {
        this.storeOp = storeOp;
    }
    
    public VkAttachmentLoadOp getStencilLoadOp()
    {
        return stencilLoadOp;
    }
    
    public void setStencilLoadOp(VkAttachmentLoadOp stencilLoadOp)
    {
        this.stencilLoadOp = stencilLoadOp;
    }
    
    public VkAttachmentStoreOp getStencilStoreOp()
    {
        return stencilStoreOp;
    }
    
    public void setStencilStoreOp(VkAttachmentStoreOp stencilStoreOp)
    {
        this.stencilStoreOp = stencilStoreOp;
    }
    
    public VkImageLayout getInitialLayout()
    {
        return initialLayout;
    }
    
    public void setInitialLayout(VkImageLayout initialLayout)
    {
        this.initialLayout = initialLayout;
    }
    
    public VkImageLayout getFinalLayout()
    {
        return finalLayout;
    }
    
    public void setFinalLayout(VkImageLayout finalLayout)
    {
        this.finalLayout = finalLayout;
    }
}
