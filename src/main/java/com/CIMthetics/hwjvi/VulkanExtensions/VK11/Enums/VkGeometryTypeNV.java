package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Enums;

public enum VkGeometryTypeNV
{
    VK_GEOMETRY_TYPE_TRIANGLES_NV(0),
    VK_GEOMETRY_TYPE_AABBS_NV(1),
    VK_GEOMETRY_TYPE_BEGIN_RANGE_NV(VK_GEOMETRY_TYPE_TRIANGLES_NV.valueOf()),
    VK_GEOMETRY_TYPE_END_RANGE_NV(VK_GEOMETRY_TYPE_AABBS_NV.valueOf()),
    VK_GEOMETRY_TYPE_RANGE_SIZE_NV((VK_GEOMETRY_TYPE_AABBS_NV.valueOf() - VK_GEOMETRY_TYPE_TRIANGLES_NV.valueOf() + 1)),
    VK_GEOMETRY_TYPE_MAX_ENUM_NV(0x7FFFFFFF);

    private int value;
    
    private VkGeometryTypeNV(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
