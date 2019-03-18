package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos;

import java.util.Collection;
import java.util.EnumSet;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkFramebufferCreateFlagBits;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Handles.VkImageView;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Handles.VkRenderPass;

public class VkFramebufferCreateInfo extends VulkanCreateInfoStructure
{
    private long                                    pNext;
    private EnumSet<VkFramebufferCreateFlagBits>    flags = EnumSet.noneOf(VkFramebufferCreateFlagBits.class);
    private VkRenderPass                            renderPass;
    private Collection<VkImageView>                 attachments;
    private int                                     width;
    private int                                     height;
    private int                                     layers;

    public VkFramebufferCreateInfo()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_FRAMEBUFFER_CREATE_INFO);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public EnumSet<VkFramebufferCreateFlagBits> getFlags()
    {
        return flags;
    }

    public void setFlags(EnumSet<VkFramebufferCreateFlagBits> flags)
    {
        this.flags = flags;
    }

    public VkRenderPass getRenderPass()
    {
        return renderPass;
    }

    public void setRenderPass(VkRenderPass renderPass)
    {
        this.renderPass = renderPass;
    }

    public Collection<VkImageView> getAttachments()
    {
        return attachments;
    }

    public void setAttachments(Collection<VkImageView> attachments)
    {
        this.attachments = attachments;
    }

    public int getWidth()
    {
        return width;
    }

    public void setWidth(int width)
    {
        this.width = width;
    }

    public int getHeight()
    {
        return height;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    public int getLayers()
    {
        return layers;
    }

    public void setLayers(int layers)
    {
        this.layers = layers;
    }
    
}
