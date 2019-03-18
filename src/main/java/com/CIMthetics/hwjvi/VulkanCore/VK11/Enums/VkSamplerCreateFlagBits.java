package com.CIMthetics.hwjvi.VulkanCore.VK11.Enums;

public enum VkSamplerCreateFlagBits
{
    VK_SAMPLER_CREATE_SUBSAMPLED_BIT_EXT(0x00000001),
    VK_SAMPLER_CREATE_SUBSAMPLED_COARSE_RECONSTRUCTION_BIT_EXT(0x00000002),
    VK_SAMPLER_CREATE_FLAG_BITS_MAX_ENUM(0x7FFFFFFF);
    
    private int value;
    
    private VkSamplerCreateFlagBits(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
