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

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanExtensions.Enums.VkColorSpaceKHR;
import com.CIMthetics.jvulkan.VulkanExtensions.Enums.VkDebugReportObjectTypeEXT;

public class VulkanConstants
{
    public static final int     VK_HEADER_VERSION = 141;
    public static final float   VK_LOD_CLAMP_NONE               = 1000.0f;
    public static final int     VK_REMAINING_MIP_LEVELS         = -1;
    public static final int     VK_REMAINING_ARRAY_LAYERS       = -1;
    public static final long    VK_WHOLE_SIZE                   = -1;
    public static final int     VK_ATTACHMENT_UNUSED            = -1;
    public static final boolean VK_TRUE                         = true;
    public static final boolean VK_FALSE                        = false;
    public static final int     VK_QUEUE_FAMILY_IGNORED         = -1;
    public static final int     VK_SUBPASS_EXTERNAL             = -1;
    public static final int     VK_MAX_PHYSICAL_DEVICE_NAME_SIZE = 256;
    public static final int     VK_UUID_SIZE                    = 16;
    public static final int     VK_MAX_MEMORY_TYPES             = 32;
    public static final int     VK_MAX_MEMORY_HEAPS             = 16;
    public static final int     VK_MAX_EXTENSION_NAME_SIZE      = 256;
    public static final int     VK_MAX_DESCRIPTION_SIZE         = 256;
    public static final int     VK_MAX_DEVICE_GROUP_SIZE        = 32;
    public static final int     VK_LUID_SIZE                    = 8;
    public static final int     VK_QUEUE_FAMILY_EXTERNAL        = -2;
    public static final int     VK_SHADER_UNUSED_KHR            = -1;
    public static final int     VK_SHADER_UNUSED_NV             = VK_SHADER_UNUSED_KHR;
    

    public static final boolean K_KHR_wayland_surface           = true;
    public static final int     VK_KHR_WAYLAND_SURFACE_SPEC_VERSION = 6;
    public static final String  VK_KHR_WAYLAND_SURFACE_EXTENSION_NAME = "VK_KHR_wayland_surface";

    public static final boolean VK_KHR_surface = true;
    public static final int     VK_KHR_SURFACE_SPEC_VERSION     = 25;
    public static final String  VK_KHR_SURFACE_EXTENSION_NAME   = "VK_KHR_surface";
    public static final VkColorSpaceKHR VK_COLORSPACE_SRGB_NONLINEAR_KHR = VkColorSpaceKHR.VK_COLOR_SPACE_SRGB_NONLINEAR_KHR;
    
    public static final boolean VK_KHR_swapchain  = true;
    public static final int     VK_KHR_SWAPCHAIN_SPEC_VERSION   = 70;
    public static final String  VK_KHR_SWAPCHAIN_EXTENSION_NAME = "VK_KHR_swapchain";
    
    public static final boolean VK_KHR_display = true;
    public static final int     VK_KHR_DISPLAY_SPEC_VERSION     = 23;
    public static final String  VK_KHR_DISPLAY_EXTENSION_NAME   = "VK_KHR_display";

    public static final boolean VK_KHR_display_swapchain        = true;
    public static final int     VK_KHR_DISPLAY_SWAPCHAIN_SPEC_VERSION = 10;
    public static final String  VK_KHR_DISPLAY_SWAPCHAIN_EXTENSION_NAME = "VK_KHR_display_swapchain";

    public static final boolean VK_KHR_sampler_mirror_clamp_to_edge = true;
    public static final int     VK_KHR_SAMPLER_MIRROR_CLAMP_TO_EDGE_SPEC_VERSION = 3;
    public static final String  VK_KHR_SAMPLER_MIRROR_CLAMP_TO_EDGE_EXTENSION_NAME = "VK_KHR_sampler_mirror_clamp_to_edge";

    public static final boolean VK_KHR_multiview = true;
    public static final int     VK_KHR_MULTIVIEW_SPEC_VERSION   = 1;
    public static final String  VK_KHR_MULTIVIEW_EXTENSION_NAME = "VK_KHR_multiview";

    public static final boolean VK_KHR_get_physical_device_properties2 = true;
    public static final int     VK_KHR_GET_PHYSICAL_DEVICE_PROPERTIES_2_SPEC_VERSION    = 2;
    public static final String  VK_KHR_GET_PHYSICAL_DEVICE_PROPERTIES_2_EXTENSION_NAME  = "VK_KHR_get_physical_device_properties2";
    
    public static final boolean VK_KHR_device_group = true;
    public static final int     VK_KHR_DEVICE_GROUP_SPEC_VERSION    = 4;
    public static final String  VK_KHR_DEVICE_GROUP_EXTENSION_NAME = "VK_KHR_device_group";

    public static final boolean VK_KHR_shader_draw_parameters = true;
    public static final int     VK_KHR_SHADER_DRAW_PARAMETERS_SPEC_VERSION  = 1;
    public static final String  VK_KHR_SHADER_DRAW_PARAMETERS_EXTENSION_NAME    = "VK_KHR_shader_draw_parameters";


    public static final boolean VK_KHR_maintenance1 = true;
    public static final int     VK_KHR_MAINTENANCE1_SPEC_VERSION    = 2;
    public static final String  VK_KHR_MAINTENANCE1_EXTENSION_NAME  = "VK_KHR_maintenance1";

    public static final boolean VK_KHR_device_group_creation    = true;
    public static final int     VK_KHR_DEVICE_GROUP_CREATION_SPEC_VERSION   = 1;
    public static final String  VK_KHR_DEVICE_GROUP_CREATION_EXTENSION_NAME = "VK_KHR_device_group_creation";
    public static final int     VK_MAX_DEVICE_GROUP_SIZE_KHR    = VK_MAX_DEVICE_GROUP_SIZE;

    public static final boolean VK_KHR_external_memory_capabilities = true;
    public static final int     VK_KHR_EXTERNAL_MEMORY_CAPABILITIES_SPEC_VERSION    = 1;
    public static final String  VK_KHR_EXTERNAL_MEMORY_CAPABILITIES_EXTENSION_NAME  = "VK_KHR_external_memory_capabilities";
    public static final int     VK_LUID_SIZE_KHR    = VK_LUID_SIZE;

    public static final boolean VK_KHR_external_memory  = true;
    public static final int     VK_KHR_EXTERNAL_MEMORY_SPEC_VERSION = 1;
    public static final String  VK_KHR_EXTERNAL_MEMORY_EXTENSION_NAME   = "VK_KHR_external_memory";
    public static final int     VK_QUEUE_FAMILY_EXTERNAL_KHR    = VK_QUEUE_FAMILY_EXTERNAL;

    public static final boolean VK_KHR_external_memory_fd   = true;
    public static final int     VK_KHR_EXTERNAL_MEMORY_FD_SPEC_VERSION  = 1;
    public static final String  VK_KHR_EXTERNAL_MEMORY_FD_EXTENSION_NAME    = "VK_KHR_external_memory_fd";

    public static final boolean VK_KHR_external_semaphore_capabilities  = true;
    public static final int     VK_KHR_EXTERNAL_SEMAPHORE_CAPABILITIES_SPEC_VERSION = 1;
    public static final String  VK_KHR_EXTERNAL_SEMAPHORE_CAPABILITIES_EXTENSION_NAME   = "VK_KHR_external_semaphore_capabilities";

