package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures;

import java.util.Collection;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;
import com.CIMthetics.hwjvi.VulkanExtensions.VK11.Handles.VkAccelerationStructureNV;

public class VkWriteDescriptorSetAccelerationStructureNV extends VulkanCreateInfoStructure
{
    private long                                    pNext;
    private Collection<VkAccelerationStructureNV>  accelerationStructures;

    public VkWriteDescriptorSetAccelerationStructureNV()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_ACCELERATION_STRUCTURE_NV);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public Collection<VkAccelerationStructureNV> getAccelerationStructures()
    {
        return accelerationStructures;
    }

    public void setAccelerationStructures(
            Collection<VkAccelerationStructureNV> accelerationStructures)
    {
        this.accelerationStructures = accelerationStructures;
    }
}
