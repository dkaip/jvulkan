/*
 * Copyright 2019-2020 Douglas Kaip
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
package com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos;

import java.util.Collection;
import java.util.EnumSet;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkPipelineCreateFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Handles.VkPipeline;
import com.CIMthetics.jvulkan.VulkanCore.Handles.VkPipelineLayout;
import com.CIMthetics.jvulkan.VulkanCore.Handles.VkRenderPass;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.CreateInfos.VkPipelineShaderStageCreateInfo;

/**
 * 
<ul>
<li>
<code>pNext</code> is <code>NULL</code> or a pointer to an extension-specific structure.
</li>

<li>
<code>flags</code> is a bitmask of <code>VkPipelineCreateFlagBits</code> specifying how the pipeline will be generated.
</li>

<li>
<code>stages</code> is a collection of type <code>VkPipelineShaderStageCreateInfo</code> describing the set of the shader stages to be included in the graphics pipeline.
</li>

<li>
<code>vertexInputState</code> is an instance of the <code>VkPipelineVertexInputStateCreateInfo</code> class.
</li>

<li>
<code>inputAssemblyState</code> is an instance of the <code>VkPipelineInputAssemblyStateCreateInfo</code> class which determines input assembly behavior, as described in Drawing Commands.
</li>

<li>
<code>tessellationState</code> is an instance of the <code>VkPipelineTessellationStateCreateInfo</code> class, and is ignored if the pipeline does not include a tessellation control shader stage and tessellation evaluation shader stage.
</li>

<li>
<code>viewportState</code> is an instance of the <code>VkPipelineViewportStateCreateInfo</code> class, and is ignored if the pipeline has rasterization disabled.
</li>

<li>
<code>rasterizationState</code> is an instance of the <code>VkPipelineRasterizationStateCreateInfo</code> class.
</li>

<li>
<code>multisampleState</code> is an instance of the <code>VkPipelineMultisampleStateCreateInfo</code>, and is ignored if the pipeline has rasterization disabled.
</li>

<li>
<code>depthStencilState</code> is an instance of the <code>VkPipelineDepthStencilStateCreateInfo</code> class, and is ignored if the pipeline has rasterization disabled or if the subpass of the render pass the pipeline is created against does not use a depth/stencil attachment.
</li>

<li>
<code>colorBlendState</code> is an instance of the <code>VkPipelineColorBlendStateCreateInfo</code> class, and is ignored if the pipeline has rasterization disabled or if the subpass of the render pass the pipeline is created against does not use any color attachments.
</li>

<li>
<code>dynamicState</code> is an instance of the <code>VkPipelineDynamicStateCreateInfo</code> and is used to indicate which properties of the pipeline state object are dynamic and can be changed independently of the pipeline state. This can be NULL, which means no state in the pipeline is considered dynamic.
</li>

<li>
<code>layout</code> is the description of binding locations used by both the pipeline and descriptor sets used with the pipeline.
</li>

<li>
<code>renderPass</code> is a handle to a render pass object describing the environment in which the pipeline will be used; the pipeline must only be used with an instance of any render pass compatible with the one provided. See Render Pass Compatibility for more information.
</li>

<li>
<code>subpass</code> is the index of the subpass in the render pass where this pipeline will be used.
</li>

<li>
<code>basePipelineHandle</code> is a pipeline to derive from.
</li>

<li>
<code>basePipelineIndex</code> is an index into the <code>createInfos</code> parameter to use as a pipeline to derive from.
</li>
</ul>
 * @author Douglas Kaip
 *
 */
