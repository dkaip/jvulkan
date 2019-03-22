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
package com.CIMthetics.jvulkan.VulkanCore.VK11;

import java.util.Collection;
import java.util.EnumSet;

import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkDependencyFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkFormat;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkImageLayout;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkIndexType;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkMemoryMapFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkPipelineBindPoint;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkPipelineStageFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkPresentModeKHR;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkQueryControlFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkQueryType;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkResult;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkSubpassContents;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Handles.MappedMemoryPointer;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Handles.VkBuffer;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Handles.VkCommandBuffer;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Handles.VkCommandPool;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Handles.VkDescriptorPool;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Handles.VkDescriptorSet;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Handles.VkDescriptorSetLayout;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Handles.VkDevice;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Handles.VkDeviceMemory;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Handles.VkFence;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Handles.VkFramebuffer;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Handles.VkImage;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Handles.VkImageView;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Handles.VkInstance;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Handles.VkPhysicalDevice;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Handles.VkPipeline;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Handles.VkPipelineCache;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Handles.VkPipelineLayout;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Handles.VkQueryPool;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Handles.VkQueue;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Handles.VkRenderPass;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Handles.VkSampler;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Handles.VkSemaphore;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Handles.VkShaderModule;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Handles.VkSwapchainKHR;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Handles.VulkanHandle;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.IntReturnValue;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkAcquireNextImageInfoKHR;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkAllocationCallbacks;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkBindBufferMemoryInfo;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkBufferCopy;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkBufferImageCopy;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkBufferMemoryBarrier;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkCopyDescriptorSet;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkExtensionProperties;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkFormatProperties;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkImageMemoryBarrier;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkMemoryBarrier;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkMemoryRequirements;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkPhysicalDeviceFeatures;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkPhysicalDeviceMemoryProperties;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkPhysicalDeviceProperties;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkQueueFamilyProperties;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkRect2D;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkSurfaceCapabilitiesKHR;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkSurfaceFormatKHR;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkWriteDescriptorSet;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VkBufferCreateInfo;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VkCommandBufferAllocateInfo;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VkCommandBufferBeginInfo;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VkCommandPoolCreateInfo;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VkDescriptorPoolCreateInfo;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VkDescriptorSetAllocateInfo;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VkDescriptorSetLayoutCreateInfo;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VkDeviceCreateInfo;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VkFenceCreateInfo;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VkFramebufferCreateInfo;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VkGraphicsPipelineCreateInfo;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VkImageCreateInfo;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VkImageViewCreateInfo;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VkInstanceCreateInfo;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VkMemoryAllocateInfo;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VkPipelineLayoutCreateInfo;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VkPresentInfoKHR;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VkRenderPassBeginInfo;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VkRenderPassCreateInfo;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VkRenderPassCreateInfo2KHR;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VkSamplerCreateInfo;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VkSemaphoreCreateInfo;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VkShaderModuleCreateInfo;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VkSubmitInfo;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VkSubpassBeginInfoKHR;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VkSubpassEndInfoKHR;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VkSwapchainCreateInfoKHR;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Enums.VkCoarseSampleOrderTypeNV;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Enums.VkCopyAccelerationStructureModeNV;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Enums.VkTimeDomainEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkAccelerationStructureInfoNV;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkAccelerationStructureMemoryRequirementsInfoNV;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkBindAccelerationStructureMemoryInfoNV;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkBufferDeviceAddressInfoEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkCalibratedTimestampInfoEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkCheckpointDataNV;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkCoarseSampleOrderCustomNV;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkConditionalRenderingBeginInfoEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkCooperativeMatrixPropertiesNV;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkImageDrmFormatModifierPropertiesEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkMemoryRequirements2KHR;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkShadingRatePaletteNV;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.CreateInfos.VkAccelerationStructureCreateInfoNV;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.CreateInfos.VkDebugReportCallbackCreateInfoEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.CreateInfos.VkRayTracingPipelineCreateInfoNV;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.CreateInfos.VkWaylandSurfaceCreateInfoKHR;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Handles.CheckpointMarker;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Handles.VkAccelerationStructureNV;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Handles.VkDebugReportCallbackEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Handles.VkDeviceAddress;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Handles.VkSurfaceKHR;
import com.CIMthetics.jvulkan.Wayland.WlRegistryListener;
import com.CIMthetics.jvulkan.Wayland.Handles.WlCompositor;
import com.CIMthetics.jvulkan.Wayland.Handles.WlDisplay;
import com.CIMthetics.jvulkan.Wayland.Handles.WlRegistry;
import com.CIMthetics.jvulkan.Wayland.Handles.WlShell;
import com.CIMthetics.jvulkan.Wayland.Handles.WlShellSurface;
import com.CIMthetics.jvulkan.Wayland.Handles.WlSurface;

