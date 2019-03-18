package com.CIMthetics.hwjvi.VulkanCore.VK11.Enums;

public enum VkSemaphoreImportFlagBits
{
    VK_SEMAPHORE_IMPORT_TEMPORARY_BIT(0x00000001),
    VK_SEMAPHORE_IMPORT_TEMPORARY_BIT_KHR(VK_SEMAPHORE_IMPORT_TEMPORARY_BIT.valueOf()),
    VK_SEMAPHORE_IMPORT_FLAG_BITS_MAX_ENUM(0x7FFFFFFF);

    private int value;
    
    private VkSemaphoreImportFlagBits(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
