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

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingQueue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkDescriptorBufferInfo;
import com.CIMthetics.jvulkan.VulkanCore.Structures.VkDescriptorImageInfo;
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
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VkApplicationInfo;
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

public class VulkanFunctions
{
    private Logger log = LoggerFactory.getLogger(VulkanFunctions.class.getName());

    private static NativeProxies nativeFunctionsProxyLibrary;
    private static String pathToNativeLibrary;
    private static String nativeLibraryName;
    
    public VulkanFunctions(String pathToNativeLibrary, String nativeLibraryName)
    {
        if (pathToNativeLibrary.endsWith("/") == false)
            VulkanFunctions.pathToNativeLibrary = pathToNativeLibrary + "/";
        else
            VulkanFunctions.pathToNativeLibrary = pathToNativeLibrary;
        
        VulkanFunctions.nativeLibraryName = nativeLibraryName;

        log.trace("Attempting to load native library:{}{}", VulkanFunctions.pathToNativeLibrary, VulkanFunctions.nativeLibraryName);
        System.load(VulkanFunctions.pathToNativeLibrary + VulkanFunctions.nativeLibraryName);
        log.trace("Loaded native library:{}{}", VulkanFunctions.pathToNativeLibrary, VulkanFunctions.nativeLibraryName);

        nativeFunctionsProxyLibrary = new NativeProxies();
    }
    
    public static int VK_API_VERSION_1_2()
    {
        return VK_MAKE_VERSION(1, 2, 0);
    }
    
    public static int VK_API_VERSION_1_1()
    {
        return VK_MAKE_VERSION(1, 1, 0);
    }
    
    public static int VK_API_VERSION_1_0()
    {
        return VK_MAKE_VERSION(1, 0, 0);
    }
    
    public static int VK_HEADER_VERSION_COMPLETE()
    {
        return VK_MAKE_VERSION(1, 2, VulkanConstants.VK_HEADER_VERSION);
    }
    
    /**
     * Constructs an API version number.
     * 
     * <p>This macro <b>can</b> be used when constructing the {@link VkApplicationInfo}{@code ::pname:apiVersion} parameter passed to {@link #vkCreateInstance CreateInstance}.</p>
     *
     * @param major the major version number
     * @param minor the minor version number
     * @param patch the patch version number
     */
    public static int VK_MAKE_VERSION(int major,int minor, int patch) 
    {
        return (major << 22) | (minor << 12) | patch;
    }

    // --- [ VK_VERSION_MAJOR ] ---

    /**
     * Extracts the API major version number from a packed version number.
     *
     * @param version the Vulkan API version
     */
    public static int VK_VERSION_MAJOR(int version)
    {
        return version >> 22;
    }

    // --- [ VK_VERSION_MINOR ] ---

    /**
     * Extracts the API minor version number from a packed version number.
     *
     * @param version the Vulkan API version
     */
    public static int VK_VERSION_MINOR(int version)
    {
        return (version >> 12) & 0x3FF;
    }

    // --- [ VK_VERSION_PATCH ] ---

    /**
     * Extracts the API patch version number from a packed version number.
     *
     * @param version the Vulkan API version
     */
    public static int VK_VERSION_PATCH(int version)
    {
        return version & 0xFFF;
    }

    public static VkResult vkCreateInstance(
            VkInstanceCreateInfo instanceCreateInfo,
            VkAllocationCallbacks alternateAllocator,
            VkInstance vkInstance)
    {
        return nativeFunctionsProxyLibrary.vkCreateInstance(instanceCreateInfo, alternateAllocator, vkInstance);
    }
    
    public static void vkDestroyInstance(VkInstance vkInstance, VkAllocationCallbacks alternateAllocator)
    {
        nativeFunctionsProxyLibrary.vkDestroyInstance(vkInstance, alternateAllocator);
    }
    
    /**
     * 
     * @param vkInstance - a valid Vulkan instance object.
     * @param collectionOfPhysicalDevices - a pre-created collection where handles to the available Vulkan physical devices will be added.
     * @return
     */
    public static VkResult vkEnumeratePhysicalDevices(VkInstance vkInstance, Collection<VkPhysicalDevice> collectionOfPhysicalDevices)
    {
        if (vkInstance == null)
            throw new NullPointerException("vkInstance must not be null.");
        
        if (collectionOfPhysicalDevices == null)
            throw new NullPointerException("collectionOfPhysicalDevices must not be null.");
            
        return nativeFunctionsProxyLibrary.vkEnumeratePhysicalDevices(vkInstance, collectionOfPhysicalDevices);
    }
    
    /**
     * 
     * @param physicalDevice
     * @param layerName
     * @param collectionOfExtensionProperties - a pre-created collection where extension properties will be added.
     * @return
     */
    public static VkResult vkEnumerateDeviceExtensionProperties(
            VkPhysicalDevice physicalDevice,
            String layerName,
            Collection<VkExtensionProperties> collectionOfExtensionProperties)
    {
        if (physicalDevice == null)
            throw new NullPointerException("physicalDevice must not be null.");
        
        if (collectionOfExtensionProperties == null)
            throw new NullPointerException("collectionOfExtensionProperties must not be null.");
        
        return nativeFunctionsProxyLibrary.vkEnumerateDeviceExtensionProperties(
                physicalDevice,
                layerName,
                collectionOfExtensionProperties);
    }

    public static VkResult vkAllocateCommandBuffers(
            VkDevice vulkanLogicalDevice,
            VkCommandBufferAllocateInfo commandBufferAllocateInfo,
            Collection<VkCommandBuffer> commandBufferCollection)
    {
        return nativeFunctionsProxyLibrary.vkAllocateCommandBuffers(
                vulkanLogicalDevice,
                commandBufferAllocateInfo,
                commandBufferCollection);
    }
    
    public static VkResult vkAllocateDescriptorSets(
            VkDevice vulkanLogicalDevice,
            VkDescriptorSetAllocateInfo vkDescriptorSetAllocateInfo,
            Collection<VkDescriptorSet> descriptorSets)
    {
        return nativeFunctionsProxyLibrary.vkAllocateDescriptorSets(
                vulkanLogicalDevice,
                vkDescriptorSetAllocateInfo,
                descriptorSets);
    }
    
    public static VkResult vkAllocateMemory(
            VkDevice vulkanLogicalDevice,
            VkMemoryAllocateInfo vkMemoryAllocateInfo,
            VkAllocationCallbacks alternateAllocator,
            VkDeviceMemory vkDeviceMemory)
    {
        return nativeFunctionsProxyLibrary.vkAllocateMemory(
                vulkanLogicalDevice,
                vkMemoryAllocateInfo,
                alternateAllocator,
                vkDeviceMemory);
    }
    
    public static void vkGetPhysicalDeviceQueueFamilyProperties(
            VkPhysicalDevice physicalDevice,
            Collection<VkQueueFamilyProperties> collectionOfQueueFamilyProperties)
    {
        if (physicalDevice == null)
            throw new NullPointerException("physicalDevice must not be null.");
        
        if (collectionOfQueueFamilyProperties == null)
            throw new NullPointerException("collectionOfQueueFamilyProperties must not be null.");
            
        nativeFunctionsProxyLibrary.vkGetPhysicalDeviceQueueFamilyProperties(physicalDevice, collectionOfQueueFamilyProperties);
    }
    
    
    
    // TODO the debug stuff may need to move elsewhere
    public static VkResult vkCreateDebugReportCallbackEXT(
            VkInstance vkInstance,
            VkDebugReportCallbackCreateInfoEXT dbgCreateInfo,
            VkAllocationCallbacks alternateAllocator,
            VkDebugReportCallbackEXT callback)
    {
        return nativeFunctionsProxyLibrary.vkCreateDebugReportCallbackEXT(
                vkInstance,
                dbgCreateInfo,
                alternateAllocator,
                callback);
    }

    public static void vkDestroyDebugReportCallbackEXT(
            VkInstance vkInstance,
            VkDebugReportCallbackEXT debugCallbackHandle,
            VkAllocationCallbacks alternateAllocator)
    {
        nativeFunctionsProxyLibrary.vkDestroyDebugReportCallbackEXT(vkInstance, debugCallbackHandle, alternateAllocator);
    }

    /**
     * Retrieve the specified device queue.
     * <p>
     * Note:
     * <br>
     * GetDeviceQueue must only be used to get queues that were created with 
     * the flags Set parameter of <code>VkDeviceQueueCreateInfo</code> empty.
     * (Definitely the case when the parameter is not set after the constructor
     * is called.)
     * 
     * To get queues that were created with a non-empty flags parameter use 
     * <code>GetDeviceQueue2</code>.

     * @param logicalDevice
     * @param queueFamilyIndex
     * @param queueIndex
     * @param queue
     */
    public static void vkGetDeviceQueue(
            VkDevice logicalDevice,
            int queueFamilyIndex,
            int queueIndex,
            VkQueue queue)
    {
        nativeFunctionsProxyLibrary.vkGetDeviceQueue(logicalDevice, queueFamilyIndex, queueIndex, queue);
    }
    
    public static void vkGetPhysicalDeviceProperties(
            VkPhysicalDevice physicalDevice,
            VkPhysicalDeviceProperties deviceProperties)
    {
        nativeFunctionsProxyLibrary.vkGetPhysicalDeviceProperties(physicalDevice, deviceProperties);
    }
    
    public static void vkGetPhysicalDeviceProperties2(
            VkPhysicalDevice physicalDevice,
            VkPhysicalDeviceProperties2 deviceProperties)
    {
        nativeFunctionsProxyLibrary.vkGetPhysicalDeviceProperties2(physicalDevice, deviceProperties);
    }
    
    public static void vkGetPhysicalDeviceProperties2KHR(
            VkPhysicalDevice physicalDevice,
            VkPhysicalDeviceProperties2 deviceProperties)
    {
        nativeFunctionsProxyLibrary.vkGetPhysicalDeviceProperties2KHR(physicalDevice, deviceProperties);
    }
    
    public static void vkGetPhysicalDeviceFeatures(
            VkPhysicalDevice physicalDevice,
            VkPhysicalDeviceFeatures deviceFeatures)
    {
        nativeFunctionsProxyLibrary.vkGetPhysicalDeviceFeatures(physicalDevice, deviceFeatures);
    }
    
    public static VkResult vkCreateDevice(
            VkPhysicalDevice physicalDevice,
            VkDeviceCreateInfo deviceCreateInfo,
            VkAllocationCallbacks alternateAllocator,
            VkDevice device)
    {
        if (physicalDevice == null)
            throw new NullPointerException("physicalDevice must not be null.");
        
        if (deviceCreateInfo == null)
            throw new NullPointerException("deviceCreateInfo must not be null.");
        
        if (device == null)
            throw new NullPointerException("device must not be null.");
        
        return nativeFunctionsProxyLibrary.vkCreateDevice(
                physicalDevice,
                deviceCreateInfo,
                alternateAllocator,
                device);
    }

    public static void vkDestroyDevice(
            VkDevice device,
            VkAllocationCallbacks alternateAllocator)
    {
        if (device == null)
            throw new NullPointerException("device must not be null.");
        
        nativeFunctionsProxyLibrary.vkDestroyDevice(device, alternateAllocator);
    }
    
    public static VkResult vkCreateWaylandSurfaceKHR(
            VkInstance vkInstance,
            VkWaylandSurfaceCreateInfoKHR vkWaylandSurfaceCreateInfoKHR,
            VkAllocationCallbacks alternateAllocator,
            VkSurfaceKHR vkSurfaceVKR)
    {
        return nativeFunctionsProxyLibrary.vkCreateWaylandSurfaceKHR(
                vkInstance,
                vkWaylandSurfaceCreateInfoKHR,
                alternateAllocator,
                vkSurfaceVKR);
    }
    
    public static boolean vkGetPhysicalDeviceWaylandPresentationSupportKHR(
            VkPhysicalDevice physicalDevice,
            int queueFamilyIndex,
            WlDisplayHandle waylandDisplay)
    {
        return nativeFunctionsProxyLibrary.vkGetPhysicalDeviceWaylandPresentationSupportKHR(
                physicalDevice,
                queueFamilyIndex,
                waylandDisplay);
    }
    

    public static void vkDestroySurfaceKHR(
            VkInstance vulkanInstance,
            VkSurfaceKHR windowSurfaceHandle,
            VkAllocationCallbacks alternateAllocator)
    {
        nativeFunctionsProxyLibrary.vkDestroySurfaceKHR(
                vulkanInstance,
                windowSurfaceHandle,
                alternateAllocator);
    }
    
    public static VkResult vkGetPhysicalDeviceSurfaceCapabilitiesKHR(
            VkPhysicalDevice physicalDevice,
            VkSurfaceKHR     surface,
            VkSurfaceCapabilitiesKHR surfaceCapabilities)
    {
        return nativeFunctionsProxyLibrary.vkGetPhysicalDeviceSurfaceCapabilitiesKHR(
                physicalDevice,
                surface,
                surfaceCapabilities);
    }
    
    public static VkResult vkGetPhysicalDeviceSurfaceFormatsKHR(
            VkPhysicalDevice physicalDevice,
            VkSurfaceKHR     surface,
            Collection<VkSurfaceFormatKHR> surfaceFormats)
    {
        return nativeFunctionsProxyLibrary.vkGetPhysicalDeviceSurfaceFormatsKHR(
                physicalDevice,
                surface,
                surfaceFormats);
    }
    
    public static VkResult vkGetPhysicalDeviceSurfacePresentModesKHR(
            VkPhysicalDevice physicalDevice,
            VkSurfaceKHR     surface,
            Collection<VkPresentModeKHR> presentationModes)
    {
        return nativeFunctionsProxyLibrary.vkGetPhysicalDeviceSurfacePresentModesKHR(
                physicalDevice,
                surface,
                presentationModes);
    }
    
    /**
     * 
     * @param physicalDevice
     * @param queueFamilyIndex
     * @param surface
     * @param isSupported - this array must sized so that <code>isSupported[queueFamilyIndex]</code>
     * is a legitimate element.
     * @return
     */
    public static VkResult vkGetPhysicalDeviceSurfaceSupportKHR(
            VkPhysicalDevice physicalDevice,
            int queueFamilyIndex,
            VkSurfaceKHR surface,
            BooleanReturnValue isSupported)
    {
        return nativeFunctionsProxyLibrary.vkGetPhysicalDeviceSurfaceSupportKHR(
                physicalDevice,
                queueFamilyIndex,
                surface,
                isSupported);
    }
    
    public static VkResult vkCreateSwapchainKHR(
            VkDevice vulkanLogicalDevice,
            VkSwapchainCreateInfoKHR swapchainCreateInfo,
            VkAllocationCallbacks alternateAllocator,
            VkSwapchainKHR swapchainHandle)
    {
        return nativeFunctionsProxyLibrary.vkCreateSwapchainKHR(
                vulkanLogicalDevice,
                swapchainCreateInfo,
                alternateAllocator,
                swapchainHandle);
    }
    
    public static void vkDestroySwapchainKHR(
            VkDevice vulkanLogicalDevice,
            VkSwapchainKHR swapchainHandle,
            VkAllocationCallbacks alternateAllocator)
    {
        nativeFunctionsProxyLibrary.vkDestroySwapchainKHR(
                vulkanLogicalDevice,
                swapchainHandle,
                alternateAllocator);
    }
    
    public static void vkDestroyImageView(
            VkDevice vulkanLogicalDevice,
            VkImageView imageViewHandle,
            VkAllocationCallbacks alternateAllocator)
    {
        nativeFunctionsProxyLibrary.vkDestroyImageView(
                vulkanLogicalDevice,
                imageViewHandle,
                alternateAllocator);
    }
    
    public static void vkDestroyFramebuffer(
            VkDevice vulkanLogicalDevice,
            VkFramebuffer frameBufferHandle,
            VkAllocationCallbacks alternateAllocator)
    {
        nativeFunctionsProxyLibrary.vkDestroyFramebuffer(
                vulkanLogicalDevice,
                frameBufferHandle,
                alternateAllocator);
    }
    
    public static void vkDestroyRenderPass(
            VkDevice vulkanLogicalDevice,
            VkRenderPass renderPassHandle,
            VkAllocationCallbacks alternateAllocator)
    {
        nativeFunctionsProxyLibrary.vkDestroyRenderPass(
                vulkanLogicalDevice,
                renderPassHandle,
                alternateAllocator);
    }
    
    public static void vkDestroyPipelineLayout(
            VkDevice vulkanLogicalDevice,
            VkPipelineLayout pipelineLayoutHandle,
            VkAllocationCallbacks alternateAllocator)
    {
        nativeFunctionsProxyLibrary.vkDestroyPipelineLayout(
                vulkanLogicalDevice,
                pipelineLayoutHandle,
                alternateAllocator);
    }
    
    public static void vkDestroyPipeline(
            VkDevice vulkanLogicalDevice,
            VkPipeline pipelineHandle,
            VkAllocationCallbacks alternateAllocator)
    {
        nativeFunctionsProxyLibrary.vkDestroyPipeline(
                vulkanLogicalDevice,
                pipelineHandle,
                alternateAllocator);
    }
    
    public static void vkFreeCommandBuffers(
            VkDevice vulkanLogicalDevice,
            VkCommandPool commandPoolHandle,
            Collection<VkCommandBuffer> commandBufferHandles)
    {
        nativeFunctionsProxyLibrary.vkFreeCommandBuffers(
                vulkanLogicalDevice,
                commandPoolHandle,
                commandBufferHandles);
    }
    
    public static void vkDestroyImage(
            VkDevice vulkanLogicalDevice,
            VkImage imageHandle,
            VkAllocationCallbacks alternateAllocator)
    {
        nativeFunctionsProxyLibrary.vkDestroyImage(
                vulkanLogicalDevice,
                imageHandle,
                alternateAllocator);
    }
    
    public static VkResult vkGetSwapchainImagesKHR(
            VkDevice vulkanLogicalDevice,
            VkSwapchainKHR swapchain,
            Collection<VkImage> swapchainImages)
    {
        return nativeFunctionsProxyLibrary.vkGetSwapchainImagesKHR(
                vulkanLogicalDevice,
                swapchain,
                swapchainImages);
    }
    
    public static VkResult vkCreateImageView(
            VkDevice vulkanLogicalDevice,
            VkImageViewCreateInfo imageViewCreateInfo,
            VkAllocationCallbacks alternateAllocator,
            VkImageView imageViewHandle)
    {
        return nativeFunctionsProxyLibrary.vkCreateImageView(
                vulkanLogicalDevice,
                imageViewCreateInfo,
                alternateAllocator,
                imageViewHandle);
    }
    
    /**
     * Create a render pass
     * 
     * @param vulkanLogicalDevice - the logical device that creates the render pass
     * @param renderPassCreateInfo - the <code>VkRenderPassCreateInfo</code> structure that describes the parameters of the render pass
     * @param alternateAllocator - alternate host memory allocator (may be <code>null</code>
     * @param renderPassHandle - the resulting render pass object
     * @return VK_SUCCESS - Success
     * <br>
     * VK_ERROR_OUT_OF_HOST_MEMORY - Failure
     * <br>
     * VK_ERROR_OUT_OF_DEVICE_MEMORY - Failure
     */
    public static VkResult vkCreateRenderPass(
            VkDevice vulkanLogicalDevice,
            VkRenderPassCreateInfo renderPassCreateInfo,
            VkAllocationCallbacks alternateAllocator,
            VkRenderPass renderPassHandle)
    {
        return nativeFunctionsProxyLibrary.vkCreateRenderPass(
                vulkanLogicalDevice,
                renderPassCreateInfo,
                alternateAllocator,
                renderPassHandle);
    }
    
    public static VkResult vkCreateRenderPass2(
            VkDevice vulkanLogicalDevice,
            VkRenderPassCreateInfo2 renderPassCreateInfo2,
            VkAllocationCallbacks alternateAllocator,
            VkRenderPass renderPassHandle)
    {
        return nativeFunctionsProxyLibrary.vkCreateRenderPass2(
                vulkanLogicalDevice,
                renderPassCreateInfo2,
                alternateAllocator,
                renderPassHandle);
    }
    
    public static VkResult vkCreateShaderModule(
            VkDevice vulkanLogicalDevice,
            VkShaderModuleCreateInfo shaderModuleCreateInfo,
            VkAllocationCallbacks alternateAllocator,
            VkShaderModule shaderModule)
    {
        return nativeFunctionsProxyLibrary.vkCreateShaderModule(
                vulkanLogicalDevice,
                shaderModuleCreateInfo,
                alternateAllocator,
                shaderModule);
    }
    
    public static VkResult vkCreatePipelineLayout(
            VkDevice vulkanLogicalDevice,
            VkPipelineLayoutCreateInfo pipelineLayoutCreateInfo,
            VkAllocationCallbacks alternateAllocator,
            VkPipelineLayout pipelineLayout)
    {
        return nativeFunctionsProxyLibrary.vkCreatePipelineLayout(
                vulkanLogicalDevice,
                pipelineLayoutCreateInfo,
                alternateAllocator,
                pipelineLayout);
    }
    
