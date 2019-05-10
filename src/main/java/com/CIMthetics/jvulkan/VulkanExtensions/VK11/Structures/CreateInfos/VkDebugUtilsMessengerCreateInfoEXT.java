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

import com.CIMthetics.jvulkan.VulkanCore.VK11.VkDebugUtilsMessengerCallbackEXT;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Enums.VkDebugUtilsMessageSeverityFlagBitsEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Enums.VkDebugUtilsMessageTypeFlagBitsEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Enums.VkDebugUtilsMessengerCreateFlagBitsEXT;

public class VkDebugUtilsMessengerCreateInfoEXT extends VulkanCreateInfoStructure
{
    private EnumSet<VkDebugUtilsMessengerCreateFlagBitsEXT> flags = EnumSet.noneOf(VkDebugUtilsMessengerCreateFlagBitsEXT.class);
    private EnumSet<VkDebugUtilsMessageSeverityFlagBitsEXT> messageSeverity = EnumSet.noneOf(VkDebugUtilsMessageSeverityFlagBitsEXT.class);
    private EnumSet<VkDebugUtilsMessageTypeFlagBitsEXT>     messageType = EnumSet.noneOf(VkDebugUtilsMessageTypeFlagBitsEXT.class);
    private VkDebugUtilsMessengerCallbackEXT                callbackObject;
    private Object                                          userData;
    
    public VkDebugUtilsMessengerCreateInfoEXT()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_DEBUG_UTILS_MESSENGER_CREATE_INFO_EXT);
    }

    public EnumSet<VkDebugUtilsMessengerCreateFlagBitsEXT> getFlags()
    {
        return flags;
    }

    public void setFlags(EnumSet<VkDebugUtilsMessengerCreateFlagBitsEXT> flags)
    {
        this.flags = flags;
    }

    public EnumSet<VkDebugUtilsMessageSeverityFlagBitsEXT> getMessageSeverity()
    {
        return messageSeverity;
    }

    public void setMessageSeverity(
            EnumSet<VkDebugUtilsMessageSeverityFlagBitsEXT> messageSeverity)
    {
        this.messageSeverity = messageSeverity;
    }

    public EnumSet<VkDebugUtilsMessageTypeFlagBitsEXT> getMessageType()
    {
        return messageType;
    }

    public void setMessageType(
            EnumSet<VkDebugUtilsMessageTypeFlagBitsEXT> messageType)
    {
        this.messageType = messageType;
    }

    public VkDebugUtilsMessengerCallbackEXT getCallbackObject()
    {
        return callbackObject;
    }

    public void setCallbackObject(VkDebugUtilsMessengerCallbackEXT callbackObject)
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