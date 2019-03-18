package com.CIMthetics.hwjvi.VulkanCore.VK11.Enums;

public enum VkQueueFlagBits
{
    VK_QUEUE_GRAPHICS_BIT(0x00000001),
    VK_QUEUE_COMPUTE_BIT(0x00000002),
    VK_QUEUE_TRANSFER_BIT(0x00000004),
    VK_QUEUE_SPARSE_BINDING_BIT(0x00000008),
    VK_QUEUE_PROTECTED_BIT(0x00000010),
    VK_QUEUE_FLAG_BITS_MAX_ENUM(0x7FFFFFFF);

    private int value;
    
    private VkQueueFlagBits(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
