package com.CIMthetics.hwjvi.VulkanCore.VK11.Enums;

public enum VkMemoryAllocateFlagBits
{
    VK_MEMORY_ALLOCATE_DEVICE_MASK_BIT(0x00000001),
    VK_MEMORY_ALLOCATE_DEVICE_MASK_BIT_KHR(VK_MEMORY_ALLOCATE_DEVICE_MASK_BIT.valueOf()),
    VK_MEMORY_ALLOCATE_FLAG_BITS_MAX_ENUM(0x7FFFFFFF);

    private int value;
    
    private VkMemoryAllocateFlagBits(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
