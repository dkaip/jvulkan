package com.CIMthetics.hwjvi.VulkanCore.VK11.Enums;

public enum VkCommandPoolCreateFlagBits
{
    VK_COMMAND_POOL_CREATE_TRANSIENT_BIT(0x00000001),
    VK_COMMAND_POOL_CREATE_RESET_COMMAND_BUFFER_BIT(0x00000002),
    VK_COMMAND_POOL_CREATE_PROTECTED_BIT(0x00000004),
    VK_COMMAND_POOL_CREATE_FLAG_BITS_MAX_ENUM(0x7FFFFFFF);

    private int value;
    
    private VkCommandPoolCreateFlagBits(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
