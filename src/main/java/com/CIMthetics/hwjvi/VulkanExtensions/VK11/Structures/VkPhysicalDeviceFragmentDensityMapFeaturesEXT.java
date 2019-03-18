package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkPhysicalDeviceFragmentDensityMapFeaturesEXT extends VulkanCreateInfoStructure
{
    private long    pNext;
    private boolean fragmentDensityMap;
    private boolean fragmentDensityMapDynamic;
    private boolean fragmentDensityMapNonSubsampledImages;

    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_FEATURES_EXT);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public boolean isFragmentDensityMap()
    {
        return fragmentDensityMap;
    }

    public void setFragmentDensityMap(boolean fragmentDensityMap)
    {
        this.fragmentDensityMap = fragmentDensityMap;
    }

    public boolean isFragmentDensityMapDynamic()
    {
        return fragmentDensityMapDynamic;
    }

    public void setFragmentDensityMapDynamic(boolean fragmentDensityMapDynamic)
    {
        this.fragmentDensityMapDynamic = fragmentDensityMapDynamic;
    }

    public boolean isFragmentDensityMapNonSubsampledImages()
    {
        return fragmentDensityMapNonSubsampledImages;
    }

    public void setFragmentDensityMapNonSubsampledImages(
            boolean fragmentDensityMapNonSubsampledImages)
    {
        this.fragmentDensityMapNonSubsampledImages = fragmentDensityMapNonSubsampledImages;
    }

}
