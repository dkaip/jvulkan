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

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Handles.VkFence;
import com.CIMthetics.jvulkan.VulkanCore.Handles.VkSemaphore;
import com.CIMthetics.jvulkan.VulkanCore.Handles.VkSwapchainKHR;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkAcquireNextImageInfoKHR extends VulkanCreateInfoStructure
{
    private VkSwapchainKHR  swapchain;
    private long            timeout;
    private VkSemaphore     semaphore;
    private VkFence         fence;
    private int             deviceMask;

    public VkAcquireNextImageInfoKHR()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_ACQUIRE_NEXT_IMAGE_INFO_KHR);
    }

    public VkSwapchainKHR getSwapchain()
    {
        return swapchain;
    }

    public void setSwapchain(VkSwapchainKHR swapchain)
    {
        this.swapchain = swapchain;
    }

    public long getTimeout()
    {
        return timeout;
    }

    public void setTimeout(long timeout)
    {
        this.timeout = timeout;
    }

    public VkSemaphore getSemaphore()
    {
        return semaphore;
    }

    public void setSemaphore(VkSemaphore semaphore)
    {
        this.semaphore = semaphore;
    }

    public VkFence getFence()
    {
        return fence;
    }

    public void setFence(VkFence fence)
    {
        this.fence = fence;
    }

    public int getDeviceMask()
    {
        return deviceMask;
    }

    public void setDeviceMask(int deviceMask)
    {
        this.deviceMask = deviceMask;
    }
    
}
