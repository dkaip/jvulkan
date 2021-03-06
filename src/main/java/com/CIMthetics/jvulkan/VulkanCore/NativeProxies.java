/*
 * Copyright 2019-2020 Douglas Kaip
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
package com.CIMthetics.jvulkan.VulkanCore;

import java.util.Collection;
import java.util.EnumSet;
import java.util.concurrent.LinkedBlockingQueue;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkCommandBufferResetFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkCommandPoolResetFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkCommandPoolTrimFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkCompareOp;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkCullModeFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkDependencyFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkDescriptorPoolResetFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkExternalMemoryHandleTypeFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkFilter;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkFormat;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkFrontFace;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkImageCreateFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkImageLayout;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkImageTiling;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkImageType;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkImageUsageFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkIndexType;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkMemoryMapFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkObjectType;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkPeerMemoryFeatureFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkPipelineBindPoint;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkPipelineStageFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkPresentModeKHR;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkPrimitiveTopology;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkQueryControlFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkQueryResultFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkQueryType;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkResult;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkSampleCountFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkShaderInfoTypeAMD;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkShaderStageFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStencilFaceFlagBits;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStencilOp;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkSubpassContents;
import com.CIMthetics.jvulkan.VulkanCore.Handles.MappedMemoryPointer;
import com.CIMthetics.jvulkan.VulkanCore.Handles.VkBuffer;
import com.CIMthetics.jvulkan.VulkanCore.Handles.VkBufferView;
import com.CIMthetics.jvulkan.VulkanCore.Handles.VkCommandBuffer;
import com.CIMthetics.jvulkan.VulkanCore.Handles.VkCommandPool;
import com.CIMthetics.jvulkan.VulkanCore.Handles.VkDebugUtilsMessengerEXT;
import com.CIMthetics.jvulkan.VulkanCore.Handles.VkDescriptorPool;
import com.CIMthetics.jvulkan.VulkanCore.Handles.VkDescriptorSet;
import com.CIMthetics.jvulkan.VulkanCore.Handles.VkDescriptorSetLayout;
import com.CIMthetics.jvulkan.VulkanCore.Handles.VkDescriptorUpdateTemplate;
import com.CIMthetics.jvulkan.VulkanCore.Handles.VkDevice;
import com.CIMthetics.jvulkan.VulkanCore.Handles.VkDeviceMemory;
import com.CIMthetics.jvulkan.VulkanCore.Handles.VkEvent;
import com.CIMthetics.jvulkan.VulkanCore.Handles.VkFence;
import com.CIMthetics.jvulkan.VulkanCore.Handles.VkFramebuffer;
import com.CIMthetics.jvulkan.VulkanCore.Handles.VkImage;
import com.CIMthetics.jvulkan.VulkanCore.Handles.VkImageView;
import com.CIMthetics.jvulkan.VulkanCore.Handles.VkInstance;
import com.CIMthetics.jvulkan.VulkanCore.Handles.VkPhysicalDevice;
import com.CIMthetics.jvulkan.VulkanCore.Handles.VkPipeline;
import com.CIMthetics.jvulkan.VulkanCore.Handles.VkPipelineCache;
import com.CIMthetics.jvulkan.VulkanCore.Handles.VkPipelineLayout;
import com.CIMthetics.jvulkan.VulkanCore.Handles.VkQueryPool;
import com.CIMthetics.jvulkan.VulkanCore.Handles.VkQueue;
import com.CIMthetics.jvulkan.VulkanCore.Handles.VkRenderPass;
import com.CIMthetics.jvulkan.VulkanCore.Handles.VkSampler;
import com.CIMthetics.jvulkan.VulkanCore.Handles.VkSamplerYcbcrConversion;
import com.CIMthetics.jvulkan.VulkanCore.Handles.VkSemaphore;
import com.CIMthetics.jvulkan.VulkanCore.Handles.VkShaderModule;
import com.CIMthetics.jvulkan.VulkanCore.Handles.VkSwapchainKHR;
import com.CIMthetics.jvulkan.VulkanCore.Handles.VulkanHandle;
import com.CIMthetics.jvulkan.VulkanCore.Structures.BooleanReturnValue;
import com.CIMthetics.jvulkan.VulkanCore.Structures.ByteArrayReturnValue;
import com.CIMthetics.jvulkan.VulkanCore.Structures.IntReturnValue;
import com.CIMthetics.jvulkan.VulkanCore.Structures.LongReturnValue;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkAcquireNextImageInfoKHR;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkAllocationCallbacks;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkBindBufferMemoryInfo;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkBindImageMemoryInfo;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkBindSparseInfo;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkBufferCopy;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkBufferDeviceAddressInfo;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkBufferImageCopy;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkBufferMemoryBarrier;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkBufferMemoryRequirementsInfo2;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkClearAttachment;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkClearColorValue;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkClearDepthStencilValue;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkClearRect;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkCopyDescriptorSet;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkDescriptorSetLayoutSupport;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkDeviceMemoryOpaqueCaptureAddressInfo;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkDeviceQueueInfo2;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkExtensionProperties;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkExtent2D;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkExternalBufferProperties;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkExternalFenceProperties;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkExternalSemaphoreProperties;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkFormatProperties;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkFormatProperties2;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkImageBlit;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkImageCopy;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkImageFormatProperties;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkImageFormatProperties2;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkImageMemoryBarrier;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkImageMemoryRequirementsInfo2;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkImageResolve;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkImageSparseMemoryRequirementsInfo2;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkImageSubresource;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkImageSubresourceRange;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkLayerProperties;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkMappedMemoryRange;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkMemoryBarrier;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkMemoryRequirements;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkPhysicalDeviceExternalBufferInfo;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkPhysicalDeviceExternalFenceInfo;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkPhysicalDeviceExternalSemaphoreInfo;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkPhysicalDeviceFeatures;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkPhysicalDeviceFeatures2;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkPhysicalDeviceGroupProperties;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkPhysicalDeviceMemoryProperties;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkPhysicalDeviceMemoryProperties2;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkPhysicalDeviceProperties;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkPhysicalDeviceProperties2;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkPhysicalDeviceSparseImageFormatInfo2;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkQueueFamilyProperties;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkQueueFamilyProperties2;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkRect2D;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkSemaphoreSignalInfo;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkSemaphoreWaitInfo;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkSparseImageFormatProperties;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkSparseImageFormatProperties2;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkSparseImageMemoryRequirements;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkSparseImageMemoryRequirements2;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkSubresourceLayout;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkSurfaceCapabilitiesKHR;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkSurfaceFormatKHR;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkViewport;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkWriteDescriptorSet;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VkBufferCreateInfo;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VkBufferViewCreateInfo;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VkCommandBufferAllocateInfo;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VkCommandBufferBeginInfo;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VkCommandPoolCreateInfo;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VkComputePipelineCreateInfo;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VkDescriptorPoolCreateInfo;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VkDescriptorSetAllocateInfo;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VkDescriptorSetLayoutCreateInfo;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VkDescriptorUpdateTemplateCreateInfo;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VkDeviceCreateInfo;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VkEventCreateInfo;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VkFenceCreateInfo;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VkFramebufferCreateInfo;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VkGraphicsPipelineCreateInfo;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VkImageCreateInfo;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VkImageViewCreateInfo;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VkInstanceCreateInfo;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VkMemoryAllocateInfo;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VkPipelineCacheCreateInfo;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VkPipelineLayoutCreateInfo;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VkPresentInfoKHR;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VkQueryPoolCreateInfo;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VkRenderPassBeginInfo;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VkRenderPassCreateInfo;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VkRenderPassCreateInfo2;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VkSamplerCreateInfo;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VkSamplerYcbcrConversionCreateInfo;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VkSemaphoreCreateInfo;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VkShaderModuleCreateInfo;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VkSubmitInfo;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VkSubpassBeginInfo;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VkSubpassEndInfo;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VkSwapchainCreateInfoKHR;
import com.CIMthetics.jvulkan.VulkanExtensions.Enums.VkCoarseSampleOrderTypeNV;
import com.CIMthetics.jvulkan.VulkanExtensions.Enums.VkCopyAccelerationStructureModeKHR;
import com.CIMthetics.jvulkan.VulkanExtensions.Enums.VkDebugReportFlagBitsEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.Enums.VkDebugReportObjectTypeEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.Enums.VkDebugUtilsMessageSeverityFlagBitsEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.Enums.VkDebugUtilsMessageTypeFlagBitsEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.Enums.VkDeviceGroupPresentModeFlagBitsKHR;
import com.CIMthetics.jvulkan.VulkanExtensions.Enums.VkExternalMemoryHandleTypeFlagBitsNV;
import com.CIMthetics.jvulkan.VulkanExtensions.Enums.VkPerformanceParameterTypeINTEL;
import com.CIMthetics.jvulkan.VulkanExtensions.Enums.VkSurfaceCounterFlagBitsEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.Enums.VkTimeDomainEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.Handles.CheckpointMarker;
import com.CIMthetics.jvulkan.VulkanExtensions.Handles.VkAccelerationStructureKHR;
import com.CIMthetics.jvulkan.VulkanExtensions.Handles.VkDebugReportCallbackEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.Handles.VkDeviceAddress;
import com.CIMthetics.jvulkan.VulkanExtensions.Handles.VkDisplayKHR;
import com.CIMthetics.jvulkan.VulkanExtensions.Handles.VkDisplayModeKHR;
import com.CIMthetics.jvulkan.VulkanExtensions.Handles.VkIndirectCommandsLayoutNV;
import com.CIMthetics.jvulkan.VulkanExtensions.Handles.VkPerformanceConfigurationINTEL;
import com.CIMthetics.jvulkan.VulkanExtensions.Handles.VkPrivateDataSlotEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.Handles.VkSurfaceKHR;
import com.CIMthetics.jvulkan.VulkanExtensions.Handles.VkValidationCacheEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.VkAccelerationStructureInfoNV;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.VkAccelerationStructureMemoryRequirementsInfoNV;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.VkAcquireProfilingLockInfoKHR;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.VkBindAccelerationStructureMemoryInfoKHR;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.VkCalibratedTimestampInfoEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.VkCheckpointDataNV;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.VkCoarseSampleOrderCustomNV;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.VkConditionalRenderingBeginInfoEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.VkCooperativeMatrixPropertiesNV;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.VkDebugMarkerMarkerInfoEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.VkDebugMarkerObjectNameInfoEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.VkDebugMarkerObjectTagInfoEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.VkDebugUtilsLabelEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.VkDebugUtilsLabelEXTlabelInfo;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.VkDebugUtilsMessengerCallbackDataEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.VkDebugUtilsObjectNameInfoEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.VkDebugUtilsObjectTagInfoEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.VkDeviceEventInfoEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.VkDeviceGroupPresentCapabilitiesKHR;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.VkDisplayEventInfoEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.VkDisplayModeProperties2KHR;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.VkDisplayModePropertiesKHR;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.VkDisplayPlaneCapabilities2KHR;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.VkDisplayPlaneCapabilitiesKHR;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.VkDisplayPlaneInfo2KHR;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.VkDisplayPlaneProperties2KHR;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.VkDisplayPlanePropertiesKHR;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.VkDisplayPowerInfoEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.VkDisplayProperties2KHR;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.VkDisplayPropertiesKHR;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.VkExternalImageFormatPropertiesNV;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.VkFenceGetFdInfoKHR;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.VkFramebufferMixedSamplesCombinationNV;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.VkGeneratedCommandsInfoNV;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.VkGeneratedCommandsMemoryRequirementsInfoNV;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.VkHdrMetadataEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.VkImageDrmFormatModifierPropertiesEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.VkImageViewAddressPropertiesNVX;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.VkImageViewHandleInfoNVX;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.VkImportFenceFdInfoKHR;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.VkImportSemaphoreFdInfoKHR;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.VkInitializePerformanceApiInfoINTEL;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.VkMemoryFdPropertiesKHR;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.VkMemoryGetFdInfoKHR;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.VkMemoryHostPointerPropertiesEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.VkMemoryRequirements2;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.VkMemoryRequirements2KHR;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.VkMultisamplePropertiesEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.VkPastPresentationTimingGOOGLE;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.VkPerformanceConfigurationAcquireInfoINTEL;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.VkPerformanceCounterDescriptionKHR;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.VkPerformanceCounterKHR;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.VkPerformanceMarkerInfoINTEL;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.VkPerformanceOverrideInfoINTEL;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.VkPerformanceStreamMarkerInfoINTEL;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.VkPhysicalDeviceImageFormatInfo2;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.VkPhysicalDeviceSurfaceInfo2KHR;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.VkPhysicalDeviceToolPropertiesEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.VkPipelineExecutableInfoKHR;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.VkPipelineExecutableInternalRepresentationKHR;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.VkPipelineExecutablePropertiesKHR;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.VkPipelineExecutableStatisticKHR;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.VkPipelineInfoKHR;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.VkRefreshCycleDurationGOOGLE;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.VkSampleLocationsInfoEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.VkSemaphoreGetFdInfoKHR;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.VkShadingRatePaletteNV;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.VkSurfaceCapabilities2EXT;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.VkSurfaceCapabilities2KHR;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.VkSurfaceFormat2KHR;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.VkViewportWScalingNV;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.CreateInfos.VkAccelerationStructureCreateInfoNV;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.CreateInfos.VkDebugReportCallbackCreateInfoEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.CreateInfos.VkDebugUtilsMessengerCreateInfoEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.CreateInfos.VkDisplayModeCreateInfoKHR;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.CreateInfos.VkDisplaySurfaceCreateInfoKHR;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.CreateInfos.VkHeadlessSurfaceCreateInfoEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.CreateInfos.VkIndirectCommandsLayoutCreateInfoNV;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.CreateInfos.VkPerformanceValueINTEL;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.CreateInfos.VkPrivateDataSlotCreateInfoEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.CreateInfos.VkQueryPoolPerformanceCreateInfoKHR;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.CreateInfos.VkRayTracingPipelineCreateInfoNV;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.CreateInfos.VkValidationCacheCreateInfoEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.Structures.CreateInfos.VkWaylandSurfaceCreateInfoKHR;
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
    
    native VkResult vkAcquireProfilingLockKHR(
            VkDevice device,
            VkAcquireProfilingLockInfoKHR info);
    
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
    
    native VkResult vkBindAccelerationStructureMemoryKHR(
            VkDevice vulkanLogicalDevice,
            Collection<VkBindAccelerationStructureMemoryInfoKHR> bindInfos);
    
    native VkResult vkBindAccelerationStructureMemoryNV(
            VkDevice vulkanLogicalDevice,
            Collection<VkBindAccelerationStructureMemoryInfoKHR> bindInfos);
    
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
    
    native void vkCmdBindVertexBuffers2EXT(
            VkCommandBuffer commandBuffer,
            int firstBinding,
            Collection<VkBuffer> buffers,
            long[] offsets,
            long[] sizes,
            long[] strides);

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
    
    native void vkCmdBeginRenderPass2(
            VkCommandBuffer vkCommandBuffer,
            VkRenderPassBeginInfo vkRenderPassBeginInfo,
            VkSubpassBeginInfo vkSubpassContents);
    
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
    
    native void vkCmdBindPipelineShaderGroupNV(
            VkCommandBuffer commandBuffer,
            VkPipelineBindPoint pipelineBindPoint,
            VkPipeline pipeline,
            int groupIndex);

    native void vkCmdBindShadingRateImageNV(
            VkCommandBuffer vkCommandBuffer,
            VkImageView imageView,
            VkImageLayout imageLayout);

    native void vkCmdBindTransformFeedbackBuffersEXT(
            VkCommandBuffer commandBuffer,
            int firstBinding,
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
            VkAccelerationStructureKHR dst,
            VkAccelerationStructureKHR src,
            VkBuffer scratch,
            long scratchOffset);
    
    native void vkCmdClearAttachments(
            VkCommandBuffer commandBuffer,
            Collection<VkClearAttachment> attachments,
            Collection<VkClearRect> rects);
    
    native void vkCmdCopyAccelerationStructureNV(
            VkCommandBuffer vkCommandBuffer,
            VkAccelerationStructureKHR dst,
            VkAccelerationStructureKHR src,
            VkCopyAccelerationStructureModeKHR mode);
    
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
    
    native void vkCmdDrawIndexedIndirectCount(
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
    
    native void vkCmdDrawIndirectCount(
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
    
    native void vkCmdEndRenderPass2(
            VkCommandBuffer vkCommandBuffer,
            VkSubpassEndInfo subpassEndInfo);
    
    native void vkCmdEndTransformFeedbackEXT(
            VkCommandBuffer commandBuffer,
            int firstCounterBuffer,
            Collection<VkBuffer> counterBuffers,
            long[] counterBufferOffsets);
    
    native void vkCmdExecuteCommands(
            VkCommandBuffer commandBuffer,
            Collection<VkCommandBuffer> commandBuffers);
    
    native void vkCmdExecuteGeneratedCommandsNV(
            VkCommandBuffer commandBuffer,
            boolean isPreprocessed,
            VkGeneratedCommandsInfoNV generatedCommandsInfo);

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
    
    native void vkCmdNextSubpass2(
            VkCommandBuffer vkCommandBuffer,
            VkSubpassBeginInfo subpassBeginInfo,
            VkSubpassEndInfo subpassEndInfo);
    
    native void vkCmdPipelineBarrier(
            VkCommandBuffer vkCommandBuffer,
            EnumSet<VkPipelineStageFlagBits> srcStageMask,
            EnumSet<VkPipelineStageFlagBits> dstStageMask,
            EnumSet<VkDependencyFlagBits> dependencyFlags,
            Collection<VkMemoryBarrier> memoryBarriers,
            Collection<VkBufferMemoryBarrier> bufferMemoryBarriers,
            Collection<VkImageMemoryBarrier> imageMemoryBarriers);
    
    native void vkCmdPreprocessGeneratedCommandsNV(
            VkCommandBuffer commandBuffer,
            VkGeneratedCommandsInfoNV generatedCommandsInfo);

    native void vkCmdPushConstants(
            VkCommandBuffer commandBuffer,
            VkPipelineLayout layout,
            EnumSet<VkShaderStageFlagBits> stageFlags,
            int offset,
            byte[] values);
    
    native void vkCmdPushConstants(
            VkCommandBuffer commandBuffer,
            VkPipelineLayout layout,
            EnumSet<VkShaderStageFlagBits> stageFlags,
            int offset,
            float[] values);
    
    native void vkCmdPushConstants(
            VkCommandBuffer commandBuffer,
            VkPipelineLayout layout,
            EnumSet<VkShaderStageFlagBits> stageFlags,
            int offset,
            int[] values);
    
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
            Collection<Object> data);
    
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
    
    native void vkCmdSetCullModeEXT(
            VkCommandBuffer commandBuffer,
            EnumSet<VkCullModeFlagBits> cullMode);

    native void vkCmdSetDepthBias(
            VkCommandBuffer commandBuffer,
            float depthBiasConstantFactor,
            float depthBiasClamp,
            float depthBiasSlopeFactor);
    
    native void vkCmdSetDepthBounds(
            VkCommandBuffer commandBuffer,
            float minDepthBounds,
            float maxDepthBounds);
    
    native void vkCmdSetDepthBoundsTestEnableEXT(
            VkCommandBuffer commandBuffer,
            boolean depthBoundsTestEnable);

    native void vkCmdSetDepthCompareOpEXT(
            VkCommandBuffer commandBuffer,
            VkCompareOp depthCompareOp);

    native void vkCmdSetDepthTestEnableEXT(
            VkCommandBuffer commandBuffer,
            boolean depthTestEnable);

    native void vkCmdSetDepthWriteEnableEXT(
            VkCommandBuffer commandBuffer,
            boolean depthWriteEnable);

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
    
    native void vkCmdSetFrontFaceEXT(
            VkCommandBuffer commandBuffer,
            VkFrontFace frontFace);

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
    
    native void vkCmdSetPrimitiveTopologyEXT(
            VkCommandBuffer commandBuffer,
            VkPrimitiveTopology primitiveTopology);

    native void vkCmdSetSampleLocationsEXT(
            VkCommandBuffer commandBuffer,
            VkSampleLocationsInfoEXT sampleLocationsInfo);
    
    native void vkCmdSetScissor(
            VkCommandBuffer commandBuffer,
            int firstScissor,
            Collection<VkRect2D> scissors);
    
    native void vkCmdSetScissorWithCountEXT(
            VkCommandBuffer commandBuffer,
            Collection<VkRect2D> scissors);

    native void vkCmdSetStencilCompareMask(
            VkCommandBuffer commandBuffer,
            EnumSet<VkStencilFaceFlagBits> faceMask,
            int compareMask);
    
    native void vkCmdSetStencilOpEXT(
            VkCommandBuffer commandBuffer,
            EnumSet<VkStencilFaceFlagBits> faceMask,
            VkStencilOp failOp,
            VkStencilOp passOp,
            VkStencilOp depthFailOp,
            VkCompareOp compareOp);

    native void vkCmdSetStencilReference(
            VkCommandBuffer commandBuffer,
            EnumSet<VkStencilFaceFlagBits> faceMask,
            int reference);
    
    native void vkCmdSetStencilTestEnableEXT(
            VkCommandBuffer commandBuffer,
            boolean stencilTestEnable);

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
    
    native void vkCmdSetViewportWithCountEXT(
            VkCommandBuffer commandBuffer,
            Collection<VkViewport> viewports);

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
    
    native void vkCmdWriteAccelerationStructuresPropertiesKHR(
            VkCommandBuffer vkCommandBuffer,
            Collection<VkAccelerationStructureKHR> accelerationStructures,
            VkQueryType queryType,
            VkQueryPool queryPool,
            int firstQuery);
    
    native void vkCmdWriteAccelerationStructuresPropertiesNV(
            VkCommandBuffer vkCommandBuffer,
            Collection<VkAccelerationStructureKHR> accelerationStructures,
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
            VkAccelerationStructureKHR accelerationStructure);
    
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
    
    native VkResult vkCreateIndirectCommandsLayoutNV(
            VkDevice device,
            VkIndirectCommandsLayoutCreateInfoNV createInfo,
            VkAllocationCallbacks allocator,
            VkIndirectCommandsLayoutNV indirectCommandsLayout);

    native VkResult vkCreateInstance(
            VkInstanceCreateInfo instanceCreateInfo,
            VkAllocationCallbacks alternateAllocator,
            VkInstance vkInstance);
    
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
    
    native VkResult vkCreatePrivateDataSlotEXT(
            VkDevice device,
            VkPrivateDataSlotCreateInfoEXT createInfo,
            VkAllocationCallbacks alternateAllocator,
            VkPrivateDataSlotEXT privateDataSlot);
    
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
    
    native VkResult vkCreateRenderPass2(
            VkDevice vulkanLogicalDevice,
            VkRenderPassCreateInfo2 renderPassCreateInfo2,
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
            long object,
            long location,
            int messageCode,
            String layerPrefix,
            String message);
    
    native void vkDestroyAccelerationStructureKHR(
            VkDevice vkDevice,
            VkAccelerationStructureKHR accelerationStructure,
            VkAllocationCallbacks alternateAllocator);
    
    native void vkDestroyAccelerationStructureNV(
            VkDevice vkDevice,
            VkAccelerationStructureKHR accelerationStructure,
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
    
    native void vkDestroyIndirectCommandsLayoutNV(
            VkDevice device,
            VkIndirectCommandsLayoutNV indirectCommandsLayout,
            VkAllocationCallbacks allocator);
    
    native void vkDestroyInstance(
            VkInstance vkInstance,
            VkAllocationCallbacks alternateAllocator);
    
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
    
    native void vkDestroyPrivateDataSlotEXT(
            VkDevice device,
            VkPrivateDataSlotEXT privateDataSlot,
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
    
    native VkResult vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR(
            VkPhysicalDevice physicalDevice,
            int queueFamilyIndex,
            IntReturnValue counterCount,
            Collection<VkPerformanceCounterKHR> counters,
            Collection<VkPerformanceCounterDescriptionKHR> counterDescriptions);

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
    
    native VkResult vkGetAccelerationStructureHandleNV(
            VkDevice vulkanLogicalDevice,
            VkAccelerationStructureKHR accelerationStructure,
            VulkanHandle data);
    
    native void vkGetAccelerationStructureMemoryRequirementsNV(
            VkDevice vulkanLogicalDevice,
            VkAccelerationStructureMemoryRequirementsInfoNV vkAccelerationStructureMemoryRequirementsInfoNV,
            VkMemoryRequirements2KHR vkMemoryRequirements2KHR);
    
    native void vkGetAccelerationStructureScratchMemoryRequirementsNVX(
            VkDevice vulkanLogicalDevice,
            VkAccelerationStructureMemoryRequirementsInfoNV vkAccelerationStructureMemoryRequirementsInfoNVX,
            VkMemoryRequirements2KHR vkMemoryRequirements2KHR);
    
    native VkDeviceAddress vkGetBufferDeviceAddress(
            VkDevice vulkanLogicalDevice,
            VkBufferDeviceAddressInfo info);

    native void vkGetBufferMemoryRequirements(
            VkDevice vulkanLogicalDevice,
            VkBuffer vkBuffer,
            VkMemoryRequirements vkMemoryRequirements);
    
    native void vkGetBufferMemoryRequirements2(
            VkDevice device,
            VkBufferMemoryRequirementsInfo2 info,
            VkMemoryRequirements2 memoryRequirements);
    
    native VulkanHandle vkGetBufferOpaqueCaptureAddress(
            VkDevice device,
            VkBufferDeviceAddressInfo info);

    native VkResult vkGetCalibratedTimestampsEXT(
            VkDevice device,
            Collection<VkCalibratedTimestampInfoEXT> timestampInfos,
            long[] timestamps,
            LongReturnValue maxDeviation);
    
    native void vkGetDescriptorSetLayoutSupport(
            VkDevice device,
            VkDescriptorSetLayoutCreateInfo createInfo,
            VkDescriptorSetLayoutSupport support);
    
    native void vkGetDeviceGroupPeerMemoryFeatures(
            VkDevice device,
            int heapIndex,
            int localDeviceIndex,
            int remoteDeviceIndex,
            EnumSet<VkPeerMemoryFeatureFlagBits>peerMemoryFeatures);
    
    native VkResult vkGetDeviceGroupPresentCapabilitiesKHR(
            VkDevice device,
            VkDeviceGroupPresentCapabilitiesKHR deviceGroupPresentCapabilities);
    
    native VkResult vkGetDeviceGroupSurfacePresentModes2EXT(
            VkDevice device,
            VkPhysicalDeviceSurfaceInfo2KHR surfaceInfo,
            EnumSet<VkDeviceGroupPresentModeFlagBitsKHR> modes);
    
    native VkResult vkGetDeviceGroupSurfacePresentModesKHR(
            VkDevice device,
            VkSurfaceKHR surface,
            EnumSet<VkDeviceGroupPresentModeFlagBitsKHR> modes);
    
    native VulkanHandle vkGetDeviceMemoryOpaqueCaptureAddress(
            VkDevice device,
            VkDeviceMemoryOpaqueCaptureAddressInfo info);

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
    
    native void vkGetGeneratedCommandsMemoryRequirementsNV(
            VkDevice device,
            VkGeneratedCommandsMemoryRequirementsInfoNV info,
            VkMemoryRequirements2 memoryRequirements);

    native VkResult vkGetImageDrmFormatModifierPropertiesEXT(
            VkDevice device,
            VkImage image,
            VkImageDrmFormatModifierPropertiesEXT properties);

    native VkResult vkGetImageViewAddressNVX(
            VkDevice device,
            VkImageView imageView,
            VkImageViewAddressPropertiesNVX properties);

    native void vkGetImageMemoryRequirements(
            VkDevice vulkanLogicalDevice,
            VkImage vkImage,
            VkMemoryRequirements vkMemoryRequirements);
    
    native void vkGetImageMemoryRequirements2(
            VkDevice device,
            VkImageMemoryRequirementsInfo2 info,
            VkMemoryRequirements2 memoryRequirements);
    
    native VkResult vkGetSemaphoreCounterValue(
            VkDevice device,
            VkSemaphore semaphore,
            LongReturnValue value);
    
    native void vkGetImageSparseMemoryRequirements(
            VkDevice device,
            VkImage image,
            Collection<VkSparseImageMemoryRequirements> sparseMemoryRequirements);
    
    native void vkGetImageSparseMemoryRequirements2(
            VkDevice device,
            VkImageSparseMemoryRequirementsInfo2 info,
            Collection<VkSparseImageMemoryRequirements2> sparseMemoryRequirements);
    
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
    
    native void vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR(
            VkPhysicalDevice physicalDevice,
            VkQueryPoolPerformanceCreateInfoKHR performanceQueryCreateInfo,
            IntReturnValue numPasses);
    
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
            BooleanReturnValue supported);
    
    native VkResult vkGetPhysicalDeviceToolPropertiesEXT(
            VkPhysicalDevice                            physicalDevice,
            Collection<VkPhysicalDeviceToolPropertiesEXT> toolProperties);

    native boolean vkGetPhysicalDeviceWaylandPresentationSupportKHR(
            VkPhysicalDevice physicalDevice,
            int queueFamilyIndex,
            WlDisplayHandle waylandDisplay);
    
    native VkResult vkGetPipelineCacheData(
            VkDevice device,
            VkPipelineCache pipelineCache,
            ByteArrayReturnValue data);
    
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
    
    native void vkGetPrivateDataEXT(
            VkDevice device,
            VkObjectType objectType,
            long objectHandle,
            VkPrivateDataSlotEXT privateDataSlot,
            LongReturnValue data);
    
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
    
    native VkResult vkGetRayTracingShaderGroupHandlesKHR(
            VkDevice device,
            VkPipeline pipeline,
            int firstGroup,
            int groupCount,
            Collection<VulkanHandle> data);

    native VkResult vkGetRayTracingShaderGroupHandlesNV(
            VkDevice device,
            VkPipeline pipeline,
            int firstGroup,
            int groupCount,
            Collection<VulkanHandle> data);

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
            ByteArrayReturnValue info);
    
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
            ByteArrayReturnValue data);
    
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
    
//    native VkResult vkRegisterObjectsNVX(
//            VkDevice device,
//            VkObjectTableNVX objectTable,
//            Collection<VkObjectTableEntryNVX> objectTableEntries,
//            int[] objectIndices);
//    
    native VkResult vkReleaseDisplayEXT(
            VkPhysicalDevice physicalDevice,
            VkDisplayKHR display);
    
    native VkResult vkReleasePerformanceConfigurationINTEL(
            VkDevice device,
            VkPerformanceConfigurationINTEL configuration);
    
    native void vkReleaseProfilingLockKHR(
            VkDevice device);
    
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
    
    native void vkResetQueryPool(
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
    
    native VkResult vkSetPrivateDataEXT(
            VkDevice device,
            VkObjectType objectType,
            long objectHandle,
            VkPrivateDataSlotEXT privateDataSlot,
            long data);
    
    native VkResult vkSignalSemaphore(
            VkDevice device,
            VkSemaphoreSignalInfo signalInfo);
    
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
    
//    native VkResult vkUnregisterObjectsNVX(
//            VkDevice device,
//            VkObjectTableNVX objectTable,
//            Collection<VkObjectEntryTypeNVX> objectEntryTypes,
//            int[] objectIndices);
//    
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
    
    native VkResult vkWaitSemaphores(
            VkDevice device,
            VkSemaphoreWaitInfo waitInfo,
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

