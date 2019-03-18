package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Enums;

public enum VkSwapchainCreateFlagBitsKHR
{
    VK_SWAPCHAIN_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT_KHR(0x00000001),
    VK_SWAPCHAIN_CREATE_PROTECTED_BIT_KHR(0x00000002),
    VK_SWAPCHAIN_CREATE_MUTABLE_FORMAT_BIT_KHR(0x00000004),
    VK_SWAPCHAIN_CREATE_FLAG_BITS_MAX_ENUM_KHR(0x7FFFFFFF);

    private int value;
    
    private VkSwapchainCreateFlagBitsKHR(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
