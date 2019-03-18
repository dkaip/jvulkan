package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos;

import java.util.EnumSet;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkCompareOp;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkPipelineDepthStencilStateCreateFlagBits;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.VkStencilOpState;

public class VkPipelineDepthStencilStateCreateInfo extends VulkanCreateInfoStructure
{
    private long                                                pNext;
    private EnumSet<VkPipelineDepthStencilStateCreateFlagBits>  flags = EnumSet.noneOf(VkPipelineDepthStencilStateCreateFlagBits.class);
    private boolean                                             depthTestEnable;
    private boolean                                             depthWriteEnable;
    private VkCompareOp                                         depthCompareOp;
    private boolean                                             depthBoundsTestEnable;
    private boolean                                             stencilTestEnable;
    private VkStencilOpState                                    front;
    private VkStencilOpState                                    back;
    private float                                               minDepthBounds;
    private float                                               maxDepthBounds;

    public VkPipelineDepthStencilStateCreateInfo()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_DEPTH_STENCIL_STATE_CREATE_INFO);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public EnumSet<VkPipelineDepthStencilStateCreateFlagBits> getFlags()
    {
        return flags;
    }

    public void setFlags(EnumSet<VkPipelineDepthStencilStateCreateFlagBits> flags)
    {
        this.flags = flags;
    }

    public boolean isDepthTestEnable()
    {
        return depthTestEnable;
    }

    public void setDepthTestEnable(boolean depthTestEnable)
    {
        this.depthTestEnable = depthTestEnable;
    }

    public boolean isDepthWriteEnable()
    {
        return depthWriteEnable;
    }

    public void setDepthWriteEnable(boolean depthWriteEnable)
    {
        this.depthWriteEnable = depthWriteEnable;
    }

    public VkCompareOp getDepthCompareOp()
    {
        return depthCompareOp;
    }

    public void setDepthCompareOp(VkCompareOp depthCompareOp)
    {
        this.depthCompareOp = depthCompareOp;
    }

    public boolean isDepthBoundsTestEnable()
    {
        return depthBoundsTestEnable;
    }

    public void setDepthBoundsTestEnable(boolean depthBoundsTestEnable)
    {
        this.depthBoundsTestEnable = depthBoundsTestEnable;
    }

    public boolean isStencilTestEnable()
    {
        return stencilTestEnable;
    }

    public void setStencilTestEnable(boolean stencilTestEnable)
    {
        this.stencilTestEnable = stencilTestEnable;
    }

    public VkStencilOpState getFront()
    {
        return front;
    }

    public void setFront(VkStencilOpState front)
    {
        this.front = front;
    }

    public VkStencilOpState getBack()
    {
        return back;
    }

    public void setBack(VkStencilOpState back)
    {
        this.back = back;
    }

    public float getMinDepthBounds()
    {
        return minDepthBounds;
    }

    public void setMinDepthBounds(float minDepthBounds)
    {
        this.minDepthBounds = minDepthBounds;
    }

    public float getMaxDepthBounds()
    {
        return maxDepthBounds;
    }

    public void setMaxDepthBounds(float maxDepthBounds)
    {
        this.maxDepthBounds = maxDepthBounds;
    }
    
}
