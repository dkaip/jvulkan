package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures;

import java.util.Collection;
import java.util.EnumSet;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkPipelineBindPoint;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkSubpassDescriptionFlagBits;

public class VkSubpassDescription
{
    private EnumSet<VkSubpassDescriptionFlagBits>  flags = EnumSet.noneOf(VkSubpassDescriptionFlagBits.class);
    private VkPipelineBindPoint                 pipelineBindPoint;
    private Collection<VkAttachmentReference>   inputAttachments;
    private Collection<VkAttachmentReference>   colorAttachments;
    private Collection<VkAttachmentReference>   resolveAttachments; // if this is not null or empty it must have the same number of elements as ColorAttachments
    private VkAttachmentReference               depthStencilAttachment;
    private int[]                               preserveAttachments;
    
    public EnumSet<VkSubpassDescriptionFlagBits> getFlags()
    {
        return flags;
    }
    
    public void setFlags(EnumSet<VkSubpassDescriptionFlagBits> flags)
    {
        this.flags = flags;
    }
    
    public VkPipelineBindPoint getPipelineBindPoint()
    {
        return pipelineBindPoint;
    }
    
    public void setPipelineBindPoint(VkPipelineBindPoint pipelineBindPoint)
    {
        this.pipelineBindPoint = pipelineBindPoint;
    }
    
    public Collection<VkAttachmentReference> getInputAttachments()
    {
        return inputAttachments;
    }
    
    public void setInputAttachments(
            Collection<VkAttachmentReference> inputAttachments)
    {
        this.inputAttachments = inputAttachments;
    }
    
    public Collection<VkAttachmentReference> getColorAttachments()
    {
        return colorAttachments;
    }
    public void setColorAttachments(
            Collection<VkAttachmentReference> colorAttachments)
    {
        this.colorAttachments = colorAttachments;
    }
    
    public Collection<VkAttachmentReference> getResolveAttachments()
    {
        return resolveAttachments;
    }
    
    public void setResolveAttachments(
            Collection<VkAttachmentReference> resolveAttachments)
    {
        this.resolveAttachments = resolveAttachments;
    }
    
    public VkAttachmentReference getDepthStencilAttachment()
    {
        return depthStencilAttachment;
    }
    
    public void setDepthStencilAttachment(
            VkAttachmentReference depthStencilAttachment)
    {
        this.depthStencilAttachment = depthStencilAttachment;
    }
    
    public int[] getPreserveAttachments()
    {
        return preserveAttachments;
    }
    
    public void setPreserveAttachments(int[] preserveAttachments)
    {
        this.preserveAttachments = preserveAttachments;
    }
}
