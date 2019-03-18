package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Enums;

public enum VkGeometryInstanceFlagBitsNV
{
    VK_GEOMETRY_INSTANCE_TRIANGLE_CULL_DISABLE_BIT_NV(0x00000001),
    VK_GEOMETRY_INSTANCE_TRIANGLE_FRONT_COUNTERCLOCKWISE_BIT_NV(0x00000002),
    VK_GEOMETRY_INSTANCE_FORCE_OPAQUE_BIT_NV(0x00000004),
    VK_GEOMETRY_INSTANCE_FORCE_NO_OPAQUE_BIT_NV(0x00000008),
    VK_GEOMETRY_INSTANCE_FLAG_BITS_MAX_ENUM_NV(0x7FFFFFFF);

    private int value;
    
    private VkGeometryInstanceFlagBitsNV(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
