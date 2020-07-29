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
package com.CIMthetics.jvulkan.VulkanCore.Structures;

public class VkClearColorValue
{
    private float[] floatValues;
    private int[]   intValues;
    private long[]  uintValues;
    
    public VkClearColorValue(float redValue, float greenValue, float blueValue, float alphaValue)
    {
        floatValues = new float[4];
        floatValues[0] = redValue;
        floatValues[1] = greenValue;
        floatValues[2] = blueValue;
        floatValues[3] = alphaValue;
    }

    public VkClearColorValue(int redValue, int greenValue, int blueValue, int alphaValue)
    {
        intValues = new int[4];
        intValues[0] = redValue;
        intValues[1] = greenValue;
        intValues[2] = blueValue;
        intValues[3] = alphaValue;
    }
    
    /**
     * This constructor allows for uint32_t values.
     * 
     * @param redValue
     * @param greenValue
     * @param blueValue
     * @param alphaValue
     */
    public VkClearColorValue(long redValue, long greenValue, long blueValue, long alphaValue)
    {
        uintValues = new long[4];
        uintValues[0] = redValue;
        uintValues[1] = greenValue;
        uintValues[2] = blueValue;
        uintValues[3] = alphaValue;
    }

    public float[] getFloatValues()
    {
        return floatValues;
    }

    public int[] getIntValues()
    {
        return intValues;
    }

    public long[] getUintValues()
    {
        return uintValues;
    }
    
}
