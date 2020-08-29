/*
 * Copyright 2020 Douglas Kaip
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

public enum VkPerformanceCounterStorageKHR
{
    VK_PERFORMANCE_COUNTER_STORAGE_INT32_KHR(0),
    VK_PERFORMANCE_COUNTER_STORAGE_INT64_KHR(1),
    VK_PERFORMANCE_COUNTER_STORAGE_UINT32_KHR(2),
    VK_PERFORMANCE_COUNTER_STORAGE_UINT64_KHR(3),
    VK_PERFORMANCE_COUNTER_STORAGE_FLOAT32_KHR(4),
    VK_PERFORMANCE_COUNTER_STORAGE_FLOAT64_KHR(5),
    VK_PERFORMANCE_COUNTER_STORAGE_MAX_ENUM_KHR(0x7FFFFFFF);

    private int value;
    
    private VkPerformanceCounterStorageKHR(int value) { this.value = value; }
    
    public int valueOf() { return value; }
    
    static VkPerformanceCounterStorageKHR fromValue(int inputValue)
    {
        VkPerformanceCounterStorageKHR result = null;
        
        switch(inputValue)
        {
            case 0:
                result = VK_PERFORMANCE_COUNTER_STORAGE_INT32_KHR;
                break;
            case 1:
                result = VK_PERFORMANCE_COUNTER_STORAGE_INT64_KHR;
                break;
            case 2:
                result = VK_PERFORMANCE_COUNTER_STORAGE_UINT32_KHR;
                break;
            case 3:
                result = VK_PERFORMANCE_COUNTER_STORAGE_UINT64_KHR;
                break;
            case 4:
                result = VK_PERFORMANCE_COUNTER_STORAGE_FLOAT32_KHR;
                break;
            case 5:
                result = VK_PERFORMANCE_COUNTER_STORAGE_FLOAT64_KHR;
                break;
        }

        if (result == null)
            throw new IllegalArgumentException("Illegal value specified for this Enum.");

        return result;
    }
}
