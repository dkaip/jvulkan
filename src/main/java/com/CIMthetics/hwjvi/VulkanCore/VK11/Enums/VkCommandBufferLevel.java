package com.CIMthetics.hwjvi.VulkanCore.VK11.Enums;

public enum VkCommandBufferLevel
{
    VK_COMMAND_BUFFER_LEVEL_PRIMARY(0),
    VK_COMMAND_BUFFER_LEVEL_SECONDARY(1),
    VK_COMMAND_BUFFER_LEVEL_BEGIN_RANGE(VK_COMMAND_BUFFER_LEVEL_PRIMARY.valueOf()),
    VK_COMMAND_BUFFER_LEVEL_END_RANGE(VK_COMMAND_BUFFER_LEVEL_SECONDARY.valueOf()),
    VK_COMMAND_BUFFER_LEVEL_RANGE_SIZE((VK_COMMAND_BUFFER_LEVEL_SECONDARY.valueOf() - VK_COMMAND_BUFFER_LEVEL_PRIMARY.valueOf() + 1)),
    VK_COMMAND_BUFFER_LEVEL_MAX_ENUM(0x7FFFFFFF);

    private int value;
    
    private VkCommandBufferLevel(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
