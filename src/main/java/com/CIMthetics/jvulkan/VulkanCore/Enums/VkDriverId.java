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
package com.CIMthetics.jvulkan.VulkanCore.Enums;

public enum VkDriverId
{
    VK_DRIVER_ID_AMD_PROPRIETARY(1),
    VK_DRIVER_ID_AMD_OPEN_SOURCE(2),
    VK_DRIVER_ID_MESA_RADV(3),
    VK_DRIVER_ID_NVIDIA_PROPRIETARY(4),
    VK_DRIVER_ID_INTEL_PROPRIETARY_WINDOWS(5),
    VK_DRIVER_ID_INTEL_OPEN_SOURCE_MESA(6),
    VK_DRIVER_ID_IMAGINATION_PROPRIETARY(7),
    VK_DRIVER_ID_QUALCOMM_PROPRIETARY(8),
    VK_DRIVER_ID_ARM_PROPRIETARY(9),
    VK_DRIVER_ID_GOOGLE_SWIFTSHADER(10),
    VK_DRIVER_ID_GGP_PROPRIETARY(11),
    VK_DRIVER_ID_BROADCOM_PROPRIETARY(12),
    VK_DRIVER_ID_MESA_LLVMPIPE(13),
    VK_DRIVER_ID_AMD_PROPRIETARY_KHR(VK_DRIVER_ID_AMD_PROPRIETARY.valueOf()),
    VK_DRIVER_ID_AMD_OPEN_SOURCE_KHR(VK_DRIVER_ID_AMD_OPEN_SOURCE.valueOf()),
    VK_DRIVER_ID_MESA_RADV_KHR(VK_DRIVER_ID_MESA_RADV.valueOf()),
    VK_DRIVER_ID_NVIDIA_PROPRIETARY_KHR(VK_DRIVER_ID_NVIDIA_PROPRIETARY.valueOf()),
    VK_DRIVER_ID_INTEL_PROPRIETARY_WINDOWS_KHR(VK_DRIVER_ID_INTEL_PROPRIETARY_WINDOWS.valueOf()),
    VK_DRIVER_ID_INTEL_OPEN_SOURCE_MESA_KHR(VK_DRIVER_ID_INTEL_OPEN_SOURCE_MESA.valueOf()),
    VK_DRIVER_ID_IMAGINATION_PROPRIETARY_KHR(VK_DRIVER_ID_IMAGINATION_PROPRIETARY.valueOf()),
    VK_DRIVER_ID_QUALCOMM_PROPRIETARY_KHR(VK_DRIVER_ID_QUALCOMM_PROPRIETARY.valueOf()),
    VK_DRIVER_ID_ARM_PROPRIETARY_KHR(VK_DRIVER_ID_ARM_PROPRIETARY.valueOf()),
    VK_DRIVER_ID_GOOGLE_SWIFTSHADER_KHR(VK_DRIVER_ID_GOOGLE_SWIFTSHADER.valueOf()),
    VK_DRIVER_ID_GGP_PROPRIETARY_KHR(VK_DRIVER_ID_GGP_PROPRIETARY.valueOf()),
    VK_DRIVER_ID_BROADCOM_PROPRIETARY_KHR(VK_DRIVER_ID_BROADCOM_PROPRIETARY.valueOf()),
    VK_DRIVER_ID_MAX_ENUM_KHR(0x7FFFFFFF);

    private int value;
    
    private VkDriverId(int value) { this.value = value; }
    
    public int valueOf() { return value; }

    static VkDriverId fromValue(int inputValue)
    {
        VkDriverId result = null;
        
        switch(inputValue)
        {
            case 1:
                result = VK_DRIVER_ID_AMD_PROPRIETARY;
                break;
            case 2:
                result = VK_DRIVER_ID_AMD_OPEN_SOURCE;
                break;
            case 3:
                result = VK_DRIVER_ID_MESA_RADV;
                break;
            case 4:
                result =  VK_DRIVER_ID_NVIDIA_PROPRIETARY;
                break;
            case 5:
                result = VK_DRIVER_ID_INTEL_PROPRIETARY_WINDOWS;
                break;
            case 6:
                result = VK_DRIVER_ID_INTEL_OPEN_SOURCE_MESA;
                break;
            case 7:
                result = VK_DRIVER_ID_IMAGINATION_PROPRIETARY;
                break;
            case 8:
                result = VK_DRIVER_ID_QUALCOMM_PROPRIETARY;
                break;
            case 9:
                result = VK_DRIVER_ID_ARM_PROPRIETARY;
                break;
            case 10:
                result = VK_DRIVER_ID_GOOGLE_SWIFTSHADER;
                break;
            case 11:
                result = VK_DRIVER_ID_GGP_PROPRIETARY;
                break;
            case 12:
                result = VK_DRIVER_ID_BROADCOM_PROPRIETARY;
                break;
            case 13:
                result = VK_DRIVER_ID_MESA_LLVMPIPE;
                break;
        }

        if (result == null)
            throw new IllegalArgumentException("Illegal value specified for this Enum.");

        return result;
    }
}
