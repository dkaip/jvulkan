package com.CIMthetics.hwjvi.VulkanCore.VK11.Enums;

public enum VkExternalFenceFeatureFlagBits
{
    VK_EXTERNAL_FENCE_FEATURE_EXPORTABLE_BIT(0x00000001),
    VK_EXTERNAL_FENCE_FEATURE_IMPORTABLE_BIT(0x00000002),
    VK_EXTERNAL_FENCE_FEATURE_EXPORTABLE_BIT_KHR(VK_EXTERNAL_FENCE_FEATURE_EXPORTABLE_BIT.valueOf()),
    VK_EXTERNAL_FENCE_FEATURE_IMPORTABLE_BIT_KHR(VK_EXTERNAL_FENCE_FEATURE_IMPORTABLE_BIT.valueOf()),
    VK_EXTERNAL_FENCE_FEATURE_FLAG_BITS_MAX_ENUM(0x7FFFFFFF);

    private int value;
    
    private VkExternalFenceFeatureFlagBits(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
