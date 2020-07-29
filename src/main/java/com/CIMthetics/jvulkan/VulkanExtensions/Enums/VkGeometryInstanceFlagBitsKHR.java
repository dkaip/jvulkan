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
package com.CIMthetics.jvulkan.VulkanExtensions.Enums;

public enum VkGeometryInstanceFlagBitsKHR
{
    VK_GEOMETRY_INSTANCE_TRIANGLE_FACING_CULL_DISABLE_BIT_KHR(0x00000001),
    VK_GEOMETRY_INSTANCE_TRIANGLE_FRONT_COUNTERCLOCKWISE_BIT_KHR(0x00000002),
    VK_GEOMETRY_INSTANCE_FORCE_OPAQUE_BIT_KHR(0x00000004),
    VK_GEOMETRY_INSTANCE_FORCE_NO_OPAQUE_BIT_KHR(0x00000008),
    VK_GEOMETRY_INSTANCE_TRIANGLE_CULL_DISABLE_BIT_NV(VK_GEOMETRY_INSTANCE_TRIANGLE_FACING_CULL_DISABLE_BIT_KHR.valueOf()),
    VK_GEOMETRY_INSTANCE_TRIANGLE_FRONT_COUNTERCLOCKWISE_BIT_NV(VK_GEOMETRY_INSTANCE_TRIANGLE_FRONT_COUNTERCLOCKWISE_BIT_KHR.valueOf()),
    VK_GEOMETRY_INSTANCE_FORCE_OPAQUE_BIT_NV(VK_GEOMETRY_INSTANCE_FORCE_OPAQUE_BIT_KHR.valueOf()),
    VK_GEOMETRY_INSTANCE_FORCE_NO_OPAQUE_BIT_NV(VK_GEOMETRY_INSTANCE_FORCE_NO_OPAQUE_BIT_KHR.valueOf()),
    VK_GEOMETRY_INSTANCE_FLAG_BITS_MAX_ENUM_KHR(0x7FFFFFFF);

    private int value;
    
    private VkGeometryInstanceFlagBitsKHR(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
