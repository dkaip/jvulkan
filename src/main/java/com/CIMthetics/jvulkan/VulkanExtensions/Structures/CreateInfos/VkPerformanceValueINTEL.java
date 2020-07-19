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
package com.CIMthetics.jvulkan.VulkanExtensions.Structures.CreateInfos;

import com.CIMthetics.jvulkan.VulkanExtensions.Structures.VkPerformanceValueTypeINTEL;

public class VkPerformanceValueINTEL
{
    private int     intData;
    private long    longData;
    private float   floatData;
    private boolean booleanData;
    private String  stringData;
    private VkPerformanceValueTypeINTEL type;
    
    VkPerformanceValueINTEL()
    {
    }

    public int getIntData()
    {
        if (type == VkPerformanceValueTypeINTEL.VK_PERFORMANCE_VALUE_TYPE_UINT32_INTEL)
        {
            return intData;
        }

        String errorString = 
            "The type is " + type.toString() + ".  " +
             "  It must be VK_PERFORMANCE_VALUE_TYPE_UINT32_INTEL in order to use this method " +
             "to retrieve the performance value";
        throw new IllegalArgumentException(errorString);
    }

    public void setIntData(int intData)
    {
        this.intData = intData;
    }

    public long getLongData()
    {
        if (type == VkPerformanceValueTypeINTEL.VK_PERFORMANCE_VALUE_TYPE_UINT64_INTEL)
        {
            return longData;
        }

        String errorString = 
            "The type is " + type.toString() + ".  " +
             "  It must be VK_PERFORMANCE_VALUE_TYPE_UINT64_INTEL in order to use this method " +
             "to retrieve the performance value";
        throw new IllegalArgumentException(errorString);
    }

    public void setLongData(long longData)
    {
        this.longData = longData;
    }

    public float getFloatData()
    {
        if (type == VkPerformanceValueTypeINTEL.VK_PERFORMANCE_VALUE_TYPE_FLOAT_INTEL)
        {
            return floatData;
        }

        String errorString = 
            "The type is " + type.toString() + ".  " +
             "  It must be VK_PERFORMANCE_VALUE_TYPE_FLOAT_INTEL in order to use this method " +
             "to retrieve the performance value";
        throw new IllegalArgumentException(errorString);
    }

    public void setFloatData(float floatData)
    {
        this.floatData = floatData;
    }

    public boolean isBooleanData()
    {
        if (type == VkPerformanceValueTypeINTEL.VK_PERFORMANCE_VALUE_TYPE_BOOL_INTEL)
        {
            return booleanData;
        }

        String errorString = 
            "The type is " + type.toString() + ".  " +
             "  It must be VK_PERFORMANCE_VALUE_TYPE_BOOL_INTEL in order to use this method " +
             "to retrieve the performance value";
        throw new IllegalArgumentException(errorString);
    }

    public void setBooleanData(boolean booleanData)
    {
        this.booleanData = booleanData;
    }

    public String getStringData()
    {
        if (type == VkPerformanceValueTypeINTEL.VK_PERFORMANCE_VALUE_TYPE_STRING_INTEL)
        {
            return stringData;
        }

        String errorString = 
            "The type is " + type.toString() + ".  " +
             "  It must be VK_PERFORMANCE_VALUE_TYPE_STRING_INTEL in order to use this method " +
             "to retrieve the performance value";
        throw new IllegalArgumentException(errorString);
    }

    public void setStringData(String stringData)
    {
        this.stringData = stringData;
    }

    public VkPerformanceValueTypeINTEL getType()
    {
        return type;
    }

    public void setType(VkPerformanceValueTypeINTEL type)
    {
        this.type = type;
    }
    
}