    public static final boolean VK_KHR_external_semaphore   = true;
    public static final int     VK_KHR_EXTERNAL_SEMAPHORE_SPEC_VERSION  = 1;
    public static final String  VK_KHR_EXTERNAL_SEMAPHORE_EXTENSION_NAME = "VK_KHR_external_semaphore";

    public static final boolean VK_KHR_external_semaphore_fd = true;
    public static final int     VK_KHR_EXTERNAL_SEMAPHORE_FD_SPEC_VERSION   = 1;
    public static final String  VK_KHR_EXTERNAL_SEMAPHORE_FD_EXTENSION_NAME = "VK_KHR_external_semaphore_fd";

    public static final boolean VK_KHR_push_descriptor  = true;
    public static final int     VK_KHR_PUSH_DESCRIPTOR_SPEC_VERSION = 2;
    public static final String  VK_KHR_PUSH_DESCRIPTOR_EXTENSION_NAME   = "VK_KHR_push_descriptor";

    public static final boolean VK_KHR_16bit_storage    = true;
    public static final int     VK_KHR_16BIT_STORAGE_SPEC_VERSION   = 1;
    public static final String  VK_KHR_16BIT_STORAGE_EXTENSION_NAME = "VK_KHR_16bit_storage";

    public static final boolean VK_KHR_incremental_present  = true;
    public static final int     VK_KHR_INCREMENTAL_PRESENT_SPEC_VERSION = 1;
    public static final String  VK_KHR_INCREMENTAL_PRESENT_EXTENSION_NAME   = "VK_KHR_incremental_present";

    public static final boolean VK_KHR_descriptor_update_template   = true;
    public static final int     VK_KHR_DESCRIPTOR_UPDATE_TEMPLATE_SPEC_VERSION  = 1;
    public static final String  VK_KHR_DESCRIPTOR_UPDATE_TEMPLATE_EXTENSION_NAME    = "VK_KHR_descriptor_update_template";

    public static final boolean VK_KHR_shared_presentable_image = true;
    public static final int     VK_KHR_SHARED_PRESENTABLE_IMAGE_SPEC_VERSION    = 1;
    public static final String  VK_KHR_SHARED_PRESENTABLE_IMAGE_EXTENSION_NAME  = "VK_KHR_shared_presentable_image";

    public static final boolean VK_KHR_external_fence_capabilities  = true;
    public static final int     VK_KHR_EXTERNAL_FENCE_CAPABILITIES_SPEC_VERSION = 1;
    public static final String  VK_KHR_EXTERNAL_FENCE_CAPABILITIES_EXTENSION_NAME   = "VK_KHR_external_fence_capabilities";

    public static final boolean VK_KHR_external_fence   = true;
    public static final int     VK_KHR_EXTERNAL_FENCE_SPEC_VERSION  = 1;
    public static final String  VK_KHR_EXTERNAL_FENCE_EXTENSION_NAME    = "VK_KHR_external_fence";

    public static final boolean VK_KHR_external_fence_fd    = true;
    public static final int     VK_KHR_EXTERNAL_FENCE_FD_SPEC_VERSION   = 1;
    public static final String  VK_KHR_EXTERNAL_FENCE_FD_EXTENSION_NAME = "VK_KHR_external_fence_fd";

    public static final boolean VK_KHR_maintenance2 = true;
    public static final int     VK_KHR_MAINTENANCE2_SPEC_VERSION    = 1;
    public static final String  VK_KHR_MAINTENANCE2_EXTENSION_NAME  = "VK_KHR_maintenance2";

    public static final boolean VK_KHR_get_surface_capabilities2    = true;
    public static final int     VK_KHR_GET_SURFACE_CAPABILITIES_2_SPEC_VERSION  = 1;
    public static final String  VK_KHR_GET_SURFACE_CAPABILITIES_2_EXTENSION_NAME    = "VK_KHR_get_surface_capabilities2";

    public static final boolean VK_KHR_variable_pointers    = true;
    public static final int     VK_KHR_VARIABLE_POINTERS_SPEC_VERSION   = 1;
    public static final String  VK_KHR_VARIABLE_POINTERS_EXTENSION_NAME = "VK_KHR_variable_pointers";

    public static final boolean VK_KHR_get_display_properties2  = true;
    public static final int     VK_KHR_GET_DISPLAY_PROPERTIES_2_SPEC_VERSION    = 1;
    public static final String  VK_KHR_GET_DISPLAY_PROPERTIES_2_EXTENSION_NAME  = "VK_KHR_get_display_properties2";

    public static final boolean VK_KHR_dedicated_allocation = true;
    public static final int     VK_KHR_DEDICATED_ALLOCATION_SPEC_VERSION    = 3;
    public static final String  VK_KHR_DEDICATED_ALLOCATION_EXTENSION_NAME  = "VK_KHR_dedicated_allocation";

    public static final boolean VK_KHR_storage_buffer_storage_class = true;
    public static final int     VK_KHR_STORAGE_BUFFER_STORAGE_CLASS_SPEC_VERSION    = 1;
    public static final String  VK_KHR_STORAGE_BUFFER_STORAGE_CLASS_EXTENSION_NAME  = "VK_KHR_storage_buffer_storage_class";


    public static final boolean VK_KHR_relaxed_block_layout = true;
    public static final int     VK_KHR_RELAXED_BLOCK_LAYOUT_SPEC_VERSION    = 1;
    public static final String  VK_KHR_RELAXED_BLOCK_LAYOUT_EXTENSION_NAME  = "VK_KHR_relaxed_block_layout";


    public static final boolean VK_KHR_get_memory_requirements2 = true;
    public static final int     VK_KHR_GET_MEMORY_REQUIREMENTS_2_SPEC_VERSION   = 1;
    public static final String  VK_KHR_GET_MEMORY_REQUIREMENTS_2_EXTENSION_NAME = "VK_KHR_get_memory_requirements2";

    public static final boolean VK_KHR_image_format_list    = true;
    public static final int     VK_KHR_IMAGE_FORMAT_LIST_SPEC_VERSION   = 1;
    public static final String  VK_KHR_IMAGE_FORMAT_LIST_EXTENSION_NAME = "VK_KHR_image_format_list";

    public static final boolean VK_KHR_sampler_ycbcr_conversion = true;
    public static final int     VK_KHR_SAMPLER_YCBCR_CONVERSION_SPEC_VERSION    = 14;
    public static final String  VK_KHR_SAMPLER_YCBCR_CONVERSION_EXTENSION_NAME  = "VK_KHR_sampler_ycbcr_conversion";

    public static final boolean VK_KHR_bind_memory2 = true;
    public static final int     VK_KHR_BIND_MEMORY_2_SPEC_VERSION   = 1;
    public static final String  VK_KHR_BIND_MEMORY_2_EXTENSION_NAME = "VK_KHR_bind_memory2";

    public static final boolean VK_KHR_draw_indirect_count  = true;
    public static final int     VK_KHR_DRAW_INDIRECT_COUNT_SPEC_VERSION = 1;
    public static final String  VK_KHR_DRAW_INDIRECT_COUNT_EXTENSION_NAME   = "VK_KHR_draw_indirect_count";

    public static final boolean VK_EXT_debug_report = true;

    public static final int     VK_EXT_DEBUG_REPORT_SPEC_VERSION    = 9;
    public static final String  VK_EXT_DEBUG_REPORT_EXTENSION_NAME  = "VK_EXT_debug_report";
    public static final VkStructureType VK_STRUCTURE_TYPE_DEBUG_REPORT_CREATE_INFO_EXT  = VkStructureType.VK_STRUCTURE_TYPE_DEBUG_REPORT_CALLBACK_CREATE_INFO_EXT;
    public static final VkDebugReportObjectTypeEXT VK_DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_EXT = VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_CALLBACK_EXT_EXT;

