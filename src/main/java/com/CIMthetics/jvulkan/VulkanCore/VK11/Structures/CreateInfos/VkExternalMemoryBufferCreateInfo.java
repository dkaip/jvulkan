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
package com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos;

import java.util.EnumSet;

import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkExternalMemoryHandleTypeFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkStructureType;

public class VkExternalMemoryBufferCreateInfo extends VulkanCreateInfoStructure
{
    private EnumSet<VkExternalMemoryHandleTypeFlagBits>    handleTypes;

    public VkExternalMemoryBufferCreateInfo()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_EXTERNAL_MEMORY_BUFFER_CREATE_INFO);
    }

    public EnumSet<VkExternalMemoryHandleTypeFlagBits> getHandleTypes()
    {
        return handleTypes;
    }

    public void setHandleTypes(
            EnumSet<VkExternalMemoryHandleTypeFlagBits> handleTypes)
    {
        this.handleTypes = handleTypes;
    }

}