class NativeProxies
{
    native VkResult vkAcquireNextImage2KHR(
            VkDevice vulkanLogicalDevice,
            VkAcquireNextImageInfoKHR acquireInfo,
            int imageIndex);
    
    native VkResult vkAcquireNextImageKHR(
            VkDevice vulkanLogicalDevice,
            VkSwapchainKHR swapchain,
            long timeout,
            VkSemaphore semaphore,
            VkFence fence,
            IntReturnValue imageIndex);
    
    native VkResult vkAllocateCommandBuffers(
            VkDevice vulkanLogicalDevice,
            VkCommandBufferAllocateInfo commandBufferAllocateInfo,
            Collection<VkCommandBuffer> commandBufferCollection);
    
    native VkResult vkAllocateDescriptorSets(
            VkDevice vulkanLogicalDevice,
            VkDescriptorSetAllocateInfo vkDescriptorSetAllocateInfo,
            Collection<VkDescriptorSet> descriptorSets);
    
    native VkResult vkAllocateMemory(
            VkDevice vulkanLogicalDevice,
            VkMemoryAllocateInfo vkMemoryAllocateInfo,
            VkAllocationCallbacks alternateAllocator,
            VkDeviceMemory vkDeviceMemory);
    
    native VkResult vkBeginCommandBuffer(
            VkCommandBuffer vkCommandBuffer,
            VkCommandBufferBeginInfo vkCommandBufferBeginInfo);
    
    native VkResult vkBindAccelerationStructureMemoryNV(
            VkDevice vulkanLogicalDevice,
            Collection<VkBindAccelerationStructureMemoryInfoNV> bindInfos);
    
    native VkResult vkBindBufferMemory(
            VkDevice vulkanLogicalDevice,
            VkBuffer vkBuffer,
            VkDeviceMemory vkDeviceMemory,
            long memoryOffset);
    
    native VkResult vkBindBufferMemory2(
            VkDevice vulkanLogicalDevice,
            Collection<VkBindBufferMemoryInfo> bindInfos);
    
    native VkResult vkBindBufferMemory2KHR(
            VkDevice vulkanLogicalDevice,
            Collection<VkBindBufferMemoryInfo> bindInfos);
    
    native VkResult vkBindImageMemory(
            VkDevice vkDevice,
            VkImage vkImage,
            VkDeviceMemory vkDeviceMemory,
            long vkDeviceSize);
    
    native void vkCmdBeginConditionalRenderingEXT(
            VkCommandBuffer vkCommandBuffer,
            VkConditionalRenderingBeginInfoEXT vkConditionalRenderingBeginInfoEXT);
    
    native void vkCmdBeginQueryIndexedEXT(
            VkCommandBuffer commandBuffer,
            VkQueryPool queryPool,
            int query,
            EnumSet<VkQueryControlFlagBits> flags,
            int index);
    
    native void vkCmdBeginRenderPass(
            VkCommandBuffer vkCommandBuffer,
            VkRenderPassBeginInfo vkRenderPassBeginInfo,
            VkSubpassContents vkSubpassContents);
    
    native void vkCmdBeginRenderPass2KHR(
            VkCommandBuffer vkCommandBuffer,
            VkRenderPassBeginInfo vkRenderPassBeginInfo,
            VkSubpassBeginInfoKHR vkSubpassContents);
    
    native void vkCmdBeginTransformFeedbackEXT(
            VkCommandBuffer commandBuffer,
            int firstCounterBuffer,
            int counterBufferCount,
            Collection<VkBuffer> counterBuffers,
            long[] counterBufferOffsets);
    
    native void vkCmdBindDescriptorSets(
            VkCommandBuffer vkCommandBuffer,
            VkPipelineBindPoint vkPipelineBindPoint,
            VkPipelineLayout vkPipelineLayout,
            int firstSet,
            Collection<VkDescriptorSet> descriptorSets,
            int[] dynamicOffsets);
    
