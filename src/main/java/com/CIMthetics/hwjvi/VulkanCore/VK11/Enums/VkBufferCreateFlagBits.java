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
package com.CIMthetics.hwjvi.VulkanCore.VK11.Enums;

public enum VkBufferCreateFlagBits
{
    VK_BUFFER_CREATE_SPARSE_BINDING_BIT(0x00000001),
    VK_BUFFER_CREATE_SPARSE_RESIDENCY_BIT(0x00000002),
    VK_BUFFER_CREATE_SPARSE_ALIASED_BIT(0x00000004),
    VK_BUFFER_CREATE_PROTECTED_BIT(0x00000008),
    VK_BUFFER_CREATE_DEVICE_ADDRESS_CAPTURE_REPLAY_BIT_EXT(0x00000010),
    VK_BUFFER_CREATE_FLAG_BITS_MAX_ENUM(0x7FFFFFFF);

    private int value;
    
    private VkBufferCreateFlagBits(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