    /**
     * 
     * <b>Note:</b>Make sure the collection of <code>VkPipeline</code> is the same size as the collection of <code>VkGraphicsPipelineCreateInfo</code>
     * @param vulkanLogicalDevice
     * @param pipelineCache
     * @param graphicsPipelineCreateInfos
     * @param alternateAllocator
     * @param pipelines
     * @return
     */
    public static VkResult vkCreateGraphicsPipelines(
            VkDevice vulkanLogicalDevice,
            VkPipelineCache pipelineCache,
            Collection<VkGraphicsPipelineCreateInfo> graphicsPipelineCreateInfos,
            VkAllocationCallbacks alternateAllocator,
            Collection<VkPipeline> pipelines)
    {
        if (graphicsPipelineCreateInfos.size() != pipelines.size())
        {
            throw new IllegalArgumentException("The size of the pipelines collection needs to be the same size as the graphicsPipelineCreateInfos collection.");
        }
        
        return nativeFunctionsProxyLibrary.vkCreateGraphicsPipelines(
                vulkanLogicalDevice,
                pipelineCache,
                graphicsPipelineCreateInfos,
                alternateAllocator,
                pipelines);
    }
    
    public static VkResult vkCreateFramebuffer(
            VkDevice vulkanLogicalDevice,
            VkFramebufferCreateInfo vkFramebufferCreateInfo,
            VkAllocationCallbacks alternateAllocator,
            VkFramebuffer framebuffer)
    {
        return nativeFunctionsProxyLibrary.vkCreateFramebuffer(
                vulkanLogicalDevice,
                vkFramebufferCreateInfo,
                alternateAllocator,
                framebuffer);
    }
    
    public static VkResult vkCreateCommandPool(
            VkDevice vulkanLogicalDevice,
            VkCommandPoolCreateInfo vkCommandPoolCreateInfo,
            VkAllocationCallbacks alternateAllocator,
            VkCommandPool commandPool)
    {
        return nativeFunctionsProxyLibrary.vkCreateCommandPool(
                vulkanLogicalDevice,
                vkCommandPoolCreateInfo,
                alternateAllocator,
                commandPool);
    }
    
    public static VkResult vkBeginCommandBuffer(
            VkCommandBuffer vkCommandBuffer,
            VkCommandBufferBeginInfo vkCommandBufferBeginInfo)
    {
        return nativeFunctionsProxyLibrary.vkBeginCommandBuffer(
                vkCommandBuffer,
                vkCommandBufferBeginInfo);
    }
    
    public static void vkCmdBeginConditionalRenderingEXT(
            VkCommandBuffer vkCommandBuffer,
            VkConditionalRenderingBeginInfoEXT vkConditionalRenderingBeginInfoEXT)
    {
        nativeFunctionsProxyLibrary.vkCmdBeginConditionalRenderingEXT(
                vkCommandBuffer,
                vkConditionalRenderingBeginInfoEXT);
    }
    
    public static void vkCmdBeginRenderPass(
            VkCommandBuffer vkCommandBuffer,
            VkRenderPassBeginInfo vkRenderPassBeginInfo,
            VkSubpassContents vkSubpassContents)
    {
        nativeFunctionsProxyLibrary.vkCmdBeginRenderPass(
                vkCommandBuffer,
                vkRenderPassBeginInfo,
                vkSubpassContents);
    }
    
    public static void vkCmdBeginRenderPass2(
            VkCommandBuffer vkCommandBuffer,
            VkRenderPassBeginInfo vkRenderPassBeginInfo,
            VkSubpassBeginInfo vkSubpassContents)
    {
        nativeFunctionsProxyLibrary.vkCmdBeginRenderPass2(
                vkCommandBuffer,
                vkRenderPassBeginInfo,
                vkSubpassContents);
    }
    
    public static void vkCmdBindPipeline(
            VkCommandBuffer vkCommandBuffer,
            VkPipelineBindPoint vkPipelineBindPoint,
            VkPipeline vkPipeline)
    {
        nativeFunctionsProxyLibrary.vkCmdBindPipeline(
                vkCommandBuffer,
                vkPipelineBindPoint,
                vkPipeline);
    }
    
    public static void vkCmdBindShadingRateImageNV(
            VkCommandBuffer vkCommandBuffer,
            VkImageView imageView,
            VkImageLayout imageLayout)
    {
        nativeFunctionsProxyLibrary.vkCmdBindShadingRateImageNV(
                vkCommandBuffer,
                imageView,
                imageLayout);
    }
    
    public static void vkCmdDraw(
            VkCommandBuffer vkCommandBuffer,
            int vertexCount,
            int instanceCount,
            int firstVertex,
            int firstInstance)
    {
        nativeFunctionsProxyLibrary.vkCmdDraw(
                vkCommandBuffer,
                vertexCount,
                instanceCount,
                firstVertex,
                firstInstance);
    }

    public static void vkCmdEndConditionalRenderingEXT(
            VkCommandBuffer vkCommandBuffer)
    {
        nativeFunctionsProxyLibrary.vkCmdEndConditionalRenderingEXT(
                vkCommandBuffer);
    }
    
    public static void vkCmdEndRenderPass(
            VkCommandBuffer vkCommandBuffer)
    {
        nativeFunctionsProxyLibrary.vkCmdEndRenderPass(
                vkCommandBuffer);
    }
    
    public static void vkCmdEndRenderPass2(
            VkCommandBuffer vkCommandBuffer,
            VkSubpassEndInfo subpassEndInfo)
    {
        nativeFunctionsProxyLibrary.vkCmdEndRenderPass2(
                vkCommandBuffer,
                subpassEndInfo);
    }
    
    public static void vkCmdNextSubpass2(
            VkCommandBuffer vkCommandBuffer,
            VkSubpassBeginInfo subpassBeginInfo,
            VkSubpassEndInfo subpassEndInfo)
    {
        nativeFunctionsProxyLibrary.vkCmdNextSubpass2(
                vkCommandBuffer,
                subpassBeginInfo,
                subpassEndInfo);
    }
    
    public static void vkCmdSetCoarseSampleOrderNV(
            VkCommandBuffer vkCommandBuffer,
            VkCoarseSampleOrderTypeNV sampleOrderType,
            Collection<VkCoarseSampleOrderCustomNV> customSampleOrders)
    {
        nativeFunctionsProxyLibrary.vkCmdSetCoarseSampleOrderNV(
                vkCommandBuffer,
                sampleOrderType,
                customSampleOrders);
    }
    
    public static void vkCmdSetViewportShadingRatePaletteNV(
            VkCommandBuffer vkCommandBuffer,
            int firstViewport,
            Collection<VkShadingRatePaletteNV> shadingRatePalettes)
    {
        nativeFunctionsProxyLibrary.vkCmdSetViewportShadingRatePaletteNV(
                vkCommandBuffer,
                firstViewport,
                shadingRatePalettes);
    }
    
    public static void vkCmdWriteAccelerationStructuresPropertiesKHR(
            VkCommandBuffer vkCommandBuffer,
            Collection<VkAccelerationStructureKHR> accelerationStructures,
            VkQueryType queryType,
            VkQueryPool queryPool,
            int queryPoolIndex)
    {
        nativeFunctionsProxyLibrary.vkCmdWriteAccelerationStructuresPropertiesNV(
                vkCommandBuffer,
                accelerationStructures,
                queryType,
                queryPool,
                queryPoolIndex);
    }
    
    public static void vkCmdWriteAccelerationStructuresPropertiesNV(
            VkCommandBuffer vkCommandBuffer,
            Collection<VkAccelerationStructureKHR> accelerationStructures,
            VkQueryType queryType,
            VkQueryPool queryPool,
            int queryPoolIndex)
    {
        nativeFunctionsProxyLibrary.vkCmdWriteAccelerationStructuresPropertiesNV(
                vkCommandBuffer,
                accelerationStructures,
                queryType,
                queryPool,
                queryPoolIndex);
    }
    
    public static VkResult vkCompileDeferredNV(
            VkDevice vulkanLogicalDevice,
            VkPipeline pipeline,
            int shader)
    {
        return nativeFunctionsProxyLibrary.vkCompileDeferredNV(
                vulkanLogicalDevice,
                pipeline,
                shader);
    }
    
    public static VkResult vkEndCommandBuffer(
            VkCommandBuffer vkCommandBuffer)
    {
        return nativeFunctionsProxyLibrary.vkEndCommandBuffer(
                vkCommandBuffer);
    }
    
    public static void vkDestroyCommandPool(
            VkDevice vulkanLogicalDevice,
            VkCommandPool commandommandPoolHandle,
            VkAllocationCallbacks alternateAllocator)
    {
        nativeFunctionsProxyLibrary.vkDestroyCommandPool(
                vulkanLogicalDevice,
                commandommandPoolHandle,
                alternateAllocator);
    }
    
    public static VkResult vkCreateSemaphore(
            VkDevice vulkanLogicalDevice,
            VkSemaphoreCreateInfo vkSemaphoreCreateInfo,
            VkAllocationCallbacks alternateAllocator,
            VkSemaphore vkSemaphore)
    {
        return nativeFunctionsProxyLibrary.vkCreateSemaphore(
                vulkanLogicalDevice,
                vkSemaphoreCreateInfo,
                alternateAllocator,
                vkSemaphore);
    }
    
    public static void vkDestroySemaphore(
            VkDevice vulkanLogicalDevice,
            VkSemaphore vkSemaphore,
            VkAllocationCallbacks alternateAllocator)
    {
        nativeFunctionsProxyLibrary.vkDestroySemaphore(
                vulkanLogicalDevice,
                vkSemaphore,
                alternateAllocator);
    }
    
    public static VkResult vkCreateFence(
            VkDevice vulkanLogicalDevice,
            VkFenceCreateInfo vkFenceCreateInfo,
            VkAllocationCallbacks alternateAllocator,
            VkFence vkFence)
    {
        return nativeFunctionsProxyLibrary.vkCreateFence(
                vulkanLogicalDevice,
                vkFenceCreateInfo,
                alternateAllocator,
                vkFence);
    }
    
    public static void vkDestroyFence(
            VkDevice vulkanLogicalDevice,
            VkFence vkFence,
            VkAllocationCallbacks alternateAllocator)
    {
        nativeFunctionsProxyLibrary.vkDestroyFence(
                vulkanLogicalDevice,
                vkFence,
                alternateAllocator);
    }
    
    public static VkResult vkDeviceWaitIdle(
            VkDevice vulkanLogicalDevice)
    {
        return nativeFunctionsProxyLibrary.vkDeviceWaitIdle(
                vulkanLogicalDevice);
    }
    
    public static void vkDestroyShaderModule(
            VkDevice vulkanLogicalDevice,
            VkShaderModule vkShaderModule,
            VkAllocationCallbacks alternateAllocator)
    {
        nativeFunctionsProxyLibrary.vkDestroyShaderModule(
                vulkanLogicalDevice,
                vkShaderModule,
                alternateAllocator);
    }
    
    public static VkResult vkWaitForFences(
            VkDevice vulkanLogicalDevice,
            Collection<VkFence> vkFences,
            boolean waitAll,
            long timeout)
    {
        return nativeFunctionsProxyLibrary.vkWaitForFences(
                vulkanLogicalDevice,
                vkFences,
                waitAll,
                timeout);
    }
    
    public static void vkResetFences(
            VkDevice vulkanLogicalDevice,
            Collection<VkFence> vkFences)
    {
        nativeFunctionsProxyLibrary.vkResetFences(
                vulkanLogicalDevice,
                vkFences);
    }
    
    
    public static VkResult vkAcquireNextImage2KHR(
            VkDevice vulkanLogicalDevice,
            VkAcquireNextImageInfoKHR acquireInfo,
            int imageIndex)
    {
        return nativeFunctionsProxyLibrary.vkAcquireNextImage2KHR(
                vulkanLogicalDevice,
                acquireInfo,
                imageIndex);
    }
    
    public static VkResult vkAcquireNextImageKHR(
            VkDevice vulkanLogicalDevice,
            VkSwapchainKHR swapchain,
            long timeout,
            VkSemaphore semaphore,
            VkFence fence,
            IntReturnValue imageIndex)
    {
        return nativeFunctionsProxyLibrary.vkAcquireNextImageKHR(
                vulkanLogicalDevice,
                swapchain,
                timeout,
                semaphore,
                fence,
                imageIndex);
    }
    
    public static VkResult vkQueueSubmit(
            VkQueue queue,
            Collection<VkSubmitInfo> submits,
            VkFence fence)
    {
        return nativeFunctionsProxyLibrary.vkQueueSubmit(
                queue,
                submits,
                fence);
    }
    
    /**
     * This is a convenience function for <code>vkQueueSubmit</code> so that
     * you do not need to create a Java <code>Collection</code> for just one 
     * <code>VkSubmitInfo</code> element.
     * 
     * @param queue the queue on the graphics device
     * @param submitInfo the <code>VkSubmitInfo</code> information
     * @param fence a Fence for completion synchronization
     * @return a <code>VkResult</code> indicating the completion status
     */
    public static VkResult vkQueueSubmit(
            VkQueue queue,
            VkSubmitInfo submitInfo,
            VkFence fence)
    {
        Collection<VkSubmitInfo> submitInfoCollection = new LinkedList<VkSubmitInfo>();
        submitInfoCollection.add(submitInfo);

        return nativeFunctionsProxyLibrary.vkQueueSubmit(
                queue,
                submitInfoCollection,
                fence);
    }
    
    public static VkResult vkQueuePresentKHR(
            VkQueue queue,
            VkPresentInfoKHR vkPresentInfoKHR)
    {
        return nativeFunctionsProxyLibrary.vkQueuePresentKHR(
                queue,
                vkPresentInfoKHR);
    }
    
    public static VkResult vkCreateAccelerationStructureNV(
            VkDevice vkDevice,
            VkAccelerationStructureCreateInfoNV createInfo,
            VkAllocationCallbacks alternateAllocator,
            VkAccelerationStructureKHR accelerationStructure)
    {
        return nativeFunctionsProxyLibrary.vkCreateAccelerationStructureNV(
                vkDevice,
                createInfo,
                alternateAllocator,
                accelerationStructure);
    }
    
    public static VkResult vkCreateBuffer(
            VkDevice vulkanLogicalDevice,
            VkBufferCreateInfo vkBufferCreateInfo,
            VkAllocationCallbacks alternateAllocator,
            VkBuffer vkBuffer)
    {
        return nativeFunctionsProxyLibrary.vkCreateBuffer(
                vulkanLogicalDevice,
                vkBufferCreateInfo,
                alternateAllocator,
                vkBuffer);
    }
    
    public static VkResult vkCreateBufferView(
            VkDevice vulkanLogicalDevice,
            VkBufferViewCreateInfo vkBufferViewCreateInfo,
            VkAllocationCallbacks alternateAllocator,
            VkBufferView vkBufferView)
    {
        return nativeFunctionsProxyLibrary.vkCreateBufferView(
                vulkanLogicalDevice,
                vkBufferViewCreateInfo,
                alternateAllocator,
                vkBufferView);
    }
    
    public static VkResult vkCreateComputePipelines(
            VkDevice vulkanLogicalDevice,
            VkPipelineCache vkPipelineCache,
            Collection<VkComputePipelineCreateInfo> createInfos,
            VkAllocationCallbacks alternateAllocator,
            Collection<VkPipeline> pipelines)
    {
        if (pipelines == null)
        {
            throw new IllegalArgumentException("Pipelines argument must not be null.  I should be an empty collection.");
        }
        
        return nativeFunctionsProxyLibrary.vkCreateComputePipelines(
                vulkanLogicalDevice,
                vkPipelineCache,
                createInfos,
                alternateAllocator,
                pipelines);
    }
    
    public static VkResult vkCreateRayTracingPipelinesNV(
            VkDevice vulkanLogicalDevice,
            VkPipelineCache pipelineCache,
            Collection<VkRayTracingPipelineCreateInfoNV> createInfos,
            VkAllocationCallbacks alternateAllocator,
            Collection<VkPipeline> pipelines)
    {
        return nativeFunctionsProxyLibrary.vkCreateRayTracingPipelinesNV(
                vulkanLogicalDevice,
                pipelineCache,
                createInfos,
                alternateAllocator,
                pipelines);
    }
    
    /**
     * TODO the data returned is supposed to be opaque handles so I don't know if this is the correct return handle
     * it will probably work though
     * 
     * @param vulkanLogicalDevice
     * @param accelerationStructure
     * @param data
     * @return
     */
    public static VkResult vkGetAccelerationStructureHandleNV(
            VkDevice vulkanLogicalDevice,
            VkAccelerationStructureKHR accelerationStructure,
            Collection<VkAccelerationStructureKHR> data)
    {
        return nativeFunctionsProxyLibrary.vkGetAccelerationStructureHandleNV(
                vulkanLogicalDevice,
                accelerationStructure,
                data);
    }
    
    public static void vkGetAccelerationStructureMemoryRequirementsNV(
            VkDevice vulkanLogicalDevice,
            VkAccelerationStructureMemoryRequirementsInfoNV vkAccelerationStructureMemoryRequirementsInfoNV,
            VkMemoryRequirements2KHR vkMemoryRequirements2KHR)
    {
        nativeFunctionsProxyLibrary.vkGetAccelerationStructureMemoryRequirementsNV(
                vulkanLogicalDevice,
                vkAccelerationStructureMemoryRequirementsInfoNV,
                vkMemoryRequirements2KHR);
    }
    
    public static void vkGetAccelerationStructureScratchMemoryRequirementsNVX(
            VkDevice vulkanLogicalDevice,
            VkAccelerationStructureMemoryRequirementsInfoNV vkAccelerationStructureMemoryRequirementsInfoNVX,
            VkMemoryRequirements2KHR vkMemoryRequirements2KHR)
    {
        nativeFunctionsProxyLibrary.vkGetAccelerationStructureScratchMemoryRequirementsNVX(
                vulkanLogicalDevice,
                vkAccelerationStructureMemoryRequirementsInfoNVX,
                vkMemoryRequirements2KHR);

    }
    
    public static void vkGetBufferMemoryRequirements(
            VkDevice vulkanLogicalDevice,
            VkBuffer vkBuffer,
            VkMemoryRequirements vkMemoryRequirements)
    {
        nativeFunctionsProxyLibrary.vkGetBufferMemoryRequirements(
                vulkanLogicalDevice,
                vkBuffer,
                vkMemoryRequirements);
    }
    
    public static void vkGetPhysicalDeviceMemoryProperties(
            VkPhysicalDevice vulkanPhysicalDevice,
            VkPhysicalDeviceMemoryProperties vkPhysicalDeviceMemoryProperties)
    {
        nativeFunctionsProxyLibrary.vkGetPhysicalDeviceMemoryProperties(
                vulkanPhysicalDevice,
                vkPhysicalDeviceMemoryProperties);
    }
    
    /**
     * TODO this method signature may have issues...
     * @param vulkanLogicalDevice
     * @param pipeline
     * @param firstGroup
     * @param shaderCount
     * @param data
     * @return
     */
    public static VkResult vkGetRayTracingShaderHandlesNV(
            VkDevice vulkanLogicalDevice,
            VkPipeline  pipeline,
            int firstGroup,
            int shaderCount,
            Collection<VkShaderModule> data)
    {
        return nativeFunctionsProxyLibrary.vkGetRayTracingShaderHandlesNV(
                vulkanLogicalDevice,
                pipeline,
                firstGroup,
                shaderCount,
                data);
    }
    
    public static VkResult vkBindAccelerationStructureMemoryKHR(
            VkDevice vulkanLogicalDevice,
            Collection<VkBindAccelerationStructureMemoryInfoKHR> bindInfos)
    {
        return nativeFunctionsProxyLibrary.vkBindAccelerationStructureMemoryKHR(
                vulkanLogicalDevice,
                bindInfos);
    }
    
    public static VkResult vkBindAccelerationStructureMemoryNV(
            VkDevice vulkanLogicalDevice,
            Collection<VkBindAccelerationStructureMemoryInfoKHR> bindInfos)
    {
        return nativeFunctionsProxyLibrary.vkBindAccelerationStructureMemoryNV(
                vulkanLogicalDevice,
                bindInfos);
    }
    
    public static VkResult vkBindBufferMemory(
            VkDevice vulkanLogicalDevice,
            VkBuffer vkBuffer,
            VkDeviceMemory vkDeviceMemory,
            long memoryOffset)
    {
        return nativeFunctionsProxyLibrary.vkBindBufferMemory(
                vulkanLogicalDevice,
                vkBuffer,
                vkDeviceMemory,
                memoryOffset);
    }
    
    public static VkResult vkMapMemory(
            VkDevice vulkanLogicalDevice,
            VkDeviceMemory vkDeviceMemory,
            long offset,
            long size,
            EnumSet<VkMemoryMapFlagBits> flags,
            MappedMemoryPointer pData)
    {
        return nativeFunctionsProxyLibrary.vkMapMemory(
                vulkanLogicalDevice,
                vkDeviceMemory,
                offset,
                size,
                flags,
                pData);
    }
    
    public static void vkUnmapMemory(
            VkDevice vulkanLogicalDevice,
            VkDeviceMemory vkDeviceMemory)
    {
        nativeFunctionsProxyLibrary.vkUnmapMemory(
                vulkanLogicalDevice,
                vkDeviceMemory);
    }
    
