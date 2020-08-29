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

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkIndexType;
import com.CIMthetics.jvulkan.VulkanExtensions.Handles.VkDeviceAddress;

public class VkBindIndexBufferIndirectCommandNV
{
    private VkDeviceAddress bufferAddress;
    private int             size;
    private VkIndexType     indexType;
    
    public VkDeviceAddress getBufferAddress()
    {
        return bufferAddress;
    }
    
    public void setBufferAddress(VkDeviceAddress bufferAddress)
    {
        this.bufferAddress = bufferAddress;
    }
    
    public int getSize()
    {
        return size;
    }
    
    public void setSize(int size)
    {
        this.size = size;
    }
    
    public VkIndexType getIndexType()
    {
        return indexType;
    }
    
    public void setIndexType(VkIndexType indexType)
    {
        this.indexType = indexType;
    }
}
