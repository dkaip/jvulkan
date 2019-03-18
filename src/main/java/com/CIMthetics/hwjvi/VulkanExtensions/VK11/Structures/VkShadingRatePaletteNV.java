package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures;

import java.util.Collection;

import com.CIMthetics.hwjvi.VulkanExtensions.VK11.Enums.VkShadingRatePaletteEntryNV;

public class VkShadingRatePaletteNV
{
    private Collection<VkShadingRatePaletteEntryNV> shadingRatePaletteEntries;

    public Collection<VkShadingRatePaletteEntryNV> getShadingRatePaletteEntries()
    {
        return shadingRatePaletteEntries;
    }

    public void setShadingRatePaletteEntries(
            Collection<VkShadingRatePaletteEntryNV> shadingRatePaletteEntries)
    {
        this.shadingRatePaletteEntries = shadingRatePaletteEntries;
    }
}