    public static final boolean VK_NV_glsl_shader   = true;
    public static final int     VK_NV_GLSL_SHADER_SPEC_VERSION  = 1;
    public static final String  VK_NV_GLSL_SHADER_EXTENSION_NAME    = "VK_NV_glsl_shader";

    public static final boolean VK_EXT_depth_range_unrestricted = true;
    public static final int     VK_EXT_DEPTH_RANGE_UNRESTRICTED_SPEC_VERSION    = 1;
    public static final String  VK_EXT_DEPTH_RANGE_UNRESTRICTED_EXTENSION_NAME  = "VK_EXT_depth_range_unrestricted";

    public static final boolean VK_IMG_filter_cubic = true;
    public static final int     VK_IMG_FILTER_CUBIC_SPEC_VERSION    = 1;
    public static final String  VK_IMG_FILTER_CUBIC_EXTENSION_NAME  = "VK_IMG_filter_cubic";

    public static final boolean VK_AMD_rasterization_order  = true;
    public static final int     VK_AMD_RASTERIZATION_ORDER_SPEC_VERSION = 1;
    public static final String  VK_AMD_RASTERIZATION_ORDER_EXTENSION_NAME   = "VK_AMD_rasterization_order";

    public static final boolean VK_AMD_shader_trinary_minmax    = true;
    public static final int     VK_AMD_SHADER_TRINARY_MINMAX_SPEC_VERSION   = 1;
    public static final String  VK_AMD_SHADER_TRINARY_MINMAX_EXTENSION_NAME = "VK_AMD_shader_trinary_minmax";

    public static final boolean VK_AMD_shader_explicit_vertex_parameter = true;
    public static final int     VK_AMD_SHADER_EXPLICIT_VERTEX_PARAMETER_SPEC_VERSION    = 1;
    public static final String  VK_AMD_SHADER_EXPLICIT_VERTEX_PARAMETER_EXTENSION_NAME  = "VK_AMD_shader_explicit_vertex_parameter";

    public static final boolean VK_EXT_debug_marker = true;
    public static final int     VK_EXT_DEBUG_MARKER_SPEC_VERSION    = 4;
    public static final String  VK_EXT_DEBUG_MARKER_EXTENSION_NAME  = "VK_EXT_debug_marker";

    public static final boolean VK_AMD_gcn_shader    = true;
    public static final int     VK_AMD_GCN_SHADER_SPEC_VERSION  = 1;
    public static final String  VK_AMD_GCN_SHADER_EXTENSION_NAME    = "VK_AMD_gcn_shader";


    public static final boolean VK_NV_dedicated_allocation  = true;
    public static final int     VK_NV_DEDICATED_ALLOCATION_SPEC_VERSION = 1;
    public static final String  VK_NV_DEDICATED_ALLOCATION_EXTENSION_NAME   = "VK_NV_dedicated_allocation";

    public static final boolean VK_AMD_draw_indirect_count  = true;
    public static final int     VK_AMD_DRAW_INDIRECT_COUNT_SPEC_VERSION = 2;
    public static final String  VK_AMD_DRAW_INDIRECT_COUNT_EXTENSION_NAME   = "VK_AMD_draw_indirect_count";

    public static final boolean VK_AMD_negative_viewport_height = true;
    public static final int     VK_AMD_NEGATIVE_VIEWPORT_HEIGHT_SPEC_VERSION    = 1;
    public static final String  VK_AMD_NEGATIVE_VIEWPORT_HEIGHT_EXTENSION_NAME  = "VK_AMD_negative_viewport_height";

    public static final boolean VK_AMD_gpu_shader_half_float    = true;
    public static final int     VK_AMD_GPU_SHADER_HALF_FLOAT_SPEC_VERSION   = 2;
    public static final String  VK_AMD_GPU_SHADER_HALF_FLOAT_EXTENSION_NAME = "VK_AMD_gpu_shader_half_float";

    public static final boolean VK_AMD_shader_ballot    = true;
    public static final int     VK_AMD_SHADER_BALLOT_SPEC_VERSION   = 1;
    public static final String  VK_AMD_SHADER_BALLOT_EXTENSION_NAME = "VK_AMD_shader_ballot";

    public static final boolean VK_AMD_texture_gather_bias_lod  = true;
    public static final int     VK_AMD_TEXTURE_GATHER_BIAS_LOD_SPEC_VERSION = 1;
    public static final String  VK_AMD_TEXTURE_GATHER_BIAS_LOD_EXTENSION_NAME   = "VK_AMD_texture_gather_bias_lod";

    public static final boolean VK_AMD_shader_info  = true;
    public static final int     VK_AMD_SHADER_INFO_SPEC_VERSION = 1;
    public static final String  VK_AMD_SHADER_INFO_EXTENSION_NAME   = "VK_AMD_shader_info";

    public static final boolean VK_AMD_shader_image_load_store_lod  = true;
    public static final int     VK_AMD_SHADER_IMAGE_LOAD_STORE_LOD_SPEC_VERSION = 1;
    public static final String  VK_AMD_SHADER_IMAGE_LOAD_STORE_LOD_EXTENSION_NAME   = "VK_AMD_shader_image_load_store_lod";


    public static final boolean VK_IMG_format_pvrtc = true;
    public static final int     VK_IMG_FORMAT_PVRTC_SPEC_VERSION    = 1;
    public static final String  VK_IMG_FORMAT_PVRTC_EXTENSION_NAME  = "VK_IMG_format_pvrtc";


    public static final boolean VK_NV_external_memory_capabilities  = true;
    public static final int     VK_NV_EXTERNAL_MEMORY_CAPABILITIES_SPEC_VERSION = 1;
    public static final String  VK_NV_EXTERNAL_MEMORY_CAPABILITIES_EXTENSION_NAME   = "VK_NV_external_memory_capabilities";

    public static final boolean VK_NV_external_memory   = true;
    public static final int     VK_NV_EXTERNAL_MEMORY_SPEC_VERSION  = 1;
    public static final String  VK_NV_EXTERNAL_MEMORY_EXTENSION_NAME    = "VK_NV_external_memory";

    public static final boolean VK_EXT_validation_flags = true;
    public static final int     VK_EXT_VALIDATION_FLAGS_SPEC_VERSION    = 2;
    public static final String  VK_EXT_VALIDATION_FLAGS_EXTENSION_NAME  = "VK_EXT_validation_flags";

    public static final boolean VK_EXT_shader_subgroup_ballot   = true;
    public static final int     VK_EXT_SHADER_SUBGROUP_BALLOT_SPEC_VERSION  = 1;
    public static final String  VK_EXT_SHADER_SUBGROUP_BALLOT_EXTENSION_NAME    = "VK_EXT_shader_subgroup_ballot";

    public static final boolean VK_EXT_shader_subgroup_vote = true;
    public static final int     VK_EXT_SHADER_SUBGROUP_VOTE_SPEC_VERSION    = 1;
    public static final String  VK_EXT_SHADER_SUBGROUP_VOTE_EXTENSION_NAME  = "VK_EXT_shader_subgroup_vote";

    public static final boolean VK_NVX_device_generated_commands    = true;
    public static final int     VK_NVX_DEVICE_GENERATED_COMMANDS_SPEC_VERSION   = 3;
    public static final String  VK_NVX_DEVICE_GENERATED_COMMANDS_EXTENSION_NAME = "VK_NVX_device_generated_commands";

