package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos;

import java.util.EnumSet;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkCullModeFlagBits;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkFrontFace;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkPipelineRasterizationStateCreateFlagBits;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkPolygonMode;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;

public class VkPipelineRasterizationStateCreateInfo extends VulkanCreateInfoStructure
{
    private long                                            pNext;
    private EnumSet<VkPipelineRasterizationStateCreateFlagBits>  flags = EnumSet.noneOf(VkPipelineRasterizationStateCreateFlagBits.class);
    private boolean                                         depthClampEnable;
    private boolean                                         rasterizerDiscardEnable;
    private VkPolygonMode                                   polygonMode;
    private EnumSet<VkCullModeFlagBits>                     cullMode;
    private VkFrontFace                                     frontFace;
    private boolean                                         depthBiasEnable;
    private float                                           depthBiasConstantFactor;
    private float                                           depthBiasClamp;
    private float                                           depthBiasSlopeFactor;
    private float                                           lineWidth;

    public VkPipelineRasterizationStateCreateInfo()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_STATE_CREATE_INFO);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public EnumSet<VkPipelineRasterizationStateCreateFlagBits> getFlags()
    {
        return flags;
    }

    public void setFlags(EnumSet<VkPipelineRasterizationStateCreateFlagBits> flags)
    {
        this.flags = flags;
    }

    public boolean isDepthClampEnable()
    {
        return depthClampEnable;
    }

    public void setDepthClampEnable(boolean depthClampEnable)
    {
        this.depthClampEnable = depthClampEnable;
    }

    public boolean isRasterizerDiscardEnable()
    {
        return rasterizerDiscardEnable;
    }

    public void setRasterizerDiscardEnable(boolean rasterizerDiscardEnable)
    {
        this.rasterizerDiscardEnable = rasterizerDiscardEnable;
    }

    public VkPolygonMode getPolygonMode()
    {
        return polygonMode;
    }

    public void setPolygonMode(VkPolygonMode polygonMode)
    {
        this.polygonMode = polygonMode;
    }

    public EnumSet<VkCullModeFlagBits> getCullMode()
    {
        return cullMode;
    }

    public void setCullMode(EnumSet<VkCullModeFlagBits> cullMode)
    {
        this.cullMode = cullMode;
    }

    public VkFrontFace getFrontFace()
    {
        return frontFace;
    }

    public void setFrontFace(VkFrontFace frontFace)
    {
        this.frontFace = frontFace;
    }

    public boolean isDepthBiasEnable()
    {
        return depthBiasEnable;
    }

    public void setDepthBiasEnable(boolean depthBiasEnable)
    {
        this.depthBiasEnable = depthBiasEnable;
    }

    public float getDepthBiasConstantFactor()
    {
        return depthBiasConstantFactor;
    }

    public void setDepthBiasConstantFactor(float depthBiasConstantFactor)
    {
        this.depthBiasConstantFactor = depthBiasConstantFactor;
    }

    public float getDepthBiasClamp()
    {
        return depthBiasClamp;
    }

    public void setDepthBiasClamp(float depthBiasClamp)
    {
        this.depthBiasClamp = depthBiasClamp;
    }

    public float getDepthBiasSlopeFactor()
    {
        return depthBiasSlopeFactor;
    }

    public void setDepthBiasSlopeFactor(float depthBiasSlopeFactor)
    {
        this.depthBiasSlopeFactor = depthBiasSlopeFactor;
    }

    public float getLineWidth()
    {
        return lineWidth;
    }

    public void setLineWidth(float lineWidth)
    {
        this.lineWidth = lineWidth;
    }
}
