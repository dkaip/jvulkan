package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;
import com.CIMthetics.hwjvi.VulkanExtensions.VK11.Enums.VkAccelerationStructureMemoryRequirementsTypeNV;
import com.CIMthetics.hwjvi.VulkanExtensions.VK11.Handles.VkAccelerationStructureNV;

public class VkAccelerationStructureMemoryRequirementsInfoNV extends VulkanCreateInfoStructure
{
    private long                                            pNext;
    private VkAccelerationStructureMemoryRequirementsTypeNV type;
    private VkAccelerationStructureNV                       accelerationStructure;
    
    public VkAccelerationStructureMemoryRequirementsInfoNV()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_INFO_NV);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public VkAccelerationStructureMemoryRequirementsTypeNV getType()
    {
        return type;
    }

    public void setType(VkAccelerationStructureMemoryRequirementsTypeNV type)
    {
        this.type = type;
    }

    public VkAccelerationStructureNV getAccelerationStructure()
    {
        return accelerationStructure;
    }

    public void setAccelerationStructure(
            VkAccelerationStructureNV accelerationStructure)
    {
        this.accelerationStructure = accelerationStructure;
    }
}
