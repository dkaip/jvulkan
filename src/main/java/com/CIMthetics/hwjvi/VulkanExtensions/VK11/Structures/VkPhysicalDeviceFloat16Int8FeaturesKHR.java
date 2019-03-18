package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkPhysicalDeviceFloat16Int8FeaturesKHR extends VulkanCreateInfoStructure
{
    private long    pNext;
    private boolean shaderFloat16;
    private boolean shaderInt8;
    
    public VkPhysicalDeviceFloat16Int8FeaturesKHR()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FLOAT16_INT8_FEATURES_KHR);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public boolean isShaderFloat16()
    {
        return shaderFloat16;
    }

    public void setShaderFloat16(boolean shaderFloat16)
    {
        this.shaderFloat16 = shaderFloat16;
    }

    public boolean isShaderInt8()
    {
        return shaderInt8;
    }

    public void setShaderInt8(boolean shaderInt8)
    {
        this.shaderInt8 = shaderInt8;
    }

}
