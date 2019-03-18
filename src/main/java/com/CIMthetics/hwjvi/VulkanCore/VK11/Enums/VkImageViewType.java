package com.CIMthetics.hwjvi.VulkanCore.VK11.Enums;

public enum VkImageViewType
{
    VK_IMAGE_VIEW_TYPE_1D(0),
    VK_IMAGE_VIEW_TYPE_2D(1),
    VK_IMAGE_VIEW_TYPE_3D(2),
    VK_IMAGE_VIEW_TYPE_CUBE(3),
    VK_IMAGE_VIEW_TYPE_1D_ARRAY(4),
    VK_IMAGE_VIEW_TYPE_2D_ARRAY(5),
    VK_IMAGE_VIEW_TYPE_CUBE_ARRAY(6),
    VK_IMAGE_VIEW_TYPE_BEGIN_RANGE(VK_IMAGE_VIEW_TYPE_1D.valueOf()),
    VK_IMAGE_VIEW_TYPE_END_RANGE(VK_IMAGE_VIEW_TYPE_CUBE_ARRAY.valueOf()),
    VK_IMAGE_VIEW_TYPE_RANGE_SIZE((VK_IMAGE_VIEW_TYPE_CUBE_ARRAY.valueOf() - VK_IMAGE_VIEW_TYPE_1D.valueOf() + 1)),
    VK_IMAGE_VIEW_TYPE_MAX_ENUM(0x7FFFFFFF);

    private int value;
    
    private VkImageViewType(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
