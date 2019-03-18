package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkCommandBufferInheritanceConditionalRenderingInfoEXT extends VulkanCreateInfoStructure
{
    private long    pNext;
    private boolean conditionalRenderingEnable;

    public VkCommandBufferInheritanceConditionalRenderingInfoEXT()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_CONDITIONAL_RENDERING_INFO_EXT);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public boolean isConditionalRenderingEnable()
    {
        return conditionalRenderingEnable;
    }

    public void setConditionalRenderingEnable(boolean conditionalRenderingEnable)
    {
        this.conditionalRenderingEnable = conditionalRenderingEnable;
    }
}
