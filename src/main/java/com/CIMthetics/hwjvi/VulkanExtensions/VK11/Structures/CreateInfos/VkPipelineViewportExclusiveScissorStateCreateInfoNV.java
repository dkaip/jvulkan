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
package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures.CreateInfos;

import java.util.Collection;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.VkRect2D;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkPipelineViewportExclusiveScissorStateCreateInfoNV extends VulkanCreateInfoStructure
{
    private long                    pNext;
    private Collection<VkRect2D>    exclusiveScissors;
    
    public VkPipelineViewportExclusiveScissorStateCreateInfoNV()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_EXCLUSIVE_SCISSOR_STATE_CREATE_INFO_NV);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public Collection<VkRect2D> getExclusiveScissors()
    {
        return exclusiveScissors;
    }

    public void setExclusiveScissors(Collection<VkRect2D> exclusiveScissors)
    {
        this.exclusiveScissors = exclusiveScissors;
    }
}
