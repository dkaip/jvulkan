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
package com.CIMthetics.jvulkan.VulkanExtensions.Enums;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.CIMthetics.jvulkan.VulkanExtensions.Enums.VkDriverIdKHR;

class VkDriverIdKHRTest
{
    @Test
    void testNumberOfElements()
    {
        VkDriverIdKHR[] values = VkDriverIdKHR.values();
        assertEquals(15, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }


    @Test
    void testValues()
    {
        assertEquals(1, VkDriverIdKHR.VK_DRIVER_ID_AMD_PROPRIETARY_KHR.valueOf(), VkDriverIdKHR.VK_DRIVER_ID_AMD_PROPRIETARY_KHR.toString() + " has an unexpected value.");
        assertEquals(2, VkDriverIdKHR.VK_DRIVER_ID_AMD_OPEN_SOURCE_KHR.valueOf(), VkDriverIdKHR.VK_DRIVER_ID_AMD_OPEN_SOURCE_KHR.toString() + " has an unexpected value.");
        assertEquals(3, VkDriverIdKHR.VK_DRIVER_ID_MESA_RADV_KHR.valueOf(), VkDriverIdKHR.VK_DRIVER_ID_MESA_RADV_KHR.toString() + " has an unexpected value.");
        assertEquals(4, VkDriverIdKHR.VK_DRIVER_ID_NVIDIA_PROPRIETARY_KHR.valueOf(), VkDriverIdKHR.VK_DRIVER_ID_NVIDIA_PROPRIETARY_KHR.toString() + " has an unexpected value.");
        assertEquals(5, VkDriverIdKHR.VK_DRIVER_ID_INTEL_PROPRIETARY_WINDOWS_KHR.valueOf(), VkDriverIdKHR.VK_DRIVER_ID_INTEL_PROPRIETARY_WINDOWS_KHR.toString() + " has an unexpected value.");
        assertEquals(6, VkDriverIdKHR.VK_DRIVER_ID_INTEL_OPEN_SOURCE_MESA_KHR.valueOf(), VkDriverIdKHR.VK_DRIVER_ID_INTEL_OPEN_SOURCE_MESA_KHR.toString() + " has an unexpected value.");
        assertEquals(7, VkDriverIdKHR.VK_DRIVER_ID_IMAGINATION_PROPRIETARY_KHR.valueOf(), VkDriverIdKHR.VK_DRIVER_ID_IMAGINATION_PROPRIETARY_KHR.toString() + " has an unexpected value.");
        assertEquals(8, VkDriverIdKHR.VK_DRIVER_ID_QUALCOMM_PROPRIETARY_KHR.valueOf(), VkDriverIdKHR.VK_DRIVER_ID_QUALCOMM_PROPRIETARY_KHR.toString() + " has an unexpected value.");
        assertEquals(9, VkDriverIdKHR.VK_DRIVER_ID_ARM_PROPRIETARY_KHR.valueOf(), VkDriverIdKHR.VK_DRIVER_ID_ARM_PROPRIETARY_KHR.toString() + " has an unexpected value.");
        assertEquals(10, VkDriverIdKHR.VK_DRIVER_ID_GOOGLE_PASTEL_KHR.valueOf(), VkDriverIdKHR.VK_DRIVER_ID_GOOGLE_PASTEL_KHR.toString() + " has an unexpected value.");
        assertEquals(11, VkDriverIdKHR.VK_DRIVER_ID_GGP_PROPRIETARY_KHR.valueOf(), VkDriverIdKHR.VK_DRIVER_ID_GGP_PROPRIETARY_KHR.toString() + " has an unexpected value.");
        assertEquals(VkDriverIdKHR.VK_DRIVER_ID_AMD_PROPRIETARY_KHR.valueOf(), VkDriverIdKHR.VK_DRIVER_ID_BEGIN_RANGE_KHR.valueOf(), VkDriverIdKHR.VK_DRIVER_ID_BEGIN_RANGE_KHR.toString() + " has an unexpected value.");
        assertEquals(VkDriverIdKHR.VK_DRIVER_ID_GGP_PROPRIETARY_KHR.valueOf(), VkDriverIdKHR.VK_DRIVER_ID_END_RANGE_KHR.valueOf(), VkDriverIdKHR.VK_DRIVER_ID_END_RANGE_KHR.toString() + " has an unexpected value.");
        assertEquals(VkDriverIdKHR.VK_DRIVER_ID_GGP_PROPRIETARY_KHR.valueOf() - VkDriverIdKHR.VK_DRIVER_ID_AMD_PROPRIETARY_KHR.valueOf() + 1, VkDriverIdKHR.VK_DRIVER_ID_RANGE_SIZE_KHR.valueOf(), VkDriverIdKHR.VK_DRIVER_ID_RANGE_SIZE_KHR.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkDriverIdKHR.VK_DRIVER_ID_MAX_ENUM_KHR.valueOf(), VkDriverIdKHR.VK_DRIVER_ID_MAX_ENUM_KHR.toString() + " has an unexpected value.");
    }
}
