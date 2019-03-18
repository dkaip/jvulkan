package com.CIMthetics.hwjvi.VulkanCore.VK11.Enums;

/**
 * 
 * @author Douglas Kaip
 *
 */
public enum VkInternalAllocationType
{
    VK_INTERNAL_ALLOCATION_TYPE_EXECUTABLE(0),
    VK_INTERNAL_ALLOCATION_TYPE_BEGIN_RANGE(VK_INTERNAL_ALLOCATION_TYPE_EXECUTABLE.valueOf()),
    VK_INTERNAL_ALLOCATION_TYPE_END_RANGE(VK_INTERNAL_ALLOCATION_TYPE_EXECUTABLE.valueOf()),
    VK_INTERNAL_ALLOCATION_TYPE_RANGE_SIZE((VK_INTERNAL_ALLOCATION_TYPE_EXECUTABLE.valueOf() - VK_INTERNAL_ALLOCATION_TYPE_EXECUTABLE.valueOf() + 1)),
    VK_INTERNAL_ALLOCATION_TYPE_MAX_ENUM(0x7FFFFFFF);
    
    private int value;
    
    private VkInternalAllocationType(int value) { this.value = value; }
    
    int valueOf() { return value; }
}
