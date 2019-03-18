package com.CIMthetics.hwjvi.VulkanCore.VK11.Enums;

public enum VkSparseImageFormatFlagBits
{
    VK_SPARSE_IMAGE_FORMAT_SINGLE_MIPTAIL_BIT(0x00000001),
    VK_SPARSE_IMAGE_FORMAT_ALIGNED_MIP_SIZE_BIT(0x00000002),
    VK_SPARSE_IMAGE_FORMAT_NONSTANDARD_BLOCK_SIZE_BIT(0x00000004),
    VK_SPARSE_IMAGE_FORMAT_FLAG_BITS_MAX_ENUM(0x7FFFFFFF);

    private int value;
    
    private VkSparseImageFormatFlagBits(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
