package com.CIMthetics.hwjvi.VulkanCore.VK11.Enums;

public enum VkSamplerMipmapMode
{
    VK_SAMPLER_MIPMAP_MODE_NEAREST(0),
    VK_SAMPLER_MIPMAP_MODE_LINEAR(1),
    VK_SAMPLER_MIPMAP_MODE_BEGIN_RANGE(VK_SAMPLER_MIPMAP_MODE_NEAREST.valueOf()),
    VK_SAMPLER_MIPMAP_MODE_END_RANGE(VK_SAMPLER_MIPMAP_MODE_LINEAR.valueOf()),
    VK_SAMPLER_MIPMAP_MODE_RANGE_SIZE((VK_SAMPLER_MIPMAP_MODE_LINEAR.valueOf() - VK_SAMPLER_MIPMAP_MODE_NEAREST.valueOf() + 1)),
    VK_SAMPLER_MIPMAP_MODE_MAX_ENUM(0x7FFFFFFF);

    private int value;
    
    private VkSamplerMipmapMode(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
