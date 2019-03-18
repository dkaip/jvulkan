package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkCompareOp;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStencilOp;

public class VkStencilOpState
{
    private VkStencilOp failOp;
    private VkStencilOp passOp;
    private VkStencilOp depthFailOp;
    private VkCompareOp compareOp;
    private int         compareMask;
    private int         writeMask;
    private int         reference;
    
    public VkStencilOp getFailOp()
    {
        return failOp;
    }
    
    public void setFailOp(VkStencilOp failOp)
    {
        this.failOp = failOp;
    }
    
    public VkStencilOp getPassOp()
    {
        return passOp;
    }
    
    public void setPassOp(VkStencilOp passOp)
    {
        this.passOp = passOp;
    }
    
    public VkStencilOp getDepthFailOp()
    {
        return depthFailOp;
    }
    
    public void setDepthFailOp(VkStencilOp depthFailOp)
    {
        this.depthFailOp = depthFailOp;
    }
    
    public VkCompareOp getCompareOp()
    {
        return compareOp;
    }
    
    public void setCompareOp(VkCompareOp compareOp)
    {
        this.compareOp = compareOp;
    }
    
    public int getCompareMask()
    {
        return compareMask;
    }
    
    public void setCompareMask(int compareMask)
    {
        this.compareMask = compareMask;
    }
    
    public int getWriteMask()
    {
        return writeMask;
    }
    
    public void setWriteMask(int writeMask)
    {
        this.writeMask = writeMask;
    }
    
    public int getReference()
    {
        return reference;
    }
    
    public void setReference(int reference)
    {
        this.reference = reference;
    }
}
