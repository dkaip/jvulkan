package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;
import com.CIMthetics.hwjvi.VulkanExtensions.VK11.Enums.VkResolveModeFlagBitsKHR;

public class VkPhysicalDeviceDepthStencilResolvePropertiesKHR
        extends VulkanCreateInfoStructure
{
    private long                        pNext;
    private VkResolveModeFlagBitsKHR    supportedDepthResolveModes;
    private VkResolveModeFlagBitsKHR    supportedStencilResolveModes;
    private boolean                     independentResolveNone;
    private boolean                     independentResolve;
    
    public VkPhysicalDeviceDepthStencilResolvePropertiesKHR()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_STENCIL_RESOLVE_PROPERTIES_KHR);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public VkResolveModeFlagBitsKHR getSupportedDepthResolveModes()
    {
        return supportedDepthResolveModes;
    }

    public void setSupportedDepthResolveModes(
            VkResolveModeFlagBitsKHR supportedDepthResolveModes)
    {
        this.supportedDepthResolveModes = supportedDepthResolveModes;
    }

    public VkResolveModeFlagBitsKHR getSupportedStencilResolveModes()
    {
        return supportedStencilResolveModes;
    }

    public void setSupportedStencilResolveModes(
            VkResolveModeFlagBitsKHR supportedStencilResolveModes)
    {
        this.supportedStencilResolveModes = supportedStencilResolveModes;
    }

    public boolean isIndependentResolveNone()
    {
        return independentResolveNone;
    }

    public void setIndependentResolveNone(boolean independentResolveNone)
    {
        this.independentResolveNone = independentResolveNone;
    }

    public boolean isIndependentResolve()
    {
        return independentResolve;
    }

    public void setIndependentResolve(boolean independentResolve)
    {
        this.independentResolve = independentResolve;
    }

}
