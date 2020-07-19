/*
 * Copyright 2019 Douglas Kaip
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.CIMthetics.jvulkan.VulkanCore.Structures;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkPhysicalDeviceType;

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
