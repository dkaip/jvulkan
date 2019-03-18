package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkPhysicalDeviceASTCDecodeFeaturesEXT extends VulkanCreateInfoStructure
{
    private long                pNext;
    private boolean             decodeModeSharedExponent;

    public VkPhysicalDeviceASTCDecodeFeaturesEXT()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ASTC_DECODE_FEATURES_EXT);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public boolean isDecodeModeSharedExponent()
    {
        return decodeModeSharedExponent;
    }

    public void setDecodeModeSharedExponent(boolean decodeModeSharedExponent)
    {
        this.decodeModeSharedExponent = decodeModeSharedExponent;
    }
}
