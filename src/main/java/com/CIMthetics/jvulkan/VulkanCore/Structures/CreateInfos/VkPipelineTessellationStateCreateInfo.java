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

import java.util.EnumSet;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkPipelineTessellationStateCreateFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;

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
<code>patchControlPoints</code> number of control points per patch.
</li>
</ul>
 * @author Douglas Kaip
 *
 */
public class VkPipelineTessellationStateCreateInfo extends VulkanCreateInfoStructure
{
    private EnumSet<VkPipelineTessellationStateCreateFlagBits>  flags = EnumSet.noneOf(VkPipelineTessellationStateCreateFlagBits.class);
    private int                                                 patchControlPoints;

    public VkPipelineTessellationStateCreateInfo()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_TESSELLATION_STATE_CREATE_INFO);
    }

    public EnumSet<VkPipelineTessellationStateCreateFlagBits> getFlags()
    {
        return flags;
    }

    public void setFlags(EnumSet<VkPipelineTessellationStateCreateFlagBits> flags)
    {
        this.flags = flags;
    }

    public int getPatchControlPoints()
    {
        return patchControlPoints;
    }

    public void setPatchControlPoints(int patchControlPoints)
    {
        this.patchControlPoints = patchControlPoints;
    }
    
}
