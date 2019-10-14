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

import java.util.EnumSet;

import com.CIMthetics.jvulkan.VulkanCore.VK11.Handles.VkBuffer;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Enums.VkObjectEntryTypeNVX;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Enums.VkObjectEntryUsageFlagBitsNVX;

public class VkObjectTableVertexBufferEntryNVX extends VkObjectTableEntryNVX
{
    private VkBuffer buffer;
    
    public VkObjectTableVertexBufferEntryNVX(EnumSet<VkObjectEntryUsageFlagBitsNVX> flags, VkBuffer buffer)
    {
        super(VkObjectEntryTypeNVX.VK_OBJECT_ENTRY_TYPE_VERTEX_BUFFER_NVX);
        setFlags(flags);
        this.buffer = buffer;
    }

    public VkBuffer getBuffer()
    {
        return buffer;
    }
}
