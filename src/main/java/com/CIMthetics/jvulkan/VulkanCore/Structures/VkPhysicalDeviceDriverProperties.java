/*
 * Copyright 2019-2020 Douglas Kaip
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

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkDriverId;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkPhysicalDeviceDriverProperties extends VulkanCreateInfoStructure
{
    private VkDriverId           driverId;
    private String               driverName;
    private String               driverInfo;
    private VkConformanceVersion conformanceVersion;

    public VkPhysicalDeviceDriverProperties()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DRIVER_PROPERTIES);
    }

    public VkDriverId getDriverId()
    {
        return driverId;
    }

    public void setDriverId(VkDriverId driverId)
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

    public VkConformanceVersion getConformanceVersion()
    {
        return conformanceVersion;
    }

    public void setConformanceVersion(VkConformanceVersion conformanceVersion)
    {
        this.conformanceVersion = conformanceVersion;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\nVkPhysicalDeviceDriverProperties\n"));
        sb.append(String.format("    driverId:%s\n", driverId.toString()));
        sb.append(String.format("    driverName:%s\n", driverName));
        sb.append(String.format("    driverInfo:%s\n", driverInfo));
        sb.append(String.format("    conformanceVersion:%s\n", conformanceVersion.toString()));
        
        return sb.toString();
    }
}
