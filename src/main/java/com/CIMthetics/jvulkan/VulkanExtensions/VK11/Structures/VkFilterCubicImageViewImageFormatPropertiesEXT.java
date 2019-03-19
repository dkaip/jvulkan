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

public class VkFilterCubicImageViewImageFormatPropertiesEXT extends VulkanCreateInfoStructure
{
    private long    pNext;
    private boolean filterCubic;
    private boolean filterCubicMinmax;

    public VkFilterCubicImageViewImageFormatPropertiesEXT()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_FILTER_CUBIC_IMAGE_VIEW_IMAGE_FORMAT_PROPERTIES_EXT);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public boolean isFilterCubic()
    {
        return filterCubic;
    }

    public void setFilterCubic(boolean filterCubic)
    {
        this.filterCubic = filterCubic;
    }

    public boolean isFilterCubicMinmax()
    {
        return filterCubicMinmax;
    }

    public void setFilterCubicMinmax(boolean filterCubicMinmax)
    {
        this.filterCubicMinmax = filterCubicMinmax;
    }

}
