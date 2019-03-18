package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.VkExtent2D;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkPhysicalDeviceFragmentDensityMapPropertiesEXT extends VulkanCreateInfoStructure
{
    private long        pNext;
    private VkExtent2D  minFragmentDensityTexelSize;
    private VkExtent2D  maxFragmentDensityTexelSize;
    private boolean     fragmentDensityInvocations;

    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_PROPERTIES_EXT);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public VkExtent2D getMinFragmentDensityTexelSize()
    {
        return minFragmentDensityTexelSize;
    }

    public void setMinFragmentDensityTexelSize(
            VkExtent2D minFragmentDensityTexelSize)
    {
        this.minFragmentDensityTexelSize = minFragmentDensityTexelSize;
    }

    public VkExtent2D getMaxFragmentDensityTexelSize()
    {
        return maxFragmentDensityTexelSize;
    }

    public void setMaxFragmentDensityTexelSize(
            VkExtent2D maxFragmentDensityTexelSize)
    {
        this.maxFragmentDensityTexelSize = maxFragmentDensityTexelSize;
    }

    public boolean isFragmentDensityInvocations()
    {
        return fragmentDensityInvocations;
    }

    public void setFragmentDensityInvocations(boolean fragmentDensityInvocations)
    {
        this.fragmentDensityInvocations = fragmentDensityInvocations;
    }

}
