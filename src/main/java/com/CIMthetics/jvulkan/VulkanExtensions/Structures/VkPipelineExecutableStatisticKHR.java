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
package com.CIMthetics.jvulkan.VulkanExtensions.Structures;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VulkanCreateInfoStructure;
import com.CIMthetics.jvulkan.VulkanExtensions.Enums.VkPipelineExecutableStatisticFormatKHR;

public class VkPipelineExecutableStatisticKHR extends VulkanCreateInfoStructure
{
    private boolean booleanValue;
    private long    longValue;
    private double  doubleValue;
    private String  name;
    private String  description;
    private VkPipelineExecutableStatisticFormatKHR  format;
        
    public VkPipelineExecutableStatisticKHR()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_EXECUTABLE_STATISTIC_KHR);
    }

    public boolean getBooleanValue()
    {
        if (format == VkPipelineExecutableStatisticFormatKHR.VK_PIPELINE_EXECUTABLE_STATISTIC_FORMAT_BOOL32_KHR)
        {
            return booleanValue;
        }

        String errorString = 
            "The value type is " + format.toString() + ".  " +
             "  It must be VK_PIPELINE_EXECUTABLE_STATISTIC_FORMAT_BOOL32_KHR in order to use this method " +
             "to retrieve the statistic's value";
        throw new IllegalArgumentException(errorString);
    }

    public void setBooleanValue(boolean booleanValue)
    {
        this.booleanValue = booleanValue;
    }

    /**
     * Return the statistic value as a <code>long</code>.
     * <p>
     * This is used to retrieve data in either 64-bit signed integer or 
     * 64-bit unsigned integer formats. Since Java does not have unsigned 
     * data types you will need to handle the result properly if it is 
     * unsigned and very large.
     * 
     * @return the statistic value as a Java <code>long</code>
     */
    public long getLongValue()
    {
        if (format == VkPipelineExecutableStatisticFormatKHR.VK_PIPELINE_EXECUTABLE_STATISTIC_FORMAT_INT64_KHR ||
            format == VkPipelineExecutableStatisticFormatKHR.VK_PIPELINE_EXECUTABLE_STATISTIC_FORMAT_UINT64_KHR)
        {
            return longValue;
        }

        String errorString = 
                "The value type is " + format.toString() + ".  " +
                 "  It must be VK_PIPELINE_EXECUTABLE_STATISTIC_FORMAT_INT64_KHR or VK_PIPELINE_EXECUTABLE_STATISTIC_FORMAT_UINT64_KHR in order to use this method " +
                 "to retrieve the statistic's value";
            throw new IllegalArgumentException(errorString);
    }

    public void setLongValue(long longValue)
    {
        this.longValue = longValue;
    }

    public double getDoubleValue()
    {
        if (format == VkPipelineExecutableStatisticFormatKHR.VK_PIPELINE_EXECUTABLE_STATISTIC_FORMAT_FLOAT64_KHR)
        {
            return doubleValue;
        }

        String errorString = 
            "The value type is " + format.toString() + ".  " +
             "  It must be VK_PIPELINE_EXECUTABLE_STATISTIC_FORMAT_FLOAT64_KHR in order to use this method " +
             "to retrieve the statistic's value";
        throw new IllegalArgumentException(errorString);
    }

    public void setDoubleValue(double doubleValue)
    {
        this.doubleValue = doubleValue;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public VkPipelineExecutableStatisticFormatKHR getFormat()
    {
        return format;
    }

    public void setFormat(VkPipelineExecutableStatisticFormatKHR format)
    {
        this.format = format;
    }
}
