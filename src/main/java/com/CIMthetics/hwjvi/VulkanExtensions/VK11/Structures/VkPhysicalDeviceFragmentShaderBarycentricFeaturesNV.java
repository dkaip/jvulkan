package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV extends VulkanCreateInfoStructure
{
    private long    pNext;
    private boolean fragmentShaderBarycentric;
    
    public VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADER_BARYCENTRIC_FEATURES_NV);
    }

    public VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV(boolean fragmentShaderBarycentric)
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADER_BARYCENTRIC_FEATURES_NV);
        
        this.fragmentShaderBarycentric = fragmentShaderBarycentric;
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public boolean isFragmentShaderBarycentric()
    {
        return fragmentShaderBarycentric;
    }

    public void setFragmentShaderBarycentric(boolean fragmentShaderBarycentric)
    {
        this.fragmentShaderBarycentric = fragmentShaderBarycentric;
    }
}
