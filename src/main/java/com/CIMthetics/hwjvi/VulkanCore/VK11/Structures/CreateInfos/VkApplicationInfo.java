package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;

public class VkApplicationInfo extends VulkanCreateInfoStructure
{
    private long                    pNext;
    private String                  applicationName;
    private int                     applicationVersion;
    private String                  engineName;
    private int                     engineVersion;
    private int                     apiVersion;
    
    public VkApplicationInfo()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_APPLICATION_INFO);
    }
    
    public long getpNext()
    {
        return pNext;
    }
    
    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }
    
    public String getApplicationName()
    {
        return applicationName;
    }
    
    public void setApplicationName(String applicationName)
    {
        this.applicationName = applicationName;
    }
    
    public int getApplicationVersion()
    {
        return applicationVersion;
    }
    
    public void setApplicationVersion(int applicationVersion)
    {
        this.applicationVersion = applicationVersion;
    }
    
    public String getEngineName()
    {
        return engineName;
    }
    
    public void setEngineName(String engineName)
    {
        this.engineName = engineName;
    }
    
    public int getEngineVersion()
    {
        return engineVersion;
    }
    
    public void setEngineVersion(int engineVersion)
    {
        this.engineVersion = engineVersion;
    }
    
    public int getApiVersion()
    {
        return apiVersion;
    }
    
    public void setApiVersion(int apiVersion)
    {
        this.apiVersion = apiVersion;
    }
}
