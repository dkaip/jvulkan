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

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkPipelineCacheCreateFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Handles.VkPipelineCache;

public class VkPipelineCacheCreateInfo extends VulkanCreateInfoStructure
{
    private EnumSet<VkPipelineCacheCreateFlagBits>  flags;
    private long                                    initialDataSize;
    private VkPipelineCache                         initialData;

    public VkPipelineCacheCreateInfo()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_CACHE_CREATE_INFO);
    }

    public EnumSet<VkPipelineCacheCreateFlagBits> getFlags()
    {
        return flags;
    }

    public void setFlags(EnumSet<VkPipelineCacheCreateFlagBits> flags)
    {
        this.flags = flags;
    }

    public long getInitialDataSize()
    {
        return initialDataSize;
    }

    public void setInitialDataSize(long initialDataSize)
    {
        this.initialDataSize = initialDataSize;
    }

    public VkPipelineCache getInitialData()
    {
        return initialData;
    }

    public void setInitialData(VkPipelineCache initialData)
    {
        this.initialData = initialData;
    }

}