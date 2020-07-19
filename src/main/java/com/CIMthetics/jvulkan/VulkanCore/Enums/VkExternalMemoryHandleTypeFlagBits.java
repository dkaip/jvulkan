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

public enum VkExternalMemoryHandleTypeFlagBits
{
    VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD_BIT(0x00000001),
    VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT(0x00000002),
    VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT(0x00000004),
    VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT(0x00000008),
    VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_KMT_BIT(0x00000010),
    VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP_BIT(0x00000020),
    VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT(0x00000040),
    VK_EXTERNAL_MEMORY_HANDLE_TYPE_DMA_BUF_BIT_EXT(0x00000200),
    VK_EXTERNAL_MEMORY_HANDLE_TYPE_ANDROID_HARDWARE_BUFFER_BIT_ANDROID(0x00000400),
    VK_EXTERNAL_MEMORY_HANDLE_TYPE_HOST_ALLOCATION_BIT_EXT(0x00000080),
    VK_EXTERNAL_MEMORY_HANDLE_TYPE_HOST_MAPPED_FOREIGN_MEMORY_BIT_EXT(0x00000100),
    VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD_BIT_KHR(VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD_BIT.valueOf()),
    VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHR(VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT.valueOf()),
    VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHR(VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT.valueOf()),
    VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT_KHR(VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT.valueOf()),
    VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_KMT_BIT_KHR(VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_KMT_BIT.valueOf()),
    VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP_BIT_KHR(VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP_BIT.valueOf()),
    VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT_KHR(VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT.valueOf()),
    VK_EXTERNAL_MEMORY_HANDLE_TYPE_FLAG_BITS_MAX_ENUM(0x7FFFFFFF);

    private int value;
    
    private VkExternalMemoryHandleTypeFlagBits(int value) { this.value = value; }
    
    public int valueOf() { return value; }
    
    static VkExternalMemoryHandleTypeFlagBits fromValue(int inputValue)
    {
        VkExternalMemoryHandleTypeFlagBits result = null;
        
        switch(inputValue)
        {
            case 1:
                result = VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD_BIT;
                break;
            case 2:
                result = VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT;
                break;
            case 4:
                result = VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT;
                break;
            case 8:
                result = VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT;
                break;
            case 0x00000010:
                result = VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_KMT_BIT;
                break;
            case 0x00000020:
                result = VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP_BIT;
                break;
            case 0x00000040:
                result = VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT;
                break;
            case 0x00000080:
                result = VK_EXTERNAL_MEMORY_HANDLE_TYPE_HOST_ALLOCATION_BIT_EXT;
                break;
            case 0x00000100:
                result = VK_EXTERNAL_MEMORY_HANDLE_TYPE_HOST_MAPPED_FOREIGN_MEMORY_BIT_EXT;
                break;
            case 0x00000200:
                result = VK_EXTERNAL_MEMORY_HANDLE_TYPE_DMA_BUF_BIT_EXT;
                break;
            case 0x00000400:
                result =  VK_EXTERNAL_MEMORY_HANDLE_TYPE_ANDROID_HARDWARE_BUFFER_BIT_ANDROID;
                break;
            case 0x7FFFFFFF:
                result = VK_EXTERNAL_MEMORY_HANDLE_TYPE_FLAG_BITS_MAX_ENUM;
                break;
        }

        if (result == null)
            throw new IllegalArgumentException("Illegal value specified for this Enum.");

        return result;
    }
}
