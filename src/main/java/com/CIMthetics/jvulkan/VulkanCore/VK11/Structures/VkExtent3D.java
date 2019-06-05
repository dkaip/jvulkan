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
package com.CIMthetics.jvulkan.VulkanCore.VK11.Structures;

public class VkExtent3D
{
    private int width;
    private int height;
    private int depth;
    
    /**
     * 
     * @param width
     * @param height
     * @param depth
     */
    public VkExtent3D(int width, int height, int depth)
    {
        this.width  = width;
        this.height = height;
        this.depth  = depth;
    }
    
    public VkExtent3D()
    {
    }
    
    public int getWidth()
    {
        return width;
    }
    
    void setWidth(int width)
    {
        this.width = width;
    }
    
    public int getHeight()
    {
        return height;
    }
    
    void setHeight(int height)
    {
        this.height = height;
    }
    
    public int getDepth()
    {
        return depth;
    }
    
    void setDepth(int depth)
    {
        this.depth = depth;
    }
    
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\nVkExtent3D\n"));
        sb.append(String.format("    width:%d\n", width));
        sb.append(String.format("    height:%d\n", height));
        sb.append(String.format("    depth:%d\n", depth));
        
        return sb.toString();
    }
}
