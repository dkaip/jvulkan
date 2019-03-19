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

public enum VkGeometryFlagBitsNV
{
    VK_GEOMETRY_OPAQUE_BIT_NV(0x00000001),
    VK_GEOMETRY_NO_DUPLICATE_ANY_HIT_INVOCATION_BIT_NV(0x00000002),
    VK_GEOMETRY_FLAG_BITS_MAX_ENUM_NV(0x7FFFFFFF);

    private int value;
    
    private VkGeometryFlagBitsNV(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
