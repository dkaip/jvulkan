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

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkQueryPipelineStatisticFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkQueryPoolCreateFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkQueryType;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;

public class VkQueryPoolCreateInfo extends VulkanCreateInfoStructure
{
    private EnumSet<VkQueryPoolCreateFlagBits>          flags;
    private VkQueryType                                 queryType;
    private int                                         queryCount;
    private EnumSet<VkQueryPipelineStatisticFlagBits>   pipelineStatistics;

    public VkQueryPoolCreateInfo()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_QUERY_POOL_CREATE_INFO);
    }

    public EnumSet<VkQueryPoolCreateFlagBits> getFlags()
    {
        return flags;
    }

    public void setFlags(EnumSet<VkQueryPoolCreateFlagBits> flags)
    {
        this.flags = flags;
    }

    public VkQueryType getQueryType()
    {
        return queryType;
    }

    public void setQueryType(VkQueryType queryType)
    {
        this.queryType = queryType;
    }

    public int getQueryCount()
    {
        return queryCount;
    }

    public void setQueryCount(int queryCount)
    {
        this.queryCount = queryCount;
    }

    public EnumSet<VkQueryPipelineStatisticFlagBits> getPipelineStatistics()
    {
        return pipelineStatistics;
    }

    public void setPipelineStatistics(
            EnumSet<VkQueryPipelineStatisticFlagBits> pipelineStatistics)
    {
        this.pipelineStatistics = pipelineStatistics;
    }

}
