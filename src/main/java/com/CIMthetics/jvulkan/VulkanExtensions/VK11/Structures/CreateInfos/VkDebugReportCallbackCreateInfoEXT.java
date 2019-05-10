/*
 * Copyright 2019 Douglas Kaip
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.CreateInfos;


import java.util.EnumSet;

import com.CIMthetics.jvulkan.VulkanCore.VK11.VkDebugReportCallback;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Enums.VkDebugReportFlagBitsEXT;


/**
 * 
 * @author Douglas Kaip
 *
 */
public class VkDebugReportCallbackCreateInfoEXT extends VulkanCreateInfoStructure
{
    private EnumSet<VkDebugReportFlagBitsEXT> flags = EnumSet.noneOf(VkDebugReportFlagBitsEXT.class);
    private VkDebugReportCallback   callbackObject;
    private Object                  userData;
    
    public VkDebugReportCallbackCreateInfoEXT()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_DEBUG_REPORT_CALLBACK_CREATE_INFO_EXT);
    }
    
    public EnumSet<VkDebugReportFlagBitsEXT> getFlags()
    {
        return flags;
    }
    
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
