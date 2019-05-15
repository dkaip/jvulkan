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
package com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos;

import java.util.Collection;
import java.util.EnumSet;

import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkInstanceCreateFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkValidationFeaturesEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkValidationFlagsEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.CreateInfos.VkDebugReportCallbackCreateInfoEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.CreateInfos.VkDebugUtilsMessengerCreateInfoEXT;

public class VkInstanceCreateInfo extends VulkanCreateInfoStructure
{
    private EnumSet<VkInstanceCreateFlagBits> flags = EnumSet.noneOf(VkInstanceCreateFlagBits.class);
    private VkApplicationInfo       applicationInfo;
    private Collection<String>      enabledLayerNames;
    private Collection<String>      enabledExtensionNames;
    
    public VkInstanceCreateInfo()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_INSTANCE_CREATE_INFO);
    }
    
    public EnumSet<VkInstanceCreateFlagBits> getFlags()
    {
        return flags;
    }
    
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
    
    @Override
    public void setpNext(VulkanCreateInfoStructure pNext)
    {
        /*
         * Since validation of the full chain must occur in the natives anyway
         * we will only do a simple validation here.
         */
        if ((pNext instanceof VkDebugReportCallbackCreateInfoEXT == true) ||
            (pNext instanceof VkDebugUtilsMessengerCreateInfoEXT == true))
        {
            /*
             * Because there is special processing for the debug callbacks we 
             * cannot, at the moment, handle either of these two in the pNext 
             * chain.
             */
            throw new IllegalArgumentException("Unfortunately VkDebugReportCallbackCreateInfoEXT and VkDebugUtilsMessengerCreateInfoEXT are not supported in the pNext chain at the moment...use vkCreateDebugReportCallbackEXT and / or vkCreateDebugUtilsMessengerEXT");
        }
        else if ((pNext instanceof VkValidationFeaturesEXT == true) ||
            (pNext instanceof VkValidationFlagsEXT == true))
        {
            super.setpNext(pNext);
        }
        else
        {
            throw new IllegalArgumentException("For this class pNext may only be a VkDebugReportCallbackCreateInfoEXT, VkDebugUtilsMessengerCreateInfoEXT, VkValidationFeaturesEXT or VkValidationFlagsEXT");
        }
    }

}
