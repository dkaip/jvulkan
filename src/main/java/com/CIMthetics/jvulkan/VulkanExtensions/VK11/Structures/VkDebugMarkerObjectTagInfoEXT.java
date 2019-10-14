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
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Enums.VkDebugReportObjectTypeEXT;

public class VkDebugMarkerObjectTagInfoEXT extends VulkanCreateInfoStructure
{
    private VkDebugReportObjectTypeEXT  objectType;
    private long                        object;
    private long                        tagName;
    private byte[]                      tag;

    public VkDebugMarkerObjectTagInfoEXT()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_DEBUG_MARKER_OBJECT_TAG_INFO_EXT);
    }

    public VkDebugReportObjectTypeEXT getObjectType()
    {
        return objectType;
    }

    public void setObjectType(VkDebugReportObjectTypeEXT objectType)
    {
        this.objectType = objectType;
    }

    public long getObject()
    {
        return object;
    }

    public void setObject(long object)
    {
        this.object = object;
    }

    public long getTagName()
    {
        return tagName;
    }

    public void setTagName(long tagName)
    {
        this.tagName = tagName;
    }

    public byte[] getTag()
    {
        return tag;
    }

    public void setTag(byte[] tag)
    {
        this.tag = tag;
    }

}
