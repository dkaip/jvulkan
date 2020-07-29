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

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkObjectType;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Handles.VulkanHandle;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkDebugUtilsObjectNameInfoEXT extends VulkanCreateInfoStructure
{
    private VkObjectType    objectType;
    private VulkanHandle    objectHandle;
    private String          objectName;
    
    public VkDebugUtilsObjectNameInfoEXT()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_DEBUG_UTILS_OBJECT_NAME_INFO_EXT);
    }

    public VkObjectType getObjectType()
    {
        return objectType;
    }

    public void setObjectType(VkObjectType objectType)
    {
        this.objectType = objectType;
    }

    public VulkanHandle getObjectHandle()
    {
        return objectHandle;
    }

    public void setObjectHandle(VulkanHandle objectHandle)
    {
        this.objectHandle = objectHandle;
    }

    public String getObjectName()
    {
        return objectName;
    }

    public void setObjectName(String objectName)
    {
        this.objectName = objectName;
    }

    @Override
    public String toString()
    {
        String result = "ObjectType:" + objectType.toString() + " ObjectHandle:" + objectHandle.toString() + " ObjectName:" + objectName;
        return result;
    }
}
