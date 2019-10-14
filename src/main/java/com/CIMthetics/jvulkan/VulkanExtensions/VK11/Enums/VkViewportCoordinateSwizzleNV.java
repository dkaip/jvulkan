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

public enum VkViewportCoordinateSwizzleNV
{
    VK_VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_X_NV(0),
    VK_VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_X_NV(1),
    VK_VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_Y_NV(2),
    VK_VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_Y_NV(3),
    VK_VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_Z_NV(4),
    VK_VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_Z_NV(5),
    VK_VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_W_NV(6),
    VK_VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_W_NV(7),
    VK_VIEWPORT_COORDINATE_SWIZZLE_BEGIN_RANGE_NV(VK_VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_X_NV.valueOf()),
    VK_VIEWPORT_COORDINATE_SWIZZLE_END_RANGE_NV(VK_VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_W_NV.valueOf()),
    VK_VIEWPORT_COORDINATE_SWIZZLE_RANGE_SIZE_NV((VK_VIEWPORT_COORDINATE_SWIZZLE_NEGATIVE_W_NV.valueOf() - VK_VIEWPORT_COORDINATE_SWIZZLE_POSITIVE_X_NV.valueOf() + 1)),
    VK_VIEWPORT_COORDINATE_SWIZZLE_MAX_ENUM_NV(0x7FFFFFFF);

    private int value;
    
    private VkViewportCoordinateSwizzleNV(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