    public static void vkCmdBindVertexBuffers(
            VkCommandBuffer vkCommandBuffer,
            int firstBinding,
            Collection<VkBuffer> vkBufferCollection,
            long[] offsets)
    {
        nativeFunctionsProxyLibrary.vkCmdBindVertexBuffers(
                vkCommandBuffer,
                firstBinding,
                vkBufferCollection,
                offsets);
    }
    
    public static void vkDestroyAccelerationStructureKHR(
            VkDevice vkDevice,
            VkAccelerationStructureKHR accelerationStructure,
            VkAllocationCallbacks alternateAllocator)
    {
        nativeFunctionsProxyLibrary.vkDestroyAccelerationStructureKHR(
                vkDevice,
                accelerationStructure,
                alternateAllocator);
    }
    
    public static void vkDestroyAccelerationStructureNV(
            VkDevice vkDevice,
            VkAccelerationStructureKHR accelerationStructure,
            VkAllocationCallbacks alternateAllocator)
    {
        nativeFunctionsProxyLibrary.vkDestroyAccelerationStructureNV(
                vkDevice,
                accelerationStructure,
                alternateAllocator);
    }
    
    public static void vkDestroyBuffer(
            VkDevice vkDevice,
            VkBuffer vkBuffer,
            VkAllocationCallbacks alternateAllocator)
    {
        nativeFunctionsProxyLibrary.vkDestroyBuffer(
                vkDevice,
                vkBuffer,
                alternateAllocator);
    }
    
    public static void vkFreeMemory(
            VkDevice vkDevice,
            VkDeviceMemory vkDeviceMemory,
            VkAllocationCallbacks alternateAllocator)
    {
        nativeFunctionsProxyLibrary.vkFreeMemory(
                vkDevice,
                vkDeviceMemory,
                alternateAllocator);
    }
    
    public static void vkCmdBindIndexBuffer(
            VkCommandBuffer vkCommandBuffer,
            VkBuffer vkBuffer,
            long offset,
            VkIndexType vkIndexType)
    {
        nativeFunctionsProxyLibrary.vkCmdBindIndexBuffer(
                vkCommandBuffer,
                vkBuffer,
                offset,
                vkIndexType);
    }
    
    public static void vkCmdBuildAccelerationStructureNV(
            VkCommandBuffer vkCommandBuffer,
            VkAccelerationStructureInfoNV info,
            VkBuffer instanceData,
            long instanceOffset,
            boolean update,
            VkAccelerationStructureKHR dst,
            VkAccelerationStructureKHR src,
            VkBuffer scratch,
            long scratchOffset)
    {
        nativeFunctionsProxyLibrary.vkCmdBuildAccelerationStructureNV(
                vkCommandBuffer,
                info,
                instanceData,
                instanceOffset,
                update,
                dst,
                src,
                scratch,
                scratchOffset);
    }
    
    public static void vkCmdCopyAccelerationStructureNV(
            VkCommandBuffer vkCommandBuffer,
            VkAccelerationStructureKHR dst,
            VkAccelerationStructureKHR src,
            VkCopyAccelerationStructureModeKHR mode)
    {
        nativeFunctionsProxyLibrary.vkCmdCopyAccelerationStructureNV(
                vkCommandBuffer,
                dst,
                src,
                mode);
    }
    
    public static void vkCmdCopyBuffer(
            VkCommandBuffer vkCommandBuffer,
            VkBuffer srcBuffer,
            VkBuffer dstBuffer,
            Collection<VkBufferCopy> vkBufferCopyCollection)
    {
        nativeFunctionsProxyLibrary.vkCmdCopyBuffer(
                vkCommandBuffer,
                srcBuffer,
                dstBuffer,
                vkBufferCopyCollection);
    }
    
    /**
     * This is a convenience method for <code>vkCmdCopyBuffer</code>
     * that allows it to be called without having to create a
     * <code>Collection</code> of <code>VkBufferCopy</code>s.
     * @param vkCommandBuffer
     * @param srcBuffer
     * @param dstBuffer
     * @param copyRegion
     */
    public static void vkCmdCopyBuffer(
            VkCommandBuffer vkCommandBuffer,
            VkBuffer srcBuffer,
            VkBuffer dstBuffer,
            VkBufferCopy copyRegion)
    {
        Collection<VkBufferCopy> copyRegionCollection = new LinkedList<VkBufferCopy>();
        copyRegionCollection.add(copyRegion);

        nativeFunctionsProxyLibrary.vkCmdCopyBuffer(
                vkCommandBuffer,
                srcBuffer,
                dstBuffer,
                copyRegionCollection);
    }
    
    public static void vkCmdCopyBufferToImage(
            VkCommandBuffer vkCommandBuffer,
            VkBuffer srcBuffer,
            VkImage dstImage,
            VkImageLayout dstImageLayout,
            Collection<VkBufferImageCopy> regions)
    {
        nativeFunctionsProxyLibrary.vkCmdCopyBufferToImage(
                vkCommandBuffer,
                srcBuffer,
                dstImage,
                dstImageLayout,
                regions);
    }
    
    public static void vkCmdDrawIndexed(
            VkCommandBuffer vkCommandBuffer,
            int indexCount,
            int instanceCount,
            int firstIndex,
            int vertexOffset,
            int firstInstance)
    {
        nativeFunctionsProxyLibrary.vkCmdDrawIndexed(
                vkCommandBuffer,
                indexCount,
                instanceCount,
                firstIndex,
                vertexOffset,
                firstInstance);
    }
    
    public static void vkCmdDrawMeshTasksNV(
            VkCommandBuffer vkCommandBuffer,
            int taskCount,
            int firstTask)
    {
        nativeFunctionsProxyLibrary.vkCmdDrawMeshTasksNV(
                vkCommandBuffer,
                taskCount,
                firstTask);
    
    }
    
    public static void vkCmdDrawMeshTasksIndirectNV(
            VkCommandBuffer vkCommandBuffer,
            VkBuffer buffer,
            long offset,
            int drawCount,
            int stride)
    {
        nativeFunctionsProxyLibrary.vkCmdDrawMeshTasksIndirectNV(
                vkCommandBuffer,
                buffer,
                offset,
                drawCount,
                stride);
    
    }
    
    public static void vkCmdDrawMeshTasksIndirectCountNV(
            VkCommandBuffer vkCommandBuffer,
            VkBuffer buffer,
            long offset,
            VkBuffer countBuffer,
            long countBufferOffset,
            int maxDrawCount,
            int stride)
    {
        nativeFunctionsProxyLibrary.vkCmdDrawMeshTasksIndirectCountNV(
                vkCommandBuffer,
                buffer,
                offset,
                countBuffer,
                countBufferOffset,
                maxDrawCount,
                stride);
    }
    
    public static void vkCmdSetCheckpointNV(
            VkCommandBuffer vkCommandBuffer,
            CheckpointMarker checkpointMarker)
    {
        nativeFunctionsProxyLibrary.vkCmdSetCheckpointNV(
                vkCommandBuffer,
                checkpointMarker);
    }
    
    
    public static void vkCmdSetExclusiveScissorNV(
            VkCommandBuffer vkCommandBuffer,
            int firstExclusiveScissor,
            Collection<VkRect2D> exclusiveScissors)
    {
        nativeFunctionsProxyLibrary.vkCmdSetExclusiveScissorNV(
                vkCommandBuffer,
                firstExclusiveScissor,
                exclusiveScissors);
    }
    
    public static void vkCmdTraceRaysNV(
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
            int depth)
    {
        nativeFunctionsProxyLibrary.vkCmdTraceRaysNV(
                vkCommandBuffer,
                raygenShaderBindingTableBuffer,
                raygenShaderBindingOffset,
                missShaderBindingTableBuffer,
                missShaderBindingOffset,
                missShaderBindingStride,
                hitShaderBindingTableBuffer,
                hitShaderBindingOffset,
                hitShaderBindingStride,
                callableShaderBindingTableBuffer,
                callableShaderBindingOffset,
                callableShaderBindingStride,
                width,
                height,
                depth);
    }
    
    public static VkResult vkCreateDescriptorSetLayout(
            VkDevice vulkanLogicalDevice,
            VkDescriptorSetLayoutCreateInfo vkDescriptorSetLayoutCreateInfo,
            VkAllocationCallbacks alternateAllocator,
            VkDescriptorSetLayout vkDescriptorSetLayout)
    {
        return nativeFunctionsProxyLibrary.vkCreateDescriptorSetLayout(
                vulkanLogicalDevice,
                vkDescriptorSetLayoutCreateInfo,
                alternateAllocator,
                vkDescriptorSetLayout);
    }
    
    public static VkResult vkCreateDescriptorPool(
            VkDevice vulkanLogicalDevice,
            VkDescriptorPoolCreateInfo vkDescriptorPoolCreateInfo,
            VkAllocationCallbacks alternateAllocator,
            VkDescriptorPool vkDescriptorPool)
    {
        return nativeFunctionsProxyLibrary.vkCreateDescriptorPool(
                vulkanLogicalDevice,
                vkDescriptorPoolCreateInfo,
                alternateAllocator,
                vkDescriptorPool);
    }
    
    public static void vkUpdateDescriptorSets(
            VkDevice vulkanLogicalDevice,
            Collection<VkWriteDescriptorSet> descriptorWrites,
            Collection<VkCopyDescriptorSet> descriptorCopies)
    {
        nativeFunctionsProxyLibrary.vkUpdateDescriptorSets(
                vulkanLogicalDevice,
                descriptorWrites,
                descriptorCopies);
    }
    
    public static void vkCmdBindDescriptorSets(
            VkCommandBuffer vkCommandBuffer,
            VkPipelineBindPoint vkPipelineBindPoint,
            VkPipelineLayout vkPipelineLayout,
            int firstSet,
            Collection<VkDescriptorSet> descriptorSets,
            int[] dynamicOffsets)
    {
        nativeFunctionsProxyLibrary.vkCmdBindDescriptorSets(
                vkCommandBuffer,
                vkPipelineBindPoint,
                vkPipelineLayout,
                firstSet,
                descriptorSets,
                dynamicOffsets);
    }
    
    public static void vkDestroyDescriptorPool(
            VkDevice vkDevice,
            VkDescriptorPool vkDescriptorPool,
            VkAllocationCallbacks alternateAllocator)
    {
        nativeFunctionsProxyLibrary.vkDestroyDescriptorPool(
                vkDevice,
                vkDescriptorPool,
                alternateAllocator);
    }
    
    public static void vkDestroyDescriptorSetLayout(
            VkDevice vkDevice,
            VkDescriptorSetLayout vkDescriptorSetLayout,
            VkAllocationCallbacks alternateAllocator)
    {
        nativeFunctionsProxyLibrary.vkDestroyDescriptorSetLayout(
                vkDevice,
                vkDescriptorSetLayout,
                alternateAllocator);
    }
    
    public static VkResult vkBindImageMemory(
            VkDevice vkDevice,
            VkImage vkImage,
            VkDeviceMemory vkDeviceMemory,
            long vkDeviceSize)
    {
        return nativeFunctionsProxyLibrary.vkBindImageMemory(
                vkDevice,
                vkImage,
                vkDeviceMemory,
                vkDeviceSize);
    }
    
    public static VkResult vkCreateImage(
            VkDevice vulkanLogicalDevice,
            VkImageCreateInfo vkImageCreateInfo,
            VkAllocationCallbacks alternateAllocator,
            VkImage vkImage)
    {
        return nativeFunctionsProxyLibrary.vkCreateImage(
                vulkanLogicalDevice,
                vkImageCreateInfo,
                alternateAllocator,
                vkImage);
    }
    
    public static void vkGetImageMemoryRequirements(
            VkDevice vulkanLogicalDevice,
            VkImage vkImage,
            VkMemoryRequirements vkMemoryRequirements)
    {
        nativeFunctionsProxyLibrary.vkGetImageMemoryRequirements(
                vulkanLogicalDevice,
                vkImage,
                vkMemoryRequirements);
    }
    
    public static void vkCmdPipelineBarrier(
            VkCommandBuffer vkCommandBuffer,
            EnumSet<VkPipelineStageFlagBits> srcStageMask,
            EnumSet<VkPipelineStageFlagBits> dstStageMask,
            EnumSet<VkDependencyFlagBits> dependencyFlags,
            Collection<VkMemoryBarrier> memoryBarriers,
            Collection<VkBufferMemoryBarrier> bufferMemoryBarriers,
            Collection<VkImageMemoryBarrier> imageMemoryBarriers)
    {
        nativeFunctionsProxyLibrary.vkCmdPipelineBarrier(
                vkCommandBuffer,
                srcStageMask,
                dstStageMask,
                dependencyFlags,
                memoryBarriers,
                bufferMemoryBarriers,
                imageMemoryBarriers);
    }
    
    public static VkResult vkCreateSampler(
            VkDevice vulkanLogicalDevice,
            VkSamplerCreateInfo vkSamplerCreateInfo,
            VkAllocationCallbacks alternateAllocator,
            VkSampler vkSampler)
    {
        return nativeFunctionsProxyLibrary.vkCreateSampler(
                vulkanLogicalDevice,
                vkSamplerCreateInfo,
                alternateAllocator,
                vkSampler);
    }
    
    public static void vkDestroySampler(
            VkDevice vulkanLogicalDevice,
            VkSampler samplerHandle,
            VkAllocationCallbacks alternateAllocator)
    {
        nativeFunctionsProxyLibrary.vkDestroySampler(
                vulkanLogicalDevice,
                samplerHandle,
                alternateAllocator);
    }
    
    /**
     * Retrieve information on the most recent diagnostic checkpoints that were executed by the device.
     * <p>
     * If the device encounters an error during execution, the implementation will return a 
     * <code>VK_ERROR_DEVICE_LOST</code> error to the application at a certain point during 
     * host execution. When this happens, the application can call this function to 
     * retrieve information on the most recent diagnostic checkpoints that were executed 
     * by the device.
     * 
     * @param queue the <code>VkQueue</code> object the caller would like to retrieve checkpoint data for
     * @param checkpointData must not be <code>null</code>
     */
    public static void vkGetQueueCheckpointDataNV(
            VkQueue queue,
            Collection<VkCheckpointDataNV> checkpointData)
    {
        if (checkpointData == null)
        {
            throw new IllegalArgumentException("checkpointData argument must not be null.");
        }
        
        nativeFunctionsProxyLibrary.vkGetQueueCheckpointDataNV(
                queue,
                checkpointData);
    }
    
    public static void vkGetPhysicalDeviceFormatProperties(
            VkPhysicalDevice vulkanPhysicalDevice,
            VkFormat format,
            VkFormatProperties formatProperties)
    {
        nativeFunctionsProxyLibrary.vkGetPhysicalDeviceFormatProperties(
                vulkanPhysicalDevice,
                format,
                formatProperties);
    }
    
    public static VkResult vkQueueWaitIdle(
            VkQueue vkQueue)
    {
        return nativeFunctionsProxyLibrary.vkQueueWaitIdle(
                vkQueue);
    }
    
    public static void vkCmdBindTransformFeedbackBuffersEXT(
            VkCommandBuffer commandBuffer,
            int firstBinding,
            Collection<VkBuffer> buffers,
            long[] offsets,
            long[] sizes)
    {
        if (buffers.size() != offsets.length)
        {
            throw new IllegalArgumentException("buffers and offsets must have the same number of elements.");
        }
        
        if (sizes != null &&
            sizes.length != offsets.length)
        {
            throw new IllegalArgumentException("buffers, offsets, and sizes must have the same number of elements.");
        }
        
        nativeFunctionsProxyLibrary.vkCmdBindTransformFeedbackBuffersEXT(
                commandBuffer,
                firstBinding,
                buffers,
                offsets,
                sizes);
    }
    
    public static void vkCmdBeginTransformFeedbackEXT(
            VkCommandBuffer commandBuffer,
            int firstCounterBuffer,
            Collection<VkBuffer> counterBuffers,
            long[] counterBufferOffsets)
    {
        nativeFunctionsProxyLibrary.vkCmdBeginTransformFeedbackEXT(
                commandBuffer,
                firstCounterBuffer,
                counterBuffers,
                counterBufferOffsets);
    }
    
    public static void vkCmdEndTransformFeedbackEXT(
            VkCommandBuffer commandBuffer,
            int firstCounterBuffer,
            Collection<VkBuffer> counterBuffers,
            long[] counterBufferOffsets)
    {
        if (counterBuffers.size() != counterBufferOffsets.length)
        {
            throw new IllegalArgumentException("counterBuffers and counterBufferOffsets MUST have the same number of elements.");
        }
        
        nativeFunctionsProxyLibrary.vkCmdEndTransformFeedbackEXT(
                commandBuffer,
                firstCounterBuffer,
                counterBuffers,
                counterBufferOffsets);
    }
    
    public static void vkCmdBeginQueryIndexedEXT(
            VkCommandBuffer commandBuffer,
            VkQueryPool queryPool,
            int query,
            EnumSet<VkQueryControlFlagBits> flags,
            int index)
    {
        nativeFunctionsProxyLibrary.vkCmdBeginQueryIndexedEXT(
                commandBuffer,
                queryPool,
                query,
                flags,
                index);
    }
    
    public static void vkCmdEndQueryIndexedEXT(
            VkCommandBuffer commandBuffer,
            VkQueryPool queryPool,
            int query,
            int index)
    {
        nativeFunctionsProxyLibrary.vkCmdEndQueryIndexedEXT(
                commandBuffer,
                queryPool,
                query,
                index);
    }
    
    public static void vkCmdDrawIndirectByteCountEXT(
            VkCommandBuffer commandBuffer,
            int instanceCount,
            int firstInstance,
            VkBuffer counterBuffer,
            long counterBufferOffset,
            int counterOffset,
            int vertexStride)
    {
        nativeFunctionsProxyLibrary.vkCmdDrawIndirectByteCountEXT(
                commandBuffer,
                instanceCount,
                firstInstance,
                counterBuffer,
                counterBufferOffset,
                counterOffset,
                vertexStride);
    }
    
    public static VkResult vkGetImageDrmFormatModifierPropertiesEXT(
            VkDevice device,
            VkImage image,
            VkImageDrmFormatModifierPropertiesEXT properties)
    {
        return nativeFunctionsProxyLibrary.vkGetImageDrmFormatModifierPropertiesEXT(
                device,
                image,
                properties);
    }
    
    public static VkResult vkGetRayTracingShaderGroupHandlesKHR(
            VkDevice device,
            VkPipeline pipeline,
            int firstGroup,
            int groupCount,
            long dataSize,
            byte[] data)
    {
        return nativeFunctionsProxyLibrary.vkGetRayTracingShaderGroupHandlesKHR(
                device,
                pipeline,
                firstGroup,
                groupCount,
                dataSize,
                data);
    }
    
    public static VkResult vkGetRayTracingShaderGroupHandlesNV(
            VkDevice device,
            VkPipeline pipeline,
            int firstGroup,
            int groupCount,
            long dataSize,
            byte[] data)
    {
        return nativeFunctionsProxyLibrary.vkGetRayTracingShaderGroupHandlesNV(
                device,
                pipeline,
                firstGroup,
                groupCount,
                dataSize,
                data);
    }
    
    public static VkResult vkGetPhysicalDeviceCalibrateableTimeDomainsEXT(
            VkPhysicalDevice physicalDevice,
            Collection<VkTimeDomainEXT> timeDomains)
    {
        return nativeFunctionsProxyLibrary.vkGetPhysicalDeviceCalibrateableTimeDomainsEXT(
                physicalDevice,
                timeDomains);
    }
    
    public static VkDeviceAddress vkGetBufferDeviceAddress(
            VkDevice vulkanLogicalDevice,
            VkBufferDeviceAddressInfo info)
    {
        return nativeFunctionsProxyLibrary.vkGetBufferDeviceAddress(
                vulkanLogicalDevice,
                info);
    }
    
    public static VkResult vkGetPhysicalDeviceCooperativeMatrixPropertiesNV(
            VkPhysicalDevice                            physicalDevice,
            Collection<VkCooperativeMatrixPropertiesNV> properties)
    {
        if (properties == null)
        {
            throw new IllegalArgumentException("properties argument must not be null.");
        }
        
        return nativeFunctionsProxyLibrary.vkGetPhysicalDeviceCooperativeMatrixPropertiesNV(
                physicalDevice,
                properties);
    }
    
    public static  VkResult vkBindBufferMemory2(
            VkDevice vulkanLogicalDevice,
            Collection<VkBindBufferMemoryInfo> bindInfos)
    {
        return nativeFunctionsProxyLibrary.vkBindBufferMemory2(
                vulkanLogicalDevice,
                bindInfos);
    }
    
    public static  VkResult vkBindBufferMemory2KHR(
            VkDevice vulkanLogicalDevice,
            Collection<VkBindBufferMemoryInfo> bindInfos)
    {
        return nativeFunctionsProxyLibrary.vkBindBufferMemory2KHR(
                vulkanLogicalDevice,
                bindInfos);
    }
    
    public static  VkResult vkBindImageMemory2(
            VkDevice vulkanLogicalDevice,
            Collection<VkBindImageMemoryInfo> bindInfos)
    {
        return nativeFunctionsProxyLibrary.vkBindImageMemory2(
                vulkanLogicalDevice,
                bindInfos);
    }
    
