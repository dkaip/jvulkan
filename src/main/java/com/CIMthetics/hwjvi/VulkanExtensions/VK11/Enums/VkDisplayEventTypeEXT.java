package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Enums;

public enum VkDisplayEventTypeEXT
{
    VK_DISPLAY_EVENT_TYPE_FIRST_PIXEL_OUT_EXT(0),
    VK_DISPLAY_EVENT_TYPE_BEGIN_RANGE_EXT(VK_DISPLAY_EVENT_TYPE_FIRST_PIXEL_OUT_EXT.valueOf()),
    VK_DISPLAY_EVENT_TYPE_END_RANGE_EXT(VK_DISPLAY_EVENT_TYPE_FIRST_PIXEL_OUT_EXT.valueOf()),
    VK_DISPLAY_EVENT_TYPE_RANGE_SIZE_EXT((VK_DISPLAY_EVENT_TYPE_FIRST_PIXEL_OUT_EXT.valueOf() - VK_DISPLAY_EVENT_TYPE_FIRST_PIXEL_OUT_EXT.valueOf() + 1)),
    VK_DISPLAY_EVENT_TYPE_MAX_ENUM_EXT(0x7FFFFFFF);

    private int value;
    
    private VkDisplayEventTypeEXT(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