    public static final boolean VK_NV_clip_space_w_scaling  = true;
    public static final int     VK_NV_CLIP_SPACE_W_SCALING_SPEC_VERSION = 1;
    public static final String  VK_NV_CLIP_SPACE_W_SCALING_EXTENSION_NAME   = "VK_NV_clip_space_w_scaling";

    public static final boolean VK_EXT_direct_mode_display  = true;
    public static final int     VK_EXT_DIRECT_MODE_DISPLAY_SPEC_VERSION = 1;
    public static final String  VK_EXT_DIRECT_MODE_DISPLAY_EXTENSION_NAME   = "VK_EXT_direct_mode_display";

    public static final boolean VK_EXT_display_surface_counter  = true;
    public static final int     VK_EXT_DISPLAY_SURFACE_COUNTER_SPEC_VERSION = 1;
    public static final String  VK_EXT_DISPLAY_SURFACE_COUNTER_EXTENSION_NAME   = "VK_EXT_display_surface_counter";
    public static final VkStructureType VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES2_EXT = VkStructureType.VK_STRUCTURE_TYPE_SURFACE_CAPABILITIES_2_EXT;

    public static final boolean VK_EXT_display_control  = true;
    public static final int     VK_EXT_DISPLAY_CONTROL_SPEC_VERSION = 1;
    public static final String  VK_EXT_DISPLAY_CONTROL_EXTENSION_NAME   = "VK_EXT_display_control";

    public static final boolean VK_GOOGLE_display_timing    = true;
    public static final int     VK_GOOGLE_DISPLAY_TIMING_SPEC_VERSION   = 1;
    public static final String  VK_GOOGLE_DISPLAY_TIMING_EXTENSION_NAME = "VK_GOOGLE_display_timing";

    public static final boolean VK_NV_sample_mask_override_coverage = true;
    public static final int     VK_NV_SAMPLE_MASK_OVERRIDE_COVERAGE_SPEC_VERSION    = 1;
    public static final String  VK_NV_SAMPLE_MASK_OVERRIDE_COVERAGE_EXTENSION_NAME  = "VK_NV_sample_mask_override_coverage";

    public static final boolean VK_NV_geometry_shader_passthrough   = true;
    public static final int     VK_NV_GEOMETRY_SHADER_PASSTHROUGH_SPEC_VERSION  = 1;
    public static final String  VK_NV_GEOMETRY_SHADER_PASSTHROUGH_EXTENSION_NAME    = "VK_NV_geometry_shader_passthrough";

    public static final boolean VK_NV_viewport_array2   = true;
    public static final int     VK_NV_VIEWPORT_ARRAY2_SPEC_VERSION  = 1;
    public static final String  VK_NV_VIEWPORT_ARRAY2_EXTENSION_NAME    = "VK_NV_viewport_array2";

    public static final boolean VK_NVX_multiview_per_view_attributes    = true;
    public static final int     VK_NVX_MULTIVIEW_PER_VIEW_ATTRIBUTES_SPEC_VERSION   = 1;
    public static final String  VK_NVX_MULTIVIEW_PER_VIEW_ATTRIBUTES_EXTENSION_NAME = "VK_NVX_multiview_per_view_attributes";

    public static final boolean VK_NV_viewport_swizzle   = true;
    public static final int     VK_NV_VIEWPORT_SWIZZLE_SPEC_VERSION = 1;
    public static final String  VK_NV_VIEWPORT_SWIZZLE_EXTENSION_NAME   = "VK_NV_viewport_swizzle";

    public static final boolean VK_EXT_discard_rectangles   = true;
    public static final int     VK_EXT_DISCARD_RECTANGLES_SPEC_VERSION  = 1;
    public static final String  VK_EXT_DISCARD_RECTANGLES_EXTENSION_NAME    = "VK_EXT_discard_rectangles";

    public static final boolean VK_EXT_conservative_rasterization   = true;
    public static final int     VK_EXT_CONSERVATIVE_RASTERIZATION_SPEC_VERSION  = 1;
    public static final String  VK_EXT_CONSERVATIVE_RASTERIZATION_EXTENSION_NAME    = "VK_EXT_conservative_rasterization";

    public static final boolean VK_EXT_swapchain_colorspace = true;
    public static final int     VK_EXT_SWAPCHAIN_COLOR_SPACE_SPEC_VERSION   = 4;
    public static final String  VK_EXT_SWAPCHAIN_COLOR_SPACE_EXTENSION_NAME = "VK_EXT_swapchain_colorspace";

    public static final boolean VK_EXT_hdr_metadata = true;
    public static final int     VK_EXT_HDR_METADATA_SPEC_VERSION    = 2;
    public static final String  VK_EXT_HDR_METADATA_EXTENSION_NAME  = "VK_EXT_hdr_metadata";

    public static final boolean VK_EXT_external_memory_dma_buf  = true;
    public static final int     VK_EXT_EXTERNAL_MEMORY_DMA_BUF_SPEC_VERSION = 1;
    public static final String  VK_EXT_EXTERNAL_MEMORY_DMA_BUF_EXTENSION_NAME   = "VK_EXT_external_memory_dma_buf";

    public static final boolean VK_EXT_queue_family_foreign = true;
    public static final int     VK_EXT_QUEUE_FAMILY_FOREIGN_SPEC_VERSION    = 1;
    public static final String  VK_EXT_QUEUE_FAMILY_FOREIGN_EXTENSION_NAME  = "VK_EXT_queue_family_foreign";
    public static final int     VK_QUEUE_FAMILY_FOREIGN_EXT = -3;

    public static final boolean VK_EXT_debug_utils  = true;
    public static final int     VK_EXT_DEBUG_UTILS_SPEC_VERSION = 2;
    public static final String  VK_EXT_DEBUG_UTILS_EXTENSION_NAME   = "VK_EXT_debug_utils";

    public static final boolean VK_EXT_sampler_filter_minmax    = true;
    public static final int     VK_EXT_SAMPLER_FILTER_MINMAX_SPEC_VERSION   = 2;
    public static final String  VK_EXT_SAMPLER_FILTER_MINMAX_EXTENSION_NAME = "VK_EXT_sampler_filter_minmax";

    public static final boolean VK_AMD_gpu_shader_int16 = true;
    public static final int     VK_AMD_GPU_SHADER_INT16_SPEC_VERSION    = 2;
    public static final String  VK_AMD_GPU_SHADER_INT16_EXTENSION_NAME  = "VK_AMD_gpu_shader_int16";

    public static final boolean VK_AMD_mixed_attachment_samples = true;
    public static final int     VK_AMD_MIXED_ATTACHMENT_SAMPLES_SPEC_VERSION    = 1;
    public static final String  VK_AMD_MIXED_ATTACHMENT_SAMPLES_EXTENSION_NAME  = "VK_AMD_mixed_attachment_samples";

    public static final boolean VK_AMD_shader_fragment_mask = true;
    public static final int     VK_AMD_SHADER_FRAGMENT_MASK_SPEC_VERSION    = 1;
    public static final String  VK_AMD_SHADER_FRAGMENT_MASK_EXTENSION_NAME  = "VK_AMD_shader_fragment_mask";

    public static final boolean VK_EXT_shader_stencil_export    = true;
    public static final int     VK_EXT_SHADER_STENCIL_EXPORT_SPEC_VERSION   = 1;
    public static final String  VK_EXT_SHADER_STENCIL_EXPORT_EXTENSION_NAME = "VK_EXT_shader_stencil_export";

