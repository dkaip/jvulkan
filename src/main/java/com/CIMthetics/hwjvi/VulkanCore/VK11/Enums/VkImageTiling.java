package com.CIMthetics.hwjvi.VulkanCore.VK11.Enums;

public enum VkImageTiling
{
    VK_IMAGE_TILING_OPTIMAL(0),
    VK_IMAGE_TILING_LINEAR(1),
    VK_IMAGE_TILING_DRM_FORMAT_MODIFIER_EXT(1000158000),
    VK_IMAGE_TILING_BEGIN_RANGE(VK_IMAGE_TILING_OPTIMAL.valueOf()),
    VK_IMAGE_TILING_END_RANGE(VK_IMAGE_TILING_LINEAR.valueOf()),
    VK_IMAGE_TILING_RANGE_SIZE(VK_IMAGE_TILING_LINEAR.valueOf() - VK_IMAGE_TILING_OPTIMAL.valueOf() + 1),
    VK_IMAGE_TILING_MAX_ENUM(0x7FFFFFFF);

    private int value;
    
    private VkImageTiling(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
