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

public enum VkTessellationDomainOrigin
{
    VK_TESSELLATION_DOMAIN_ORIGIN_UPPER_LEFT(0),
    VK_TESSELLATION_DOMAIN_ORIGIN_LOWER_LEFT(1),
    VK_TESSELLATION_DOMAIN_ORIGIN_UPPER_LEFT_KHR(VK_TESSELLATION_DOMAIN_ORIGIN_UPPER_LEFT.valueOf()),
    VK_TESSELLATION_DOMAIN_ORIGIN_LOWER_LEFT_KHR(VK_TESSELLATION_DOMAIN_ORIGIN_LOWER_LEFT.valueOf()),
    VK_TESSELLATION_DOMAIN_ORIGIN_MAX_ENUM(0x7FFFFFFF);

    private int value;
    
    private VkTessellationDomainOrigin(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
