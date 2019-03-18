package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures.CreateInfos;

import java.util.LinkedList;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.VkSubresourceLayout;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkImageDrmFormatModifierExplicitCreateInfoEXT extends VulkanCreateInfoStructure
{
    private long                            pNext;
    private long                            drmFormatModifier;
    private int                             drmFormatModifierPlaneCount;
    private LinkedList<VkSubresourceLayout> planeLayouts = new LinkedList<VkSubresourceLayout>();
    
    public VkImageDrmFormatModifierExplicitCreateInfoEXT()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_EXPLICIT_CREATE_INFO_EXT);
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

    public int getDrmFormatModifierPlaneCount()
    {
        return drmFormatModifierPlaneCount;
    }

    public void setDrmFormatModifierPlaneCount(int drmFormatModifierPlaneCount)
    {
        this.drmFormatModifierPlaneCount = drmFormatModifierPlaneCount;
    }

    public LinkedList<VkSubresourceLayout> getPlaneLayouts()
    {
        return planeLayouts;
    }

    public void setPlaneLayouts(LinkedList<VkSubresourceLayout> planeLayouts)
    {
        this.planeLayouts = planeLayouts;
    }

}
