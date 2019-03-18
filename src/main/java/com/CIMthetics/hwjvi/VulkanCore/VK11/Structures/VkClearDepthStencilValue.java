package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures;

public class VkClearDepthStencilValue
{
    private float depth;
    private long  stencil;
    
    /**
     * 
     * @param depth
     * @param stencil - this is a long so that it can be retrieved as a uint32_t
     */
    public VkClearDepthStencilValue(float depth, long stencil)
    {
        this.depth   = depth;
        this.stencil = stencil;
    }

    public float getDepth()
    {
        return depth;
    }

    public long getStencil()
    {
        return stencil;
    }
    
}
