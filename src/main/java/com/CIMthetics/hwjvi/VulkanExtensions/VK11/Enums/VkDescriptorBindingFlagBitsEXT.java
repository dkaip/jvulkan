package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Enums;

public enum VkDescriptorBindingFlagBitsEXT
{
    VK_DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT_EXT(0x00000001),
    VK_DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_BIT_EXT(0x00000002),
    VK_DESCRIPTOR_BINDING_PARTIALLY_BOUND_BIT_EXT(0x00000004),
    VK_DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT_EXT(0x00000008),
    VK_DESCRIPTOR_BINDING_FLAG_BITS_MAX_ENUM_EXT(0x7FFFFFFF);

    private int value;
    
    private VkDescriptorBindingFlagBitsEXT(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
