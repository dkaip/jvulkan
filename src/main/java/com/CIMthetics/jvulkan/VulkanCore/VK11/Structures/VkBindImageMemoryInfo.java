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

import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Handles.VkDeviceMemory;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Handles.VkImage;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkBindImageMemoryInfo extends VulkanCreateInfoStructure
{
    private long            pNext;
    private VkImage         image;
    private VkDeviceMemory  memory;
    private long            memoryOffset;

    public VkBindImageMemoryInfo()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_INFO);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public VkImage getImage()
    {
        return image;
    }

    public void setImage(VkImage image)
    {
        this.image = image;
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