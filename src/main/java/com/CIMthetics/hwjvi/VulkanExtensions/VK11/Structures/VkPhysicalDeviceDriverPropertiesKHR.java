package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;
import com.CIMthetics.hwjvi.VulkanExtensions.VK11.Enums.VkDriverIdKHR;

public class VkPhysicalDeviceDriverPropertiesKHR extends VulkanCreateInfoStructure
{
    private long                    pNext;
    private VkDriverIdKHR           driverId;
    private String                  driverName;
    private String                  driverInfo;
    private VkConformanceVersionKHR conformanceVersion;

    public VkPhysicalDeviceDriverPropertiesKHR()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DRIVER_PROPERTIES_KHR);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public VkDriverIdKHR getDriverId()
    {
        return driverId;
    }

    public void setDriverId(VkDriverIdKHR driverId)
    {
        this.driverId = driverId;
    }

    public String getDriverName()
    {
        return driverName;
    }

    public void setDriverName(String driverName)
    {
        this.driverName = driverName;
    }

    public String getDriverInfo()
    {
        return driverInfo;
    }

    public void setDriverInfo(String driverInfo)
    {
        this.driverInfo = driverInfo;
    }

    public VkConformanceVersionKHR getConformanceVersion()
    {
        return conformanceVersion;
    }

    public void setConformanceVersion(VkConformanceVersionKHR conformanceVersion)
    {
        this.conformanceVersion = conformanceVersion;
    }
}