    public static  VkResult vkBindImageMemory2KHR(
            VkDevice vulkanLogicalDevice,
            Collection<VkBindImageMemoryInfo> bindInfos)
    {
        return nativeFunctionsProxyLibrary.vkBindImageMemory2KHR(
                vulkanLogicalDevice,
                bindInfos);
    }
    
    public static VkResult vkCreateDebugUtilsMessengerEXT(
            VkInstance vkInstance,
            VkDebugUtilsMessengerCreateInfoEXT createInfo,
            VkAllocationCallbacks alternateAllocator,
            VkDebugUtilsMessengerEXT messenger)
    {
        return nativeFunctionsProxyLibrary.vkCreateDebugUtilsMessengerEXT(
                vkInstance,
                createInfo,
                alternateAllocator,
                messenger);
    }
    
    public static VkResult vkSetDebugUtilsObjectNameEXT(
            VkDevice device,
            VkDebugUtilsObjectNameInfoEXT nameInfo)
    {
        return nativeFunctionsProxyLibrary.vkSetDebugUtilsObjectNameEXT(
                device,
                nameInfo);
    }
    
    public static VkResult vkSetDebugUtilsObjectTagEXT(
            VkDevice device,
            VkDebugUtilsObjectTagInfoEXT tagInfo)
    {
        return nativeFunctionsProxyLibrary.vkSetDebugUtilsObjectTagEXT(
                device,
                tagInfo);
    }
    
    public static void vkQueueBeginDebugUtilsLabelEXT(
            VkQueue queue,
            VkDebugUtilsLabelEXTlabelInfo labelInfo)
    {
        nativeFunctionsProxyLibrary.vkQueueBeginDebugUtilsLabelEXT(
                queue,
                labelInfo);
    }
    
    public static void vkQueueEndDebugUtilsLabelEXT(
            VkQueue                                     queue)
    {
        nativeFunctionsProxyLibrary.vkQueueEndDebugUtilsLabelEXT(
                queue);
    }
    
    public static void vkQueueInsertDebugUtilsLabelEXT(
            VkQueue queue,
            VkDebugUtilsLabelEXT labelInfo)
    {
        nativeFunctionsProxyLibrary.vkQueueInsertDebugUtilsLabelEXT(
                queue,
                labelInfo);
    }
    
    public static void vkCmdBeginDebugUtilsLabelEXT(
            VkCommandBuffer commandBuffer,
            VkDebugUtilsLabelEXT labelInfo)
    {
        nativeFunctionsProxyLibrary.vkCmdBeginDebugUtilsLabelEXT(
                commandBuffer,
                labelInfo);
    }
    
    public static void vkCmdEndDebugUtilsLabelEXT(
            VkCommandBuffer commandBuffer)
    {
        nativeFunctionsProxyLibrary.vkCmdEndDebugUtilsLabelEXT(
                commandBuffer);
    }
    
    public static void vkCmdInsertDebugUtilsLabelEXT(
            VkCommandBuffer commandBuffer,
            VkDebugUtilsLabelEXT labelInfo)
    {
        nativeFunctionsProxyLibrary.vkCmdInsertDebugUtilsLabelEXT(
                commandBuffer,
                labelInfo);
    }
    
    public static void vkDestroyDebugUtilsMessengerEXT(
            VkInstance instance,
            VkDebugUtilsMessengerEXT messenger,
            VkAllocationCallbacks alternateAllocator)
    {
        nativeFunctionsProxyLibrary.vkDestroyDebugUtilsMessengerEXT(
                instance,
                messenger,
                alternateAllocator);
    }
    
    public static void vkSubmitDebugUtilsMessageEXT(
            VkInstance instance,
            VkDebugUtilsMessageSeverityFlagBitsEXT messageSeverity,
            EnumSet<VkDebugUtilsMessageTypeFlagBitsEXT> messageTypes,
            VkDebugUtilsMessengerCallbackDataEXT callbackData)
    {
        nativeFunctionsProxyLibrary.vkSubmitDebugUtilsMessageEXT(
                instance,
                messageSeverity,
                messageTypes,
                callbackData);
    }
    
    public static VkResult vkCreateDescriptorUpdateTemplate(
            VkDevice device,
            VkDescriptorUpdateTemplateCreateInfo createInfo,
            VkAllocationCallbacks alternateAllocator,
            VkDescriptorUpdateTemplate vkDescriptorUpdateTemplateHandle)
    {
        return nativeFunctionsProxyLibrary.vkCreateDescriptorUpdateTemplate(
                device,
                createInfo,
                alternateAllocator,
                vkDescriptorUpdateTemplateHandle);
    }
    
    public static VkResult vkCreateDescriptorUpdateTemplateKHR(
            VkDevice device,
            VkDescriptorUpdateTemplateCreateInfo createInfo,
            VkAllocationCallbacks alternateAllocator,
            VkDescriptorUpdateTemplate vkDescriptorUpdateTemplateHandle)
    {
        return nativeFunctionsProxyLibrary.vkCreateDescriptorUpdateTemplateKHR(
                device,
                createInfo,
                alternateAllocator,
                vkDescriptorUpdateTemplateHandle);
    }
    
    public static VkResult vkCreateDisplayModeKHR(
            VkPhysicalDevice physicalDevice,
            VkDisplayKHR display,
            VkDisplayModeCreateInfoKHR createInfo,
            VkAllocationCallbacks alternateAllocator,
            VkDisplayModeKHR vkDisplayModeKHRHandle)
    {
        return nativeFunctionsProxyLibrary.vkCreateDisplayModeKHR(
                physicalDevice,
                display,
                createInfo,
                alternateAllocator,
                vkDisplayModeKHRHandle);
    }
    
    public static VkResult vkCreateDisplayPlaneSurfaceKHR(
            VkInstance instance,
            VkDisplaySurfaceCreateInfoKHR createInfo,
            VkAllocationCallbacks alternateAllocator,
            VkSurfaceKHR surface)
    {
        return nativeFunctionsProxyLibrary.vkCreateDisplayPlaneSurfaceKHR(
                instance,
                createInfo,
                alternateAllocator,
                surface);
    }
    
    public static VkResult vkGetPhysicalDeviceSurfaceCapabilities2KHR(
            VkPhysicalDevice physicalDevice,
            VkPhysicalDeviceSurfaceInfo2KHR     surfaceInfo,
            VkSurfaceCapabilities2KHR surfaceCapabilities)
    {
        return nativeFunctionsProxyLibrary.vkGetPhysicalDeviceSurfaceCapabilities2KHR(
                physicalDevice,
                surfaceInfo,
                surfaceCapabilities);
    }
    
    public static VkResult vkGetPhysicalDeviceImageFormatProperties(
            VkPhysicalDevice physicalDevice,
            VkFormat format,
            VkImageType type,
            VkImageTiling tiling,
            EnumSet<VkImageUsageFlagBits> usage,
            EnumSet<VkImageCreateFlagBits> flags,
            VkImageFormatProperties imageFormatProperties)
    {
        return nativeFunctionsProxyLibrary.vkGetPhysicalDeviceImageFormatProperties(
                physicalDevice,
                format,
                type,
                tiling,
                usage,
                flags,
                imageFormatProperties);
    }
    
    public static VkResult vkGetPhysicalDeviceImageFormatProperties2(
            VkPhysicalDevice physicalDevice,
            VkPhysicalDeviceImageFormatInfo2 imageFormatInfo,
            VkImageFormatProperties2 imageFormatProperties)
    {
        return nativeFunctionsProxyLibrary.vkGetPhysicalDeviceImageFormatProperties2(
                physicalDevice,
                imageFormatInfo,
                imageFormatProperties);
    }
    
    public static VkResult vkGetPhysicalDeviceImageFormatProperties2KHR(
            VkPhysicalDevice physicalDevice,
            VkPhysicalDeviceImageFormatInfo2 imageFormatInfo,
            VkImageFormatProperties2 imageFormatProperties)
    {
        return nativeFunctionsProxyLibrary.vkGetPhysicalDeviceImageFormatProperties2(
                physicalDevice,
                imageFormatInfo,
                imageFormatProperties);
    }
    
    public static VkResult vkGetPipelineExecutablePropertiesKHR(
            VkDevice device,
            VkPipelineInfoKHR pipelineInfo,
            Collection<VkPipelineExecutablePropertiesKHR> properties)
    {
        if (properties == null)
        {
            throw new IllegalArgumentException("The properties argument may not be null.  I should probably be an empty Collection.");
        }
        
        return nativeFunctionsProxyLibrary.vkGetPipelineExecutablePropertiesKHR(
                device,
                pipelineInfo,
                properties);
    }
    
    public static VkResult vkGetPipelineExecutableStatisticsKHR(
            VkDevice device,
            VkPipelineExecutableInfoKHR executableInfo,
            Collection<VkPipelineExecutableStatisticKHR> statistics)
    {
        if (statistics == null)
        {
            throw new IllegalArgumentException("The statistics argument may not be null.  I should probably be an empty Collection.");
        }
        
        return nativeFunctionsProxyLibrary.vkGetPipelineExecutableStatisticsKHR(
                device,
                executableInfo,
                statistics);
    }
    
    public static VkResult vkGetPipelineExecutableInternalRepresentationsKHR(
            VkDevice device,
            VkPipelineExecutableInfoKHR executableInfo,
            Collection<VkPipelineExecutableInternalRepresentationKHR> internalRepresentations)
    {
        return nativeFunctionsProxyLibrary.vkGetPipelineExecutableInternalRepresentationsKHR(
                device,
                executableInfo,
                internalRepresentations);
    }
    
    public static VkResult vkGetDeviceGroupPresentCapabilitiesKHR(
            VkDevice device,
            VkDeviceGroupPresentCapabilitiesKHR deviceGroupPresentCapabilities)
    {
        return nativeFunctionsProxyLibrary.vkGetDeviceGroupPresentCapabilitiesKHR(
                device,
                deviceGroupPresentCapabilities);
    }
    
    public static VkResult vkGetDeviceGroupSurfacePresentModes2EXT(
            VkDevice device,
            VkPhysicalDeviceSurfaceInfo2KHR surfaceInfo,
            EnumSet<VkDeviceGroupPresentModeFlagBitsKHR> modes)
    {
        return nativeFunctionsProxyLibrary.vkGetDeviceGroupSurfacePresentModes2EXT(
                device,
                surfaceInfo,
                modes);
    }
    
    public static VkResult vkGetDeviceGroupSurfacePresentModesKHR(
            VkDevice device,
            VkSurfaceKHR surface,
            EnumSet<VkDeviceGroupPresentModeFlagBitsKHR> modes)
    {
        return nativeFunctionsProxyLibrary.vkGetDeviceGroupSurfacePresentModesKHR(
                device,
                surface,
                modes);
    }
    
    /**
     * Set the stipple factor and pattern.
     * <p>
     * Note: The bound graphics pipeline <b>must</b> have been created with the 
     * <code>VK_DYNAMIC_STATE_LINE_STIPPLE_EXT</code> dynamic state enabled in 
     * order to use this method.
     * 
     * @param commandBuffer
     * @param lineStippleFactor must be in the range of 1-256.
     * @param lineStipplePattern
     */
    public static void vkCmdSetLineStippleEXT(
            VkCommandBuffer commandBuffer,
            int lineStippleFactor,
            short lineStipplePattern)
    {
        nativeFunctionsProxyLibrary.vkCmdSetLineStippleEXT(
                commandBuffer,
                lineStippleFactor,
                lineStipplePattern);
    }
    
    public static VkResult vkCreateHeadlessSurfaceEXT(
            VkInstance instance,
            VkHeadlessSurfaceCreateInfoEXT createInfo,
            VkAllocationCallbacks allocator,
            VkSurfaceKHR surface)
    {
        return nativeFunctionsProxyLibrary.vkCreateHeadlessSurfaceEXT(
                instance,
                createInfo,
                allocator,
                surface);
    }
    
    public static VkResult vkInitializePerformanceApiINTEL(
            VkDevice device,
            VkInitializePerformanceApiInfoINTEL initializeInfo)
    {
        return nativeFunctionsProxyLibrary.vkInitializePerformanceApiINTEL(
                device,
                initializeInfo);
    }
    
    public static void vkUninitializePerformanceApiINTEL(
            VkDevice device)
    {
        nativeFunctionsProxyLibrary.vkUninitializePerformanceApiINTEL(
                device);
    }
    
    public static VkResult vkCmdSetPerformanceMarkerINTEL(
            VkCommandBuffer commandBuffer,
            VkPerformanceMarkerInfoINTEL markerInfo)
    {
        return nativeFunctionsProxyLibrary.vkCmdSetPerformanceMarkerINTEL(
                commandBuffer,
                markerInfo);
    }
    
    public static VkResult vkCmdSetPerformanceOverrideINTEL(
            VkCommandBuffer commandBuffer,
            VkPerformanceOverrideInfoINTEL overrideInfo)
    {
        return nativeFunctionsProxyLibrary.vkCmdSetPerformanceOverrideINTEL(
                commandBuffer,
                overrideInfo);
    }
    
    public static VkResult vkCmdSetPerformanceStreamMarkerINTEL(
            VkCommandBuffer commandBuffer,
            VkPerformanceStreamMarkerInfoINTEL markerInfo)
    {
        return nativeFunctionsProxyLibrary.vkCmdSetPerformanceStreamMarkerINTEL(
                commandBuffer,
                markerInfo);
    }
    
    public static VkResult vkAcquirePerformanceConfigurationINTEL(
            VkDevice device,
            VkPerformanceConfigurationAcquireInfoINTEL acquireInfo,
            VkPerformanceConfigurationINTEL configuration)
    {
        return nativeFunctionsProxyLibrary.vkAcquirePerformanceConfigurationINTEL(
                device,
                acquireInfo,
                configuration);
    }
    
    public static VkResult vkReleasePerformanceConfigurationINTEL(
            VkDevice device,
            VkPerformanceConfigurationINTEL configuration)
    {
        return nativeFunctionsProxyLibrary.vkReleasePerformanceConfigurationINTEL(
                device,
                configuration);
    }
    
    public static VkResult vkQueueSetPerformanceConfigurationINTEL(
            VkQueue                                     queue,
            VkPerformanceConfigurationINTEL             configuration)
    {
        return nativeFunctionsProxyLibrary.vkQueueSetPerformanceConfigurationINTEL(
                queue,
                configuration);
    }
    
    public static VkResult vkGetPerformanceParameterINTEL(
            VkDevice device,
            VkPerformanceParameterTypeINTEL parameter,
            VkPerformanceValueINTEL value)
    {
        return nativeFunctionsProxyLibrary.vkGetPerformanceParameterINTEL(
                device,
                parameter,
                value);
    }
    
    public static VkResult vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV(
            VkPhysicalDevice physicalDevice,
            Collection<VkFramebufferMixedSamplesCombinationNV> combinations)
    {
        return nativeFunctionsProxyLibrary.vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV(
                physicalDevice,
                combinations);
    }
    
    public static void vkCmdBeginQuery(
            VkCommandBuffer commandBuffer,
            VkQueryPool queryPool,
            int query,
            EnumSet<VkQueryControlFlagBits> flags)
    {
        nativeFunctionsProxyLibrary.vkCmdBeginQuery(
                commandBuffer,
                queryPool,
                query,
                flags);
    }
    
    public static void vkCmdBlitImage(
            VkCommandBuffer                             commandBuffer,
            VkImage                                     srcImage,
            VkImageLayout                               srcImageLayout,
            VkImage                                     dstImage,
            VkImageLayout                               dstImageLayout,
            Collection<VkImageBlit>                     regions,
            VkFilter                                    filter)
    {
        nativeFunctionsProxyLibrary.vkCmdBlitImage(
                commandBuffer,
                srcImage,
                srcImageLayout,
                dstImage,
                dstImageLayout,
                regions,
                filter);
    }
    
    public static void vkCmdClearAttachments(
            VkCommandBuffer commandBuffer,
            Collection<VkClearAttachment> attachments,
            Collection<VkClearRect> rects)
    {
        nativeFunctionsProxyLibrary.vkCmdClearAttachments(
                commandBuffer,
                attachments,
                rects);
    }
    
    public static void vkCmdClearColorImage(
            VkCommandBuffer commandBuffer,
            VkImage image,
            VkImageLayout imageLayout,
            VkClearColorValue color,
            Collection<VkImageSubresourceRange> ranges)
    {
        if (imageLayout != VkImageLayout.VK_IMAGE_LAYOUT_SHARED_PRESENT_KHR &&
            imageLayout != VkImageLayout.VK_IMAGE_LAYOUT_GENERAL &&
            imageLayout != VkImageLayout.VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL)
        {
            throw new IllegalArgumentException("imageLayout argument must be VK_IMAGE_LAYOUT_SHARED_PRESENT_KHR, VK_IMAGE_LAYOUT_GENERAL, or VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL.");
        }
        
        nativeFunctionsProxyLibrary.vkCmdClearColorImage(
                commandBuffer,
                image,
                imageLayout,
                color,
                ranges);
    }
    
    public static void vkCmdClearDepthStencilImage(
            VkCommandBuffer                             commandBuffer,
            VkImage                                     image,
            VkImageLayout                               imageLayout,
            VkClearDepthStencilValue depthStencil,
            Collection<VkImageSubresourceRange> ranges)
    {
        nativeFunctionsProxyLibrary.vkCmdClearDepthStencilImage(
                commandBuffer,
                image,
                imageLayout,
                depthStencil,
                ranges);
    }
    
    public static void vkCmdCopyImage(
            VkCommandBuffer commandBuffer,
            VkImage srcImage,
            VkImageLayout srcImageLayout,
            VkImage dstImage,
            VkImageLayout dstImageLayout,
            Collection<VkImageCopy> regions)
    {
        nativeFunctionsProxyLibrary.vkCmdCopyImage(
                commandBuffer,
                srcImage,
                srcImageLayout,
                dstImage,
                dstImageLayout,
                regions);
    }
    
    public static void vkCmdCopyImageToBuffer(
            VkCommandBuffer commandBuffer,
            VkImage srcImage,
            VkImageLayout srcImageLayout,
            VkBuffer dstBuffer,
            Collection<VkBufferImageCopy> regions)
    {
        nativeFunctionsProxyLibrary.vkCmdCopyImageToBuffer(
                commandBuffer,
                srcImage,
                srcImageLayout,
                dstBuffer,
                regions);
    }
    
    public static void vkCmdCopyQueryPoolResults(
            VkCommandBuffer commandBuffer,
            VkQueryPool queryPool,
            int firstQuery,
            int queryCount,
            VkBuffer dstBuffer,
            long dstOffset,
            long stride,
            EnumSet<VkQueryResultFlagBits> flags)
    {
        nativeFunctionsProxyLibrary.vkCmdCopyQueryPoolResults(
                commandBuffer,
                queryPool,
                firstQuery,
                queryCount,
                dstBuffer,
                dstOffset,
                stride,
                flags);
    }
    
    public static void vkCmdDebugMarkerBeginEXT(
            VkCommandBuffer commandBuffer,
            VkDebugMarkerMarkerInfoEXT markerInfo)
    {
        nativeFunctionsProxyLibrary.vkCmdDebugMarkerBeginEXT(
                commandBuffer,
                markerInfo);
    }
    
    public static void vkCmdDebugMarkerEndEXT(
            VkCommandBuffer commandBuffer)
    {
        nativeFunctionsProxyLibrary.vkCmdDebugMarkerEndEXT(
                commandBuffer);
    }
    
    public static void vkCmdDebugMarkerInsertEXT(
            VkCommandBuffer commandBuffer,
            VkDebugMarkerMarkerInfoEXT markerInfo)
    {
        nativeFunctionsProxyLibrary.vkCmdDebugMarkerInsertEXT(
                commandBuffer,
                markerInfo);
    }
    
    public static void vkCmdDispatch(
            VkCommandBuffer commandBuffer,
            int groupCountX,
            int groupCountY,
            int groupCountZ)
    {
        nativeFunctionsProxyLibrary.vkCmdDispatch(
                commandBuffer,
                groupCountX,
                groupCountY,
                groupCountZ);
    }
    
    public static void vkCmdDispatchBase(
            VkCommandBuffer commandBuffer,
            int baseGroupX,
            int baseGroupY,
            int baseGroupZ,
            int groupCountX,
            int groupCountY,
            int groupCountZ)
    {
        nativeFunctionsProxyLibrary.vkCmdDispatchBase(
                commandBuffer,
                baseGroupX,
                baseGroupY,
                baseGroupZ,
                groupCountX,
                groupCountY,
                groupCountZ);
    }

    public static void vkCmdDispatchBaseKHR(
            VkCommandBuffer commandBuffer,
            int baseGroupX,
            int baseGroupY,
            int baseGroupZ,
            int groupCountX,
            int groupCountY,
            int groupCountZ)
    {
        nativeFunctionsProxyLibrary.vkCmdDispatchBase(
                commandBuffer,
                baseGroupX,
                baseGroupY,
                baseGroupZ,
                groupCountX,
                groupCountY,
                groupCountZ);
    }
    
