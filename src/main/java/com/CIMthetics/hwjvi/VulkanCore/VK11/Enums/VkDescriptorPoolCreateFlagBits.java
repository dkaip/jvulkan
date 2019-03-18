package com.CIMthetics.hwjvi.VulkanCore.VK11.Enums;

public enum VkDescriptorPoolCreateFlagBits
{
    VK_DESCRIPTOR_POOL_CREATE_FREE_DESCRIPTOR_SET_BIT(0x00000001),
    VK_DESCRIPTOR_POOL_CREATE_UPDATE_AFTER_BIND_BIT_EXT(0x00000002),
    VK_DESCRIPTOR_POOL_CREATE_FLAG_BITS_MAX_ENUM(0x7FFFFFFF);

    private int value;
    
    private VkDescriptorPoolCreateFlagBits(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
