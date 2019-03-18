package com.CIMthetics.hwjvi.VulkanCore.VK11.Enums;

public enum VkRasterizationOrderAMD
{
    VK_RASTERIZATION_ORDER_STRICT_AMD(0),
    VK_RASTERIZATION_ORDER_RELAXED_AMD(1),
    VK_RASTERIZATION_ORDER_BEGIN_RANGE_AMD(VK_RASTERIZATION_ORDER_STRICT_AMD.valueOf()),
    VK_RASTERIZATION_ORDER_END_RANGE_AMD(VK_RASTERIZATION_ORDER_RELAXED_AMD.valueOf()),
    VK_RASTERIZATION_ORDER_RANGE_SIZE_AMD((VK_RASTERIZATION_ORDER_RELAXED_AMD.valueOf() - VK_RASTERIZATION_ORDER_STRICT_AMD.valueOf() + 1)),
    VK_RASTERIZATION_ORDER_MAX_ENUM_AMD(0x7FFFFFFF);

    private int value;
    
    private VkRasterizationOrderAMD(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
