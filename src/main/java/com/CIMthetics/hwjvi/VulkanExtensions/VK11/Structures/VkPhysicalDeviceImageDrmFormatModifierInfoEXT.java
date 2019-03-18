package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkSharingMode;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkPhysicalDeviceImageDrmFormatModifierInfoEXT
        extends VulkanCreateInfoStructure
{
    private long            pNext;
    private long            drmFormatModifier;
    private VkSharingMode   sharingMode;
    private int             queueFamilyIndexCount;
    private int[]           queueFamilyIndices;

    public VkPhysicalDeviceImageDrmFormatModifierInfoEXT()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_DRM_FORMAT_MODIFIER_INFO_EXT);
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

    public VkSharingMode getSharingMode()
    {
        return sharingMode;
    }

    public void setSharingMode(VkSharingMode sharingMode)
    {
        this.sharingMode = sharingMode;
    }

    public int getQueueFamilyIndexCount()
    {
        return queueFamilyIndexCount;
    }

    public void setQueueFamilyIndexCount(int queueFamilyIndexCount)
    {
        this.queueFamilyIndexCount = queueFamilyIndexCount;
    }

    public int[] getQueueFamilyIndices()
    {
        return queueFamilyIndices;
    }

    public void setQueueFamilyIndices(int[] queueFamilyIndices)
    {
        this.queueFamilyIndices = queueFamilyIndices;
    }

}
