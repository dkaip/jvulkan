package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures.CreateInfos;

import java.util.Collection;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;
import com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures.VkShadingRatePaletteNV;

public class VkPipelineViewportShadingRateImageStateCreateInfoNV extends VulkanCreateInfoStructure
{
    private long                                pNext;
    private boolean                             shadingRateImageEnable;
    private Collection<VkShadingRatePaletteNV>  shadingRatePalettes;

    public VkPipelineViewportShadingRateImageStateCreateInfoNV()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_SHADING_RATE_IMAGE_STATE_CREATE_INFO_NV);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public boolean isShadingRateImageEnable()
    {
        return shadingRateImageEnable;
    }

    public void setShadingRateImageEnable(boolean shadingRateImageEnable)
    {
        this.shadingRateImageEnable = shadingRateImageEnable;
    }

    public Collection<VkShadingRatePaletteNV> getShadingRatePalettes()
    {
        return shadingRatePalettes;
    }

    public void setShadingRatePalettes(
            Collection<VkShadingRatePaletteNV> shadingRatePalettes)
    {
        this.shadingRatePalettes = shadingRatePalettes;
    }
}
