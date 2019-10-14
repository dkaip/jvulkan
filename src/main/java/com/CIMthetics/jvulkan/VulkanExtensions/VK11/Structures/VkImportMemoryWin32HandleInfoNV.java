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

import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Handles.VulkanHandle;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Enums.VkExternalMemoryHandleTypeFlagBitsNV;

public class VkImportMemoryWin32HandleInfoNV extends VulkanCreateInfoStructure
{
    private VkExternalMemoryHandleTypeFlagBitsNV    handleType;
    private VulkanHandle                            handle;

    public VkImportMemoryWin32HandleInfoNV()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_IMPORT_MEMORY_WIN32_HANDLE_INFO_NV);
    }

    public VkExternalMemoryHandleTypeFlagBitsNV getHandleType()
    {
        return handleType;
    }

    public void setHandleType(VkExternalMemoryHandleTypeFlagBitsNV handleType)
    {
        this.handleType = handleType;
    }

    public VulkanHandle getHandle()
    {
        return handle;
    }

    public void setHandle(VulkanHandle handle)
    {
        this.handle = handle;
    }

}
