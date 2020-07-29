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

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;

public class VkRenderPassMultiviewCreateInfo extends VulkanCreateInfoStructure
{
    private int[]   viewMasks;
    private int[]   viewOffsets;
    private int[]   correlationMasks;

    public VkRenderPassMultiviewCreateInfo()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_RENDER_PASS_MULTIVIEW_CREATE_INFO);
    }

    public int[] getViewMasks()
    {
        return viewMasks;
    }

    public void setViewMasks(int[] viewMasks)
    {
        this.viewMasks = viewMasks;
    }

    public int[] getViewOffsets()
    {
        return viewOffsets;
    }

    public void setViewOffsets(int[] viewOffsets)
    {
        this.viewOffsets = viewOffsets;
    }

    public int[] getCorrelationMasks()
    {
        return correlationMasks;
    }

    public void setCorrelationMasks(int[] correlationMasks)
    {
        this.correlationMasks = correlationMasks;
    }

}