    native void vkCmdBindIndexBuffer(
            VkCommandBuffer vkCommandBuffer,
            VkBuffer vkBuffer,
            long offset,
            VkIndexType vkIndexType);
    
    native void vkCmdBindPipeline(
            VkCommandBuffer vkCommandBuffer,
            VkPipelineBindPoint vkPipelineBindPoint,
            VkPipeline vkPipeline);
    
    native void vkCmdBindShadingRateImageNV(
            VkCommandBuffer vkCommandBuffer,
            VkImageView imageView,
            VkImageLayout imageLayout);

    native void vkCmdBindTransformFeedbackBuffersEXT(
            VkCommandBuffer commandBuffer,
            int firstBinding,
            int bindingCount,
            Collection<VkBuffer> buffers,
            long[] offsets,
            long[] sizes);

    native void vkCmdBindVertexBuffers(
            VkCommandBuffer vkCommandBuffer,
            int firstBinding,
            Collection<VkBuffer> vkBufferCollection,
            long[] offsets);
    
    native void vkCmdCopyBuffer(
            VkCommandBuffer vkCommandBuffer,
            VkBuffer srcBuffer,
            VkBuffer dstBuffer,
            Collection<VkBufferCopy> vkBufferCopyCollection);
    
    native void vkCmdBuildAccelerationStructureNV(
            VkCommandBuffer vkCommandBuffer,
            VkAccelerationStructureInfoNV info,
            VkBuffer instanceData,
            long instanceOffset,
            boolean update,
            VkAccelerationStructureNV dst,
            VkAccelerationStructureNV src,
            VkBuffer scratch,
            long scratchOffset);
    
    native void vkCmdCopyAccelerationStructureNV(
            VkCommandBuffer vkCommandBuffer,
            VkAccelerationStructureNV dst,
            VkAccelerationStructureNV src,
            VkCopyAccelerationStructureModeNV mode);
    
    native void vkCmdCopyBufferToImage(
            VkCommandBuffer vkCommandBuffer,
            VkBuffer srcBuffer,
            VkImage dstImage,
            VkImageLayout dstImageLayout,
            Collection<VkBufferImageCopy> regions);
    
    native void vkCmdDraw(
            VkCommandBuffer vkCommandBuffer,
            int vertexCount,
            int instanceCount,
            int firstVertex,
            int firstInstance);
    
    native void vkCmdDrawIndirectByteCountEXT(
            VkCommandBuffer commandBuffer,
            int instanceCount,
            int firstInstance,
            VkBuffer counterBuffer,
            long counterBufferOffset,
            int counterOffset,
            int vertexStride);
    
    native void vkCmdDrawIndexed(
            VkCommandBuffer vkCommandBuffer,
            int indexCount,
            int instanceCount,
            int firstIndex,
            int vertexOffset,
            int firstInstance);
    
    native void vkCmdDrawMeshTasksNV(
            VkCommandBuffer vkCommandBuffer,
            int taskCount,
            int firstTask);
    
    native void vkCmdDrawMeshTasksIndirectNV(
            VkCommandBuffer vkCommandBuffer,
            VkBuffer buffer,
            long offset,
            int drawCount,
            int stride);
    
    native void vkCmdDrawMeshTasksIndirectCountNV(
            VkCommandBuffer vkCommandBuffer,
            VkBuffer buffer,
            long offset,
            VkBuffer countBuffer,
            long countBufferOffset,
            int maxDrawCount,
            int stride);
    
    native void vkCmdEndConditionalRenderingEXT(
            VkCommandBuffer vkCommandBuffer);
    
    native void vkCmdEndQueryIndexedEXT(
            VkCommandBuffer commandBuffer,
            VkQueryPool queryPool,
            int query,
            int index);
    
    native void vkCmdEndRenderPass(
            VkCommandBuffer vkCommandBuffer);
    
    native void vkCmdEndRenderPass2KHR(
            VkCommandBuffer vkCommandBuffer,
            VkSubpassEndInfoKHR subpassEndInfoKHR);
    
    native void vkCmdEndTransformFeedbackEXT(
            VkCommandBuffer commandBuffer,
            int firstCounterBuffer,
            int counterBufferCount,
            Collection<VkBuffer> counterBuffers,
            long[] counterBufferOffsets);
    
