package com.CIMthetics.hwjvi.VulkanCore.VK11.Enums;

public enum VkMemoryPropertyFlagBits
{
    VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT(0x00000001),
    VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT(0x00000002),
    VK_MEMORY_PROPERTY_HOST_COHERENT_BIT(0x00000004),
    VK_MEMORY_PROPERTY_HOST_CACHED_BIT(0x00000008),
    VK_MEMORY_PROPERTY_LAZILY_ALLOCATED_BIT(0x00000010),
    VK_MEMORY_PROPERTY_PROTECTED_BIT(0x00000020),
    VK_MEMORY_PROPERTY_FLAG_BITS_MAX_ENUM(0x7FFFFFFF);

    private int value;
    
    private VkMemoryPropertyFlagBits(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
