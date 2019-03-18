package com.CIMthetics.hwjvi.VulkanCore.VK11.Enums;

public enum VkPipelineBindPoint
{
    VK_PIPELINE_BIND_POINT_GRAPHICS(0),
    VK_PIPELINE_BIND_POINT_COMPUTE(1),
    VK_PIPELINE_BIND_POINT_RAY_TRACING_NV(1000165000),
    VK_PIPELINE_BIND_POINT_BEGIN_RANGE(VK_PIPELINE_BIND_POINT_GRAPHICS.valueOf()),
    VK_PIPELINE_BIND_POINT_END_RANGE(VK_PIPELINE_BIND_POINT_COMPUTE.valueOf()),
    VK_PIPELINE_BIND_POINT_RANGE_SIZE((VK_PIPELINE_BIND_POINT_COMPUTE.valueOf() - VK_PIPELINE_BIND_POINT_GRAPHICS.valueOf() + 1)),
    VK_PIPELINE_BIND_POINT_MAX_ENUM(0x7FFFFFFF);

    private int value;
    
    private VkPipelineBindPoint(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
