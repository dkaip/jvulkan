package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkImageLayout;

public class VkAttachmentReference
{
    private int             attachment;
    private VkImageLayout   layout;
    
    public int getAttachment()
    {
        return attachment;
    }
    
    public void setAttachment(int attachment)
    {
        this.attachment = attachment;
    }
    
    public VkImageLayout getLayout()
    {
        return layout;
    }
    
    public void setLayout(VkImageLayout layout)
    {
        this.layout = layout;
    }
}
