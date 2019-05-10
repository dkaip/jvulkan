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

import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkDescriptorPoolInlineUniformBlockCreateInfoEXT extends VulkanCreateInfoStructure
{
    private long    maxInlineUniformBlockBindings;

    public VkDescriptorPoolInlineUniformBlockCreateInfoEXT()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_DESCRIPTOR_POOL_INLINE_UNIFORM_BLOCK_CREATE_INFO_EXT);
    }

    public long getMaxInlineUniformBlockBindings()
    {
        return maxInlineUniformBlockBindings;
    }

    public void setMaxInlineUniformBlockBindings(long maxInlineUniformBlockBindings)
    {
        this.maxInlineUniformBlockBindings = maxInlineUniformBlockBindings;
    }
}
