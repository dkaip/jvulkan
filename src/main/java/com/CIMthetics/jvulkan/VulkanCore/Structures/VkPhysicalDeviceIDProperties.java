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

import java.util.Arrays;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkPhysicalDeviceIDProperties extends VulkanCreateInfoStructure
{
    private byte[]  deviceUUID;
    private byte[]  driverUUID;
    private byte[]  deviceLUID;
    private int     deviceNodeMask;
    private boolean deviceLUIDValid;

    public VkPhysicalDeviceIDProperties()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ID_PROPERTIES);
    }

    public byte[] getDeviceUUID()
    {
        return deviceUUID;
    }

    void setDeviceUUID(byte[] deviceUUID)
    {
        this.deviceUUID = deviceUUID;
    }

    public byte[] getDriverUUID()
    {
        return driverUUID;
    }

    void setDriverUUID(byte[] driverUUID)
    {
        this.driverUUID = driverUUID;
    }

    public byte[] getDeviceLUID()
    {
        return deviceLUID;
    }

    void setDeviceLUID(byte[] deviceLUID)
    {
        this.deviceLUID = deviceLUID;
    }

    public int getDeviceNodeMask()
    {
        return deviceNodeMask;
    }

    void setDeviceNodeMask(int deviceNodeMask)
    {
        this.deviceNodeMask = deviceNodeMask;
    }

    public boolean isDeviceLUIDValid()
    {
        return deviceLUIDValid;
    }

    void setDeviceLUIDValid(boolean deviceLUIDValid)
    {
        this.deviceLUIDValid = deviceLUIDValid;
    }

    @Override
    public String toString()
    {
        if (deviceUUID == null)
            deviceUUID = new byte[0];
        
        if (driverUUID == null)
            driverUUID = new byte[0];
        
        if (deviceLUID == null)
            deviceLUID = new byte[0];
        
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\nVkPhysicalDeviceIDProperties\n"));
        sb.append(String.format("    deviceUUID:%s\n", Arrays.toString(deviceUUID)));
        sb.append(String.format("    driverUUID:%s\n", Arrays.toString(driverUUID)));
        sb.append(String.format("    deviceLUID:%s\n", Arrays.toString(deviceLUID)));
        sb.append(String.format("    deviceNodeMask:%d\n", deviceNodeMask));
        sb.append(String.format("    deviceLUIDValid:%b\n", deviceLUIDValid));
        
        return sb.toString();
    }
}
