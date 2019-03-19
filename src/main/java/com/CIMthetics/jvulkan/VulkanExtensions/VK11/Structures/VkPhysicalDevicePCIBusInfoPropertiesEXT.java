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
package com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures;

import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

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
