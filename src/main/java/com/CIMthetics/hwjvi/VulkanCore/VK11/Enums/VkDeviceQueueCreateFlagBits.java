package com.CIMthetics.hwjvi.VulkanCore.VK11.Enums;

public enum VkDeviceQueueCreateFlagBits
{
    VK_DEVICE_QUEUE_CREATE_PROTECTED_BIT(0x00000001),
    VK_DEVICE_QUEUE_CREATE_FLAG_BITS_MAX_ENUM(0x7FFFFFFF);

    private int value;
    
    private VkDeviceQueueCreateFlagBits(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
