package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkPhysicalDeviceShaderAtomicInt64FeaturesKHR extends VulkanCreateInfoStructure
{
    private long                    pNext;
    private boolean                 shaderBufferInt64Atomics;
    private boolean                 shaderSharedInt64Atomics;
    
    public VkPhysicalDeviceShaderAtomicInt64FeaturesKHR()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_INT64_FEATURES_KHR);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public boolean isShaderBufferInt64Atomics()
    {
        return shaderBufferInt64Atomics;
    }

    public void setShaderBufferInt64Atomics(boolean shaderBufferInt64Atomics)
    {
        this.shaderBufferInt64Atomics = shaderBufferInt64Atomics;
    }

    public boolean isShaderSharedInt64Atomics()
    {
        return shaderSharedInt64Atomics;
    }

    public void setShaderSharedInt64Atomics(boolean shaderSharedInt64Atomics)
    {
        this.shaderSharedInt64Atomics = shaderSharedInt64Atomics;
    }
}
