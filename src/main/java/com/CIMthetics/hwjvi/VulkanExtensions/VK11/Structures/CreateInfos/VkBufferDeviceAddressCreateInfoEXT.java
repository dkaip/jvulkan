package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures.CreateInfos;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;
import com.CIMthetics.hwjvi.VulkanExtensions.VK11.Handles.VkDeviceAddress;

public class VkBufferDeviceAddressCreateInfoEXT extends VulkanCreateInfoStructure
{
    private long            pNext;
    private VkDeviceAddress deviceAddress;

    public VkBufferDeviceAddressCreateInfoEXT()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_BUFFER_DEVICE_ADDRESS_CREATE_INFO_EXT);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public VkDeviceAddress getDeviceAddress()
    {
        return deviceAddress;
    }

    public void setDeviceAddress(VkDeviceAddress deviceAddress)
    {
        this.deviceAddress = deviceAddress;
    }

}
