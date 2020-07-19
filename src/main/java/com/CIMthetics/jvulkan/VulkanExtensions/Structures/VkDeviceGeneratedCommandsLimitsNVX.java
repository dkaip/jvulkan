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
package com.CIMthetics.jvulkan.VulkanExtensions.Structures;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkDeviceGeneratedCommandsLimitsNVX extends VulkanCreateInfoStructure
{
    private int maxIndirectCommandsLayoutTokenCount;
    private int maxObjectEntryCounts;
    private int minSequenceCountBufferOffsetAlignment;
    private int minSequenceIndexBufferOffsetAlignment;
    private int minCommandsTokenBufferOffsetAlignment;

    public VkDeviceGeneratedCommandsLimitsNVX()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_DEVICE_GENERATED_COMMANDS_LIMITS_NVX);
    }

    public int getMaxIndirectCommandsLayoutTokenCount()
    {
        return maxIndirectCommandsLayoutTokenCount;
    }

    public void setMaxIndirectCommandsLayoutTokenCount(
            int maxIndirectCommandsLayoutTokenCount)
    {
        this.maxIndirectCommandsLayoutTokenCount = maxIndirectCommandsLayoutTokenCount;
    }

    public int getMaxObjectEntryCounts()
    {
        return maxObjectEntryCounts;
    }

    public void setMaxObjectEntryCounts(int maxObjectEntryCounts)
    {
        this.maxObjectEntryCounts = maxObjectEntryCounts;
    }

    public int getMinSequenceCountBufferOffsetAlignment()
    {
        return minSequenceCountBufferOffsetAlignment;
    }

    public void setMinSequenceCountBufferOffsetAlignment(
            int minSequenceCountBufferOffsetAlignment)
    {
        this.minSequenceCountBufferOffsetAlignment = minSequenceCountBufferOffsetAlignment;
    }

    public int getMinSequenceIndexBufferOffsetAlignment()
    {
        return minSequenceIndexBufferOffsetAlignment;
    }

    public void setMinSequenceIndexBufferOffsetAlignment(
            int minSequenceIndexBufferOffsetAlignment)
    {
        this.minSequenceIndexBufferOffsetAlignment = minSequenceIndexBufferOffsetAlignment;
    }

    public int getMinCommandsTokenBufferOffsetAlignment()
    {
        return minCommandsTokenBufferOffsetAlignment;
    }

    public void setMinCommandsTokenBufferOffsetAlignment(
            int minCommandsTokenBufferOffsetAlignment)
    {
        this.minCommandsTokenBufferOffsetAlignment = minCommandsTokenBufferOffsetAlignment;
    }

}
