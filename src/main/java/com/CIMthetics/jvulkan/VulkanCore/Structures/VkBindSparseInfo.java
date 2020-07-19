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

import java.util.Collection;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Handles.VkSemaphore;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkBindSparseInfo extends VulkanCreateInfoStructure
{
    private Collection<VkSemaphore>                         waitSemaphores;
    private Collection<VkSparseBufferMemoryBindInfo>        bufferBinds;
    private Collection<VkSparseImageOpaqueMemoryBindInfo>   imageOpaqueBinds;
    private Collection<VkSparseImageMemoryBindInfo>         imageBinds;
    private Collection<VkSemaphore>                         signalSemaphores;

    public VkBindSparseInfo()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_BIND_SPARSE_INFO);
    }

    public Collection<VkSemaphore> getWaitSemaphores()
    {
        return waitSemaphores;
    }

    public void setWaitSemaphores(Collection<VkSemaphore> waitSemaphores)
    {
        this.waitSemaphores = waitSemaphores;
    }

    public Collection<VkSparseBufferMemoryBindInfo> getBufferBinds()
    {
        return bufferBinds;
    }

    public void setBufferBinds(Collection<VkSparseBufferMemoryBindInfo> bufferBinds)
    {
        this.bufferBinds = bufferBinds;
    }

    public Collection<VkSparseImageOpaqueMemoryBindInfo> getImageOpaqueBinds()
    {
        return imageOpaqueBinds;
    }

    public void setImageOpaqueBinds(
            Collection<VkSparseImageOpaqueMemoryBindInfo> imageOpaqueBinds)
    {
        this.imageOpaqueBinds = imageOpaqueBinds;
    }

    public Collection<VkSparseImageMemoryBindInfo> getImageBinds()
    {
        return imageBinds;
    }

    public void setImageBinds(Collection<VkSparseImageMemoryBindInfo> imageBinds)
    {
        this.imageBinds = imageBinds;
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
