package com.CIMthetics.hwjvi.VulkanCore.VK11.Enums;

public enum VkDependencyFlagBits
{
    VK_DEPENDENCY_BY_REGION_BIT(0x00000001),
    VK_DEPENDENCY_DEVICE_GROUP_BIT(0x00000004),
    VK_DEPENDENCY_VIEW_LOCAL_BIT(0x00000002),
    VK_DEPENDENCY_VIEW_LOCAL_BIT_KHR(VK_DEPENDENCY_VIEW_LOCAL_BIT.valueOf()),
    VK_DEPENDENCY_DEVICE_GROUP_BIT_KHR(VK_DEPENDENCY_DEVICE_GROUP_BIT.valueOf()),
    VK_DEPENDENCY_FLAG_BITS_MAX_ENUM(0x7FFFFFFF);

    private int value;
    
    private VkDependencyFlagBits(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
