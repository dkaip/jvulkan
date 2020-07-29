/*
 * Copyright 2020 Douglas Kaip
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

public enum VkToolPurposeFlagBitsEXT
{
    VK_TOOL_PURPOSE_VALIDATION_BIT_EXT(0x00000001),
    VK_TOOL_PURPOSE_PROFILING_BIT_EXT(0x00000002),
    VK_TOOL_PURPOSE_TRACING_BIT_EXT(0x00000004),
    VK_TOOL_PURPOSE_ADDITIONAL_FEATURES_BIT_EXT(0x00000008),
    VK_TOOL_PURPOSE_MODIFYING_FEATURES_BIT_EXT(0x00000010),
    VK_TOOL_PURPOSE_DEBUG_REPORTING_BIT_EXT(0x00000020),
    VK_TOOL_PURPOSE_DEBUG_MARKERS_BIT_EXT(0x00000040),
    VK_TOOL_PURPOSE_FLAG_BITS_MAX_ENUM_EXT(0x7FFFFFFF);

    private int value;
    
    private VkToolPurposeFlagBitsEXT(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
