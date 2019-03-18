package com.CIMthetics.hwjvi.VulkanCore.VK11.Enums;

public enum VkSharingMode
{
    VK_SHARING_MODE_EXCLUSIVE(0),
    VK_SHARING_MODE_CONCURRENT(1),
    VK_SHARING_MODE_BEGIN_RANGE(VK_SHARING_MODE_EXCLUSIVE.valueOf()),
    VK_SHARING_MODE_END_RANGE(VK_SHARING_MODE_CONCURRENT.valueOf()),
    VK_SHARING_MODE_RANGE_SIZE((VK_SHARING_MODE_CONCURRENT.valueOf() - VK_SHARING_MODE_EXCLUSIVE.valueOf() + 1)),
    VK_SHARING_MODE_MAX_ENUM(0x7FFFFFFF);

    private int value;
    
    private VkSharingMode(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
