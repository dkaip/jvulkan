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
package com.CIMthetics.jvulkan.VulkanExtensions.VK11.Enums;

public enum VkValidationCacheHeaderVersionEXT
{
    VK_VALIDATION_CACHE_HEADER_VERSION_ONE_EXT(1),
    VK_VALIDATION_CACHE_HEADER_VERSION_BEGIN_RANGE_EXT(VK_VALIDATION_CACHE_HEADER_VERSION_ONE_EXT.valueOf()),
    VK_VALIDATION_CACHE_HEADER_VERSION_END_RANGE_EXT(VK_VALIDATION_CACHE_HEADER_VERSION_ONE_EXT.valueOf()),
    VK_VALIDATION_CACHE_HEADER_VERSION_RANGE_SIZE_EXT((VK_VALIDATION_CACHE_HEADER_VERSION_ONE_EXT.valueOf() - VK_VALIDATION_CACHE_HEADER_VERSION_ONE_EXT.valueOf() + 1)),
    VK_VALIDATION_CACHE_HEADER_VERSION_MAX_ENUM_EXT(0x7FFFFFFF);

    private int value;
    
    private VkValidationCacheHeaderVersionEXT(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}