package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkPhysicalDeviceShadingRateImageFeaturesNV extends VulkanCreateInfoStructure
{
    private long    pNext;
    private boolean shadingRateImage;
    private boolean shadingRateCoarseSampleOrder;

    public VkPhysicalDeviceShadingRateImageFeaturesNV()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADING_RATE_IMAGE_PROPERTIES_NV);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public boolean isShadingRateImage()
    {
        return shadingRateImage;
    }

    public void setShadingRateImage(boolean shadingRateImage)
    {
        this.shadingRateImage = shadingRateImage;
    }

    public boolean isShadingRateCoarseSampleOrder()
    {
        return shadingRateCoarseSampleOrder;
    }

    public void setShadingRateCoarseSampleOrder(
            boolean shadingRateCoarseSampleOrder)
    {
        this.shadingRateCoarseSampleOrder = shadingRateCoarseSampleOrder;
    }
}
