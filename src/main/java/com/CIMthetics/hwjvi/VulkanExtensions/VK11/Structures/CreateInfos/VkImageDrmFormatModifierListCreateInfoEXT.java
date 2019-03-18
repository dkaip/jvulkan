package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures.CreateInfos;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkImageDrmFormatModifierListCreateInfoEXT extends VulkanCreateInfoStructure
{
    private long    pNext;
    private int     drmFormatModifierCount;
    private long[]  drmFormatModifiers;
    
    public VkImageDrmFormatModifierListCreateInfoEXT()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_LIST_CREATE_INFO_EXT);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public int getDrmFormatModifierCount()
    {
        return drmFormatModifierCount;
    }

    public void setDrmFormatModifierCount(int drmFormatModifierCount)
    {
        this.drmFormatModifierCount = drmFormatModifierCount;
    }

    public long[] getDrmFormatModifiers()
    {
        return drmFormatModifiers;
    }

    public void setDrmFormatModifiers(long[] drmFormatModifiers)
    {
        this.drmFormatModifiers = drmFormatModifiers;
    }

}
