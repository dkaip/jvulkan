package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Enums;

public enum VkScopeNV
{
    VK_SCOPE_DEVICE_NV(1),
    VK_SCOPE_WORKGROUP_NV(2),
    VK_SCOPE_SUBGROUP_NV(3),
    VK_SCOPE_QUEUE_FAMILY_NV(5),
    VK_SCOPE_BEGIN_RANGE_NV(VK_SCOPE_DEVICE_NV.valueOf()),
    VK_SCOPE_END_RANGE_NV(VK_SCOPE_QUEUE_FAMILY_NV.valueOf()),
    VK_SCOPE_RANGE_SIZE_NV(VK_SCOPE_QUEUE_FAMILY_NV.valueOf() - VK_SCOPE_DEVICE_NV.valueOf() + 1),
    VK_SCOPE_MAX_ENUM_NV(0x7FFFFFFF);

    private int value;
    
    private VkScopeNV(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
