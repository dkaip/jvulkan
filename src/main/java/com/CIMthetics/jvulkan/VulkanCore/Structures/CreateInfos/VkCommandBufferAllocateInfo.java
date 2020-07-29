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
package com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkCommandBufferLevel;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Handles.VkCommandPool;

public class VkCommandBufferAllocateInfo extends VulkanCreateInfoStructure
{
    private VkCommandPool           commandPool;
    private VkCommandBufferLevel    level;
    private int                     commandBufferCount;
    
    public VkCommandBufferAllocateInfo()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_COMMAND_BUFFER_ALLOCATE_INFO);
    }

    public VkCommandPool getCommandPool()
    {
        return commandPool;
    }

    public void setCommandPool(VkCommandPool commandPool)
    {
        this.commandPool = commandPool;
    }

    public VkCommandBufferLevel getLevel()
    {
        return level;
    }

    public void setLevel(VkCommandBufferLevel level)
    {
        this.level = level;
    }

    public int getCommandBufferCount()
    {
        return commandBufferCount;
    }

    public void setCommandBufferCount(int commandBufferCount)
    {
        this.commandBufferCount = commandBufferCount;
    }

}