    native void vkCmdNextSubpass2KHR(
            VkCommandBuffer vkCommandBuffer,
            VkSubpassBeginInfoKHR subpassBeginInfoKHR,
            VkSubpassEndInfoKHR subpassEndInfoKHR);
    
    native void vkCmdPipelineBarrier(
            VkCommandBuffer vkCommandBuffer,
            EnumSet<VkPipelineStageFlagBits> srcStageMask,
            EnumSet<VkPipelineStageFlagBits> dstStageMask,
            EnumSet<VkDependencyFlagBits> dependencyFlags,
            Collection<VkMemoryBarrier> memoryBarriers,
            Collection<VkBufferMemoryBarrier> bufferMemoryBarriers,
            Collection<VkImageMemoryBarrier> imageMemoryBarriers);
    
    native void vkCmdSetCheckpointNV(
            VkCommandBuffer vkCommandBuffer,
            CheckpointMarker checkpointMarker);
    
    native void vkCmdSetCoarseSampleOrderNV(
            VkCommandBuffer vkCommandBuffer,
            VkCoarseSampleOrderTypeNV sampleOrderType,
            Collection<VkCoarseSampleOrderCustomNV> customSampleOrders);
    
    native void vkCmdSetExclusiveScissorNV(
            VkCommandBuffer vkCommandBuffer,
            int firstExclusiveScissor,
            Collection<VkRect2D> exclusiveScissors);
    
    native void vkCmdSetViewportShadingRatePaletteNV(
            VkCommandBuffer vkCommandBuffer,
            int firstViewport,
            Collection<VkShadingRatePaletteNV> shadingRatePalettes);
    
    native void vkCmdTraceRaysNV(
            VkCommandBuffer vkCommandBuffer,
            VkBuffer raygenShaderBindingTableBuffer,
            long raygenShaderBindingOffset,
            VkBuffer missShaderBindingTableBuffer,
            long missShaderBindingOffset,
            long missShaderBindingStride,
            VkBuffer hitShaderBindingTableBuffer,
            long hitShaderBindingOffset,
            long hitShaderBindingStride,
            VkBuffer callableShaderBindingTableBuffer,
            long callableShaderBindingOffset,
            long callableShaderBindingStride,
            int width,
            int height,
            int depth);
    
    native void vkCmdWriteAccelerationStructuresPropertiesNV(
            VkCommandBuffer vkCommandBuffer,
            Collection<VkAccelerationStructureNV> accelerationStructures,
            VkQueryType queryType,
            VkQueryPool queryPool,
            int firstQuery);
    
    native VkResult vkCompileDeferredNV(
            VkDevice vulkanLogicalDevice,
            VkPipeline pipeline,
            int shader);
    
    native VkResult vkCreateAccelerationStructureNV(
            VkDevice vkDevice,
            VkAccelerationStructureCreateInfoNV createInfo,
            VkAllocationCallbacks alternateAllocator,
            VkAccelerationStructureNV accelerationStructure);
    
    native VkResult vkCreateBuffer(
            VkDevice vulkanLogicalDevice,
            VkBufferCreateInfo vkBufferCreateInfo,
            VkAllocationCallbacks alternateAllocator,
            VkBuffer vkBuffer);
    
    native VkResult vkCreateCommandPool(
            VkDevice vulkanLogicalDevice,
            VkCommandPoolCreateInfo vkCommandPoolCreateInfo,
            VkAllocationCallbacks alternateAllocator,
            VkCommandPool commandPool);
    
    // TODO these may need to be removed and put into a debug section...
    native VkResult vkCreateDebugReportCallbackEXT(
            VkInstance vkInstance,
            VkDebugReportCallbackCreateInfoEXT dbgCreateInfo,
            VkAllocationCallbacks alternateAllocator,
            VkDebugReportCallbackEXT callback);
    
    native VkResult vkCreateDescriptorPool(
            VkDevice vulkanLogicalDevice,
            VkDescriptorPoolCreateInfo vkDescriptorPoolCreateInfo,
            VkAllocationCallbacks alternateAllocator,
            VkDescriptorPool vkDescriptorPool);
    
    native VkResult vkCreateDescriptorSetLayout(
            VkDevice vulkanLogicalDevice,
            VkDescriptorSetLayoutCreateInfo vkDescriptorSetLayoutCreateInfo,
            VkAllocationCallbacks alternateAllocator,
            VkDescriptorSetLayout vkDescriptorSetLayout);
    
