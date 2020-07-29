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

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkPhysicalDeviceType;

class VkPhysicalDeviceTypeTest
{
    @Test
    void testNumberOfElements()
    {
        VkPhysicalDeviceType[] values = VkPhysicalDeviceType.values();
        assertEquals(9, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }


    @Test
    void testValues()
    {
        assertEquals(0, VkPhysicalDeviceType.VK_PHYSICAL_DEVICE_TYPE_OTHER.valueOf(), VkPhysicalDeviceType.VK_PHYSICAL_DEVICE_TYPE_OTHER.toString() + " has an unexpected value.");
        assertEquals(1, VkPhysicalDeviceType.VK_PHYSICAL_DEVICE_TYPE_INTEGRATED_GPU.valueOf(), VkPhysicalDeviceType.VK_PHYSICAL_DEVICE_TYPE_INTEGRATED_GPU.toString() + " has an unexpected value.");
        assertEquals(2, VkPhysicalDeviceType.VK_PHYSICAL_DEVICE_TYPE_DISCRETE_GPU.valueOf(), VkPhysicalDeviceType.VK_PHYSICAL_DEVICE_TYPE_DISCRETE_GPU.toString() + " has an unexpected value.");
        assertEquals(3, VkPhysicalDeviceType.VK_PHYSICAL_DEVICE_TYPE_VIRTUAL_GPU.valueOf(), VkPhysicalDeviceType.VK_PHYSICAL_DEVICE_TYPE_VIRTUAL_GPU.toString() + " has an unexpected value.");
        assertEquals(4, VkPhysicalDeviceType.VK_PHYSICAL_DEVICE_TYPE_CPU.valueOf(), VkPhysicalDeviceType.VK_PHYSICAL_DEVICE_TYPE_CPU.toString() + " has an unexpected value.");
        assertEquals(VkPhysicalDeviceType.VK_PHYSICAL_DEVICE_TYPE_OTHER.valueOf(), VkPhysicalDeviceType.VK_PHYSICAL_DEVICE_TYPE_BEGIN_RANGE.valueOf(), VkPhysicalDeviceType.VK_PHYSICAL_DEVICE_TYPE_BEGIN_RANGE.toString() + " has an unexpected value.");
        assertEquals(VkPhysicalDeviceType.VK_PHYSICAL_DEVICE_TYPE_CPU.valueOf(), VkPhysicalDeviceType.VK_PHYSICAL_DEVICE_TYPE_END_RANGE.valueOf(), VkPhysicalDeviceType.VK_PHYSICAL_DEVICE_TYPE_END_RANGE.toString() + " has an unexpected value.");
        assertEquals((VkPhysicalDeviceType.VK_PHYSICAL_DEVICE_TYPE_CPU.valueOf() - VkPhysicalDeviceType.VK_PHYSICAL_DEVICE_TYPE_OTHER.valueOf() + 1), VkPhysicalDeviceType.VK_PHYSICAL_DEVICE_TYPE_RANGE_SIZE.valueOf(), VkPhysicalDeviceType.VK_PHYSICAL_DEVICE_TYPE_RANGE_SIZE.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkPhysicalDeviceType.VK_PHYSICAL_DEVICE_TYPE_MAX_ENUM.valueOf(), VkPhysicalDeviceType.VK_PHYSICAL_DEVICE_TYPE_MAX_ENUM.toString() + " has an unexpected value.");
    }
}
