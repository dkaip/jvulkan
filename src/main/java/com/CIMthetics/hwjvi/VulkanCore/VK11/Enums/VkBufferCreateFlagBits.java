package com.CIMthetics.hwjvi.VulkanCore.VK11.Enums;

public enum VkBufferCreateFlagBits
{
    VK_BUFFER_CREATE_SPARSE_BINDING_BIT(0x00000001),
    VK_BUFFER_CREATE_SPARSE_RESIDENCY_BIT(0x00000002),
    VK_BUFFER_CREATE_SPARSE_ALIASED_BIT(0x00000004),
    VK_BUFFER_CREATE_PROTECTED_BIT(0x00000008),
    VK_BUFFER_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT_EXT(0x00000010),
    VK_BUFFER_CREATE_FLAG_BITS_MAX_ENUM(0x7FFFFFFF);

    private int value;
    
    private VkBufferCreateFlagBits(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
