package com.CIMthetics.hwjvi.VulkanCore.VK11.Enums;

public enum VkExternalMemoryFeatureFlagBitsNV
{
    VK_EXTERNAL_MEMORY_FEATURE_DEDICATED_ONLY_BIT_NV(0x00000001),
    VK_EXTERNAL_MEMORY_FEATURE_EXPORTABLE_BIT_NV(0x00000002),
    VK_EXTERNAL_MEMORY_FEATURE_IMPORTABLE_BIT_NV(0x00000004),
    VK_EXTERNAL_MEMORY_FEATURE_FLAG_BITS_MAX_ENUM_NV(0x7FFFFFFF);

    private int value;
    
    private VkExternalMemoryFeatureFlagBitsNV(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