    public static void vkCmdDispatchIndirect(
            VkCommandBuffer commandBuffer,
            VkBuffer buffer,
            long offset)
    {
        nativeFunctionsProxyLibrary.vkCmdDispatchIndirect(
                commandBuffer,
                buffer,
                offset);
    }
    
    public static void vkCmdDrawIndexedIndirect(
            VkCommandBuffer commandBuffer,
            VkBuffer buffer,
            long offset,
            int drawCount,
            int stride)
    {
        nativeFunctionsProxyLibrary.vkCmdDrawIndexedIndirect(
                commandBuffer,
                buffer,
                offset,
                drawCount,
                stride);
    }
    
    public static void vkCmdDrawIndexedIndirectCountAMD(
            VkCommandBuffer commandBuffer,
            VkBuffer buffer,
            long offset,
            VkBuffer countBuffer,
            long countBufferOffset,
            int maxDrawCount,
            int stride)
    {
        nativeFunctionsProxyLibrary.vkCmdDrawIndexedIndirectCount(
                commandBuffer,
                buffer,
                offset,
                countBuffer,
                countBufferOffset,
                maxDrawCount,
                stride);
    }
    
    public static void vkCmdDrawIndexedIndirectCount(
            VkCommandBuffer commandBuffer,
            VkBuffer buffer,
            long offset,
            VkBuffer countBuffer,
            long countBufferOffset,
            int maxDrawCount,
            int stride)
    {
        nativeFunctionsProxyLibrary.vkCmdDrawIndexedIndirectCount(
                commandBuffer,
                buffer,
                offset,
                countBuffer,
                countBufferOffset,
                maxDrawCount,
                stride);
    }
    
    public static void vkCmdDrawIndirect(
            VkCommandBuffer commandBuffer,
            VkBuffer buffer,
            long offset,
            int drawCount,
            int stride)
    {
        nativeFunctionsProxyLibrary.vkCmdDrawIndirect(
                commandBuffer,
                buffer,
                offset,
                drawCount,
                stride);
    }
    
    public static void vkCmdDrawIndirectCount(
            VkCommandBuffer commandBuffer,
            VkBuffer buffer,
            long offset,
            VkBuffer countBuffer,
            long countBufferOffset,
            int maxDrawCount,
            int stride)
    {
        nativeFunctionsProxyLibrary.vkCmdDrawIndirectCount(
                commandBuffer,
                buffer,
                offset,
                countBuffer,
                countBufferOffset,
                maxDrawCount,
                stride);
    }
    
    public static void vkCmdDrawIndirectCountAMD(
            VkCommandBuffer commandBuffer,
            VkBuffer buffer,
            long offset,
            VkBuffer countBuffer,
            long countBufferOffset,
            int maxDrawCount,
            int stride)
    {
        nativeFunctionsProxyLibrary.vkCmdDrawIndirectCount(
                commandBuffer,
                buffer,
                offset,
                countBuffer,
                countBufferOffset,
                maxDrawCount,
                stride);
    }
    
    public static void vkCmdEndQuery(
            VkCommandBuffer commandBuffer,
            VkQueryPool queryPool,
            int query)
    {
        nativeFunctionsProxyLibrary.vkCmdEndQuery(
                commandBuffer,
                queryPool,
                query);
    }
    
    public static void vkCmdExecuteCommands(
            VkCommandBuffer commandBuffer,
            Collection<VkCommandBuffer> commandBuffers)
    {
        nativeFunctionsProxyLibrary.vkCmdExecuteCommands(
                commandBuffer,
                commandBuffers);
    }
    
    public static void vkCmdFillBuffer(
            VkCommandBuffer commandBuffer,
            VkBuffer dstBuffer,
            long dstOffset,
            long size,
            int data)
    {
        nativeFunctionsProxyLibrary.vkCmdFillBuffer(
                commandBuffer,
                dstBuffer,
                dstOffset,
                size,
                data);
    }
    
    public static void vkCmdNextSubpass(
            VkCommandBuffer commandBuffer,
            VkSubpassContents contents)
    {
        nativeFunctionsProxyLibrary.vkCmdNextSubpass(
                commandBuffer,
                contents);
    }
    
    public static void vkCmdPushConstants(
            VkCommandBuffer commandBuffer,
            VkPipelineLayout layout,
            EnumSet<VkShaderStageFlagBits> stageFlags,
            int offset,
            byte[] values)
    {
        nativeFunctionsProxyLibrary.vkCmdPushConstants(
                commandBuffer,
                layout,
                stageFlags,
                offset,
                values);
    }
    
    /**
     * This is a convenience function for <code>vkCmdPushConstants</code> so that
     * if you just want to send some <code>float</code>s as push constants you 
     * may do so without the hassle of converting them into a <code>byte[]</code> 
     * first.
     * 
     * @param commandBuffer
     * @param layout
     * @param stageFlags
     * @param offset
     * @param values
     */
    public static void vkCmdPushConstants(
            VkCommandBuffer commandBuffer,
            VkPipelineLayout layout,
            EnumSet<VkShaderStageFlagBits> stageFlags,
            int offset,
            float[] values)
    {
        nativeFunctionsProxyLibrary.vkCmdPushConstants(
                commandBuffer,
                layout,
                stageFlags,
                offset,
                values);
    }
    
    /**
     * This is a convenience function for <code>vkCmdPushConstants</code> so that
     * if you just want to send some <code>int</code>s as push constants you 
     * may do so without the hassle of converting them into a <code>byte[]</code> 
     * first.
     * 
     * @param commandBuffer
     * @param layout
     * @param stageFlags
     * @param offset
     * @param values
     */
    public static void vkCmdPushConstants(
            VkCommandBuffer commandBuffer,
            VkPipelineLayout layout,
            EnumSet<VkShaderStageFlagBits> stageFlags,
            int offset,
            int[] values)
    {
        nativeFunctionsProxyLibrary.vkCmdPushConstants(
                commandBuffer,
                layout,
                stageFlags,
                offset,
                values);
    }
    
    public static void vkCmdPushDescriptorSetKHR(
            VkCommandBuffer commandBuffer,
            VkPipelineBindPoint pipelineBindPoint,
            VkPipelineLayout layout,
            int set,
            Collection<VkWriteDescriptorSet> descriptorWrites)
    {
        nativeFunctionsProxyLibrary.vkCmdPushDescriptorSetKHR(
                commandBuffer,
                pipelineBindPoint,
                layout,
                set,
                descriptorWrites);
    }
    
    public static void vkCmdPushDescriptorSetWithTemplateKHR(
            VkCommandBuffer commandBuffer,
            VkDescriptorUpdateTemplate descriptorUpdateTemplate,
            VkPipelineLayout layout,
            Collection<Object> data)
    {
        for(Object item : data)
        {
            if (item instanceof VkDescriptorImageInfo == false &&
                item instanceof VkDescriptorBufferInfo == false &&
                item instanceof VkBufferView == false)
            {
                throw new IllegalArgumentException("data must only contain VkDescriptorImageInfo, VkDescriptorBufferInfo, or VkBufferView objects.");
            }
        }
        
        nativeFunctionsProxyLibrary.vkCmdPushDescriptorSetWithTemplateKHR(
                commandBuffer,
                descriptorUpdateTemplate,
                layout,
                data);
    }
    
    public static void vkCmdResetEvent(
            VkCommandBuffer commandBuffer,
            VkEvent event,
            EnumSet<VkPipelineStageFlagBits> stageMask)
    {
        nativeFunctionsProxyLibrary.vkCmdResetEvent(
                commandBuffer,
                event,
                stageMask);
    }
    
    public static void vkCmdResetQueryPool(
            VkCommandBuffer commandBuffer,
            VkQueryPool queryPool,
            int firstQuery,
            int queryCount)
    {
        nativeFunctionsProxyLibrary.vkCmdResetQueryPool(
                commandBuffer,
                queryPool,
                firstQuery,
                queryCount);
    }
    
    public static void vkCmdResolveImage(
            VkCommandBuffer commandBuffer,
            VkImage srcImage,
            VkImageLayout srcImageLayout,
            VkImage dstImage,
            VkImageLayout dstImageLayout,
            Collection<VkImageResolve> regions)
    {
        nativeFunctionsProxyLibrary.vkCmdResolveImage(
                commandBuffer,
                srcImage,
                srcImageLayout,
                dstImage,
                dstImageLayout,
                regions);
    }
    
    public static void vkCmdSetBlendConstants(
            VkCommandBuffer commandBuffer,
            float[] blendConstants)
    {
        if (blendConstants.length != 4)
        {
            throw new IllegalArgumentException("blendConstants must have a length of 4");
        }
        
        nativeFunctionsProxyLibrary.vkCmdSetBlendConstants(
                commandBuffer,
                blendConstants);
    }
    
    public static void vkCmdSetDepthBias(
            VkCommandBuffer commandBuffer,
            float depthBiasConstantFactor,
            float depthBiasClamp,
            float depthBiasSlopeFactor)
    {
        nativeFunctionsProxyLibrary.vkCmdSetDepthBias(
                commandBuffer,
                depthBiasConstantFactor,
                depthBiasClamp,
                depthBiasSlopeFactor);
    }
    
    public static void vkCmdSetDepthBounds(
            VkCommandBuffer commandBuffer,
            float minDepthBounds,
            float maxDepthBounds)
    {
        nativeFunctionsProxyLibrary.vkCmdSetDepthBounds(
                commandBuffer,
                minDepthBounds,
                maxDepthBounds);
    }
    
    public static void vkCmdSetDeviceMask(
            VkCommandBuffer commandBuffer,
            int deviceMask)
    {
        nativeFunctionsProxyLibrary.vkCmdSetDeviceMask(
                commandBuffer,
                deviceMask);
    }
    
    public static void vkCmdSetDeviceMaskKHR(
            VkCommandBuffer commandBuffer,
            int deviceMask)
    {
        nativeFunctionsProxyLibrary.vkCmdSetDeviceMask(
                commandBuffer,
                deviceMask);
    }
    
    public static void vkCmdSetDiscardRectangleEXT(
            VkCommandBuffer commandBuffer,
            int firstDiscardRectangle,
            Collection<VkRect2D> discardRectangles)
    {
        nativeFunctionsProxyLibrary.vkCmdSetDiscardRectangleEXT(
                commandBuffer,
                firstDiscardRectangle,
                discardRectangles);
    }
    
    public static void vkCmdSetEvent(
            VkCommandBuffer commandBuffer,
            VkEvent event,
            EnumSet<VkPipelineStageFlagBits> stageMask)
    {
        nativeFunctionsProxyLibrary.vkCmdSetEvent(
                commandBuffer,
                event,
                stageMask);
    }
    
    public static void vkCmdSetLineWidth(
            VkCommandBuffer commandBuffer,
            float lineWidth)
    {
        nativeFunctionsProxyLibrary.vkCmdSetLineWidth(
                commandBuffer,
                lineWidth);
    }
    
    public static void vkCmdSetSampleLocationsEXT(
            VkCommandBuffer commandBuffer,
            VkSampleLocationsInfoEXT sampleLocationsInfo)
    {
        nativeFunctionsProxyLibrary.vkCmdSetSampleLocationsEXT(
                commandBuffer,
                sampleLocationsInfo);
    }
    
    public static void vkCmdSetScissor(
            VkCommandBuffer commandBuffer,
            int firstScissor,
            Collection<VkRect2D> scissors)
    {
        nativeFunctionsProxyLibrary.vkCmdSetScissor(
                commandBuffer,
                firstScissor,
                scissors);
    }
    
    /**
     * A convenience function for <code>vkCmdSetScissor</code> that does not 
     * require a <code>Collection</code> of scissors in the case where there is
     * just one.
     * 
     * @param commandBuffer
     * @param scissor
     */
    public static void vkCmdSetScissor(
            VkCommandBuffer commandBuffer,
            VkRect2D scissor)
    {
        Collection<VkRect2D> scissors = new LinkedList<VkRect2D>();
        scissors.add(scissor);
        
        nativeFunctionsProxyLibrary.vkCmdSetScissor(
                commandBuffer,
                0,
                scissors);
    }
    
    public static void vkCmdSetStencilCompareMask(
            VkCommandBuffer commandBuffer,
            EnumSet<VkStencilFaceFlagBits> faceMask,
            int compareMask)
    {
        nativeFunctionsProxyLibrary.vkCmdSetStencilCompareMask(
                commandBuffer,
                faceMask,
                compareMask);
    }
    
    public static void vkCmdSetStencilReference(
            VkCommandBuffer commandBuffer,
            EnumSet<VkStencilFaceFlagBits> faceMask,
            int reference)
    {
        nativeFunctionsProxyLibrary.vkCmdSetStencilReference(
                commandBuffer,
                faceMask,
                reference);
    }
    
    public static void vkCmdSetStencilWriteMask(
            VkCommandBuffer commandBuffer,
            EnumSet<VkStencilFaceFlagBits> faceMask,
            int writeMask)
    {
        nativeFunctionsProxyLibrary.vkCmdSetStencilWriteMask(
                commandBuffer,
                faceMask,
                writeMask);
    }
    
    public static void vkCmdSetViewport(
            VkCommandBuffer commandBuffer,
            int firstViewport,
            Collection<VkViewport> viewports)
    {
        nativeFunctionsProxyLibrary.vkCmdSetViewport(
                commandBuffer,
                firstViewport,
                viewports);
    }
    
    /**
     * A convenience function for <code>vkCmdSetViewport</code> that does not
     * require a <code>Collection</code> of viewports in the case of there being
     * just one.
     * 
     * @param commandBuffer
     * @param viewport
     */
    public static void vkCmdSetViewport(
            VkCommandBuffer commandBuffer,
            VkViewport viewport)
    {
        Collection<VkViewport> viewports = new LinkedList<VkViewport>();
        viewports.add(viewport);
        
        nativeFunctionsProxyLibrary.vkCmdSetViewport(
                commandBuffer,
                0,
                viewports);
    }
    
    public static void vkCmdSetViewportWScalingNV(
            VkCommandBuffer commandBuffer,
            int firstViewport,
            Collection<VkViewportWScalingNV> viewportWScalings)
    {
        nativeFunctionsProxyLibrary.vkCmdSetViewportWScalingNV(
                commandBuffer,
                firstViewport,
                viewportWScalings);
    }
    
    public static void vkCmdUpdateBuffer(
            VkCommandBuffer commandBuffer,
            VkBuffer dstBuffer,
            long dstOffset,
            byte[] data)
    {
        if(data.length > 65536)
        {
            throw new IllegalArgumentException("data must have a length of 65536 or less.");
        }
        
        nativeFunctionsProxyLibrary.vkCmdUpdateBuffer(
                commandBuffer,
                dstBuffer,
                dstOffset,
                data);
    }
    
    public static void vkCmdWaitEvents(
            VkCommandBuffer commandBuffer,
            Collection<VkEvent> events,
            EnumSet<VkPipelineStageFlagBits> srcStageMask,
            EnumSet<VkPipelineStageFlagBits> dstStageMask,
            Collection<VkMemoryBarrier> memoryBarriers,
            Collection<VkBufferMemoryBarrier> bufferMemoryBarriers,
            Collection<VkImageMemoryBarrier> imageMemoryBarriers)
    {
        nativeFunctionsProxyLibrary.vkCmdWaitEvents(
                commandBuffer,
                events,
                srcStageMask,
                dstStageMask,
                memoryBarriers,
                bufferMemoryBarriers,
                imageMemoryBarriers);
    }
    
    public static void vkCmdWriteBufferMarkerAMD(
            VkCommandBuffer commandBuffer,
            VkPipelineStageFlagBits pipelineStage,
            VkBuffer dstBuffer,
            long dstOffset,
            int marker)
    {
        nativeFunctionsProxyLibrary.vkCmdWriteBufferMarkerAMD(
                commandBuffer,
                pipelineStage,
                dstBuffer,
                dstOffset,
                marker);
    }
    
    public static void vkCmdWriteTimestamp(
            VkCommandBuffer commandBuffer,
            VkPipelineStageFlagBits pipelineStage,
            VkQueryPool queryPool,
            int query)
    {
        nativeFunctionsProxyLibrary.vkCmdWriteTimestamp(
                commandBuffer,
                pipelineStage,
                queryPool,
                query);
    }
    
    public static VkResult vkCreateEvent(
            VkDevice device,
            VkEventCreateInfo createInfo,
            VkAllocationCallbacks allocator,
            VkEvent event)
    {
        return nativeFunctionsProxyLibrary.vkCreateEvent(
                device,
                createInfo,
                allocator,
                event);
    }
    
    public static VkResult vkCreatePipelineCache(
            VkDevice device,
            VkPipelineCacheCreateInfo createInfo,
            VkAllocationCallbacks allocator,
            VkPipelineCache pipelineCache)
    {
        if (createInfo.getInitialDataSize() != 0 &&
            createInfo.getInitialData() == null)
        {
            throw new IllegalArgumentException("Initial data must not be null if initial data size is != 0.");
        }
        
        return nativeFunctionsProxyLibrary.vkCreatePipelineCache(
                device,
                createInfo,
                allocator,
                pipelineCache);
    }
    
    public static VkResult vkCreateQueryPool(
            VkDevice device,
            VkQueryPoolCreateInfo createInfo,
            VkAllocationCallbacks allocator,
            VkQueryPool queryPool)
    {
        return nativeFunctionsProxyLibrary.vkCreateQueryPool(
                device,
                createInfo,
                allocator,
                queryPool);
    }
    
    public static VkResult vkCreateSamplerYcbcrConversion(
            VkDevice device,
            VkSamplerYcbcrConversionCreateInfo createInfo,
            VkAllocationCallbacks allocator,
            VkSamplerYcbcrConversion ycbcrConversion)
    {
        return nativeFunctionsProxyLibrary.vkCreateSamplerYcbcrConversion(
                device,
                createInfo,
                allocator,
                ycbcrConversion);
    }
    
    public static VkResult vkCreateSamplerYcbcrConversionKHR(
            VkDevice device,
            VkSamplerYcbcrConversionCreateInfo createInfo,
            VkAllocationCallbacks allocator,
            VkSamplerYcbcrConversion ycbcrConversion)
    {
        return nativeFunctionsProxyLibrary.vkCreateSamplerYcbcrConversion(
                device,
                createInfo,
                allocator,
                ycbcrConversion);
    }
    
    /**
     * For now at least swapchains must be pre-created with the same number
     * of elements as createInfos.
     * @param device
     * @param createInfos
     * @param allocator
     * @param swapchains
     * @return
     */
    public static VkResult vkCreateSharedSwapchainsKHR(
            VkDevice device,
            Collection<VkSwapchainCreateInfoKHR> createInfos,
            VkAllocationCallbacks allocator,
            Collection<VkSwapchainKHR> swapchains)
    {
        if (createInfos.size() != swapchains.size())
        {
            throw new IllegalArgumentException();
        }
        
        return nativeFunctionsProxyLibrary.vkCreateSharedSwapchainsKHR(
                device,
                createInfos,
                allocator,
                swapchains);
    }
    
    public static VkResult vkCreateValidationCacheEXT(
            VkDevice device,
            VkValidationCacheCreateInfoEXT createInfo,
            VkAllocationCallbacks allocator,
            VkValidationCacheEXT validationCache)
    {
        return nativeFunctionsProxyLibrary.vkCreateValidationCacheEXT(
                device,
                createInfo,
                allocator,
                validationCache);
    }
    
    public static VkResult vkDebugMarkerSetObjectNameEXT(
            VkDevice device,
            VkDebugMarkerObjectNameInfoEXT nameInfo)
    {
        return nativeFunctionsProxyLibrary.vkDebugMarkerSetObjectNameEXT(
                device,
                nameInfo);
    }
    
    public static VkResult vkDebugMarkerSetObjectTagEXT(
            VkDevice device,
            VkDebugMarkerObjectTagInfoEXT tagInfo)
    {
        return nativeFunctionsProxyLibrary.vkDebugMarkerSetObjectTagEXT(
                device,
                tagInfo);
    }
    
    public static void vkDebugReportMessageEXT(
            VkInstance instance,
            EnumSet<VkDebugReportFlagBitsEXT> flags,
            VkDebugReportObjectTypeEXT objectType,
            long object,
            long location,
            int messageCode,
            String layerPrefix,
            String message)
    {
        nativeFunctionsProxyLibrary.vkDebugReportMessageEXT(
                instance,
                flags,
                objectType,
                object,
                location,
                messageCode,
                layerPrefix,
                message);
    }
    
    public static void vkDestroyBufferView(
            VkDevice device,
            VkBufferView bufferView,
            VkAllocationCallbacks allocator)
    {
        nativeFunctionsProxyLibrary.vkDestroyBufferView(
                device,
                bufferView,
                allocator);
    }
    
    public static void vkDestroyDescriptorUpdateTemplate(
            VkDevice device,
            VkDescriptorUpdateTemplate descriptorUpdateTemplate,
            VkAllocationCallbacks allocator)
    {
        nativeFunctionsProxyLibrary.vkDestroyDescriptorUpdateTemplate(
                device,
                descriptorUpdateTemplate,
                allocator);
    }
    
    public static void vkDestroyDescriptorUpdateTemplateKHR(
            VkDevice device,
            VkDescriptorUpdateTemplate descriptorUpdateTemplate,
            VkAllocationCallbacks allocator)
    {
        nativeFunctionsProxyLibrary.vkDestroyDescriptorUpdateTemplate(
                device,
                descriptorUpdateTemplate,
                allocator);
    }
    
