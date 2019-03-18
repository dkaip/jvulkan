package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures.CreateInfos;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.VkAttachmentReference;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkRenderPassFragmentDensityMapCreateInfoEXT extends VulkanCreateInfoStructure
{
    private long                    pNext;
    private VkAttachmentReference   fragmentDensityMapAttachment;

    public VkRenderPassFragmentDensityMapCreateInfoEXT()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_RENDER_PASS_FRAGMENT_DENSITY_MAP_CREATE_INFO_EXT);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public VkAttachmentReference getFragmentDensityMapAttachment()
    {
        return fragmentDensityMapAttachment;
    }

    public void setFragmentDensityMapAttachment(
            VkAttachmentReference fragmentDensityMapAttachment)
    {
        this.fragmentDensityMapAttachment = fragmentDensityMapAttachment;
    }

}
