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

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkLogicOp;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkPipelineColorBlendStateCreateFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkPipelineColorBlendAttachmentState;

/**
 * 
<ul>
<li>
    <code>pNext</code> is NULL or a pointer to an extension-specific structure.
</li>
<li>
    <code>flags</code> is reserved for future use.
</li>
<li>
    <code>logicOpEnable</code> controls whether to apply Logical Operations.
</li>
<li>
    <code>logicOp</code> selects which logical operation to apply.
</li>
<li>
    <code>attachmentCount</code> is the number of VkPipelineColorBlendAttachmentState elements in pAttachments. This value must equal the colorAttachmentCount for the subpass in which this pipeline is used.
</li>
<li>
    <code>attachments</code> is a pointer to array of per target attachment states.
</li>
<li>
    <code>blendConstants</code> is an array of four values used as the R, G, B, and A components of the blend constant that are used in blending, depending on the blend factor.
</li>
</ul>

 * @author Douglas Kaip
 *
 */
public class VkPipelineColorBlendStateCreateInfo extends VulkanCreateInfoStructure
{
    private EnumSet<VkPipelineColorBlendStateCreateFlagBits>    flags = EnumSet.noneOf(VkPipelineColorBlendStateCreateFlagBits.class);
    private boolean                                             logicOpEnable;
    private VkLogicOp                                           logicOp;
    private Collection<VkPipelineColorBlendAttachmentState>     attachments;
    private float[]                                             blendConstants = new float[4];

    public VkPipelineColorBlendStateCreateInfo()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_STATE_CREATE_INFO);
    }

    public EnumSet<VkPipelineColorBlendStateCreateFlagBits> getFlags()
    {
        return flags;
    }

    public void setFlags(EnumSet<VkPipelineColorBlendStateCreateFlagBits> flags)
    {
        this.flags = flags;
    }

    public boolean isLogicOpEnable()
    {
        return logicOpEnable;
    }

    public void setLogicOpEnable(boolean logicOpEnable)
    {
        this.logicOpEnable = logicOpEnable;
    }

    public VkLogicOp getLogicOp()
    {
        return logicOp;
    }

    public void setLogicOp(VkLogicOp logicOp)
    {
        this.logicOp = logicOp;
    }

    public Collection<VkPipelineColorBlendAttachmentState> getAttachments()
    {
        return attachments;
    }

    public void setAttachments(
            Collection<VkPipelineColorBlendAttachmentState> attachments)
    {
        this.attachments = attachments;
    }

    public float[] getBlendConstants()
    {
        return blendConstants;
    }

    public void setRedBlendConstant(float blendConstant)
    {
        blendConstants[0] = blendConstant;
    }
    
    public void setGreenBlendConstant(float blendConstant)
    {
        blendConstants[1] = blendConstant;
    }
    
    public void setBlueBlendConstant(float blendConstant)
    {
        blendConstants[2] = blendConstant;
    }
    
    public void setAlphaBlendConstant(float blendConstant)
    {
        blendConstants[3] = blendConstant;
    }
    
}
