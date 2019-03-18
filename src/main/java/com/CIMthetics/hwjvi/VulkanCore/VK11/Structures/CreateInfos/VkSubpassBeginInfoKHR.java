package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkSubpassContents;

public class VkSubpassBeginInfoKHR extends VulkanCreateInfoStructure
{
    private long                pNext;
    private VkSubpassContents   contents;

    public VkSubpassBeginInfoKHR()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_SUBPASS_BEGIN_INFO_KHR);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public VkSubpassContents getContents()
    {
        return contents;
    }

    public void setContents(VkSubpassContents contents)
    {
        this.contents = contents;
    }
    
}
