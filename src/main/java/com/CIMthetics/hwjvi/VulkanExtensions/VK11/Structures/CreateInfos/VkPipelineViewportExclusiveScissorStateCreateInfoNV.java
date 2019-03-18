package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures.CreateInfos;

import java.util.Collection;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.VkRect2D;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkPipelineViewportExclusiveScissorStateCreateInfoNV extends VulkanCreateInfoStructure
{
    private long                    pNext;
    private Collection<VkRect2D>    exclusiveScissors;
    
    public VkPipelineViewportExclusiveScissorStateCreateInfoNV()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_EXCLUSIVE_SCISSOR_STATE_CREATE_INFO_NV);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public Collection<VkRect2D> getExclusiveScissors()
    {
        return exclusiveScissors;
    }

    public void setExclusiveScissors(Collection<VkRect2D> exclusiveScissors)
    {
        this.exclusiveScissors = exclusiveScissors;
    }
}