    native VkResult vkCreateDevice(
            VkPhysicalDevice physicalDevice,
            VkDeviceCreateInfo deviceCreateInfo,
            VkAllocationCallbacks alternateAllocator,
            VkDevice device);
    
    native VkResult vkCreateFence(
            VkDevice vulkanLogicalDevice,
            VkFenceCreateInfo vkFenceCreateInfo,
            VkAllocationCallbacks alternateAllocator,
            VkFence vkFence);
    
    native VkResult vkCreateFramebuffer(
            VkDevice vulkanLogicalDevice,
            VkFramebufferCreateInfo vkFramebufferCreateInfo,
            VkAllocationCallbacks alternateAllocator,
            VkFramebuffer framebuffer);
    
    native VkResult vkCreateGraphicsPipelines(
            VkDevice vulkanLogicalDevice,
            VkPipelineCache pipelineCache,
            Collection<VkGraphicsPipelineCreateInfo> graphicsPipelineCreateInfo,
            VkAllocationCallbacks alternateAllocator,
            Collection<VkPipeline> pipeline);
    
    native VkResult vkCreateImage(
            VkDevice vulkanLogicalDevice,
            VkImageCreateInfo vkImageCreateInfo,
            VkAllocationCallbacks alternateAllocator,
            VkImage vkImage);
    
    native VkResult vkCreateImageView(
            VkDevice vulkanLogicalDevice,
            VkImageViewCreateInfo imageViewCreateInfo,
            VkAllocationCallbacks alternateAllocator,
            VkImageView imageViewHandle);
    
    native VkResult vkCreateInstance(
            VkInstanceCreateInfo instanceCreateInfo,
            VkAllocationCallbacks alternateAllocator,
            VkInstance vkInstance);
    
    native VkResult vkCreatePipelineLayout(
            VkDevice vulkanLogicalDevice,
            VkPipelineLayoutCreateInfo pipelineLayoutCreateInfo,
            VkAllocationCallbacks alternateAllocator,
            VkPipelineLayout pipelineLayout);
    
    native VkResult vkCreateRayTracingPipelinesNV(
            VkDevice vulkanLogicalDevice,
            VkPipelineCache pipelineCache,
            Collection<VkRayTracingPipelineCreateInfoNV> createInfos,
            VkAllocationCallbacks alternateAllocator,
            Collection<VkPipeline> pipelines);
    
    native VkResult vkCreateRenderPass(
            VkDevice vulkanLogicalDevice,
            VkRenderPassCreateInfo renderPassCreateInfo,
            VkAllocationCallbacks alternateAllocator,
            VkRenderPass renderPassHandle);
    
    native VkResult vkCreateRenderPass2KHR(
            VkDevice vulkanLogicalDevice,
            VkRenderPassCreateInfo2KHR renderPassCreateInfo2KHR,
            VkAllocationCallbacks alternateAllocator,
            VkRenderPass renderPassHandle);
    
    native VkResult vkCreateSampler(
            VkDevice vulkanLogicalDevice,
            VkSamplerCreateInfo vkSamplerCreateInfo,
            VkAllocationCallbacks alternateAllocator,
            VkSampler vkSampler);
    
    native VkResult vkCreateSemaphore(
            VkDevice vulkanLogicalDevice,
            VkSemaphoreCreateInfo vkSemaphoreCreateInfo,
            VkAllocationCallbacks alternateAllocator,
            VkSemaphore vkSemaphore);
    
    native VkResult vkCreateShaderModule(
            VkDevice vulkanLogicalDevice,
            VkShaderModuleCreateInfo shaderModuleCreateInfo,
            VkAllocationCallbacks alternateAllocator,
            VkShaderModule shaderModule);
    
    native VkResult vkCreateSwapchainKHR(
            VkDevice vulkanLogicalDevice,
            VkSwapchainCreateInfoKHR swapchainCreateInfo,
            VkAllocationCallbacks alternateAllocator,
            VkSwapchainKHR swapchainHandle);
    
    native VkResult vkCreateWaylandSurfaceKHR(
            VkInstance vkInstance,
            VkWaylandSurfaceCreateInfoKHR vkWaylandSurfaceCreateInfoKHR,
            VkAllocationCallbacks alternateAllocator,
            VkSurfaceKHR vkSurfaceVKR);
    
