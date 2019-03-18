package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkPhysicalDeviceVulkanMemoryModelFeaturesKHR extends VulkanCreateInfoStructure
{
    private long                        pNext;
    private boolean                     vulkanMemoryModel;
    private boolean                     vulkanMemoryModelDeviceScope;
    private boolean                     vulkanMemoryModelAvailabilityVisibilityChains;

    public VkPhysicalDeviceVulkanMemoryModelFeaturesKHR()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_MEMORY_MODEL_FEATURES_KHR);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
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
