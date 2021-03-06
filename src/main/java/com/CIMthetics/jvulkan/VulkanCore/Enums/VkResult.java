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

/**
 * 
 * @author Douglas Kaip
 *
 */
public enum VkResult
{
    VK_SUCCESS(0),
    VK_NOT_READY(1),
    VK_TIMEOUT(2),
    VK_EVENT_SET(3),
    VK_EVENT_RESET(4),
    VK_INCOMPLETE(5),
    VK_ERROR_OUT_OF_HOST_MEMORY(-1),
    VK_ERROR_OUT_OF_DEVICE_MEMORY(-2),
    VK_ERROR_INITIALIZATION_FAILED(-3),
    VK_ERROR_DEVICE_LOST(-4),
    VK_ERROR_MEMORY_MAP_FAILED(-5),
    VK_ERROR_LAYER_NOT_PRESENT(-6),
    VK_ERROR_EXTENSION_NOT_PRESENT(-7),
    VK_ERROR_FEATURE_NOT_PRESENT(-8),
    VK_ERROR_INCOMPATIBLE_DRIVER(-9),
    VK_ERROR_TOO_MANY_OBJECTS(-10),
    VK_ERROR_FORMAT_NOT_SUPPORTED(-11),
    VK_ERROR_FRAGMENTED_POOL(-12),
    VK_ERROR_UNKNOWN(-13),
    VK_ERROR_OUT_OF_POOL_MEMORY(-1000069000),
    VK_ERROR_INVALID_EXTERNAL_HANDLE(-1000072003),
    VK_ERROR_FRAGMENTATION(-1000161000),
    VK_ERROR_INVALID_OPAQUE_CAPTURE_ADDRESS(-1000257000),
    VK_ERROR_SURFACE_LOST_KHR(-1000000000),
    VK_ERROR_NATIVE_WINDOW_IN_USE_KHR(-1000000001),
    VK_SUBOPTIMAL_KHR(1000001003),
    VK_ERROR_OUT_OF_DATE_KHR(-1000001004),
    VK_ERROR_INCOMPATIBLE_DISPLAY_KHR(-1000003001),
    VK_ERROR_VALIDATION_FAILED_EXT(-1000011001),
    VK_ERROR_INVALID_SHADER_NV(-1000012000),
    VK_ERROR_INCOMPATIBLE_VERSION_KHR(-1000150000),
    VK_ERROR_INVALID_DRM_FORMAT_MODIFIER_PLANE_LAYOUT_EXT(-1000158000),
    VK_ERROR_NOT_PERMITTED_EXT(-1000174001),
    VK_ERROR_FULL_SCREEN_EXCLUSIVE_MODE_LOST_EXT(-1000255000),
    VK_THREAD_IDLE_KHR(1000268000),
    VK_THREAD_DONE_KHR(1000268001),
    VK_OPERATION_DEFERRED_KHR(1000268002),
    VK_OPERATION_NOT_DEFERRED_KHR(1000268003),
    VK_PIPELINE_COMPILE_REQUIRED_EXT(1000297000),
    VK_ERROR_OUT_OF_POOL_MEMORY_KHR(VK_ERROR_OUT_OF_POOL_MEMORY.valueOf()),
    VK_ERROR_INVALID_EXTERNAL_HANDLE_KHR(VK_ERROR_INVALID_EXTERNAL_HANDLE.valueOf()),
    VK_ERROR_FRAGMENTATION_EXT(VK_ERROR_FRAGMENTATION.valueOf()),
    VK_ERROR_INVALID_DEVICE_ADDRESS_EXT(VK_ERROR_INVALID_OPAQUE_CAPTURE_ADDRESS.valueOf()),
    VK_ERROR_INVALID_OPAQUE_CAPTURE_ADDRESS_KHR(VK_ERROR_INVALID_OPAQUE_CAPTURE_ADDRESS.valueOf()),
    VK_ERROR_PIPELINE_COMPILE_REQUIRED_EXT(VK_PIPELINE_COMPILE_REQUIRED_EXT.valueOf()),
    VK_RESULT_MAX_ENUM(0x7FFFFFFF);
    
    private int value;
    
    private VkResult(int value) { this.value = value; }
    
    public int valueOf() { return value; }
    
    static VkResult fromValue(int inputValue)
    {
        VkResult result = null;
        
        switch(inputValue)
        {
            case 0:
                result = VK_SUCCESS;
                break;
            case 1:
                result = VK_NOT_READY;
                break;
            case 2:
                result = VK_TIMEOUT;
                break;
            case 3:
                result = VK_EVENT_SET;
                break;
            case 4:
                result = VK_EVENT_RESET;
                break;
            case 5:
                result = VK_INCOMPLETE;
                break;
            case -1:
                result = VK_ERROR_OUT_OF_HOST_MEMORY;
                break;
            case -2:
                result = VK_ERROR_OUT_OF_DEVICE_MEMORY;
                break;
            case -3:
                result = VK_ERROR_INITIALIZATION_FAILED;
                break;
            case -4:
                result = VK_ERROR_DEVICE_LOST;
                break;
            case -5:
                result = VK_ERROR_MEMORY_MAP_FAILED;
                break;
            case -6:
                result = VK_ERROR_LAYER_NOT_PRESENT;
                break;
            case -7:
                result = VK_ERROR_EXTENSION_NOT_PRESENT;
                break;
            case -8:
                result = VK_ERROR_FEATURE_NOT_PRESENT;
                break;
            case -9:
                result = VK_ERROR_INCOMPATIBLE_DRIVER;
                break;
            case -10:
                result = VK_ERROR_TOO_MANY_OBJECTS;
                break;
            case -11:
                result = VK_ERROR_FORMAT_NOT_SUPPORTED;
                break;
            case -12:
                result = VK_ERROR_FRAGMENTED_POOL;
                break;
            case -1000069000:
                result = VK_ERROR_OUT_OF_POOL_MEMORY;
                break;
            case -1000072003:
                result = VK_ERROR_INVALID_EXTERNAL_HANDLE;
                break;
            case -1000000000:
                result = VK_ERROR_SURFACE_LOST_KHR;
                break;
            case -1000000001:
                result = VK_ERROR_NATIVE_WINDOW_IN_USE_KHR;
                break;
            case 1000001003:
                result = VK_SUBOPTIMAL_KHR;
                break;
            case -1000001004:
                result = VK_ERROR_OUT_OF_DATE_KHR;
                break;
            case -1000003001:
                result = VK_ERROR_INCOMPATIBLE_DISPLAY_KHR;
                break;
            case -1000011001:
                result = VK_ERROR_VALIDATION_FAILED_EXT;
                break;
            case -1000012000:
                result = VK_ERROR_INVALID_SHADER_NV;
                break;
            case -1000161000:
                result = VK_ERROR_FRAGMENTATION_EXT;
                break;
            case -1000174001:
                result = VK_ERROR_NOT_PERMITTED_EXT;
                break;
            case 0x7FFFFFFF:
                result = VK_RESULT_MAX_ENUM;
                break;
        }

        if (result == null)
            throw new IllegalArgumentException("Illegal value specified for this Enum.");

        return result;
    }
}
