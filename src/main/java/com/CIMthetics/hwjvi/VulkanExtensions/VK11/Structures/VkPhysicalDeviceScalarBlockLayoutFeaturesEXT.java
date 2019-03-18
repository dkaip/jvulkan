package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkPhysicalDeviceScalarBlockLayoutFeaturesEXT extends VulkanCreateInfoStructure
{
    private long    pNext;
    private boolean scalarBlockLayout;

    public VkPhysicalDeviceScalarBlockLayoutFeaturesEXT()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SCALAR_BLOCK_LAYOUT_FEATURES_EXT);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public boolean isScalarBlockLayout()
    {
        return scalarBlockLayout;
    }

    public void setScalarBlockLayout(boolean scalarBlockLayout)
    {
        this.scalarBlockLayout = scalarBlockLayout;
    }

}
