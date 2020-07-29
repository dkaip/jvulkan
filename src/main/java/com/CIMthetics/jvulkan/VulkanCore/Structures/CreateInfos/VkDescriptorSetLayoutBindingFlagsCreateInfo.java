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
package com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos;

import java.util.Collection;
import java.util.EnumSet;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkDescriptorBindingFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;

public class VkDescriptorSetLayoutBindingFlagsCreateInfo extends VulkanCreateInfoStructure
{
    private Collection<EnumSet<VkDescriptorBindingFlagBits>> bindingFlags;

    public VkDescriptorSetLayoutBindingFlagsCreateInfo()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_BINDING_FLAGS_CREATE_INFO);
    }

    public Collection<EnumSet<VkDescriptorBindingFlagBits>> getBindingFlags()
    {
        return bindingFlags;
    }

    public void setBindingFlags(
            Collection<EnumSet<VkDescriptorBindingFlagBits>> bindingFlags)
    {
        this.bindingFlags = bindingFlags;
    }

}
