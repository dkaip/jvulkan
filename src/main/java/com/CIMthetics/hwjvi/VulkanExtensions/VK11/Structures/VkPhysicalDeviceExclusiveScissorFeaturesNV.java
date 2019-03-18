package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkPhysicalDeviceExclusiveScissorFeaturesNV extends VulkanCreateInfoStructure
{
    private long    pNext;
    private boolean exclusiveScissor;
    
    public VkPhysicalDeviceExclusiveScissorFeaturesNV()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXCLUSIVE_SCISSOR_FEATURES_NV);
    }

    public VkPhysicalDeviceExclusiveScissorFeaturesNV(boolean exclusiveScissor)
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXCLUSIVE_SCISSOR_FEATURES_NV);
        
        this.exclusiveScissor = exclusiveScissor;
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public boolean isExclusiveScissor()
    {
        return exclusiveScissor;
    }

    public void setExclusiveScissor(boolean exclusiveScissor)
    {
        this.exclusiveScissor = exclusiveScissor;
    }
}
