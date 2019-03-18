package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures;

public class VkConformanceVersionKHR
{
    private long major;
    private long minor;
    private long subminor;
    private long patch;
    
    public long getMajor()
    {
        return major;
    }
    
    void setMajor(long major)
    {
        this.major = major;
    }
    
    public long getMinor()
    {
        return minor;
    }
    
    void setMinor(long minor)
    {
        this.minor = minor;
    }
    
    public long getSubminor()
    {
        return subminor;
    }
    
    void setSubminor(long subminor)
    {
        this.subminor = subminor;
    }
    
    public long getPatch()
    {
        return patch;
    }
    
    void setPatch(long patch)
    {
        this.patch = patch;
    }
}
