package com.CIMthetics.hwjvi.VulkanCore.VK11.Enums;

public enum VkCommandBufferUsageFlagBits
{
    VK_COMMAND_BUFFER_USAGE_ONE_TIME_SUBMIT_BIT(0x00000001),
    VK_COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT(0x00000002),
    VK_COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT(0x00000004),
    VK_COMMAND_BUFFER_USAGE_FLAG_BITS_MAX_ENUM(0x7FFFFFFF);

    private int value;
    
    private VkCommandBufferUsageFlagBits(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