    public static void vkDestroyEvent(
            VkDevice device,
            VkEvent event,
            VkAllocationCallbacks allocator)
    {
        nativeFunctionsProxyLibrary.vkDestroyEvent(
                device,
                event,
                allocator);
    }
    
    public static void vkDestroyIndirectCommandsLayoutNV(
            VkDevice device,
            VkIndirectCommandsLayoutNV indirectCommandsLayout,
            VkAllocationCallbacks allocator)
    {
        nativeFunctionsProxyLibrary.vkDestroyIndirectCommandsLayoutNV(
                device,
                indirectCommandsLayout,
                allocator);
    }
    
    public static void vkDestroyPipelineCache(
            VkDevice device,
            VkPipelineCache pipelineCache,
            VkAllocationCallbacks allocator)
    {
        nativeFunctionsProxyLibrary.vkDestroyPipelineCache(
                device,
                pipelineCache,
                allocator);
    }
    
    public static void vkDestroyQueryPool(
            VkDevice device,
            VkQueryPool queryPool,
            VkAllocationCallbacks allocator)
    {
        nativeFunctionsProxyLibrary.vkDestroyQueryPool(
                device,
                queryPool,
                allocator);
    }
    
    public static void vkDestroySamplerYcbcrConversion(
            VkDevice device,
            VkSamplerYcbcrConversion ycbcrConversion,
            VkAllocationCallbacks allocator)
    {
        nativeFunctionsProxyLibrary.vkDestroySamplerYcbcrConversion(
                device,
                ycbcrConversion,
                allocator);
    }
    
    public static void vkDestroySamplerYcbcrConversionKHR(
            VkDevice device,
            VkSamplerYcbcrConversion ycbcrConversion,
            VkAllocationCallbacks allocator)
    {
        nativeFunctionsProxyLibrary.vkDestroySamplerYcbcrConversion(
                device,
                ycbcrConversion,
                allocator);
    }
    
    public static void vkDestroyValidationCacheEXT(
            VkDevice device,
            VkValidationCacheEXT validationCache,
            VkAllocationCallbacks allocator)
    {
        nativeFunctionsProxyLibrary.vkDestroyValidationCacheEXT(
                device,
                validationCache,
                allocator);
    }
    
    public static VkResult vkDisplayPowerControlEXT(
            VkDevice device,
            VkDisplayKHR display,
            VkDisplayPowerInfoEXT displayPowerInfo)
    {
        return nativeFunctionsProxyLibrary.vkDisplayPowerControlEXT(
                device,
                display,
                displayPowerInfo);
    }
    
    /**
     * 
     * @param physicalDevice
     * @param properties
     * @return
     */
    public static VkResult vkEnumerateDeviceLayerProperties(
            VkPhysicalDevice physicalDevice,
            Collection<VkLayerProperties> properties)
    {
        if (properties == null)
        {
            throw new IllegalArgumentException("properties must not be null...it should most likely be an empty Collection.");
        }

        return nativeFunctionsProxyLibrary.vkEnumerateDeviceLayerProperties(
                physicalDevice,
                properties);
    }
    
    public static VkResult vkEnumerateInstanceExtensionProperties(
            String LayerName,
            Collection<VkExtensionProperties> properties)
    {
        if (properties == null)
        {
            throw new IllegalArgumentException("properties must not be null...it should most likely be an empty Collection.");
        }

        return nativeFunctionsProxyLibrary.vkEnumerateInstanceExtensionProperties(
                LayerName,
                properties);
    }
    
    public static VkResult vkEnumerateInstanceLayerProperties(
            Collection<VkLayerProperties> properties)
    {
        return nativeFunctionsProxyLibrary.vkEnumerateInstanceLayerProperties(
                properties);
    }
    
    public static VkResult vkEnumerateInstanceVersion(
            IntReturnValue apiVersion)
    {
        return nativeFunctionsProxyLibrary.vkEnumerateInstanceVersion(
                apiVersion);
    }
    
    public static VkResult vkEnumeratePhysicalDeviceGroups(
            VkInstance instance,
            Collection<VkPhysicalDeviceGroupProperties> physicalDeviceGroupProperties)
    {
        return nativeFunctionsProxyLibrary.vkEnumeratePhysicalDeviceGroups(
                instance,
                physicalDeviceGroupProperties);
    }
    
    public static VkResult vkEnumeratePhysicalDeviceGroupsKHR(
            VkInstance instance,
            Collection<VkPhysicalDeviceGroupProperties> physicalDeviceGroupProperties)
    {
        return nativeFunctionsProxyLibrary.vkEnumeratePhysicalDeviceGroups(
                instance,
                physicalDeviceGroupProperties);
    }
    
    public static VkResult vkFlushMappedMemoryRanges(
            VkDevice device,
            Collection<VkMappedMemoryRange> memoryRanges)
    {
        return nativeFunctionsProxyLibrary.vkFlushMappedMemoryRanges(
                 device,
                memoryRanges);
    }
    
    public static VkResult vkFreeDescriptorSets(
            VkDevice device,
            VkDescriptorPool descriptorPool,
            Collection<VkDescriptorSet> descriptorSets)
    {
        return nativeFunctionsProxyLibrary.vkFreeDescriptorSets(
                device,
                descriptorPool,
                descriptorSets);
    }
    
    public static void vkGetBufferMemoryRequirements2(
            VkDevice device,
            VkBufferMemoryRequirementsInfo2 info,
            VkMemoryRequirements2 memoryRequirements)
    {
        if (memoryRequirements == null)
        {
            throw new IllegalArgumentException("memoryRequirements must not be null");
        }
        
        nativeFunctionsProxyLibrary.vkGetBufferMemoryRequirements2(
                device,
                info,
                memoryRequirements);
    }
    
    public static void vkGetBufferMemoryRequirements2KHR(
            VkDevice device,
            VkBufferMemoryRequirementsInfo2 info,
            VkMemoryRequirements2 memoryRequirements)
    {
        nativeFunctionsProxyLibrary.vkGetBufferMemoryRequirements2(
                device,
                info,
                memoryRequirements);
    }
    
    public static VkResult vkGetCalibratedTimestampsEXT(
            VkDevice device,
            Collection<VkCalibratedTimestampInfoEXT> timestampInfos,
            long[] timestamps,
            LongReturnValue maxDeviation)
    {
        if (timestampInfos.size() != timestamps.length)
        {
            throw new IllegalArgumentException("timestampInfos and timestamps must have the same number of elements");
        }
        
        return nativeFunctionsProxyLibrary.vkGetCalibratedTimestampsEXT(
                device,
                timestampInfos,
                timestamps,
                maxDeviation);
    }
    
    public static void vkGetDeviceMemoryCommitment(
            VkDevice device,
            VkDeviceMemory memory,
            LongReturnValue committedMemoryInBytes)
    {
        nativeFunctionsProxyLibrary.vkGetDeviceMemoryCommitment(
                device,
                memory,
                committedMemoryInBytes);
    }
    
    public static void vkGetDeviceQueue2(
            VkDevice device,
            VkDeviceQueueInfo2 queueInfo,
            VkQueue queue)
    {
        nativeFunctionsProxyLibrary.vkGetDeviceQueue2(
                device,
                queueInfo,
                queue);
    }
    
    public static VkResult vkGetDisplayModeProperties2KHR(
            VkPhysicalDevice physicalDevice,
            VkDisplayKHR display,
            Collection<VkDisplayModeProperties2KHR> properties)
    {
        return nativeFunctionsProxyLibrary.vkGetDisplayModeProperties2KHR(
                physicalDevice,
                display,
                properties);
    }
    
    public static VkResult vkGetDisplayModePropertiesKHR(
            VkPhysicalDevice physicalDevice,
            VkDisplayKHR display,
            Collection<VkDisplayModePropertiesKHR> properties)
    {
        return nativeFunctionsProxyLibrary.vkGetDisplayModePropertiesKHR(
                physicalDevice,
                display,
                properties);
    }
    
    public static VkResult vkGetDisplayPlaneCapabilities2KHR(
            VkPhysicalDevice physicalDevice,
            VkDisplayPlaneInfo2KHR pisplayPlaneInfo,
            VkDisplayPlaneCapabilities2KHR capabilities)
    {
        return nativeFunctionsProxyLibrary.vkGetDisplayPlaneCapabilities2KHR(
                physicalDevice,
                pisplayPlaneInfo,
                capabilities);
    }
    
    public static VkResult vkGetDisplayPlaneCapabilitiesKHR(
            VkPhysicalDevice physicalDevice,
            VkDisplayModeKHR mode,
            int planeIndex,
            VkDisplayPlaneCapabilitiesKHR capabilities)
    {
        return nativeFunctionsProxyLibrary.vkGetDisplayPlaneCapabilitiesKHR(
                physicalDevice,
                mode,
                planeIndex,
                capabilities);
    }
    
    public static VkResult vkGetDisplayPlaneSupportedDisplaysKHR(
            VkPhysicalDevice physicalDevice,
            int planeIndex,
            Collection<VkDisplayKHR> displays)
    {
        return nativeFunctionsProxyLibrary.vkGetDisplayPlaneSupportedDisplaysKHR(
                physicalDevice,
                planeIndex,
                displays);
    }
    
    public static VkResult vkGetEventStatus(
            VkDevice device,
            VkEvent event)
    {
        return nativeFunctionsProxyLibrary.vkGetEventStatus(
                device,
                event);
    }
    
    public static VkResult vkGetFenceFdKHR(
            VkDevice device,
            VkFenceGetFdInfoKHR getFdInfo,
            IntReturnValue fd)
    {
        return nativeFunctionsProxyLibrary.vkGetFenceFdKHR(
                device,
                getFdInfo,
                fd);
    }
    
    public static VkResult vkGetFenceStatus(
            VkDevice device,
            VkFence fence)
    {
        return nativeFunctionsProxyLibrary.vkGetFenceStatus(
                device,
                fence);
    }

    public static void vkGetImageMemoryRequirements2(
            VkDevice device,
            VkImageMemoryRequirementsInfo2 info,
            VkMemoryRequirements2 memoryRequirements)
    {
        nativeFunctionsProxyLibrary.vkGetImageMemoryRequirements2(
                device,
                info,
                memoryRequirements);
    }
    
    public static void vkGetImageMemoryRequirements2KHR(
            VkDevice device,
            VkImageMemoryRequirementsInfo2 info,
            VkMemoryRequirements2 memoryRequirements)
    {
        nativeFunctionsProxyLibrary.vkGetImageMemoryRequirements2(
                device,
                info,
                memoryRequirements);
    }
    
    public static void vkGetImageSparseMemoryRequirements(
            VkDevice device,
            VkImage image,
            Collection<VkSparseImageMemoryRequirements> sparseMemoryRequirements)
    {
        if (sparseMemoryRequirements == null)
        {
            throw new IllegalArgumentException("sparseMemoryRequirements must not be null");
        }
        
        nativeFunctionsProxyLibrary.vkGetImageSparseMemoryRequirements(
                device,
                image,
                sparseMemoryRequirements);
    }
    
    public static void vkGetImageSparseMemoryRequirements2(
            VkDevice device,
            VkImageSparseMemoryRequirementsInfo2 info,
            Collection<VkSparseImageMemoryRequirements2> sparseMemoryRequirements)
    {
        if (sparseMemoryRequirements == null)
        {
            throw new IllegalArgumentException("sparseMemoryRequirements must not be null");
        }
        
        nativeFunctionsProxyLibrary.vkGetImageSparseMemoryRequirements2(
                device,
                info,
                sparseMemoryRequirements);
    }
    
    public static void vkGetImageSparseMemoryRequirements2KHR(
            VkDevice device,
            VkImageSparseMemoryRequirementsInfo2 info,
            Collection<VkSparseImageMemoryRequirements2> sparseMemoryRequirements)
    {
        if (sparseMemoryRequirements == null)
        {
            throw new IllegalArgumentException("sparseMemoryRequirements must not be null");
        }
        
        nativeFunctionsProxyLibrary.vkGetImageSparseMemoryRequirements2(
                device,
                info,
                sparseMemoryRequirements);
    }
    
    public static void vkGetImageSubresourceLayout(
            VkDevice device,
            VkImage image,
            VkImageSubresource subresource,
            VkSubresourceLayout layout)
    {
        nativeFunctionsProxyLibrary.vkGetImageSubresourceLayout(
                device,
                image,
                subresource,
                layout);
    }
    
    public static int vkGetImageViewHandleNVX(
            VkDevice device,
            VkImageViewHandleInfoNVX info)
    {
        return nativeFunctionsProxyLibrary.vkGetImageViewHandleNVX(
                device,
                info);
    }
    
    public static VkResult vkGetMemoryFdKHR(
            VkDevice device,
            VkMemoryGetFdInfoKHR getFdInfo,
            IntReturnValue fd)
    {
        return nativeFunctionsProxyLibrary.vkGetMemoryFdKHR(
                device,
                getFdInfo,
                fd);
    }
    
    public static VkResult vkGetMemoryFdPropertiesKHR(
            VkDevice device,
            VkExternalMemoryHandleTypeFlagBits handleType,
            int fd,
            VkMemoryFdPropertiesKHR memoryFdProperties)
    {
        return nativeFunctionsProxyLibrary.vkGetMemoryFdPropertiesKHR(
                device,
                handleType,
                fd,
                memoryFdProperties);
    }
    
    public static VkResult vkGetMemoryHostPointerPropertiesEXT(
            VkDevice device,
            VkExternalMemoryHandleTypeFlagBits handleType,
            VulkanHandle hostPointer,
            VkMemoryHostPointerPropertiesEXT memoryHostPointerProperties)
    {
        return nativeFunctionsProxyLibrary.vkGetMemoryHostPointerPropertiesEXT(
                device,
                handleType,
                hostPointer,
                memoryHostPointerProperties);
    }
    
    public static VkResult vkGetPastPresentationTimingGOOGLE(
            VkDevice device,
            VkSwapchainKHR swapchain,
            Collection<VkPastPresentationTimingGOOGLE> presentationTimings)
    {
        return nativeFunctionsProxyLibrary.vkGetPastPresentationTimingGOOGLE(
                device,
                swapchain,
                presentationTimings);
    }
    
    public static VkResult vkGetPhysicalDeviceDisplayPlaneProperties2KHR(
            VkPhysicalDevice                            physicalDevice,
            Collection<VkDisplayPlaneProperties2KHR> properties)
    {
        return nativeFunctionsProxyLibrary.vkGetPhysicalDeviceDisplayPlaneProperties2KHR(
                physicalDevice,
                properties);
    }
    
    public static VkResult vkGetPhysicalDeviceDisplayPlanePropertiesKHR(
            VkPhysicalDevice physicalDevice,
            Collection<VkDisplayPlanePropertiesKHR> properties)
    {
        return nativeFunctionsProxyLibrary.vkGetPhysicalDeviceDisplayPlanePropertiesKHR(
                physicalDevice,
                properties);
    }
    
    public static VkResult vkGetPhysicalDeviceDisplayProperties2KHR(
            VkPhysicalDevice physicalDevice,
            Collection<VkDisplayProperties2KHR> properties)
    {
        return nativeFunctionsProxyLibrary.vkGetPhysicalDeviceDisplayProperties2KHR(
                physicalDevice,
                properties);
    }
    
    public static VkResult vkGetPhysicalDeviceDisplayPropertiesKHR(
            VkPhysicalDevice physicalDevice,
            VkDisplayPropertiesKHR properties)
    {
        return nativeFunctionsProxyLibrary.vkGetPhysicalDeviceDisplayPropertiesKHR(
                physicalDevice,
                properties);
    }
    
    public static void vkGetPhysicalDeviceExternalBufferProperties(
            VkPhysicalDevice physicalDevice,
            VkPhysicalDeviceExternalBufferInfo externalBufferInfo,
            VkExternalBufferProperties externalBufferProperties)
    {
        nativeFunctionsProxyLibrary.vkGetPhysicalDeviceExternalBufferProperties(
                physicalDevice,
                externalBufferInfo,
                externalBufferProperties);
    }
    
    public static void vkGetPhysicalDeviceExternalBufferPropertiesKHR(
            VkPhysicalDevice physicalDevice,
            VkPhysicalDeviceExternalBufferInfo externalBufferInfo,
            VkExternalBufferProperties externalBufferProperties)
    {
        nativeFunctionsProxyLibrary.vkGetPhysicalDeviceExternalBufferProperties(
                physicalDevice,
                externalBufferInfo,
                externalBufferProperties);
    }
    
    public static void vkGetPhysicalDeviceExternalFenceProperties(
            VkPhysicalDevice physicalDevice,
            VkPhysicalDeviceExternalFenceInfo externalFenceInfo,
            VkExternalFenceProperties externalFenceProperties)
    {
        nativeFunctionsProxyLibrary.vkGetPhysicalDeviceExternalFenceProperties(
                physicalDevice,
                externalFenceInfo,
                externalFenceProperties);
    }
    
    public static void vkGetPhysicalDeviceExternalFencePropertiesKHR(
            VkPhysicalDevice physicalDevice,
            VkPhysicalDeviceExternalFenceInfo externalFenceInfo,
            VkExternalFenceProperties externalFenceProperties)
    {
        nativeFunctionsProxyLibrary.vkGetPhysicalDeviceExternalFenceProperties(
                physicalDevice,
                externalFenceInfo,
                externalFenceProperties);
    }
    
    public static VkResult vkGetPhysicalDeviceExternalImageFormatPropertiesNV(
            VkPhysicalDevice physicalDevice,
            VkFormat format,
            VkImageType type,
            VkImageTiling tiling,
            EnumSet<VkImageUsageFlagBits> usage,
            EnumSet<VkImageCreateFlagBits> flags,
            EnumSet<VkExternalMemoryHandleTypeFlagBitsNV> externalHandleType,
            VkExternalImageFormatPropertiesNV externalImageFormatProperties)
    {
        return nativeFunctionsProxyLibrary.vkGetPhysicalDeviceExternalImageFormatPropertiesNV(
                physicalDevice,
                format,
                type,
                tiling,
                usage,
                flags,
                externalHandleType,
                externalImageFormatProperties);
    }
    
    public static void vkGetPhysicalDeviceExternalSemaphoreProperties(
            VkPhysicalDevice physicalDevice,
            VkPhysicalDeviceExternalSemaphoreInfo externalSemaphoreInfo,
            VkExternalSemaphoreProperties externalSemaphoreProperties)
    {
        nativeFunctionsProxyLibrary.vkGetPhysicalDeviceExternalSemaphoreProperties(
                physicalDevice,
                externalSemaphoreInfo,
                externalSemaphoreProperties);
    }
    
    public static void vkGetPhysicalDeviceExternalSemaphorePropertiesKHR(
            VkPhysicalDevice physicalDevice,
            VkPhysicalDeviceExternalSemaphoreInfo externalSemaphoreInfo,
            VkExternalSemaphoreProperties externalSemaphoreProperties)
    {
        nativeFunctionsProxyLibrary.vkGetPhysicalDeviceExternalSemaphoreProperties(
                physicalDevice,
                externalSemaphoreInfo,
                externalSemaphoreProperties);
    }
    
    public static void vkGetPhysicalDeviceFeatures2(
            VkPhysicalDevice physicalDevice,
            VkPhysicalDeviceFeatures2 features)
    {
        nativeFunctionsProxyLibrary.vkGetPhysicalDeviceFeatures2(
                physicalDevice,
                features);
    }
    
    public static void vkGetPhysicalDeviceFeatures2KHR(
            VkPhysicalDevice physicalDevice,
            VkPhysicalDeviceFeatures2 features)
    {
        nativeFunctionsProxyLibrary.vkGetPhysicalDeviceFeatures2(
                physicalDevice,
                features);
    }
    
    public static void vkGetPhysicalDeviceFormatProperties2(
            VkPhysicalDevice physicalDevice,
            VkFormat format,
            VkFormatProperties2 formatProperties)
    {
        nativeFunctionsProxyLibrary.vkGetPhysicalDeviceFormatProperties2(
                physicalDevice,
                format,
                formatProperties);
    }
    
    public static void vkGetPhysicalDeviceFormatProperties2KHR(
            VkPhysicalDevice physicalDevice,
            VkFormat format,
            VkFormatProperties2 formatProperties)
    {
        nativeFunctionsProxyLibrary.vkGetPhysicalDeviceFormatProperties2(
                physicalDevice,
                format,
                formatProperties);
    }
    
    public static void vkGetPhysicalDeviceMemoryProperties2(
            VkPhysicalDevice physicalDevice,
            VkPhysicalDeviceMemoryProperties2 memoryProperties)
    {
        nativeFunctionsProxyLibrary.vkGetPhysicalDeviceMemoryProperties2(
                physicalDevice,
                memoryProperties);
    }
    
    public static void vkGetPhysicalDeviceMultisamplePropertiesEXT(
            VkPhysicalDevice physicalDevice,
            VkSampleCountFlagBits samples,
            VkMultisamplePropertiesEXT multisampleProperties)
    {
        nativeFunctionsProxyLibrary.vkGetPhysicalDeviceMultisamplePropertiesEXT(
                physicalDevice,
                samples,
                multisampleProperties);
    }
    
