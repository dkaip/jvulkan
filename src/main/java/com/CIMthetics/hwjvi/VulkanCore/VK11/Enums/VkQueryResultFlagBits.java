package com.CIMthetics.hwjvi.VulkanCore.VK11.Enums;

public enum VkQueryResultFlagBits
{
    VK_QUERY_RESULT_64_BIT(0x00000001),
    VK_QUERY_RESULT_WAIT_BIT(0x00000002),
    VK_QUERY_RESULT_WITH_AVAILABILITY_BIT(0x00000004),
    VK_QUERY_RESULT_PARTIAL_BIT(0x00000008),
    VK_QUERY_RESULT_FLAG_BITS_MAX_ENUM(0x7FFFFFFF);

    private int value;
    
    private VkQueryResultFlagBits(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
