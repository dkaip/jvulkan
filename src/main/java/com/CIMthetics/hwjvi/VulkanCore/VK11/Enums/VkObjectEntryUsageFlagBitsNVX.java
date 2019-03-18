package com.CIMthetics.hwjvi.VulkanCore.VK11.Enums;

public enum VkObjectEntryUsageFlagBitsNVX
{
    VK_OBJECT_ENTRY_USAGE_GRAPHICS_BIT_NVX(0x00000001),
    VK_OBJECT_ENTRY_USAGE_COMPUTE_BIT_NVX(0x00000002),
    VK_OBJECT_ENTRY_USAGE_FLAG_BITS_MAX_ENUM_NVX(0x7FFFFFFF);

    private int value;
    
    private VkObjectEntryUsageFlagBitsNVX(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
