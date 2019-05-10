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
package com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos;

import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedList;

import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkPipelineStageFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Handles.VkCommandBuffer;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Handles.VkSemaphore;

public class VkSubmitInfo extends VulkanCreateInfoStructure
{
    private Collection<VkSemaphore>                         waitSemaphores;
    private Collection<EnumSet<VkPipelineStageFlagBits>>    waitDstStageMask;
    private Collection<VkCommandBuffer>                     commandBuffers;
    private Collection<VkSemaphore>                         signalSemaphores;
    
    public VkSubmitInfo()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_SUBMIT_INFO);
    }

    public Collection<VkSemaphore> getWaitSemaphores()
    {
        return waitSemaphores;
    }

    public void setWaitSemaphores(Collection<VkSemaphore> waitSemaphores)
    {
        this.waitSemaphores = waitSemaphores;
    }

    public Collection<EnumSet<VkPipelineStageFlagBits>> getWaitDstStageMask()
    {
        return waitDstStageMask;
    }

    public void setWaitDstStageMask(
            Collection<EnumSet<VkPipelineStageFlagBits>> waitDstStageMask)
    {
        this.waitDstStageMask = waitDstStageMask;
    }

    public Collection<VkCommandBuffer> getCommandBuffers()
    {
        return commandBuffers;
    }

    public void setCommandBuffers(Collection<VkCommandBuffer> commandBuffers)
    {
        this.commandBuffers = commandBuffers;
    }

    public void setCommandBuffers(VkCommandBuffer commandBuffer)
    {
        this.commandBuffers = new LinkedList<VkCommandBuffer>();
        this.commandBuffers.add(commandBuffer);
    }

    public Collection<VkSemaphore> getSignalSemaphores()
    {
        return signalSemaphores;
    }

    public void setSignalSemaphores(Collection<VkSemaphore> signalSemaphores)
    {
        this.signalSemaphores = signalSemaphores;
    }
    
}
