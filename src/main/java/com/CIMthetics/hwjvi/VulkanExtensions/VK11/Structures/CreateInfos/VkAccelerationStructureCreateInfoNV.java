package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures.CreateInfos;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;
import com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures.VkAccelerationStructureInfoNV;

public class VkAccelerationStructureCreateInfoNV extends VulkanCreateInfoStructure
{
    private long                            pNext;
    private long                            compactedSize;
    private VkAccelerationStructureInfoNV   info;

    public VkAccelerationStructureCreateInfoNV()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_CREATE_INFO_NV);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public long getCompactedSize()
    {
        return compactedSize;
    }

    public void setCompactedSize(long compactedSize)
    {
        this.compactedSize = compactedSize;
    }

    public VkAccelerationStructureInfoNV getInfo()
    {
        return info;
    }

    public void setInfo(VkAccelerationStructureInfoNV info)
    {
        this.info = info;
    }

}
