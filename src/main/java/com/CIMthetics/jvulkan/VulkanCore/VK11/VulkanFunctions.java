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

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingQueue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkDescriptorBufferInfo;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkDescriptorImageInfo;
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
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.CreateInfos.VkApplicationInfo;
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

    private static NativeProxies v11ProxyLibrary;
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

        v11ProxyLibrary = new NativeProxies();
    }
    
//    static
//    {
//        System.load("/home/dkaip/JavaWorkspaces/CIMthetics/jvulkan-natives-Linux-x86_64/Debug/libjvulkan-natives-Linux-x86_64.so");
//        
//        v11ProxyLibrary = new NativeProxies();
//    }
//
    public static int VK_API_VERSION_1_1()
    {
        return VK_MAKE_VERSION(1, 1, 0);
    }
    
    public static int VK_API_VERSION_1_0()
    {
        return VK_MAKE_VERSION(1, 0, 0);
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
        return v11ProxyLibrary.vkCreateInstance(instanceCreateInfo, alternateAllocator, vkInstance);
    }
    
    public static void vkDestroyInstance(VkInstance vkInstance, VkAllocationCallbacks alternateAllocator)
    {
        v11ProxyLibrary.vkDestroyInstance(vkInstance, alternateAllocator);
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
            
        return v11ProxyLibrary.vkEnumeratePhysicalDevices(vkInstance, collectionOfPhysicalDevices);
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
        
        return v11ProxyLibrary.vkEnumerateDeviceExtensionProperties(
                physicalDevice,
                layerName,
                collectionOfExtensionProperties);
    }

    public static VkResult vkAllocateCommandBuffers(
            VkDevice vulkanLogicalDevice,
            VkCommandBufferAllocateInfo commandBufferAllocateInfo,
            Collection<VkCommandBuffer> commandBufferCollection)
    {
        return v11ProxyLibrary.vkAllocateCommandBuffers(
                vulkanLogicalDevice,
                commandBufferAllocateInfo,
                commandBufferCollection);
    }
    
    public static VkResult vkAllocateDescriptorSets(
            VkDevice vulkanLogicalDevice,
            VkDescriptorSetAllocateInfo vkDescriptorSetAllocateInfo,
            Collection<VkDescriptorSet> descriptorSets)
    {
        return v11ProxyLibrary.vkAllocateDescriptorSets(
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
        return v11ProxyLibrary.vkAllocateMemory(
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
            
        v11ProxyLibrary.vkGetPhysicalDeviceQueueFamilyProperties(physicalDevice, collectionOfQueueFamilyProperties);
    }
    
    
    
    // TODO the debug stuff may need to move elsewhere
    public static VkResult vkCreateDebugReportCallbackEXT(
            VkInstance vkInstance,
            VkDebugReportCallbackCreateInfoEXT dbgCreateInfo,
            VkAllocationCallbacks alternateAllocator,
            VkDebugReportCallbackEXT callback)
    {
        return v11ProxyLibrary.vkCreateDebugReportCallbackEXT(
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
        v11ProxyLibrary.vkDestroyDebugReportCallbackEXT(vkInstance, debugCallbackHandle, alternateAllocator);
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
        v11ProxyLibrary.vkGetDeviceQueue(logicalDevice, queueFamilyIndex, queueIndex, queue);
    }
    
    public static void vkGetPhysicalDeviceProperties(
            VkPhysicalDevice physicalDevice,
            VkPhysicalDeviceProperties deviceProperties)
    {
        v11ProxyLibrary.vkGetPhysicalDeviceProperties(physicalDevice, deviceProperties);
    }
    
    public static void vkGetPhysicalDeviceProperties2(
            VkPhysicalDevice physicalDevice,
            VkPhysicalDeviceProperties2 deviceProperties)
    {
        v11ProxyLibrary.vkGetPhysicalDeviceProperties2(physicalDevice, deviceProperties);
    }
    
    public static void vkGetPhysicalDeviceProperties2KHR(
            VkPhysicalDevice physicalDevice,
            VkPhysicalDeviceProperties2 deviceProperties)
    {
        v11ProxyLibrary.vkGetPhysicalDeviceProperties2KHR(physicalDevice, deviceProperties);
    }
    
    public static void vkGetPhysicalDeviceFeatures(
            VkPhysicalDevice physicalDevice,
            VkPhysicalDeviceFeatures deviceFeatures)
    {
        v11ProxyLibrary.vkGetPhysicalDeviceFeatures(physicalDevice, deviceFeatures);
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
        
        return v11ProxyLibrary.vkCreateDevice(
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
        
        v11ProxyLibrary.vkDestroyDevice(device, alternateAllocator);
    }
    
    public static VkResult vkCreateWaylandSurfaceKHR(
            VkInstance vkInstance,
            VkWaylandSurfaceCreateInfoKHR vkWaylandSurfaceCreateInfoKHR,
            VkAllocationCallbacks alternateAllocator,
            VkSurfaceKHR vkSurfaceVKR)
    {
        return v11ProxyLibrary.vkCreateWaylandSurfaceKHR(
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
        return v11ProxyLibrary.vkGetPhysicalDeviceWaylandPresentationSupportKHR(
                physicalDevice,
                queueFamilyIndex,
                waylandDisplay);
    }
    

    public static void vkDestroySurfaceKHR(
            VkInstance vulkanInstance,
            VkSurfaceKHR windowSurfaceHandle,
            VkAllocationCallbacks alternateAllocator)
    {
        v11ProxyLibrary.vkDestroySurfaceKHR(
                vulkanInstance,
                windowSurfaceHandle,
                alternateAllocator);
    }
    
    public static VkResult vkGetPhysicalDeviceSurfaceCapabilitiesKHR(
            VkPhysicalDevice physicalDevice,
            VkSurfaceKHR     surface,
            VkSurfaceCapabilitiesKHR surfaceCapabilities)
    {
        return v11ProxyLibrary.vkGetPhysicalDeviceSurfaceCapabilitiesKHR(
                physicalDevice,
                surface,
                surfaceCapabilities);
    }
    
    public static VkResult vkGetPhysicalDeviceSurfaceFormatsKHR(
            VkPhysicalDevice physicalDevice,
            VkSurfaceKHR     surface,
            Collection<VkSurfaceFormatKHR> surfaceFormats)
    {
        return v11ProxyLibrary.vkGetPhysicalDeviceSurfaceFormatsKHR(
                physicalDevice,
                surface,
                surfaceFormats);
    }
    
    public static VkResult vkGetPhysicalDeviceSurfacePresentModesKHR(
            VkPhysicalDevice physicalDevice,
            VkSurfaceKHR     surface,
            Collection<VkPresentModeKHR> presentationModes)
    {
        return v11ProxyLibrary.vkGetPhysicalDeviceSurfacePresentModesKHR(
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
            boolean[] isSupported)
    {
        return v11ProxyLibrary.vkGetPhysicalDeviceSurfaceSupportKHR(
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
        return v11ProxyLibrary.vkCreateSwapchainKHR(
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
        v11ProxyLibrary.vkDestroySwapchainKHR(
                vulkanLogicalDevice,
                swapchainHandle,
                alternateAllocator);
    }
    
    public static void vkDestroyImageView(
            VkDevice vulkanLogicalDevice,
            VkImageView imageViewHandle,
            VkAllocationCallbacks alternateAllocator)
    {
        v11ProxyLibrary.vkDestroyImageView(
                vulkanLogicalDevice,
                imageViewHandle,
                alternateAllocator);
    }
    
    public static void vkDestroyFramebuffer(
            VkDevice vulkanLogicalDevice,
            VkFramebuffer frameBufferHandle,
            VkAllocationCallbacks alternateAllocator)
    {
        v11ProxyLibrary.vkDestroyFramebuffer(
                vulkanLogicalDevice,
                frameBufferHandle,
                alternateAllocator);
    }
    
    public static void vkDestroyRenderPass(
            VkDevice vulkanLogicalDevice,
            VkRenderPass renderPassHandle,
            VkAllocationCallbacks alternateAllocator)
    {
        v11ProxyLibrary.vkDestroyRenderPass(
                vulkanLogicalDevice,
                renderPassHandle,
                alternateAllocator);
    }
    
    public static void vkDestroyPipelineLayout(
            VkDevice vulkanLogicalDevice,
            VkPipelineLayout pipelineLayoutHandle,
            VkAllocationCallbacks alternateAllocator)
    {
        v11ProxyLibrary.vkDestroyPipelineLayout(
                vulkanLogicalDevice,
                pipelineLayoutHandle,
                alternateAllocator);
    }
    
    public static void vkDestroyPipeline(
            VkDevice vulkanLogicalDevice,
            VkPipeline pipelineHandle,
            VkAllocationCallbacks alternateAllocator)
    {
        v11ProxyLibrary.vkDestroyPipeline(
                vulkanLogicalDevice,
                pipelineHandle,
                alternateAllocator);
    }
    
    public static void vkFreeCommandBuffers(
            VkDevice vulkanLogicalDevice,
            VkCommandPool commandPoolHandle,
            Collection<VkCommandBuffer> commandBufferHandles)
    {
        v11ProxyLibrary.vkFreeCommandBuffers(
                vulkanLogicalDevice,
                commandPoolHandle,
                commandBufferHandles);
    }
    
    public static void vkDestroyImage(
            VkDevice vulkanLogicalDevice,
            VkImage imageHandle,
            VkAllocationCallbacks alternateAllocator)
    {
        v11ProxyLibrary.vkDestroyImage(
                vulkanLogicalDevice,
                imageHandle,
                alternateAllocator);
    }
    
    public static VkResult vkGetSwapchainImagesKHR(
            VkDevice vulkanLogicalDevice,
            VkSwapchainKHR swapchain,
            Collection<VkImage> swapchainImages)
    {
        return v11ProxyLibrary.vkGetSwapchainImagesKHR(
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
        return v11ProxyLibrary.vkCreateImageView(
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
        return v11ProxyLibrary.vkCreateRenderPass(
                vulkanLogicalDevice,
                renderPassCreateInfo,
                alternateAllocator,
                renderPassHandle);
    }
    
    public static VkResult vkCreateRenderPass2KHR(
            VkDevice vulkanLogicalDevice,
            VkRenderPassCreateInfo2KHR renderPassCreateInfo2KHR,
            VkAllocationCallbacks alternateAllocator,
            VkRenderPass renderPassHandle)
    {
        return v11ProxyLibrary.vkCreateRenderPass2KHR(
                vulkanLogicalDevice,
                renderPassCreateInfo2KHR,
                alternateAllocator,
                renderPassHandle);
    }
    
    public static VkResult vkCreateShaderModule(
            VkDevice vulkanLogicalDevice,
            VkShaderModuleCreateInfo shaderModuleCreateInfo,
            VkAllocationCallbacks alternateAllocator,
            VkShaderModule shaderModule)
    {
        return v11ProxyLibrary.vkCreateShaderModule(
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
        return v11ProxyLibrary.vkCreatePipelineLayout(
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
        
        return v11ProxyLibrary.vkCreateGraphicsPipelines(
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
        return v11ProxyLibrary.vkCreateFramebuffer(
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
        return v11ProxyLibrary.vkCreateCommandPool(
                vulkanLogicalDevice,
                vkCommandPoolCreateInfo,
                alternateAllocator,
                commandPool);
    }
    
    public static VkResult vkBeginCommandBuffer(
            VkCommandBuffer vkCommandBuffer,
            VkCommandBufferBeginInfo vkCommandBufferBeginInfo)
    {
        return v11ProxyLibrary.vkBeginCommandBuffer(
                vkCommandBuffer,
                vkCommandBufferBeginInfo);
    }
    
    public static void vkCmdBeginConditionalRenderingEXT(
            VkCommandBuffer vkCommandBuffer,
            VkConditionalRenderingBeginInfoEXT vkConditionalRenderingBeginInfoEXT)
    {
        v11ProxyLibrary.vkCmdBeginConditionalRenderingEXT(
                vkCommandBuffer,
                vkConditionalRenderingBeginInfoEXT);
    }
    
    public static void vkCmdBeginRenderPass(
            VkCommandBuffer vkCommandBuffer,
            VkRenderPassBeginInfo vkRenderPassBeginInfo,
            VkSubpassContents vkSubpassContents)
    {
        v11ProxyLibrary.vkCmdBeginRenderPass(
                vkCommandBuffer,
                vkRenderPassBeginInfo,
                vkSubpassContents);
    }
    
    public static void vkCmdBeginRenderPass2KHR(
            VkCommandBuffer vkCommandBuffer,
            VkRenderPassBeginInfo vkRenderPassBeginInfo,
            VkSubpassBeginInfoKHR vkSubpassContents)
    {
        v11ProxyLibrary.vkCmdBeginRenderPass2KHR(
                vkCommandBuffer,
                vkRenderPassBeginInfo,
                vkSubpassContents);
    }
    
    public static void vkCmdBindPipeline(
            VkCommandBuffer vkCommandBuffer,
            VkPipelineBindPoint vkPipelineBindPoint,
            VkPipeline vkPipeline)
    {
        v11ProxyLibrary.vkCmdBindPipeline(
                vkCommandBuffer,
                vkPipelineBindPoint,
                vkPipeline);
    }
    
    public static void vkCmdBindShadingRateImageNV(
            VkCommandBuffer vkCommandBuffer,
            VkImageView imageView,
            VkImageLayout imageLayout)
    {
        v11ProxyLibrary.vkCmdBindShadingRateImageNV(
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
        v11ProxyLibrary.vkCmdDraw(
                vkCommandBuffer,
                vertexCount,
                instanceCount,
                firstVertex,
                firstInstance);
    }

    public static void vkCmdEndConditionalRenderingEXT(
            VkCommandBuffer vkCommandBuffer)
    {
        v11ProxyLibrary.vkCmdEndConditionalRenderingEXT(
                vkCommandBuffer);
    }
    
    public static void vkCmdEndRenderPass(
            VkCommandBuffer vkCommandBuffer)
    {
        v11ProxyLibrary.vkCmdEndRenderPass(
                vkCommandBuffer);
    }
    
    public static void vkCmdEndRenderPass2KHR(
            VkCommandBuffer vkCommandBuffer,
            VkSubpassEndInfoKHR subpassEndInfoKHR)
    {
        v11ProxyLibrary.vkCmdEndRenderPass2KHR(
                vkCommandBuffer,
                subpassEndInfoKHR);
    }
    
    public static void vkCmdNextSubpass2KHR(
            VkCommandBuffer vkCommandBuffer,
            VkSubpassBeginInfoKHR subpassBeginInfoKHR,
            VkSubpassEndInfoKHR subpassEndInfoKHR)
    {
        v11ProxyLibrary.vkCmdNextSubpass2KHR(
                vkCommandBuffer,
                subpassBeginInfoKHR,
                subpassEndInfoKHR);
    }
    
    public static void vkCmdSetCoarseSampleOrderNV(
            VkCommandBuffer vkCommandBuffer,
            VkCoarseSampleOrderTypeNV sampleOrderType,
            Collection<VkCoarseSampleOrderCustomNV> customSampleOrders)
    {
        v11ProxyLibrary.vkCmdSetCoarseSampleOrderNV(
                vkCommandBuffer,
                sampleOrderType,
                customSampleOrders);
    }
    
    public static void vkCmdSetViewportShadingRatePaletteNV(
            VkCommandBuffer vkCommandBuffer,
            int firstViewport,
            Collection<VkShadingRatePaletteNV> shadingRatePalettes)
    {
        v11ProxyLibrary.vkCmdSetViewportShadingRatePaletteNV(
                vkCommandBuffer,
                firstViewport,
                shadingRatePalettes);
    }
    
    public static void vkCmdWriteAccelerationStructuresPropertiesNV(
            VkCommandBuffer vkCommandBuffer,
            Collection<VkAccelerationStructureNV> accelerationStructures,
            VkQueryType queryType,
            VkQueryPool queryPool,
            int queryPoolIndex)
    {
        v11ProxyLibrary.vkCmdWriteAccelerationStructuresPropertiesNV(
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
        return v11ProxyLibrary.vkCompileDeferredNV(
                vulkanLogicalDevice,
                pipeline,
                shader);
    }
    
    public static VkResult vkEndCommandBuffer(
            VkCommandBuffer vkCommandBuffer)
    {
        return v11ProxyLibrary.vkEndCommandBuffer(
                vkCommandBuffer);
    }
    
    public static void vkDestroyCommandPool(
            VkDevice vulkanLogicalDevice,
            VkCommandPool commandommandPoolHandle,
            VkAllocationCallbacks alternateAllocator)
    {
        v11ProxyLibrary.vkDestroyCommandPool(
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
        return v11ProxyLibrary.vkCreateSemaphore(
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
        v11ProxyLibrary.vkDestroySemaphore(
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
        return v11ProxyLibrary.vkCreateFence(
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
        v11ProxyLibrary.vkDestroyFence(
                vulkanLogicalDevice,
                vkFence,
                alternateAllocator);
    }
    
    public static VkResult vkDeviceWaitIdle(
            VkDevice vulkanLogicalDevice)
    {
        return v11ProxyLibrary.vkDeviceWaitIdle(
                vulkanLogicalDevice);
    }
    
    public static void vkDestroyShaderModule(
            VkDevice vulkanLogicalDevice,
            VkShaderModule vkShaderModule,
            VkAllocationCallbacks alternateAllocator)
    {
        v11ProxyLibrary.vkDestroyShaderModule(
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
        return v11ProxyLibrary.vkWaitForFences(
                vulkanLogicalDevice,
                vkFences,
                waitAll,
                timeout);
    }
    
    public static void vkResetFences(
            VkDevice vulkanLogicalDevice,
            Collection<VkFence> vkFences)
    {
        v11ProxyLibrary.vkResetFences(
                vulkanLogicalDevice,
                vkFences);
    }
    
    
    public static VkResult vkAcquireNextImage2KHR(
            VkDevice vulkanLogicalDevice,
            VkAcquireNextImageInfoKHR acquireInfo,
            int imageIndex)
    {
        return v11ProxyLibrary.vkAcquireNextImage2KHR(
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
        return v11ProxyLibrary.vkAcquireNextImageKHR(
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
        return v11ProxyLibrary.vkQueueSubmit(
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

        return v11ProxyLibrary.vkQueueSubmit(
                queue,
                submitInfoCollection,
                fence);
    }
    
    public static VkResult vkQueuePresentKHR(
            VkQueue queue,
            VkPresentInfoKHR vkPresentInfoKHR)
    {
        return v11ProxyLibrary.vkQueuePresentKHR(
                queue,
                vkPresentInfoKHR);
    }
    
    public static VkResult vkCreateAccelerationStructureNV(
            VkDevice vkDevice,
            VkAccelerationStructureCreateInfoNV createInfo,
            VkAllocationCallbacks alternateAllocator,
            VkAccelerationStructureNV accelerationStructure)
    {
        return v11ProxyLibrary.vkCreateAccelerationStructureNV(
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
        return v11ProxyLibrary.vkCreateBuffer(
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
        return v11ProxyLibrary.vkCreateBufferView(
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
        
        return v11ProxyLibrary.vkCreateComputePipelines(
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
        return v11ProxyLibrary.vkCreateRayTracingPipelinesNV(
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
    public static VkResult vkGetAccelerationStructureHandleNVX(
            VkDevice vulkanLogicalDevice,
            VkAccelerationStructureNV accelerationStructure,
            Collection<VkAccelerationStructureNV> data)
    {
        return v11ProxyLibrary.vkGetAccelerationStructureHandleNVX(
                vulkanLogicalDevice,
                accelerationStructure,
                data);
    }
    
    public static void vkGetAccelerationStructureMemoryRequirementsNV(
            VkDevice vulkanLogicalDevice,
            VkAccelerationStructureMemoryRequirementsInfoNV vkAccelerationStructureMemoryRequirementsInfoNV,
            VkMemoryRequirements2KHR vkMemoryRequirements2KHR)
    {
        v11ProxyLibrary.vkGetAccelerationStructureMemoryRequirementsNV(
                vulkanLogicalDevice,
                vkAccelerationStructureMemoryRequirementsInfoNV,
                vkMemoryRequirements2KHR);
    }
    
    public static void vkGetAccelerationStructureScratchMemoryRequirementsNVX(
            VkDevice vulkanLogicalDevice,
            VkAccelerationStructureMemoryRequirementsInfoNV vkAccelerationStructureMemoryRequirementsInfoNVX,
            VkMemoryRequirements2KHR vkMemoryRequirements2KHR)
    {
        v11ProxyLibrary.vkGetAccelerationStructureScratchMemoryRequirementsNVX(
                vulkanLogicalDevice,
                vkAccelerationStructureMemoryRequirementsInfoNVX,
                vkMemoryRequirements2KHR);

    }
    
    public static void vkGetBufferMemoryRequirements(
            VkDevice vulkanLogicalDevice,
            VkBuffer vkBuffer,
            VkMemoryRequirements vkMemoryRequirements)
    {
        v11ProxyLibrary.vkGetBufferMemoryRequirements(
                vulkanLogicalDevice,
                vkBuffer,
                vkMemoryRequirements);
    }
    
    public static void vkGetPhysicalDeviceMemoryProperties(
            VkPhysicalDevice vulkanPhysicalDevice,
            VkPhysicalDeviceMemoryProperties vkPhysicalDeviceMemoryProperties)
    {
        v11ProxyLibrary.vkGetPhysicalDeviceMemoryProperties(
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
        return v11ProxyLibrary.vkGetRayTracingShaderHandlesNV(
                vulkanLogicalDevice,
                pipeline,
                firstGroup,
                shaderCount,
                data);
    }
    
    public static VkResult vkBindAccelerationStructureMemoryNV(
            VkDevice vulkanLogicalDevice,
            Collection<VkBindAccelerationStructureMemoryInfoNV> bindInfos)
    {
        return v11ProxyLibrary.vkBindAccelerationStructureMemoryNV(
                vulkanLogicalDevice,
                bindInfos);
    }
    
    public static VkResult vkBindBufferMemory(
            VkDevice vulkanLogicalDevice,
            VkBuffer vkBuffer,
            VkDeviceMemory vkDeviceMemory,
            long memoryOffset)
    {
        return v11ProxyLibrary.vkBindBufferMemory(
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
        return v11ProxyLibrary.vkMapMemory(
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
        v11ProxyLibrary.vkUnmapMemory(
                vulkanLogicalDevice,
                vkDeviceMemory);
    }
    
    public static void vkCmdBindVertexBuffers(
            VkCommandBuffer vkCommandBuffer,
            int firstBinding,
            Collection<VkBuffer> vkBufferCollection,
            long[] offsets)
    {
        v11ProxyLibrary.vkCmdBindVertexBuffers(
                vkCommandBuffer,
                firstBinding,
                vkBufferCollection,
                offsets);
    }
    
    public static void vkDestroyAccelerationStructureNV(
            VkDevice vkDevice,
            VkAccelerationStructureNV accelerationStructure,
            VkAllocationCallbacks alternateAllocator)
    {
        v11ProxyLibrary.vkDestroyAccelerationStructureNV(
                vkDevice,
                accelerationStructure,
                alternateAllocator);
    }
    
    public static void vkDestroyBuffer(
            VkDevice vkDevice,
            VkBuffer vkBuffer,
            VkAllocationCallbacks alternateAllocator)
    {
        v11ProxyLibrary.vkDestroyBuffer(
                vkDevice,
                vkBuffer,
                alternateAllocator);
    }
    
    public static void vkFreeMemory(
            VkDevice vkDevice,
            VkDeviceMemory vkDeviceMemory,
            VkAllocationCallbacks alternateAllocator)
    {
        v11ProxyLibrary.vkFreeMemory(
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
        v11ProxyLibrary.vkCmdBindIndexBuffer(
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
            VkAccelerationStructureNV dst,
            VkAccelerationStructureNV src,
            VkBuffer scratch,
            long scratchOffset)
    {
        v11ProxyLibrary.vkCmdBuildAccelerationStructureNV(
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
            VkAccelerationStructureNV dst,
            VkAccelerationStructureNV src,
            VkCopyAccelerationStructureModeNV mode)
    {
        v11ProxyLibrary.vkCmdCopyAccelerationStructureNV(
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
        v11ProxyLibrary.vkCmdCopyBuffer(
                vkCommandBuffer,
                srcBuffer,
                dstBuffer,
                vkBufferCopyCollection);
    }
    
    public static void vkCmdCopyBufferToImage(
            VkCommandBuffer vkCommandBuffer,
            VkBuffer srcBuffer,
            VkImage dstImage,
            VkImageLayout dstImageLayout,
            Collection<VkBufferImageCopy> regions)
    {
        v11ProxyLibrary.vkCmdCopyBufferToImage(
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
        v11ProxyLibrary.vkCmdDrawIndexed(
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
        v11ProxyLibrary.vkCmdDrawMeshTasksNV(
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
        v11ProxyLibrary.vkCmdDrawMeshTasksIndirectNV(
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
        v11ProxyLibrary.vkCmdDrawMeshTasksIndirectCountNV(
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
        v11ProxyLibrary.vkCmdSetCheckpointNV(
                vkCommandBuffer,
                checkpointMarker);
    }
    
    
    public static void vkCmdSetExclusiveScissorNV(
            VkCommandBuffer vkCommandBuffer,
            int firstExclusiveScissor,
            Collection<VkRect2D> exclusiveScissors)
    {
        v11ProxyLibrary.vkCmdSetExclusiveScissorNV(
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
        v11ProxyLibrary.vkCmdTraceRaysNV(
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
        return v11ProxyLibrary.vkCreateDescriptorSetLayout(
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
        return v11ProxyLibrary.vkCreateDescriptorPool(
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
        v11ProxyLibrary.vkUpdateDescriptorSets(
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
        v11ProxyLibrary.vkCmdBindDescriptorSets(
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
        v11ProxyLibrary.vkDestroyDescriptorPool(
                vkDevice,
                vkDescriptorPool,
                alternateAllocator);
    }
    
    public static void vkDestroyDescriptorSetLayout(
            VkDevice vkDevice,
            VkDescriptorSetLayout vkDescriptorSetLayout,
            VkAllocationCallbacks alternateAllocator)
    {
        v11ProxyLibrary.vkDestroyDescriptorSetLayout(
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
        return v11ProxyLibrary.vkBindImageMemory(
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
        return v11ProxyLibrary.vkCreateImage(
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
        v11ProxyLibrary.vkGetImageMemoryRequirements(
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
        v11ProxyLibrary.vkCmdPipelineBarrier(
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
        return v11ProxyLibrary.vkCreateSampler(
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
        v11ProxyLibrary.vkDestroySampler(
                vulkanLogicalDevice,
                samplerHandle,
                alternateAllocator);
    }
    
    public static void vkGetQueueCheckpointDataNV(
            VkQueue queue,
            Collection<VkCheckpointDataNV> checkpointData)
    {
        v11ProxyLibrary.vkGetQueueCheckpointDataNV(
                queue,
                checkpointData);
    }
    
    public static void vkGetPhysicalDeviceFormatProperties(
            VkPhysicalDevice vulkanPhysicalDevice,
            VkFormat format,
            VkFormatProperties formatProperties)
    {
        v11ProxyLibrary.vkGetPhysicalDeviceFormatProperties(
                vulkanPhysicalDevice,
                format,
                formatProperties);
    }
    
    public static VkResult vkQueueWaitIdle(
            VkQueue vkQueue)
    {
        return v11ProxyLibrary.vkQueueWaitIdle(
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
        
        v11ProxyLibrary.vkCmdBindTransformFeedbackBuffersEXT(
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
        v11ProxyLibrary.vkCmdBeginTransformFeedbackEXT(
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
        
        v11ProxyLibrary.vkCmdEndTransformFeedbackEXT(
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
        v11ProxyLibrary.vkCmdBeginQueryIndexedEXT(
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
        v11ProxyLibrary.vkCmdEndQueryIndexedEXT(
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
        v11ProxyLibrary.vkCmdDrawIndirectByteCountEXT(
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
            Collection<VkImageDrmFormatModifierPropertiesEXT> properties)
    {
        return v11ProxyLibrary.vkGetImageDrmFormatModifierPropertiesEXT(
                device,
                image,
                properties);
    }
    
    public static VkResult vkGetRayTracingShaderGroupHandlesNV(
            VkDevice device,
            VkPipeline pipeline,
            int firstGroup,
            int groupCount,
            long dataSize,
            byte[] data)
    {
        return v11ProxyLibrary.vkGetRayTracingShaderGroupHandlesNV(
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
        return v11ProxyLibrary.vkGetPhysicalDeviceCalibrateableTimeDomainsEXT(
                physicalDevice,
                timeDomains);
    }
    
    public static VkDeviceAddress vkGetBufferDeviceAddressEXT(
            VkDevice vulkanLogicalDevice,
            VkBufferDeviceAddressInfoEXT info)
    {
        return v11ProxyLibrary.vkGetBufferDeviceAddressEXT(
                vulkanLogicalDevice,
                info);
    }
    
    public static VkResult vkGetPhysicalDeviceCooperativeMatrixPropertiesNV(
            VkPhysicalDevice                            physicalDevice,
            Collection<VkCooperativeMatrixPropertiesNV> properties)
    {
        return v11ProxyLibrary.vkGetPhysicalDeviceCooperativeMatrixPropertiesNV(
                physicalDevice,
                properties);
    }
    
    public static  VkResult vkBindBufferMemory2(
            VkDevice vulkanLogicalDevice,
            Collection<VkBindBufferMemoryInfo> bindInfos)
    {
        return v11ProxyLibrary.vkBindBufferMemory2(
                vulkanLogicalDevice,
                bindInfos);
    }
    
    public static  VkResult vkBindBufferMemory2KHR(
            VkDevice vulkanLogicalDevice,
            Collection<VkBindBufferMemoryInfo> bindInfos)
    {
        return v11ProxyLibrary.vkBindBufferMemory2KHR(
                vulkanLogicalDevice,
                bindInfos);
    }
    
    public static  VkResult vkBindImageMemory2(
            VkDevice vulkanLogicalDevice,
            Collection<VkBindImageMemoryInfo> bindInfos)
    {
        return v11ProxyLibrary.vkBindImageMemory2(
                vulkanLogicalDevice,
                bindInfos);
    }
    
    public static  VkResult vkBindImageMemory2KHR(
            VkDevice vulkanLogicalDevice,
            Collection<VkBindImageMemoryInfo> bindInfos)
    {
        return v11ProxyLibrary.vkBindImageMemory2KHR(
                vulkanLogicalDevice,
                bindInfos);
    }
    
    public static VkResult vkCreateDebugUtilsMessengerEXT(
            VkInstance vkInstance,
            VkDebugUtilsMessengerCreateInfoEXT createInfo,
            VkAllocationCallbacks alternateAllocator,
            VkDebugUtilsMessengerEXT messenger)
    {
        return v11ProxyLibrary.vkCreateDebugUtilsMessengerEXT(
                vkInstance,
                createInfo,
                alternateAllocator,
                messenger);
    }
    
    public static VkResult vkSetDebugUtilsObjectNameEXT(
            VkDevice device,
            VkDebugUtilsObjectNameInfoEXT nameInfo)
    {
        return v11ProxyLibrary.vkSetDebugUtilsObjectNameEXT(
                device,
                nameInfo);
    }
    
    public static VkResult vkSetDebugUtilsObjectTagEXT(
            VkDevice device,
            VkDebugUtilsObjectTagInfoEXT tagInfo)
    {
        return v11ProxyLibrary.vkSetDebugUtilsObjectTagEXT(
                device,
                tagInfo);
    }
    
    public static void vkQueueBeginDebugUtilsLabelEXT(
            VkQueue queue,
            VkDebugUtilsLabelEXTlabelInfo labelInfo)
    {
        v11ProxyLibrary.vkQueueBeginDebugUtilsLabelEXT(
                queue,
                labelInfo);
    }
    
    public static void vkQueueEndDebugUtilsLabelEXT(
            VkQueue                                     queue)
    {
        v11ProxyLibrary.vkQueueEndDebugUtilsLabelEXT(
                queue);
    }
    
    public static void vkQueueInsertDebugUtilsLabelEXT(
            VkQueue queue,
            VkDebugUtilsLabelEXT labelInfo)
    {
        v11ProxyLibrary.vkQueueInsertDebugUtilsLabelEXT(
                queue,
                labelInfo);
    }
    
    public static void vkCmdBeginDebugUtilsLabelEXT(
            VkCommandBuffer commandBuffer,
            VkDebugUtilsLabelEXT labelInfo)
    {
        v11ProxyLibrary.vkCmdBeginDebugUtilsLabelEXT(
                commandBuffer,
                labelInfo);
    }
    
    public static void vkCmdEndDebugUtilsLabelEXT(
            VkCommandBuffer commandBuffer)
    {
        v11ProxyLibrary.vkCmdEndDebugUtilsLabelEXT(
                commandBuffer);
    }
    
    public static void vkCmdInsertDebugUtilsLabelEXT(
            VkCommandBuffer commandBuffer,
            VkDebugUtilsLabelEXT labelInfo)
    {
        v11ProxyLibrary.vkCmdInsertDebugUtilsLabelEXT(
                commandBuffer,
                labelInfo);
    }
    
    public static void vkDestroyDebugUtilsMessengerEXT(
            VkInstance instance,
            VkDebugUtilsMessengerEXT messenger,
            VkAllocationCallbacks alternateAllocator)
    {
        v11ProxyLibrary.vkDestroyDebugUtilsMessengerEXT(
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
        v11ProxyLibrary.vkSubmitDebugUtilsMessageEXT(
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
        return v11ProxyLibrary.vkCreateDescriptorUpdateTemplate(
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
        return v11ProxyLibrary.vkCreateDescriptorUpdateTemplateKHR(
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
        return v11ProxyLibrary.vkCreateDisplayModeKHR(
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
        return v11ProxyLibrary.vkCreateDisplayPlaneSurfaceKHR(
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
        return v11ProxyLibrary.vkGetPhysicalDeviceSurfaceCapabilities2KHR(
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
        return v11ProxyLibrary.vkGetPhysicalDeviceImageFormatProperties(
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
        return v11ProxyLibrary.vkGetPhysicalDeviceImageFormatProperties2(
                physicalDevice,
                imageFormatInfo,
                imageFormatProperties);
    }
    
    public static VkResult vkGetPhysicalDeviceImageFormatProperties2KHR(
            VkPhysicalDevice physicalDevice,
            VkPhysicalDeviceImageFormatInfo2 imageFormatInfo,
            VkImageFormatProperties2 imageFormatProperties)
    {
        return v11ProxyLibrary.vkGetPhysicalDeviceImageFormatProperties2(
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
        
        return v11ProxyLibrary.vkGetPipelineExecutablePropertiesKHR(
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
        
        return v11ProxyLibrary.vkGetPipelineExecutableStatisticsKHR(
                device,
                executableInfo,
                statistics);
    }
    
    public static VkResult vkGetPipelineExecutableInternalRepresentationsKHR(
            VkDevice device,
            VkPipelineExecutableInfoKHR executableInfo,
            Collection<VkPipelineExecutableInternalRepresentationKHR> internalRepresentations)
    {
        return v11ProxyLibrary.vkGetPipelineExecutableInternalRepresentationsKHR(
                device,
                executableInfo,
                internalRepresentations);
    }
    
    public static VkResult vkGetDeviceGroupPresentCapabilitiesKHR(
            VkDevice device,
            VkDeviceGroupPresentCapabilitiesKHR deviceGroupPresentCapabilities)
    {
        return v11ProxyLibrary.vkGetDeviceGroupPresentCapabilitiesKHR(
                device,
                deviceGroupPresentCapabilities);
    }
    
    public static VkResult vkGetDeviceGroupSurfacePresentModes2EXT(
            VkDevice device,
            VkPhysicalDeviceSurfaceInfo2KHR surfaceInfo,
            EnumSet<VkDeviceGroupPresentModeFlagBitsKHR> modes)
    {
        return v11ProxyLibrary.vkGetDeviceGroupSurfacePresentModes2EXT(
                device,
                surfaceInfo,
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
        v11ProxyLibrary.vkCmdSetLineStippleEXT(
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
        return v11ProxyLibrary.vkCreateHeadlessSurfaceEXT(
                instance,
                createInfo,
                allocator,
                surface);
    }
    
    public static VkResult vkInitializePerformanceApiINTEL(
            VkDevice device,
            VkInitializePerformanceApiInfoINTEL initializeInfo)
    {
        return v11ProxyLibrary.vkInitializePerformanceApiINTEL(
                device,
                initializeInfo);
    }
    
    public static void vkUninitializePerformanceApiINTEL(
            VkDevice device)
    {
        v11ProxyLibrary.vkUninitializePerformanceApiINTEL(
                device);
    }
    
    public static VkResult vkCmdSetPerformanceMarkerINTEL(
            VkCommandBuffer commandBuffer,
            VkPerformanceMarkerInfoINTEL markerInfo)
    {
        return v11ProxyLibrary.vkCmdSetPerformanceMarkerINTEL(
                commandBuffer,
                markerInfo);
    }
    
    public static VkResult vkCmdSetPerformanceOverrideINTEL(
            VkCommandBuffer commandBuffer,
            VkPerformanceOverrideInfoINTEL overrideInfo)
    {
        return v11ProxyLibrary.vkCmdSetPerformanceOverrideINTEL(
                commandBuffer,
                overrideInfo);
    }
    
    public static VkResult vkCmdSetPerformanceStreamMarkerINTEL(
            VkCommandBuffer commandBuffer,
            VkPerformanceStreamMarkerInfoINTEL markerInfo)
    {
        return v11ProxyLibrary.vkCmdSetPerformanceStreamMarkerINTEL(
                commandBuffer,
                markerInfo);
    }
    
    public static VkResult vkAcquirePerformanceConfigurationINTEL(
            VkDevice device,
            VkPerformanceConfigurationAcquireInfoINTEL acquireInfo,
            VkPerformanceConfigurationINTEL configuration)
    {
        return v11ProxyLibrary.vkAcquirePerformanceConfigurationINTEL(
                device,
                acquireInfo,
                configuration);
    }
    
    public static VkResult vkReleasePerformanceConfigurationINTEL(
            VkDevice device,
            VkPerformanceConfigurationINTEL configuration)
    {
        return v11ProxyLibrary.vkReleasePerformanceConfigurationINTEL(
                device,
                configuration);
    }
    
    public static VkResult vkQueueSetPerformanceConfigurationINTEL(
            VkQueue                                     queue,
            VkPerformanceConfigurationINTEL             configuration)
    {
        return v11ProxyLibrary.vkQueueSetPerformanceConfigurationINTEL(
                queue,
                configuration);
    }
    
    public static VkResult vkGetPerformanceParameterINTEL(
            VkDevice device,
            VkPerformanceParameterTypeINTEL parameter,
            VkPerformanceValueINTEL value)
    {
        return v11ProxyLibrary.vkGetPerformanceParameterINTEL(
                device,
                parameter,
                value);
    }
    
    public static VkResult vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV(
            VkPhysicalDevice physicalDevice,
            Collection<VkFramebufferMixedSamplesCombinationNV> combinations)
    {
        return v11ProxyLibrary.vkGetPhysicalDeviceSupportedFramebufferMixedSamplesCombinationsNV(
                physicalDevice,
                combinations);
    }
    
    public static void vkCmdBeginQuery(
            VkCommandBuffer commandBuffer,
            VkQueryPool queryPool,
            int query,
            EnumSet<VkQueryControlFlagBits> flags)
    {
        v11ProxyLibrary.vkCmdBeginQuery(
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
        v11ProxyLibrary.vkCmdBlitImage(
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
        v11ProxyLibrary.vkCmdClearAttachments(
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
        
        v11ProxyLibrary.vkCmdClearColorImage(
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
        v11ProxyLibrary.vkCmdClearDepthStencilImage(
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
        v11ProxyLibrary.vkCmdCopyImage(
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
        v11ProxyLibrary.vkCmdCopyImageToBuffer(
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
        v11ProxyLibrary.vkCmdCopyQueryPoolResults(
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
        v11ProxyLibrary.vkCmdDebugMarkerBeginEXT(
                commandBuffer,
                markerInfo);
    }
    
    public static void vkCmdDebugMarkerEndEXT(
            VkCommandBuffer commandBuffer)
    {
        v11ProxyLibrary.vkCmdDebugMarkerEndEXT(
                commandBuffer);
    }
    
    public static void vkCmdDebugMarkerInsertEXT(
            VkCommandBuffer commandBuffer,
            VkDebugMarkerMarkerInfoEXT markerInfo)
    {
        v11ProxyLibrary.vkCmdDebugMarkerInsertEXT(
                commandBuffer,
                markerInfo);
    }
    
    public static void vkCmdDispatch(
            VkCommandBuffer commandBuffer,
            int groupCountX,
            int groupCountY,
            int groupCountZ)
    {
        v11ProxyLibrary.vkCmdDispatch(
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
        v11ProxyLibrary.vkCmdDispatchBase(
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
        v11ProxyLibrary.vkCmdDispatchBase(
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
        v11ProxyLibrary.vkCmdDispatchIndirect(
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
        v11ProxyLibrary.vkCmdDrawIndexedIndirect(
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
        v11ProxyLibrary.vkCmdDrawIndexedIndirectCountKHR(
                commandBuffer,
                buffer,
                offset,
                countBuffer,
                countBufferOffset,
                maxDrawCount,
                stride);
    }
    
    public static void vkCmdDrawIndexedIndirectCountKHR(
            VkCommandBuffer commandBuffer,
            VkBuffer buffer,
            long offset,
            VkBuffer countBuffer,
            long countBufferOffset,
            int maxDrawCount,
            int stride)
    {
        v11ProxyLibrary.vkCmdDrawIndexedIndirectCountKHR(
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
        v11ProxyLibrary.vkCmdDrawIndirect(
                commandBuffer,
                buffer,
                offset,
                drawCount,
                stride);
    }
    
    public static void vkCmdDrawIndirectCountKHR(
            VkCommandBuffer commandBuffer,
            VkBuffer buffer,
            long offset,
            VkBuffer countBuffer,
            long countBufferOffset,
            int maxDrawCount,
            int stride)
    {
        v11ProxyLibrary.vkCmdDrawIndirectCountKHR(
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
        v11ProxyLibrary.vkCmdDrawIndirectCountKHR(
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
        v11ProxyLibrary.vkCmdEndQuery(
                commandBuffer,
                queryPool,
                query);
    }
    
    public static void vkCmdExecuteCommands(
            VkCommandBuffer commandBuffer,
            Collection<VkCommandBuffer> commandBuffers)
    {
        v11ProxyLibrary.vkCmdExecuteCommands(
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
        v11ProxyLibrary.vkCmdFillBuffer(
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
        v11ProxyLibrary.vkCmdNextSubpass(
                commandBuffer,
                contents);
    }
    
    public static void vkCmdProcessCommandsNVX(
            VkCommandBuffer commandBuffer,
            VkCmdProcessCommandsInfoNVX processCommandsInfo)
    {
        v11ProxyLibrary.vkCmdProcessCommandsNVX(
                commandBuffer,
                processCommandsInfo);
    }
    
    public static void vkCmdPushConstants(
            VkCommandBuffer commandBuffer,
            VkPipelineLayout layout,
            EnumSet<VkShaderStageFlagBits> stageFlags,
            int offset,
            byte[] values)
    {
        v11ProxyLibrary.vkCmdPushConstants(
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
        v11ProxyLibrary.vkCmdPushDescriptorSetKHR(
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
        
        v11ProxyLibrary.vkCmdPushDescriptorSetWithTemplateKHR(
                commandBuffer,
                descriptorUpdateTemplate,
                layout,
                data);
    }
    
    public static void vkCmdReserveSpaceForCommandsNVX(
            VkCommandBuffer commandBuffer,
            VkCmdReserveSpaceForCommandsInfoNVX reserveSpaceInfo)
    {
        v11ProxyLibrary.vkCmdReserveSpaceForCommandsNVX(
                commandBuffer,
                reserveSpaceInfo);
    }
    
    public static void vkCmdResetEvent(
            VkCommandBuffer commandBuffer,
            VkEvent event,
            EnumSet<VkPipelineStageFlagBits> stageMask)
    {
        v11ProxyLibrary.vkCmdResetEvent(
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
        v11ProxyLibrary.vkCmdResetQueryPool(
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
        v11ProxyLibrary.vkCmdResolveImage(
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
        
        v11ProxyLibrary.vkCmdSetBlendConstants(
                commandBuffer,
                blendConstants);
    }
    
    public static void vkCmdSetDepthBias(
            VkCommandBuffer commandBuffer,
            float depthBiasConstantFactor,
            float depthBiasClamp,
            float depthBiasSlopeFactor)
    {
        v11ProxyLibrary.vkCmdSetDepthBias(
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
        v11ProxyLibrary.vkCmdSetDepthBounds(
                commandBuffer,
                minDepthBounds,
                maxDepthBounds);
    }
    
    public static void vkCmdSetDeviceMask(
            VkCommandBuffer commandBuffer,
            int deviceMask)
    {
        v11ProxyLibrary.vkCmdSetDeviceMask(
                commandBuffer,
                deviceMask);
    }
    
    public static void vkCmdSetDeviceMaskKHR(
            VkCommandBuffer commandBuffer,
            int deviceMask)
    {
        v11ProxyLibrary.vkCmdSetDeviceMask(
                commandBuffer,
                deviceMask);
    }
    
    public static void vkCmdSetDiscardRectangleEXT(
            VkCommandBuffer commandBuffer,
            int firstDiscardRectangle,
            Collection<VkRect2D> discardRectangles)
    {
        v11ProxyLibrary.vkCmdSetDiscardRectangleEXT(
                commandBuffer,
                firstDiscardRectangle,
                discardRectangles);
    }
    
    public static void vkCmdSetEvent(
            VkCommandBuffer commandBuffer,
            VkEvent event,
            EnumSet<VkPipelineStageFlagBits> stageMask)
    {
        v11ProxyLibrary.vkCmdSetEvent(
                commandBuffer,
                event,
                stageMask);
    }
    
    public static void vkCmdSetLineWidth(
            VkCommandBuffer commandBuffer,
            float lineWidth)
    {
        v11ProxyLibrary.vkCmdSetLineWidth(
                commandBuffer,
                lineWidth);
    }
    
    public static void vkCmdSetSampleLocationsEXT(
            VkCommandBuffer commandBuffer,
            VkSampleLocationsInfoEXT sampleLocationsInfo)
    {
        v11ProxyLibrary.vkCmdSetSampleLocationsEXT(
                commandBuffer,
                sampleLocationsInfo);
    }
    
    public static void vkCmdSetScissor(
            VkCommandBuffer commandBuffer,
            int firstScissor,
            Collection<VkRect2D> scissors)
    {
        v11ProxyLibrary.vkCmdSetScissor(
                commandBuffer,
                firstScissor,
                scissors);
    }
    
    public static void vkCmdSetStencilCompareMask(
            VkCommandBuffer commandBuffer,
            EnumSet<VkStencilFaceFlagBits> faceMask,
            int compareMask)
    {
        v11ProxyLibrary.vkCmdSetStencilCompareMask(
                commandBuffer,
                faceMask,
                compareMask);
    }
    
    public static void vkCmdSetStencilReference(
            VkCommandBuffer commandBuffer,
            EnumSet<VkStencilFaceFlagBits> faceMask,
            int reference)
    {
        v11ProxyLibrary.vkCmdSetStencilReference(
                commandBuffer,
                faceMask,
                reference);
    }
    
    public static void vkCmdSetStencilWriteMask(
            VkCommandBuffer commandBuffer,
            EnumSet<VkStencilFaceFlagBits> faceMask,
            int writeMask)
    {
        v11ProxyLibrary.vkCmdSetStencilWriteMask(
                commandBuffer,
                faceMask,
                writeMask);
    }
    
    public static void vkCmdSetViewport(
            VkCommandBuffer commandBuffer,
            int firstViewport,
            Collection<VkViewport> viewports)
    {
        v11ProxyLibrary.vkCmdSetViewport(
                commandBuffer,
                firstViewport,
                viewports);
    }
    
    public static void vkCmdSetViewportWScalingNV(
            VkCommandBuffer commandBuffer,
            int firstViewport,
            Collection<VkViewportWScalingNV> viewportWScalings)
    {
        v11ProxyLibrary.vkCmdSetViewportWScalingNV(
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
        
        v11ProxyLibrary.vkCmdUpdateBuffer(
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
        v11ProxyLibrary.vkCmdWaitEvents(
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
        v11ProxyLibrary.vkCmdWriteBufferMarkerAMD(
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
        v11ProxyLibrary.vkCmdWriteTimestamp(
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
        return v11ProxyLibrary.vkCreateEvent(
                device,
                createInfo,
                allocator,
                event);
    }
    
    public static VkResult vkCreateIndirectCommandsLayoutNVX(
            VkDevice device,
            VkIndirectCommandsLayoutCreateInfoNVX createInfo,
            VkAllocationCallbacks allocator,
            VkIndirectCommandsLayoutNVX indirectCommandsLayout)
    {
        return v11ProxyLibrary.vkCreateIndirectCommandsLayoutNVX(
                device,
                createInfo,
                allocator,
                indirectCommandsLayout);
    }
    
    public static VkResult vkCreateObjectTableNVX(
            VkDevice device,
            VkObjectTableCreateInfoNVX createInfo,
            VkAllocationCallbacks allocator,
            VkObjectTableNVX objectTable)
    {
        return v11ProxyLibrary.vkCreateObjectTableNVX(
                device,
                createInfo,
                allocator,
                objectTable);
    }
    
    public static VkResult vkCreatePipelineCache(
            VkDevice device,
            VkPipelineCacheCreateInfo createInfo,
            VkAllocationCallbacks allocator,
            VkPipelineCache pipelineCache)
    {
        return v11ProxyLibrary.vkCreatePipelineCache(
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
        return v11ProxyLibrary.vkCreateQueryPool(
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
        return v11ProxyLibrary.vkCreateSamplerYcbcrConversion(
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
        return v11ProxyLibrary.vkCreateSamplerYcbcrConversion(
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
        
        return v11ProxyLibrary.vkCreateSharedSwapchainsKHR(
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
        return v11ProxyLibrary.vkCreateValidationCacheEXT(
                device,
                createInfo,
                allocator,
                validationCache);
    }
    
    public static VkResult vkDebugMarkerSetObjectNameEXT(
            VkDevice device,
            VkDebugMarkerObjectNameInfoEXT nameInfo)
    {
        return v11ProxyLibrary.vkDebugMarkerSetObjectNameEXT(
                device,
                nameInfo);
    }
    
    public static VkResult vkDebugMarkerSetObjectTagEXT(
            VkDevice device,
            VkDebugMarkerObjectTagInfoEXT tagInfo)
    {
        return v11ProxyLibrary.vkDebugMarkerSetObjectTagEXT(
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
        v11ProxyLibrary.vkDebugReportMessageEXT(
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
        v11ProxyLibrary.vkDestroyBufferView(
                device,
                bufferView,
                allocator);
    }
    
    public static void vkDestroyDescriptorUpdateTemplate(
            VkDevice device,
            VkDescriptorUpdateTemplate descriptorUpdateTemplate,
            VkAllocationCallbacks allocator)
    {
        v11ProxyLibrary.vkDestroyDescriptorUpdateTemplate(
                device,
                descriptorUpdateTemplate,
                allocator);
    }
    
    public static void vkDestroyDescriptorUpdateTemplateKHR(
            VkDevice device,
            VkDescriptorUpdateTemplate descriptorUpdateTemplate,
            VkAllocationCallbacks allocator)
    {
        v11ProxyLibrary.vkDestroyDescriptorUpdateTemplate(
                device,
                descriptorUpdateTemplate,
                allocator);
    }
    
    public static void vkDestroyEvent(
            VkDevice device,
            VkEvent event,
            VkAllocationCallbacks allocator)
    {
        v11ProxyLibrary.vkDestroyEvent(
                device,
                event,
                allocator);
    }
    
    public static void vkDestroyIndirectCommandsLayoutNVX(
            VkDevice device,
            VkIndirectCommandsLayoutNVX indirectCommandsLayout,
            VkAllocationCallbacks allocator)
    {
        v11ProxyLibrary.vkDestroyIndirectCommandsLayoutNVX(
                device,
                indirectCommandsLayout,
                allocator);
    }
    
    public static void vkDestroyObjectTableNVX(
            VkDevice device,
            VkObjectTableNVX objectTable,
            VkAllocationCallbacks allocator)
    {
        v11ProxyLibrary.vkDestroyObjectTableNVX(
                device,
                objectTable,
                allocator);
    }
    
    public static void vkDestroyPipelineCache(
            VkDevice device,
            VkPipelineCache pipelineCache,
            VkAllocationCallbacks allocator)
    {
        v11ProxyLibrary.vkDestroyPipelineCache(
                device,
                pipelineCache,
                allocator);
    }
    
    public static void vkDestroyQueryPool(
            VkDevice device,
            VkQueryPool queryPool,
            VkAllocationCallbacks allocator)
    {
        v11ProxyLibrary.vkDestroyQueryPool(
                device,
                queryPool,
                allocator);
    }
    
    public static void vkDestroySamplerYcbcrConversion(
            VkDevice device,
            VkSamplerYcbcrConversion ycbcrConversion,
            VkAllocationCallbacks allocator)
    {
        v11ProxyLibrary.vkDestroySamplerYcbcrConversion(
                device,
                ycbcrConversion,
                allocator);
    }
    
    public static void vkDestroySamplerYcbcrConversionKHR(
            VkDevice device,
            VkSamplerYcbcrConversion ycbcrConversion,
            VkAllocationCallbacks allocator)
    {
        v11ProxyLibrary.vkDestroySamplerYcbcrConversion(
                device,
                ycbcrConversion,
                allocator);
    }
    
    public static void vkDestroyValidationCacheEXT(
            VkDevice device,
            VkValidationCacheEXT validationCache,
            VkAllocationCallbacks allocator)
    {
        v11ProxyLibrary.vkDestroyValidationCacheEXT(
                device,
                validationCache,
                allocator);
    }
    
    public static VkResult vkDisplayPowerControlEXT(
            VkDevice device,
            VkDisplayKHR display,
            VkDisplayPowerInfoEXT displayPowerInfo)
    {
        return v11ProxyLibrary.vkDisplayPowerControlEXT(
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

        return v11ProxyLibrary.vkEnumerateDeviceLayerProperties(
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

        return v11ProxyLibrary.vkEnumerateInstanceExtensionProperties(
                LayerName,
                properties);
    }
    
    public static VkResult vkEnumerateInstanceLayerProperties(
            Collection<VkLayerProperties> properties)
    {
        return v11ProxyLibrary.vkEnumerateInstanceLayerProperties(
                properties);
    }
    
    public static VkResult vkEnumerateInstanceVersion(
            IntReturnValue apiVersion)
    {
        return v11ProxyLibrary.vkEnumerateInstanceVersion(
                apiVersion);
    }
    
    public static VkResult vkEnumeratePhysicalDeviceGroups(
            VkInstance instance,
            Collection<VkPhysicalDeviceGroupProperties> physicalDeviceGroupProperties)
    {
        return v11ProxyLibrary.vkEnumeratePhysicalDeviceGroups(
                instance,
                physicalDeviceGroupProperties);
    }
    
    public static VkResult vkEnumeratePhysicalDeviceGroupsKHR(
            VkInstance instance,
            Collection<VkPhysicalDeviceGroupProperties> physicalDeviceGroupProperties)
    {
        return v11ProxyLibrary.vkEnumeratePhysicalDeviceGroups(
                instance,
                physicalDeviceGroupProperties);
    }
    
    public static VkResult vkFlushMappedMemoryRanges(
            VkDevice device,
            Collection<VkMappedMemoryRange> memoryRanges)
    {
        return v11ProxyLibrary.vkFlushMappedMemoryRanges(
                 device,
                memoryRanges);
    }
    
    public static VkResult vkFreeDescriptorSets(
            VkDevice device,
            VkDescriptorPool descriptorPool,
            Collection<VkDescriptorSet> descriptorSets)
    {
        return v11ProxyLibrary.vkFreeDescriptorSets(
                device,
                descriptorPool,
                descriptorSets);
    }
    
    public static void vkGetBufferMemoryRequirements2(
            VkDevice device,
            VkBufferMemoryRequirementsInfo2 info,
            VkMemoryRequirements2 memoryRequirements)
    {
        v11ProxyLibrary.vkGetBufferMemoryRequirements2(
                device,
                info,
                memoryRequirements);
    }
    
    public static void vkGetBufferMemoryRequirements2KHR(
            VkDevice device,
            VkBufferMemoryRequirementsInfo2 info,
            VkMemoryRequirements2 memoryRequirements)
    {
        v11ProxyLibrary.vkGetBufferMemoryRequirements2(
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
        return v11ProxyLibrary.vkGetCalibratedTimestampsEXT(
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
        v11ProxyLibrary.vkGetDeviceMemoryCommitment(
                device,
                memory,
                committedMemoryInBytes);
    }
    
    public static void vkGetDeviceQueue2(
            VkDevice device,
            VkDeviceQueueInfo2 queueInfo,
            VkQueue queue)
    {
        v11ProxyLibrary.vkGetDeviceQueue2(
                device,
                queueInfo,
                queue);
    }
    
    public static VkResult vkGetDisplayModeProperties2KHR(
            VkPhysicalDevice physicalDevice,
            VkDisplayKHR display,
            Collection<VkDisplayModeProperties2KHR> properties)
    {
        return v11ProxyLibrary.vkGetDisplayModeProperties2KHR(
                physicalDevice,
                display,
                properties);
    }
    
    public static VkResult vkGetDisplayModePropertiesKHR(
            VkPhysicalDevice physicalDevice,
            VkDisplayKHR display,
            Collection<VkDisplayModePropertiesKHR> properties)
    {
        return v11ProxyLibrary.vkGetDisplayModePropertiesKHR(
                physicalDevice,
                display,
                properties);
    }
    
    public static VkResult vkGetDisplayPlaneCapabilities2KHR(
            VkPhysicalDevice physicalDevice,
            VkDisplayPlaneInfo2KHR pisplayPlaneInfo,
            VkDisplayPlaneCapabilities2KHR capabilities)
    {
        return v11ProxyLibrary.vkGetDisplayPlaneCapabilities2KHR(
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
        return v11ProxyLibrary.vkGetDisplayPlaneCapabilitiesKHR(
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
        return v11ProxyLibrary.vkGetDisplayPlaneSupportedDisplaysKHR(
                physicalDevice,
                planeIndex,
                displays);
    }
    
    public static VkResult vkGetEventStatus(
            VkDevice device,
            VkEvent event)
    {
        return v11ProxyLibrary.vkGetEventStatus(
                device,
                event);
    }
    
    public static VkResult vkGetFenceFdKHR(
            VkDevice device,
            VkFenceGetFdInfoKHR getFdInfo,
            IntReturnValue fd)
    {
        return v11ProxyLibrary.vkGetFenceFdKHR(
                device,
                getFdInfo,
                fd);
    }
    
    public static VkResult vkGetFenceStatus(
            VkDevice device,
            VkFence fence)
    {
        return v11ProxyLibrary.vkGetFenceStatus(
                device,
                fence);
    }

    public static void vkGetImageMemoryRequirements2(
            VkDevice device,
            VkImageMemoryRequirementsInfo2 info,
            VkMemoryRequirements2 memoryRequirements)
    {
        v11ProxyLibrary.vkGetImageMemoryRequirements2(
                device,
                info,
                memoryRequirements);
    }
    
    public static void vkGetImageMemoryRequirements2KHR(
            VkDevice device,
            VkImageMemoryRequirementsInfo2 info,
            VkMemoryRequirements2 memoryRequirements)
    {
        v11ProxyLibrary.vkGetImageMemoryRequirements2(
                device,
                info,
                memoryRequirements);
    }
    
    public static void vkGetImageSparseMemoryRequirements(
            VkDevice device,
            VkImage image,
            Collection<VkSparseImageMemoryRequirements> sparseMemoryRequirements)
    {
        v11ProxyLibrary.vkGetImageSparseMemoryRequirements(
                device,
                image,
                sparseMemoryRequirements);
    }
    
    public static void vkGetImageSparseMemoryRequirements2(
            VkDevice device,
            VkImageSparseMemoryRequirementsInfo2 info,
            Collection<VkSparseImageMemoryRequirements> sparseMemoryRequirements)
    {
        v11ProxyLibrary.vkGetImageSparseMemoryRequirements2(
                device,
                info,
                sparseMemoryRequirements);
    }
    
    public static void vkGetImageSparseMemoryRequirements2KHR(
            VkDevice device,
            VkImageSparseMemoryRequirementsInfo2 info,
            Collection<VkSparseImageMemoryRequirements> sparseMemoryRequirements)
    {
        v11ProxyLibrary.vkGetImageSparseMemoryRequirements2(
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
        v11ProxyLibrary.vkGetImageSubresourceLayout(
                device,
                image,
                subresource,
                layout);
    }
    
    public static int vkGetImageViewHandleNVX(
            VkDevice device,
            VkImageViewHandleInfoNVX info)
    {
        return v11ProxyLibrary.vkGetImageViewHandleNVX(
                device,
                info);
    }
    
    public static VkResult vkGetMemoryFdKHR(
            VkDevice device,
            VkMemoryGetFdInfoKHR getFdInfo,
            IntReturnValue fd)
    {
        return v11ProxyLibrary.vkGetMemoryFdKHR(
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
        return v11ProxyLibrary.vkGetMemoryFdPropertiesKHR(
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
        return v11ProxyLibrary.vkGetMemoryHostPointerPropertiesEXT(
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
        return v11ProxyLibrary.vkGetPastPresentationTimingGOOGLE(
                device,
                swapchain,
                presentationTimings);
    }
    
    public static VkResult vkGetPhysicalDeviceDisplayPlaneProperties2KHR(
            VkPhysicalDevice                            physicalDevice,
            Collection<VkDisplayPlaneProperties2KHR> properties)
    {
        return v11ProxyLibrary.vkGetPhysicalDeviceDisplayPlaneProperties2KHR(
                physicalDevice,
                properties);
    }
    
    public static VkResult vkGetPhysicalDeviceDisplayPlanePropertiesKHR(
            VkPhysicalDevice physicalDevice,
            Collection<VkDisplayPlanePropertiesKHR> properties)
    {
        return v11ProxyLibrary.vkGetPhysicalDeviceDisplayPlanePropertiesKHR(
                physicalDevice,
                properties);
    }
    
    public static VkResult vkGetPhysicalDeviceDisplayProperties2KHR(
            VkPhysicalDevice physicalDevice,
            Collection<VkDisplayProperties2KHR> properties)
    {
        return v11ProxyLibrary.vkGetPhysicalDeviceDisplayProperties2KHR(
                physicalDevice,
                properties);
    }
    
    public static VkResult vkGetPhysicalDeviceDisplayPropertiesKHR(
            VkPhysicalDevice physicalDevice,
            VkDisplayPropertiesKHR properties)
    {
        return v11ProxyLibrary.vkGetPhysicalDeviceDisplayPropertiesKHR(
                physicalDevice,
                properties);
    }
    
    public static void vkGetPhysicalDeviceExternalBufferProperties(
            VkPhysicalDevice physicalDevice,
            VkPhysicalDeviceExternalBufferInfo externalBufferInfo,
            VkExternalBufferProperties externalBufferProperties)
    {
        v11ProxyLibrary.vkGetPhysicalDeviceExternalBufferProperties(
                physicalDevice,
                externalBufferInfo,
                externalBufferProperties);
    }
    
    public static void vkGetPhysicalDeviceExternalBufferPropertiesKHR(
            VkPhysicalDevice physicalDevice,
            VkPhysicalDeviceExternalBufferInfo externalBufferInfo,
            VkExternalBufferProperties externalBufferProperties)
    {
        v11ProxyLibrary.vkGetPhysicalDeviceExternalBufferProperties(
                physicalDevice,
                externalBufferInfo,
                externalBufferProperties);
    }
    
    public static void vkGetPhysicalDeviceExternalFenceProperties(
            VkPhysicalDevice physicalDevice,
            VkPhysicalDeviceExternalFenceInfo externalFenceInfo,
            VkExternalFenceProperties externalFenceProperties)
    {
        v11ProxyLibrary.vkGetPhysicalDeviceExternalFenceProperties(
                physicalDevice,
                externalFenceInfo,
                externalFenceProperties);
    }
    
    public static void vkGetPhysicalDeviceExternalFencePropertiesKHR(
            VkPhysicalDevice physicalDevice,
            VkPhysicalDeviceExternalFenceInfo externalFenceInfo,
            VkExternalFenceProperties externalFenceProperties)
    {
        v11ProxyLibrary.vkGetPhysicalDeviceExternalFenceProperties(
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
        return v11ProxyLibrary.vkGetPhysicalDeviceExternalImageFormatPropertiesNV(
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
        v11ProxyLibrary.vkGetPhysicalDeviceExternalSemaphoreProperties(
                physicalDevice,
                externalSemaphoreInfo,
                externalSemaphoreProperties);
    }
    
    public static void vkGetPhysicalDeviceExternalSemaphorePropertiesKHR(
            VkPhysicalDevice physicalDevice,
            VkPhysicalDeviceExternalSemaphoreInfo externalSemaphoreInfo,
            VkExternalSemaphoreProperties externalSemaphoreProperties)
    {
        v11ProxyLibrary.vkGetPhysicalDeviceExternalSemaphoreProperties(
                physicalDevice,
                externalSemaphoreInfo,
                externalSemaphoreProperties);
    }
    
    public static void vkGetPhysicalDeviceFeatures2(
            VkPhysicalDevice physicalDevice,
            VkPhysicalDeviceFeatures2 features)
    {
        v11ProxyLibrary.vkGetPhysicalDeviceFeatures2(
                physicalDevice,
                features);
    }
    
    public static void vkGetPhysicalDeviceFeatures2KHR(
            VkPhysicalDevice physicalDevice,
            VkPhysicalDeviceFeatures2 features)
    {
        v11ProxyLibrary.vkGetPhysicalDeviceFeatures2(
                physicalDevice,
                features);
    }
    
    public static void vkGetPhysicalDeviceFormatProperties2(
            VkPhysicalDevice physicalDevice,
            VkFormat format,
            VkFormatProperties2 formatProperties)
    {
        v11ProxyLibrary.vkGetPhysicalDeviceFormatProperties2(
                physicalDevice,
                format,
                formatProperties);
    }
    
    public static void vkGetPhysicalDeviceFormatProperties2KHR(
            VkPhysicalDevice physicalDevice,
            VkFormat format,
            VkFormatProperties2 formatProperties)
    {
        v11ProxyLibrary.vkGetPhysicalDeviceFormatProperties2(
                physicalDevice,
                format,
                formatProperties);
    }
    
    public static void vkGetPhysicalDeviceGeneratedCommandsPropertiesNVX(
            VkPhysicalDevice physicalDevice,
            VkDeviceGeneratedCommandsFeaturesNVX features,
            VkDeviceGeneratedCommandsLimitsNVX limits)
    {
        v11ProxyLibrary.vkGetPhysicalDeviceGeneratedCommandsPropertiesNVX(
                physicalDevice,
                features,
                limits);
    }
    
    public static void vkGetPhysicalDeviceMemoryProperties2(
            VkPhysicalDevice physicalDevice,
            VkPhysicalDeviceMemoryProperties2 memoryProperties)
    {
        v11ProxyLibrary.vkGetPhysicalDeviceMemoryProperties2(
                physicalDevice,
                memoryProperties);
    }
    
    public static void vkGetPhysicalDeviceMultisamplePropertiesEXT(
            VkPhysicalDevice physicalDevice,
            VkSampleCountFlagBits samples,
            VkMultisamplePropertiesEXT multisampleProperties)
    {
        v11ProxyLibrary.vkGetPhysicalDeviceMultisamplePropertiesEXT(
                physicalDevice,
                samples,
                multisampleProperties);
    }
    
    public static VkResult vkGetPhysicalDevicePresentRectanglesKHR(
            VkPhysicalDevice physicalDevice,
            VkSurfaceKHR surface,
            Collection<VkRect2D> rects)
    {
        return v11ProxyLibrary.vkGetPhysicalDevicePresentRectanglesKHR(
                physicalDevice,
                surface,
                rects);
    }
    
    public static void vkGetPhysicalDeviceQueueFamilyProperties2(
            VkPhysicalDevice physicalDevice,
            Collection<VkQueueFamilyProperties2> queueFamilyProperties)
    {
        v11ProxyLibrary.vkGetPhysicalDeviceQueueFamilyProperties2(
                physicalDevice,
                queueFamilyProperties);
    }
    
    public static void vkGetPhysicalDeviceQueueFamilyProperties2KHR(
            VkPhysicalDevice physicalDevice,
            Collection<VkQueueFamilyProperties2> queueFamilyProperties)
    {
        v11ProxyLibrary.vkGetPhysicalDeviceQueueFamilyProperties2(
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
        v11ProxyLibrary.vkGetPhysicalDeviceSparseImageFormatProperties(
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
        v11ProxyLibrary.vkGetPhysicalDeviceSparseImageFormatProperties2(
                physicalDevice,
                formatInfo,
                properties);
    }
    
    public static void vkGetPhysicalDeviceSparseImageFormatProperties2KHR(
            VkPhysicalDevice physicalDevice,
            VkPhysicalDeviceSparseImageFormatInfo2 formatInfo,
            Collection<VkSparseImageFormatProperties2> properties)
    {
        v11ProxyLibrary.vkGetPhysicalDeviceSparseImageFormatProperties2(
                physicalDevice,
                formatInfo,
                properties);
    }
    
    public static VkResult vkGetPhysicalDeviceSurfaceCapabilities2EXT(
            VkPhysicalDevice physicalDevice,
            VkSurfaceKHR surface,
            VkSurfaceCapabilities2EXT surfaceCapabilities)
    {
        return v11ProxyLibrary.vkGetPhysicalDeviceSurfaceCapabilities2EXT(
                physicalDevice,
                surface,
                surfaceCapabilities);
    }
    
    public static VkResult vkGetPhysicalDeviceSurfaceFormats2KHR(
            VkPhysicalDevice physicalDevice,
            VkPhysicalDeviceSurfaceInfo2KHR surfaceInfo,
            Collection<VkSurfaceFormat2KHR> surfaceFormats)
    {
        return v11ProxyLibrary.vkGetPhysicalDeviceSurfaceFormats2KHR(
                physicalDevice,
                surfaceInfo,
                surfaceFormats);
    }
    
    public static VkResult vkGetPipelineCacheData(
            VkDevice device,
            VkPipelineCache pipelineCache,
            byte[] data)
    {
        return v11ProxyLibrary.vkGetPipelineCacheData(
                device,
                pipelineCache,
                data);
    }
    
    public static VkResult vkGetQueryPoolResults(
            VkDevice device,
            VkQueryPool queryPool,
            int firstQuery,
            int queryCount,
            byte[] data,
            long stride,
            EnumSet<VkQueryResultFlagBits> flags)
    {
        return v11ProxyLibrary.vkGetQueryPoolResults(
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
        return v11ProxyLibrary.vkGetRefreshCycleDurationGOOGLE(
                device,
                swapchain,
                displayTimingProperties);
    }
    
    public static void vkGetRenderAreaGranularity(
            VkDevice device,
            VkRenderPass renderPass,
            VkExtent2D granularity)
    {
        v11ProxyLibrary.vkGetRenderAreaGranularity(
                device,
                renderPass,
                granularity);
    }
    
    public static VkResult vkGetSemaphoreFdKHR(
            VkDevice device,
            VkSemaphoreGetFdInfoKHR getFdInfo,
            IntReturnValue fd)
    {
        return v11ProxyLibrary.vkGetSemaphoreFdKHR(
                device,
                getFdInfo,
                fd);
    }
    
    public static VkResult vkGetShaderInfoAMD(
            VkDevice device,
            VkPipeline pipeline,
            VkShaderStageFlagBits shaderStage,
            VkShaderInfoTypeAMD infoType,
            byte[] info)
    {
        return v11ProxyLibrary.vkGetShaderInfoAMD(
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
        return v11ProxyLibrary.vkGetSwapchainCounterEXT(
                device,
                swapchain,
                counter,
                counterValue);
    }
    
    public static VkResult vkGetSwapchainStatusKHR(
            VkDevice device,
            VkSwapchainKHR swapchain)
    {
        return v11ProxyLibrary.vkGetSwapchainStatusKHR(
                device,
                swapchain);
    }
    
    public static VkResult vkGetValidationCacheDataEXT(
            VkDevice device,
            VkValidationCacheEXT validationCache,
            byte[] data)
    {
        return v11ProxyLibrary.vkGetValidationCacheDataEXT(
                device,
                validationCache,
                data);
    }
    
    public static VkResult vkImportFenceFdKHR(
            VkDevice device,
            VkImportFenceFdInfoKHR importFenceFdInfo)
    {
        return v11ProxyLibrary.vkImportFenceFdKHR(
                device,
                importFenceFdInfo);
    }
    
    public static VkResult vkImportSemaphoreFdKHR(
            VkDevice device,
            VkImportSemaphoreFdInfoKHR importSemaphoreFdInfo)
    {
        return v11ProxyLibrary.vkImportSemaphoreFdKHR(
                device,
                importSemaphoreFdInfo);
    }
    
    public static VkResult vkInvalidateMappedMemoryRanges(
            VkDevice device,
            Collection<VkMappedMemoryRange> memoryRanges)
    {
        return v11ProxyLibrary.vkInvalidateMappedMemoryRanges(
                device,
                memoryRanges);
    }
    
    public static VkResult vkMergePipelineCaches(
            VkDevice device,
            VkPipelineCache dstCache,
            Collection<VkPipelineCache> srcCaches)
    {
        return v11ProxyLibrary.vkMergePipelineCaches(
                device,
                dstCache,
                srcCaches);
    }
    
    public static VkResult vkMergeValidationCachesEXT(
            VkDevice device,
            VkValidationCacheEXT dstCache,
            Collection<VkValidationCacheEXT> srcCaches)
    {
        return v11ProxyLibrary.vkMergeValidationCachesEXT(
                device,
                dstCache,
                srcCaches);
    }
    
    public static VkResult vkQueueBindSparse(
            VkQueue queue,
            Collection<VkBindSparseInfo> bindInfo,
            VkFence fence)
    {
        return v11ProxyLibrary.vkQueueBindSparse(
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
        return v11ProxyLibrary.vkRegisterDeviceEventEXT(
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
        return v11ProxyLibrary.vkRegisterDisplayEventEXT(
                device,
                display,
                displayEventInfo,
                allocator,
                fence);
    }
    
    public static VkResult vkRegisterObjectsNVX(
            VkDevice device,
            VkObjectTableNVX objectTable,
            Collection<VkObjectTableEntryNVX> objectTableEntries,
            int[] objectIndices)
    {
        return v11ProxyLibrary.vkRegisterObjectsNVX(
                device,
                objectTable,
                objectTableEntries,
                objectIndices);
    }
    
    public static VkResult vkReleaseDisplayEXT(
            VkPhysicalDevice physicalDevice,
            VkDisplayKHR display)
    {
        return v11ProxyLibrary.vkReleaseDisplayEXT(
                physicalDevice,
                display);
    }
    
    public static VkResult vkResetCommandBuffer(
            VkCommandBuffer commandBuffer,
            EnumSet<VkCommandBufferResetFlagBits> flags)
    {
        return v11ProxyLibrary.vkResetCommandBuffer(
                commandBuffer,
                flags);
    }
    
    public static VkResult vkResetCommandPool(
            VkDevice device,
            VkCommandPool commandPool,
            EnumSet<VkCommandPoolResetFlagBits> flags)
    {
        return v11ProxyLibrary.vkResetCommandPool(
                device,
                commandPool,
                flags);
    }
    
    public static VkResult vkResetDescriptorPool(
            VkDevice device,
            VkDescriptorPool descriptorPool,
            EnumSet<VkDescriptorPoolResetFlagBits> flags)
    {
        return v11ProxyLibrary.vkResetDescriptorPool(
                device,
                descriptorPool,
                flags);
    }
    
    public static VkResult vkResetEvent(
            VkDevice device,
            VkEvent event)
    {
        return v11ProxyLibrary.vkResetEvent(
                device,
                event);
    }
    
    public static void vkResetQueryPoolEXT(
            VkDevice device,
            VkQueryPool queryPool,
            int firstQuery,
            int queryCount)
    {
        v11ProxyLibrary.vkResetQueryPoolEXT(
                device,
                queryPool,
                firstQuery,
                queryCount);
    }
    
    public static VkResult vkSetEvent(
            VkDevice device,
            VkEvent event)
    {
        return v11ProxyLibrary.vkSetEvent(
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
        
        v11ProxyLibrary.vkSetHdrMetadataEXT(
                device,
                swapchains,
                metadata);
    }
    
    public static void vkSetLocalDimmingAMD(
            VkDevice device,
            VkSwapchainKHR swapChain,
            boolean localDimmingEnable)
    {
        v11ProxyLibrary.vkSetLocalDimmingAMD(
                device,
                swapChain,
                localDimmingEnable);
    }
    
    public static void vkTrimCommandPool(
            VkDevice device,
            VkCommandPool commandPool,
            EnumSet<VkCommandPoolTrimFlagBits> flags)
    {
        v11ProxyLibrary.vkTrimCommandPool(
                device,
                commandPool,
                flags);
    }
    
    public static void vkTrimCommandPoolKHR(
            VkDevice device,
            VkCommandPool commandPool,
            EnumSet<VkCommandPoolTrimFlagBits> flags)
    {
        v11ProxyLibrary.vkTrimCommandPool(
                device,
                commandPool,
                flags);
    }
    
    public static VkResult vkUnregisterObjectsNVX(
            VkDevice device,
            VkObjectTableNVX objectTable,
            Collection<VkObjectEntryTypeNVX> objectEntryTypes,
            int[] objectIndices)
    {
        if (objectEntryTypes.size() != objectIndices.length)
        {
            throw new IllegalArgumentException("objectEntryTypes and objectIndices MUST have the same number of elements.");
        }
        
        return v11ProxyLibrary.vkUnregisterObjectsNVX(
                device,
                objectTable,
                objectEntryTypes,
                objectIndices);
    }
    
    //TODO Fix this
    public static void vkUpdateDescriptorSetWithTemplate(
            VkDevice device,
            VkDescriptorSet descriptorSet,
            VkDescriptorUpdateTemplate descriptorUpdateTemplate,
            Collection<Object> data)
    {
        v11ProxyLibrary.vkUpdateDescriptorSetWithTemplate(
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
        v11ProxyLibrary.vkUpdateDescriptorSetWithTemplate(
                device,
                descriptorSet,
                descriptorUpdateTemplate,
                data);
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

        v11ProxyLibrary.pushDataToVirtualMemory(byteBuffer.array(), pointerToMappedMemory);
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
        v11ProxyLibrary.pushDataToVirtualMemory(byteArray, pointerToMappedMemory);
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
        
        v11ProxyLibrary.pushDataToVirtualMemory(floatBuffer.array(), pointerToMappedMemory);
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
        v11ProxyLibrary.pushDataToVirtualMemory(floatArray, pointerToMappedMemory);
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
        
        v11ProxyLibrary.pushDataToVirtualMemory(intBuffer.array(), pointerToMappedMemory);
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
        v11ProxyLibrary.pushDataToVirtualMemory(intArray, pointerToMappedMemory);
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
        return v11ProxyLibrary.wlDisplayConnect(
                displayName,
                eventHandlerWorkQueue);
    }
    
    public static void wlDisplayDisconnect(
            WlDisplayHandle waylandDisplay)
    {
        v11ProxyLibrary.wlDisplayDisconnect(waylandDisplay);
    }
    
    public static void wlDisplayDispatch(
            WlDisplayHandle waylandDisplay)
    {
        v11ProxyLibrary.wlDisplayDispatch(waylandDisplay);
    }
    
    public static int wlDisplayDispatchPending(
            WlDisplayHandle waylandDisplay)
    {
        return v11ProxyLibrary.wlDisplayDispatchPending(waylandDisplay);
    }
    
    public static int wlDisplayFlush(
            WlDisplayHandle waylandDisplay)
    {
        return v11ProxyLibrary.wlDisplayFlush(waylandDisplay);
    }
    
    public static WlRegistryHandle wlDisplayGetRegistry(
            WlDisplayHandle waylandDisplay)
    {
        return v11ProxyLibrary.wlDisplayGetRegistry(waylandDisplay);
    }
    
    public static int wlDisplayPrepareRead(
            WlDisplayHandle waylandDisplay)
    {
        return v11ProxyLibrary.wlDisplayPrepareRead(waylandDisplay);
    }
    
    public static int wlDisplayReadEvents(
            WlDisplayHandle waylandDisplay)
    {
        return v11ProxyLibrary.wlDisplayReadEvents(waylandDisplay);
    }
    

    public static void wlDisplayRoundTrip(
            WlDisplayHandle waylandDisplay)
    {
        v11ProxyLibrary.wlDisplayRoundTrip(waylandDisplay);
    }
    
    public static void wlDisplaySync(
            WlDisplayHandle waylandDisplay)
    {
        v11ProxyLibrary.wlDisplaySync(waylandDisplay);
    }
    
    public static VulkanHandle wlRegistryBind(
            WlRegistryHandle waylandRegistry,
            int interfaceId,
            String textInterfaceName,
            int interfaceVersion)
    {
        return v11ProxyLibrary.wlRegistryBind(
                waylandRegistry,
                interfaceId,
                textInterfaceName,
                interfaceVersion);
    }
    
    public static WlRegionHandle wlCompositorCreateRegion(
            WlCompositorHandle waylandCompositor)
    {
        return v11ProxyLibrary.wlCompositorCreateRegion(waylandCompositor);
    }
    
    public static WlSurfaceHandle wlCompositorCreateSurface(
            WlCompositorHandle waylandCompositor)
    {
        return v11ProxyLibrary.wlCompositorCreateSurface(waylandCompositor);
    }
    
    public static void wlKeyboardRelease(
            WlKeyboardHandle waylandKeyboard)
    {
        v11ProxyLibrary.wlKeyboardRelease(waylandKeyboard);
    }
    
    public static void wlPointerRelease(
            WlPointerHandle waylandPointer)
    {
        v11ProxyLibrary.wlPointerRelease(waylandPointer);
    }
    
    public static void wlPointerSetCursor(
            WlPointerHandle waylandPointer,
            int serialNumber,
            WlSurfaceHandle waylandSurface,
            int x,
            int y)
    {
        v11ProxyLibrary.wlPointerSetCursor(waylandPointer, serialNumber, waylandSurface, x, y);
    }
    
    public static WlKeyboardHandle wlSeatGetKeyboard(
            WlSeatHandle waylandSeat)
    {
        return v11ProxyLibrary.wlSeatGetKeyboard(waylandSeat);
    }
    
    public static WlPointerHandle wlSeatGetPointer(
            WlSeatHandle waylandSeat)
    {
        return v11ProxyLibrary.wlSeatGetPointer(waylandSeat);
    }
    
    public static WlTouchHandle wlSeatGetTouch(
            WlSeatHandle waylandSeat)
    {
        return v11ProxyLibrary.wlSeatGetTouch(waylandSeat);
    }
    
    public static void wlSeatRelease(
            WlSeatHandle waylandSeat)
    {
        v11ProxyLibrary.wlSeatRelease(waylandSeat);
    }
    
    public static WlShellSurfaceHandle wlShellGetShellSurface(
            WlShellHandle waylandShellInterface,
            WlSurfaceHandle waylandSurface)
    {
        return v11ProxyLibrary.wlShellGetShellSurface(waylandShellInterface, waylandSurface);
    }

    public static void wlShellSurfaceMove(
            WlShellSurfaceHandle waylandshellSurface,
            WlSeatHandle waylandSeat,
            int serialNumber)
    {
        v11ProxyLibrary.wlShellSurfaceMove(waylandshellSurface, waylandSeat, serialNumber);
    }
    
    public static void wlShellSurfacePong(
            WlShellSurfaceHandle waylandshellSurface,
            int serialNumber)
    {
        v11ProxyLibrary.wlShellSurfacePong(waylandshellSurface, serialNumber);
    }
    
    public static void wlShellSurfaceResize(
            WlShellSurfaceHandle waylandshellSurface,
            WlSeatHandle waylandSeat,
            int serialNumber,
            WlShellSurfaceResize edges)
    {
        v11ProxyLibrary.wlShellSurfaceResize(
                waylandshellSurface,
                waylandSeat,
                serialNumber,
                edges);
    }
    
    public static void wlShellSurfaceSetClass(
            WlShellSurfaceHandle waylandshellSurface,
            String className)
    {
        v11ProxyLibrary.wlShellSurfaceSetClass(waylandshellSurface, className);
    }
    
    public static void wlShellSurfaceSetFullscreen(
            WlShellSurfaceHandle waylandshellSurface,
            WlShellSurfaceFullscreenMethod method,
            int framerate,
            WlOutputHandle waylandOutput)
    {
        v11ProxyLibrary.wlShellSurfaceSetFullscreen(
                waylandshellSurface,
                method,
                framerate,
                waylandOutput);
    }
    
    public static void wlShellSurfaceSetMaximized(
            WlShellSurfaceHandle waylandshellSurface,
            WlOutputHandle waylandOutput)
    {
        v11ProxyLibrary.wlShellSurfaceSetMaximized(waylandshellSurface, waylandOutput);
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
        v11ProxyLibrary.wlShellSurfaceSetPopup(
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
        v11ProxyLibrary.wlShellSurfaceSetTitle(waylandshellSurface, surfaceTitle);
    }
    
    public static void wlShellSurfaceSetTopLevel(
            WlShellSurfaceHandle waylandshellSurface)
    {
        v11ProxyLibrary.wlShellSurfaceSetTopLevel(waylandshellSurface);
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
        v11ProxyLibrary.wlShellSurfaceSetTransient(
                waylandshellSurface,
                parentSurface,
                x,
                y,
                flags);
    }
    
    public static void wlSurfaceCommit(
            WlSurfaceHandle waylandSurfaceHandle)
    {
        v11ProxyLibrary.wlSurfaceCommit(
                waylandSurfaceHandle);
    }
    
    public static void wlSurfaceDamage(
            WlSurfaceHandle waylandSurfaceHandle,
            int x,
            int y,
            int width,
            int height)
    {
        v11ProxyLibrary.wlSurfaceDamage(
                waylandSurfaceHandle,
                x,
                y,
                width,
                height);
    }
}
