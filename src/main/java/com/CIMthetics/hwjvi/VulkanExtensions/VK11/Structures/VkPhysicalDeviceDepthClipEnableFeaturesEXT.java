package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkPhysicalDeviceDepthClipEnableFeaturesEXT extends VulkanCreateInfoStructure
{
    private long    pNext;
    private boolean depthClipEnable;
    
    public VkPhysicalDeviceDepthClipEnableFeaturesEXT()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_CLIP_ENABLE_FEATURES_EXT);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public boolean isDepthClipEnable()
    {
        return depthClipEnable;
    }

    public void setDepthClipEnable(boolean depthClipEnable)
    {
        this.depthClipEnable = depthClipEnable;
    }

}
