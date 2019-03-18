package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkPhysicalDevicePCIBusInfoPropertiesEXT extends VulkanCreateInfoStructure
{
    private long    pNext;
    private int     pciDomain;
    private int     pciBus;
    private int     pciDevice;
    private int     pciFunction;

    public VkPhysicalDevicePCIBusInfoPropertiesEXT()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PCI_BUS_INFO_PROPERTIES_EXT);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public int getPciDomain()
    {
        return pciDomain;
    }

    public void setPciDomain(int pciDomain)
    {
        this.pciDomain = pciDomain;
    }

    public int getPciBus()
    {
        return pciBus;
    }

    public void setPciBus(int pciBus)
    {
        this.pciBus = pciBus;
    }

    public int getPciDevice()
    {
        return pciDevice;
    }

    public void setPciDevice(int pciDevice)
    {
        this.pciDevice = pciDevice;
    }

    public int getPciFunction()
    {
        return pciFunction;
    }

    public void setPciFunction(int pciFunction)
    {
        this.pciFunction = pciFunction;
    }

}
