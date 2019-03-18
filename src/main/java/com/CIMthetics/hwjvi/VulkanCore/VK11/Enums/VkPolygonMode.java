package com.CIMthetics.hwjvi.VulkanCore.VK11.Enums;

public enum VkPolygonMode
{
    VK_POLYGON_MODE_FILL(0),
    VK_POLYGON_MODE_LINE(1),
    VK_POLYGON_MODE_POINT(2),
    VK_POLYGON_MODE_FILL_RECTANGLE_NV(1000153000),
    VK_POLYGON_MODE_BEGIN_RANGE(VK_POLYGON_MODE_FILL.valueOf()),
    VK_POLYGON_MODE_END_RANGE(VK_POLYGON_MODE_POINT.valueOf()),
    VK_POLYGON_MODE_RANGE_SIZE((VK_POLYGON_MODE_POINT.valueOf() - VK_POLYGON_MODE_FILL.valueOf() + 1)),
    VK_POLYGON_MODE_MAX_ENUM(0x7FFFFFFF);

    private int value;
    
    private VkPolygonMode(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
