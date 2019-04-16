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

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VkGeometryTypeNVTest
{
    @Test
    void testNumberOfElements()
    {
        VkGeometryTypeNV[] values = VkGeometryTypeNV.values();
        assertEquals(6, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }


    @Test
    void testValues()
    {
        assertEquals(0, VkGeometryTypeNV.VK_GEOMETRY_TYPE_TRIANGLES_NV.valueOf(), VkGeometryTypeNV.VK_GEOMETRY_TYPE_TRIANGLES_NV.toString() + " has an unexpected value.");
        assertEquals(1, VkGeometryTypeNV.VK_GEOMETRY_TYPE_AABBS_NV.valueOf(), VkGeometryTypeNV.VK_GEOMETRY_TYPE_AABBS_NV.toString() + " has an unexpected value.");
        assertEquals(VkGeometryTypeNV.VK_GEOMETRY_TYPE_TRIANGLES_NV.valueOf(), VkGeometryTypeNV.VK_GEOMETRY_TYPE_BEGIN_RANGE_NV.valueOf(), VkGeometryTypeNV.VK_GEOMETRY_TYPE_BEGIN_RANGE_NV.toString() + " has an unexpected value.");
        assertEquals(VkGeometryTypeNV.VK_GEOMETRY_TYPE_AABBS_NV.valueOf(), VkGeometryTypeNV.VK_GEOMETRY_TYPE_END_RANGE_NV.valueOf(), VkGeometryTypeNV.VK_GEOMETRY_TYPE_END_RANGE_NV.toString() + " has an unexpected value.");
        assertEquals((VkGeometryTypeNV.VK_GEOMETRY_TYPE_AABBS_NV.valueOf() - VkGeometryTypeNV.VK_GEOMETRY_TYPE_TRIANGLES_NV.valueOf() + 1), VkGeometryTypeNV.VK_GEOMETRY_TYPE_RANGE_SIZE_NV.valueOf(), VkGeometryTypeNV.VK_GEOMETRY_TYPE_RANGE_SIZE_NV.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkGeometryTypeNV.VK_GEOMETRY_TYPE_MAX_ENUM_NV.valueOf(), VkGeometryTypeNV.VK_GEOMETRY_TYPE_MAX_ENUM_NV.toString() + " has an unexpected value.");
    }
}
