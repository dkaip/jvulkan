package com.CIMthetics.hwjvi.VulkanCore.VK11.Enums;

public enum VkCommandPoolResetFlagBits
{
    VK_COMMAND_POOL_RESET_RELEASE_RESOURCES_BIT(0x00000001),
    VK_COMMAND_POOL_RESET_FLAG_BITS_MAX_ENUM(0x7FFFFFFF);

    private int value;
    
    private VkCommandPoolResetFlagBits(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
