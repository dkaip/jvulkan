package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkPhysicalDeviceCornerSampledImageFeaturesNV extends VulkanCreateInfoStructure
{
    private long                pNext;
    private boolean             cornerSampledImage;
    
    public VkPhysicalDeviceCornerSampledImageFeaturesNV()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CORNER_SAMPLED_IMAGE_FEATURES_NV);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public boolean isCornerSampledImage()
    {
        return cornerSampledImage;
    }

    public void setCornerSampledImage(boolean cornerSampledImage)
    {
        this.cornerSampledImage = cornerSampledImage;
    }
}
