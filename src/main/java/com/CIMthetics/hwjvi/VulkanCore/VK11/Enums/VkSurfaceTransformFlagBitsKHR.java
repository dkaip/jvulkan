package com.CIMthetics.hwjvi.VulkanCore.VK11.Enums;

public enum VkSurfaceTransformFlagBitsKHR
{
    VK_SURFACE_TRANSFORM_IDENTITY_BIT_KHR(0x00000001),
    VK_SURFACE_TRANSFORM_ROTATE_90_BIT_KHR(0x00000002),
    VK_SURFACE_TRANSFORM_ROTATE_180_BIT_KHR(0x00000004),
    VK_SURFACE_TRANSFORM_ROTATE_270_BIT_KHR(0x00000008),
    VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_BIT_KHR(0x00000010),
    VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_90_BIT_KHR(0x00000020),
    VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_180_BIT_KHR(0x00000040),
    VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_270_BIT_KHR(0x00000080),
    VK_SURFACE_TRANSFORM_INHERIT_BIT_KHR(0x00000100);

    private int value;
    
    private VkSurfaceTransformFlagBitsKHR(int value) { this.value = value; }
    
    public int valueOf() { return value; }
    
    public static VkSurfaceTransformFlagBitsKHR fromValue(int inputValue)
    {
        VkSurfaceTransformFlagBitsKHR result = null;
        
        switch(inputValue)
        {
            case 0x00000001:
                result = VK_SURFACE_TRANSFORM_IDENTITY_BIT_KHR;
                break;
            case 0x00000002:
                result = VK_SURFACE_TRANSFORM_ROTATE_90_BIT_KHR;
                break;
            case 0x00000004:
                result = VK_SURFACE_TRANSFORM_ROTATE_180_BIT_KHR;
                break;
            case 0x00000008:
                result = VK_SURFACE_TRANSFORM_ROTATE_270_BIT_KHR;
                break;
            case 0x00000010:
                result = VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_BIT_KHR;
                break;
            case 0x00000020:
                result = VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_90_BIT_KHR;
                break;
            case 0x00000040:
                result = VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_180_BIT_KHR;
                break;
            case 0x00000080:
                result = VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_270_BIT_KHR;
                break;
            case 0x00000100:
                result = VK_SURFACE_TRANSFORM_INHERIT_BIT_KHR;
                break;
        }

        if (result == null)
            throw new IllegalArgumentException("Illegal value specified for this Enum.");

        return result;
    }
}
