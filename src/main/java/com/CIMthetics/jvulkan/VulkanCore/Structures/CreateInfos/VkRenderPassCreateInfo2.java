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
package com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos;

import java.util.BitSet;
import java.util.Collection;
import java.util.EnumSet;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkRenderPassCreateFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkAttachmentDescription2;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkSubpassDependency2;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkSubpassDescription2;

public class VkRenderPassCreateInfo2 extends VulkanCreateInfoStructure
{
    private EnumSet<VkRenderPassCreateFlagBits>     flags = EnumSet.noneOf(VkRenderPassCreateFlagBits.class);
    private Collection<VkAttachmentDescription2> attachments;
    private Collection<VkSubpassDescription2>    subpasses;
    private Collection<VkSubpassDependency2>     dependencies;
    private Collection<BitSet>                      correlatedViewMasks;

    public VkRenderPassCreateInfo2()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO_2);
    }

    public EnumSet<VkRenderPassCreateFlagBits> getFlags()
    {
        return flags;
    }

    public void setFlags(EnumSet<VkRenderPassCreateFlagBits> flags)
    {
        this.flags = flags;
    }

    public Collection<VkAttachmentDescription2> getAttachments()
    {
        return attachments;
    }

    public void setAttachments(Collection<VkAttachmentDescription2> attachments)
    {
        this.attachments = attachments;
    }

    public Collection<VkSubpassDescription2> getSubpasses()
    {
        return subpasses;
    }

    public void setSubpasses(Collection<VkSubpassDescription2> subpasses)
    {
        this.subpasses = subpasses;
    }

    public Collection<VkSubpassDependency2> getDependencies()
    {
        return dependencies;
    }

    public void setDependencies(Collection<VkSubpassDependency2> dependencies)
    {
        this.dependencies = dependencies;
    }

    public Collection<BitSet> getCorrelatedViewMasks()
    {
        return correlatedViewMasks;
    }

    public void setCorrelatedViewMasks(Collection<BitSet> correlatedViewMasks)
    {
        this.correlatedViewMasks = correlatedViewMasks;
    }
}
