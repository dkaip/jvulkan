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

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkDescriptorSetVariableDescriptorCountLayoutSupport extends VulkanCreateInfoStructure
{
    private int maxVariableDescriptorCount;

    public VkDescriptorSetVariableDescriptorCountLayoutSupport()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_LAYOUT_SUPPORT);
    }

    public int getMaxVariableDescriptorCount()
    {
        return maxVariableDescriptorCount;
    }

    public void setMaxVariableDescriptorCount(int maxVariableDescriptorCount)
    {
        this.maxVariableDescriptorCount = maxVariableDescriptorCount;
    }
}
