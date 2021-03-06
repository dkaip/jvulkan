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

import java.util.EnumSet;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VulkanCreateInfoStructure;
import com.CIMthetics.jvulkan.VulkanExtensions.Enums.VkAcquireProfilingLockFlagBitsKHR;

public class VkAcquireProfilingLockInfoKHR extends VulkanCreateInfoStructure
{
    private EnumSet<VkAcquireProfilingLockFlagBitsKHR>  flags = EnumSet.noneOf(VkAcquireProfilingLockFlagBitsKHR.class);
    private long                                        timeout;

    public VkAcquireProfilingLockInfoKHR()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_ACQUIRE_PROFILING_LOCK_INFO_KHR);
    }

    public EnumSet<VkAcquireProfilingLockFlagBitsKHR> getFlags()
    {
        return flags;
    }

    public void setFlags(EnumSet<VkAcquireProfilingLockFlagBitsKHR> flags)
    {
        this.flags = flags;
    }

    public long getTimeout()
    {
        return timeout;
    }

    public void setTimeout(long timeout)
    {
        this.timeout = timeout;
    }
}
