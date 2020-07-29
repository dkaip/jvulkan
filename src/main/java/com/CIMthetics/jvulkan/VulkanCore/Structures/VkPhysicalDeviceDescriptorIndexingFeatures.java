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
package com.CIMthetics.jvulkan.VulkanCore.Structures;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkPhysicalDeviceDescriptorIndexingFeatures extends VulkanCreateInfoStructure
{
    private boolean           shaderInputAttachmentArrayDynamicIndexing;
    private boolean           shaderUniformTexelBufferArrayDynamicIndexing;
    private boolean           shaderStorageTexelBufferArrayDynamicIndexing;
    private boolean           shaderUniformBufferArrayNonUniformIndexing;
    private boolean           shaderSampledImageArrayNonUniformIndexing;
    private boolean           shaderStorageBufferArrayNonUniformIndexing;
    private boolean           shaderStorageImageArrayNonUniformIndexing;
    private boolean           shaderInputAttachmentArrayNonUniformIndexing;
    private boolean           shaderUniformTexelBufferArrayNonUniformIndexing;
    private boolean           shaderStorageTexelBufferArrayNonUniformIndexing;
    private boolean           descriptorBindingUniformBufferUpdateAfterBind;
    private boolean           descriptorBindingSampledImageUpdateAfterBind;
    private boolean           descriptorBindingStorageImageUpdateAfterBind;
    private boolean           descriptorBindingStorageBufferUpdateAfterBind;
    private boolean           descriptorBindingUniformTexelBufferUpdateAfterBind;
    private boolean           descriptorBindingStorageTexelBufferUpdateAfterBind;
    private boolean           descriptorBindingUpdateUnusedWhilePending;
    private boolean           descriptorBindingPartiallyBound;
    private boolean           descriptorBindingVariableDescriptorCount;
    private boolean           runtimeDescriptorArray;

    public VkPhysicalDeviceDescriptorIndexingFeatures()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_INDEXING_FEATURES);
    }

    public boolean isShaderInputAttachmentArrayDynamicIndexing()
    {
        return shaderInputAttachmentArrayDynamicIndexing;
    }

    public void setShaderInputAttachmentArrayDynamicIndexing(
            boolean shaderInputAttachmentArrayDynamicIndexing)
    {
        this.shaderInputAttachmentArrayDynamicIndexing = shaderInputAttachmentArrayDynamicIndexing;
    }

    public boolean isShaderUniformTexelBufferArrayDynamicIndexing()
    {
        return shaderUniformTexelBufferArrayDynamicIndexing;
    }

    public void setShaderUniformTexelBufferArrayDynamicIndexing(
            boolean shaderUniformTexelBufferArrayDynamicIndexing)
    {
        this.shaderUniformTexelBufferArrayDynamicIndexing = shaderUniformTexelBufferArrayDynamicIndexing;
    }

    public boolean isShaderStorageTexelBufferArrayDynamicIndexing()
    {
        return shaderStorageTexelBufferArrayDynamicIndexing;
    }

    public void setShaderStorageTexelBufferArrayDynamicIndexing(
            boolean shaderStorageTexelBufferArrayDynamicIndexing)
    {
        this.shaderStorageTexelBufferArrayDynamicIndexing = shaderStorageTexelBufferArrayDynamicIndexing;
    }

    public boolean isShaderUniformBufferArrayNonUniformIndexing()
    {
        return shaderUniformBufferArrayNonUniformIndexing;
    }

    public void setShaderUniformBufferArrayNonUniformIndexing(
            boolean shaderUniformBufferArrayNonUniformIndexing)
    {
        this.shaderUniformBufferArrayNonUniformIndexing = shaderUniformBufferArrayNonUniformIndexing;
    }

    public boolean isShaderSampledImageArrayNonUniformIndexing()
    {
        return shaderSampledImageArrayNonUniformIndexing;
    }

    public void setShaderSampledImageArrayNonUniformIndexing(
            boolean shaderSampledImageArrayNonUniformIndexing)
    {
        this.shaderSampledImageArrayNonUniformIndexing = shaderSampledImageArrayNonUniformIndexing;
    }

    public boolean isShaderStorageBufferArrayNonUniformIndexing()
    {
        return shaderStorageBufferArrayNonUniformIndexing;
    }

    public void setShaderStorageBufferArrayNonUniformIndexing(
            boolean shaderStorageBufferArrayNonUniformIndexing)
    {
        this.shaderStorageBufferArrayNonUniformIndexing = shaderStorageBufferArrayNonUniformIndexing;
    }

    public boolean isShaderStorageImageArrayNonUniformIndexing()
    {
        return shaderStorageImageArrayNonUniformIndexing;
    }

    public void setShaderStorageImageArrayNonUniformIndexing(
            boolean shaderStorageImageArrayNonUniformIndexing)
    {
        this.shaderStorageImageArrayNonUniformIndexing = shaderStorageImageArrayNonUniformIndexing;
    }

    public boolean isShaderInputAttachmentArrayNonUniformIndexing()
    {
        return shaderInputAttachmentArrayNonUniformIndexing;
    }

    public void setShaderInputAttachmentArrayNonUniformIndexing(
            boolean shaderInputAttachmentArrayNonUniformIndexing)
    {
        this.shaderInputAttachmentArrayNonUniformIndexing = shaderInputAttachmentArrayNonUniformIndexing;
    }

    public boolean isShaderUniformTexelBufferArrayNonUniformIndexing()
    {
        return shaderUniformTexelBufferArrayNonUniformIndexing;
    }

    public void setShaderUniformTexelBufferArrayNonUniformIndexing(
            boolean shaderUniformTexelBufferArrayNonUniformIndexing)
    {
        this.shaderUniformTexelBufferArrayNonUniformIndexing = shaderUniformTexelBufferArrayNonUniformIndexing;
    }

    public boolean isShaderStorageTexelBufferArrayNonUniformIndexing()
    {
        return shaderStorageTexelBufferArrayNonUniformIndexing;
    }

    public void setShaderStorageTexelBufferArrayNonUniformIndexing(
            boolean shaderStorageTexelBufferArrayNonUniformIndexing)
    {
        this.shaderStorageTexelBufferArrayNonUniformIndexing = shaderStorageTexelBufferArrayNonUniformIndexing;
    }

    public boolean isDescriptorBindingUniformBufferUpdateAfterBind()
    {
        return descriptorBindingUniformBufferUpdateAfterBind;
    }

    public void setDescriptorBindingUniformBufferUpdateAfterBind(
            boolean descriptorBindingUniformBufferUpdateAfterBind)
    {
        this.descriptorBindingUniformBufferUpdateAfterBind = descriptorBindingUniformBufferUpdateAfterBind;
    }

    public boolean isDescriptorBindingSampledImageUpdateAfterBind()
    {
        return descriptorBindingSampledImageUpdateAfterBind;
    }

    public void setDescriptorBindingSampledImageUpdateAfterBind(
            boolean descriptorBindingSampledImageUpdateAfterBind)
    {
        this.descriptorBindingSampledImageUpdateAfterBind = descriptorBindingSampledImageUpdateAfterBind;
    }

    public boolean isDescriptorBindingStorageImageUpdateAfterBind()
    {
        return descriptorBindingStorageImageUpdateAfterBind;
    }

    public void setDescriptorBindingStorageImageUpdateAfterBind(
            boolean descriptorBindingStorageImageUpdateAfterBind)
    {
        this.descriptorBindingStorageImageUpdateAfterBind = descriptorBindingStorageImageUpdateAfterBind;
    }

    public boolean isDescriptorBindingStorageBufferUpdateAfterBind()
    {
        return descriptorBindingStorageBufferUpdateAfterBind;
    }

    public void setDescriptorBindingStorageBufferUpdateAfterBind(
            boolean descriptorBindingStorageBufferUpdateAfterBind)
    {
        this.descriptorBindingStorageBufferUpdateAfterBind = descriptorBindingStorageBufferUpdateAfterBind;
    }

    public boolean isDescriptorBindingUniformTexelBufferUpdateAfterBind()
    {
        return descriptorBindingUniformTexelBufferUpdateAfterBind;
    }

    public void setDescriptorBindingUniformTexelBufferUpdateAfterBind(
            boolean descriptorBindingUniformTexelBufferUpdateAfterBind)
    {
        this.descriptorBindingUniformTexelBufferUpdateAfterBind = descriptorBindingUniformTexelBufferUpdateAfterBind;
    }

    public boolean isDescriptorBindingStorageTexelBufferUpdateAfterBind()
    {
        return descriptorBindingStorageTexelBufferUpdateAfterBind;
    }

    public void setDescriptorBindingStorageTexelBufferUpdateAfterBind(
            boolean descriptorBindingStorageTexelBufferUpdateAfterBind)
    {
        this.descriptorBindingStorageTexelBufferUpdateAfterBind = descriptorBindingStorageTexelBufferUpdateAfterBind;
    }

    public boolean isDescriptorBindingUpdateUnusedWhilePending()
    {
        return descriptorBindingUpdateUnusedWhilePending;
    }

    public void setDescriptorBindingUpdateUnusedWhilePending(
            boolean descriptorBindingUpdateUnusedWhilePending)
    {
        this.descriptorBindingUpdateUnusedWhilePending = descriptorBindingUpdateUnusedWhilePending;
    }

    public boolean isDescriptorBindingPartiallyBound()
    {
        return descriptorBindingPartiallyBound;
    }

    public void setDescriptorBindingPartiallyBound(
            boolean descriptorBindingPartiallyBound)
    {
        this.descriptorBindingPartiallyBound = descriptorBindingPartiallyBound;
    }

    public boolean isDescriptorBindingVariableDescriptorCount()
    {
        return descriptorBindingVariableDescriptorCount;
    }

    public void setDescriptorBindingVariableDescriptorCount(
            boolean descriptorBindingVariableDescriptorCount)
    {
        this.descriptorBindingVariableDescriptorCount = descriptorBindingVariableDescriptorCount;
    }

    public boolean isRuntimeDescriptorArray()
    {
        return runtimeDescriptorArray;
    }

    public void setRuntimeDescriptorArray(boolean runtimeDescriptorArray)
    {
        this.runtimeDescriptorArray = runtimeDescriptorArray;
    }

}
