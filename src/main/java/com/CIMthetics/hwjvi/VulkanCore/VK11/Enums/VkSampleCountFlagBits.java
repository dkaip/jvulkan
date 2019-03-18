package com.CIMthetics.hwjvi.VulkanCore.VK11.Enums;

public enum VkSampleCountFlagBits
{
    VK_SAMPLE_COUNT_1_BIT(0x00000001),
    VK_SAMPLE_COUNT_2_BIT(0x00000002),
    VK_SAMPLE_COUNT_4_BIT(0x00000004),
    VK_SAMPLE_COUNT_8_BIT(0x00000008),
    VK_SAMPLE_COUNT_16_BIT(0x00000010),
    VK_SAMPLE_COUNT_32_BIT(0x00000020),
    VK_SAMPLE_COUNT_64_BIT(0x00000040),
    VK_SAMPLE_COUNT_FLAG_BITS_MAX_ENUM(0x7FFFFFFF);

    private int value;
    
    private VkSampleCountFlagBits(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
