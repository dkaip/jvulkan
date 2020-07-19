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
package com.CIMthetics.jvulkan.VulkanExtensions.Structures;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkPhysicalDevicePCIBusInfoPropertiesEXT extends VulkanCreateInfoStructure
{
    private int     pciDomain;
    private int     pciBus;
    private int     pciDevice;
    private int     pciFunction;

    public VkPhysicalDevicePCIBusInfoPropertiesEXT()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PCI_BUS_INFO_PROPERTIES_EXT);
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

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\nVkPhysicalDeviceBlendOperationAdvancedPropertiesEXT\n"));
        sb.append(String.format("    pciDomain:%d\n", pciDomain));
        sb.append(String.format("    pciBus:%d\n", pciBus));
        sb.append(String.format("    pciDevice:%d\n", pciDevice));
        sb.append(String.format("    pciFunction:%d\n", pciFunction));
        
        return sb.toString();
    }
}
