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
