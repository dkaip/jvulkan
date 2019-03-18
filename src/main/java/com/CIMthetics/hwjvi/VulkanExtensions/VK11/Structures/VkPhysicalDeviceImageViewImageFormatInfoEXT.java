package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkImageViewType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkPhysicalDeviceImageViewImageFormatInfoEXT extends VulkanCreateInfoStructure
{
    private long            pNext;
    private VkImageViewType imageViewType;

    public VkPhysicalDeviceImageViewImageFormatInfoEXT()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_VIEW_IMAGE_FORMAT_INFO_EXT);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public VkImageViewType getImageViewType()
    {
        return imageViewType;
    }

    public void setImageViewType(VkImageViewType imageViewType)
    {
        this.imageViewType = imageViewType;
    }

}
