package com.CIMthetics.hwjvi.VulkanCore.VK11.Enums;

public enum VkImageType
{
    VK_IMAGE_TYPE_1D(0),
    VK_IMAGE_TYPE_2D(1),
    VK_IMAGE_TYPE_3D(2),
    VK_IMAGE_TYPE_BEGIN_RANGE(VK_IMAGE_TYPE_1D.valueOf()),
    VK_IMAGE_TYPE_END_RANGE(VK_IMAGE_TYPE_3D.valueOf()),
    VK_IMAGE_TYPE_RANGE_SIZE(VK_IMAGE_TYPE_3D.valueOf() - VK_IMAGE_TYPE_1D.valueOf() + 1),
    VK_IMAGE_TYPE_MAX_ENUM(0x7FFFFFFF);
    
    private int value;
    
    private VkImageType(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
