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

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkFramebufferCreateFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Handles.VkImageView;
import com.CIMthetics.jvulkan.VulkanCore.Handles.VkRenderPass;

public class VkFramebufferCreateInfo extends VulkanCreateInfoStructure
{
    private EnumSet<VkFramebufferCreateFlagBits>    flags = EnumSet.noneOf(VkFramebufferCreateFlagBits.class);
    private VkRenderPass                            renderPass;
    private Collection<VkImageView>                 attachments;
    private int                                     width;
    private int                                     height;
    private int                                     layers;

    public VkFramebufferCreateInfo()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_FRAMEBUFFER_CREATE_INFO);
    }

    public EnumSet<VkFramebufferCreateFlagBits> getFlags()
    {
        return flags;
    }

    public void setFlags(EnumSet<VkFramebufferCreateFlagBits> flags)
    {
        this.flags = flags;
    }

    public VkRenderPass getRenderPass()
    {
        return renderPass;
    }

    public void setRenderPass(VkRenderPass renderPass)
    {
        this.renderPass = renderPass;
    }

    public Collection<VkImageView> getAttachments()
    {
        return attachments;
    }

    public void setAttachments(Collection<VkImageView> attachments)
    {
        this.attachments = attachments;
    }

    public int getWidth()
    {
        return width;
    }

    public void setWidth(int width)
    {
        this.width = width;
    }

    public int getHeight()
    {
        return height;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    public int getLayers()
    {
        return layers;
    }

    public void setLayers(int layers)
    {
        this.layers = layers;
    }
    
}
