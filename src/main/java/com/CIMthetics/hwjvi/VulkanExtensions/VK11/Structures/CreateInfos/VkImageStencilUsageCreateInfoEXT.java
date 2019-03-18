package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures.CreateInfos;

import java.util.EnumSet;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkImageUsageFlagBits;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkImageStencilUsageCreateInfoEXT extends VulkanCreateInfoStructure
{
    private long                            pNext;
    private EnumSet<VkImageUsageFlagBits>   stencilUsage;

    public VkImageStencilUsageCreateInfoEXT()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_IMAGE_STENCIL_USAGE_CREATE_INFO_EXT);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public EnumSet<VkImageUsageFlagBits> getStencilUsage()
    {
        return stencilUsage;
    }

    public void setStencilUsage(EnumSet<VkImageUsageFlagBits> stencilUsage)
    {
        this.stencilUsage = stencilUsage;
    }

}
