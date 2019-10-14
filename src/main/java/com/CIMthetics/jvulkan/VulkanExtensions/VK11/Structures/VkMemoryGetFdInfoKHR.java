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
package com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures;

import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkExternalMemoryHandleTypeFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Handles.VkDeviceMemory;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkMemoryGetFdInfoKHR extends VulkanCreateInfoStructure
{
    private VkDeviceMemory                        memory;
    private VkExternalMemoryHandleTypeFlagBits    handleType;

    public VkMemoryGetFdInfoKHR()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_MEMORY_GET_FD_INFO_KHR);
    }

    public VkDeviceMemory getMemory()
    {
        return memory;
    }

    public void setMemory(VkDeviceMemory memory)
    {
        this.memory = memory;
    }

    public VkExternalMemoryHandleTypeFlagBits getHandleType()
    {
        return handleType;
    }

    public void setHandleType(VkExternalMemoryHandleTypeFlagBits handleType)
    {
        this.handleType = handleType;
    }

}
