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

public class VkPhysicalDeviceVulkan12Features extends VulkanCreateInfoStructure
{
    private boolean samplerMirrorClampToEdge;
    private boolean drawIndirectCount;
    private boolean storageBuffer8BitAccess;
    private boolean uniformAndStorageBuffer8BitAccess;
    private boolean storagePushConstant8;
    private boolean shaderBufferInt64Atomics;
    private boolean shaderSharedInt64Atomics;
    private boolean shaderFloat16;
    private boolean shaderInt8;
    private boolean descriptorIndexing;
    private boolean shaderInputAttachmentArrayDynamicIndexing;
    private boolean shaderUniformTexelBufferArrayDynamicIndexing;
    private boolean shaderStorageTexelBufferArrayDynamicIndexing;
    private boolean shaderUniformBufferArrayNonUniformIndexing;
    private boolean shaderSampledImageArrayNonUniformIndexing;
    private boolean shaderStorageBufferArrayNonUniformIndexing;
    private boolean shaderStorageImageArrayNonUniformIndexing;
    private boolean shaderInputAttachmentArrayNonUniformIndexing;
    private boolean shaderUniformTexelBufferArrayNonUniformIndexing;
    private boolean shaderStorageTexelBufferArrayNonUniformIndexing;
    private boolean descriptorBindingUniformBufferUpdateAfterBind;
    private boolean descriptorBindingSampledImageUpdateAfterBind;
    private boolean descriptorBindingStorageImageUpdateAfterBind;
    private boolean descriptorBindingStorageBufferUpdateAfterBind;
    private boolean descriptorBindingUniformTexelBufferUpdateAfterBind;
    private boolean descriptorBindingStorageTexelBufferUpdateAfterBind;
    private boolean descriptorBindingUpdateUnusedWhilePending;
    private boolean descriptorBindingPartiallyBound;
    private boolean descriptorBindingVariableDescriptorCount;
    private boolean runtimeDescriptorArray;
    private boolean samplerFilterMinmax;
    private boolean scalarBlockLayout;
    private boolean imagelessFramebuffer;
    private boolean uniformBufferStandardLayout;
    private boolean shaderSubgroupExtendedTypes;
    private boolean separateDepthStencilLayouts;
    private boolean hostQueryReset;
    private boolean timelineSemaphore;
    private boolean bufferDeviceAddress;
    private boolean bufferDeviceAddressCaptureReplay;
    private boolean bufferDeviceAddressMultiDevice;
    private boolean vulkanMemoryModel;
    private boolean vulkanMemoryModelDeviceScope;
    private boolean vulkanMemoryModelAvailabilityVisibilityChains;
    private boolean shaderOutputViewportIndex;
    private boolean shaderOutputLayer;
    private boolean subgroupBroadcastDynamicId;

