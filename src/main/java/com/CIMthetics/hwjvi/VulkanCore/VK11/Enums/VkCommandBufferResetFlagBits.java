package com.CIMthetics.hwjvi.VulkanCore.VK11.Enums;

public enum VkCommandBufferResetFlagBits
{
    VK_COMMAND_BUFFER_RESET_RELEASE_RESOURCES_BIT(0x00000001),
    VK_COMMAND_BUFFER_RESET_FLAG_BITS_MAX_ENUM(0x7FFFFFFF);

    private int value;
    
    private VkCommandBufferResetFlagBits(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
