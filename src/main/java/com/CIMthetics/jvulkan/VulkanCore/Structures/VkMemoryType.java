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

import java.util.EnumSet;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkMemoryPropertyFlagBits;

public class VkMemoryType
{
    private EnumSet<VkMemoryPropertyFlagBits>   propertyFlags = EnumSet.noneOf(VkMemoryPropertyFlagBits.class);
    private int                                 heapIndex;
    
    public VkMemoryType()
    {
    }
    
    public VkMemoryType(EnumSet<VkMemoryPropertyFlagBits> propertyFlags, int heapIndex)
    {
        if (propertyFlags == null)
            this.propertyFlags = EnumSet.noneOf(VkMemoryPropertyFlagBits.class);
        else
            this.propertyFlags = propertyFlags;
        
        this.heapIndex     = heapIndex;
    }
    
    public EnumSet<VkMemoryPropertyFlagBits> getPropertyFlags()
    {
        return propertyFlags;
    }
    
    public void setPropertyFlags(EnumSet<VkMemoryPropertyFlagBits> propertyFlags)
    {
        this.propertyFlags = propertyFlags;
    }
    
    public int getHeapIndex()
    {
        return heapIndex;
    }
    
    public void setHeapIndex(int heapIndex)
    {
        this.heapIndex = heapIndex;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\nVkMemoryType\n"));
        sb.append(String.format("    propertyFlags:%s\n", propertyFlags.toString()));
        sb.append(String.format("    heapIndex:%d\n", heapIndex));
        
        return sb.toString();
    }
}
