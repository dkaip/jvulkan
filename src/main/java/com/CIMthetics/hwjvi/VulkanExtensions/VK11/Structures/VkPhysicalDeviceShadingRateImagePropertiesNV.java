package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.VkExtent2D;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkPhysicalDeviceShadingRateImagePropertiesNV extends VulkanCreateInfoStructure
{
    private long        pNext;
    private VkExtent2D  shadingRateTexelSize;
    private int         shadingRatePaletteSize;
    private int         shadingRateMaxCoarseSamples;

    public VkPhysicalDeviceShadingRateImagePropertiesNV()
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

    public VkExtent2D getShadingRateTexelSize()
    {
        return shadingRateTexelSize;
    }

    public void setShadingRateTexelSize(VkExtent2D shadingRateTexelSize)
    {
        this.shadingRateTexelSize = shadingRateTexelSize;
    }

    public int getShadingRatePaletteSize()
    {
        return shadingRatePaletteSize;
    }

    public void setShadingRatePaletteSize(int shadingRatePaletteSize)
    {
        this.shadingRatePaletteSize = shadingRatePaletteSize;
    }

    public int getShadingRateMaxCoarseSamples()
    {
        return shadingRateMaxCoarseSamples;
    }

    public void setShadingRateMaxCoarseSamples(int shadingRateMaxCoarseSamples)
    {
        this.shadingRateMaxCoarseSamples = shadingRateMaxCoarseSamples;
    }
}
