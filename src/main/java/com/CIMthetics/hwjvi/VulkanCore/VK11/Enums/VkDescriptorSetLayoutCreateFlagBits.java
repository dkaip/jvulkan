package com.CIMthetics.hwjvi.VulkanCore.VK11.Enums;

public enum VkDescriptorSetLayoutCreateFlagBits
{
    VK_DESCRIPTOR_SET_LAYOUT_CREATE_PUSH_DESCRIPTOR_BIT_KHR(0x00000001),
    VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT_EXT(0x00000002),
    VK_DESCRIPTOR_SET_LAYOUT_CREATE_FLAG_BITS_MAX_ENUM(0x7FFFFFFF);

    private int value;
    
    private VkDescriptorSetLayoutCreateFlagBits(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
