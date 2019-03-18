package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Enums;

public enum VkTimeDomainEXT
{
    VK_TIME_DOMAIN_DEVICE_EXT(0),
    VK_TIME_DOMAIN_CLOCK_MONOTONIC_EXT(1),
    VK_TIME_DOMAIN_CLOCK_MONOTONIC_RAW_EXT(2),
    VK_TIME_DOMAIN_QUERY_PERFORMANCE_COUNTER_EXT(3),
    VK_TIME_DOMAIN_BEGIN_RANGE_EXT(VK_TIME_DOMAIN_DEVICE_EXT.valueOf()),
    VK_TIME_DOMAIN_END_RANGE_EXT(VK_TIME_DOMAIN_QUERY_PERFORMANCE_COUNTER_EXT.valueOf()),
    VK_TIME_DOMAIN_RANGE_SIZE_EXT(VK_TIME_DOMAIN_QUERY_PERFORMANCE_COUNTER_EXT.valueOf() - VK_TIME_DOMAIN_DEVICE_EXT.valueOf() + 1),
    VK_TIME_DOMAIN_MAX_ENUM_EXT(0x7FFFFFFF);

    private int value;
    
    private VkTimeDomainEXT(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
