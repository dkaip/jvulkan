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

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkPointClippingBehavior;

class VkPointClippingBehaviorTest
{
    @Test
    void testNumberOfElements()
    {
        VkPointClippingBehavior[] values = VkPointClippingBehavior.values();
        assertEquals(8, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }


    @Test
    void testValues()
    {
        assertEquals(0, VkPointClippingBehavior.VK_POINT_CLIPPING_BEHAVIOR_ALL_CLIP_PLANES.valueOf(), VkPointClippingBehavior.VK_POINT_CLIPPING_BEHAVIOR_ALL_CLIP_PLANES.toString() + " has an unexpected value.");
        assertEquals(1, VkPointClippingBehavior.VK_POINT_CLIPPING_BEHAVIOR_USER_CLIP_PLANES_ONLY.valueOf(), VkPointClippingBehavior.VK_POINT_CLIPPING_BEHAVIOR_USER_CLIP_PLANES_ONLY.toString() + " has an unexpected value.");
        assertEquals(VkPointClippingBehavior.VK_POINT_CLIPPING_BEHAVIOR_ALL_CLIP_PLANES.valueOf(), VkPointClippingBehavior.VK_POINT_CLIPPING_BEHAVIOR_ALL_CLIP_PLANES_KHR.valueOf(), VkPointClippingBehavior.VK_POINT_CLIPPING_BEHAVIOR_ALL_CLIP_PLANES_KHR.toString() + " has an unexpected value.");
        assertEquals(VkPointClippingBehavior.VK_POINT_CLIPPING_BEHAVIOR_USER_CLIP_PLANES_ONLY.valueOf(), VkPointClippingBehavior.VK_POINT_CLIPPING_BEHAVIOR_USER_CLIP_PLANES_ONLY_KHR.valueOf(), VkPointClippingBehavior.VK_POINT_CLIPPING_BEHAVIOR_USER_CLIP_PLANES_ONLY_KHR.toString() + " has an unexpected value.");
        assertEquals(VkPointClippingBehavior.VK_POINT_CLIPPING_BEHAVIOR_ALL_CLIP_PLANES.valueOf(), VkPointClippingBehavior.VK_POINT_CLIPPING_BEHAVIOR_BEGIN_RANGE.valueOf(), VkPointClippingBehavior.VK_POINT_CLIPPING_BEHAVIOR_BEGIN_RANGE.toString() + " has an unexpected value.");
        assertEquals(VkPointClippingBehavior.VK_POINT_CLIPPING_BEHAVIOR_USER_CLIP_PLANES_ONLY.valueOf(), VkPointClippingBehavior.VK_POINT_CLIPPING_BEHAVIOR_END_RANGE.valueOf(), VkPointClippingBehavior.VK_POINT_CLIPPING_BEHAVIOR_END_RANGE.toString() + " has an unexpected value.");
        assertEquals((VkPointClippingBehavior.VK_POINT_CLIPPING_BEHAVIOR_USER_CLIP_PLANES_ONLY.valueOf() - VkPointClippingBehavior.VK_POINT_CLIPPING_BEHAVIOR_ALL_CLIP_PLANES.valueOf() + 1), VkPointClippingBehavior.VK_POINT_CLIPPING_BEHAVIOR_RANGE_SIZE.valueOf(), VkPointClippingBehavior.VK_POINT_CLIPPING_BEHAVIOR_RANGE_SIZE.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkPointClippingBehavior.VK_POINT_CLIPPING_BEHAVIOR_MAX_ENUM.valueOf(), VkPointClippingBehavior.VK_POINT_CLIPPING_BEHAVIOR_MAX_ENUM.toString() + " has an unexpected value.");
    }
}
