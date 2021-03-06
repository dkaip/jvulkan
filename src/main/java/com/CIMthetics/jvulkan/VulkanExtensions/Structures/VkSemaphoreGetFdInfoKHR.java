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

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkExternalSemaphoreHandleTypeFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Handles.VkSemaphore;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkSemaphoreGetFdInfoKHR extends VulkanCreateInfoStructure
{
    private VkSemaphore                              semaphore;
    private VkExternalSemaphoreHandleTypeFlagBits    handleType;

    public VkSemaphoreGetFdInfoKHR()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_SEMAPHORE_GET_FD_INFO_KHR);
    }

    public VkSemaphore getSemaphore()
    {
        return semaphore;
    }

    public void setSemaphore(VkSemaphore semaphore)
    {
        this.semaphore = semaphore;
    }

    public VkExternalSemaphoreHandleTypeFlagBits getHandleType()
    {
        return handleType;
    }

    public void setHandleType(VkExternalSemaphoreHandleTypeFlagBits handleType)
    {
        this.handleType = handleType;
    }

}