    public static VkResult vkGetPhysicalDevicePresentRectanglesKHR(
            VkPhysicalDevice physicalDevice,
            VkSurfaceKHR surface,
            Collection<VkRect2D> rects)
    {
        return nativeFunctionsProxyLibrary.vkGetPhysicalDevicePresentRectanglesKHR(
                physicalDevice,
                surface,
                rects);
    }
    
    public static void vkGetPhysicalDeviceQueueFamilyProperties2(
            VkPhysicalDevice physicalDevice,
            Collection<VkQueueFamilyProperties2> queueFamilyProperties)
    {
        nativeFunctionsProxyLibrary.vkGetPhysicalDeviceQueueFamilyProperties2(
                physicalDevice,
                queueFamilyProperties);
    }
    
    public static void vkGetPhysicalDeviceQueueFamilyProperties2KHR(
            VkPhysicalDevice physicalDevice,
            Collection<VkQueueFamilyProperties2> queueFamilyProperties)
    {
        nativeFunctionsProxyLibrary.vkGetPhysicalDeviceQueueFamilyProperties2(
                physicalDevice,
                queueFamilyProperties);
    }
    
    public static void vkGetPhysicalDeviceSparseImageFormatProperties(
            VkPhysicalDevice physicalDevice,
            VkFormat format,
            VkImageType type,
            VkSampleCountFlagBits samples,
            EnumSet<VkImageUsageFlagBits> usage,
            VkImageTiling tiling,
            Collection<VkSparseImageFormatProperties> properties)
    {
        nativeFunctionsProxyLibrary.vkGetPhysicalDeviceSparseImageFormatProperties(
                physicalDevice,
                format,
                type,
                samples,
                usage,
                tiling,
                properties);
    }
    
    public static void vkGetPhysicalDeviceSparseImageFormatProperties2(
            VkPhysicalDevice physicalDevice,
            VkPhysicalDeviceSparseImageFormatInfo2 formatInfo,
            Collection<VkSparseImageFormatProperties2> properties)
    {
        nativeFunctionsProxyLibrary.vkGetPhysicalDeviceSparseImageFormatProperties2(
                physicalDevice,
                formatInfo,
                properties);
    }
    
    public static void vkGetPhysicalDeviceSparseImageFormatProperties2KHR(
            VkPhysicalDevice physicalDevice,
            VkPhysicalDeviceSparseImageFormatInfo2 formatInfo,
            Collection<VkSparseImageFormatProperties2> properties)
    {
        nativeFunctionsProxyLibrary.vkGetPhysicalDeviceSparseImageFormatProperties2(
                physicalDevice,
                formatInfo,
                properties);
    }
    
    public static VkResult vkGetPhysicalDeviceSurfaceCapabilities2EXT(
            VkPhysicalDevice physicalDevice,
            VkSurfaceKHR surface,
            VkSurfaceCapabilities2EXT surfaceCapabilities)
    {
        return nativeFunctionsProxyLibrary.vkGetPhysicalDeviceSurfaceCapabilities2EXT(
                physicalDevice,
                surface,
                surfaceCapabilities);
    }
    
    public static VkResult vkGetPhysicalDeviceSurfaceFormats2KHR(
            VkPhysicalDevice physicalDevice,
            VkPhysicalDeviceSurfaceInfo2KHR surfaceInfo,
            Collection<VkSurfaceFormat2KHR> surfaceFormats)
    {
        return nativeFunctionsProxyLibrary.vkGetPhysicalDeviceSurfaceFormats2KHR(
                physicalDevice,
                surfaceInfo,
                surfaceFormats);
    }
    
    public static VkResult vkGetPipelineCacheData(
            VkDevice device,
            VkPipelineCache pipelineCache,
            ByteArrayReturnValue data)
    {
        return nativeFunctionsProxyLibrary.vkGetPipelineCacheData(
                device,
                pipelineCache,
                data);
    }
    
    /**
     * 
     * @param device
     * @param queryPool
     * @param firstQuery
     * @param queryCount
     * @param data this needs to be pre-allocated
     * @param stride
     * @param flags
     * @return
     */
    public static VkResult vkGetQueryPoolResults(
            VkDevice device,
            VkQueryPool queryPool,
            int firstQuery,
            int queryCount,
            byte[] data,
            long stride,
            EnumSet<VkQueryResultFlagBits> flags)
    {
        return nativeFunctionsProxyLibrary.vkGetQueryPoolResults(
                device,
                queryPool,
                firstQuery,
                queryCount,
                data,
                stride,
                flags);
    }
    
    public static VkResult vkGetRefreshCycleDurationGOOGLE(
            VkDevice device,
            VkSwapchainKHR swapchain,
            VkRefreshCycleDurationGOOGLE displayTimingProperties)
    {
        return nativeFunctionsProxyLibrary.vkGetRefreshCycleDurationGOOGLE(
                device,
                swapchain,
                displayTimingProperties);
    }
    
    public static void vkGetRenderAreaGranularity(
            VkDevice device,
            VkRenderPass renderPass,
            VkExtent2D granularity)
    {
        nativeFunctionsProxyLibrary.vkGetRenderAreaGranularity(
                device,
                renderPass,
                granularity);
    }
    
    public static VkResult vkGetSemaphoreFdKHR(
            VkDevice device,
            VkSemaphoreGetFdInfoKHR getFdInfo,
            IntReturnValue fd)
    {
        return nativeFunctionsProxyLibrary.vkGetSemaphoreFdKHR(
                device,
                getFdInfo,
                fd);
    }
    
    public static VkResult vkGetShaderInfoAMD(
            VkDevice device,
            VkPipeline pipeline,
            VkShaderStageFlagBits shaderStage,
            VkShaderInfoTypeAMD infoType,
            ByteArrayReturnValue info)
    {
        return nativeFunctionsProxyLibrary.vkGetShaderInfoAMD(
                device,
                pipeline,
                shaderStage,
                infoType,
                info);
    }
    
    public static VkResult vkGetSwapchainCounterEXT(
            VkDevice device,
            VkSwapchainKHR swapchain,
            VkSurfaceCounterFlagBitsEXT counter,
            LongReturnValue counterValue)
    {
        return nativeFunctionsProxyLibrary.vkGetSwapchainCounterEXT(
                device,
                swapchain,
                counter,
                counterValue);
    }
    
    public static VkResult vkGetSwapchainStatusKHR(
            VkDevice device,
            VkSwapchainKHR swapchain)
    {
        return nativeFunctionsProxyLibrary.vkGetSwapchainStatusKHR(
                device,
                swapchain);
    }
    
    public static VkResult vkGetValidationCacheDataEXT(
            VkDevice device,
            VkValidationCacheEXT validationCache,
            ByteArrayReturnValue data)
    {
        return nativeFunctionsProxyLibrary.vkGetValidationCacheDataEXT(
                device,
                validationCache,
                data);
    }
    
    public static VkResult vkImportFenceFdKHR(
            VkDevice device,
            VkImportFenceFdInfoKHR importFenceFdInfo)
    {
        return nativeFunctionsProxyLibrary.vkImportFenceFdKHR(
                device,
                importFenceFdInfo);
    }
    
    public static VkResult vkImportSemaphoreFdKHR(
            VkDevice device,
            VkImportSemaphoreFdInfoKHR importSemaphoreFdInfo)
    {
        return nativeFunctionsProxyLibrary.vkImportSemaphoreFdKHR(
                device,
                importSemaphoreFdInfo);
    }
    
    public static VkResult vkInvalidateMappedMemoryRanges(
            VkDevice device,
            Collection<VkMappedMemoryRange> memoryRanges)
    {
        return nativeFunctionsProxyLibrary.vkInvalidateMappedMemoryRanges(
                device,
                memoryRanges);
    }
    
    public static VkResult vkMergePipelineCaches(
            VkDevice device,
            VkPipelineCache dstCache,
            Collection<VkPipelineCache> srcCaches)
    {
        return nativeFunctionsProxyLibrary.vkMergePipelineCaches(
                device,
                dstCache,
                srcCaches);
    }
    
    public static VkResult vkMergeValidationCachesEXT(
            VkDevice device,
            VkValidationCacheEXT dstCache,
            Collection<VkValidationCacheEXT> srcCaches)
    {
        return nativeFunctionsProxyLibrary.vkMergeValidationCachesEXT(
                device,
                dstCache,
                srcCaches);
    }
    
    public static VkResult vkQueueBindSparse(
            VkQueue queue,
            Collection<VkBindSparseInfo> bindInfo,
            VkFence fence)
    {
        return nativeFunctionsProxyLibrary.vkQueueBindSparse(
                queue,
                bindInfo,
                fence);
    }
    
    public static VkResult vkRegisterDeviceEventEXT(
            VkDevice device,
            VkDeviceEventInfoEXT deviceEventInfo,
            VkAllocationCallbacks allocator,
            VkFence fence)
    {
        return nativeFunctionsProxyLibrary.vkRegisterDeviceEventEXT(
                device,
                deviceEventInfo,
                allocator,
                fence);
    }
    
    public static VkResult vkRegisterDisplayEventEXT(
            VkDevice device,
            VkDisplayKHR display,
            VkDisplayEventInfoEXT displayEventInfo,
            VkAllocationCallbacks allocator,
            VkFence fence)
    {
        return nativeFunctionsProxyLibrary.vkRegisterDisplayEventEXT(
                device,
                display,
                displayEventInfo,
                allocator,
                fence);
    }
    
//    public static VkResult vkRegisterObjectsNVX(
//            VkDevice device,
//            VkObjectTableNVX objectTable,
//            Collection<VkObjectTableEntryNVX> objectTableEntries,
//            int[] objectIndices)
//    {
//        return nativeFunctionsProxyLibrary.vkRegisterObjectsNVX(
//                device,
//                objectTable,
//                objectTableEntries,
//                objectIndices);
//    }
//    
    public static VkResult vkReleaseDisplayEXT(
            VkPhysicalDevice physicalDevice,
            VkDisplayKHR display)
    {
        return nativeFunctionsProxyLibrary.vkReleaseDisplayEXT(
                physicalDevice,
                display);
    }
    
    public static VkResult vkResetCommandBuffer(
            VkCommandBuffer commandBuffer,
            EnumSet<VkCommandBufferResetFlagBits> flags)
    {
        return nativeFunctionsProxyLibrary.vkResetCommandBuffer(
                commandBuffer,
                flags);
    }
    
    public static VkResult vkResetCommandPool(
            VkDevice device,
            VkCommandPool commandPool,
            EnumSet<VkCommandPoolResetFlagBits> flags)
    {
        return nativeFunctionsProxyLibrary.vkResetCommandPool(
                device,
                commandPool,
                flags);
    }
    
    public static VkResult vkResetDescriptorPool(
            VkDevice device,
            VkDescriptorPool descriptorPool,
            EnumSet<VkDescriptorPoolResetFlagBits> flags)
    {
        return nativeFunctionsProxyLibrary.vkResetDescriptorPool(
                device,
                descriptorPool,
                flags);
    }
    
    public static VkResult vkResetEvent(
            VkDevice device,
            VkEvent event)
    {
        return nativeFunctionsProxyLibrary.vkResetEvent(
                device,
                event);
    }
    
    public static void vkResetQueryPool(
            VkDevice device,
            VkQueryPool queryPool,
            int firstQuery,
            int queryCount)
    {
        nativeFunctionsProxyLibrary.vkResetQueryPool(
                device,
                queryPool,
                firstQuery,
                queryCount);
    }
    
    public static VkResult vkSetEvent(
            VkDevice device,
            VkEvent event)
    {
        return nativeFunctionsProxyLibrary.vkSetEvent(
                device,
                event);
    }
    
    public static void vkSetHdrMetadataEXT(
            VkDevice device,
            Collection<VkSwapchainKHR> swapchains,
            Collection<VkHdrMetadataEXT> metadata)
    {
        if (swapchains.size() != metadata.size())
        {
            throw new IllegalArgumentException("swapchains and metadata MUST have the same number of elements.");
        }
        
        nativeFunctionsProxyLibrary.vkSetHdrMetadataEXT(
                device,
                swapchains,
                metadata);
    }
    
    public static void vkSetLocalDimmingAMD(
            VkDevice device,
            VkSwapchainKHR swapChain,
            boolean localDimmingEnable)
    {
        nativeFunctionsProxyLibrary.vkSetLocalDimmingAMD(
                device,
                swapChain,
                localDimmingEnable);
    }
    
    public static void vkTrimCommandPool(
            VkDevice device,
            VkCommandPool commandPool,
            EnumSet<VkCommandPoolTrimFlagBits> flags)
    {
        nativeFunctionsProxyLibrary.vkTrimCommandPool(
                device,
                commandPool,
                flags);
    }
    
    public static void vkTrimCommandPoolKHR(
            VkDevice device,
            VkCommandPool commandPool,
            EnumSet<VkCommandPoolTrimFlagBits> flags)
    {
        nativeFunctionsProxyLibrary.vkTrimCommandPool(
                device,
                commandPool,
                flags);
    }
    
//    public static VkResult vkUnregisterObjectsNVX(
//            VkDevice device,
//            VkObjectTableNVX objectTable,
//            Collection<VkObjectEntryTypeNVX> objectEntryTypes,
//            int[] objectIndices)
//    {
//        if (objectEntryTypes.size() != objectIndices.length)
//        {
//            throw new IllegalArgumentException("objectEntryTypes and objectIndices MUST have the same number of elements.");
//        }
//        
//        return nativeFunctionsProxyLibrary.vkUnregisterObjectsNVX(
//                device,
//                objectTable,
//                objectEntryTypes,
//                objectIndices);
//    }
//    
    //TODO Fix this
    public static void vkUpdateDescriptorSetWithTemplate(
            VkDevice device,
            VkDescriptorSet descriptorSet,
            VkDescriptorUpdateTemplate descriptorUpdateTemplate,
            Collection<Object> data)
    {
        nativeFunctionsProxyLibrary.vkUpdateDescriptorSetWithTemplate(
                device,
                descriptorSet,
                descriptorUpdateTemplate,
                data);
    }
    
    //TODO Fix this
    public static void vkUpdateDescriptorSetWithTemplateKHR(
            VkDevice device,
            VkDescriptorSet descriptorSet,
            VkDescriptorUpdateTemplate descriptorUpdateTemplate,
            Collection<Object> data)
    {
        nativeFunctionsProxyLibrary.vkUpdateDescriptorSetWithTemplate(
                device,
                descriptorSet,
                descriptorUpdateTemplate,
                data);
    }
    
    public static void vkGetDescriptorSetLayoutSupport(
            VkDevice device,
            VkDescriptorSetLayoutCreateInfo createInfo,
            VkDescriptorSetLayoutSupport support)
    {
        nativeFunctionsProxyLibrary.vkGetDescriptorSetLayoutSupport(
                device,
                createInfo,
                support);
    }
    
    public static void vkGetDescriptorSetLayoutSupportKHR(
            VkDevice device,
            VkDescriptorSetLayoutCreateInfo createInfo,
            VkDescriptorSetLayoutSupport support)
    {
        nativeFunctionsProxyLibrary.vkGetDescriptorSetLayoutSupport(
                device,
                createInfo,
                support);
    }
    
    /**
     * 
     * @param device
     * @param heapIndex
     * @param localDeviceIndex
     * @param remoteDeviceIndex
     * @param peerMemoryFeatures should be set to EnumSet.noneOf(VkPeerMemoryFeatureFlagBits.class) before calling
     */
    public static void vkGetDeviceGroupPeerMemoryFeatures(
            VkDevice device,
            int heapIndex,
            int localDeviceIndex,
            int remoteDeviceIndex,
            EnumSet<VkPeerMemoryFeatureFlagBits> peerMemoryFeatures)
    {
        nativeFunctionsProxyLibrary.vkGetDeviceGroupPeerMemoryFeatures(
                device,
                heapIndex,
                localDeviceIndex,
                remoteDeviceIndex,
                peerMemoryFeatures);
    }
    
    /**
     * 
     * @param device
     * @param heapIndex
     * @param localDeviceIndex
     * @param remoteDeviceIndex
     * @param peerMemoryFeatures should be set to EnumSet.noneOf(VkPeerMemoryFeatureFlagBits.class) before calling
     */
    public static void vkGetDeviceGroupPeerMemoryFeaturesKHR(
            VkDevice device,
            int heapIndex,
            int localDeviceIndex,
            int remoteDeviceIndex,
            EnumSet<VkPeerMemoryFeatureFlagBits> peerMemoryFeatures)
    {
        nativeFunctionsProxyLibrary.vkGetDeviceGroupPeerMemoryFeatures(
                device,
                heapIndex,
                localDeviceIndex,
                remoteDeviceIndex,
                peerMemoryFeatures);
    }
    
    public static VkResult vkGetSemaphoreCounterValue(
            VkDevice device,
            VkSemaphore semaphore,
            LongReturnValue value)
    {
        return nativeFunctionsProxyLibrary.vkGetSemaphoreCounterValue(
                device,
                semaphore,
                value);
    }
    
    public static VkResult vkWaitSemaphores(
            VkDevice device,
            VkSemaphoreWaitInfo waitInfo,
            long timeout)
    {
        return nativeFunctionsProxyLibrary.vkWaitSemaphores(
                device,
                waitInfo,
                timeout);
    }
    
    public static VkResult vkSignalSemaphore(
            VkDevice device,
            VkSemaphoreSignalInfo signalInfo)
    {
        return nativeFunctionsProxyLibrary.vkSignalSemaphore(
                device,
                signalInfo);
    }
    
    public static VulkanHandle vkGetBufferOpaqueCaptureAddress(
            VkDevice device,
            VkBufferDeviceAddressInfo info)
    {
        return nativeFunctionsProxyLibrary.vkGetBufferOpaqueCaptureAddress(
                device,
                info);
    }
   
    public static VulkanHandle vkGetDeviceMemoryOpaqueCaptureAddress(
            VkDevice device,
            VkDeviceMemoryOpaqueCaptureAddressInfo info)
    {
        return nativeFunctionsProxyLibrary.vkGetDeviceMemoryOpaqueCaptureAddress(
                device,
                info);
    }
   
    public static VkResult vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR(
            VkPhysicalDevice physicalDevice,
            int queueFamilyIndex,
            IntReturnValue counterCount,
            Collection<VkPerformanceCounterKHR> counters,
            Collection<VkPerformanceCounterDescriptionKHR> counterDescriptions)
    {
        return nativeFunctionsProxyLibrary.vkEnumeratePhysicalDeviceQueueFamilyPerformanceQueryCountersKHR(
                physicalDevice,
                queueFamilyIndex,
                counterCount,
                counters,
                counterDescriptions);
    }
    
    public static void vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR(
            VkPhysicalDevice physicalDevice,
            VkQueryPoolPerformanceCreateInfoKHR performanceQueryCreateInfo,
            IntReturnValue numPasses)
    {
        nativeFunctionsProxyLibrary.vkGetPhysicalDeviceQueueFamilyPerformanceQueryPassesKHR(
                physicalDevice,
                performanceQueryCreateInfo,
                numPasses);
    }
    
    public static VkResult vkAcquireProfilingLockKHR(
            VkDevice device,
            VkAcquireProfilingLockInfoKHR info)
    {
        return nativeFunctionsProxyLibrary.vkAcquireProfilingLockKHR(
                device,
                info);
    }
    
    public static void vkReleaseProfilingLockKHR(
            VkDevice device)
    {
        nativeFunctionsProxyLibrary.vkReleaseProfilingLockKHR(
                device);
    }
    
    public static VkResult vkGetImageViewAddressNVX(
            VkDevice device,
            VkImageView imageView,
            VkImageViewAddressPropertiesNVX properties)
    {
        return nativeFunctionsProxyLibrary.vkGetImageViewAddressNVX(
                device,
                imageView,
                properties);
    }
    
    public static VkResult vkCreatePrivateDataSlotEXT(
            VkDevice device,
            VkPrivateDataSlotCreateInfoEXT createInfo,
            VkAllocationCallbacks alternateAllocator,
            VkPrivateDataSlotEXT privateDataSlot)
    {
        return nativeFunctionsProxyLibrary.vkCreatePrivateDataSlotEXT(
                device,
                createInfo,
                alternateAllocator,
                privateDataSlot);
    }
    
    public static void vkDestroyPrivateDataSlotEXT(
            VkDevice device,
            VkPrivateDataSlotEXT privateDataSlot,
            VkAllocationCallbacks alternateAllocator)
    {
        nativeFunctionsProxyLibrary.vkDestroyPrivateDataSlotEXT(
                device,
                privateDataSlot,
                alternateAllocator);
    }
    
    public static VkResult vkSetPrivateDataEXT(
            VkDevice device,
            VkObjectType objectType,
            long objectHandle,
            VkPrivateDataSlotEXT privateDataSlot,
            long data)
    {
        return nativeFunctionsProxyLibrary.vkSetPrivateDataEXT(
                device,
                objectType,
                objectHandle,
                 privateDataSlot,
                data);
    }
    
