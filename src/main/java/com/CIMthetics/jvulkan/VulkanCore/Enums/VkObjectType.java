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
package com.CIMthetics.jvulkan.VulkanCore.Enums;

public enum VkObjectType
{
    VK_OBJECT_TYPE_UNKNOWN(0),
    VK_OBJECT_TYPE_INSTANCE(1),
    VK_OBJECT_TYPE_PHYSICAL_DEVICE(2),
    VK_OBJECT_TYPE_DEVICE(3),
    VK_OBJECT_TYPE_QUEUE(4),
    VK_OBJECT_TYPE_SEMAPHORE(5),
    VK_OBJECT_TYPE_COMMAND_BUFFER(6),
    VK_OBJECT_TYPE_FENCE(7),
    VK_OBJECT_TYPE_DEVICE_MEMORY(8),
    VK_OBJECT_TYPE_BUFFER(9),
    VK_OBJECT_TYPE_IMAGE(10),
    VK_OBJECT_TYPE_EVENT(11),
    VK_OBJECT_TYPE_QUERY_POOL(12),
    VK_OBJECT_TYPE_BUFFER_VIEW(13),
    VK_OBJECT_TYPE_IMAGE_VIEW(14),
    VK_OBJECT_TYPE_SHADER_MODULE(15),
    VK_OBJECT_TYPE_PIPELINE_CACHE(16),
    VK_OBJECT_TYPE_PIPELINE_LAYOUT(17),
    VK_OBJECT_TYPE_RENDER_PASS(18),
    VK_OBJECT_TYPE_PIPELINE(19),
    VK_OBJECT_TYPE_DESCRIPTOR_SET_LAYOUT(20),
    VK_OBJECT_TYPE_SAMPLER(21),
    VK_OBJECT_TYPE_DESCRIPTOR_POOL(22),
    VK_OBJECT_TYPE_DESCRIPTOR_SET(23),
    VK_OBJECT_TYPE_FRAMEBUFFER(24),
    VK_OBJECT_TYPE_COMMAND_POOL(25),
    VK_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION(1000156000),
    VK_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE(1000085000),
    VK_OBJECT_TYPE_SURFACE_KHR(1000000000),
    VK_OBJECT_TYPE_SWAPCHAIN_KHR(1000001000),
    VK_OBJECT_TYPE_DISPLAY_KHR(1000002000),
    VK_OBJECT_TYPE_DISPLAY_MODE_KHR(1000002001),
    VK_OBJECT_TYPE_DEBUG_REPORT_CALLBACK_EXT(1000011000),
    VK_OBJECT_TYPE_DEBUG_UTILS_MESSENGER_EXT(1000128000),
    VK_OBJECT_TYPE_ACCELERATION_STRUCTURE_KHR(1000165000),
    VK_OBJECT_TYPE_VALIDATION_CACHE_EXT(1000160000),
    VK_OBJECT_TYPE_PERFORMANCE_CONFIGURATION_INTEL(1000210000),
    VK_OBJECT_TYPE_DEFERRED_OPERATION_KHR(1000268000),
    VK_OBJECT_TYPE_INDIRECT_COMMANDS_LAYOUT_NV(1000277000),
    VK_OBJECT_TYPE_PRIVATE_DATA_SLOT_EXT(1000295000),
    VK_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_KHR(VK_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE.valueOf()),
    VK_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION_KHR(VK_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION.valueOf()),
    VK_OBJECT_TYPE_ACCELERATION_STRUCTURE_NV(VK_OBJECT_TYPE_ACCELERATION_STRUCTURE_KHR.valueOf()),
    VK_OBJECT_TYPE_MAX_ENUM(0x7FFFFFFF);

    private int value;
    
    private VkObjectType(int value) { this.value = value; }
    
    public int valueOf() { return value; }

    static VkObjectType fromValue(int inputValue)
    {
        VkObjectType result = null;
        
        switch(inputValue)
        {
            case 0:
                result = VK_OBJECT_TYPE_UNKNOWN;
                break;
            case 1:
                result = VK_OBJECT_TYPE_INSTANCE;
                break;
            case 2:
                result = VK_OBJECT_TYPE_PHYSICAL_DEVICE;
                break;
            case 3:
                result =  VK_OBJECT_TYPE_DEVICE;
                break;
            case 4:
                result = VK_OBJECT_TYPE_QUEUE;
                break;
            case 5:
                result = VK_OBJECT_TYPE_SEMAPHORE;
                break;
            case 6:
                result = VK_OBJECT_TYPE_COMMAND_BUFFER;
                break;
            case 7:
                result = VK_OBJECT_TYPE_FENCE;
                break;
            case 8:
                result = VK_OBJECT_TYPE_DEVICE_MEMORY;
                break;
            case 9:
                result = VK_OBJECT_TYPE_BUFFER;
                break;
            case 10:
                result = VK_OBJECT_TYPE_IMAGE;
                break;
            case 11:
                result = VK_OBJECT_TYPE_EVENT;
                break;
            case 12:
                result = VK_OBJECT_TYPE_QUERY_POOL;
                break;
            case 13:
                result =  VK_OBJECT_TYPE_BUFFER_VIEW;
                break;
            case 14:
                result = VK_OBJECT_TYPE_IMAGE_VIEW;
                break;
            case 15:
                result = VK_OBJECT_TYPE_SHADER_MODULE;
                break;
            case 16:
                result = VK_OBJECT_TYPE_PIPELINE_CACHE;
                break;
            case 17:
                result = VK_OBJECT_TYPE_PIPELINE_LAYOUT;
                break;
            case 18:
                result =  VK_OBJECT_TYPE_RENDER_PASS;
                break;
            case 19:
                result = VK_OBJECT_TYPE_PIPELINE;
                break;
            case 20:
                result = VK_OBJECT_TYPE_DESCRIPTOR_SET_LAYOUT;
                break;
            case 21:
                result = VK_OBJECT_TYPE_SAMPLER;
                break;
            case 22:
                result = VK_OBJECT_TYPE_DESCRIPTOR_POOL;
                break;
            case 23:
                result =  VK_OBJECT_TYPE_DESCRIPTOR_SET;
                break;
            case 24:
                result = VK_OBJECT_TYPE_FRAMEBUFFER;
                break;
            case 25:
                result = VK_OBJECT_TYPE_COMMAND_POOL;
                break;
            case 1000156000:
                result = VK_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION;
                break;
            case 1000085000:
                result = VK_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE;
                break;
            case 1000000000:
                result = VK_OBJECT_TYPE_SURFACE_KHR;
                break;
            case 1000001000:
                result = VK_OBJECT_TYPE_SWAPCHAIN_KHR;
                break;
            case 1000002000:
                result = VK_OBJECT_TYPE_DISPLAY_KHR;
                break;
            case 1000002001:
                result = VK_OBJECT_TYPE_DISPLAY_MODE_KHR;
                break;
            case 1000011000:
                result = VK_OBJECT_TYPE_DEBUG_REPORT_CALLBACK_EXT;
                break;
            case 1000128000:
                result = VK_OBJECT_TYPE_DEBUG_UTILS_MESSENGER_EXT;
                break;
            case 1000160000:
                result = VK_OBJECT_TYPE_VALIDATION_CACHE_EXT;
                break;
            case 1000165000:
                result = VK_OBJECT_TYPE_ACCELERATION_STRUCTURE_NV;
                break;
            case 0x7FFFFFFF:
                result = VK_OBJECT_TYPE_MAX_ENUM;
                break;
        }

        if (result == null)
            throw new IllegalArgumentException("Illegal value specified for this Enum.");

        return result;
    }
}
