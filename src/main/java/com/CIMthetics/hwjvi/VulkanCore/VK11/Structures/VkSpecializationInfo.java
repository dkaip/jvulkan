package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures;

import java.util.Collection;

public class VkSpecializationInfo
{
    private Collection<VkSpecializationMapEntry>    mapEntries;
    private byte[]                                  data;
    
    public Collection<VkSpecializationMapEntry> getMapEntries()
    {
        return mapEntries;
    }
    
    public void setMapEntries(Collection<VkSpecializationMapEntry> mapEntries)
    {
        this.mapEntries = mapEntries;
    }
    
    public byte[] getData()
    {
        return data;
    }
    
    public void setData(byte[] data)
    {
        this.data = data;
    }
}
