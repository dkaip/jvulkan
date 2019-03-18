package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Enums;

public enum VkDeviceGroupPresentModeFlagBitsKHR
{
    VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_BIT_KHR(0x00000001),
    VK_DEVICE_GROUP_PRESENT_MODE_REMOTE_BIT_KHR(0x00000002),
    VK_DEVICE_GROUP_PRESENT_MODE_SUM_BIT_KHR(0x00000004),
    VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_MULTI_DEVICE_BIT_KHR(0x00000008),
    VK_DEVICE_GROUP_PRESENT_MODE_FLAG_BITS_MAX_ENUM_KHR(0x7FFFFFFF);

    private int value;
    
    private VkDeviceGroupPresentModeFlagBitsKHR(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
