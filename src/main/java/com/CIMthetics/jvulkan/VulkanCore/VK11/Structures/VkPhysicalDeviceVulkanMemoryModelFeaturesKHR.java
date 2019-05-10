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
package com.CIMthetics.jvulkan.VulkanCore.VK11.Structures;

import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkPhysicalDeviceVulkanMemoryModelFeaturesKHR extends VulkanCreateInfoStructure
{
    private boolean                     vulkanMemoryModel;
    private boolean                     vulkanMemoryModelDeviceScope;
    private boolean                     vulkanMemoryModelAvailabilityVisibilityChains;

    public VkPhysicalDeviceVulkanMemoryModelFeaturesKHR()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_MEMORY_MODEL_FEATURES_KHR);
    }

    public boolean isVulkanMemoryModel()
    {
        return vulkanMemoryModel;
    }

    public void setVulkanMemoryModel(boolean vulkanMemoryModel)
    {
        this.vulkanMemoryModel = vulkanMemoryModel;
    }

    public boolean isVulkanMemoryModelDeviceScope()
    {
        return vulkanMemoryModelDeviceScope;
    }

    public void setVulkanMemoryModelDeviceScope(
            boolean vulkanMemoryModelDeviceScope)
    {
        this.vulkanMemoryModelDeviceScope = vulkanMemoryModelDeviceScope;
    }

    public boolean isVulkanMemoryModelAvailabilityVisibilityChains()
    {
        return vulkanMemoryModelAvailabilityVisibilityChains;
    }

    public void setVulkanMemoryModelAvailabilityVisibilityChains(
            boolean vulkanMemoryModelAvailabilityVisibilityChains)
    {
        this.vulkanMemoryModelAvailabilityVisibilityChains = vulkanMemoryModelAvailabilityVisibilityChains;
    }
}
