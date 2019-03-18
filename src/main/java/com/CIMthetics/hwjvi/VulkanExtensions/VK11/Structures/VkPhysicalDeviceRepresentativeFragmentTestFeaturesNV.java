package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV extends VulkanCreateInfoStructure
{
    private long    pNext;
    private boolean representativeFragmentTest;
    
    public VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_REPRESENTATIVE_FRAGMENT_TEST_FEATURES_NV);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public boolean isRepresentativeFragmentTest()
    {
        return representativeFragmentTest;
    }

    public void setRepresentativeFragmentTest(boolean representativeFragmentTest)
    {
        this.representativeFragmentTest = representativeFragmentTest;
    }
}
