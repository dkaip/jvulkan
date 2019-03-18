package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos;

import java.util.Collection;
import java.util.EnumSet;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkInstanceCreateFlagBits;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;

public class VkInstanceCreateInfo extends VulkanCreateInfoStructure
{
    private long                    pNext;
    private EnumSet<VkInstanceCreateFlagBits> flags = EnumSet.noneOf(VkInstanceCreateFlagBits.class);
    private VkApplicationInfo       applicationInfo;
    private Collection<String>      enabledLayerNames;
    private Collection<String>      enabledExtensionNames;
    
    public VkInstanceCreateInfo()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_INSTANCE_CREATE_INFO);
    }
    
    public long getpNext()
    {
        return pNext;
    }
    
    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }
    
    public EnumSet<VkInstanceCreateFlagBits> getFlags()
    {
        return flags;
    }
    
//    int getFlagsAsInt()
//    {
//        int result = 0;
//        
//        for (VkInstanceCreateFlags flag : flags)
//        {
//            result |= flag.valueOf();
//        }
//            
//        return result;
//    }
//    
    public void setFlags(EnumSet<VkInstanceCreateFlagBits> flags)
    {
        if (flags != null)
            this.flags = flags;
        else
            this.flags = EnumSet.noneOf(VkInstanceCreateFlagBits.class);
    }
    
    public VkApplicationInfo getApplicationInfo()
    {
        return applicationInfo;
    }
    
    public void setApplicationInfo(VkApplicationInfo applicationInfo)
    {
        this.applicationInfo = applicationInfo;
    }
    
    public Collection<String> getEnabledLayerNames()
    {
        return enabledLayerNames;
    }
    
    public void setEnabledLayerNames(Collection<String> enabledLayerNames)
    {
        this.enabledLayerNames = enabledLayerNames;
    }
    
    public Collection<String> getEnabledExtensionNames()
    {
        return enabledExtensionNames;
    }
    
    public void setEnabledExtensionNames(Collection<String> enabledExtensionNames)
    {
        this.enabledExtensionNames = enabledExtensionNames;
    }
}
