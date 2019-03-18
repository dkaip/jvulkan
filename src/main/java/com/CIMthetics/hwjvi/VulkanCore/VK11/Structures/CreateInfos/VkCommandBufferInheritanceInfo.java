package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos;

import java.util.EnumSet;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkQueryControlFlagBits;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkQueryPipelineStatisticFlagBits;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Handles.VkFramebuffer;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Handles.VkRenderPass;

public class VkCommandBufferInheritanceInfo extends VulkanCreateInfoStructure
{
    private long                                        pNext;
    private VkRenderPass                                renderPass;
    private int                                         subpass;
    private VkFramebuffer                               framebuffer;
    private boolean                                     occlusionQueryEnable;
    private EnumSet<VkQueryControlFlagBits>             queryFlags = EnumSet.noneOf(VkQueryControlFlagBits.class);
    private EnumSet<VkQueryPipelineStatisticFlagBits>   pipelineStatistics = EnumSet.noneOf(VkQueryPipelineStatisticFlagBits.class);

    public VkCommandBufferInheritanceInfo()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_INFO);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public VkRenderPass getRenderPass()
    {
        return renderPass;
    }

    public void setRenderPass(VkRenderPass renderPass)
    {
        this.renderPass = renderPass;
    }

    public int getSubpass()
    {
        return subpass;
    }

    public void setSubpass(int subpass)
    {
        this.subpass = subpass;
    }

    public VkFramebuffer getFramebuffer()
    {
        return framebuffer;
    }

    public void setFramebuffer(VkFramebuffer framebuffer)
    {
        this.framebuffer = framebuffer;
    }

    public boolean isOcclusionQueryEnable()
    {
        return occlusionQueryEnable;
    }

    public void setOcclusionQueryEnable(boolean occlusionQueryEnable)
    {
        this.occlusionQueryEnable = occlusionQueryEnable;
    }

    public EnumSet<VkQueryControlFlagBits> getQueryFlags()
    {
        return queryFlags;
    }

    public void setQueryFlags(EnumSet<VkQueryControlFlagBits> queryFlags)
    {
        this.queryFlags = queryFlags;
    }

    public EnumSet<VkQueryPipelineStatisticFlagBits> getPipelineStatistics()
    {
        return pipelineStatistics;
    }

    public void setPipelineStatistics(
            EnumSet<VkQueryPipelineStatisticFlagBits> pipelineStatistics)
    {
        this.pipelineStatistics = pipelineStatistics;
    }
    
}
