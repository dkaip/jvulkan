package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures.CreateInfos;

import java.util.EnumSet;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkPipelineShaderStageCreateFlagBits;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkShaderStageFlagBits;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Handles.VkShaderModule;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.VkSpecializationInfo;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkPipelineShaderStageCreateInfo extends VulkanCreateInfoStructure
{
    private long                                            pNext;
    private EnumSet<VkPipelineShaderStageCreateFlagBits>    flags = EnumSet.noneOf(VkPipelineShaderStageCreateFlagBits.class);
    private VkShaderStageFlagBits                           stage;
    private VkShaderModule                                  module;
    private String                                          name;
    private VkSpecializationInfo                            specializationInfo;

    public VkPipelineShaderStageCreateInfo()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_SHADER_STAGE_CREATE_INFO);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public EnumSet<VkPipelineShaderStageCreateFlagBits> getFlags()
    {
        return flags;
    }

    public void setFlags(EnumSet<VkPipelineShaderStageCreateFlagBits> flags)
    {
        this.flags = flags;
    }

    public VkShaderStageFlagBits getStage()
    {
        return stage;
    }

    public void setStage(VkShaderStageFlagBits stage)
    {
        this.stage = stage;
    }

    public VkShaderModule getModule()
    {
        return module;
    }

    public void setModule(VkShaderModule module)
    {
        this.module = module;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public VkSpecializationInfo getSpecializationInfo()
    {
        return specializationInfo;
    }

    public void setSpecializationInfo(VkSpecializationInfo specializationInfo)
    {
        this.specializationInfo = specializationInfo;
    }
}
