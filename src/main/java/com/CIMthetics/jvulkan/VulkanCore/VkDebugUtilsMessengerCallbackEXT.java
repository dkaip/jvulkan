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
package com.CIMthetics.jvulkan.VulkanCore;

import java.util.EnumSet;

import com.CIMthetics.jvulkan.VulkanExtensions.Enums.VkDebugUtilsMessageSeverityFlagBitsEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.Enums.VkDebugUtilsMessageTypeFlagBitsEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.VkDebugUtilsMessengerCallbackDataEXT;

public interface VkDebugUtilsMessengerCallbackEXT
{
    /**
     * 
     * @param messageSeverity
     * @param messageTypes
     * @param callbackData
     * @param userData
     * @return - this method MUST return <code>false</code> unless you are debugging the validation layers themselves.
     */
    abstract boolean invoke(
            VkDebugUtilsMessageSeverityFlagBitsEXT          messageSeverity,
            EnumSet<VkDebugUtilsMessageTypeFlagBitsEXT>     messageTypes,
            VkDebugUtilsMessengerCallbackDataEXT            callbackData,
            Object                                          userData);
}
