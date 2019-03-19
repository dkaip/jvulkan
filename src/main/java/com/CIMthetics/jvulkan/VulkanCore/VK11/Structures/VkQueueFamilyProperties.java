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
package com.CIMthetics.jvulkan.VulkanCore.VK11.Structures;

import java.util.EnumSet;

import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkQueueFlagBits;

public class VkQueueFamilyProperties
{
    private EnumSet<VkQueueFlagBits>    queueFlags = EnumSet.noneOf(VkQueueFlagBits.class);
    private int                         queueCount;
    private int                         timestampValidBits;
    private VkExtent3D                  minImageTransferGranularity;
    
    public EnumSet<VkQueueFlagBits> getQueueFlags()
    {
        return queueFlags;
    }
    
    void setQueueFlags(EnumSet<VkQueueFlagBits> queueFlags)
    {
        this.queueFlags = queueFlags;
    }
    
    public int getQueueCount()
    {
        return queueCount;
    }
    
    void setQueueCount(int queueCount)
    {
        this.queueCount = queueCount;
    }
    
    public int getTimestampValidBits()
    {
        return timestampValidBits;
    }
    
    void setTimestampValidBits(int timestampValidBits)
    {
        this.timestampValidBits = timestampValidBits;
    }
    
    public VkExtent3D getMinImageTransferGranularity()
    {
        return minImageTransferGranularity;
    }
    
    void setMinImageTransferGranularity(
            VkExtent3D minImageTransferGranularity)
    {
        this.minImageTransferGranularity = minImageTransferGranularity;
    }
}
