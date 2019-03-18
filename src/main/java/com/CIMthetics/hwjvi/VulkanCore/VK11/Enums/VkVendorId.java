package com.CIMthetics.hwjvi.VulkanCore.VK11.Enums;

public enum VkVendorId
{
    VK_VENDOR_ID_VIV(0x10001),
    VK_VENDOR_ID_VSI(0x10002),
    VK_VENDOR_ID_KAZAN(0x10003),
    VK_VENDOR_ID_BEGIN_RANGE(VK_VENDOR_ID_VIV.valueOf()),
    VK_VENDOR_ID_END_RANGE(VK_VENDOR_ID_KAZAN.valueOf()),
    VK_VENDOR_ID_RANGE_SIZE(VK_VENDOR_ID_KAZAN.valueOf() - VK_VENDOR_ID_VIV.valueOf() + 1),
    VK_VENDOR_ID_MAX_ENUM(0x7FFFFFFF);

    private int value;
    
    private VkVendorId(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
