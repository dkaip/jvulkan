package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos;

import java.util.Collection;
import java.util.EnumSet;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkDynamicState;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkPipelineDynamicStateCreateFlagBits;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;

public class VkPipelineDynamicStateCreateInfo extends VulkanCreateInfoStructure
{
    private long                                            pNext;
    private EnumSet<VkPipelineDynamicStateCreateFlagBits>   flags = EnumSet.noneOf(VkPipelineDynamicStateCreateFlagBits.class);
    private Collection<VkDynamicState>                      dynamicStates;

    public VkPipelineDynamicStateCreateInfo()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_DYNAMIC_STATE_CREATE_INFO);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public EnumSet<VkPipelineDynamicStateCreateFlagBits> getFlags()
    {
        return flags;
    }

    public void setFlags(EnumSet<VkPipelineDynamicStateCreateFlagBits> flags)
    {
        this.flags = flags;
    }

    public Collection<VkDynamicState> getDynamicStates()
    {
        return dynamicStates;
    }

    public void setDynamicStates(Collection<VkDynamicState> dynamicStates)
    {
        this.dynamicStates = dynamicStates;
    }
    
}
