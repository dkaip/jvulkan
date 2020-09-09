/*
 * Copyright 2020 Douglas Kaip
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
package com.CIMthetics.jvulkan.VulkanCore.Structures;

import java.util.EnumSet;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkPointClippingBehavior;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkShaderStageFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkSubgroupFeatureFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkPhysicalDeviceVulkan11Properties extends VulkanCreateInfoStructure
{
    private byte[]                              deviceUUID;
    private byte[]                              driverUUID;
    private byte[]                              deviceLUID;
    private int                                 deviceNodeMask;
    private boolean                             deviceLUIDValid;
    private int                                 subgroupSize;
    private EnumSet<VkShaderStageFlagBits>      subgroupSupportedStages = EnumSet.noneOf(VkShaderStageFlagBits.class);
    private EnumSet<VkSubgroupFeatureFlagBits>  subgroupSupportedOperations = EnumSet.noneOf(VkSubgroupFeatureFlagBits.class);
    private boolean                             subgroupQuadOperationsInAllStages;
    private VkPointClippingBehavior             pointClippingBehavior;
    private int                                 maxMultiviewViewCount;
    private int                                 maxMultiviewInstanceIndex;
    private boolean                             protectedNoFault;
    private int                                 maxPerSetDescriptors;
    private long                                maxMemoryAllocationSize;

    public VkPhysicalDeviceVulkan11Properties()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_1_PROPERTIES);
    }

    public byte[] getDeviceUUID()
    {
        return deviceUUID;
    }

    public void setDeviceUUID(byte[] deviceUUID)
    {
        this.deviceUUID = deviceUUID;
    }

    public byte[] getDriverUUID()
    {
        return driverUUID;
    }

    public void setDriverUUID(byte[] driverUUID)
    {
        this.driverUUID = driverUUID;
    }

    public byte[] getDeviceLUID()
    {
        return deviceLUID;
    }

    public void setDeviceLUID(byte[] deviceLUID)
    {
        this.deviceLUID = deviceLUID;
    }

    public int getDeviceNodeMask()
    {
        return deviceNodeMask;
    }

    public void setDeviceNodeMask(int deviceNodeMask)
    {
        this.deviceNodeMask = deviceNodeMask;
    }

    public boolean isDeviceLUIDValid()
    {
        return deviceLUIDValid;
    }

    public void setDeviceLUIDValid(boolean deviceLUIDValid)
    {
        this.deviceLUIDValid = deviceLUIDValid;
    }

    public int getSubgroupSize()
    {
        return subgroupSize;
    }

    public void setSubgroupSize(int subgroupSize)
    {
        this.subgroupSize = subgroupSize;
    }

    public EnumSet<VkShaderStageFlagBits> getSubgroupSupportedStages()
    {
        return subgroupSupportedStages;
    }

    public void setSubgroupSupportedStages(EnumSet<VkShaderStageFlagBits> subgroupSupportedStages)
    {
        this.subgroupSupportedStages = subgroupSupportedStages;
    }

    public EnumSet<VkSubgroupFeatureFlagBits> getSubgroupSupportedOperations()
    {
        return subgroupSupportedOperations;
    }

    public void setSubgroupSupportedOperations(EnumSet<VkSubgroupFeatureFlagBits> subgroupSupportedOperations)
    {
        this.subgroupSupportedOperations = subgroupSupportedOperations;
    }

    public boolean isSubgroupQuadOperationsInAllStages()
    {
        return subgroupQuadOperationsInAllStages;
    }

    public void setSubgroupQuadOperationsInAllStages(boolean subgroupQuadOperationsInAllStages)
    {
        this.subgroupQuadOperationsInAllStages = subgroupQuadOperationsInAllStages;
    }

    public VkPointClippingBehavior getPointClippingBehavior()
    {
        return pointClippingBehavior;
    }

    public void setPointClippingBehavior(VkPointClippingBehavior pointClippingBehavior)
    {
        this.pointClippingBehavior = pointClippingBehavior;
    }

    public int getMaxMultiviewViewCount()
    {
        return maxMultiviewViewCount;
    }

    public void setMaxMultiviewViewCount(int maxMultiviewViewCount)
    {
        this.maxMultiviewViewCount = maxMultiviewViewCount;
    }

    public int getMaxMultiviewInstanceIndex()
    {
        return maxMultiviewInstanceIndex;
    }

    public void setMaxMultiviewInstanceIndex(int maxMultiviewInstanceIndex)
    {
        this.maxMultiviewInstanceIndex = maxMultiviewInstanceIndex;
    }

    public boolean isProtectedNoFault()
    {
        return protectedNoFault;
    }

    public void setProtectedNoFault(boolean protectedNoFault)
    {
        this.protectedNoFault = protectedNoFault;
    }

    public int getMaxPerSetDescriptors()
    {
        return maxPerSetDescriptors;
    }

    public void setMaxPerSetDescriptors(int maxPerSetDescriptors)
    {
        this.maxPerSetDescriptors = maxPerSetDescriptors;
    }

    public long getMaxMemoryAllocationSize()
    {
        return maxMemoryAllocationSize;
    }

    public void setMaxMemoryAllocationSize(long maxMemoryAllocationSize)
    {
        this.maxMemoryAllocationSize = maxMemoryAllocationSize;
    }
}
