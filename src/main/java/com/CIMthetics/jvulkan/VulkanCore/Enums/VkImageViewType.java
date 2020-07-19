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

public enum VkImageViewType
{
    VK_IMAGE_VIEW_TYPE_1D(0),
    VK_IMAGE_VIEW_TYPE_2D(1),
    VK_IMAGE_VIEW_TYPE_3D(2),
    VK_IMAGE_VIEW_TYPE_CUBE(3),
    VK_IMAGE_VIEW_TYPE_1D_ARRAY(4),
    VK_IMAGE_VIEW_TYPE_2D_ARRAY(5),
    VK_IMAGE_VIEW_TYPE_CUBE_ARRAY(6),
    VK_IMAGE_VIEW_TYPE_BEGIN_RANGE(VK_IMAGE_VIEW_TYPE_1D.valueOf()),
    VK_IMAGE_VIEW_TYPE_END_RANGE(VK_IMAGE_VIEW_TYPE_CUBE_ARRAY.valueOf()),
    VK_IMAGE_VIEW_TYPE_RANGE_SIZE((VK_IMAGE_VIEW_TYPE_CUBE_ARRAY.valueOf() - VK_IMAGE_VIEW_TYPE_1D.valueOf() + 1)),
    VK_IMAGE_VIEW_TYPE_MAX_ENUM(0x7FFFFFFF);

    private int value;
    
    private VkImageViewType(int value) { this.value = value; }
    
    public int valueOf() { return value; }

    static VkImageViewType fromValue(int inputValue)
    {
        VkImageViewType result = null;
        
        switch(inputValue)
        {
            case 0:
                result = VK_IMAGE_VIEW_TYPE_1D;
                break;
            case 1:
                result = VK_IMAGE_VIEW_TYPE_2D;
                break;
            case 2:
                result = VK_IMAGE_VIEW_TYPE_3D;
                break;
            case 3:
                result = VK_IMAGE_VIEW_TYPE_CUBE;
                break;
            case 4:
                result = VK_IMAGE_VIEW_TYPE_1D_ARRAY;
                break;
            case 5:
                result = VK_IMAGE_VIEW_TYPE_2D_ARRAY;
                break;
            case 6:
                result = VK_IMAGE_VIEW_TYPE_CUBE_ARRAY;
                break;
            case 0x7FFFFFFF:
                result = VK_IMAGE_VIEW_TYPE_MAX_ENUM;
                break;
        }

        if (inputValue == (VK_IMAGE_VIEW_TYPE_CUBE_ARRAY.valueOf() - VK_IMAGE_VIEW_TYPE_1D.valueOf() + 1))
            result = VK_IMAGE_VIEW_TYPE_RANGE_SIZE;
        
        if (result == null)
            throw new IllegalArgumentException("Illegal value specified for this Enum.");

        return result;
    }
}
