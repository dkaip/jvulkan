package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV extends VulkanCreateInfoStructure
{
    private long    pNext;
    private boolean dedicatedAllocationImageAliasing;

    public VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEDICATED_ALLOCATION_IMAGE_ALIASING_FEATURES_NV);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public boolean isDedicatedAllocationImageAliasing()
    {
        return dedicatedAllocationImageAliasing;
    }

    public void setDedicatedAllocationImageAliasing(
            boolean dedicatedAllocationImageAliasing)
    {
        this.dedicatedAllocationImageAliasing = dedicatedAllocationImageAliasing;
    }

}
