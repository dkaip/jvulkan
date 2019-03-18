package com.CIMthetics.hwjvi.VulkanCore.VK11.Enums;

public enum VkIndirectCommandsLayoutUsageFlagBitsNVX
{
    VK_INDIRECT_COMMANDS_LAYOUT_USAGE_UNORDERED_SEQUENCES_BIT_NVX(0x00000001),
    VK_INDIRECT_COMMANDS_LAYOUT_USAGE_SPARSE_SEQUENCES_BIT_NVX(0x00000002),
    VK_INDIRECT_COMMANDS_LAYOUT_USAGE_EMPTY_EXECUTIONS_BIT_NVX(0x00000004),
    VK_INDIRECT_COMMANDS_LAYOUT_USAGE_INDEXED_SEQUENCES_BIT_NVX(0x00000008),
    VK_INDIRECT_COMMANDS_LAYOUT_USAGE_FLAG_BITS_MAX_ENUM_NVX(0x7FFFFFFF);

    private int value;
    
    private VkIndirectCommandsLayoutUsageFlagBitsNVX(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
