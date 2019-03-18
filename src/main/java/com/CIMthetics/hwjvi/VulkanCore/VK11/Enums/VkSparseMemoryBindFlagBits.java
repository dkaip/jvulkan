package com.CIMthetics.hwjvi.VulkanCore.VK11.Enums;

public enum VkSparseMemoryBindFlagBits
{
    VK_SPARSE_MEMORY_BIND_METADATA_BIT(0x00000001),
    VK_SPARSE_MEMORY_BIND_FLAG_BITS_MAX_ENUM(0x7FFFFFFF);

    private int value;
    
    private VkSparseMemoryBindFlagBits(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
