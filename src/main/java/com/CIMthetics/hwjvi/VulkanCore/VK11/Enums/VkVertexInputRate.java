package com.CIMthetics.hwjvi.VulkanCore.VK11.Enums;

public enum VkVertexInputRate
{
    VK_VERTEX_INPUT_RATE_VERTEX(0),
    VK_VERTEX_INPUT_RATE_INSTANCE(1),
    VK_VERTEX_INPUT_RATE_BEGIN_RANGE(VK_VERTEX_INPUT_RATE_VERTEX.valueOf()),
    VK_VERTEX_INPUT_RATE_END_RANGE(VK_VERTEX_INPUT_RATE_INSTANCE.valueOf()),
    VK_VERTEX_INPUT_RATE_RANGE_SIZE((VK_VERTEX_INPUT_RATE_INSTANCE.valueOf() - VK_VERTEX_INPUT_RATE_VERTEX.valueOf() + 1)),
    VK_VERTEX_INPUT_RATE_MAX_ENUM(0x7FFFFFFF);

    private int value;
    
    private VkVertexInputRate(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
