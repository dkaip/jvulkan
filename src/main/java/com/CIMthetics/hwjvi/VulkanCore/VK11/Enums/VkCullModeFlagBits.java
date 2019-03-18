package com.CIMthetics.hwjvi.VulkanCore.VK11.Enums;

public enum VkCullModeFlagBits
{
    VK_CULL_MODE_NONE(0),
    VK_CULL_MODE_FRONT_BIT(0x00000001),
    VK_CULL_MODE_BACK_BIT(0x00000002),
    VK_CULL_MODE_FRONT_AND_BACK(0x00000003),
    VK_CULL_MODE_FLAG_BITS_MAX_ENUM(0x7FFFFFFF);

    private int value;
    
    private VkCullModeFlagBits(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
