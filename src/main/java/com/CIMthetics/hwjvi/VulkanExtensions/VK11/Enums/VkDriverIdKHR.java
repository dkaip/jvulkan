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
package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Enums;

public enum VkDriverIdKHR
{
    VK_DRIVER_ID_AMD_PROPRIETARY_KHR(1),
    VK_DRIVER_ID_AMD_OPEN_SOURCE_KHR(2),
    VK_DRIVER_ID_MESA_RADV_KHR(3),
    VK_DRIVER_ID_NVIDIA_PROPRIETARY_KHR(4),
    VK_DRIVER_ID_INTEL_PROPRIETARY_WINDOWS_KHR(5),
    VK_DRIVER_ID_INTEL_OPEN_SOURCE_MESA_KHR(6),
    VK_DRIVER_ID_IMAGINATION_PROPRIETARY_KHR(7),
    VK_DRIVER_ID_QUALCOMM_PROPRIETARY_KHR(8),
    VK_DRIVER_ID_ARM_PROPRIETARY_KHR(9),
    VK_DRIVER_ID_GOOGLE_PASTEL_KHR(10),
    VK_DRIVER_ID_BEGIN_RANGE_KHR(VK_DRIVER_ID_AMD_PROPRIETARY_KHR.valueOf()),
    VK_DRIVER_ID_END_RANGE_KHR(VK_DRIVER_ID_GOOGLE_PASTEL_KHR.valueOf()),
    VK_DRIVER_ID_RANGE_SIZE_KHR(VK_DRIVER_ID_GOOGLE_PASTEL_KHR.valueOf() - VK_DRIVER_ID_AMD_PROPRIETARY_KHR.valueOf() + 1),
    VK_DRIVER_ID_MAX_ENUM_KHR(0x7FFFFFFF);

    private int value;
    
    private VkDriverIdKHR(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
