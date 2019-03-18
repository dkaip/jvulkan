package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Enums;

public enum VkAccelerationStructureMemoryRequirementsTypeNV
{
    VK_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_OBJECT_NV(0),
    VK_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_BUILD_SCRATCH_NV(1),
    VK_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_UPDATE_SCRATCH_NV(2),
    VK_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_BEGIN_RANGE_NV(VK_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_OBJECT_NV.valueOf()),
    VK_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_END_RANGE_NV(VK_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_UPDATE_SCRATCH_NV.valueOf()),
    VK_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_RANGE_SIZE_NV(VK_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_UPDATE_SCRATCH_NV.valueOf() - VK_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_OBJECT_NV.valueOf() + 1),
    VK_ACCELERATION_STRUCTURE_MEMORY_REQUIREMENTS_TYPE_MAX_ENUM_NV(0x7FFFFFFF);

    private int value;
    
    private VkAccelerationStructureMemoryRequirementsTypeNV(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
