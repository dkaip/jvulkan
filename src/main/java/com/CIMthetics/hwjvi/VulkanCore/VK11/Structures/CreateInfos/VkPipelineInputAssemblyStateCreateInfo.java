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
