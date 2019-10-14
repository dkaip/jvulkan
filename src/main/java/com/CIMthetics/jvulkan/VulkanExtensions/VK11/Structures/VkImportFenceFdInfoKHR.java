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

import java.util.EnumSet;

import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkExternalFenceHandleTypeFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkFenceImportFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Handles.VkFence;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkImportFenceFdInfoKHR extends VulkanCreateInfoStructure
{
    private VkFence                             fence;
    private EnumSet<VkFenceImportFlagBits>      flags = EnumSet.noneOf(VkFenceImportFlagBits.class);
    private VkExternalFenceHandleTypeFlagBits   handleType;
    int                                         fd;

    public VkImportFenceFdInfoKHR()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_IMPORT_FENCE_FD_INFO_KHR);
    }

    public VkFence getFence()
    {
        return fence;
    }

    public void setFence(VkFence fence)
    {
        this.fence = fence;
    }

    public EnumSet<VkFenceImportFlagBits> getFlags()
    {
        return flags;
    }

    public void setFlags(EnumSet<VkFenceImportFlagBits> flags)
    {
        this.flags = flags;
    }

    public VkExternalFenceHandleTypeFlagBits getHandleType()
    {
        return handleType;
    }

    public void setHandleType(VkExternalFenceHandleTypeFlagBits handleType)
    {
        this.handleType = handleType;
    }

    public int getFd()
    {
        return fd;
    }

    public void setFd(int fd)
    {
        this.fd = fd;
    }

}
