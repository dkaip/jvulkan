/*
 * Copyright 2019-2020 Douglas Kaip
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
package com.CIMthetics.jvulkan.VulkanExtensions.Enums;

public enum VkDebugUtilsMessageSeverityFlagBitsEXT
{
    VK_DEBUG_UTILS_MESSAGE_SEVERITY_VERBOSE_BIT_EXT(0x00000001),
    VK_DEBUG_UTILS_MESSAGE_SEVERITY_INFO_BIT_EXT(0x00000010),
    VK_DEBUG_UTILS_MESSAGE_SEVERITY_WARNING_BIT_EXT(0x00000100),
    VK_DEBUG_UTILS_MESSAGE_SEVERITY_ERROR_BIT_EXT(0x00001000),
    VK_DEBUG_UTILS_MESSAGE_SEVERITY_FLAG_BITS_MAX_ENUM_EXT(0x7FFFFFFF);

    private int value;
    
    private VkDebugUtilsMessageSeverityFlagBitsEXT(int value) { this.value = value; }
    
    public int valueOf() { return value; }
    
    static VkDebugUtilsMessageSeverityFlagBitsEXT fromValue(int inputValue)
    {
        VkDebugUtilsMessageSeverityFlagBitsEXT result = null;
        
        switch(inputValue)
        {
            case 0x00000001:
                result = VK_DEBUG_UTILS_MESSAGE_SEVERITY_VERBOSE_BIT_EXT;
                break;
            case 0x00000010:
                result = VK_DEBUG_UTILS_MESSAGE_SEVERITY_INFO_BIT_EXT;
                break;
            case 0x00000100:
                result = VK_DEBUG_UTILS_MESSAGE_SEVERITY_WARNING_BIT_EXT;
                break;
            case 0x00001000:
                result = VK_DEBUG_UTILS_MESSAGE_SEVERITY_ERROR_BIT_EXT;
                break;
        }

        if (result == null)
            throw new IllegalArgumentException("Illegal value specified for this Enum.");

        return result;
    }
}
