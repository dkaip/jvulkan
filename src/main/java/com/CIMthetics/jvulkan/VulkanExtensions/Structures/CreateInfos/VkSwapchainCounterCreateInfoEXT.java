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
package com.CIMthetics.jvulkan.VulkanExtensions.Structures.CreateInfos;

import java.util.EnumSet;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VulkanCreateInfoStructure;
import com.CIMthetics.jvulkan.VulkanExtensions.Enums.VkSurfaceCounterFlagBitsEXT;

public class VkSwapchainCounterCreateInfoEXT extends VulkanCreateInfoStructure
{
    private EnumSet<VkSurfaceCounterFlagBitsEXT>    surfaceCounters;

    public VkSwapchainCounterCreateInfoEXT()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_SWAPCHAIN_COUNTER_CREATE_INFO_EXT);
    }

    public EnumSet<VkSurfaceCounterFlagBitsEXT> getSurfaceCounters()
    {
        return surfaceCounters;
    }

    public void setSurfaceCounters(
            EnumSet<VkSurfaceCounterFlagBitsEXT> surfaceCounters)
    {
        this.surfaceCounters = surfaceCounters;
    }

}
