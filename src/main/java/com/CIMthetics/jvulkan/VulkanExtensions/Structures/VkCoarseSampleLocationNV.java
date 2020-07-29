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

public class VkCoarseSampleLocationNV
{
    private int pixelX;
    private int pixelY;
    private int sample;
    
    public int getPixelX()
    {
        return pixelX;
    }
    
    public void setPixelX(int pixelX)
    {
        this.pixelX = pixelX;
    }
    
    public int getPixelY()
    {
        return pixelY;
    }
    
    public void setPixelY(int pixelY)
    {
        this.pixelY = pixelY;
    }
    
    public int getSample()
    {
        return sample;
    }
    
    public void setSample(int sample)
    {
        this.sample = sample;
    }
}