    public static final boolean VK_EXT_sample_locations = true;
    public static final int     VK_EXT_SAMPLE_LOCATIONS_SPEC_VERSION    = 1;
    public static final String  VK_EXT_SAMPLE_LOCATIONS_EXTENSION_NAME  = "VK_EXT_sample_locations";

    public static final boolean VK_EXT_blend_operation_advanced = true;
    public static final int     VK_EXT_BLEND_OPERATION_ADVANCED_SPEC_VERSION    = 2;
    public static final String  VK_EXT_BLEND_OPERATION_ADVANCED_EXTENSION_NAME  = "VK_EXT_blend_operation_advanced";

    public static final boolean VK_NV_fragment_coverage_to_color    = true;
    public static final int     VK_NV_FRAGMENT_COVERAGE_TO_COLOR_SPEC_VERSION   = 1;
    public static final String  VK_NV_FRAGMENT_COVERAGE_TO_COLOR_EXTENSION_NAME = "VK_NV_fragment_coverage_to_color";

    public static final boolean VK_NV_framebuffer_mixed_samples = true;
    public static final int     VK_NV_FRAMEBUFFER_MIXED_SAMPLES_SPEC_VERSION    = 1;
    public static final String  VK_NV_FRAMEBUFFER_MIXED_SAMPLES_EXTENSION_NAME  = "VK_NV_framebuffer_mixed_samples";

    public static final boolean VK_NV_fill_rectangle     = true;
    public static final int     VK_NV_FILL_RECTANGLE_SPEC_VERSION   = 1;
    public static final String  VK_NV_FILL_RECTANGLE_EXTENSION_NAME = "VK_NV_fill_rectangle";

    public static final boolean VK_EXT_post_depth_coverage  = true;
    public static final int     VK_EXT_POST_DEPTH_COVERAGE_SPEC_VERSION = 1;
    public static final String  VK_EXT_POST_DEPTH_COVERAGE_EXTENSION_NAME   = "VK_EXT_post_depth_coverage";

    public static final boolean VK_EXT_validation_cache = true;
    public static final int     VK_EXT_VALIDATION_CACHE_SPEC_VERSION    = 1;
    public static final String  VK_EXT_VALIDATION_CACHE_EXTENSION_NAME  = "VK_EXT_validation_cache";
    public static final VkDebugReportObjectTypeEXT VK_DEBUG_REPORT_OBJECT_TYPE_VALIDATION_CACHE_EXT = VkDebugReportObjectTypeEXT.VK_DEBUG_REPORT_OBJECT_TYPE_VALIDATION_CACHE_EXT_EXT;

    public static final boolean VK_EXT_descriptor_indexing  = true;
    public static final int     VK_EXT_DESCRIPTOR_INDEXING_SPEC_VERSION = 2;
    public static final String  VK_EXT_DESCRIPTOR_INDEXING_EXTENSION_NAME   = "VK_EXT_descriptor_indexing";

    public static final boolean VK_EXT_shader_viewport_index_layer  = true;
    public static final int     VK_EXT_SHADER_VIEWPORT_INDEX_LAYER_SPEC_VERSION = 1;
    public static final String  VK_EXT_SHADER_VIEWPORT_INDEX_LAYER_EXTENSION_NAME   = "VK_EXT_shader_viewport_index_layer";

    public static final boolean VK_EXT_global_priority  = true;
    public static final int     VK_EXT_GLOBAL_PRIORITY_SPEC_VERSION = 2;
    public static final String  VK_EXT_GLOBAL_PRIORITY_EXTENSION_NAME   = "VK_EXT_global_priority";

    public static final boolean VK_EXT_external_memory_host = true;
    public static final int     VK_EXT_EXTERNAL_MEMORY_HOST_SPEC_VERSION    = 1;
    public static final String  VK_EXT_EXTERNAL_MEMORY_HOST_EXTENSION_NAME  = "VK_EXT_external_memory_host";

    public static final boolean VK_AMD_buffer_marker    = true;
    public static final int     VK_AMD_BUFFER_MARKER_SPEC_VERSION   = 1;
    public static final String  VK_AMD_BUFFER_MARKER_EXTENSION_NAME = "VK_AMD_buffer_marker";

    public static final boolean VK_AMD_shader_core_properties   = true;
    public static final int     VK_AMD_SHADER_CORE_PROPERTIES_SPEC_VERSION      = 2;
    public static final String  VK_AMD_SHADER_CORE_PROPERTIES_EXTENSION_NAME    = "VK_AMD_shader_core_properties";

    public static final boolean VK_EXT_vertex_attribute_divisor  = true;
    public static final int     VK_EXT_VERTEX_ATTRIBUTE_DIVISOR_SPEC_VERSION    = 3;
    public static final String  VK_EXT_VERTEX_ATTRIBUTE_DIVISOR_EXTENSION_NAME  = "VK_EXT_vertex_attribute_divisor";

    public static final boolean VK_NV_shader_subgroup_partitioned   = true;
    public static final int     VK_NV_SHADER_SUBGROUP_PARTITIONED_SPEC_VERSION  = 1;
    public static final String  VK_NV_SHADER_SUBGROUP_PARTITIONED_EXTENSION_NAME    = "VK_NV_shader_subgroup_partitioned";
    
    public static final boolean VK_KHR_create_renderpass2                   = true;
    public static final int     VK_KHR_CREATE_RENDERPASS_2_SPEC_VERSION     = 1;
    public static final String  VK_KHR_CREATE_RENDERPASS_2_EXTENSION_NAME   = "VK_KHR_create_renderpass2";

    public static final boolean VK_KHR_8bit_storage                         = true;
    public static final int     VK_KHR_8BIT_STORAGE_SPEC_VERSION            = 1;
    public static final String  VK_KHR_8BIT_STORAGE_EXTENSION_NAME          = "VK_KHR_8bit_storage";

    public static final boolean VK_KHR_vulkan_memory_model                  = true;
    public static final int     VK_KHR_VULKAN_MEMORY_MODEL_SPEC_VERSION     = 3;
    public static final String  VK_KHR_VULKAN_MEMORY_MODEL_EXTENSION_NAME   = "VK_KHR_vulkan_memory_model";

    public static final boolean VK_NV_corner_sampled_image                  = true;
    public static final int     VK_NV_CORNER_SAMPLED_IMAGE_SPEC_VERSION     = 2;
    public static final String  VK_NV_CORNER_SAMPLED_IMAGE_EXTENSION_NAME   = "VK_NV_corner_sampled_image";

    public static final boolean VK_EXT_astc_decode_mode                     = true;
    public static final int     VK_EXT_ASTC_DECODE_MODE_SPEC_VERSION        = 1;
    public static final String  VK_EXT_ASTC_DECODE_MODE_EXTENSION_NAME      = "VK_EXT_astc_decode_mode";

    public static final boolean VK_EXT_conditional_rendering                = true;
    public static final int     VK_EXT_CONDITIONAL_RENDERING_SPEC_VERSION   = 2;
    public static final String  VK_EXT_CONDITIONAL_RENDERING_EXTENSION_NAME = "VK_EXT_conditional_rendering";

    public static final boolean VK_EXT_inline_uniform_block                 = true;
    public static final int     VK_EXT_INLINE_UNIFORM_BLOCK_SPEC_VERSION    = 1;
    public static final String  VK_EXT_INLINE_UNIFORM_BLOCK_EXTENSION_NAME  = "VK_EXT_inline_uniform_block";

