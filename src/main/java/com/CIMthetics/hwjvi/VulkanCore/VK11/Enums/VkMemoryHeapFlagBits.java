package com.CIMthetics.hwjvi.VulkanCore.VK11.Enums;

public enum VkMemoryHeapFlagBits
{
    VK_MEMORY_HEAP_DEVICE_LOCAL_BIT(0x00000001),
    VK_MEMORY_HEAP_MULTI_INSTANCE_BIT(0x00000002),
    VK_MEMORY_HEAP_MULTI_INSTANCE_BIT_KHR(VK_MEMORY_HEAP_MULTI_INSTANCE_BIT.valueOf()),
    VK_MEMORY_HEAP_FLAG_BITS_MAX_ENUM(0x7FFFFFFF);

    private int value;
    
    private VkMemoryHeapFlagBits(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
