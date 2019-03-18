package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Enums;

public enum VkGeometryFlagBitsNV
{
    VK_GEOMETRY_OPAQUE_BIT_NV(0x00000001),
    VK_GEOMETRY_NO_DUPLICATE_ANY_HIT_INVOCATION_BIT_NV(0x00000002),
    VK_GEOMETRY_FLAG_BITS_MAX_ENUM_NV(0x7FFFFFFF);

    private int value;
    
    private VkGeometryFlagBitsNV(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
