package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures.CreateInfos;

import java.util.Collection;
import java.util.EnumSet;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkPipelineCreateFlagBits;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Handles.VkPipeline;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Handles.VkPipelineLayout;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkRayTracingPipelineCreateInfoNV extends VulkanCreateInfoStructure
{
    private long                                            pNext;
    private EnumSet<VkPipelineCreateFlagBits>               flags = EnumSet.noneOf(VkPipelineCreateFlagBits.class);
    private Collection<VkPipelineShaderStageCreateInfo>     stages;
    private Collection<VkRayTracingShaderGroupCreateInfoNV> groups;
    private int                                             maxRecursionDepth;
    private VkPipelineLayout                                layout;
    private VkPipeline                                      basePipelineHandle;
    private int                                             basePipelineIndex;

    public VkRayTracingPipelineCreateInfoNV()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_RAY_TRACING_PIPELINE_CREATE_INFO_NV);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public EnumSet<VkPipelineCreateFlagBits> getFlags()
    {
        return flags;
    }

    public void setFlags(EnumSet<VkPipelineCreateFlagBits> flags)
    {
        this.flags = flags;
    }

    public Collection<VkPipelineShaderStageCreateInfo> getStages()
    {
        return stages;
    }

    public void setStages(Collection<VkPipelineShaderStageCreateInfo> stages)
    {
        this.stages = stages;
    }

    public Collection<VkRayTracingShaderGroupCreateInfoNV> getGroups()
    {
        return groups;
    }

    public void setGroups(Collection<VkRayTracingShaderGroupCreateInfoNV> groups)
    {
        this.groups = groups;
    }

    public int getMaxRecursionDepth()
    {
        return maxRecursionDepth;
    }

    public void setMaxRecursionDepth(int maxRecursionDepth)
    {
        this.maxRecursionDepth = maxRecursionDepth;
    }

    public VkPipelineLayout getLayout()
    {
        return layout;
    }

    public void setLayout(VkPipelineLayout layout)
    {
        this.layout = layout;
    }

    public VkPipeline getBasePipelineHandle()
    {
        return basePipelineHandle;
    }

    public void setBasePipelineHandle(VkPipeline basePipelineHandle)
    {
        this.basePipelineHandle = basePipelineHandle;
    }

    public int getBasePipelineIndex()
    {
        return basePipelineIndex;
    }

    public void setBasePipelineIndex(int basePipelineIndex)
    {
        this.basePipelineIndex = basePipelineIndex;
    }
}
