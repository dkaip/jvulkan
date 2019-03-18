package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures;

import java.util.EnumSet;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkQueueFlagBits;

public class VkQueueFamilyProperties
{
    private EnumSet<VkQueueFlagBits>    queueFlags = EnumSet.noneOf(VkQueueFlagBits.class);
    private int                         queueCount;
    private int                         timestampValidBits;
    private VkExtent3D                  minImageTransferGranularity;
    
    public EnumSet<VkQueueFlagBits> getQueueFlags()
    {
        return queueFlags;
    }
    
    void setQueueFlags(EnumSet<VkQueueFlagBits> queueFlags)
    {
        this.queueFlags = queueFlags;
    }
    
    public int getQueueCount()
    {
        return queueCount;
    }
    
    void setQueueCount(int queueCount)
    {
        this.queueCount = queueCount;
    }
    
    public int getTimestampValidBits()
    {
        return timestampValidBits;
    }
    
    void setTimestampValidBits(int timestampValidBits)
    {
        this.timestampValidBits = timestampValidBits;
    }
    
    public VkExtent3D getMinImageTransferGranularity()
    {
        return minImageTransferGranularity;
    }
    
    void setMinImageTransferGranularity(
            VkExtent3D minImageTransferGranularity)
    {
        this.minImageTransferGranularity = minImageTransferGranularity;
    }
}
