package com.CIMthetics.hwjvi.VulkanCore.VK11.Enums;

public enum VkIndexType
{
    VK_INDEX_TYPE_UINT16(0),
    VK_INDEX_TYPE_UINT32(1),
    VK_INDEX_TYPE_NONE_NV(1000165000),
    VK_INDEX_TYPE_BEGIN_RANGE(VK_INDEX_TYPE_UINT16.valueOf()),
    VK_INDEX_TYPE_END_RANGE(VK_INDEX_TYPE_UINT32.valueOf()),
    VK_INDEX_TYPE_RANGE_SIZE((VK_INDEX_TYPE_UINT32.valueOf() - VK_INDEX_TYPE_UINT16.valueOf() + 1)),
    VK_INDEX_TYPE_MAX_ENUM(0x7FFFFFFF);

    private int value;
    
    private VkIndexType(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
