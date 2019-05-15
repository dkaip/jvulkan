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

public enum VkPointClippingBehavior
{
    VK_POINT_CLIPPING_BEHAVIOR_ALL_CLIP_PLANES(0),
    VK_POINT_CLIPPING_BEHAVIOR_USER_CLIP_PLANES_ONLY(1),
    VK_POINT_CLIPPING_BEHAVIOR_ALL_CLIP_PLANES_KHR(VK_POINT_CLIPPING_BEHAVIOR_ALL_CLIP_PLANES.valueOf()),
    VK_POINT_CLIPPING_BEHAVIOR_USER_CLIP_PLANES_ONLY_KHR(VK_POINT_CLIPPING_BEHAVIOR_USER_CLIP_PLANES_ONLY.valueOf()),
    VK_POINT_CLIPPING_BEHAVIOR_BEGIN_RANGE(VK_POINT_CLIPPING_BEHAVIOR_ALL_CLIP_PLANES.valueOf()),
    VK_POINT_CLIPPING_BEHAVIOR_END_RANGE(VK_POINT_CLIPPING_BEHAVIOR_USER_CLIP_PLANES_ONLY.valueOf()),
    VK_POINT_CLIPPING_BEHAVIOR_RANGE_SIZE((VK_POINT_CLIPPING_BEHAVIOR_USER_CLIP_PLANES_ONLY.valueOf() - VK_POINT_CLIPPING_BEHAVIOR_ALL_CLIP_PLANES.valueOf() + 1)),
    VK_POINT_CLIPPING_BEHAVIOR_MAX_ENUM(0x7FFFFFFF);

    private int value;
    
    private VkPointClippingBehavior(int value) { this.value = value; }
    
    public int valueOf() { return value; }

    static VkPointClippingBehavior fromValue(int inputValue)
    {
        VkPointClippingBehavior result = null;
        
        switch(inputValue)
        {
            case 0:
                result = VK_POINT_CLIPPING_BEHAVIOR_ALL_CLIP_PLANES;
                break;
            case 1:
                result = VK_POINT_CLIPPING_BEHAVIOR_USER_CLIP_PLANES_ONLY;
                break;
        }

        if (inputValue == (VK_POINT_CLIPPING_BEHAVIOR_USER_CLIP_PLANES_ONLY.valueOf() - VK_POINT_CLIPPING_BEHAVIOR_ALL_CLIP_PLANES.valueOf() + 1))
            result = VK_POINT_CLIPPING_BEHAVIOR_RANGE_SIZE;
        
        if (result == null)
            throw new IllegalArgumentException("Illegal value specified for this Enum.");

        return result;
    }
}
