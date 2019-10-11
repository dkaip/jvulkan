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
package com.CIMthetics.jvulkan.VulkanExtensions.VK11.Enums;

public enum VkPipelineExecutableStatisticFormatKHR
{
    VK_PIPELINE_EXECUTABLE_STATISTIC_FORMAT_BOOL32_KHR(0),
    VK_PIPELINE_EXECUTABLE_STATISTIC_FORMAT_INT64_KHR(1),
    VK_PIPELINE_EXECUTABLE_STATISTIC_FORMAT_UINT64_KHR(2),
    VK_PIPELINE_EXECUTABLE_STATISTIC_FORMAT_FLOAT64_KHR(3),
    VK_PIPELINE_EXECUTABLE_STATISTIC_FORMAT_BEGIN_RANGE_KHR(VK_PIPELINE_EXECUTABLE_STATISTIC_FORMAT_BOOL32_KHR.valueOf()),
    VK_PIPELINE_EXECUTABLE_STATISTIC_FORMAT_END_RANGE_KHR(VK_PIPELINE_EXECUTABLE_STATISTIC_FORMAT_FLOAT64_KHR.valueOf()),
    VK_PIPELINE_EXECUTABLE_STATISTIC_FORMAT_RANGE_SIZE_KHR(VK_PIPELINE_EXECUTABLE_STATISTIC_FORMAT_FLOAT64_KHR.valueOf() - VK_PIPELINE_EXECUTABLE_STATISTIC_FORMAT_BOOL32_KHR.valueOf() + 1),
    VK_PIPELINE_EXECUTABLE_STATISTIC_FORMAT_MAX_ENUM_KHR(0x7FFFFFFF);

    private int value;
    
    private VkPipelineExecutableStatisticFormatKHR(int value) { this.value = value; }
    
    public int valueOf() { return value; }

    static VkPipelineExecutableStatisticFormatKHR fromValue(int inputValue)
    {
        VkPipelineExecutableStatisticFormatKHR result = null;
        
        switch(inputValue)
        {
            case 0:
                result = VK_PIPELINE_EXECUTABLE_STATISTIC_FORMAT_BOOL32_KHR;
                break;
            case 1:
                result = VK_PIPELINE_EXECUTABLE_STATISTIC_FORMAT_INT64_KHR;
                break;
            case 2:
                result = VK_PIPELINE_EXECUTABLE_STATISTIC_FORMAT_UINT64_KHR;
                break;
            case 3:
                result = VK_PIPELINE_EXECUTABLE_STATISTIC_FORMAT_FLOAT64_KHR;
                break;
            case 0x7FFFFFFF:
                result = VK_PIPELINE_EXECUTABLE_STATISTIC_FORMAT_MAX_ENUM_KHR;
                break;
        }

        if (inputValue == (VK_PIPELINE_EXECUTABLE_STATISTIC_FORMAT_FLOAT64_KHR.valueOf() - VK_PIPELINE_EXECUTABLE_STATISTIC_FORMAT_BOOL32_KHR.valueOf() + 1))
            result = VK_PIPELINE_EXECUTABLE_STATISTIC_FORMAT_RANGE_SIZE_KHR;
        
        if (result == null)
            throw new IllegalArgumentException("Illegal value specified for this Enum.");

        return result;
    }
}
