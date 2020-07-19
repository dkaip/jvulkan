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

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkVendorId;

class VkVendorIdTest
{
    @Test
    void testNumberOfElements()
    {
        VkVendorId[] values = VkVendorId.values();
        assertEquals(7, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }


    @Test
    void testValues()
    {
        assertEquals(0x10001, VkVendorId.VK_VENDOR_ID_VIV.valueOf(), VkVendorId.VK_VENDOR_ID_VIV.toString() + " has an unexpected value.");
        assertEquals(0x10002, VkVendorId.VK_VENDOR_ID_VSI.valueOf(), VkVendorId.VK_VENDOR_ID_VSI.toString() + " has an unexpected value.");
        assertEquals(0x10003, VkVendorId.VK_VENDOR_ID_KAZAN.valueOf(), VkVendorId.VK_VENDOR_ID_KAZAN.toString() + " has an unexpected value.");
        assertEquals(VkVendorId.VK_VENDOR_ID_VIV.valueOf(), VkVendorId.VK_VENDOR_ID_BEGIN_RANGE.valueOf(), VkVendorId.VK_VENDOR_ID_BEGIN_RANGE.toString() + " has an unexpected value.");
        assertEquals(VkVendorId.VK_VENDOR_ID_KAZAN.valueOf(), VkVendorId.VK_VENDOR_ID_END_RANGE.valueOf(), VkVendorId.VK_VENDOR_ID_END_RANGE.toString() + " has an unexpected value.");
        assertEquals(VkVendorId.VK_VENDOR_ID_KAZAN.valueOf() - VkVendorId.VK_VENDOR_ID_VIV.valueOf() + 1, VkVendorId.VK_VENDOR_ID_RANGE_SIZE.valueOf(), VkVendorId.VK_VENDOR_ID_RANGE_SIZE.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkVendorId.VK_VENDOR_ID_MAX_ENUM.valueOf(), VkVendorId.VK_VENDOR_ID_MAX_ENUM.toString() + " has an unexpected value.");
    }
}
