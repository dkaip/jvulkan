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
package com.CIMthetics.jvulkan.VulkanCore.Structures;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Handles.VkBuffer;
import com.CIMthetics.jvulkan.VulkanCore.Handles.VkDeviceMemory;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkBindBufferMemoryInfo extends VulkanCreateInfoStructure
{
    private VkBuffer        buffer;
    private VkDeviceMemory  memory;
    private long            memoryOffset;

    public VkBindBufferMemoryInfo()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_BIND_BUFFER_MEMORY_INFO);
    }

    public VkBuffer getBuffer()
    {
        return buffer;
    }

    public void setBuffer(VkBuffer buffer)
    {
        this.buffer = buffer;
    }

    public VkDeviceMemory getMemory()
    {
        return memory;
    }

    public void setMemory(VkDeviceMemory memory)
    {
        this.memory = memory;
    }

    public long getMemoryOffset()
    {
        return memoryOffset;
    }

    public void setMemoryOffset(long memoryOffset)
    {
        this.memoryOffset = memoryOffset;
    }

}
