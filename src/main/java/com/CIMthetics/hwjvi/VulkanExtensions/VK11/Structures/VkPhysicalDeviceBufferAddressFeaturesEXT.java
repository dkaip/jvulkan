package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkPhysicalDeviceBufferAddressFeaturesEXT extends VulkanCreateInfoStructure
{
    private long    pNext;
    private boolean bufferDeviceAddress;
    private boolean bufferDeviceAddressCaptureReplay;
    private boolean bufferDeviceAddressMultiDevice;

    public VkPhysicalDeviceBufferAddressFeaturesEXT()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BUFFER_ADDRESS_FEATURES_EXT);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public boolean isBufferDeviceAddress()
    {
        return bufferDeviceAddress;
    }

    public void setBufferDeviceAddress(boolean bufferDeviceAddress)
    {
        this.bufferDeviceAddress = bufferDeviceAddress;
    }

    public boolean isBufferDeviceAddressCaptureReplay()
    {
        return bufferDeviceAddressCaptureReplay;
    }

    public void setBufferDeviceAddressCaptureReplay(
            boolean bufferDeviceAddressCaptureReplay)
    {
        this.bufferDeviceAddressCaptureReplay = bufferDeviceAddressCaptureReplay;
    }

    public boolean isBufferDeviceAddressMultiDevice()
    {
        return bufferDeviceAddressMultiDevice;
    }

    public void setBufferDeviceAddressMultiDevice(
            boolean bufferDeviceAddressMultiDevice)
    {
        this.bufferDeviceAddressMultiDevice = bufferDeviceAddressMultiDevice;
    }

}
