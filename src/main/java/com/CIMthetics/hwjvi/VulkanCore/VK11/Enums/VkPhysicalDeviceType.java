package com.CIMthetics.hwjvi.VulkanCore.VK11.Enums;

public enum VkPhysicalDeviceType
{
    VK_PHYSICAL_DEVICE_TYPE_OTHER(0),
    VK_PHYSICAL_DEVICE_TYPE_INTEGRATED_GPU(1),
    VK_PHYSICAL_DEVICE_TYPE_DISCRETE_GPU(2),
    VK_PHYSICAL_DEVICE_TYPE_VIRTUAL_GPU(3),
    VK_PHYSICAL_DEVICE_TYPE_CPU(4),
    VK_PHYSICAL_DEVICE_TYPE_BEGIN_RANGE(VK_PHYSICAL_DEVICE_TYPE_OTHER.valueOf()),
    VK_PHYSICAL_DEVICE_TYPE_END_RANGE(VK_PHYSICAL_DEVICE_TYPE_CPU.valueOf()),
    VK_PHYSICAL_DEVICE_TYPE_RANGE_SIZE((VK_PHYSICAL_DEVICE_TYPE_CPU.valueOf() - VK_PHYSICAL_DEVICE_TYPE_OTHER.valueOf() + 1)),
    VK_PHYSICAL_DEVICE_TYPE_MAX_ENUM(0x7FFFFFFF);

    private int value;
    
    private VkPhysicalDeviceType(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
