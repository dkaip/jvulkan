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
package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos;

import java.util.BitSet;
import java.util.Collection;
import java.util.EnumSet;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkRenderPassCreateFlagBits;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.VkSubpassDependency2KHR;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.VkSubpassDescription2KHR;

public class VkRenderPassCreateInfo2KHR extends VulkanCreateInfoStructure
{
    private long                                    pNext;
    private EnumSet<VkRenderPassCreateFlagBits>     flags = EnumSet.noneOf(VkRenderPassCreateFlagBits.class);
    private Collection<VkAttachmentDescription2KHR> attachments;
    private Collection<VkSubpassDescription2KHR>    subpasses;
    private Collection<VkSubpassDependency2KHR>     dependencies;
    private Collection<BitSet>                      correlatedViewMasks;

    public VkRenderPassCreateInfo2KHR()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_RENDER_PASS_CREATE_INFO_2_KHR);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public EnumSet<VkRenderPassCreateFlagBits> getFlags()
    {
        return flags;
    }

    public void setFlags(EnumSet<VkRenderPassCreateFlagBits> flags)
    {
        this.flags = flags;
    }

    public Collection<VkAttachmentDescription2KHR> getAttachments()
    {
        return attachments;
    }

    public void setAttachments(Collection<VkAttachmentDescription2KHR> attachments)
    {
        this.attachments = attachments;
    }

    public Collection<VkSubpassDescription2KHR> getSubpasses()
    {
        return subpasses;
    }

    public void setSubpasses(Collection<VkSubpassDescription2KHR> subpasses)
    {
        this.subpasses = subpasses;
    }

    public Collection<VkSubpassDependency2KHR> getDependencies()
    {
        return dependencies;
    }

    public void setDependencies(Collection<VkSubpassDependency2KHR> dependencies)
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
