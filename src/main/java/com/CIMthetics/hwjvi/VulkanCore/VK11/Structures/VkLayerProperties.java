package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures;

public class VkLayerProperties
{
    private String      layerName;
    private int         specVersion;
    private int         implementationVersion;
    private String      description;
    
    public String getLayerName()
    {
        return layerName;
    }
    
    void setLayerName(String layerName)
    {
        this.layerName = layerName;
    }
    
    public int getSpecVersion()
    {
        return specVersion;
    }
    
    void setSpecVersion(int specVersion)
    {
        this.specVersion = specVersion;
    }
    
    public int getImplementationVersion()
    {
        return implementationVersion;
    }
    
    void setImplementationVersion(int implementationVersion)
    {
        this.implementationVersion = implementationVersion;
    }
    
    public String getDescription()
    {
        return description;
    }
    
    void setDescription(String description)
    {
        this.description = description;
    }
}
