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
import java.util.concurrent.LinkedBlockingQueue;

import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkCommandBufferResetFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkCommandPoolResetFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkCommandPoolTrimFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkDependencyFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkDescriptorPoolResetFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkExternalMemoryHandleTypeFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkFilter;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkFormat;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkImageCreateFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkImageLayout;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkImageTiling;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkImageType;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkImageUsageFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkIndexType;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkMemoryMapFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkPipelineBindPoint;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkPipelineStageFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkPresentModeKHR;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkQueryControlFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkQueryResultFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkQueryType;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkResult;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkSampleCountFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkShaderInfoTypeAMD;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkShaderStageFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkStencilFaceFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkSubpassContents;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Handles.MappedMemoryPointer;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Handles.VkBuffer;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Handles.VkBufferView;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Handles.VkCommandBuffer;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Handles.VkCommandPool;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Handles.VkDebugUtilsMessengerEXT;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Handles.VkDescriptorPool;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Handles.VkDescriptorSet;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Handles.VkDescriptorSetLayout;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Handles.VkDescriptorUpdateTemplate;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Handles.VkDevice;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Handles.VkDeviceMemory;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Handles.VkEvent;
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
import com.CIMthetics.jvulkan.VulkanCore.VK11.Handles.VkSamplerYcbcrConversion;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Handles.VkSemaphore;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Handles.VkShaderModule;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Handles.VkSwapchainKHR;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Handles.VulkanHandle;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.IntReturnValue;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.LongReturnValue;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkAcquireNextImageInfoKHR;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkAllocationCallbacks;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkBindBufferMemoryInfo;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkBindImageMemoryInfo;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkBindSparseInfo;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkBufferCopy;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkBufferImageCopy;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkBufferMemoryBarrier;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkBufferMemoryRequirementsInfo2;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkClearAttachment;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkClearColorValue;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkClearDepthStencilValue;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkClearRect;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkCopyDescriptorSet;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkDeviceQueueInfo2;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkExtensionProperties;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkExtent2D;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkExternalBufferProperties;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkExternalFenceProperties;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkExternalSemaphoreProperties;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkFormatProperties;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkFormatProperties2;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkImageBlit;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkImageCopy;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkImageFormatProperties;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkImageFormatProperties2;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkImageMemoryBarrier;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkImageMemoryRequirementsInfo2;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkImageResolve;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkImageSparseMemoryRequirementsInfo2;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkImageSubresource;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkImageSubresourceRange;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkLayerProperties;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkMappedMemoryRange;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkMemoryBarrier;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkMemoryRequirements;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkPhysicalDeviceExternalBufferInfo;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkPhysicalDeviceExternalFenceInfo;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkPhysicalDeviceExternalSemaphoreInfo;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkPhysicalDeviceFeatures;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkPhysicalDeviceFeatures2;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkPhysicalDeviceGroupProperties;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkPhysicalDeviceMemoryProperties;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkPhysicalDeviceMemoryProperties2;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkPhysicalDeviceProperties;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkPhysicalDeviceProperties2;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkPhysicalDeviceSparseImageFormatInfo2;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkQueueFamilyProperties;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkQueueFamilyProperties2;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkRect2D;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkSparseImageFormatProperties;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkSparseImageFormatProperties2;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkSparseImageMemoryRequirements;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkSubresourceLayout;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkSurfaceCapabilitiesKHR;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkSurfaceFormatKHR;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkViewport;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkWriteDescriptorSet;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VkBufferCreateInfo;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VkBufferViewCreateInfo;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VkCommandBufferAllocateInfo;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VkCommandBufferBeginInfo;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VkCommandPoolCreateInfo;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VkComputePipelineCreateInfo;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VkDescriptorPoolCreateInfo;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VkDescriptorSetAllocateInfo;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VkDescriptorSetLayoutCreateInfo;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VkDescriptorUpdateTemplateCreateInfo;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VkDeviceCreateInfo;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VkEventCreateInfo;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VkFenceCreateInfo;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VkFramebufferCreateInfo;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VkGraphicsPipelineCreateInfo;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VkImageCreateInfo;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VkImageViewCreateInfo;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VkInstanceCreateInfo;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VkMemoryAllocateInfo;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VkPipelineCacheCreateInfo;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VkPipelineLayoutCreateInfo;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VkPresentInfoKHR;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VkQueryPoolCreateInfo;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VkRenderPassBeginInfo;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VkRenderPassCreateInfo;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VkRenderPassCreateInfo2KHR;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VkSamplerCreateInfo;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VkSamplerYcbcrConversionCreateInfo;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VkSemaphoreCreateInfo;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VkShaderModuleCreateInfo;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VkSubmitInfo;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VkSubpassBeginInfoKHR;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VkSubpassEndInfoKHR;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VkSwapchainCreateInfoKHR;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Enums.VkCoarseSampleOrderTypeNV;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Enums.VkCopyAccelerationStructureModeNV;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Enums.VkDebugReportFlagBitsEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Enums.VkDebugReportObjectTypeEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Enums.VkDebugUtilsMessageSeverityFlagBitsEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Enums.VkDebugUtilsMessageTypeFlagBitsEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Enums.VkDeviceGroupPresentModeFlagBitsKHR;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Enums.VkExternalMemoryHandleTypeFlagBitsNV;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Enums.VkObjectEntryTypeNVX;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Enums.VkSurfaceCounterFlagBitsEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Enums.VkTimeDomainEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Handles.CheckpointMarker;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Handles.VkAccelerationStructureNV;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Handles.VkDebugReportCallbackEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Handles.VkDeviceAddress;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Handles.VkDisplayKHR;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Handles.VkDisplayModeKHR;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Handles.VkIndirectCommandsLayoutNVX;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Handles.VkObjectTableNVX;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Handles.VkPerformanceConfigurationINTEL;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Handles.VkSurfaceKHR;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Handles.VkValidationCacheEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkAccelerationStructureInfoNV;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkAccelerationStructureMemoryRequirementsInfoNV;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkBindAccelerationStructureMemoryInfoNV;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkBufferDeviceAddressInfoEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkCalibratedTimestampInfoEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkCheckpointDataNV;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkCmdProcessCommandsInfoNVX;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkCmdReserveSpaceForCommandsInfoNVX;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkCoarseSampleOrderCustomNV;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkConditionalRenderingBeginInfoEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkCooperativeMatrixPropertiesNV;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkDebugMarkerMarkerInfoEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkDebugMarkerObjectNameInfoEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkDebugMarkerObjectTagInfoEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkDebugUtilsLabelEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkDebugUtilsLabelEXTlabelInfo;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkDebugUtilsMessengerCallbackDataEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkDebugUtilsObjectNameInfoEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkDebugUtilsObjectTagInfoEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkDeviceEventInfoEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkDeviceGeneratedCommandsFeaturesNVX;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkDeviceGeneratedCommandsLimitsNVX;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkDeviceGroupPresentCapabilitiesKHR;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkDisplayEventInfoEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkDisplayModeProperties2KHR;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkDisplayModePropertiesKHR;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkDisplayPlaneCapabilities2KHR;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkDisplayPlaneCapabilitiesKHR;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkDisplayPlaneInfo2KHR;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkDisplayPlaneProperties2KHR;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkDisplayPlanePropertiesKHR;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkDisplayPowerInfoEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkDisplayProperties2KHR;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkDisplayPropertiesKHR;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkExternalImageFormatPropertiesNV;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkFenceGetFdInfoKHR;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkFramebufferMixedSamplesCombinationNV;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkHdrMetadataEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkImageDrmFormatModifierPropertiesEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkImageViewHandleInfoNVX;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkImportFenceFdInfoKHR;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkImportSemaphoreFdInfoKHR;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkInitializePerformanceApiInfoINTEL;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkMemoryFdPropertiesKHR;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkMemoryGetFdInfoKHR;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkMemoryHostPointerPropertiesEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkMemoryRequirements2;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkMemoryRequirements2KHR;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkMultisamplePropertiesEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkObjectTableEntryNVX;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkPastPresentationTimingGOOGLE;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkPerformanceConfigurationAcquireInfoINTEL;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkPerformanceMarkerInfoINTEL;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkPerformanceOverrideInfoINTEL;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkPerformanceParameterTypeINTEL;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkPerformanceStreamMarkerInfoINTEL;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkPhysicalDeviceImageFormatInfo2;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkPhysicalDeviceSurfaceInfo2KHR;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkPipelineExecutableInfoKHR;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkPipelineExecutableInternalRepresentationKHR;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkPipelineExecutablePropertiesKHR;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkPipelineExecutableStatisticKHR;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkPipelineInfoKHR;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkRefreshCycleDurationGOOGLE;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkSampleLocationsInfoEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkSemaphoreGetFdInfoKHR;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkShadingRatePaletteNV;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkSurfaceCapabilities2EXT;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkSurfaceCapabilities2KHR;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkSurfaceFormat2KHR;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkViewportWScalingNV;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.CreateInfos.VkAccelerationStructureCreateInfoNV;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.CreateInfos.VkDebugReportCallbackCreateInfoEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.CreateInfos.VkDebugUtilsMessengerCreateInfoEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.CreateInfos.VkDisplayModeCreateInfoKHR;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.CreateInfos.VkDisplaySurfaceCreateInfoKHR;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.CreateInfos.VkHeadlessSurfaceCreateInfoEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.CreateInfos.VkIndirectCommandsLayoutCreateInfoNVX;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.CreateInfos.VkObjectTableCreateInfoNVX;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.CreateInfos.VkPerformanceValueINTEL;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.CreateInfos.VkRayTracingPipelineCreateInfoNV;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.CreateInfos.VkValidationCacheCreateInfoEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.CreateInfos.VkWaylandSurfaceCreateInfoKHR;
import com.CIMthetics.jvulkan.Wayland.WlRegistryListener;
import com.CIMthetics.jvulkan.Wayland.Enums.WlShellSurfaceFullscreenMethod;
import com.CIMthetics.jvulkan.Wayland.Enums.WlShellSurfaceResize;
import com.CIMthetics.jvulkan.Wayland.Enums.WlShellSurfaceTransientBehavior;
import com.CIMthetics.jvulkan.Wayland.Handles.WlCompositorHandle;
import com.CIMthetics.jvulkan.Wayland.Handles.WlDisplayHandle;
import com.CIMthetics.jvulkan.Wayland.Handles.WlKeyboardHandle;
import com.CIMthetics.jvulkan.Wayland.Handles.WlOutputHandle;
import com.CIMthetics.jvulkan.Wayland.Handles.WlPointerHandle;
import com.CIMthetics.jvulkan.Wayland.Handles.WlRegionHandle;
import com.CIMthetics.jvulkan.Wayland.Handles.WlRegistryHandle;
import com.CIMthetics.jvulkan.Wayland.Handles.WlSeatHandle;
import com.CIMthetics.jvulkan.Wayland.Handles.WlShellHandle;
import com.CIMthetics.jvulkan.Wayland.Handles.WlShellSurfaceHandle;
import com.CIMthetics.jvulkan.Wayland.Handles.WlSurfaceHandle;
import com.CIMthetics.jvulkan.Wayland.Handles.WlTouchHandle;
import com.CIMthetics.jvulkan.Wayland.Objects.WaylandEventObject;

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
    
    native VkResult vkAcquirePerformanceConfigurationINTEL(
            VkDevice device,
            VkPerformanceConfigurationAcquireInfoINTEL acquireInfo,
            VkPerformanceConfigurationINTEL configuration);
    
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
    
    native VkResult vkBindImageMemory2(
            VkDevice vulkanLogicalDevice,
            Collection<VkBindImageMemoryInfo> bindInfos);
    
    native VkResult vkBindImageMemory2KHR(
            VkDevice vulkanLogicalDevice,
            Collection<VkBindImageMemoryInfo> bindInfos);
    
    native void vkCmdBeginConditionalRenderingEXT(
            VkCommandBuffer vkCommandBuffer,
            VkConditionalRenderingBeginInfoEXT vkConditionalRenderingBeginInfoEXT);
    
    native void vkCmdBeginDebugUtilsLabelEXT(
            VkCommandBuffer commandBuffer,
            VkDebugUtilsLabelEXT labelInfo);
    
    native void vkCmdBeginQuery(
            VkCommandBuffer commandBuffer,
            VkQueryPool queryPool,
            int query,
            EnumSet<VkQueryControlFlagBits> flags);
    
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
    
    native void vkCmdBlitImage(
            VkCommandBuffer                             commandBuffer,
            VkImage                                     srcImage,
            VkImageLayout                               srcImageLayout,
            VkImage                                     dstImage,
            VkImageLayout                               dstImageLayout,
            Collection<VkImageBlit>                     regions,
            VkFilter                                    filter);
    
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
    
    native void vkCmdClearAttachments(
            VkCommandBuffer commandBuffer,
            Collection<VkClearAttachment> attachments,
            Collection<VkClearRect> rects);
    
    native void vkCmdCopyAccelerationStructureNV(
            VkCommandBuffer vkCommandBuffer,
            VkAccelerationStructureNV dst,
            VkAccelerationStructureNV src,
            VkCopyAccelerationStructureModeNV mode);
    
    native void vkCmdClearColorImage(
            VkCommandBuffer commandBuffer,
            VkImage image,
            VkImageLayout imageLayout,
            VkClearColorValue color,
            Collection<VkImageSubresourceRange> ranges);
    
    native void vkCmdCopyBuffer(
            VkCommandBuffer vkCommandBuffer,
            VkBuffer srcBuffer,
            VkBuffer dstBuffer,
            Collection<VkBufferCopy> vkBufferCopyCollection);
    
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
    
    native void vkCmdClearDepthStencilImage(
            VkCommandBuffer                             commandBuffer,
            VkImage                                     image,
            VkImageLayout                               imageLayout,
            VkClearDepthStencilValue depthStencil,
            Collection<VkImageSubresourceRange> ranges);
    
    native void vkCmdCopyImage(
            VkCommandBuffer commandBuffer,
            VkImage srcImage,
            VkImageLayout srcImageLayout,
            VkImage dstImage,
            VkImageLayout dstImageLayout,
            Collection<VkImageCopy> regions);
    
    native void vkCmdCopyImageToBuffer(
            VkCommandBuffer commandBuffer,
            VkImage srcImage,
            VkImageLayout srcImageLayout,
            VkBuffer dstBuffer,
            Collection<VkBufferImageCopy> regions);
    
    native void vkCmdCopyQueryPoolResults(
            VkCommandBuffer commandBuffer,
            VkQueryPool queryPool,
            int firstQuery,
            int queryCount,
            VkBuffer dstBuffer,
            long dstOffset,
            long stride,
            EnumSet<VkQueryResultFlagBits> flags);
    
    native void vkCmdDebugMarkerBeginEXT(
            VkCommandBuffer commandBuffer,
            VkDebugMarkerMarkerInfoEXT markerInfo);
    
    native void vkCmdDebugMarkerEndEXT(
            VkCommandBuffer commandBuffer);
    
    native void vkCmdDebugMarkerInsertEXT(
            VkCommandBuffer commandBuffer,
            VkDebugMarkerMarkerInfoEXT markerInfo);
    
    native void vkCmdDispatch(
            VkCommandBuffer commandBuffer,
            int groupCountX,
            int groupCountY,
            int groupCountZ);
    
    native void vkCmdDispatchBase(
            VkCommandBuffer commandBuffer,
            int baseGroupX,
            int baseGroupY,
            int baseGroupZ,
            int groupCountX,
            int groupCountY,
            int groupCountZ);
    
    native void vkCmdDispatchIndirect(
            VkCommandBuffer commandBuffer,
            VkBuffer buffer,
            long offset);
    
    native void vkCmdDrawIndexed(
            VkCommandBuffer vkCommandBuffer,
            int indexCount,
            int instanceCount,
            int firstIndex,
            int vertexOffset,
            int firstInstance);
    
    native void vkCmdDrawIndexedIndirect(
            VkCommandBuffer commandBuffer,
            VkBuffer buffer,
            long offset,
            int drawCount,
            int stride);
    
    native void vkCmdDrawIndexedIndirectCountKHR(
            VkCommandBuffer commandBuffer,
            VkBuffer buffer,
            long offset,
            VkBuffer countBuffer,
            long countBufferOffset,
            int maxDrawCount,
            int stride);
    
    native void vkCmdDrawIndirect(
            VkCommandBuffer commandBuffer,
            VkBuffer buffer,
            long offset,
            int drawCount,
            int stride);
    
    native void vkCmdDrawIndirectByteCountEXT(
            VkCommandBuffer commandBuffer,
            int instanceCount,
            int firstInstance,
            VkBuffer counterBuffer,
            long counterBufferOffset,
            int counterOffset,
            int vertexStride);
    
    native void vkCmdDrawIndirectCountKHR(
            VkCommandBuffer commandBuffer,
            VkBuffer buffer,
            long offset,
            VkBuffer countBuffer,
            long countBufferOffset,
            int maxDrawCount,
            int stride);
    
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
    
    native void vkCmdEndDebugUtilsLabelEXT(
            VkCommandBuffer commandBuffer);
    
    native void vkCmdEndQuery(
            VkCommandBuffer commandBuffer,
            VkQueryPool queryPool,
            int query);
    
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
    
    native void vkCmdExecuteCommands(
            VkCommandBuffer commandBuffer,
            Collection<VkCommandBuffer> commandBuffers);
    
    native void vkCmdFillBuffer(
            VkCommandBuffer commandBuffer,
            VkBuffer dstBuffer,
            long dstOffset,
            long size,
            int data);
    
    native void vkCmdInsertDebugUtilsLabelEXT(
            VkCommandBuffer commandBuffer,
            VkDebugUtilsLabelEXT labelInfo);
    
    native void vkCmdNextSubpass(
            VkCommandBuffer commandBuffer,
            VkSubpassContents contents);
    
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
    
    native void vkCmdProcessCommandsNVX(
            VkCommandBuffer commandBuffer,
            VkCmdProcessCommandsInfoNVX processCommandsInfo);
    
    native void vkCmdPushConstants(
            VkCommandBuffer commandBuffer,
            VkPipelineLayout layout,
            EnumSet<VkShaderStageFlagBits> stageFlags,
            int offset,
            byte[] values);
    
    native void vkCmdPushDescriptorSetKHR(
            VkCommandBuffer commandBuffer,
            VkPipelineBindPoint pipelineBindPoint,
            VkPipelineLayout layout,
            int set,
            Collection<VkWriteDescriptorSet> descriptorWrites);
    
    native void vkCmdPushDescriptorSetWithTemplateKHR(
            VkCommandBuffer commandBuffer,
            VkDescriptorUpdateTemplate descriptorUpdateTemplate,
            VkPipelineLayout layout,
            int set,
            Collection<Object> data);
    
    native void vkCmdReserveSpaceForCommandsNVX(
            VkCommandBuffer commandBuffer,
            VkCmdReserveSpaceForCommandsInfoNVX reserveSpaceInfo);
    
    native void vkCmdResetEvent(
            VkCommandBuffer commandBuffer,
            VkEvent event,
            EnumSet<VkPipelineStageFlagBits> stageMask);
    
    native void vkCmdResetQueryPool(
            VkCommandBuffer commandBuffer,
            VkQueryPool queryPool,
            int firstQuery,
            int queryCount);
    
    native void vkCmdResolveImage(
            VkCommandBuffer commandBuffer,
            VkImage srcImage,
            VkImageLayout srcImageLayout,
            VkImage dstImage,
            VkImageLayout dstImageLayout,
            Collection<VkImageResolve> regions);
    
    native void vkCmdSetBlendConstants(
            VkCommandBuffer commandBuffer,
            float[] blendConstants);
    
    native void vkCmdSetCheckpointNV(
            VkCommandBuffer vkCommandBuffer,
            CheckpointMarker checkpointMarker);
    
    native void vkCmdSetCoarseSampleOrderNV(
            VkCommandBuffer vkCommandBuffer,
            VkCoarseSampleOrderTypeNV sampleOrderType,
            Collection<VkCoarseSampleOrderCustomNV> customSampleOrders);
    
    native void vkCmdSetDepthBias(
            VkCommandBuffer commandBuffer,
            float depthBiasConstantFactor,
            float depthBiasClamp,
            float depthBiasSlopeFactor);
    
    native void vkCmdSetDepthBounds(
            VkCommandBuffer commandBuffer,
            float minDepthBounds,
            float maxDepthBounds);
    
    native void vkCmdSetDeviceMask(
            VkCommandBuffer commandBuffer,
            int deviceMask);
    
    native void vkCmdSetDiscardRectangleEXT(
            VkCommandBuffer commandBuffer,
            int firstDiscardRectangle,
            Collection<VkRect2D> discardRectangles);
    
    native void vkCmdSetEvent(
            VkCommandBuffer commandBuffer,
            VkEvent event,
            EnumSet<VkPipelineStageFlagBits> stageMask);
    
    native void vkCmdSetExclusiveScissorNV(
            VkCommandBuffer vkCommandBuffer,
            int firstExclusiveScissor,
            Collection<VkRect2D> exclusiveScissors);
    
    native void vkCmdSetLineWidth(
            VkCommandBuffer commandBuffer,
            float lineWidth);
    
    native void vkCmdSetLineStippleEXT(
            VkCommandBuffer commandBuffer,
            int lineStippleFactor,
            short lineStipplePattern);
    
    native VkResult vkCmdSetPerformanceMarkerINTEL(
            VkCommandBuffer commandBuffer,
            VkPerformanceMarkerInfoINTEL markerInfo);
    
    native VkResult vkCmdSetPerformanceOverrideINTEL(
            VkCommandBuffer commandBuffer,
            VkPerformanceOverrideInfoINTEL overrideInfo);
    
    native VkResult vkCmdSetPerformanceStreamMarkerINTEL(
            VkCommandBuffer commandBuffer,
            VkPerformanceStreamMarkerInfoINTEL markerInfo);
    
    native void vkCmdSetSampleLocationsEXT(
            VkCommandBuffer commandBuffer,
            VkSampleLocationsInfoEXT sampleLocationsInfo);
    
    native void vkCmdSetScissor(
            VkCommandBuffer commandBuffer,
            int firstScissor,
            Collection<VkRect2D> scissors);
    
    native void vkCmdSetStencilCompareMask(
            VkCommandBuffer commandBuffer,
            EnumSet<VkStencilFaceFlagBits> faceMask,
            int compareMask);
    
    native void vkCmdSetStencilReference(
            VkCommandBuffer commandBuffer,
            EnumSet<VkStencilFaceFlagBits> faceMask,
            int reference);
    
    native void vkCmdSetStencilWriteMask(
            VkCommandBuffer commandBuffer,
            EnumSet<VkStencilFaceFlagBits> faceMask,
            int writeMask);
    
    native void vkCmdSetViewport(
            VkCommandBuffer commandBuffer,
            int firstViewport,
            Collection<VkViewport> viewports);
    
    native void vkCmdSetViewportShadingRatePaletteNV(
            VkCommandBuffer vkCommandBuffer,
            int firstViewport,
            Collection<VkShadingRatePaletteNV> shadingRatePalettes);
    
    native void vkCmdSetViewportWScalingNV(
            VkCommandBuffer commandBuffer,
            int firstViewport,
            Collection<VkViewportWScalingNV> viewportWScalings);
    
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
    
    native void vkCmdUpdateBuffer(
            VkCommandBuffer commandBuffer,
            VkBuffer dstBuffer,
            long dstOffset,
            byte[] data);
    
    native void vkCmdWaitEvents(
            VkCommandBuffer commandBuffer,
            Collection<VkEvent> events,
            EnumSet<VkPipelineStageFlagBits> srcStageMask,
            EnumSet<VkPipelineStageFlagBits> dstStageMask,
            Collection<VkMemoryBarrier> memoryBarriers,
            Collection<VkBufferMemoryBarrier> bufferMemoryBarriers,
            Collection<VkImageMemoryBarrier> imageMemoryBarriers);
    
    native void vkCmdWriteAccelerationStructuresPropertiesNV(
            VkCommandBuffer vkCommandBuffer,
            Collection<VkAccelerationStructureNV> accelerationStructures,
            VkQueryType queryType,
            VkQueryPool queryPool,
            int firstQuery);
    
    native void vkCmdWriteBufferMarkerAMD(
            VkCommandBuffer commandBuffer,
            VkPipelineStageFlagBits pipelineStage,
            VkBuffer dstBuffer,
            long dstOffset,
            int marker);
    
    native void vkCmdWriteTimestamp(
            VkCommandBuffer commandBuffer,
            VkPipelineStageFlagBits pipelineStage,
            VkQueryPool queryPool,
            int query);
    
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
    
    native VkResult vkCreateBufferView(
            VkDevice vulkanLogicalDevice,
            VkBufferViewCreateInfo vkBufferViewCreateInfo,
            VkAllocationCallbacks alternateAllocator,
            VkBufferView vkBufferView);
    
    native VkResult vkCreateCommandPool(
            VkDevice vulkanLogicalDevice,
            VkCommandPoolCreateInfo vkCommandPoolCreateInfo,
            VkAllocationCallbacks alternateAllocator,
            VkCommandPool commandPool);
    
    native VkResult vkCreateComputePipelines(
            VkDevice vulkanLogicalDevice,
            VkPipelineCache vkPipelineCache,
            Collection<VkComputePipelineCreateInfo> createInfos,
            VkAllocationCallbacks alternateAllocator,
            Collection<VkPipeline> pipelines);
    
    // TODO these may need to be removed and put into a debug section...
    native VkResult vkCreateDebugReportCallbackEXT(
            VkInstance vkInstance,
            VkDebugReportCallbackCreateInfoEXT dbgCreateInfo,
            VkAllocationCallbacks alternateAllocator,
            VkDebugReportCallbackEXT callback);
    
    native VkResult vkCreateDebugUtilsMessengerEXT(
            VkInstance vkInstance,
            VkDebugUtilsMessengerCreateInfoEXT createInfo,
            VkAllocationCallbacks alternateAllocator,
            VkDebugUtilsMessengerEXT messenger);
    
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
    
    native VkResult vkCreateDescriptorUpdateTemplate(
            VkDevice device,
            VkDescriptorUpdateTemplateCreateInfo createInfo,
            VkAllocationCallbacks alternateAllocator,
            VkDescriptorUpdateTemplate vkDescriptorUpdateTemplateHandle);
    
    native VkResult vkCreateDescriptorUpdateTemplateKHR(
            VkDevice device,
            VkDescriptorUpdateTemplateCreateInfo createInfo,
            VkAllocationCallbacks alternateAllocator,
            VkDescriptorUpdateTemplate vkDescriptorUpdateTemplateHandle);

    native VkResult vkCreateDevice(
            VkPhysicalDevice physicalDevice,
            VkDeviceCreateInfo deviceCreateInfo,
            VkAllocationCallbacks alternateAllocator,
            VkDevice device);
    
    native VkResult vkCreateDisplayModeKHR(
            VkPhysicalDevice physicalDevice,
            VkDisplayKHR display,
            VkDisplayModeCreateInfoKHR createInfo,
            VkAllocationCallbacks alternateAllocator,
            VkDisplayModeKHR vkDisplayModeKHRHandle);

    native VkResult vkCreateDisplayPlaneSurfaceKHR(
            VkInstance instance,
            VkDisplaySurfaceCreateInfoKHR createInfo,
            VkAllocationCallbacks alternateAllocator,
            VkSurfaceKHR surface);
    
    native VkResult vkCreateEvent(
            VkDevice device,
            VkEventCreateInfo createInfo,
            VkAllocationCallbacks allocator,
            VkEvent event);
    
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
    
    native VkResult vkCreateHeadlessSurfaceEXT(
            VkInstance instance,
            VkHeadlessSurfaceCreateInfoEXT createInfo,
            VkAllocationCallbacks allocator,
            VkSurfaceKHR surface);
    
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
    
    native VkResult vkCreateIndirectCommandsLayoutNVX(
            VkDevice device,
            VkIndirectCommandsLayoutCreateInfoNVX createInfo,
            VkAllocationCallbacks allocator,
            VkIndirectCommandsLayoutNVX indirectCommandsLayout);
    
    native VkResult vkCreateInstance(
            VkInstanceCreateInfo instanceCreateInfo,
            VkAllocationCallbacks alternateAllocator,
            VkInstance vkInstance);
    
    native VkResult vkCreateObjectTableNVX(
            VkDevice device,
            VkObjectTableCreateInfoNVX createInfo,
            VkAllocationCallbacks allocator,
            VkObjectTableNVX objectTable);
    
    native VkResult vkCreatePipelineCache(
            VkDevice device,
            VkPipelineCacheCreateInfo createInfo,
            VkAllocationCallbacks allocator,
            VkPipelineCache pipelineCache);
    
    native VkResult vkCreatePipelineLayout(
            VkDevice vulkanLogicalDevice,
            VkPipelineLayoutCreateInfo pipelineLayoutCreateInfo,
            VkAllocationCallbacks alternateAllocator,
            VkPipelineLayout pipelineLayout);
    
    native VkResult vkCreateQueryPool(
            VkDevice device,
            VkQueryPoolCreateInfo createInfo,
            VkAllocationCallbacks allocator,
            VkQueryPool queryPool);
    
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
    
    native VkResult vkCreateSamplerYcbcrConversion(
            VkDevice device,
            VkSamplerYcbcrConversionCreateInfo createInfo,
            VkAllocationCallbacks allocator,
            VkSamplerYcbcrConversion ycbcrConversion);
    
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
    
    native VkResult vkCreateSharedSwapchainsKHR(
            VkDevice device,
            Collection<VkSwapchainCreateInfoKHR> createInfos,
            VkAllocationCallbacks allocator,
            Collection<VkSwapchainKHR> swapchains);
    
    native VkResult vkCreateSwapchainKHR(
            VkDevice vulkanLogicalDevice,
            VkSwapchainCreateInfoKHR swapchainCreateInfo,
            VkAllocationCallbacks alternateAllocator,
            VkSwapchainKHR swapchainHandle);
    
    native VkResult vkCreateValidationCacheEXT(
            VkDevice device,
            VkValidationCacheCreateInfoEXT createInfo,
            VkAllocationCallbacks allocator,
            VkValidationCacheEXT validationCache);
    
    native VkResult vkCreateWaylandSurfaceKHR(
            VkInstance vkInstance,
            VkWaylandSurfaceCreateInfoKHR vkWaylandSurfaceCreateInfoKHR,
            VkAllocationCallbacks alternateAllocator,
            VkSurfaceKHR vkSurfaceVKR);
    
    native VkResult vkDebugMarkerSetObjectNameEXT(
            VkDevice device,
            VkDebugMarkerObjectNameInfoEXT nameInfo);
    
    native VkResult vkDebugMarkerSetObjectTagEXT(
            VkDevice device,
            VkDebugMarkerObjectTagInfoEXT tagInfo);
    
    native void vkDebugReportMessageEXT(
            VkInstance instance,
            EnumSet<VkDebugReportFlagBitsEXT> flags,
            VkDebugReportObjectTypeEXT objectType,
            VulkanHandle object,
            long location,
            int messageCode,
            String layerPrefix,
            String message);
    
    native void vkDestroyAccelerationStructureNV(
            VkDevice vkDevice,
            VkAccelerationStructureNV accelerationStructure,
            VkAllocationCallbacks alternateAllocator);
    
    native void vkDestroyBuffer(
            VkDevice vkDevice,
            VkBuffer vkBuffer,
            VkAllocationCallbacks alternateAllocator);
    
    native void vkDestroyBufferView(
            VkDevice device,
            VkBufferView bufferView,
            VkAllocationCallbacks allocator);
    
    native void vkDestroyCommandPool(
            VkDevice vulkanLogicalDevice,
            VkCommandPool commandommandPoolHandle,
            VkAllocationCallbacks alternateAllocator);
    
    native void vkDestroyDebugReportCallbackEXT(
            VkInstance vkInstance,
            VkDebugReportCallbackEXT debugCallbackHandle,
            VkAllocationCallbacks alternateAllocator);
    
    native void vkDestroyDebugUtilsMessengerEXT(
            VkInstance instance,
            VkDebugUtilsMessengerEXT messenger,
            VkAllocationCallbacks alternateAllocator);
    
    native void vkDestroyDescriptorPool(
            VkDevice vkDevice,
            VkDescriptorPool vkDescriptorPool,
            VkAllocationCallbacks alternateAllocator);
    
    native void vkDestroyDescriptorSetLayout(
            VkDevice vkDevice,
            VkDescriptorSetLayout vkDescriptorSetLayout,
            VkAllocationCallbacks alternateAllocator);
    
    native void vkDestroyDescriptorUpdateTemplate(
            VkDevice device,
            VkDescriptorUpdateTemplate descriptorUpdateTemplate,
            VkAllocationCallbacks allocator);
    
    native void vkDestroyDevice(
            VkDevice device,
            VkAllocationCallbacks alternateAllocator);
    
    native void vkDestroyEvent(
            VkDevice device,
            VkEvent event,
            VkAllocationCallbacks allocator);
    
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
    
    native void vkDestroyIndirectCommandsLayoutNVX(
            VkDevice device,
            VkIndirectCommandsLayoutNVX indirectCommandsLayout,
            VkAllocationCallbacks allocator);
    
    native void vkDestroyInstance(
            VkInstance vkInstance,
            VkAllocationCallbacks alternateAllocator);
    
    native void vkDestroyObjectTableNVX(
            VkDevice device,
            VkObjectTableNVX objectTable,
            VkAllocationCallbacks allocator);
    
    native void vkDestroyPipeline(
            VkDevice vulkanLogicalDevice,
            VkPipeline pipelineHandle,
            VkAllocationCallbacks alternateAllocator);
    
    native void vkDestroyPipelineCache(
            VkDevice device,
            VkPipelineCache pipelineCache,
            VkAllocationCallbacks allocator);
    
    native void vkDestroyPipelineLayout(
            VkDevice vulkanLogicalDevice,
            VkPipelineLayout renderPassHandle,
            VkAllocationCallbacks alternateAllocator);
    
    native void vkDestroyQueryPool(
            VkDevice device,
            VkQueryPool queryPool,
            VkAllocationCallbacks allocator);
    
    native void vkDestroyRenderPass(
            VkDevice vulkanLogicalDevice,
            VkRenderPass renderPassHandle,
            VkAllocationCallbacks alternateAllocator);
    
    native void vkDestroySampler(
            VkDevice vulkanLogicalDevice,
            VkSampler samplerHandle,
            VkAllocationCallbacks alternateAllocator);
    
    native void vkDestroySamplerYcbcrConversion(
            VkDevice device,
            VkSamplerYcbcrConversion ycbcrConversion,
            VkAllocationCallbacks allocator);
    
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
    
    native void vkDestroyValidationCacheEXT(
            VkDevice device,
            VkValidationCacheEXT validationCache,
            VkAllocationCallbacks allocator);
    
    native VkResult vkDeviceWaitIdle(
            VkDevice vulkanLogicalDevice);
    
    native VkResult vkDisplayPowerControlEXT(
            VkDevice device,
            VkDisplayKHR display,
            VkDisplayPowerInfoEXT displayPowerInfo);
    
    native VkResult vkEndCommandBuffer(
            VkCommandBuffer vkCommandBuffer);
    
    native VkResult vkEnumerateDeviceExtensionProperties(
            VkPhysicalDevice physicalDevice,
            String layerName,
            Collection<VkExtensionProperties> collectionOfExtensionProperties);
    
    native VkResult vkEnumerateDeviceLayerProperties(
            VkPhysicalDevice physicalDevice,
            Collection<VkLayerProperties> properties);
    
    native VkResult vkEnumerateInstanceExtensionProperties(
            String LayerName,
            Collection<VkExtensionProperties> properties);
    
    native VkResult vkEnumerateInstanceLayerProperties(
            Collection<VkLayerProperties> properties);
    
    native VkResult vkEnumerateInstanceVersion(
            IntReturnValue apiVersion);
    
    native VkResult vkEnumeratePhysicalDevices(
            VkInstance vkInstance,
            Collection<VkPhysicalDevice> collectionOfPhysicalDevices);
    
    native VkResult vkEnumeratePhysicalDeviceGroups(
            VkInstance instance,
            Collection<VkPhysicalDeviceGroupProperties> physicalDeviceGroupProperties);
    
    native VkResult vkFlushMappedMemoryRanges(
            VkDevice device,
            Collection<VkMappedMemoryRange> memoryRanges);
    
    native void vkFreeCommandBuffers(
            VkDevice vulkanLogicalDevice,
            VkCommandPool commandPoolHandle,
            Collection<VkCommandBuffer> commandBufferHandles);
    
    native VkResult vkFreeDescriptorSets(
            VkDevice device,
            VkDescriptorPool descriptorPool,
            Collection<VkDescriptorSet> descriptorSets);
    
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
    
    native void vkGetBufferMemoryRequirements2(
            VkDevice device,
            VkBufferMemoryRequirementsInfo2 info,
            VkMemoryRequirements2 memoryRequirements);
    
    native VkResult vkGetCalibratedTimestampsEXT(
            VkDevice device,
            Collection<VkCalibratedTimestampInfoEXT> timestampInfos,
            long[] timestamps,
            LongReturnValue maxDeviation);
    
    native VkResult vkGetDeviceGroupPresentCapabilitiesKHR(
            VkDevice device,
            VkDeviceGroupPresentCapabilitiesKHR deviceGroupPresentCapabilities);
    
    native VkResult vkGetDeviceGroupSurfacePresentModes2EXT(
            VkDevice device,
            VkPhysicalDeviceSurfaceInfo2KHR surfaceInfo,
            EnumSet<VkDeviceGroupPresentModeFlagBitsKHR> modes);
    
    native void vkGetDeviceMemoryCommitment(
            VkDevice device,
            VkDeviceMemory memory,
            LongReturnValue committedMemoryInBytes);
    
    native void vkGetDeviceQueue(
            VkDevice logicalDevice,
            int queueFamilyIndex,
            int queueIndex,
            VkQueue queue);
    
    native void vkGetDeviceQueue2(
            VkDevice device,
            VkDeviceQueueInfo2 queueInfo,
            VkQueue queue);
    
    native VkResult vkGetDisplayModeProperties2KHR(
            VkPhysicalDevice physicalDevice,
            VkDisplayKHR display,
            Collection<VkDisplayModeProperties2KHR> properties);
    
    native VkResult vkGetDisplayModePropertiesKHR(
            VkPhysicalDevice physicalDevice,
            VkDisplayKHR display,
            Collection<VkDisplayModePropertiesKHR> properties);
    
    native VkResult vkGetDisplayPlaneCapabilities2KHR(
            VkPhysicalDevice physicalDevice,
            VkDisplayPlaneInfo2KHR pisplayPlaneInfo,
            VkDisplayPlaneCapabilities2KHR capabilities);
    
    native VkResult vkGetDisplayPlaneCapabilitiesKHR(
            VkPhysicalDevice physicalDevice,
            VkDisplayModeKHR mode,
            int planeIndex,
            VkDisplayPlaneCapabilitiesKHR capabilities);
    
    native VkResult vkGetDisplayPlaneSupportedDisplaysKHR(
            VkPhysicalDevice physicalDevice,
            int planeIndex,
            Collection<VkDisplayKHR> displays);
    
    native VkResult vkGetEventStatus(
            VkDevice device,
            VkEvent event);
    
    native VkResult vkGetFenceFdKHR(
            VkDevice device,
            VkFenceGetFdInfoKHR getFdInfo,
            IntReturnValue fd);
    
    native VkResult vkGetFenceStatus(
            VkDevice device,
            VkFence fence);
    
    native VkResult vkGetImageDrmFormatModifierPropertiesEXT(
            VkDevice device,
            VkImage image,
            Collection<VkImageDrmFormatModifierPropertiesEXT> properties);

    native void vkGetImageMemoryRequirements(
            VkDevice vulkanLogicalDevice,
            VkImage vkImage,
            VkMemoryRequirements vkMemoryRequirements);
    
    native void vkGetImageMemoryRequirements2(
            VkDevice device,
            VkImageMemoryRequirementsInfo2 info,
            VkMemoryRequirements2 memoryRequirements);
    
    native void vkGetImageSparseMemoryRequirements(
            VkDevice device,
            VkImage image,
            Collection<VkSparseImageMemoryRequirements> sparseMemoryRequirements);
    
    native void vkGetImageSparseMemoryRequirements2(
            VkDevice device,
            VkImageSparseMemoryRequirementsInfo2 info,
            Collection<VkSparseImageMemoryRequirements> sparseMemoryRequirements);
    
    native void vkGetImageSubresourceLayout(
            VkDevice device,
            VkImage image,
            VkImageSubresource subresource,
            VkSubresourceLayout layout);
    
    native int vkGetImageViewHandleNVX(
            VkDevice device,
            VkImageViewHandleInfoNVX info);
    
    native VkResult vkGetMemoryFdKHR(
            VkDevice device,
            VkMemoryGetFdInfoKHR getFdInfo,
            IntReturnValue fd);
    
    native VkResult vkGetMemoryFdPropertiesKHR(
            VkDevice device,
            VkExternalMemoryHandleTypeFlagBits handleType,
            int fd,
            VkMemoryFdPropertiesKHR memoryFdProperties);
    
    native VkResult vkGetMemoryHostPointerPropertiesEXT(
            VkDevice device,
            VkExternalMemoryHandleTypeFlagBits handleType,
            VulkanHandle hostPointer,
            VkMemoryHostPointerPropertiesEXT memoryHostPointerProperties);
    
    native VkResult vkGetPastPresentationTimingGOOGLE(
            VkDevice device,
            VkSwapchainKHR swapchain,
            Collection<VkPastPresentationTimingGOOGLE> presentationTimings);
    
    native VkResult vkGetPerformanceParameterINTEL(
            VkDevice device,
            VkPerformanceParameterTypeINTEL parameter,
            VkPerformanceValueINTEL value);
    
    native VkResult vkGetPhysicalDeviceCalibrateableTimeDomainsEXT(
            VkPhysicalDevice physicalDevice,
            Collection<VkTimeDomainEXT> timeDomains);
    
    native VkResult vkGetPhysicalDeviceCooperativeMatrixPropertiesNV(
            VkPhysicalDevice                            physicalDevice,
            Collection<VkCooperativeMatrixPropertiesNV> properties);
    
    native VkResult vkGetPhysicalDeviceDisplayPlaneProperties2KHR(
            VkPhysicalDevice                            physicalDevice,
            Collection<VkDisplayPlaneProperties2KHR> properties);
    
    native VkResult vkGetPhysicalDeviceDisplayPlanePropertiesKHR(
            VkPhysicalDevice physicalDevice,
            Collection<VkDisplayPlanePropertiesKHR> properties);
    
    native VkResult vkGetPhysicalDeviceDisplayProperties2KHR(
            VkPhysicalDevice physicalDevice,
            Collection<VkDisplayProperties2KHR> properties);
    
    native VkResult vkGetPhysicalDeviceDisplayPropertiesKHR(
            VkPhysicalDevice physicalDevice,
            VkDisplayPropertiesKHR properties);
    
    native void vkGetPhysicalDeviceExternalBufferProperties(
            VkPhysicalDevice physicalDevice,
            VkPhysicalDeviceExternalBufferInfo externalBufferInfo,
            VkExternalBufferProperties externalBufferProperties);
    
    native void vkGetPhysicalDeviceExternalFenceProperties(
            VkPhysicalDevice physicalDevice,
            VkPhysicalDeviceExternalFenceInfo externalFenceInfo,
            VkExternalFenceProperties externalFenceProperties);
    
    native VkResult vkGetPhysicalDeviceExternalImageFormatPropertiesNV(
            VkPhysicalDevice physicalDevice,
            VkFormat format,
            VkImageType type,
            VkImageTiling tiling,
            EnumSet<VkImageUsageFlagBits> usage,
            EnumSet<VkImageCreateFlagBits> flags,
            EnumSet<VkExternalMemoryHandleTypeFlagBitsNV> externalHandleType,
            VkExternalImageFormatPropertiesNV externalImageFormatProperties);
    
    native void vkGetPhysicalDeviceExternalSemaphoreProperties(
            VkPhysicalDevice physicalDevice,
            VkPhysicalDeviceExternalSemaphoreInfo externalSemaphoreInfo,
            VkExternalSemaphoreProperties externalSemaphoreProperties);
    
    native void vkGetPhysicalDeviceFeatures(
            VkPhysicalDevice physicalDevice,
            VkPhysicalDeviceFeatures deviceFeatures);
    
    native void vkGetPhysicalDeviceFeatures2(
            VkPhysicalDevice physicalDevice,
            VkPhysicalDeviceFeatures2 features);
    
    native void vkGetPhysicalDeviceFormatProperties(
            VkPhysicalDevice vulkanPhysicalDevice,
            VkFormat format,
            VkFormatProperties formatProperties);
    
    native void vkGetPhysicalDeviceFormatProperties2(
            VkPhysicalDevice physicalDevice,
            VkFormat format,
            VkFormatProperties2 formatProperties);
    
    native void vkGetPhysicalDeviceGeneratedCommandsPropertiesNVX(
            VkPhysicalDevice physicalDevice,
            VkDeviceGeneratedCommandsFeaturesNVX features,
            VkDeviceGeneratedCommandsLimitsNVX limits);
    
    native VkResult vkGetPhysicalDeviceImageFormatProperties(
            VkPhysicalDevice physicalDevice,
            VkFormat format,
            VkImageType type,
            VkImageTiling tiling,
            EnumSet<VkImageUsageFlagBits> usage,
            EnumSet<VkImageCreateFlagBits> flags,
            VkImageFormatProperties imageFormatProperties);
    
    native VkResult vkGetPhysicalDeviceImageFormatProperties2(
            VkPhysicalDevice physicalDevice,
            VkPhysicalDeviceImageFormatInfo2 imageFormatInfo,
            VkImageFormatProperties2 imageFormatProperties);
    
    native void vkGetPhysicalDeviceMemoryProperties(
            VkPhysicalDevice vulkanPhysicalDevice,
            VkPhysicalDeviceMemoryProperties vkPhysicalDeviceMemoryProperties);
    
    native void vkGetPhysicalDeviceMemoryProperties2(
            VkPhysicalDevice physicalDevice,
            VkPhysicalDeviceMemoryProperties2 memoryProperties);
    
    native void vkGetPhysicalDeviceMultisamplePropertiesEXT(
            VkPhysicalDevice physicalDevice,
            VkSampleCountFlagBits samples,
            VkMultisamplePropertiesEXT multisampleProperties);
    
    native VkResult vkGetPhysicalDevicePresentRectanglesKHR(
            VkPhysicalDevice physicalDevice,
            VkSurfaceKHR surface,
            Collection<VkRect2D> rects);
    
    native void vkGetPhysicalDeviceProperties(
            VkPhysicalDevice physicalDevice,
            VkPhysicalDeviceProperties deviceProperties);
    
    native void vkGetPhysicalDeviceProperties2(
            VkPhysicalDevice physicalDevice,
            VkPhysicalDeviceProperties2 deviceProperties);
    
    native void vkGetPhysicalDeviceProperties2KHR(
            VkPhysicalDevice physicalDevice,
            VkPhysicalDeviceProperties2 deviceProperties);
    
    native void vkGetPhysicalDeviceQueueFamilyProperties(
            VkPhysicalDevice physicalDevice,
            Collection<VkQueueFamilyProperties> collectionOfExtensionProperties);
    
    native void vkGetPhysicalDeviceQueueFamilyProperties2(
            VkPhysicalDevice physicalDevice,
            Collection<VkQueueFamilyProperties2> queueFamilyProperties);
    
    native void vkGetPhysicalDeviceSparseImageFormatProperties(
            VkPhysicalDevice physicalDevice,
            VkFormat format,
            VkImageType type,
            VkSampleCountFlagBits samples,
            EnumSet<VkImageUsageFlagBits> usage,
            VkImageTiling tiling,
            Collection<VkSparseImageFormatProperties> properties);
    
    native void vkGetPhysicalDeviceSparseImageFormatProperties2(
            VkPhysicalDevice physicalDevice,
            VkPhysicalDeviceSparseImageFormatInfo2 formatInfo,
            Collection<VkSparseImageFormatProperties2> properties);
    
    native VkResult vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV(
            VkPhysicalDevice physicalDevice,
            Collection<VkFramebufferMixedSamplesCombinationNV> combinations);
    
    native VkResult vkGetPhysicalDeviceSurfaceCapabilities2EXT(
            VkPhysicalDevice physicalDevice,
            VkSurfaceKHR surface,
            VkSurfaceCapabilities2EXT surfaceCapabilities);
    
    native VkResult vkGetPhysicalDeviceSurfaceCapabilitiesKHR(
            VkPhysicalDevice physicalDevice,
            VkSurfaceKHR     surface,
            VkSurfaceCapabilitiesKHR surfaceCapabilities);
    
    native VkResult vkGetPhysicalDeviceSurfaceCapabilities2KHR(
            VkPhysicalDevice physicalDevice,
            VkPhysicalDeviceSurfaceInfo2KHR     surfaceInfo,
            VkSurfaceCapabilities2KHR surfaceCapabilities);
    
    native VkResult vkGetPhysicalDeviceSurfaceFormats2KHR(
            VkPhysicalDevice physicalDevice,
            VkPhysicalDeviceSurfaceInfo2KHR surfaceInfo,
            Collection<VkSurfaceFormat2KHR> surfaceFormats);
    
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
            WlDisplayHandle waylandDisplay);
    
    native VkResult vkGetPipelineCacheData(
            VkDevice device,
            VkPipelineCache pipelineCache,
            byte[] data);
    
    native VkResult vkGetPipelineExecutableInternalRepresentationsKHR(
            VkDevice device,
            VkPipelineExecutableInfoKHR executableInfo,
            Collection<VkPipelineExecutableInternalRepresentationKHR> internalRepresentations);
    
    native VkResult vkGetPipelineExecutablePropertiesKHR(
            VkDevice device,
            VkPipelineInfoKHR pipelineInfo,
            Collection<VkPipelineExecutablePropertiesKHR> properties);
    
    native VkResult vkGetPipelineExecutableStatisticsKHR(
            VkDevice device,
            VkPipelineExecutableInfoKHR executableInfo,
            Collection<VkPipelineExecutableStatisticKHR> statistics);
    
    native VkResult vkGetQueryPoolResults(
            VkDevice device,
            VkQueryPool queryPool,
            int firstQuery,
            int queryCount,
            byte[] data,
            long stride,
            EnumSet<VkQueryResultFlagBits> flags);
    
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
    
    native VkResult vkGetRefreshCycleDurationGOOGLE(
            VkDevice device,
            VkSwapchainKHR swapchain,
            VkRefreshCycleDurationGOOGLE displayTimingProperties);
    
    native void vkGetRenderAreaGranularity(
            VkDevice device,
            VkRenderPass renderPass,
            VkExtent2D granularity);
    
    native VkResult vkGetSemaphoreFdKHR(
            VkDevice device,
            VkSemaphoreGetFdInfoKHR getFdInfo,
            IntReturnValue fd);
    
    native VkResult vkGetShaderInfoAMD(
            VkDevice device,
            VkPipeline pipeline,
            VkShaderStageFlagBits shaderStage,
            VkShaderInfoTypeAMD infoType,
            byte[] info);
    
    native VkResult vkGetSwapchainCounterEXT(
            VkDevice device,
            VkSwapchainKHR swapchain,
            VkSurfaceCounterFlagBitsEXT counter,
            LongReturnValue counterValue);
    
    native VkResult vkGetSwapchainImagesKHR(
            VkDevice vulkanLogicalDevice,
            VkSwapchainKHR swapchain,
            Collection<VkImage> swapchainImages);
    
    native VkResult vkGetSwapchainStatusKHR(
            VkDevice device,
            VkSwapchainKHR swapchain);
    
    native VkResult vkGetValidationCacheDataEXT(
            VkDevice device,
            VkValidationCacheEXT validationCache,
            byte[] data);
    
    native VkResult vkImportFenceFdKHR(
            VkDevice device,
            VkImportFenceFdInfoKHR importFenceFdInfo);
    
    native VkResult vkImportSemaphoreFdKHR(
            VkDevice device,
            VkImportSemaphoreFdInfoKHR importSemaphoreFdInfo);
    
    native VkResult vkInitializePerformanceApiINTEL(
            VkDevice device,
            VkInitializePerformanceApiInfoINTEL initializeInfo);
    
    native VkResult vkInvalidateMappedMemoryRanges(
            VkDevice device,
            Collection<VkMappedMemoryRange> memoryRanges);
    
    native VkResult vkMapMemory(
            VkDevice vulkanLogicalDevice,
            VkDeviceMemory vkDeviceMemory,
            long offset,
            long size,
            EnumSet<VkMemoryMapFlagBits> flags,
            MappedMemoryPointer pData);
    
    native VkResult vkMergePipelineCaches(
            VkDevice device,
            VkPipelineCache dstCache,
            Collection<VkPipelineCache> srcCaches);
    
    native VkResult vkMergeValidationCachesEXT(
            VkDevice device,
            VkValidationCacheEXT dstCache,
            Collection<VkValidationCacheEXT> srcCaches);
    
    native void vkQueueBeginDebugUtilsLabelEXT(
            VkQueue queue,
            VkDebugUtilsLabelEXTlabelInfo labelInfo);
    
    native VkResult vkQueueBindSparse(
            VkQueue queue,
            Collection<VkBindSparseInfo> bindInfo,
            VkFence fence);
    
    native void vkQueueEndDebugUtilsLabelEXT(
            VkQueue queue);
    
    native void vkQueueInsertDebugUtilsLabelEXT(
            VkQueue queue,
            VkDebugUtilsLabelEXT labelInfo);
    
    native VkResult vkQueuePresentKHR(
            VkQueue queue,
            VkPresentInfoKHR vkPresentInfoKHR);
    
    native VkResult vkQueueSetPerformanceConfigurationINTEL(
            VkQueue                                     queue,
            VkPerformanceConfigurationINTEL             configuration);
    
    native VkResult vkQueueSubmit(
            VkQueue queue,
            Collection<VkSubmitInfo> submits,
            VkFence fence);
    
    native VkResult vkQueueWaitIdle(
            VkQueue vkQueue);
    
    native VkResult vkRegisterDeviceEventEXT(
            VkDevice device,
            VkDeviceEventInfoEXT deviceEventInfo,
            VkAllocationCallbacks allocator,
            VkFence fence);
    
    native VkResult vkRegisterDisplayEventEXT(
            VkDevice device,
            VkDisplayKHR display,
            VkDisplayEventInfoEXT displayEventInfo,
            VkAllocationCallbacks allocator,
            VkFence fence);
    
    native VkResult vkRegisterObjectsNVX(
            VkDevice device,
            VkObjectTableNVX objectTable,
            Collection<VkObjectTableEntryNVX> objectTableEntries,
            int[] objectIndices);
    
    native VkResult vkReleaseDisplayEXT(
            VkPhysicalDevice physicalDevice,
            VkDisplayKHR display);
    
    native VkResult vkReleasePerformanceConfigurationINTEL(
            VkDevice device,
            VkPerformanceConfigurationINTEL configuration);
    
    native VkResult vkResetCommandBuffer(
            VkCommandBuffer commandBuffer,
            EnumSet<VkCommandBufferResetFlagBits> flags);
    
    native VkResult vkResetCommandPool(
            VkDevice device,
            VkCommandPool commandPool,
            EnumSet<VkCommandPoolResetFlagBits> flags);
    
    native VkResult vkResetDescriptorPool(
            VkDevice device,
            VkDescriptorPool descriptorPool,
            EnumSet<VkDescriptorPoolResetFlagBits> flags);
    
    native VkResult vkResetEvent(
            VkDevice device,
            VkEvent event);
    
    native void vkResetFences(
            VkDevice vulkanLogicalDevice,
            Collection<VkFence> vkFences);
    
    native void vkResetQueryPoolEXT(
            VkDevice device,
            VkQueryPool queryPool,
            int firstQuery,
            int queryCount);
    
    native VkResult vkSetDebugUtilsObjectNameEXT(
            VkDevice device,
            VkDebugUtilsObjectNameInfoEXT nameInfo);
    
    native VkResult vkSetDebugUtilsObjectTagEXT(
            VkDevice device,
            VkDebugUtilsObjectTagInfoEXT tagInfo);
    
    native VkResult vkSetEvent(
            VkDevice device,
            VkEvent event);
    
    native void vkSetHdrMetadataEXT(
            VkDevice device,
            Collection<VkSwapchainKHR> swapchains,
            Collection<VkHdrMetadataEXT> metadata);
    
    native void vkSetLocalDimmingAMD(
            VkDevice device,
            VkSwapchainKHR swapChain,
            boolean localDimmingEnable);
    
    native void vkSubmitDebugUtilsMessageEXT(
            VkInstance instance,
            VkDebugUtilsMessageSeverityFlagBitsEXT messageSeverity,
            EnumSet<VkDebugUtilsMessageTypeFlagBitsEXT> messageTypes,
            VkDebugUtilsMessengerCallbackDataEXT callbackData);
    
    native void vkTrimCommandPool(
            VkDevice device,
            VkCommandPool commandPool,
            EnumSet<VkCommandPoolTrimFlagBits> flags);
    
    native void vkUninitializePerformanceApiINTEL(
            VkDevice device);
    
    native void vkUnmapMemory(
            VkDevice vulkanLogicalDevice,
            VkDeviceMemory vkDeviceMemory);
    
    native VkResult vkUnregisterObjectsNVX(
            VkDevice device,
            VkObjectTableNVX objectTable,
            Collection<VkObjectEntryTypeNVX> objectEntryTypes,
            int[] objectIndices);
    
    native void vkUpdateDescriptorSets(
            VkDevice vulkanLogicalDevice,
            Collection<VkWriteDescriptorSet> descriptorWrites,
            Collection<VkCopyDescriptorSet> descriptorCopies);
    
    native void vkUpdateDescriptorSetWithTemplate(
            VkDevice device,
            VkDescriptorSet descriptorSet,
            VkDescriptorUpdateTemplate descriptorUpdateTemplate,
            Collection<Object> data);
    
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








    
    
    
    native WlRegionHandle wlCompositorCreateRegion(
            WlCompositorHandle waylandCompositor);
    
    native WlSurfaceHandle wlCompositorCreateSurface(
            WlCompositorHandle waylandCompositor);
    
    native WlDisplayHandle wlDisplayConnect(
            String    displayName,
            LinkedBlockingQueue<WaylandEventObject> eventHandlerWorkQueue);
    
    native void wlDisplayDisconnect(
            WlDisplayHandle waylandDisplay);
    
    native void wlDisplayDispatch(
            WlDisplayHandle waylandDisplay);
    
    native int wlDisplayDispatchPending(
            WlDisplayHandle waylandDisplay);

    native int wlDisplayFlush(
            WlDisplayHandle waylandDisplay);
    
    native WlRegistryHandle wlDisplayGetRegistry(
            WlDisplayHandle waylandDisplay);

    native int wlDisplayReadEvents(
            WlDisplayHandle waylandDisplay);

    native int wlDisplayPrepareRead(
            WlDisplayHandle waylandDisplay);

    native void wlDisplaySync(
            WlDisplayHandle waylandDisplay);
    
    native void wlDisplayRoundTrip(
            WlDisplayHandle waylandDisplay);
    
    native void wlKeyboardRelease(
            WlKeyboardHandle waylandKeyboard);
    
    native void wlPointerRelease(
            WlPointerHandle waylandPointer);
    
    native void wlPointerSetCursor(
            WlPointerHandle waylandPointer,
            int serialNumber,
            WlSurfaceHandle waylandSurface,
            int x,
            int y);
    
    native WlKeyboardHandle wlSeatGetKeyboard(
            WlSeatHandle waylandSeat);
    
    native WlPointerHandle wlSeatGetPointer(
            WlSeatHandle waylandSeat);
    
    native WlTouchHandle wlSeatGetTouch(
            WlSeatHandle waylandSeat);
    
    native void wlSeatRelease(
            WlSeatHandle waylandSeat);
    
    native void wlRegistryAddListener(
            WlRegistryHandle waylandRegistry,
            WlRegistryListener registryListener, 
            Object userData);
    
    native VulkanHandle wlRegistryBind(
            WlRegistryHandle waylandRegistry,
            int interfaceId,
            String textInterfaceName,
            int interfaceVersion);
    
    native WlShellSurfaceHandle wlShellGetShellSurface(
            WlShellHandle waylandShellInterface,
            WlSurfaceHandle waylandSurface);
    
    native void wlShellSurfaceMove(
            WlShellSurfaceHandle waylandshellSurface,
            WlSeatHandle waylandSeat,
            int serialNumber);
    
    native void wlShellSurfacePong(
            WlShellSurfaceHandle waylandshellSurface,
            int serianNumber);
    
    native void wlShellSurfaceResize(
            WlShellSurfaceHandle waylandshellSurface,
            WlSeatHandle waylandSeat,
            int serialNumber,
            WlShellSurfaceResize edges);
    
    native void wlShellSurfaceSetClass(
            WlShellSurfaceHandle waylandshellSurface,
            String className);
    
    native void wlShellSurfaceSetFullscreen(
            WlShellSurfaceHandle waylandshellSurface,
            WlShellSurfaceFullscreenMethod method,
            int framerate,
            WlOutputHandle waylandOutput);
    
    native void wlShellSurfaceSetMaximized(
            WlShellSurfaceHandle waylandshellSurface,
            WlOutputHandle waylandOutput);
    
    native void wlShellSurfaceSetPopup(
            WlShellSurfaceHandle waylandshellSurface,
            WlSeatHandle waylandSeat,
            int serialNumber,
            WlSurfaceHandle parentSurface,
            int x,
            int y,
            EnumSet<WlShellSurfaceTransientBehavior> flags);
    
    native void wlShellSurfaceSetTitle(
            WlShellSurfaceHandle waylandshellSurface,
            byte[] surfaceTitle);
    
    native void wlShellSurfaceSetTopLevel(
            WlShellSurfaceHandle waylandshellSurface);
    
    native void wlShellSurfaceSetTransient(
            WlShellSurfaceHandle waylandshellSurface,
            WlSurfaceHandle parentSurface,
            int x,
            int y,
            EnumSet<WlShellSurfaceTransientBehavior> flags);
    
    native void wlSurfaceCommit(
            WlSurfaceHandle waylandSurfaceHandle);
    
    native void wlSurfaceDamage(
            WlSurfaceHandle waylandSurfaceHandle,
            int x,
            int y,
            int width,
            int height);

}

