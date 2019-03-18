package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos;

import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedList;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkDeviceCreateFlagBits;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.VkPhysicalDeviceFeatures;

public class VkDeviceCreateInfo extends VulkanCreateInfoStructure
{
    private long                                    pNext;
    private EnumSet<VkDeviceCreateFlagBits>         flags = EnumSet.noneOf(VkDeviceCreateFlagBits.class);
    private Collection<VkDeviceQueueCreateInfo>     queueCreateInfos;
    private Collection<String>                      enabledLayerNames;
    private Collection<String>                      enabledExtensionNames;
    private VkPhysicalDeviceFeatures                enabledFeatures;

    public VkDeviceCreateInfo()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_DEVICE_CREATE_INFO);
    }
    
    public long getpNext()
    {
        return pNext;
    }
    
    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public EnumSet<VkDeviceCreateFlagBits> getFlags()
    {
        return flags;
    }

//    int getFlagsAsInt()
//    {
//        int result = 0;
//        
//        for (VkDeviceCreateFlagBits flag : flags)
//        {
//            result |= flag.valueOf();
//        }
//            
//        return result;
//    }
//    
    public void setFlags(EnumSet<VkDeviceCreateFlagBits> flags)
    {
        this.flags = flags;
    }

    public Collection<VkDeviceQueueCreateInfo> getQueueCreateInfos()
    {
        return queueCreateInfos;
    }

    public void setQueueCreateInfos(
            Collection<VkDeviceQueueCreateInfo> queueCreateInfos)
    {
        this.queueCreateInfos = queueCreateInfos;
    }

    /**
     * A convienience method in the case where there is only one
     * VkDeviceQueueCreateInfo.
     * 
     * @param queueCreateInfo
     */
    public void setQueueCreateInfos(
            VkDeviceQueueCreateInfo queueCreateInfo)
    {
        this.queueCreateInfos = new LinkedList<VkDeviceQueueCreateInfo>();
        this.queueCreateInfos.add(queueCreateInfo);
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

    public VkPhysicalDeviceFeatures getEnabledFeatures()
    {
        return enabledFeatures;
    }

    public void setEnabledFeatures(VkPhysicalDeviceFeatures enabledFeatures)
    {
        this.enabledFeatures = enabledFeatures;
    }
    
}
