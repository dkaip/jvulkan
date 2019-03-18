package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures;

import java.util.EnumSet;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkShaderStageFlagBits;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkPhysicalDeviceCooperativeMatrixPropertiesNV extends VulkanCreateInfoStructure
{
    private long    pNext;
    private EnumSet<VkShaderStageFlagBits>  cooperativeMatrixSupportedStages = EnumSet.noneOf(VkShaderStageFlagBits.class);

    public VkPhysicalDeviceCooperativeMatrixPropertiesNV()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COOPERATIVE_MATRIX_PROPERTIES_NV);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public EnumSet<VkShaderStageFlagBits> getCooperativeMatrixSupportedStages()
    {
        return cooperativeMatrixSupportedStages;
    }

    public void setCooperativeMatrixSupportedStages(
            EnumSet<VkShaderStageFlagBits> cooperativeMatrixSupportedStages)
    {
        this.cooperativeMatrixSupportedStages = cooperativeMatrixSupportedStages;
    }

}
