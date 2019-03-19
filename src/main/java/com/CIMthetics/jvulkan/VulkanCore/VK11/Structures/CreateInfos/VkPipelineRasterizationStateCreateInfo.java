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
package com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos;

import java.util.EnumSet;

import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkCullModeFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkFrontFace;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkPipelineRasterizationStateCreateFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkPolygonMode;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkStructureType;

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
