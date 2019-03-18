package com.CIMthetics.hwjvi.VulkanCore.VK11.Enums;

public enum VkExternalMemoryHandleTypeFlagBitsNV
{
    VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT_NV(0x00000001),
    VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_NV(0x00000002),
    VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_IMAGE_BIT_NV(0x00000004),
    VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_IMAGE_KMT_BIT_NV(0x00000008),
    VK_EXTERNAL_MEMORY_HANDLE_TYPE_FLAG_BITS_MAX_ENUM_NV(0x7FFFFFFF);

    private int value;
    
    private VkExternalMemoryHandleTypeFlagBitsNV(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
