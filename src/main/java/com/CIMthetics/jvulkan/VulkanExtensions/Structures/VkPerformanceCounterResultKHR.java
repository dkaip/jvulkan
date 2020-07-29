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
package com.CIMthetics.jvulkan.VulkanExtensions.Structures;

/**
 * Performance query results are returned in this class.  Since Java does not
 * have unsigned types you will need to use the appropriate signed type and
 * just deal with it.
 *
 */
public class VkPerformanceCounterResultKHR
{
    private int     intValue;
    private long    longValue;
    private float   floatValue;
    private double  doubleValue;
    
    /*
     * Since
     */
    public int getIntValue()
    {
        return intValue;
    }
    
    void setIntValue(int intValue)
    {
        this.intValue = intValue;
    }
    
    public long getLongValue()
    {
        return longValue;
    }
    
    void setLongValue(long longValue)
    {
        this.longValue = longValue;
    }
    
    public float getFloatValue()
    {
        return floatValue;
    }
    
    void setFloatValue(float floatValue)
    {
        this.floatValue = floatValue;
    }
    
    public double getDoubleValue()
    {
        return doubleValue;
    }
    
    void setDoubleValue(double doubleValue)
    {
        this.doubleValue = doubleValue;
    }
}
