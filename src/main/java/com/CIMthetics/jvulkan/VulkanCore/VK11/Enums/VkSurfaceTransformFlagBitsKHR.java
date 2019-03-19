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

public enum VkSurfaceTransformFlagBitsKHR
{
    VK_SURFACE_TRANSFORM_IDENTITY_BIT_KHR(0x00000001),
    VK_SURFACE_TRANSFORM_ROTATE_90_BIT_KHR(0x00000002),
    VK_SURFACE_TRANSFORM_ROTATE_180_BIT_KHR(0x00000004),
    VK_SURFACE_TRANSFORM_ROTATE_270_BIT_KHR(0x00000008),
    VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_BIT_KHR(0x00000010),
    VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_90_BIT_KHR(0x00000020),
    VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_180_BIT_KHR(0x00000040),
    VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_270_BIT_KHR(0x00000080),
    VK_SURFACE_TRANSFORM_INHERIT_BIT_KHR(0x00000100);

    private int value;
    
    private VkSurfaceTransformFlagBitsKHR(int value) { this.value = value; }
    
    public int valueOf() { return value; }
    
    public static VkSurfaceTransformFlagBitsKHR fromValue(int inputValue)
    {
        VkSurfaceTransformFlagBitsKHR result = null;
        
        switch(inputValue)
        {
            case 0x00000001:
                result = VK_SURFACE_TRANSFORM_IDENTITY_BIT_KHR;
                break;
            case 0x00000002:
                result = VK_SURFACE_TRANSFORM_ROTATE_90_BIT_KHR;
                break;
            case 0x00000004:
                result = VK_SURFACE_TRANSFORM_ROTATE_180_BIT_KHR;
                break;
            case 0x00000008:
                result = VK_SURFACE_TRANSFORM_ROTATE_270_BIT_KHR;
                break;
            case 0x00000010:
                result = VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_BIT_KHR;
                break;
            case 0x00000020:
                result = VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_90_BIT_KHR;
                break;
            case 0x00000040:
                result = VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_180_BIT_KHR;
                break;
            case 0x00000080:
                result = VK_SURFACE_TRANSFORM_HORIZONTAL_MIRROR_ROTATE_270_BIT_KHR;
                break;
            case 0x00000100:
                result = VK_SURFACE_TRANSFORM_INHERIT_BIT_KHR;
                break;
        }

        if (result == null)
            throw new IllegalArgumentException("Illegal value specified for this Enum.");

        return result;
    }
}