    native void vkDestroyAccelerationStructureNV(
            VkDevice vkDevice,
            VkAccelerationStructureNV accelerationStructure,
            VkAllocationCallbacks alternateAllocator);
    
    native void vkDestroyBuffer(
            VkDevice vkDevice,
            VkBuffer vkBuffer,
            VkAllocationCallbacks alternateAllocator);
    
    native void vkDestroyCommandPool(
            VkDevice vulkanLogicalDevice,
            VkCommandPool commandommandPoolHandle,
            VkAllocationCallbacks alternateAllocator);
    
    native void vkDestroyDebugReportCallbackEXT(
            VkInstance vkInstance,
            VkDebugReportCallbackEXT debugCallbackHandle,
            VkAllocationCallbacks alternateAllocator);
    
    native void vkDestroyDescriptorPool(
            VkDevice vkDevice,
            VkDescriptorPool vkDescriptorPool,
            VkAllocationCallbacks alternateAllocator);
    
    native void vkDestroyDescriptorSetLayout(
            VkDevice vkDevice,
            VkDescriptorSetLayout vkDescriptorSetLayout,
            VkAllocationCallbacks alternateAllocator);
    
    native void vkDestroyDevice(
            VkDevice device,
            VkAllocationCallbacks alternateAllocator);
    
    native void vkDestroyFence(
            VkDevice vulkanLogicalDevice,
            VkFence vkFence,
            VkAllocationCallbacks alternateAllocator);
    
    native void vkDestroyFramebuffer(
            VkDevice vulkanLogicalDevice,
            VkFramebuffer frameBufferHandle,
            VkAllocationCallbacks alternateAllocator);
    
    native void vkDestroyImage(
            VkDevice vulkanLogicalDevice,
            VkImage imageHandle,
            VkAllocationCallbacks alternateAllocator);
    
    native void vkDestroyImageView(
            VkDevice vulkanLogicalDevice,
            VkImageView imageViewHandle,
            VkAllocationCallbacks alternateAllocator);
    
    native void vkDestroyInstance(
            VkInstance vkInstance,
            VkAllocationCallbacks alternateAllocator);
    
    native void vkDestroyPipeline(
            VkDevice vulkanLogicalDevice,
            VkPipeline pipelineHandle,
            VkAllocationCallbacks alternateAllocator);
    
    native void vkDestroyPipelineLayout(
            VkDevice vulkanLogicalDevice,
            VkPipelineLayout renderPassHandle,
            VkAllocationCallbacks alternateAllocator);
    
    native void vkDestroyRenderPass(
            VkDevice vulkanLogicalDevice,
            VkRenderPass renderPassHandle,
            VkAllocationCallbacks alternateAllocator);
    
    native void vkDestroySampler(
            VkDevice vulkanLogicalDevice,
            VkSampler samplerHandle,
            VkAllocationCallbacks alternateAllocator);
    
    native void vkDestroySemaphore(
            VkDevice vulkanLogicalDevice,
            VkSemaphore vkSemaphore,
            VkAllocationCallbacks alternateAllocator);
    
    native void vkDestroyShaderModule(
            VkDevice vulkanLogicalDevice,
            VkShaderModule vkShaderModule,
            VkAllocationCallbacks alternateAllocator);
    
    native void vkDestroySurfaceKHR(
            VkInstance vulkanInstance,
            VkSurfaceKHR windowSurfaceHandle,
            VkAllocationCallbacks alternateAllocator);
    
    native void vkDestroySwapchainKHR(
            VkDevice vulkanLogicalDevice,
            VkSwapchainKHR swapchainHandle,
            VkAllocationCallbacks alternateAllocator);
    
    native VkResult vkDeviceWaitIdle(
            VkDevice vulkanLogicalDevice);
    
    native VkResult vkEndCommandBuffer(
            VkCommandBuffer vkCommandBuffer);
    
    native VkResult vkEnumerateDeviceExtensionProperties(
            VkPhysicalDevice physicalDevice,
            String layerName,
            Collection<VkExtensionProperties> collectionOfExtensionProperties);
    
    native VkResult vkEnumeratePhysicalDevices(
            VkInstance vkInstance,
            Collection<VkPhysicalDevice> collectionOfPhysicalDevices);
    
