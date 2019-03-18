package com.CIMthetics.hwjvi.VulkanCore.VK11.Enums;

public enum VkStencilFaceFlagBits
{
    VK_STENCIL_FACE_FRONT_BIT(0x00000001),
    VK_STENCIL_FACE_BACK_BIT(0x00000002),
    VK_STENCIL_FRONT_AND_BACK(0x00000003),
    VK_STENCIL_FACE_FLAG_BITS_MAX_ENUM(0x7FFFFFFF);

    private int value;
    
    private VkStencilFaceFlagBits(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