    public static final boolean VK_NV_shading_rate_image                    = true;
    public static final int     VK_NV_SHADING_RATE_IMAGE_SPEC_VERSION       = 3;
    public static final String  VK_NV_SHADING_RATE_IMAGE_EXTENSION_NAME     = "VK_NV_shading_rate_image";

    public static final boolean VK_NV_ray_tracing                           = true;
    public static final int     VK_NV_RAY_TRACING_SPEC_VERSION              = 3;
    public static final String  VK_NV_RAY_TRACING_EXTENSION_NAME            = "VK_NVX_ray_tracing";

    public static final boolean VK_NV_compute_shader_derivatives                = true;
    public static final int     VK_NV_COMPUTE_SHADER_DERIVATIVES_SPEC_VERSION   = 1;
    public static final String  VK_NV_COMPUTE_SHADER_DERIVATIVES_EXTENSION_NAME = "VK_NV_compute_shader_derivatives";

    public static final boolean VK_NV_mesh_shader                           = true;
    public static final int     VK_NV_MESH_SHADER_SPEC_VERSION              = 1;
    public static final String  VK_NV_MESH_SHADER_EXTENSION_NAME            = "VK_NV_mesh_shader";

    public static final boolean VK_NV_fragment_shader_barycentric                   = true;
    public static final int     VK_NV_FRAGMENT_SHADER_BARYCENTRIC_SPEC_VERSION      = 1;
    public static final String  VK_NV_FRAGMENT_SHADER_BARYCENTRIC_EXTENSION_NAME    = "VK_NV_fragment_shader_barycentric";

    public static final boolean VK_NV_shader_image_footprint                = true;
    public static final int     VK_NV_SHADER_IMAGE_FOOTPRINT_SPEC_VERSION   = 2;
    public static final String  VK_NV_SHADER_IMAGE_FOOTPRINT_EXTENSION_NAME = "VK_NV_shader_image_footprint";

    public static final boolean VK_NV_scissor_exclusive                     = true;
    public static final int     VK_NV_SCISSOR_EXCLUSIVE_SPEC_VERSION        = 1;
    public static final String  VK_NV_SCISSOR_EXCLUSIVE_EXTENSION_NAME      = "VK_NV_scissor_exclusive";

    public static final boolean VK_NV_device_diagnostic_checkpoints                 = true;
    public static final int     VK_NV_DEVICE_DIAGNOSTIC_CHECKPOINTS_SPEC_VERSION    = 2;
    public static final String  VK_NV_DEVICE_DIAGNOSTIC_CHECKPOINTS_EXTENSION_NAME  = "VK_NV_device_diagnostic_checkpoints";

    public static final boolean VK_KHR_shader_float16_int8                 = true;
    public static final int     VK_KHR_SHADER_FLOAT16_INT8_SPEC_VERSION    = 1;
    public static final String  VK_KHR_SHADER_FLOAT16_INT8_EXTENSION_NAME  = "VK_KHR_shader_float16_int8";
    
    public static final boolean VK_KHR_shader_atomic_int64                 = true;
    public static final int     VK_KHR_SHADER_ATOMIC_INT64_SPEC_VERSION    = 1;
    public static final String  VK_KHR_SHADER_ATOMIC_INT64_EXTENSION_NAME  = "VK_KHR_shader_atomic_int64";

    public static final int     VK_MAX_DRIVER_NAME_SIZE_KHR                 = 256;
    public static final int     VK_MAX_DRIVER_INFO_SIZE_KHR                 = 256;
    public static final boolean VK_KHR_driver_properties                    = true;
    public static final int     VK_KHR_DRIVER_PROPERTIES_SPEC_VERSION       = 1;
    public static final String  VK_KHR_DRIVER_PROPERTIES_EXTENSION_NAME     = "VK_KHR_driver_properties";

    public static final boolean VK_KHR_shader_float_controls                 = true;
    public static final int     VK_KHR_SHADER_FLOAT_CONTROLS_SPEC_VERSION    = 4;
    public static final String  VK_KHR_SHADER_FLOAT_CONTROLS_EXTENSION_NAME  = "VK_KHR_shader_float_controls";

    public static final boolean VK_KHR_depth_stencil_resolve                 = true;
    public static final int     VK_KHR_DEPTH_STENCIL_RESOLVE_SPEC_VERSION    = 1;
    public static final String  VK_KHR_DEPTH_STENCIL_RESOLVE_EXTENSION_NAME  = "VK_KHR_depth_stencil_resolve";

    public static final boolean VK_KHR_swapchain_mutable_format                 = true;
    public static final int     VK_KHR_SWAPCHAIN_MUTABLE_FORMAT_SPEC_VERSION    = 1;
    public static final String  VK_KHR_SWAPCHAIN_MUTABLE_FORMAT_EXTENSION_NAME  = "VK_KHR_swapchain_mutable_format";

    public static final boolean VK_EXT_transform_feedback                 = true;
    public static final int     VK_EXT_TRANSFORM_FEEDBACK_SPEC_VERSION    = 1;
    public static final String  VK_EXT_TRANSFORM_FEEDBACK_EXTENSION_NAME  = "VK_EXT_transform_feedback";

    public static final boolean VK_EXT_depth_clip_enable                 = true;
    public static final int     VK_EXT_DEPTH_CLIP_ENABLE_SPEC_VERSION    = 1;
    public static final String  VK_EXT_DEPTH_CLIP_ENABLE_EXTENSION_NAME  = "VK_EXT_depth_clip_enable";

    public static final boolean VK_EXT_image_drm_format_modifier                 = true;
    public static final int     VK_EXT_IMAGE_DRM_FORMAT_MODIFIER_SPEC_VERSION    = 1;
    public static final String  VK_EXT_IMAGE_DRM_FORMAT_MODIFIER_EXTENSION_NAME  = "VK_EXT_image_drm_format_modifier";

    public static final boolean VK_EXT_filter_cubic                 = true;
    public static final int     VK_EXT_FILTER_CUBIC_SPEC_VERSION    = 3;
    public static final String  VK_EXT_FILTER_CUBIC_EXTENSION_NAME  = "VK_EXT_filter_cubic";

    public static final boolean VK_EXT_calibrated_timestamps                 = true;
    public static final int     VK_EXT_CALIBRATED_TIMESTAMPS_SPEC_VERSION    = 1;
    public static final String  VK_EXT_CALIBRATED_TIMESTAMPS_EXTENSION_NAME  = "VK_EXT_calibrated_timestamps";

    public static final boolean VK_AMD_memory_overallocation_behavior                 = true;
    public static final int     VK_AMD_MEMORY_OVERALLOCATION_BEHAVIOR_SPEC_VERSION    = 1;
    public static final String  VK_AMD_MEMORY_OVERALLOCATION_BEHAVIOR_EXTENSION_NAME  = "VK_AMD_memory_overallocation_behavior";

    public static final boolean VK_EXT_pci_bus_info                 = true;
    public static final int     VK_EXT_PCI_BUS_INFO_SPEC_VERSION    = 2;
    public static final String  VK_EXT_PCI_BUS_INFO_EXTENSION_NAME  = "VK_EXT_pci_bus_info";

    public static final boolean VK_EXT_fragment_density_map                 = true;
    public static final int     VK_EXT_FRAGMENT_DENSITY_MAP_SPEC_VERSION    = 1;
    public static final String  VK_EXT_FRAGMENT_DENSITY_MAP_EXTENSION_NAME  = "VK_EXT_fragment_density_map";

