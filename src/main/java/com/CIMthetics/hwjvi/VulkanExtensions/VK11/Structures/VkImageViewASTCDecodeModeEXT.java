package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkFormat;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkImageViewASTCDecodeModeEXT extends VulkanCreateInfoStructure
{
    private long                pNext;
    private VkFormat            decodeMode;

    public VkImageViewASTCDecodeModeEXT()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_IMAGE_VIEW_ASTC_DECODE_MODE_EXT);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public VkFormat getDecodeMode()
    {
        return decodeMode;
    }

    public void setDecodeMode(VkFormat decodeMode)
    {
        this.decodeMode = decodeMode;
    }
}
