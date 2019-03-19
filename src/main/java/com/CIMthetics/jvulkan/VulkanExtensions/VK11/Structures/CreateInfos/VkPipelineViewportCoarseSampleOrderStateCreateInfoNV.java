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
package com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.CreateInfos;

import java.util.Collection;

import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Enums.VkCoarseSampleOrderTypeNV;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkCoarseSampleOrderCustomNV;

public class VkPipelineViewportCoarseSampleOrderStateCreateInfoNV extends VulkanCreateInfoStructure
{
    private long                                    pNext;
    private VkCoarseSampleOrderTypeNV               sampleOrderType;
    private Collection<VkCoarseSampleOrderCustomNV> customSampleOrders;

    public VkPipelineViewportCoarseSampleOrderStateCreateInfoNV()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_COARSE_SAMPLE_ORDER_STATE_CREATE_INFO_NV);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public VkCoarseSampleOrderTypeNV getSampleOrderType()
    {
        return sampleOrderType;
    }

    public void setSampleOrderType(VkCoarseSampleOrderTypeNV sampleOrderType)
    {
        this.sampleOrderType = sampleOrderType;
    }

    public Collection<VkCoarseSampleOrderCustomNV> getCustomSampleOrders()
    {
        return customSampleOrders;
    }

    public void setCustomSampleOrders(
            Collection<VkCoarseSampleOrderCustomNV> customSampleOrders)
    {
        this.customSampleOrders = customSampleOrders;
    }
}