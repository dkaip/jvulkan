package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Enums;

public enum VkDeviceEventTypeEXT
{
    VK_DEVICE_EVENT_TYPE_DISPLAY_HOTPLUG_EXT(0),
    VK_DEVICE_EVENT_TYPE_BEGIN_RANGE_EXT(VK_DEVICE_EVENT_TYPE_DISPLAY_HOTPLUG_EXT.valueOf()),
    VK_DEVICE_EVENT_TYPE_END_RANGE_EXT(VK_DEVICE_EVENT_TYPE_DISPLAY_HOTPLUG_EXT.valueOf()),
    VK_DEVICE_EVENT_TYPE_RANGE_SIZE_EXT((VK_DEVICE_EVENT_TYPE_DISPLAY_HOTPLUG_EXT.valueOf() - VK_DEVICE_EVENT_TYPE_DISPLAY_HOTPLUG_EXT.valueOf() + 1)),
    VK_DEVICE_EVENT_TYPE_MAX_ENUM_EXT(0x7FFFFFFF);

    private int value;
    
    private VkDeviceEventTypeEXT(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
