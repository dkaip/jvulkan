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
package com.CIMthetics.jvulkan.VulkanExtensions.Structures;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VulkanCreateInfoStructure;
import com.CIMthetics.jvulkan.VulkanExtensions.Handles.WindowsSecurityAttributes;

public class VkExportSemaphoreWin32HandleInfoKHR extends VulkanCreateInfoStructure
{
    private WindowsSecurityAttributes   attributes;
    private int                         dwAccess;
    private String                      name;
    
    public VkExportSemaphoreWin32HandleInfoKHR()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_EXPORT_SEMAPHORE_WIN32_HANDLE_INFO_KHR);
    }

    public WindowsSecurityAttributes getAttributes()
    {
        return attributes;
    }

    public void setAttributes(WindowsSecurityAttributes attributes)
    {
        this.attributes = attributes;
    }

    public int getDwAccess()
    {
        return dwAccess;
    }

    public void setDwAccess(int dwAccess)
    {
        this.dwAccess = dwAccess;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

}
