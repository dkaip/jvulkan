package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos;

import java.util.EnumSet;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkPipelineInputAssemblyStateCreateFlagBits;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkPrimitiveTopology;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;

public class VkPipelineInputAssemblyStateCreateInfo extends VulkanCreateInfoStructure
{
    private long                                                pNext;
    private EnumSet<VkPipelineInputAssemblyStateCreateFlagBits> flags = EnumSet.noneOf(VkPipelineInputAssemblyStateCreateFlagBits.class);
    private VkPrimitiveTopology                                 topology;
    private boolean                                             primitiveRestartEnable;

    public VkPipelineInputAssemblyStateCreateInfo()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_INPUT_ASSEMBLY_STATE_CREATE_INFO);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public EnumSet<VkPipelineInputAssemblyStateCreateFlagBits> getFlags()
    {
        return flags;
    }

    public void setFlags(EnumSet<VkPipelineInputAssemblyStateCreateFlagBits> flags)
    {
        this.flags = flags;
    }

    public VkPrimitiveTopology getTopology()
    {
        return topology;
    }

    public void setTopology(VkPrimitiveTopology topology)
    {
        this.topology = topology;
    }

    public boolean isPrimitiveRestartEnable()
    {
        return primitiveRestartEnable;
    }

    public void setPrimitiveRestartEnable(boolean primitiveRestartEnable)
    {
        this.primitiveRestartEnable = primitiveRestartEnable;
    }
    
}
