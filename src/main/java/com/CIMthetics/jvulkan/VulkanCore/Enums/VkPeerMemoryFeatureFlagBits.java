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

public enum VkPeerMemoryFeatureFlagBits
{
    VK_PEER_MEMORY_FEATURE_COPY_SRC_BIT(0x00000001),
    VK_PEER_MEMORY_FEATURE_COPY_DST_BIT(0x00000002),
    VK_PEER_MEMORY_FEATURE_GENERIC_SRC_BIT(0x00000004),
    VK_PEER_MEMORY_FEATURE_GENERIC_DST_BIT(0x00000008),
    VK_PEER_MEMORY_FEATURE_COPY_SRC_BIT_KHR(VK_PEER_MEMORY_FEATURE_COPY_SRC_BIT.valueOf()),
    VK_PEER_MEMORY_FEATURE_COPY_DST_BIT_KHR(VK_PEER_MEMORY_FEATURE_COPY_DST_BIT.valueOf()),
    VK_PEER_MEMORY_FEATURE_GENERIC_SRC_BIT_KHR(VK_PEER_MEMORY_FEATURE_GENERIC_SRC_BIT.valueOf()),
    VK_PEER_MEMORY_FEATURE_GENERIC_DST_BIT_KHR(VK_PEER_MEMORY_FEATURE_GENERIC_DST_BIT.valueOf()),
    VK_PEER_MEMORY_FEATURE_FLAG_BITS_MAX_ENUM(0x7FFFFFFF);

    private int value;
    
    private VkPeerMemoryFeatureFlagBits(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