    native void vkFreeCommandBuffers(
            VkDevice vulkanLogicalDevice,
            VkCommandPool commandPoolHandle,
            Collection<VkCommandBuffer> commandBufferHandles);
    
    native void vkFreeMemory(
            VkDevice vkDevice,
            VkDeviceMemory vkDeviceMemory,
            VkAllocationCallbacks alternateAllocator);
    
    native VkResult vkGetAccelerationStructureHandleNVX(
            VkDevice vulkanLogicalDevice,
            VkAccelerationStructureNV accelerationStructure,
            Collection<VkAccelerationStructureNV> data);
    
    native void vkGetAccelerationStructureMemoryRequirementsNV(
            VkDevice vulkanLogicalDevice,
            VkAccelerationStructureMemoryRequirementsInfoNV vkAccelerationStructureMemoryRequirementsInfoNV,
            VkMemoryRequirements2KHR vkMemoryRequirements2KHR);
    
    native void vkGetAccelerationStructureScratchMemoryRequirementsNVX(
            VkDevice vulkanLogicalDevice,
            VkAccelerationStructureMemoryRequirementsInfoNV vkAccelerationStructureMemoryRequirementsInfoNVX,
            VkMemoryRequirements2KHR vkMemoryRequirements2KHR);
    
    native VkDeviceAddress vkGetBufferDeviceAddressEXT(
            VkDevice vulkanLogicalDevice,
            VkBufferDeviceAddressInfoEXT info);

    native void vkGetBufferMemoryRequirements(
            VkDevice vulkanLogicalDevice,
            VkBuffer vkBuffer,
            VkMemoryRequirements vkMemoryRequirements);
    
    native VkResult vkGetCalibratedTimestampsEXT(
            VkDevice device,
            Collection<VkCalibratedTimestampInfoEXT> timestampInfos,
            long[] timestamps,
            long[] maxDeviation);
    
    native void vkGetDeviceQueue(
            VkDevice logicalDevice,
            int queueFamilyIndex,
            int queueIndex,
            VkQueue queue);
    
    native VkResult vkGetImageDrmFormatModifierPropertiesEXT(
            VkDevice device,
            VkImage image,
            Collection<VkImageDrmFormatModifierPropertiesEXT> properties);

    native void vkGetImageMemoryRequirements(
            VkDevice vulkanLogicalDevice,
            VkImage vkImage,
            VkMemoryRequirements vkMemoryRequirements);
    
    native VkResult vkGetPhysicalDeviceCalibrateableTimeDomainsEXT(
            VkPhysicalDevice physicalDevice,
            Collection<VkTimeDomainEXT> timeDomains);
    
    native VkResult vkGetPhysicalDeviceCooperativeMatrixPropertiesNV(
            VkPhysicalDevice                            physicalDevice,
            Collection<VkCooperativeMatrixPropertiesNV> properties);
    
    native void vkGetPhysicalDeviceFeatures(
            VkPhysicalDevice physicalDevice,
            VkPhysicalDeviceFeatures deviceFeatures);
    
    native void vkGetPhysicalDeviceFormatProperties(
            VkPhysicalDevice vulkanPhysicalDevice,
            VkFormat format,
            VkFormatProperties formatProperties);
    
    native void vkGetPhysicalDeviceMemoryProperties(
            VkPhysicalDevice vulkanPhysicalDevice,
            VkPhysicalDeviceMemoryProperties vkPhysicalDeviceMemoryProperties);
    
    native void vkGetPhysicalDeviceProperties(
            VkPhysicalDevice physicalDevice,
            VkPhysicalDeviceProperties deviceProperties);
    
    native void vkGetPhysicalDeviceQueueFamilyProperties(
            VkPhysicalDevice physicalDevice,
            Collection<VkQueueFamilyProperties> collectionOfExtensionProperties);
    
    native VkResult vkGetPhysicalDeviceSurfaceCapabilitiesKHR(
            VkPhysicalDevice physicalDevice,
            VkSurfaceKHR     surface,
            VkSurfaceCapabilitiesKHR surfaceCapabilities);
    
    native VkResult vkGetPhysicalDeviceSurfaceFormatsKHR(
            VkPhysicalDevice physicalDevice,
            VkSurfaceKHR     surface,
            Collection<VkSurfaceFormatKHR>     surfaceFormats);
    
