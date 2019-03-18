package com.CIMthetics.hwjvi.VulkanCore.VK11.Handles;

public class VulkanHandle
{
    private long handle;
    
    public void setHandle(long handle)
    {
        this.handle = handle;
    }
    
    public long getHandle()
    {
        return handle;
    }
    
    @Override
    public String toString()
    {
        return String.format("%x", handle);
    }
}
