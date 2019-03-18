package com.CIMthetics.hwjvi.Wayland.Handles;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Handles.VulkanHandle;

public class WlCompositor extends VulkanHandle
{
    public WlCompositor(VulkanHandle vulkanHandle)
    {
        if (vulkanHandle == null)
            throw new NullPointerException("The VulkanHandle argument may not be null.");
        
        super.setHandle(vulkanHandle.getHandle());
    }
}
