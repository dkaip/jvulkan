package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos;

import java.util.Collection;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Handles.VkFramebuffer;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Handles.VkRenderPass;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.VkClearValue;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.VkRect2D;

public class VkRenderPassBeginInfo extends VulkanCreateInfoStructure
{
    private long                        pNext;
    private VkRenderPass                renderPass;
    private VkFramebuffer               framebuffer;
    private VkRect2D                    renderArea;
    private Collection<VkClearValue>    clearValues;

    public VkRenderPassBeginInfo()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_RENDER_PASS_BEGIN_INFO);
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

    public VkFramebuffer getFramebuffer()
    {
        return framebuffer;
    }

    public void setFramebuffer(VkFramebuffer framebuffer)
    {
        this.framebuffer = framebuffer;
    }

    public VkRect2D getRenderArea()
    {
        return renderArea;
    }

    public void setRenderArea(VkRect2D renderArea)
    {
        this.renderArea = renderArea;
    }

    public Collection<VkClearValue> getClearValues()
    {
        return clearValues;
    }

    public void setClearValues(Collection<VkClearValue> clearValues)
    {
        this.clearValues = clearValues;
    }
}
