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

public enum VkComponentSwizzle
{
    VK_COMPONENT_SWIZZLE_IDENTITY(0),
    VK_COMPONENT_SWIZZLE_ZERO(1),
    VK_COMPONENT_SWIZZLE_ONE(2),
    VK_COMPONENT_SWIZZLE_R(3),
    VK_COMPONENT_SWIZZLE_G(4),
    VK_COMPONENT_SWIZZLE_B(5),
    VK_COMPONENT_SWIZZLE_A(6),
    VK_COMPONENT_SWIZZLE_BEGIN_RANGE(VK_COMPONENT_SWIZZLE_IDENTITY.valueOf()),
    VK_COMPONENT_SWIZZLE_END_RANGE(VK_COMPONENT_SWIZZLE_A.valueOf()),
    VK_COMPONENT_SWIZZLE_RANGE_SIZE((VK_COMPONENT_SWIZZLE_A.valueOf() - VK_COMPONENT_SWIZZLE_IDENTITY.valueOf() + 1)),
    VK_COMPONENT_SWIZZLE_MAX_ENUM(0x7FFFFFFF);

    private int value;
    
    private VkComponentSwizzle(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
