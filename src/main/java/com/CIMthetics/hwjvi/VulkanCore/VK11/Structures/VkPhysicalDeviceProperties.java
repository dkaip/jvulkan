package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkPhysicalDeviceType;

/*
 * Note: the setters are not public because they should not be used by a Java
 * application, however, the JNI method can still find them.
 */

public class VkPhysicalDeviceProperties
{
    int                                 apiVersion;
    int                                 driverVersion;
    int                                 vendorID;
    int                                 deviceID;
    VkPhysicalDeviceType                deviceType;
    String                              deviceName;
    byte[]                              pipelineCacheUUID;
    VkPhysicalDeviceLimits              limits;
    VkPhysicalDeviceSparseProperties    sparseProperties;
    
    public int getApiVersion()
    {
        return apiVersion;
    }
    
    void setApiVersion(int apiVersion)
    {
        this.apiVersion = apiVersion;
    }
    
    public int getDriverVersion()
    {
        return driverVersion;
    }
    
    void setDriverVersion(int driverVersion)
    {
        this.driverVersion = driverVersion;
    }
    
    public int getVendorID()
    {
        return vendorID;
    }
    
    void setVendorID(int vendorID)
    {
        this.vendorID = vendorID;
    }
    
    public int getDeviceID()
    {
        return deviceID;
    }
    
    void setDeviceID(int deviceID)
    {
        this.deviceID = deviceID;
    }
    
    public VkPhysicalDeviceType getDeviceType()
    {
        return deviceType;
    }
    
    void setDeviceType(VkPhysicalDeviceType deviceType)
    {
        this.deviceType = deviceType;
    }
    
    public String getDeviceName()
    {
        return deviceName;
    }
    
    void setDeviceName(String deviceName)
    {
        this.deviceName = deviceName;
    }
    
    public byte[] getPipelineCacheUUID()
    {
        return pipelineCacheUUID;
    }
    
    void setPipelineCacheUUID(byte[] pipelineCacheUUID)
    {
        this.pipelineCacheUUID = pipelineCacheUUID;
    }
    
    public VkPhysicalDeviceLimits getLimits()
    {
        return limits;
    }
    
    void setLimits(VkPhysicalDeviceLimits limits)
    {
        this.limits = limits;
    }
    
    public VkPhysicalDeviceSparseProperties getSparseProperties()
    {
        return sparseProperties;
    }
    
    void setSparseProperties(
            VkPhysicalDeviceSparseProperties sparseProperties)
    {
        this.sparseProperties = sparseProperties;
    }
}
