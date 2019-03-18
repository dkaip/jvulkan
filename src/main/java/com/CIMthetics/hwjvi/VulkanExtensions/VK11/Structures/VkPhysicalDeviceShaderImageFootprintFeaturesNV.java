package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkPhysicalDeviceShaderImageFootprintFeaturesNV extends VulkanCreateInfoStructure
{
    private long    pNext;
    private boolean imageFootprint;

    public VkPhysicalDeviceShaderImageFootprintFeaturesNV()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_IMAGE_FOOTPRINT_FEATURES_NV);
    }

    public VkPhysicalDeviceShaderImageFootprintFeaturesNV(boolean imageFootprint)
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_IMAGE_FOOTPRINT_FEATURES_NV);
        
        this.imageFootprint = imageFootprint;
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public boolean isImageFootprint()
    {
        return imageFootprint;
    }

    public void setImageFootprint(boolean imageFootprint)
    {
        this.imageFootprint = imageFootprint;
    }
}
