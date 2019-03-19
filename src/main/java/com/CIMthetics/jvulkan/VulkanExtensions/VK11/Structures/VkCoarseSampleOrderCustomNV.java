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

import java.util.Collection;

import com.CIMthetics.hwjvi.VulkanExtensions.VK11.Enums.VkShadingRatePaletteEntryNV;

public class VkCoarseSampleOrderCustomNV
{
    private VkShadingRatePaletteEntryNV             shadingRate;
    private int                                     sampleCount;
    private Collection<VkCoarseSampleLocationNV>    sampleLocations;

    public VkShadingRatePaletteEntryNV getShadingRate()
    {
        return shadingRate;
    }
    
    public void setShadingRate(VkShadingRatePaletteEntryNV shadingRate)
    {
        this.shadingRate = shadingRate;
    }
    
    public int getSampleCount()
    {
        return sampleCount;
    }
    
    public void setSampleCount(int sampleCount)
    {
        this.sampleCount = sampleCount;
    }
    
    public Collection<VkCoarseSampleLocationNV> getSampleLocations()
    {
        return sampleLocations;
    }

    public void setSampleLocations(
            Collection<VkCoarseSampleLocationNV> sampleLocations)
    {
        this.sampleLocations = sampleLocations;
    }
}
