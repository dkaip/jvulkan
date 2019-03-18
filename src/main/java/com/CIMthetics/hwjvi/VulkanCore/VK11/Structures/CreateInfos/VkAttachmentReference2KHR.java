package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkImageAspectFlagBits;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkImageLayout;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;

public class VkAttachmentReference2KHR extends VulkanCreateInfoStructure
{
    private long                    pNext;
    private int                     attachment;
    private VkImageLayout           layout;
    private VkImageAspectFlagBits   aspectMask;

    public VkAttachmentReference2KHR()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_ATTACHMENT_REFERENCE_2_KHR);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

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

    public VkImageAspectFlagBits getAspectMask()
    {
        return aspectMask;
    }

    public void setAspectMask(VkImageAspectFlagBits aspectMask)
    {
        this.aspectMask = aspectMask;
    }
    
}