    native VkResult vkGetPhysicalDeviceSurfacePresentModesKHR(
            VkPhysicalDevice physicalDevice,
            VkSurfaceKHR     surface,
            Collection<VkPresentModeKHR> presentationModes);
    
    native VkResult vkGetPhysicalDeviceSurfaceSupportKHR(
            VkPhysicalDevice physicalDevice,
            int queueFamilyIndex,
            VkSurfaceKHR surface,
            boolean[] supported);
    
    native boolean vkGetPhysicalDeviceWaylandPresentationSupportKHR(
            VkPhysicalDevice physicalDevice,
            int queueFamilyIndex,
            WlDisplay waylandDisplay);
    
    native void vkGetQueueCheckpointDataNV(
            VkQueue queue,
            Collection<VkCheckpointDataNV> checkpointData);
    
    native VkResult vkGetRayTracingShaderGroupHandlesNV(
            VkDevice device,
            VkPipeline pipeline,
            int firstGroup,
            int groupCount,
            long dataSize, // may not need this
            byte[] data);

    native VkResult vkGetRayTracingShaderHandlesNV(
            VkDevice vulkanLogicalDevice,
            VkPipeline  pipeline,
            int firstGroup,
            int shaderCount,
            Collection<VkShaderModule> data);
    
    native VkResult vkGetSwapchainImagesKHR(
            VkDevice vulkanLogicalDevice,
            VkSwapchainKHR swapchain,
            Collection<VkImage> swapchainImages);
    
    native VkResult vkMapMemory(
            VkDevice vulkanLogicalDevice,
            VkDeviceMemory vkDeviceMemory,
            long offset,
            long size,
            EnumSet<VkMemoryMapFlagBits> flags,
            MappedMemoryPointer pData);
    
    native VkResult vkQueuePresentKHR(
            VkQueue queue,
            VkPresentInfoKHR vkPresentInfoKHR);
    
    native VkResult vkQueueSubmit(
            VkQueue queue,
            Collection<VkSubmitInfo> submits,
            VkFence fence);
    
    native VkResult vkQueueWaitIdle(
            VkQueue vkQueue);
    
    native void vkResetFences(
            VkDevice vulkanLogicalDevice,
            Collection<VkFence> vkFences);
    
    native void vkUnmapMemory(
            VkDevice vulkanLogicalDevice,
            VkDeviceMemory vkDeviceMemory);
    
    native void vkUpdateDescriptorSets(
            VkDevice vulkanLogicalDevice,
            Collection<VkWriteDescriptorSet> descriptorWrites,
            Collection<VkCopyDescriptorSet> descriptorCopies);
    
    native VkResult vkWaitForFences(
            VkDevice vulkanLogicalDevice,
            Collection<VkFence> vkFences,
            boolean waitAll,
            long timeout);
    
    
    
    
    
    
    
    
    
    native void pushDataToVirtualMemory(
            byte[] byteBuffer,
            MappedMemoryPointer pointerToMappedMemory);
    
    native void pushDataToVirtualMemory(
            float[] floatBuffer,
            MappedMemoryPointer pointerToMappedMemory);
    
    native void pushDataToVirtualMemory(
            int[] intBuffer,
            MappedMemoryPointer pointerToMappedMemory);








    
    
    
    native WlDisplay wlConnectDisplay(
            String    displayName);

    native void wlDisconnectDisplay(
            WlDisplay waylandDisplay);
    
    native WlRegistry wlDisplayGetRegistry(
            WlDisplay waylandDisplay);

    native void wlRegistryAddListener(
            WlRegistry waylandRegistry,
            WlRegistryListener registryListener, 
            Object userData);
    
    native void wlDisplayDispatch(
            WlDisplay waylandDisplay);
    
    native void wlRoundTrip(
            WlDisplay waylandDisplay);
    
    native VulkanHandle wlRegistryBind(
            WlRegistry waylandRegistry,
            int interfaceId,
            String textInterfaceName,
            int interfaceVersion);
    
    native WlSurface wlCompositorCreateSurface(
            WlCompositor waylandCompositor);
    
    native WlShellSurface wlShellGetShellSurface(
            WlShell waylandShellInterface,
            WlSurface waylandSurface);
    
    native void wlShellSetTopLevel(
            WlShellSurface waylandshellSurface);
}

