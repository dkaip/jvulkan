package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures;

import java.util.EnumSet;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkAttachmentDescriptionFlagBits;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkAttachmentLoadOp;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkAttachmentStoreOp;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkFormat;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkImageLayout;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkSampleCountFlagBits;

public class VkAttachmentDescription
{
    private EnumSet<VkAttachmentDescriptionFlagBits>    flags = EnumSet.noneOf(VkAttachmentDescriptionFlagBits.class);
    private VkFormat                        format;
    private VkSampleCountFlagBits           samples;
    private VkAttachmentLoadOp              loadOp;
    private VkAttachmentStoreOp             storeOp;
    private VkAttachmentLoadOp              stencilLoadOp;
    private VkAttachmentStoreOp             stencilStoreOp;
    private VkImageLayout                   initialLayout;
    private VkImageLayout                   finalLayout;
    
    public EnumSet<VkAttachmentDescriptionFlagBits> getFlags()
    {
        return flags;
    }
    
    public void setFlags(EnumSet<VkAttachmentDescriptionFlagBits> flags)
    {
        this.flags = flags;
    }
    
    public VkFormat getFormat()
    {
        return format;
    }
    
    public void setFormat(VkFormat format)
    {
        this.format = format;
    }
    
    public VkSampleCountFlagBits getSamples()
    {
        return samples;
    }
    
    public void setSamples(VkSampleCountFlagBits samples)
    {
        this.samples = samples;
    }
    
    public VkAttachmentLoadOp getLoadOp()
    {
        return loadOp;
    }
    
    public void setLoadOp(VkAttachmentLoadOp loadOp)
    {
        this.loadOp = loadOp;
    }
    
    public VkAttachmentStoreOp getStoreOp()
    {
        return storeOp;
    }
    
    public void setStoreOp(VkAttachmentStoreOp storeOp)
    {
        this.storeOp = storeOp;
    }
    
    public VkAttachmentLoadOp getStencilLoadOp()
    {
        return stencilLoadOp;
    }
    
    public void setStencilLoadOp(VkAttachmentLoadOp stencilLoadOp)
    {
        this.stencilLoadOp = stencilLoadOp;
    }
    
    public VkAttachmentStoreOp getStencilStoreOp()
    {
        return stencilStoreOp;
    }
    
    public void setStencilStoreOp(VkAttachmentStoreOp stencilStoreOp)
    {
        this.stencilStoreOp = stencilStoreOp;
    }
    
    public VkImageLayout getInitialLayout()
    {
        return initialLayout;
    }
    
    public void setInitialLayout(VkImageLayout initialLayout)
    {
        this.initialLayout = initialLayout;
    }
    
    public VkImageLayout getFinalLayout()
    {
        return finalLayout;
    }
    
    public void setFinalLayout(VkImageLayout finalLayout)
    {
        this.finalLayout = finalLayout;
    }
}
