package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkVertexInputRate;

public class VkVertexInputBindingDescription
{
    private int                 binding;
    private int                 stride;
    private VkVertexInputRate   inputRate;
    
    /**
     * 
     * @param binding
     * @param stride
     * @param inputRate
     */
    public VkVertexInputBindingDescription(int binding, int stride, VkVertexInputRate inputRate)
    {
        this.binding    = binding;
        this.stride     = stride;
        this.inputRate  = inputRate;
    }

    public int getBinding()
    {
        return binding;
    }

    public int getStride()
    {
        return stride;
    }

    public VkVertexInputRate getInputRate()
    {
        return inputRate;
    }
    
}
