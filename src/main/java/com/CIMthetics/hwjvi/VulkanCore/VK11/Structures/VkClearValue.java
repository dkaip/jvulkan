package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures;

public class VkClearValue
{
    private VkClearDepthStencilValue clearDepthStencilValue;
    private VkClearColorValue        clearColorValue;
    
    public VkClearValue(VkClearColorValue color)
    {
        clearColorValue = color;;
    }

    public VkClearValue(VkClearDepthStencilValue depthStencil)
    {
        clearDepthStencilValue = depthStencil;
    }

    public VkClearDepthStencilValue getClearDepthStencilValue()
    {
        return clearDepthStencilValue;
    }

    public VkClearColorValue getClearColorValue()
    {
        return clearColorValue;
    }
}
