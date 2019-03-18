package com.CIMthetics.hwjvi.VulkanCore.VK11.Enums;

/**
 * 
 * @author Douglas Kaip
 *
 */
public enum VkPipelineCacheHeaderVersion
{
    VK_PIPELINE_CACHE_HEADER_VERSION_ONE(1),
    VK_PIPELINE_CACHE_HEADER_VERSION_BEGIN_RANGE(VK_PIPELINE_CACHE_HEADER_VERSION_ONE.valueOf()),
    VK_PIPELINE_CACHE_HEADER_VERSION_END_RANGE(VK_PIPELINE_CACHE_HEADER_VERSION_ONE.valueOf()),
    VK_PIPELINE_CACHE_HEADER_VERSION_RANGE_SIZE((VK_PIPELINE_CACHE_HEADER_VERSION_ONE.valueOf() - VK_PIPELINE_CACHE_HEADER_VERSION_ONE.valueOf() + 1)),
    VK_PIPELINE_CACHE_HEADER_VERSION_MAX_ENUM(0x7FFFFFFF);

    private int value;
    
    private VkPipelineCacheHeaderVersion(int value) { this.value = value; }
    
    int valueOf() { return value; }
}
