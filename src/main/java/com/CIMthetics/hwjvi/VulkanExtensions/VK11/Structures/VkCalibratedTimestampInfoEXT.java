package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;
import com.CIMthetics.hwjvi.VulkanExtensions.VK11.Enums.VkTimeDomainEXT;

public class VkCalibratedTimestampInfoEXT extends VulkanCreateInfoStructure
{
    private long            pNext;
    private VkTimeDomainEXT timeDomain;

    public VkCalibratedTimestampInfoEXT()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_CALIBRATED_TIMESTAMP_INFO_EXT);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public VkTimeDomainEXT getTimeDomain()
    {
        return timeDomain;
    }

    public void setTimeDomain(VkTimeDomainEXT timeDomain)
    {
        this.timeDomain = timeDomain;
    }

}
