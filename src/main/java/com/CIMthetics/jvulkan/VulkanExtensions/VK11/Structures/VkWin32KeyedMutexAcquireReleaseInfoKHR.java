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

import java.util.Collection;

import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Handles.VkDeviceMemory;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkWin32KeyedMutexAcquireReleaseInfoKHR extends VulkanCreateInfoStructure
{
    private Collection<VkDeviceMemory>  acquireSyncs;
    private long[]                      acquireKeys;
    private int[]                       acquireTimeouts;
    private Collection<VkDeviceMemory>  releaseSyncs;
    private long[]                      releaseKeys;

    public VkWin32KeyedMutexAcquireReleaseInfoKHR()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_WIN32_KEYED_MUTEX_ACQUIRE_RELEASE_INFO_KHR);
    }

    public Collection<VkDeviceMemory> getAcquireSyncs()
    {
        return acquireSyncs;
    }

    public void setAcquireSyncs(Collection<VkDeviceMemory> acquireSyncs)
    {
        this.acquireSyncs = acquireSyncs;
    }

    public long[] getAcquireKeys()
    {
        return acquireKeys;
    }

    public void setAcquireKeys(long[] acquireKeys)
    {
        this.acquireKeys = acquireKeys;
    }

    public int[] getAcquireTimeouts()
    {
        return acquireTimeouts;
    }

    public void setAcquireTimeouts(int[] acquireTimeouts)
    {
        this.acquireTimeouts = acquireTimeouts;
    }

    public Collection<VkDeviceMemory> getReleaseSyncs()
    {
        return releaseSyncs;
    }

    public void setReleaseSyncs(Collection<VkDeviceMemory> releaseSyncs)
    {
        this.releaseSyncs = releaseSyncs;
    }

    public long[] getReleaseKeys()
    {
        return releaseKeys;
    }

    public void setReleaseKeys(long[] releaseKeys)
    {
        this.releaseKeys = releaseKeys;
    }

}
