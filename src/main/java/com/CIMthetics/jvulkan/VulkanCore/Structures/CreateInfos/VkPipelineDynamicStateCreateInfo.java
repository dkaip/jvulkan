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

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkDynamicState;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkPipelineDynamicStateCreateFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;

public class VkPipelineDynamicStateCreateInfo extends VulkanCreateInfoStructure
{
    private EnumSet<VkPipelineDynamicStateCreateFlagBits>   flags = EnumSet.noneOf(VkPipelineDynamicStateCreateFlagBits.class);
    private Collection<VkDynamicState>                      dynamicStates;

    public VkPipelineDynamicStateCreateInfo()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_DYNAMIC_STATE_CREATE_INFO);
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
