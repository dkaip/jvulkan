package com.CIMthetics.hwjvi.VulkanCore.VK11.Enums;

public enum VkFilter
{
    VK_FILTER_NEAREST(0),
    VK_FILTER_LINEAR(1),
    VK_FILTER_CUBIC_IMG(1000015000),
    VK_FILTER_CUBIC_EXT(VK_FILTER_CUBIC_IMG.valueOf()),
    VK_FILTER_BEGIN_RANGE(VK_FILTER_NEAREST.valueOf()),
    VK_FILTER_END_RANGE(VK_FILTER_LINEAR.valueOf()),
    VK_FILTER_RANGE_SIZE((VK_FILTER_LINEAR.valueOf() - VK_FILTER_NEAREST.valueOf() + 1)),
    VK_FILTER_MAX_ENUM(0x7FFFFFFF);

    private int value;
    
    private VkFilter(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
