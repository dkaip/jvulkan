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
package com.CIMthetics.jvulkan.VulkanExtensions.Structures;

import java.util.Collection;
import java.util.EnumSet;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VulkanCreateInfoStructure;
import com.CIMthetics.jvulkan.VulkanExtensions.Enums.VkDebugUtilsMessengerCallbackDataFlagBitsEXT;

public class VkDebugUtilsMessengerCallbackDataEXT extends VulkanCreateInfoStructure
{
    private EnumSet<VkDebugUtilsMessengerCallbackDataFlagBitsEXT>   flags = EnumSet.noneOf(VkDebugUtilsMessengerCallbackDataFlagBitsEXT.class);
    private String                                                  messageIdName;
    private int                                                     messageIdNumber;
    private String                                                  message;
    private Collection<VkDebugUtilsLabelEXT>                        queueLabels;
    private Collection<VkDebugUtilsLabelEXT>                        cmdBufLabels;
    private Collection<VkDebugUtilsObjectNameInfoEXT>               objects;

    public VkDebugUtilsMessengerCallbackDataEXT()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_DEBUG_UTILS_MESSENGER_CALLBACK_DATA_EXT);
    }

    public EnumSet<VkDebugUtilsMessengerCallbackDataFlagBitsEXT> getFlags()
    {
        return flags;
    }

    public void setFlags(
            EnumSet<VkDebugUtilsMessengerCallbackDataFlagBitsEXT> flags)
    {
        this.flags = flags;
    }

    public String getMessageIdName()
    {
        return messageIdName;
    }

    public void setMessageIdName(String messageIdName)
    {
        this.messageIdName = messageIdName;
    }

    public int getMessageIdNumber()
    {
        return messageIdNumber;
    }

    public void setMessageIdNumber(int messageIdNumber)
    {
        this.messageIdNumber = messageIdNumber;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    public Collection<VkDebugUtilsLabelEXT> getQueueLabels()
    {
        return queueLabels;
    }

    public void setQueueLabels(Collection<VkDebugUtilsLabelEXT> queueLabels)
    {
        this.queueLabels = queueLabels;
    }

    public Collection<VkDebugUtilsLabelEXT> getCmdBufLabels()
    {
        return cmdBufLabels;
    }

    public void setCmdBufLabels(Collection<VkDebugUtilsLabelEXT> cmdBufLabels)
    {
        this.cmdBufLabels = cmdBufLabels;
    }

    public Collection<VkDebugUtilsObjectNameInfoEXT> getObjects()
    {
        return objects;
    }

    public void setObjects(Collection<VkDebugUtilsObjectNameInfoEXT> objects)
    {
        this.objects = objects;
    }
    
}
