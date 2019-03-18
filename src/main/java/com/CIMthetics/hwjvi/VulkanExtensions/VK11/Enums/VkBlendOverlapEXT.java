package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Enums;

public enum VkBlendOverlapEXT
{
    VK_BLEND_OVERLAP_UNCORRELATED_EXT(0),
    VK_BLEND_OVERLAP_DISJOINT_EXT(1),
    VK_BLEND_OVERLAP_CONJOINT_EXT(2),
    VK_BLEND_OVERLAP_BEGIN_RANGE_EXT(VK_BLEND_OVERLAP_UNCORRELATED_EXT.valueOf()),
    VK_BLEND_OVERLAP_END_RANGE_EXT(VK_BLEND_OVERLAP_CONJOINT_EXT.valueOf()),
    VK_BLEND_OVERLAP_RANGE_SIZE_EXT((VK_BLEND_OVERLAP_CONJOINT_EXT.valueOf() - VK_BLEND_OVERLAP_UNCORRELATED_EXT.valueOf() + 1)),
    VK_BLEND_OVERLAP_MAX_ENUM_EXT(0x7FFFFFFF);

    private int value;
    
    private VkBlendOverlapEXT(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
