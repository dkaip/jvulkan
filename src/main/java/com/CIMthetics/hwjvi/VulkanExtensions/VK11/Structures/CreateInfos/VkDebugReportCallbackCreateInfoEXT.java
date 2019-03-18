package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Structures.CreateInfos;


import java.util.EnumSet;

import com.CIMthetics.hwjvi.VulkanCore.VK11.VkDebugReportCallback;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;
import com.CIMthetics.hwjvi.VulkanExtensions.VK11.Enums.VkDebugReportFlagBitsEXT;


/**
 * 
 * @author Douglas Kaip
 *
 */
public class VkDebugReportCallbackCreateInfoEXT extends VulkanCreateInfoStructure
{
    private long                    pNext;
    private EnumSet<VkDebugReportFlagBitsEXT> flags = EnumSet.noneOf(VkDebugReportFlagBitsEXT.class);
    private VkDebugReportCallback   callbackObject;
    private Object                  userData;
    
    public VkDebugReportCallbackCreateInfoEXT()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_DEBUG_REPORT_CALLBACK_CREATE_INFO_EXT);
    }
    
    public long getpNext()
    {
        return pNext;
    }
    
    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }
    
    public EnumSet<VkDebugReportFlagBitsEXT> getFlags()
    {
        return flags;
    }
    
//    public int getFlagsAsInt()
//    {
//        int result = 0;
//        
//        for (VkDebugReportFlagBitsEXT flag : flags)
//        {
//            result |= flag.valueOf();
//        }
//            
//        return result;
//    }
//    
    public void setFlags(EnumSet<VkDebugReportFlagBitsEXT> flags)
    {
        this.flags = flags;
    }
    
    /**
     * This returns the object who's <code>invoke</code> method is called
     * when a Vulkan debug callback is fired off.
     * @return
     */
    public VkDebugReportCallback getCallbackObject()
    {
        return callbackObject;
    }
    
    public void setCallbackObject(VkDebugReportCallback callbackObject)
    {
        this.callbackObject = callbackObject;
    }
    
    public Object getUserData()
    {
        return userData;
    }
    
    public void setUserData(Object userData)
    {
        this.userData = userData;
    }
}
