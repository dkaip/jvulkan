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

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkExternalSemaphoreHandleTypeFlagBits;

class VkExternalSemaphoreHandleTypeFlagBitsTest
{
    @Test
    void testNumberOfElements()
    {
        VkExternalSemaphoreHandleTypeFlagBits[] values = VkExternalSemaphoreHandleTypeFlagBits.values();
        assertEquals(11, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }


    @Test
    void testValues()
    {
        assertEquals(0x00000001, VkExternalSemaphoreHandleTypeFlagBits.VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD_BIT.valueOf(), VkExternalSemaphoreHandleTypeFlagBits.VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000002, VkExternalSemaphoreHandleTypeFlagBits.VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_BIT.valueOf(), VkExternalSemaphoreHandleTypeFlagBits.VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000004, VkExternalSemaphoreHandleTypeFlagBits.VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT.valueOf(), VkExternalSemaphoreHandleTypeFlagBits.VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000008, VkExternalSemaphoreHandleTypeFlagBits.VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE_BIT.valueOf(), VkExternalSemaphoreHandleTypeFlagBits.VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000010, VkExternalSemaphoreHandleTypeFlagBits.VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_SYNC_FD_BIT.valueOf(), VkExternalSemaphoreHandleTypeFlagBits.VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_SYNC_FD_BIT.toString() + " has an unexpected value.");
        assertEquals(VkExternalSemaphoreHandleTypeFlagBits.VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD_BIT.valueOf(), VkExternalSemaphoreHandleTypeFlagBits.VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD_BIT_KHR.valueOf(), VkExternalSemaphoreHandleTypeFlagBits.VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_FD_BIT_KHR.toString() + " has an unexpected value.");
        assertEquals(VkExternalSemaphoreHandleTypeFlagBits.VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_BIT.valueOf(), VkExternalSemaphoreHandleTypeFlagBits.VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHR.valueOf(), VkExternalSemaphoreHandleTypeFlagBits.VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHR.toString() + " has an unexpected value.");
        assertEquals(VkExternalSemaphoreHandleTypeFlagBits.VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT.valueOf(), VkExternalSemaphoreHandleTypeFlagBits.VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHR.valueOf(), VkExternalSemaphoreHandleTypeFlagBits.VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHR.toString() + " has an unexpected value.");
        assertEquals(VkExternalSemaphoreHandleTypeFlagBits.VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE_BIT.valueOf(), VkExternalSemaphoreHandleTypeFlagBits.VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE_BIT_KHR.valueOf(), VkExternalSemaphoreHandleTypeFlagBits.VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE_BIT_KHR.toString() + " has an unexpected value.");
        assertEquals(VkExternalSemaphoreHandleTypeFlagBits.VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_SYNC_FD_BIT.valueOf(), VkExternalSemaphoreHandleTypeFlagBits.VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_SYNC_FD_BIT_KHR.valueOf(), VkExternalSemaphoreHandleTypeFlagBits.VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_SYNC_FD_BIT_KHR.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkExternalSemaphoreHandleTypeFlagBits.VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_FLAG_BITS_MAX_ENUM.valueOf(), VkExternalSemaphoreHandleTypeFlagBits.VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_FLAG_BITS_MAX_ENUM.toString() + " has an unexpected value.");
    }
}
