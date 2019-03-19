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

import java.util.LinkedList;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkDrmFormatModifierPropertiesListEXT extends VulkanCreateInfoStructure
{
    private long                                            pNext;
    private int                                             drmFormatModifierCount;
    private LinkedList<VkDrmFormatModifierPropertiesEXT>    drmFormatModifierProperties = new LinkedList<VkDrmFormatModifierPropertiesEXT>();

    
    public VkDrmFormatModifierPropertiesListEXT()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_DRM_FORMAT_MODIFIER_PROPERTIES_LIST_EXT);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public int getDrmFormatModifierCount()
    {
        return drmFormatModifierCount;
    }

    public void setDrmFormatModifierCount(int drmFormatModifierCount)
    {
        this.drmFormatModifierCount = drmFormatModifierCount;
    }

    public LinkedList<VkDrmFormatModifierPropertiesEXT> getDrmFormatModifierProperties()
    {
        return drmFormatModifierProperties;
    }

    public void setDrmFormatModifierProperties(
            LinkedList<VkDrmFormatModifierPropertiesEXT> drmFormatModifierProperties)
    {
        this.drmFormatModifierProperties = drmFormatModifierProperties;
    }

}