package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;

public class VkSubpassEndInfoKHR extends VulkanCreateInfoStructure
{
    private long                pNext;

    public VkSubpassEndInfoKHR()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_SUBPASS_END_INFO_KHR);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }
    
}
