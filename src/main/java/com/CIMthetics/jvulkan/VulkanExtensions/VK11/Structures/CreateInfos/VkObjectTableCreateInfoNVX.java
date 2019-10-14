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

import java.util.Collection;
import java.util.EnumSet;

import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Enums.VkObjectEntryTypeNVX;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Enums.VkObjectEntryUsageFlagBitsNVX;

public class VkObjectTableCreateInfoNVX extends VulkanCreateInfoStructure
{
    private Collection<VkObjectEntryTypeNVX>                    objectEntryTypes;
    private int[]                                               objectEntryCounts;
    private Collection<EnumSet<VkObjectEntryUsageFlagBitsNVX>>  objectEntryUsageFlags;
    private int                                                 maxUniformBuffersPerDescriptor;
    private int                                                 maxStorageBuffersPerDescriptor;
    private int                                                 maxStorageImagesPerDescriptor;
    private int                                                 maxSampledImagesPerDescriptor;
    private int                                                 maxPipelineLayouts;

    public VkObjectTableCreateInfoNVX()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_OBJECT_TABLE_CREATE_INFO_NVX);

        if (objectEntryTypes.size()  != objectEntryCounts.length ||
            objectEntryCounts.length != objectEntryUsageFlags.size() ||
            objectEntryTypes.size()  != objectEntryUsageFlags.size())
        {
            throw new IllegalArgumentException("objectEntryTypes, objectEntryCounts, and objectEntryUsageFlags MUST have the same number of elements.");
        }
    }

    public Collection<VkObjectEntryTypeNVX> getObjectEntryTypes()
    {
        return objectEntryTypes;
    }

    public void setObjectEntryTypes(
            Collection<VkObjectEntryTypeNVX> objectEntryTypes)
    {
        this.objectEntryTypes = objectEntryTypes;
    }

    public int[] getObjectEntryCounts()
    {
        return objectEntryCounts;
    }

    public void setObjectEntryCounts(int[] objectEntryCounts)
    {
        this.objectEntryCounts = objectEntryCounts;
    }

    public Collection<EnumSet<VkObjectEntryUsageFlagBitsNVX>> getObjectEntryUsageFlags()
    {
        return objectEntryUsageFlags;
    }

    public void setObjectEntryUsageFlags(
            Collection<EnumSet<VkObjectEntryUsageFlagBitsNVX>> objectEntryUsageFlags)
    {
        this.objectEntryUsageFlags = objectEntryUsageFlags;
    }

    public int getMaxUniformBuffersPerDescriptor()
    {
        return maxUniformBuffersPerDescriptor;
    }

    public void setMaxUniformBuffersPerDescriptor(
            int maxUniformBuffersPerDescriptor)
    {
        this.maxUniformBuffersPerDescriptor = maxUniformBuffersPerDescriptor;
    }

    public int getMaxStorageBuffersPerDescriptor()
    {
        return maxStorageBuffersPerDescriptor;
    }

    public void setMaxStorageBuffersPerDescriptor(
            int maxStorageBuffersPerDescriptor)
    {
        this.maxStorageBuffersPerDescriptor = maxStorageBuffersPerDescriptor;
    }

    public int getMaxStorageImagesPerDescriptor()
    {
        return maxStorageImagesPerDescriptor;
    }

    public void setMaxStorageImagesPerDescriptor(int maxStorageImagesPerDescriptor)
    {
        this.maxStorageImagesPerDescriptor = maxStorageImagesPerDescriptor;
    }

    public int getMaxSampledImagesPerDescriptor()
    {
        return maxSampledImagesPerDescriptor;
    }

    public void setMaxSampledImagesPerDescriptor(int maxSampledImagesPerDescriptor)
    {
        this.maxSampledImagesPerDescriptor = maxSampledImagesPerDescriptor;
    }

    public int getMaxPipelineLayouts()
    {
        return maxPipelineLayouts;
    }

    public void setMaxPipelineLayouts(int maxPipelineLayouts)
    {
        this.maxPipelineLayouts = maxPipelineLayouts;
    }

}
