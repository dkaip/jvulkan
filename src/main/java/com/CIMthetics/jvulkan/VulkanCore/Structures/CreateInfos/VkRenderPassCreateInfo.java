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

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkRenderPassCreateFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkAttachmentDescription;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkSubpassDependency;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkSubpassDescription;

public class VkRenderPassCreateInfo extends VulkanCreateInfoStructure
{
    private EnumSet<VkRenderPassCreateFlagBits> flags = EnumSet.noneOf(VkRenderPassCreateFlagBits.class);
    private Collection<VkAttachmentDescription> attachments;
    private Collection<VkSubpassDescription>    subpasses;
    private Collection<VkSubpassDependency>     dependencies;

    public VkRenderPassCreateInfo()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO);
    }

    public EnumSet<VkRenderPassCreateFlagBits> getFlags()
    {
        return flags;
    }

    public void setFlags(EnumSet<VkRenderPassCreateFlagBits> flags)
    {
        this.flags = flags;
    }

    public Collection<VkAttachmentDescription> getAttachments()
    {
        return attachments;
    }

    public void setAttachments(Collection<VkAttachmentDescription> attachments)
    {
        this.attachments = attachments;
    }

    public Collection<VkSubpassDescription> getSubpasses()
    {
        return subpasses;
    }

    public void setSubpasses(Collection<VkSubpassDescription> subpasses)
    {
        this.subpasses = subpasses;
    }

    public Collection<VkSubpassDependency> getDependencies()
    {
        return dependencies;
    }

    public void setDependencies(Collection<VkSubpassDependency> dependencies)
    {
        this.dependencies = dependencies;
    }

}
