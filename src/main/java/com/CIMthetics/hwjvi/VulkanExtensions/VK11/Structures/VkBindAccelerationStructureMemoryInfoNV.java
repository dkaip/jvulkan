package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Handles.VkDeviceMemory;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;
import com.CIMthetics.hwjvi.VulkanExtensions.VK11.Handles.VkAccelerationStructureNV;

public class VkBindAccelerationStructureMemoryInfoNV extends VulkanCreateInfoStructure
{
    private long                        pNext;
    private VkAccelerationStructureNV   accelerationStructure;
    private VkDeviceMemory              memory;
    private long                        memoryOffset;
    private int[]                       deviceIndices;

    public VkBindAccelerationStructureMemoryInfoNV()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_BIND_ACCELERATION_STRUCTURE_MEMORY_INFO_NV);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public VkAccelerationStructureNV getAccelerationStructure()
    {
        return accelerationStructure;
    }

    public void setAccelerationStructure(VkAccelerationStructureNV accelerationStructure)
    {
        this.accelerationStructure = accelerationStructure;
    }

    public VkDeviceMemory getMemory()
    {
        return memory;
    }

    public void setMemory(VkDeviceMemory memory)
    {
        this.memory = memory;
    }

    public long getMemoryOffset()
    {
        return memoryOffset;
    }

    public void setMemoryOffset(long memoryOffset)
    {
        this.memoryOffset = memoryOffset;
    }

    public int[] getDeviceIndices()
    {
        return deviceIndices;
    }

    public void setDeviceIndices(int[] deviceIndices)
    {
        this.deviceIndices = deviceIndices;
    }
}
