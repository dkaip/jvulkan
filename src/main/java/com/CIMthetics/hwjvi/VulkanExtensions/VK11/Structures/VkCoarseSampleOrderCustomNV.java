package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures;

import java.util.Collection;

import com.CIMthetics.hwjvi.VulkanExtensions.VK11.Enums.VkShadingRatePaletteEntryNV;

public class VkCoarseSampleOrderCustomNV
{
    private VkShadingRatePaletteEntryNV             shadingRate;
    private int                                     sampleCount;
    private Collection<VkCoarseSampleLocationNV>    sampleLocations;

    public VkShadingRatePaletteEntryNV getShadingRate()
    {
        return shadingRate;
    }
    
    public void setShadingRate(VkShadingRatePaletteEntryNV shadingRate)
    {
        this.shadingRate = shadingRate;
    }
    
    public int getSampleCount()
    {
        return sampleCount;
    }
    
    public void setSampleCount(int sampleCount)
    {
        this.sampleCount = sampleCount;
    }
    
    public Collection<VkCoarseSampleLocationNV> getSampleLocations()
    {
        return sampleLocations;
    }

    public void setSampleLocations(
            Collection<VkCoarseSampleLocationNV> sampleLocations)
    {
        this.sampleLocations = sampleLocations;
    }
}
