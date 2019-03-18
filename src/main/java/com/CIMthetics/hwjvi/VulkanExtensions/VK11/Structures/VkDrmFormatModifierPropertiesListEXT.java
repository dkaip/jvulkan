package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures;

import java.util.LinkedList;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkDrmFormatModifierPropertiesListEXT extends VulkanCreateInfoStructure
{
    private long                                            pNext;
    private int                                             drmFormatModifierCount;
    private LinkedList<VkDrmFormatModifierPropertiesEXT>    drmFormatModifierProperties = new LinkedList<VkDrmFormatModifierPropertiesEXT>();

    
    public VkDrmFormatModifierPropertiesListEXT()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_DRM_FORMAT_MODIFIER_PROPERTIES_LIST_EXT);
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

    public LinkedList<VkDrmFormatModifierPropertiesEXT> getDrmFormatModifierProperties()
    {
        return drmFormatModifierProperties;
    }

    public void setDrmFormatModifierProperties(
            LinkedList<VkDrmFormatModifierPropertiesEXT> drmFormatModifierProperties)
    {
        this.drmFormatModifierProperties = drmFormatModifierProperties;
    }

}
