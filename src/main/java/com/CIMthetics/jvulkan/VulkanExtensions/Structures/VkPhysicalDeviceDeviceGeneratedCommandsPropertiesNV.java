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
package com.CIMthetics.jvulkan.VulkanExtensions.Structures;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV extends VulkanCreateInfoStructure
{
    private int maxGraphicsShaderGroupCount;
    private int maxIndirectSequenceCount;
    private int maxIndirectCommandsTokenCount;
    private int maxIndirectCommandsStreamCount;
    private int maxIndirectCommandsTokenOffset;
    private int maxIndirectCommandsStreamStride;
    private int minSequencesCountBufferOffsetAlignment;
    private int minSequencesIndexBufferOffsetAlignment;
    private int minIndirectCommandsBufferOffsetAlignment;

    public VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_PROPERTIES_NV);
    }

    public int getMaxGraphicsShaderGroupCount()
    {
        return maxGraphicsShaderGroupCount;
    }

    public void setMaxGraphicsShaderGroupCount(int maxGraphicsShaderGroupCount)
    {
        this.maxGraphicsShaderGroupCount = maxGraphicsShaderGroupCount;
    }

    public int getMaxIndirectSequenceCount()
    {
        return maxIndirectSequenceCount;
    }

    public void setMaxIndirectSequenceCount(int maxIndirectSequenceCount)
    {
        this.maxIndirectSequenceCount = maxIndirectSequenceCount;
    }

    public int getMaxIndirectCommandsTokenCount()
    {
        return maxIndirectCommandsTokenCount;
    }

    public void setMaxIndirectCommandsTokenCount(int maxIndirectCommandsTokenCount)
    {
        this.maxIndirectCommandsTokenCount = maxIndirectCommandsTokenCount;
    }

    public int getMaxIndirectCommandsStreamCount()
    {
        return maxIndirectCommandsStreamCount;
    }

    public void setMaxIndirectCommandsStreamCount(int maxIndirectCommandsStreamCount)
    {
        this.maxIndirectCommandsStreamCount = maxIndirectCommandsStreamCount;
    }

    public int getMaxIndirectCommandsTokenOffset()
    {
        return maxIndirectCommandsTokenOffset;
    }

    public void setMaxIndirectCommandsTokenOffset(int maxIndirectCommandsTokenOffset)
    {
        this.maxIndirectCommandsTokenOffset = maxIndirectCommandsTokenOffset;
    }

    public int getMaxIndirectCommandsStreamStride()
    {
        return maxIndirectCommandsStreamStride;
    }

    public void setMaxIndirectCommandsStreamStride(int maxIndirectCommandsStreamStride)
    {
        this.maxIndirectCommandsStreamStride = maxIndirectCommandsStreamStride;
    }

    public int getMinSequencesCountBufferOffsetAlignment()
    {
        return minSequencesCountBufferOffsetAlignment;
    }

    public void setMinSequencesCountBufferOffsetAlignment(int minSequencesCountBufferOffsetAlignment)
    {
        this.minSequencesCountBufferOffsetAlignment = minSequencesCountBufferOffsetAlignment;
    }

    public int getMinSequencesIndexBufferOffsetAlignment()
    {
        return minSequencesIndexBufferOffsetAlignment;
    }

    public void setMinSequencesIndexBufferOffsetAlignment(int minSequencesIndexBufferOffsetAlignment)
    {
        this.minSequencesIndexBufferOffsetAlignment = minSequencesIndexBufferOffsetAlignment;
    }

    public int getMinIndirectCommandsBufferOffsetAlignment()
    {
        return minIndirectCommandsBufferOffsetAlignment;
    }

    public void setMinIndirectCommandsBufferOffsetAlignment(int minIndirectCommandsBufferOffsetAlignment)
    {
        this.minIndirectCommandsBufferOffsetAlignment = minIndirectCommandsBufferOffsetAlignment;
    }
}
