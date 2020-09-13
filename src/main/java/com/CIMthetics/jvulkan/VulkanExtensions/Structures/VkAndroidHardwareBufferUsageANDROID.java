package com.CIMthetics.jvulkan.VulkanExtensions.Structures;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkAndroidHardwareBufferUsageANDROID extends VulkanCreateInfoStructure
{
    private long    androidHardwareBufferUsage;
    
    public VkAndroidHardwareBufferUsageANDROID()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_USAGE_ANDROID);
    }

    public long getAndroidHardwareBufferUsage()
    {
        return androidHardwareBufferUsage;
    }

    public void setAndroidHardwareBufferUsage(long androidHardwareBufferUsage)
    {
        this.androidHardwareBufferUsage = androidHardwareBufferUsage;
    }
}
