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
package com.CIMthetics.jvulkan.VulkanCore.VK11.Enums;

/**
 * 
 * @author Douglas Kaip
 *
 */
public enum VkInternalAllocationType
{
    VK_INTERNAL_ALLOCATION_TYPE_EXECUTABLE(0),
    VK_INTERNAL_ALLOCATION_TYPE_BEGIN_RANGE(VK_INTERNAL_ALLOCATION_TYPE_EXECUTABLE.valueOf()),
    VK_INTERNAL_ALLOCATION_TYPE_END_RANGE(VK_INTERNAL_ALLOCATION_TYPE_EXECUTABLE.valueOf()),
    VK_INTERNAL_ALLOCATION_TYPE_RANGE_SIZE((VK_INTERNAL_ALLOCATION_TYPE_EXECUTABLE.valueOf() - VK_INTERNAL_ALLOCATION_TYPE_EXECUTABLE.valueOf() + 1)),
    VK_INTERNAL_ALLOCATION_TYPE_MAX_ENUM(0x7FFFFFFF);
    
    private int value;
    
    private VkInternalAllocationType(int value) { this.value = value; }
    
    int valueOf() { return value; }
}
