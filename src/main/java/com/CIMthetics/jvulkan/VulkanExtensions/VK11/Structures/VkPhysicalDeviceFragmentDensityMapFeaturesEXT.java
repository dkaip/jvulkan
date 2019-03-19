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

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.hwjvi.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkPhysicalDeviceFragmentDensityMapFeaturesEXT extends VulkanCreateInfoStructure
{
    private long    pNext;
    private boolean fragmentDensityMap;
    private boolean fragmentDensityMapDynamic;
    private boolean fragmentDensityMapNonSubsampledImages;

    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_FEATURES_EXT);
    }

    public long getpNext()
    {
        return pNext;
    }

    public void setpNext(long pNext)
    {
        this.pNext = pNext;
    }

    public boolean isFragmentDensityMap()
    {
        return fragmentDensityMap;
    }

    public void setFragmentDensityMap(boolean fragmentDensityMap)
    {
        this.fragmentDensityMap = fragmentDensityMap;
    }

    public boolean isFragmentDensityMapDynamic()
    {
        return fragmentDensityMapDynamic;
    }

    public void setFragmentDensityMapDynamic(boolean fragmentDensityMapDynamic)
    {
        this.fragmentDensityMapDynamic = fragmentDensityMapDynamic;
    }

    public boolean isFragmentDensityMapNonSubsampledImages()
    {
        return fragmentDensityMapNonSubsampledImages;
    }

    public void setFragmentDensityMapNonSubsampledImages(
            boolean fragmentDensityMapNonSubsampledImages)
    {
        this.fragmentDensityMapNonSubsampledImages = fragmentDensityMapNonSubsampledImages;
    }

}
