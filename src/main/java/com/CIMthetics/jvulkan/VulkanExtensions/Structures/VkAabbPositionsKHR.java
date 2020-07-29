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

public class VkAabbPositionsKHR
{
    private float    minX;
    private float    minY;
    private float    minZ;
    private float    maxX;
    private float    maxY;
    private float    maxZ;
    
    public float getMinX()
    {
        return minX;
    }
    
    public void setMinX(float minX)
    {
        this.minX = minX;
    }
    
    public float getMinY()
    {
        return minY;
    }
    
    public void setMinY(float minY)
    {
        this.minY = minY;
    }
    
    public float getMinZ()
    {
        return minZ;
    }
    
    public void setMinZ(float minZ)
    {
        this.minZ = minZ;
    }
    
    public float getMaxX()
    {
        return maxX;
    }
    
    public void setMaxX(float maxX)
    {
        this.maxX = maxX;
    }
    
    public float getMaxY()
    {
        return maxY;
    }
    
    public void setMaxY(float maxY)
    {
        this.maxY = maxY;
    }
    
    public float getMaxZ()
    {
        return maxZ;
    }
    
    public void setMaxZ(float maxZ)
    {
        this.maxZ = maxZ;
    }
}
