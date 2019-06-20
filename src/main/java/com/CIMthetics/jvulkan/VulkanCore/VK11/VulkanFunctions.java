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
import java.util.concurrent.LinkedBlockingQueue;

import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkDependencyFlagBits;
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
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkQueryType;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Enums.VkResult;
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
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkBindImageMemoryInfo;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkBufferCopy;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkBufferImageCopy;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkBufferMemoryBarrier;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkCopyDescriptorSet;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkExtensionProperties;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkFormatProperties;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkImageFormatProperties;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkImageFormatProperties2;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkImageMemoryBarrier;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkMemoryBarrier;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkMemoryRequirements;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkPhysicalDeviceFeatures;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkPhysicalDeviceMemoryProperties;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkPhysicalDeviceProperties;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkPhysicalDeviceProperties2;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkQueueFamilyProperties;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkRect2D;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkSurfaceCapabilitiesKHR;
import com.CIMthetics.jvulkan.VulkanCore.VK11.Structures.VkSurfaceFormatKHR;
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
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Enums.VkDebugUtilsMessageSeverityFlagBitsEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Enums.VkDebugUtilsMessageTypeFlagBitsEXT;
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
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkDebugUtilsLabelEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkDebugUtilsLabelEXTlabelInfo;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkDebugUtilsMessengerCallbackDataEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkDebugUtilsObjectNameInfoEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkDebugUtilsObjectTagInfoEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkImageDrmFormatModifierPropertiesEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkMemoryRequirements2KHR;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkPhysicalDeviceImageFormatInfo2;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkPhysicalDeviceSurfaceInfo2KHR;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkShadingRatePaletteNV;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.VkSurfaceCapabilities2KHR;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.CreateInfos.VkAccelerationStructureCreateInfoNV;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.CreateInfos.VkDebugReportCallbackCreateInfoEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.CreateInfos.VkDebugUtilsMessengerCreateInfoEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.CreateInfos.VkDisplayModeCreateInfoKHR;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.CreateInfos.VkDisplaySurfaceCreateInfoKHR;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.CreateInfos.VkRayTracingPipelineCreateInfoNV;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures.CreateInfos.VkWaylandSurfaceCreateInfoKHR;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Handles.CheckpointMarker;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Handles.VkAccelerationStructureNV;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Handles.VkDebugReportCallbackEXT;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Handles.VkDeviceAddress;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Handles.VkDisplayKHR;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Handles.VkDisplayModeKHR;
import com.CIMthetics.jvulkan.VulkanExtensions.VK11.Handles.VkSurfaceKHR;
import com.CIMthetics.jvulkan.Wayland.WlRegistryListener;
import com.CIMthetics.jvulkan.Wayland.Enums.WlShellSurfaceFullscreenMethod;
import com.CIMthetics.jvulkan.Wayland.Enums.WlShellSurfaceResize;
import com.CIMthetics.jvulkan.Wayland.Enums.WlShellSurfaceTransientBehavior;
import com.CIMthetics.jvulkan.Wayland.Handles.WlCallbackHandle;
import com.CIMthetics.jvulkan.Wayland.Handles.WlCompositorHandle;
import com.CIMthetics.jvulkan.Wayland.Handles.WlDisplayHandle;
import com.CIMthetics.jvulkan.Wayland.Handles.WlOutputHandle;
import com.CIMthetics.jvulkan.Wayland.Handles.WlRegionHandle;
import com.CIMthetics.jvulkan.Wayland.Handles.WlRegistryHandle;
import com.CIMthetics.jvulkan.Wayland.Handles.WlShellHandle;
import com.CIMthetics.jvulkan.Wayland.Handles.WlShellSurfaceHandle;
import com.CIMthetics.jvulkan.Wayland.Handles.WlSurfaceHandle;
import com.CIMthetics.jvulkan.Wayland.Objects.WaylandEventObject;
import com.CIMthetics.jvulkan.Wayland.Objects.WlSeatHandle;

public class VulkanFunctions
{
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

        System.load(VulkanFunctions.pathToNativeLibrary + VulkanFunctions.nativeLibraryName );

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
            int bindingCount,
            Collection<VkBuffer> buffers,
            long[] offsets,
            long[] sizes)
    {
        v11ProxyLibrary.vkCmdBindTransformFeedbackBuffersEXT(
                commandBuffer,
                firstBinding,
                bindingCount,
                buffers,
                offsets,
                sizes);
    }
    
    public static void vkCmdBeginTransformFeedbackEXT(
            VkCommandBuffer commandBuffer,
            int firstCounterBuffer,
            int counterBufferCount,
            Collection<VkBuffer> counterBuffers,
            long[] counterBufferOffsets)
    {
        v11ProxyLibrary.vkCmdBeginTransformFeedbackEXT(
                commandBuffer,
                firstCounterBuffer,
                counterBufferCount,
                counterBuffers,
                counterBufferOffsets);
    }
    
    public static void vkCmdEndTransformFeedbackEXT(
            VkCommandBuffer commandBuffer,
            int firstCounterBuffer,
            int counterBufferCount,
            Collection<VkBuffer> counterBuffers,
            long[] counterBufferOffsets)
    {
        v11ProxyLibrary.vkCmdEndTransformFeedbackEXT(
                commandBuffer,
                firstCounterBuffer,
                counterBufferCount,
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
    
    public static VkResult vkGetCalibratedTimestampsEXT(
            VkDevice device,
            Collection<VkCalibratedTimestampInfoEXT> timestampInfos,
            long[] timestamps,
            long[] maxDeviation)
    {
        return v11ProxyLibrary.vkGetCalibratedTimestampsEXT(
                device,
                timestampInfos,
                timestamps,
                maxDeviation);
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
        else
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
    
//    public static void wlDisconnectDisplay(
//            WlDisplayHandle waylandDisplay)
//    {
//        v11ProxyLibrary.wlDisconnectDisplay(waylandDisplay);
//    }
//    
    public static WlRegistryHandle wlDisplayGetRegistry(
            WlDisplayHandle waylandDisplay)
    {
        return v11ProxyLibrary.wlDisplayGetRegistry(waylandDisplay);
    }
    
    public static void wlDisplaySync(
            WlDisplayHandle waylandDisplay)
    {
        v11ProxyLibrary.wlDisplaySync(waylandDisplay);
    }
    
//    /**
//     * Add a listener to catch state changed (services added or removed) events
//     * from the registry.
//     * <p>
//     * Note:<br>
//     * The current implementaion of this assumes that this will only be called once
//     * for a given registry.  If this is called more than once the previous callback
//     * and user data will be replaced by the ones supplied to this method.
//     * 
//     * @param waylandRegistry
//     * @param registryListener
//     * @param userData
//     */
//    public static void wlRegistryAddListener(
//            WlRegistryHandle waylandRegistry,
//            WlRegistryListener registryListener, 
//            Object userData)
//    {
//        v11ProxyLibrary.wlRegistryAddListener(waylandRegistry, registryListener, userData);
//    }
//    
    public static void wlDisplayDispatch(
            WlDisplayHandle waylandDisplay)
    {
        v11ProxyLibrary.wlDisplayDispatch(waylandDisplay);
    }
    
    public static void wlRoundTrip(
            WlDisplayHandle waylandDisplay)
    {
        v11ProxyLibrary.wlRoundTrip(waylandDisplay);
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
