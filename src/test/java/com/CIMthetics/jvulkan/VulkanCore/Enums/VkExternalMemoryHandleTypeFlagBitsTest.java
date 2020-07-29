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

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkExternalMemoryHandleTypeFlagBits;

class VkExternalMemoryHandleTypeFlagBitsTest
{
    @Test
    void testNumberOfElements()
    {
        VkExternalMemoryHandleTypeFlagBits[] values = VkExternalMemoryHandleTypeFlagBits.values();
        assertEquals(19, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }


    @Test
    void testValues()
    {
        assertEquals(0x00000001, VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD_BIT.valueOf(), VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000002, VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT.valueOf(), VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000004, VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT.valueOf(), VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000008, VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT.valueOf(), VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000010, VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_KMT_BIT.valueOf(), VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_KMT_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000020, VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP_BIT.valueOf(), VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000040, VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT.valueOf(), VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000200, VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_DMA_BUF_BIT_EXT.valueOf(), VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_DMA_BUF_BIT_EXT.toString() + " has an unexpected value.");
        assertEquals(0x00000400, VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_ANDROID_HARDWARE_BUFFER_BIT_ANDROID.valueOf(), VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_ANDROID_HARDWARE_BUFFER_BIT_ANDROID.toString() + " has an unexpected value.");
        assertEquals(0x00000080, VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_HOST_ALLOCATION_BIT_EXT.valueOf(), VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_HOST_ALLOCATION_BIT_EXT.toString() + " has an unexpected value.");
        assertEquals(0x00000100, VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_HOST_MAPPED_FOREIGN_MEMORY_BIT_EXT.valueOf(), VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_HOST_MAPPED_FOREIGN_MEMORY_BIT_EXT.toString() + " has an unexpected value.");
        assertEquals(VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD_BIT.valueOf(), VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD_BIT_KHR.valueOf(), VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD_BIT_KHR.toString() + " has an unexpected value.");
        assertEquals(VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT.valueOf(), VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHR.valueOf(), VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHR.toString() + " has an unexpected value.");
        assertEquals(VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT.valueOf(), VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHR.valueOf(), VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHR.toString() + " has an unexpected value.");
        assertEquals(VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT.valueOf(), VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT_KHR.valueOf(), VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT_KHR.toString() + " has an unexpected value.");
        assertEquals(VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_KMT_BIT.valueOf(), VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_KMT_BIT_KHR.valueOf(), VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_KMT_BIT_KHR.toString() + " has an unexpected value.");
        assertEquals(VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP_BIT.valueOf(), VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP_BIT_KHR.valueOf(), VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP_BIT_KHR.toString() + " has an unexpected value.");
        assertEquals(VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT.valueOf(), VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT_KHR.valueOf(), VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT_KHR.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_FLAG_BITS_MAX_ENUM.valueOf(), VkExternalMemoryHandleTypeFlagBits.VK_EXTERNAL_MEMORY_HANDLE_TYPE_FLAG_BITS_MAX_ENUM.toString() + " has an unexpected value.");
    }
}