public class VkGraphicsPipelineCreateInfo extends VulkanCreateInfoStructure
{
    private EnumSet<VkPipelineCreateFlagBits>           flags = EnumSet.noneOf(VkPipelineCreateFlagBits.class);
    private Collection<VkPipelineShaderStageCreateInfo> stages;
    private VkPipelineVertexInputStateCreateInfo        vertexInputState;
    private VkPipelineInputAssemblyStateCreateInfo      inputAssemblyState;
    private VkPipelineTessellationStateCreateInfo       tessellationState;
    private VkPipelineViewportStateCreateInfo           viewportState;
    private VkPipelineRasterizationStateCreateInfo      rasterizationState;
    private VkPipelineMultisampleStateCreateInfo        multisampleState;
    private VkPipelineDepthStencilStateCreateInfo       depthStencilState;
    private VkPipelineColorBlendStateCreateInfo         colorBlendState;
    private VkPipelineDynamicStateCreateInfo            dynamicState;
    private VkPipelineLayout                            layout;
    private VkRenderPass                                renderPass;
    private int                                         subpass;
    private VkPipeline                                  basePipelineHandle;
    private int                                         basePipelineIndex;

    public VkGraphicsPipelineCreateInfo()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_GRAPHICS_PIPELINE_CREATE_INFO);
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

    public VkPipelineVertexInputStateCreateInfo getVertexInputState()
    {
        return vertexInputState;
    }

    public void setVertexInputState(
            VkPipelineVertexInputStateCreateInfo vertexInputState)
    {
        this.vertexInputState = vertexInputState;
    }

    public VkPipelineInputAssemblyStateCreateInfo getInputAssemblyState()
    {
        return inputAssemblyState;
    }

    public void setInputAssemblyState(
            VkPipelineInputAssemblyStateCreateInfo inputAssemblyState)
    {
        this.inputAssemblyState = inputAssemblyState;
    }

    public VkPipelineTessellationStateCreateInfo getTessellationState()
    {
        return tessellationState;
    }

    public void setTessellationState(
            VkPipelineTessellationStateCreateInfo tessellationState)
    {
        this.tessellationState = tessellationState;
    }

    public VkPipelineViewportStateCreateInfo getViewportState()
    {
        return viewportState;
    }

    public void setViewportState(VkPipelineViewportStateCreateInfo viewportState)
    {
        this.viewportState = viewportState;
    }

    public VkPipelineRasterizationStateCreateInfo getRasterizationState()
    {
        return rasterizationState;
    }

    public void setRasterizationState(
            VkPipelineRasterizationStateCreateInfo rasterizationState)
    {
        this.rasterizationState = rasterizationState;
    }

    public VkPipelineMultisampleStateCreateInfo getMultisampleState()
    {
        return multisampleState;
    }

    public void setMultisampleState(
            VkPipelineMultisampleStateCreateInfo multisampleState)
    {
        this.multisampleState = multisampleState;
    }

    public VkPipelineDepthStencilStateCreateInfo getDepthStencilState()
    {
        return depthStencilState;
    }

    public void setDepthStencilState(
            VkPipelineDepthStencilStateCreateInfo depthStencilState)
    {
        this.depthStencilState = depthStencilState;
    }

    public VkPipelineColorBlendStateCreateInfo getColorBlendState()
    {
        return colorBlendState;
    }

    public void setColorBlendState(
            VkPipelineColorBlendStateCreateInfo colorBlendState)
    {
        this.colorBlendState = colorBlendState;
    }

    public VkPipelineDynamicStateCreateInfo getDynamicState()
    {
        return dynamicState;
    }

    public void setDynamicState(VkPipelineDynamicStateCreateInfo dynamicState)
    {
        this.dynamicState = dynamicState;
    }

    public VkPipelineLayout getLayout()
    {
        return layout;
    }

    public void setLayout(VkPipelineLayout layout)
    {
        this.layout = layout;
    }

    public VkRenderPass getRenderPass()
    {
        return renderPass;
    }

    public void setRenderPass(VkRenderPass renderPass)
    {
        this.renderPass = renderPass;
    }

    public int getSubpass()
    {
        return subpass;
    }

    public void setSubpass(int subpass)
    {
        this.subpass = subpass;
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
