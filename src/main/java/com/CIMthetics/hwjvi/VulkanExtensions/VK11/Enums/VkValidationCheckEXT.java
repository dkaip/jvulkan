package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Enums;

public enum VkValidationCheckEXT
{
    VK_VALIDATION_CHECK_ALL_EXT(0),
    VK_VALIDATION_CHECK_SHADERS_EXT(1),
    VK_VALIDATION_CHECK_BEGIN_RANGE_EXT(VK_VALIDATION_CHECK_ALL_EXT.valueOf()),
    VK_VALIDATION_CHECK_END_RANGE_EXT(VK_VALIDATION_CHECK_SHADERS_EXT.valueOf()),
    VK_VALIDATION_CHECK_RANGE_SIZE_EXT((VK_VALIDATION_CHECK_SHADERS_EXT.valueOf() - VK_VALIDATION_CHECK_ALL_EXT.valueOf() + 1)),
    VK_VALIDATION_CHECK_MAX_ENUM_EXT(0x7FFFFFFF);

    private int value;
    
    private VkValidationCheckEXT(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
