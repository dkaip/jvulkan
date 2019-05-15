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

import java.util.Arrays;
import java.util.EnumSet;

import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkSampleCountFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkExtent2D;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkPhysicalDeviceSampleLocationsPropertiesEXT extends VulkanCreateInfoStructure
{
    private EnumSet<VkSampleCountFlagBits>  sampleLocationSampleCounts;
    private VkExtent2D                      maxSampleLocationGridSize;
    private float[]                         sampleLocationCoordinateRange;
    private int                             sampleLocationSubPixelBits;
    private boolean                         variableSampleLocations;

    public VkPhysicalDeviceSampleLocationsPropertiesEXT()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLE_LOCATIONS_PROPERTIES_EXT);
    }

    public EnumSet<VkSampleCountFlagBits> getSampleLocationSampleCounts()
    {
        return sampleLocationSampleCounts;
    }

    public void setSampleLocationSampleCounts(
            EnumSet<VkSampleCountFlagBits> sampleLocationSampleCounts)
    {
        this.sampleLocationSampleCounts = sampleLocationSampleCounts;
    }

    public VkExtent2D getMaxSampleLocationGridSize()
    {
        return maxSampleLocationGridSize;
    }

    public void setMaxSampleLocationGridSize(VkExtent2D maxSampleLocationGridSize)
    {
        this.maxSampleLocationGridSize = maxSampleLocationGridSize;
    }

    public float[] getSampleLocationCoordinateRange()
    {
        return sampleLocationCoordinateRange;
    }

    public void setSampleLocationCoordinateRange(
            float[] sampleLocationCoordinateRange)
    {
        this.sampleLocationCoordinateRange = sampleLocationCoordinateRange;
    }

    public int getSampleLocationSubPixelBits()
    {
        return sampleLocationSubPixelBits;
    }

    public void setSampleLocationSubPixelBits(int sampleLocationSubPixelBits)
    {
        this.sampleLocationSubPixelBits = sampleLocationSubPixelBits;
    }

    public boolean isVariableSampleLocations()
    {
        return variableSampleLocations;
    }

    public void setVariableSampleLocations(boolean variableSampleLocations)
    {
        this.variableSampleLocations = variableSampleLocations;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\nVkPhysicalDeviceSampleLocationsPropertiesEXT\n"));
        sb.append(String.format("    sampleLocationSampleCounts:%s%n", sampleLocationSampleCounts != null ? sampleLocationSampleCounts.toString() : "null"));
        sb.append(String.format("    maxSampleLocationGridSize:%s%n", maxSampleLocationGridSize != null ? maxSampleLocationGridSize : "null"));
        sb.append(String.format("    sampleLocationCoordinateRange:%s%n", sampleLocationCoordinateRange != null ? Arrays.toString(sampleLocationCoordinateRange) : "null"));
        sb.append(String.format("    sampleLocationSubPixelBits:%d%n", sampleLocationSubPixelBits));
        sb.append(String.format("    variableSampleLocations:%b%n", variableSampleLocations));
        
        return sb.toString();
    }
}
