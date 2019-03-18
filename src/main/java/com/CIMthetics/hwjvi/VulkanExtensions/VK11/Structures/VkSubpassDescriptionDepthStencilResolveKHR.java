package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VkAttachmentReference2KHR;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;
import com.CIMthetics.hwjvi.VulkanExtensions.VK11.Enums.VkResolveModeFlagBitsKHR;

public class VkSubpassDescriptionDepthStencilResolveKHR extends VulkanCreateInfoStructure
{
    private long                        pNext;
    private VkResolveModeFlagBitsKHR    depthResolveMode;
    private VkResolveModeFlagBitsKHR    stencilResolveMode;
    private VkAttachmentReference2KHR   depthStencilResolveAttachment;

    public VkSubpassDescriptionDepthStencilResolveKHR()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_SUBPASS_DESCRIPTION_DEPTH_STENCIL_RESOLVE_KHR);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public VkResolveModeFlagBitsKHR getDepthResolveMode()
    {
        return depthResolveMode;
    }

    public void setDepthResolveMode(VkResolveModeFlagBitsKHR depthResolveMode)
    {
        this.depthResolveMode = depthResolveMode;
    }

    public VkResolveModeFlagBitsKHR getStencilResolveMode()
    {
        return stencilResolveMode;
    }

    public void setStencilResolveMode(VkResolveModeFlagBitsKHR stencilResolveMode)
    {
        this.stencilResolveMode = stencilResolveMode;
    }

    public VkAttachmentReference2KHR getpDepthStencilResolveAttachment()
    {
        return depthStencilResolveAttachment;
    }
}