    public static final boolean VK_EXT_scalar_block_layout                 = true;
    public static final int     VK_EXT_SCALAR_BLOCK_LAYOUT_SPEC_VERSION    = 1;
    public static final String  VK_EXT_SCALAR_BLOCK_LAYOUT_EXTENSION_NAME  = "VK_EXT_scalar_block_layout";

    public static final boolean VK_GOOGLE_hlsl_functionality1                 = true;
    public static final int     VK_GOOGLE_HLSL_FUNCTIONALITY1_SPEC_VERSION    = 1;
    public static final String  VK_GOOGLE_HLSL_FUNCTIONALITY1_EXTENSION_NAME  = "VK_GOOGLE_hlsl_functionality1";

    public static final boolean VK_GOOGLE_decorate_string                 = true;
    public static final int     VK_GOOGLE_DECORATE_STRING_SPEC_VERSION    = 1;
    public static final String  VK_GOOGLE_DECORATE_STRING_EXTENSION_NAME  = "VK_GOOGLE_decorate_string";

    public static final boolean VK_EXT_memory_budget                 = true;
    public static final int     VK_EXT_MEMORY_BUDGET_SPEC_VERSION    = 1;
    public static final String  VK_EXT_MEMORY_BUDGET_EXTENSION_NAME  = "VK_EXT_memory_budget";

    public static final boolean VK_EXT_memory_priority                 = true;
    public static final int     VK_EXT_MEMORY_PRIORITY_SPEC_VERSION    = 1;
    public static final String  VK_EXT_MEMORY_PRIORITY_EXTENSION_NAME  = "VK_EXT_memory_priority";

    public static final boolean VK_NV_dedicated_allocation_image_aliasing                 = true;
    public static final int     VK_NV_DEDICATED_ALLOCATION_IMAGE_ALIASING_SPEC_VERSION    = 1;
    public static final String  VK_NV_DEDICATED_ALLOCATION_IMAGE_ALIASING_EXTENSION_NAME  = "VK_NV_dedicated_allocation_image_aliasing";

    public static final boolean VK_EXT_buffer_device_address                = true;
    public static final int     VK_EXT_BUFFER_DEVICE_ADDRESS_SPEC_VERSION   = 2;
    public static final String  VK_EXT_BUFFER_DEVICE_ADDRESS_EXTENSION_NAME = "VK_EXT_buffer_device_address";

    public static final boolean VK_EXT_separate_stencil_usage                = true;
    public static final int     VK_EXT_SEPARATE_STENCIL_USAGE_SPEC_VERSION   = 1;
    public static final String  VK_EXT_SEPARATE_STENCIL_USAGE_EXTENSION_NAME = "VK_EXT_separate_stencil_usage";

    public static final boolean VK_EXT_validation_features                = true;
    public static final int     VK_EXT_VALIDATION_FEATURES_SPEC_VERSION   = 3;
    public static final String  VK_EXT_VALIDATION_FEATURES_EXTENSION_NAME = "VK_EXT_validation_features";

    public static final boolean VK_NV_cooperative_matrix                = true;
    public static final int     VK_NV_COOPERATIVE_MATRIX_SPEC_VERSION   = 1;
    public static final String  VK_NV_COOPERATIVE_MATRIX_EXTENSION_NAME = "VK_NV_cooperative_matrix";
    
    public static final boolean VK_KHR_surface_protected_capabilities                = true;
    public static final int     VK_KHR_SURFACE_PROTECTED_CAPABILITIES_SPEC_VERSION   = 1;
    public static final String  VK_KHR_SURFACE_PROTECTED_CAPABILITIES_EXTENSION_NAME = "VK_KHR_surface_protected_capabilities";

    public static final boolean VK_NVX_image_view_handle                = true;
    public static final int     VK_NVX_IMAGE_VIEW_HANDLE_SPEC_VERSION   = 2;
    public static final String  VK_NVX_IMAGE_VIEW_HANDLE_EXTENSION_NAME = "VK_NVX_image_view_handle";

    public static final boolean VK_EXT_pipeline_creation_feedback                = true;
    public static final int     VK_EXT_PIPELINE_CREATION_FEEDBACK_SPEC_VERSION   = 1;
    public static final String  VK_EXT_PIPELINE_CREATION_FEEDBACK_EXTENSION_NAME = "VK_EXT_pipeline_creation_feedback";

    public static final boolean VK_AMD_display_native_hdr                = true;
    public static final int     VK_AMD_DISPLAY_NATIVE_HDR_SPEC_VERSION   = 1;
    public static final String  VK_AMD_DISPLAY_NATIVE_HDR_EXTENSION_NAME = "VK_AMD_display_native_hdr";

    public static final boolean VK_EXT_ycbcr_image_arrays                = true;
    public static final int     VK_EXT_YCBCR_IMAGE_ARRAYS_SPEC_VERSION   = 1;
    public static final String  VK_EXT_YCBCR_IMAGE_ARRAYS_EXTENSION_NAME = "VK_EXT_ycbcr_image_arrays";

    public static final boolean VK_EXT_host_query_reset                = true;
    public static final int     VK_EXT_HOST_QUERY_RESET_SPEC_VERSION   = 1;
    public static final String  VK_EXT_HOST_QUERY_RESET_EXTENSION_NAME = "VK_EXT_host_query_reset";

    public static final boolean VK_KHR_imageless_framebuffer                = true;
    public static final int     VK_KHR_IMAGELESS_FRAMEBUFFER_SPEC_VERSION   = 1;
    public static final String  VK_KHR_IMAGELESS_FRAMEBUFFER_EXTENSION_NAME = "VK_KHR_imageless_framebuffer";

    public static final boolean VK_KHR_uniform_buffer_standard_layout                = true;
    public static final int     VK_KHR_UNIFORM_BUFFER_STANDARD_LAYOUT_SPEC_VERSION   = 1;
    public static final String  VK_KHR_UNIFORM_BUFFER_STANDARD_LAYOUT_EXTENSION_NAME = "VK_KHR_uniform_buffer_standard_layout";

    public static final boolean VK_EXT_texture_compression_astc_hdr                = true;
    public static final int     VK_EXT_TEXTURE_COMPRESSION_ASTC_HDR_SPEC_VERSION   = 1;
    public static final String  VK_EXT_TEXTURE_COMPRESSION_ASTC_HDR_EXTENSION_NAME = "VK_EXT_texture_compression_astc_hdr";

    public static final boolean VK_NV_shader_sm_builtins                = true;
    public static final int     VK_NV_SHADER_SM_BUILTINS_SPEC_VERSION   = 1;
    public static final String  VK_NV_SHADER_SM_BUILTINS_EXTENSION_NAME = "VK_NV_shader_sm_builtins";

    public static final boolean VK_NV_representative_fragment_test                = true;
    public static final int     VK_NV_REPRESENTATIVE_FRAGMENT_TEST_SPEC_VERSION   = 2;
    public static final String  VK_NV_REPRESENTATIVE_FRAGMENT_TEST_EXTENSION_NAME = "VK_NV_representative_fragment_test";

    public static final boolean VK_AMD_pipeline_compiler_control                = true;
    public static final int     VK_AMD_PIPELINE_COMPILER_CONTROL_SPEC_VERSION   = 1;
    public static final String  VK_AMD_PIPELINE_COMPILER_CONTROL_EXTENSION_NAME = "VK_AMD_pipeline_compiler_control";