    public static void vkGetPrivateDataEXT(
            VkDevice device,
            VkObjectType objectType,
            long objectHandle,
            VkPrivateDataSlotEXT privateDataSlot,
            LongReturnValue data)
    {
        nativeFunctionsProxyLibrary.vkGetPrivateDataEXT(
                device,
                objectType,
                objectHandle,
                privateDataSlot,
                data);
    }
    
    public static VkResult vkGetPhysicalDeviceToolPropertiesEXT(
            VkPhysicalDevice                            physicalDevice,
            Collection<VkPhysicalDeviceToolPropertiesEXT> toolProperties)
    {
        return nativeFunctionsProxyLibrary.vkGetPhysicalDeviceToolPropertiesEXT(
                physicalDevice,
                toolProperties);
    }
    
    public static void vkGetGeneratedCommandsMemoryRequirementsNV(
            VkDevice device,
            VkGeneratedCommandsMemoryRequirementsInfoNV info,
            VkMemoryRequirements2 memoryRequirements)
    {
        nativeFunctionsProxyLibrary.vkGetGeneratedCommandsMemoryRequirementsNV(
                device,
                info,
                memoryRequirements);
    }
    
    public static void vkCmdPreprocessGeneratedCommandsNV(
            VkCommandBuffer commandBuffer,
            VkGeneratedCommandsInfoNV generatedCommandsInfo)
    {
        nativeFunctionsProxyLibrary.vkCmdPreprocessGeneratedCommandsNV(
                commandBuffer,
                generatedCommandsInfo);
    }
    
    public static void vkCmdExecuteGeneratedCommandsNV(
            VkCommandBuffer commandBuffer,
            boolean isPreprocessed,
            VkGeneratedCommandsInfoNV generatedCommandsInfo)
    {
        nativeFunctionsProxyLibrary.vkCmdExecuteGeneratedCommandsNV(
                commandBuffer,
                isPreprocessed,
                generatedCommandsInfo);
    }
    
    public static void vkCmdBindPipelineShaderGroupNV(
            VkCommandBuffer commandBuffer,
            VkPipelineBindPoint pipelineBindPoint,
            VkPipeline pipeline,
            int groupIndex)
    {
        nativeFunctionsProxyLibrary.vkCmdBindPipelineShaderGroupNV(
                commandBuffer,
                pipelineBindPoint,
                pipeline,
                groupIndex);
    }
    
    public static VkResult vkCreateIndirectCommandsLayoutNV(
            VkDevice device,
            VkIndirectCommandsLayoutCreateInfoNV createInfo,
            VkAllocationCallbacks allocator,
            VkIndirectCommandsLayoutNV indirectCommandsLayout)
    {
        return nativeFunctionsProxyLibrary.vkCreateIndirectCommandsLayoutNV(
                device,
                createInfo,
                allocator,
                indirectCommandsLayout);
    }
    
    public static void vkCmdSetCullModeEXT(
            VkCommandBuffer commandBuffer,
            EnumSet<VkCullModeFlagBits> cullMode)
    {
        nativeFunctionsProxyLibrary.vkCmdSetCullModeEXT(
                commandBuffer,
                cullMode);
    }
    
    public static void vkCmdSetFrontFaceEXT(
            VkCommandBuffer commandBuffer,
            VkFrontFace frontFace)
    {
        nativeFunctionsProxyLibrary.vkCmdSetFrontFaceEXT(
                commandBuffer,
                frontFace);
    }
    
    public static void vkCmdSetPrimitiveTopologyEXT(
            VkCommandBuffer commandBuffer,
            VkPrimitiveTopology primitiveTopology)
    {
        nativeFunctionsProxyLibrary.vkCmdSetPrimitiveTopologyEXT(
                commandBuffer,
                primitiveTopology);
    }
    
    public static void vkCmdSetViewportWithCountEXT(
            VkCommandBuffer commandBuffer,
            Collection<VkViewport> viewports)
    {
        nativeFunctionsProxyLibrary.vkCmdSetViewportWithCountEXT(
                commandBuffer,
                viewports);
    }
    
    public static void vkCmdSetScissorWithCountEXT(
            VkCommandBuffer commandBuffer,
            Collection<VkRect2D> scissors)
    {
        nativeFunctionsProxyLibrary.vkCmdSetScissorWithCountEXT(
                commandBuffer,
                scissors);
    }
    
    /**
     * Bind vertex buffers, along with their sizes and strides, to a command buffer for use in subsequent draw commands
     * <p>
     * Note: The length of the offsets array, the sizes array (if present), and the strides array (if present) <b>must</b>
     * be the same as the size of the collection of buffers.
     * 
     * @param commandBuffer the command buffer into which the command is recorded
     * @param firstBinding the index of the first vertex input binding whose state is updated by the command
     * @param buffers a collection of buffer handles
     * @param offsets an array of buffer offsets
     * @param sizes an optional array of the size in bytes of vertex data bound from buffers
     * @param strides an optional that when present is an array of buffer strides.
     */
    public static void vkCmdBindVertexBuffers2EXT(
            VkCommandBuffer commandBuffer,
            int firstBinding,
            Collection<VkBuffer> buffers,
            long[] offsets,
            long[] sizes,
            long[] strides)
    {
        if (offsets.length != buffers.size())
        {
            throw new IllegalArgumentException("Argument \"offsets\" MUST contain the same number of elements that are in the buffer collection.");
        }
        
        if (sizes != null && sizes.length != offsets.length)
        {
            throw new IllegalArgumentException("Argument \"sizes\" when present MUST contain the same number of elements that are in the offsets array.");
        }
        
        if (strides != null && strides.length != offsets.length)
        {
            throw new IllegalArgumentException("Argument \"strides\" when present MUST contain the same number of elements that are in the offsets array.");
        }
        
        nativeFunctionsProxyLibrary.vkCmdBindVertexBuffers2EXT(
                commandBuffer,
                firstBinding,
                buffers,
                offsets,
                sizes,
                strides);
    }
    
    public static void vkCmdSetDepthTestEnableEXT(
            VkCommandBuffer commandBuffer,
            boolean depthTestEnable)
    {
        nativeFunctionsProxyLibrary.vkCmdSetDepthTestEnableEXT(
                commandBuffer,
                depthTestEnable);
    }
    
    public static void vkCmdSetDepthWriteEnableEXT(
            VkCommandBuffer commandBuffer,
            boolean depthWriteEnable)
    {
        nativeFunctionsProxyLibrary.vkCmdSetDepthWriteEnableEXT(
                commandBuffer,
                depthWriteEnable);
    }
    
    public static void vkCmdSetDepthCompareOpEXT(
            VkCommandBuffer commandBuffer,
            VkCompareOp depthCompareOp)
    {
        nativeFunctionsProxyLibrary.vkCmdSetDepthCompareOpEXT(
                commandBuffer,
                depthCompareOp);
    }
    
    public static void vkCmdSetDepthBoundsTestEnableEXT(
            VkCommandBuffer commandBuffer,
            boolean depthBoundsTestEnable)
    {
        nativeFunctionsProxyLibrary.vkCmdSetDepthBoundsTestEnableEXT(
                commandBuffer,
                depthBoundsTestEnable);
    }
    
    public static void vkCmdSetStencilTestEnableEXT(
            VkCommandBuffer commandBuffer,
            boolean stencilTestEnable)
    {
        nativeFunctionsProxyLibrary.vkCmdSetStencilTestEnableEXT(
                commandBuffer,
                stencilTestEnable);
    }
    
    public static void vkCmdSetStencilOpEXT(
            VkCommandBuffer commandBuffer,
            EnumSet<VkStencilFaceFlagBits> faceMask,
            VkStencilOp failOp,
            VkStencilOp passOp,
            VkStencilOp depthFailOp,
            VkCompareOp compareOp)
    {
        nativeFunctionsProxyLibrary.vkCmdSetStencilOpEXT(
                commandBuffer,
                faceMask,
                failOp,
                passOp,
                depthFailOp,
                compareOp);
    }

    
    
    
    
    

    

    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * Copies the entire contents of the specified ByteBuffer to the virtual
     * memory address contained in the MappedMemoryPointer object.
     * @param floatBuffer
     * @param pointerToMappedMemory
     */
    public static void pushDataToVirtualMemory(
            ByteBuffer byteBuffer,
            MappedMemoryPointer pointerToMappedMemory)
    {
        if (byteBuffer.hasArray() == false)
        {
            throw new IllegalArgumentException("byteBuffer is not array backed.");
        }

        nativeFunctionsProxyLibrary.pushDataToVirtualMemory(byteBuffer.array(), pointerToMappedMemory);
    }

    /**
     * Copies the entire contents of the specified byte array to the virtual
     * memory address contained in the MappedMemoryPointer object.
     * @param byteArray
     * @param pointerToMappedMemory
     */
    public static void pushDataToVirtualMemory(
            byte[] byteArray,
            MappedMemoryPointer pointerToMappedMemory)
    {
        nativeFunctionsProxyLibrary.pushDataToVirtualMemory(byteArray, pointerToMappedMemory);
    }

    /**
     * Copies the entire contents of the specified FloatBuffer to the virtual
     * memory address contained in the MappedMemoryPointer object.
     * @param floatBuffer
     * @param pointerToMappedMemory
     */
    public static void pushDataToVirtualMemory(
            FloatBuffer floatBuffer,
            MappedMemoryPointer pointerToMappedMemory)
    {
        if (floatBuffer.hasArray() == false)
        {
            throw new IllegalArgumentException("floatBuffer is not array backed.");
        }
        
        nativeFunctionsProxyLibrary.pushDataToVirtualMemory(floatBuffer.array(), pointerToMappedMemory);
    }

    /**
     * Copies the entire contents of the specified float array to the virtual
     * memory address contained in the MappedMemoryPointer object.
     * @param floatArray
     * @param pointerToMappedMemory
     */
    public static void pushDataToVirtualMemory(
            float[] floatArray,
            MappedMemoryPointer pointerToMappedMemory)
    {
        nativeFunctionsProxyLibrary.pushDataToVirtualMemory(floatArray, pointerToMappedMemory);
    }

    /**
     * Copies the entire contents of the specified IntBuffer to the virtual
     * memory address contained in the MappedMemoryPointer object.
     * <p>
     * Note: Since Java is a language that was designed for bed wetters who
     * cannot understand the difference between signed and unsigned integers
     * you will need to use this to copy "unsigned" 32 bit integers as well.
     * Just remember that values greater than 0x7FFFFFFF will appear as 
     * negative numbers in Java.
     * @param intBuffer
     * @param pointerToMappedMemory
     */
    public static void pushDataToVirtualMemory(
            IntBuffer intBuffer,
            MappedMemoryPointer pointerToMappedMemory)
    {
        if (intBuffer.hasArray() == false)
        {
            throw new IllegalArgumentException("intBuffer is not array backed.");
        }
        
        nativeFunctionsProxyLibrary.pushDataToVirtualMemory(intBuffer.array(), pointerToMappedMemory);
    }

    /**
     * Copies the entire contents of the specified inst array to the virtual
     * memory address contained in the MappedMemoryPointer object.
     * <p>
     * Note: Since Java is a language that was designed for bed wetters who
     * cannot understand the difference between signed and unsigned integers
     * you will need to use this to copy "unsigned" 32 bit integers as well.
     * Just remember that values greater than 0x7FFFFFFF will appear as 
     * negative numbers in Java.
     * @param intArray
     * @param pointerToMappedMemory
     */
    public static void pushDataToVirtualMemory(
            int[] intArray,
            MappedMemoryPointer pointerToMappedMemory)
    {
        nativeFunctionsProxyLibrary.pushDataToVirtualMemory(intArray, pointerToMappedMemory);
    }

    
    
    
    
//    public static void copyArray(
//            byte[] byteArray,
//            VoidPointer pData)
//    {
//        
//    }
//    
//    public static void copyArray(
//            int[] intArray,
//            VoidPointer pData)
//    {
//        
//    }
//    
//    public static void copyArray(
//            float[] floatArray,
//            VoidPointer pData)
//    {
//        
//    }
    
    
    
    
    
    
    
    
    
        
    /**
     * Connect to a Wayland display server.
     * @param displayName - the name of the Wayland display server to attach to.
     * If <code>null</code> is used for this argument the value of the environment
     * variable <b>WAYLAND_DISPLAY</b> will be used.  If the environment variable
     *  is not set a value of <b>wayland-0</b> will be substituted.
     * @param waylandDisplay - if this method is successful this will contain the
     * handle to the attached Wayland display server.
     */
//    public static WlDisplayHandle wlConnectDisplay(
//            String    displayName)
//    {
//        return v11ProxyLibrary.wlConnectDisplay(displayName);
//    }
//
    public static WlDisplayHandle wlDisplayConnect(
            String    displayName,
            LinkedBlockingQueue<WaylandEventObject> eventHandlerWorkQueue)
    {
        return nativeFunctionsProxyLibrary.wlDisplayConnect(
                displayName,
                eventHandlerWorkQueue);
    }
    
    public static void wlDisplayDisconnect(
            WlDisplayHandle waylandDisplay)
    {
        nativeFunctionsProxyLibrary.wlDisplayDisconnect(waylandDisplay);
    }
    
    public static void wlDisplayDispatch(
            WlDisplayHandle waylandDisplay)
    {
        nativeFunctionsProxyLibrary.wlDisplayDispatch(waylandDisplay);
    }
    
    public static int wlDisplayDispatchPending(
            WlDisplayHandle waylandDisplay)
    {
        return nativeFunctionsProxyLibrary.wlDisplayDispatchPending(waylandDisplay);
    }
    
    public static int wlDisplayFlush(
            WlDisplayHandle waylandDisplay)
    {
        return nativeFunctionsProxyLibrary.wlDisplayFlush(waylandDisplay);
    }
    
    public static WlRegistryHandle wlDisplayGetRegistry(
            WlDisplayHandle waylandDisplay)
    {
        return nativeFunctionsProxyLibrary.wlDisplayGetRegistry(waylandDisplay);
    }
    
    public static int wlDisplayPrepareRead(
            WlDisplayHandle waylandDisplay)
    {
        return nativeFunctionsProxyLibrary.wlDisplayPrepareRead(waylandDisplay);
    }
    
    public static int wlDisplayReadEvents(
            WlDisplayHandle waylandDisplay)
    {
        return nativeFunctionsProxyLibrary.wlDisplayReadEvents(waylandDisplay);
    }
    

    public static void wlDisplayRoundTrip(
            WlDisplayHandle waylandDisplay)
    {
        nativeFunctionsProxyLibrary.wlDisplayRoundTrip(waylandDisplay);
    }
    
    public static void wlDisplaySync(
            WlDisplayHandle waylandDisplay)
    {
        nativeFunctionsProxyLibrary.wlDisplaySync(waylandDisplay);
    }
    
    public static VulkanHandle wlRegistryBind(
            WlRegistryHandle waylandRegistry,
            int interfaceId,
            String textInterfaceName,
            int interfaceVersion)
    {
        return nativeFunctionsProxyLibrary.wlRegistryBind(
                waylandRegistry,
                interfaceId,
                textInterfaceName,
                interfaceVersion);
    }
    
    public static WlRegionHandle wlCompositorCreateRegion(
            WlCompositorHandle waylandCompositor)
    {
        return nativeFunctionsProxyLibrary.wlCompositorCreateRegion(waylandCompositor);
    }
    
    public static WlSurfaceHandle wlCompositorCreateSurface(
            WlCompositorHandle waylandCompositor)
    {
        return nativeFunctionsProxyLibrary.wlCompositorCreateSurface(waylandCompositor);
    }
    
    public static void wlKeyboardRelease(
            WlKeyboardHandle waylandKeyboard)
    {
        nativeFunctionsProxyLibrary.wlKeyboardRelease(waylandKeyboard);
    }
    
    public static void wlPointerRelease(
            WlPointerHandle waylandPointer)
    {
        nativeFunctionsProxyLibrary.wlPointerRelease(waylandPointer);
    }
    
    public static void wlPointerSetCursor(
            WlPointerHandle waylandPointer,
            int serialNumber,
            WlSurfaceHandle waylandSurface,
            int x,
            int y)
    {
        nativeFunctionsProxyLibrary.wlPointerSetCursor(waylandPointer, serialNumber, waylandSurface, x, y);
    }
    
    public static WlKeyboardHandle wlSeatGetKeyboard(
            WlSeatHandle waylandSeat)
    {
        return nativeFunctionsProxyLibrary.wlSeatGetKeyboard(waylandSeat);
    }
    
    public static WlPointerHandle wlSeatGetPointer(
            WlSeatHandle waylandSeat)
    {
        return nativeFunctionsProxyLibrary.wlSeatGetPointer(waylandSeat);
    }
    
    public static WlTouchHandle wlSeatGetTouch(
            WlSeatHandle waylandSeat)
    {
        return nativeFunctionsProxyLibrary.wlSeatGetTouch(waylandSeat);
    }
    
    public static void wlSeatRelease(
            WlSeatHandle waylandSeat)
    {
        nativeFunctionsProxyLibrary.wlSeatRelease(waylandSeat);
    }
    
    public static WlShellSurfaceHandle wlShellGetShellSurface(
            WlShellHandle waylandShellInterface,
            WlSurfaceHandle waylandSurface)
    {
        return nativeFunctionsProxyLibrary.wlShellGetShellSurface(waylandShellInterface, waylandSurface);
    }

    public static void wlShellSurfaceMove(
            WlShellSurfaceHandle waylandshellSurface,
            WlSeatHandle waylandSeat,
            int serialNumber)
    {
        nativeFunctionsProxyLibrary.wlShellSurfaceMove(waylandshellSurface, waylandSeat, serialNumber);
    }
    
    public static void wlShellSurfacePong(
            WlShellSurfaceHandle waylandshellSurface,
            int serialNumber)
    {
        nativeFunctionsProxyLibrary.wlShellSurfacePong(waylandshellSurface, serialNumber);
    }
    
    public static void wlShellSurfaceResize(
            WlShellSurfaceHandle waylandshellSurface,
            WlSeatHandle waylandSeat,
            int serialNumber,
            WlShellSurfaceResize edges)
    {
        nativeFunctionsProxyLibrary.wlShellSurfaceResize(
                waylandshellSurface,
                waylandSeat,
                serialNumber,
                edges);
    }
    
    public static void wlShellSurfaceSetClass(
            WlShellSurfaceHandle waylandshellSurface,
            String className)
    {
        nativeFunctionsProxyLibrary.wlShellSurfaceSetClass(waylandshellSurface, className);
    }
    
    public static void wlShellSurfaceSetFullscreen(
            WlShellSurfaceHandle waylandshellSurface,
            WlShellSurfaceFullscreenMethod method,
            int framerate,
            WlOutputHandle waylandOutput)
    {
        nativeFunctionsProxyLibrary.wlShellSurfaceSetFullscreen(
                waylandshellSurface,
                method,
                framerate,
                waylandOutput);
    }
    
    public static void wlShellSurfaceSetMaximized(
            WlShellSurfaceHandle waylandshellSurface,
            WlOutputHandle waylandOutput)
    {
        nativeFunctionsProxyLibrary.wlShellSurfaceSetMaximized(waylandshellSurface, waylandOutput);
    }
    
    public static void wlShellSurfaceSetPopup(
            WlShellSurfaceHandle waylandshellSurface,
            WlSeatHandle waylandSeat,
            int serialNumber,
            WlSurfaceHandle parentSurface,
            int x,
            int y,
            EnumSet<WlShellSurfaceTransientBehavior> flags)
    {
        nativeFunctionsProxyLibrary.wlShellSurfaceSetPopup(
                waylandshellSurface,
                waylandSeat,
                serialNumber,
                parentSurface,
                x,
                y,
                flags);
    }
    
    public static void wlShellSurfaceSetTitle(
            WlShellSurfaceHandle waylandshellSurface,
            byte[] surfaceTitle)
    {
        nativeFunctionsProxyLibrary.wlShellSurfaceSetTitle(waylandshellSurface, surfaceTitle);
    }
    
    public static void wlShellSurfaceSetTopLevel(
            WlShellSurfaceHandle waylandshellSurface)
    {
        nativeFunctionsProxyLibrary.wlShellSurfaceSetTopLevel(waylandshellSurface);
    }
    
    /**
     * 
     * @param waylandshellSurface
     * @param parentSurface
     * @param x
     * @param y
     * @param flags
     */
    public static void wlShellSurfaceSetTransient(
            WlShellSurfaceHandle waylandshellSurface,
            WlSurfaceHandle parentSurface,
            int x,
            int y,
            EnumSet<WlShellSurfaceTransientBehavior> flags)
    {
        nativeFunctionsProxyLibrary.wlShellSurfaceSetTransient(
                waylandshellSurface,
                parentSurface,
                x,
                y,
                flags);
    }
    
    public static void wlSurfaceCommit(
            WlSurfaceHandle waylandSurfaceHandle)
    {
        nativeFunctionsProxyLibrary.wlSurfaceCommit(
                waylandSurfaceHandle);
    }
    
    public static void wlSurfaceDamage(
            WlSurfaceHandle waylandSurfaceHandle,
            int x,
            int y,
            int width,
            int height)
    {
        nativeFunctionsProxyLibrary.wlSurfaceDamage(
                waylandSurfaceHandle,
                x,
                y,
                width,
                height);
    }
}
