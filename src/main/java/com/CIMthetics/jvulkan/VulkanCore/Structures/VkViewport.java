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

public class VkViewport
{
    private float    x;
    private float    y;
    private float    width;
    private float    height;
    private float    minDepth;
    private float    maxDepth;
    
    public float getX()
    {
        return x;
    }
    
    public void setX(float x)
    {
        this.x = x;
    }
    
    public float getY()
    {
        return y;
    }
    
    public void setY(float y)
    {
        this.y = y;
    }
    
    public float getWidth()
    {
        return width;
    }
    
    public void setWidth(float width)
    {
        this.width = width;
    }
    
    public float getHeight()
    {
        return height;
    }
    
    public void setHeight(float height)
    {
        this.height = height;
    }
    
    public float getMinDepth()
    {
        return minDepth;
    }
    
    public void setMinDepth(float minDepth)
    {
        this.minDepth = minDepth;
    }
    
    public float getMaxDepth()
    {
        return maxDepth;
    }
    
    public void setMaxDepth(float maxDepth)
    {
        this.maxDepth = maxDepth;
    }
}