    public static final boolean VK_INTEL_shader_integer_functions2                = true;
    public static final int     VK_INTEL_SHADER_INTEGER_FUNCTIONS_2_SPEC_VERSION   = 1;
    public static final String  VK_INTEL_SHADER_INTEGER_FUNCTIONS_2_EXTENSION_NAME = "VK_INTEL_shader_integer_functions2";

    public static final boolean VK_INTEL_performance_query                = true;
    public static final int     VK_INTEL_PERFORMANCE_QUERY_SPEC_VERSION   = 2;
    public static final String  VK_INTEL_PERFORMANCE_QUERY_EXTENSION_NAME = "VK_INTEL_performance_query";

    public static final boolean VK_EXT_subgroup_size_control                = true;
    public static final int     VK_EXT_SUBGROUP_SIZE_CONTROL_SPEC_VERSION   = 2;
    public static final String  VK_EXT_SUBGROUP_SIZE_CONTROL_EXTENSION_NAME = "VK_EXT_subgroup_size_control";

    public static final boolean VK_AMD_shader_core_properties2                = true;
    public static final int     VK_AMD_SHADER_CORE_PROPERTIES_2_SPEC_VERSION   = 1;
    public static final String  VK_AMD_SHADER_CORE_PROPERTIES_2_EXTENSION_NAME = "VK_AMD_shader_core_properties2";

    public static final boolean VK_AMD_device_coherent_memory                = true;
    public static final int     VK_AMD_DEVICE_COHERENT_MEMORY_SPEC_VERSION   = 1;
    public static final String  VK_AMD_DEVICE_COHERENT_MEMORY_EXTENSION_NAME = "VK_AMD_device_coherent_memory";

    public static final boolean VK_NV_coverage_reduction_mode                = true;
    public static final int     VK_NV_COVERAGE_REDUCTION_MODE_SPEC_VERSION   = 1;
    public static final String  VK_NV_COVERAGE_REDUCTION_MODE_EXTENSION_NAME = "VK_NV_coverage_reduction_mode";

    public static final boolean VK_EXT_fragment_shader_interlock                = true;
    public static final int     VK_EXT_FRAGMENT_SHADER_INTERLOCK_SPEC_VERSION   = 1;
    public static final String  VK_EXT_FRAGMENT_SHADER_INTERLOCK_EXTENSION_NAME = "VK_EXT_fragment_shader_interlock";

    public static final boolean VK_EXT_headless_surface                = true;
    public static final int     VK_EXT_HEADLESS_SURFACE_SPEC_VERSION   = 1;
    public static final String  VK_EXT_HEADLESS_SURFACE_EXTENSION_NAME = "VK_EXT_headless_surface";

    public static final boolean VK_EXT_line_rasterization                = true;
    public static final int     VK_EXT_LINE_RASTERIZATION_SPEC_VERSION   = 1;
    public static final String  VK_EXT_LINE_RASTERIZATION_EXTENSION_NAME = "VK_EXT_line_rasterization";

    public static final boolean VK_EXT_index_type_uint8                = true;
    public static final int     VK_EXT_INDEX_TYPE_UINT8_SPEC_VERSION   = 1;
    public static final String  VK_EXT_INDEX_TYPE_UINT8_EXTENSION_NAME = "VK_EXT_index_type_uint8";

    public static final boolean VK_EXT_shader_demote_to_helper_invocation                = true;
    public static final int     VK_EXT_SHADER_DEMOTE_TO_HELPER_INVOCATION_SPEC_VERSION   = 1;
    public static final String  VK_EXT_SHADER_DEMOTE_TO_HELPER_INVOCATION_EXTENSION_NAME = "VK_EXT_shader_demote_to_helper_invocation";

    public static final boolean VK_EXT_texel_buffer_alignment                = true;
    public static final int     VK_EXT_TEXEL_BUFFER_ALIGNMENT_SPEC_VERSION   = 1;
    public static final String  VK_EXT_TEXEL_BUFFER_ALIGNMENT_EXTENSION_NAME = "VK_EXT_texel_buffer_alignment";

    public static final boolean VK_KHR_shader_subgroup_extended_types                = true;
    public static final int     VK_KHR_SHADER_SUBGROUP_EXTENDED_TYPES_SPEC_VERSION   = 1;
    public static final String  VK_KHR_SHADER_SUBGROUP_EXTENDED_TYPES_EXTENSION_NAME = "VK_KHR_shader_subgroup_extended_types";

    public static final boolean VK_KHR_shader_clock                = true;
    public static final int     VK_KHR_SHADER_CLOCK_SPEC_VERSION   = 1;
    public static final String  VK_KHR_SHADER_CLOCK_EXTENSION_NAME = "VK_KHR_shader_clock";

    public static final boolean VK_KHR_timeline_semaphore                = true;
    public static final int     VK_KHR_TIMELINE_SEMAPHORE_SPEC_VERSION   = 2;
    public static final String  VK_KHR_TIMELINE_SEMAPHORE_EXTENSION_NAME = "VK_KHR_timeline_semaphore";

    public static final boolean VK_KHR_spirv_1_4                = true;
    public static final int     VK_KHR_SPIRV_1_4_SPEC_VERSION   = 1;
    public static final String  VK_KHR_SPIRV_1_4_EXTENSION_NAME = "VK_KHR_spirv_1_4";

    public static final boolean VK_GOOGLE_user_type                = true;
    public static final int     VK_GOOGLE_USER_TYPE_SPEC_VERSION   = 1;
    public static final String  VK_GOOGLE_USER_TYPE_EXTENSION_NAME = "VK_GOOGLE_user_type";

    public static final boolean VK_KHR_performance_query                = true;
    public static final int     VK_KHR_PERFORMANCE_QUERY_SPEC_VERSION   = 1;
    public static final String  VK_KHR_PERFORMANCE_QUERY_EXTENSION_NAME = "VK_KHR_performance_query";

    public static final boolean VK_KHR_separate_depth_stencil_layouts                = true;
    public static final int     VK_KHR_SEPARATE_DEPTH_STENCIL_LAYOUTS_SPEC_VERSION   = 1;
    public static final String  VK_KHR_SEPARATE_DEPTH_STENCIL_LAYOUTS_EXTENSION_NAME = "VK_KHR_separate_depth_stencil_layouts";

    public static final boolean VK_KHR_buffer_device_address                = true;
    public static final int     VK_KHR_BUFFER_DEVICE_ADDRESS_SPEC_VERSION   = 1;
    public static final String  VK_KHR_BUFFER_DEVICE_ADDRESS_EXTENSION_NAME = "VK_KHR_buffer_device_address";

    public static final boolean VK_KHR_shader_non_semantic_info                = true;
    public static final int     VK_KHR_SHADER_NON_SEMANTIC_INFO_SPEC_VERSION   = 1;
    public static final String  VK_KHR_SHADER_NON_SEMANTIC_INFO_EXTENSION_NAME = "VK_KHR_shader_non_semantic_info";

    public static final boolean VK_QCOM_render_pass_shader_resolve                = true;
    public static final int     VK_QCOM_RENDER_PASS_SHADER_RESOLVE_SPEC_VERSION   = 4;
    public static final String  VK_QCOM_RENDER_PASS_SHADER_RESOLVE_EXTENSION_NAME = "VK_QCOM_render_pass_shader_resolve";

    public static final boolean VK_EXT_tooling_info                = true;
    public static final int     VK_EXT_TOOLING_INFO_SPEC_VERSION   = 1;
    public static final String  VK_EXT_TOOLING_INFO_EXTENSION_NAME = "VK_EXT_tooling_info";
}
