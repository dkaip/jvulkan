package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures;

public class VkExtensionProperties
{
    private String  extensionName;
    private int     specVersion;
    
    public String getExtensionName()
    {
        return extensionName;
    }
    
    void setExtensionName(String extensionName)
    {
        this.extensionName = extensionName;
    }
    
    public int getSpecVersion()
    {
        return specVersion;
    }
    
    void setSpecVersion(int specVersion)
    {
        this.specVersion = specVersion;
    }
}
