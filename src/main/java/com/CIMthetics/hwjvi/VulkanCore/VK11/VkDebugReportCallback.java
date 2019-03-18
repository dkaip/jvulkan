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
package com.CIMthetics.hwjvi.VulkanCore.VK11;

import java.util.EnumSet;

import com.CIMthetics.hwjvi.VulkanExtensions.VK11.Enums.VkDebugReportFlagBitsEXT;

/**
 * This is the interface that must be implemented in order to receive 
 * callbacks from the Vulkan debug layers.
 * 
 * @author Douglas Kaip
 *
 */
public interface VkDebugReportCallback
{
    /**
     * This is the callback method that is invoked when there is a debug layer
     * issue.
     * 
     * @param flags
     * @param objectType
     * @param object
     * @param location
     * @param messageCode
     * @param layerPrefix
     * @param messageText
     * @param userData
     * @return - this method MUST return false unless you are debugging the validation layers themselves.
     */
    abstract boolean invoke(
            EnumSet<VkDebugReportFlagBitsEXT>   flags,
            int                         objectType,
            long                        object,
            long                        location,
            int                         messageCode,
            String                      layerPrefix,
            String                      messageText,
            Object                      userData);
}
