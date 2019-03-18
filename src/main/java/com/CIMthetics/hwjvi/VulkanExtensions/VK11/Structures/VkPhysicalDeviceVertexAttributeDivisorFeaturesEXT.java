package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT extends VulkanCreateInfoStructure
{
    private long    pNext;
    private boolean vertexAttributeInstanceRateDivisor;
    private boolean vertexAttributeInstanceRateZeroDivisor;

    public VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_FEATURES_EXT);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public boolean isVertexAttributeInstanceRateDivisor()
    {
        return vertexAttributeInstanceRateDivisor;
    }

    public void setVertexAttributeInstanceRateDivisor(
            boolean vertexAttributeInstanceRateDivisor)
    {
        this.vertexAttributeInstanceRateDivisor = vertexAttributeInstanceRateDivisor;
    }

    public boolean isVertexAttributeInstanceRateZeroDivisor()
    {
        return vertexAttributeInstanceRateZeroDivisor;
    }

    public void setVertexAttributeInstanceRateZeroDivisor(
            boolean vertexAttributeInstanceRateZeroDivisor)
    {
        this.vertexAttributeInstanceRateZeroDivisor = vertexAttributeInstanceRateZeroDivisor;
    }
}
