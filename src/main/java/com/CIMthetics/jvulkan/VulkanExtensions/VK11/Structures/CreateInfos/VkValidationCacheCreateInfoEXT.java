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
package com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.CreateInfos;

import java.util.EnumSet;

import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Enums.VkValidationCacheCreateFlagBitsEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Handles.VkValidationCacheEXT;

public class VkValidationCacheCreateInfoEXT extends VulkanCreateInfoStructure
{
    private EnumSet<VkValidationCacheCreateFlagBitsEXT> flags = EnumSet.noneOf(VkValidationCacheCreateFlagBitsEXT.class);
    private long                                        initialDataSize;
    private VkValidationCacheEXT                        initialData;

    public VkValidationCacheCreateInfoEXT()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_VALIDATION_CACHE_CREATE_INFO_EXT);
    }

    public EnumSet<VkValidationCacheCreateFlagBitsEXT> getFlags()
    {
        return flags;
    }

    public void setFlags(EnumSet<VkValidationCacheCreateFlagBitsEXT> flags)
    {
        this.flags = flags;
    }

    public long getInitialDataSize()
    {
        return initialDataSize;
    }

    public void setInitialDataSize(long initialDataSize)
    {
        this.initialDataSize = initialDataSize;
    }

    public VkValidationCacheEXT getInitialData()
    {
        return initialData;
    }

    public void setInitialData(VkValidationCacheEXT initialData)
    {
        this.initialData = initialData;
    }

}
