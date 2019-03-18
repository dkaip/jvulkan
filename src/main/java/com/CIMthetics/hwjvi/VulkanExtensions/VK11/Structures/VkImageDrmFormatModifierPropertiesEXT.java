package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkImageDrmFormatModifierPropertiesEXT extends VulkanCreateInfoStructure
{
    private long    pNext;
    private long    drmFormatModifier;
    
    public VkImageDrmFormatModifierPropertiesEXT()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_PROPERTIES_EXT);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public long getDrmFormatModifier()
    {
        return drmFormatModifier;
    }

    public void setDrmFormatModifier(long drmFormatModifier)
    {
        this.drmFormatModifier = drmFormatModifier;
    }

}
