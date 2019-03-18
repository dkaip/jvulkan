package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkPhysicalDeviceComputeShaderDerivativesFeaturesNV extends VulkanCreateInfoStructure
{
    private long    pNext;
    private boolean computeDerivativeGroupQuads;
    private boolean computeDerivativeGroupLinear;

    public VkPhysicalDeviceComputeShaderDerivativesFeaturesNV()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COMPUTE_SHADER_DERIVATIVES_FEATURES_NV);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public boolean isComputeDerivativeGroupQuads()
    {
        return computeDerivativeGroupQuads;
    }

    public void setComputeDerivativeGroupQuads(boolean computeDerivativeGroupQuads)
    {
        this.computeDerivativeGroupQuads = computeDerivativeGroupQuads;
    }

    public boolean isComputeDerivativeGroupLinear()
    {
        return computeDerivativeGroupLinear;
    }

    public void setComputeDerivativeGroupLinear(
            boolean computeDerivativeGroupLinear)
    {
        this.computeDerivativeGroupLinear = computeDerivativeGroupLinear;
    }
}