    public VkPhysicalDeviceVulkan12Features()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_2_FEATURES);
    }

    public boolean isSamplerMirrorClampToEdge()
    {
        return samplerMirrorClampToEdge;
    }

    public void setSamplerMirrorClampToEdge(boolean samplerMirrorClampToEdge)
    {
        this.samplerMirrorClampToEdge = samplerMirrorClampToEdge;
    }

    public boolean isDrawIndirectCount()
    {
        return drawIndirectCount;
    }

    public void setDrawIndirectCount(boolean drawIndirectCount)
    {
        this.drawIndirectCount = drawIndirectCount;
    }

    public boolean isStorageBuffer8BitAccess()
    {
        return storageBuffer8BitAccess;
    }

    public void setStorageBuffer8BitAccess(boolean storageBuffer8BitAccess)
    {
        this.storageBuffer8BitAccess = storageBuffer8BitAccess;
    }

    public boolean isUniformAndStorageBuffer8BitAccess()
    {
        return uniformAndStorageBuffer8BitAccess;
    }

    public void setUniformAndStorageBuffer8BitAccess(boolean uniformAndStorageBuffer8BitAccess)
    {
        this.uniformAndStorageBuffer8BitAccess = uniformAndStorageBuffer8BitAccess;
    }

    public boolean isStoragePushConstant8()
    {
        return storagePushConstant8;
    }

    public void setStoragePushConstant8(boolean storagePushConstant8)
    {
        this.storagePushConstant8 = storagePushConstant8;
    }

    public boolean isShaderBufferInt64Atomics()
    {
        return shaderBufferInt64Atomics;
    }

    public void setShaderBufferInt64Atomics(boolean shaderBufferInt64Atomics)
    {
        this.shaderBufferInt64Atomics = shaderBufferInt64Atomics;
    }

    public boolean isShaderSharedInt64Atomics()
    {
        return shaderSharedInt64Atomics;
    }

    public void setShaderSharedInt64Atomics(boolean shaderSharedInt64Atomics)
    {
        this.shaderSharedInt64Atomics = shaderSharedInt64Atomics;
    }

    public boolean isShaderFloat16()
    {
        return shaderFloat16;
    }

    public void setShaderFloat16(boolean shaderFloat16)
    {
        this.shaderFloat16 = shaderFloat16;
    }

    public boolean isShaderInt8()
    {
        return shaderInt8;
    }

    public void setShaderInt8(boolean shaderInt8)
    {
        this.shaderInt8 = shaderInt8;
    }

    public boolean isDescriptorIndexing()
    {
        return descriptorIndexing;
    }

    public void setDescriptorIndexing(boolean descriptorIndexing)
    {
        this.descriptorIndexing = descriptorIndexing;
    }

    public boolean isShaderInputAttachmentArrayDynamicIndexing()
    {
        return shaderInputAttachmentArrayDynamicIndexing;
    }

    public void setShaderInputAttachmentArrayDynamicIndexing(boolean shaderInputAttachmentArrayDynamicIndexing)
    {
        this.shaderInputAttachmentArrayDynamicIndexing = shaderInputAttachmentArrayDynamicIndexing;
    }

    public boolean isShaderUniformTexelBufferArrayDynamicIndexing()
    {
        return shaderUniformTexelBufferArrayDynamicIndexing;
    }

    public void setShaderUniformTexelBufferArrayDynamicIndexing(boolean shaderUniformTexelBufferArrayDynamicIndexing)
    {
        this.shaderUniformTexelBufferArrayDynamicIndexing = shaderUniformTexelBufferArrayDynamicIndexing;
    }

    public boolean isShaderStorageTexelBufferArrayDynamicIndexing()
    {
        return shaderStorageTexelBufferArrayDynamicIndexing;
    }

    public void setShaderStorageTexelBufferArrayDynamicIndexing(boolean shaderStorageTexelBufferArrayDynamicIndexing)
    {
        this.shaderStorageTexelBufferArrayDynamicIndexing = shaderStorageTexelBufferArrayDynamicIndexing;
    }

    public boolean isShaderUniformBufferArrayNonUniformIndexing()
    {
        return shaderUniformBufferArrayNonUniformIndexing;
    }

    public void setShaderUniformBufferArrayNonUniformIndexing(boolean shaderUniformBufferArrayNonUniformIndexing)
    {
        this.shaderUniformBufferArrayNonUniformIndexing = shaderUniformBufferArrayNonUniformIndexing;
    }

    public boolean isShaderSampledImageArrayNonUniformIndexing()
    {
        return shaderSampledImageArrayNonUniformIndexing;
    }

    public void setShaderSampledImageArrayNonUniformIndexing(boolean shaderSampledImageArrayNonUniformIndexing)
    {
        this.shaderSampledImageArrayNonUniformIndexing = shaderSampledImageArrayNonUniformIndexing;
    }

    public boolean isShaderStorageBufferArrayNonUniformIndexing()
    {
        return shaderStorageBufferArrayNonUniformIndexing;
    }

    public void setShaderStorageBufferArrayNonUniformIndexing(boolean shaderStorageBufferArrayNonUniformIndexing)
    {
        this.shaderStorageBufferArrayNonUniformIndexing = shaderStorageBufferArrayNonUniformIndexing;
    }

    public boolean isShaderStorageImageArrayNonUniformIndexing()
    {
        return shaderStorageImageArrayNonUniformIndexing;
    }

    public void setShaderStorageImageArrayNonUniformIndexing(boolean shaderStorageImageArrayNonUniformIndexing)
    {
        this.shaderStorageImageArrayNonUniformIndexing = shaderStorageImageArrayNonUniformIndexing;
    }

    public boolean isShaderInputAttachmentArrayNonUniformIndexing()
    {
        return shaderInputAttachmentArrayNonUniformIndexing;
    }

    public void setShaderInputAttachmentArrayNonUniformIndexing(boolean shaderInputAttachmentArrayNonUniformIndexing)
    {
        this.shaderInputAttachmentArrayNonUniformIndexing = shaderInputAttachmentArrayNonUniformIndexing;
    }

    public boolean isShaderUniformTexelBufferArrayNonUniformIndexing()
    {
        return shaderUniformTexelBufferArrayNonUniformIndexing;
    }

    public void setShaderUniformTexelBufferArrayNonUniformIndexing(boolean shaderUniformTexelBufferArrayNonUniformIndexing)
    {
        this.shaderUniformTexelBufferArrayNonUniformIndexing = shaderUniformTexelBufferArrayNonUniformIndexing;
    }

    public boolean isShaderStorageTexelBufferArrayNonUniformIndexing()
    {
        return shaderStorageTexelBufferArrayNonUniformIndexing;
    }

    public void setShaderStorageTexelBufferArrayNonUniformIndexing(boolean shaderStorageTexelBufferArrayNonUniformIndexing)
    {
        this.shaderStorageTexelBufferArrayNonUniformIndexing = shaderStorageTexelBufferArrayNonUniformIndexing;
    }

    public boolean isDescriptorBindingUniformBufferUpdateAfterBind()
    {
        return descriptorBindingUniformBufferUpdateAfterBind;
    }

    public void setDescriptorBindingUniformBufferUpdateAfterBind(boolean descriptorBindingUniformBufferUpdateAfterBind)
    {
        this.descriptorBindingUniformBufferUpdateAfterBind = descriptorBindingUniformBufferUpdateAfterBind;
    }

    public boolean isDescriptorBindingSampledImageUpdateAfterBind()
    {
        return descriptorBindingSampledImageUpdateAfterBind;
    }

    public void setDescriptorBindingSampledImageUpdateAfterBind(boolean descriptorBindingSampledImageUpdateAfterBind)
    {
        this.descriptorBindingSampledImageUpdateAfterBind = descriptorBindingSampledImageUpdateAfterBind;
    }

    public boolean isDescriptorBindingStorageImageUpdateAfterBind()
    {
        return descriptorBindingStorageImageUpdateAfterBind;
    }

    public void setDescriptorBindingStorageImageUpdateAfterBind(boolean descriptorBindingStorageImageUpdateAfterBind)
    {
        this.descriptorBindingStorageImageUpdateAfterBind = descriptorBindingStorageImageUpdateAfterBind;
    }

    public boolean isDescriptorBindingStorageBufferUpdateAfterBind()
    {
        return descriptorBindingStorageBufferUpdateAfterBind;
    }

    public void setDescriptorBindingStorageBufferUpdateAfterBind(boolean descriptorBindingStorageBufferUpdateAfterBind)
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

    public void setDescriptorBindingUpdateUnusedWhilePending(boolean descriptorBindingUpdateUnusedWhilePending)
    {
        this.descriptorBindingUpdateUnusedWhilePending = descriptorBindingUpdateUnusedWhilePending;
    }

    public boolean isDescriptorBindingPartiallyBound()
    {
        return descriptorBindingPartiallyBound;
    }

    public void setDescriptorBindingPartiallyBound(boolean descriptorBindingPartiallyBound)
    {
        this.descriptorBindingPartiallyBound = descriptorBindingPartiallyBound;
    }

    public boolean isDescriptorBindingVariableDescriptorCount()
    {
        return descriptorBindingVariableDescriptorCount;
    }

    public void setDescriptorBindingVariableDescriptorCount(boolean descriptorBindingVariableDescriptorCount)
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

    public boolean isSamplerFilterMinmax()
    {
        return samplerFilterMinmax;
    }

    public void setSamplerFilterMinmax(boolean samplerFilterMinmax)
    {
        this.samplerFilterMinmax = samplerFilterMinmax;
    }

    public boolean isScalarBlockLayout()
    {
        return scalarBlockLayout;
    }

    public void setScalarBlockLayout(boolean scalarBlockLayout)
    {
        this.scalarBlockLayout = scalarBlockLayout;
    }

    public boolean isImagelessFramebuffer()
    {
        return imagelessFramebuffer;
    }

    public void setImagelessFramebuffer(boolean imagelessFramebuffer)
    {
        this.imagelessFramebuffer = imagelessFramebuffer;
    }

    public boolean isUniformBufferStandardLayout()
    {
        return uniformBufferStandardLayout;
    }

    public void setUniformBufferStandardLayout(boolean uniformBufferStandardLayout)
    {
        this.uniformBufferStandardLayout = uniformBufferStandardLayout;
    }

    public boolean isShaderSubgroupExtendedTypes()
    {
        return shaderSubgroupExtendedTypes;
    }

    public void setShaderSubgroupExtendedTypes(boolean shaderSubgroupExtendedTypes)
    {
        this.shaderSubgroupExtendedTypes = shaderSubgroupExtendedTypes;
    }

    public boolean isSeparateDepthStencilLayouts()
    {
        return separateDepthStencilLayouts;
    }

    public void setSeparateDepthStencilLayouts(boolean separateDepthStencilLayouts)
    {
        this.separateDepthStencilLayouts = separateDepthStencilLayouts;
    }

    public boolean isHostQueryReset()
    {
        return hostQueryReset;
    }

    public void setHostQueryReset(boolean hostQueryReset)
    {
        this.hostQueryReset = hostQueryReset;
    }

    public boolean isTimelineSemaphore()
    {
        return timelineSemaphore;
    }

    public void setTimelineSemaphore(boolean timelineSemaphore)
    {
        this.timelineSemaphore = timelineSemaphore;
    }

    public boolean isBufferDeviceAddress()
    {
        return bufferDeviceAddress;
    }

    public void setBufferDeviceAddress(boolean bufferDeviceAddress)
    {
        this.bufferDeviceAddress = bufferDeviceAddress;
    }

    public boolean isBufferDeviceAddressCaptureReplay()
    {
        return bufferDeviceAddressCaptureReplay;
    }

    public void setBufferDeviceAddressCaptureReplay(boolean bufferDeviceAddressCaptureReplay)
    {
        this.bufferDeviceAddressCaptureReplay = bufferDeviceAddressCaptureReplay;
    }

    public boolean isBufferDeviceAddressMultiDevice()
    {
        return bufferDeviceAddressMultiDevice;
    }

    public void setBufferDeviceAddressMultiDevice(boolean bufferDeviceAddressMultiDevice)
    {
        this.bufferDeviceAddressMultiDevice = bufferDeviceAddressMultiDevice;
    }

    public boolean isVulkanMemoryModel()
    {
        return vulkanMemoryModel;
    }

    public void setVulkanMemoryModel(boolean vulkanMemoryModel)
    {
        this.vulkanMemoryModel = vulkanMemoryModel;
    }

    public boolean isVulkanMemoryModelDeviceScope()
    {
        return vulkanMemoryModelDeviceScope;
    }

    public void setVulkanMemoryModelDeviceScope(boolean vulkanMemoryModelDeviceScope)
    {
        this.vulkanMemoryModelDeviceScope = vulkanMemoryModelDeviceScope;
    }

    public boolean isVulkanMemoryModelAvailabilityVisibilityChains()
    {
        return vulkanMemoryModelAvailabilityVisibilityChains;
    }

    public void setVulkanMemoryModelAvailabilityVisibilityChains(boolean vulkanMemoryModelAvailabilityVisibilityChains)
    {
        this.vulkanMemoryModelAvailabilityVisibilityChains = vulkanMemoryModelAvailabilityVisibilityChains;
    }

    public boolean isShaderOutputViewportIndex()
    {
        return shaderOutputViewportIndex;
    }

    public void setShaderOutputViewportIndex(boolean shaderOutputViewportIndex)
    {
        this.shaderOutputViewportIndex = shaderOutputViewportIndex;
    }

    public boolean isShaderOutputLayer()
    {
        return shaderOutputLayer;
    }

    public void setShaderOutputLayer(boolean shaderOutputLayer)
    {
        this.shaderOutputLayer = shaderOutputLayer;
    }

    public boolean isSubgroupBroadcastDynamicId()
    {
        return subgroupBroadcastDynamicId;
    }

    public void setSubgroupBroadcastDynamicId(boolean subgroupBroadcastDynamicId)
    {
        this.subgroupBroadcastDynamicId = subgroupBroadcastDynamicId;
    }
}
