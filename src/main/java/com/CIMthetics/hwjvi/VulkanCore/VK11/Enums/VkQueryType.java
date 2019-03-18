package com.CIMthetics.hwjvi.VulkanCore.VK11.Enums;

public enum VkQueryType
{
    VK_QUERY_TYPE_OCCLUSION(0),
    VK_QUERY_TYPE_PIPELINE_STATISTICS(1),
    VK_QUERY_TYPE_TIMESTAMP(2),
    VK_QUERY_TYPE_TRANSFORM_FEEDBACK_STREAM_EXT(1000028004),
    VK_QUERY_TYPE_ACCELERATION_STRUCTURE_COMPACTED_SIZE_NV(1000165000),
    VK_QUERY_TYPE_BEGIN_RANGE(VK_QUERY_TYPE_OCCLUSION.valueOf()),
    VK_QUERY_TYPE_END_RANGE(VK_QUERY_TYPE_TIMESTAMP.valueOf()),
    VK_QUERY_TYPE_RANGE_SIZE((VK_QUERY_TYPE_TIMESTAMP.valueOf() - VK_QUERY_TYPE_OCCLUSION.valueOf() + 1)),
    VK_QUERY_TYPE_MAX_ENUM(0x7FFFFFFF);

    private int value;
    
    private VkQueryType(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
