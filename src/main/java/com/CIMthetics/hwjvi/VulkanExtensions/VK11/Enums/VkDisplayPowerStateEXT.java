package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Enums;

public enum VkDisplayPowerStateEXT
{
    VK_DISPLAY_POWER_STATE_OFF_EXT(0),
    VK_DISPLAY_POWER_STATE_SUSPEND_EXT(1),
    VK_DISPLAY_POWER_STATE_ON_EXT(2),
    VK_DISPLAY_POWER_STATE_BEGIN_RANGE_EXT(VK_DISPLAY_POWER_STATE_OFF_EXT.valueOf()),
    VK_DISPLAY_POWER_STATE_END_RANGE_EXT(VK_DISPLAY_POWER_STATE_ON_EXT.valueOf()),
    VK_DISPLAY_POWER_STATE_RANGE_SIZE_EXT((VK_DISPLAY_POWER_STATE_ON_EXT.valueOf() - VK_DISPLAY_POWER_STATE_OFF_EXT.valueOf() + 1)),
    VK_DISPLAY_POWER_STATE_MAX_ENUM_EXT(0x7FFFFFFF);

    private int value;
    
    private VkDisplayPowerStateEXT(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
