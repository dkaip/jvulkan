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

public enum VkTimeDomainEXT
{
    VK_TIME_DOMAIN_DEVICE_EXT(0),
    VK_TIME_DOMAIN_CLOCK_MONOTONIC_EXT(1),
    VK_TIME_DOMAIN_CLOCK_MONOTONIC_RAW_EXT(2),
    VK_TIME_DOMAIN_QUERY_PERFORMANCE_COUNTER_EXT(3),
    VK_TIME_DOMAIN_MAX_ENUM_EXT(0x7FFFFFFF);

    private int value;
    
    private VkTimeDomainEXT(int value) { this.value = value; }
    
    public int valueOf() { return value; }

    static VkTimeDomainEXT fromValue(int inputValue)
    {
        VkTimeDomainEXT result = null;
        
        switch(inputValue)
        {
            case 0:
                result = VK_TIME_DOMAIN_DEVICE_EXT;
                break;
            case 1:
                result = VK_TIME_DOMAIN_CLOCK_MONOTONIC_EXT;
                break;
            case 2:
                result = VK_TIME_DOMAIN_CLOCK_MONOTONIC_RAW_EXT;
                break;
            case 3:
                result =  VK_TIME_DOMAIN_QUERY_PERFORMANCE_COUNTER_EXT;
                break;
            case 0x7FFFFFFF:
                result = VK_TIME_DOMAIN_MAX_ENUM_EXT;
                break;
        }

        if (result == null)
            throw new IllegalArgumentException("Illegal value specified for this Enum.");

        return result;
    }
}
