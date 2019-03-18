package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkFilterCubicImageViewImageFormatPropertiesEXT extends VulkanCreateInfoStructure
{
    private long    pNext;
    private boolean filterCubic;
    private boolean filterCubicMinmax;

    public VkFilterCubicImageViewImageFormatPropertiesEXT()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_FILTER_CUBIC_IMAGE_VIEW_IMAGE_FORMAT_PROPERTIES_EXT);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public boolean isFilterCubic()
    {
        return filterCubic;
    }

    public void setFilterCubic(boolean filterCubic)
    {
        this.filterCubic = filterCubic;
    }

    public boolean isFilterCubicMinmax()
    {
        return filterCubicMinmax;
    }

    public void setFilterCubicMinmax(boolean filterCubicMinmax)
    {
        this.filterCubicMinmax = filterCubicMinmax;
    }

}
