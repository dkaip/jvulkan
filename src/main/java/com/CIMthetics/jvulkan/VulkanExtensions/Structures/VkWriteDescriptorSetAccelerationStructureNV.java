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

import java.util.Collection;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VulkanCreateInfoStructure;
import com.CIMthetics.jvulkan.VulkanExtensions.Handles.VkAccelerationStructureNV;

public class VkWriteDescriptorSetAccelerationStructureNV extends VulkanCreateInfoStructure
{
    private Collection<VkAccelerationStructureNV>  accelerationStructures;

    public VkWriteDescriptorSetAccelerationStructureNV()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET_ACCELERATION_STRUCTURE_NV);
    }

    public Collection<VkAccelerationStructureNV> getAccelerationStructures()
    {
        return accelerationStructures;
    }

    public void setAccelerationStructures(
            Collection<VkAccelerationStructureNV> accelerationStructures)
    {
        this.accelerationStructures = accelerationStructures;
    }
}
