/*
 * Copyright 2019-2020 Douglas Kaip
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

public class VkPhysicalDeviceTexelBufferAlignmentPropertiesEXT extends VulkanCreateInfoStructure
{
    private long    storageTexelBufferOffsetAlignmentBytes;
    private boolean storageTexelBufferOffsetSingleTexelAlignment;
    private long    uniformTexelBufferOffsetAlignmentBytes;
    private boolean uniformTexelBufferOffsetSingleTexelAlignment;

    public VkPhysicalDeviceTexelBufferAlignmentPropertiesEXT()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TEXEL_BUFFER_ALIGNMENT_PROPERTIES_EXT);
    }

    public long getStorageTexelBufferOffsetAlignmentBytes()
    {
        return storageTexelBufferOffsetAlignmentBytes;
    }

    public void setStorageTexelBufferOffsetAlignmentBytes(
            long storageTexelBufferOffsetAlignmentBytes)
    {
        this.storageTexelBufferOffsetAlignmentBytes = storageTexelBufferOffsetAlignmentBytes;
    }

    public boolean isStorageTexelBufferOffsetSingleTexelAlignment()
    {
        return storageTexelBufferOffsetSingleTexelAlignment;
    }

    public void setStorageTexelBufferOffsetSingleTexelAlignment(
            boolean storageTexelBufferOffsetSingleTexelAlignment)
    {
        this.storageTexelBufferOffsetSingleTexelAlignment = storageTexelBufferOffsetSingleTexelAlignment;
    }

    public long getUniformTexelBufferOffsetAlignmentBytes()
    {
        return uniformTexelBufferOffsetAlignmentBytes;
    }

    public void setUniformTexelBufferOffsetAlignmentBytes(
            long uniformTexelBufferOffsetAlignmentBytes)
    {
        this.uniformTexelBufferOffsetAlignmentBytes = uniformTexelBufferOffsetAlignmentBytes;
    }

    public boolean isUniformTexelBufferOffsetSingleTexelAlignment()
    {
        return uniformTexelBufferOffsetSingleTexelAlignment;
    }

    public void setUniformTexelBufferOffsetSingleTexelAlignment(
            boolean uniformTexelBufferOffsetSingleTexelAlignment)
    {
        this.uniformTexelBufferOffsetSingleTexelAlignment = uniformTexelBufferOffsetSingleTexelAlignment;
    }
}
