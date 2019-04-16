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

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VkImageCreateFlagBitsTest
{
    @Test
    void testNumberOfElements()
    {
        VkImageCreateFlagBits[] values = VkImageCreateFlagBits.values();
        assertEquals(22, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }


    @Test
    void testValues()
    {
        assertEquals(0x00000001, VkImageCreateFlagBits.VK_IMAGE_CREATE_SPARSE_BINDING_BIT.valueOf(), VkImageCreateFlagBits.VK_IMAGE_CREATE_SPARSE_BINDING_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000002, VkImageCreateFlagBits.VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT.valueOf(), VkImageCreateFlagBits.VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000004, VkImageCreateFlagBits.VK_IMAGE_CREATE_SPARSE_ALIASED_BIT.valueOf(), VkImageCreateFlagBits.VK_IMAGE_CREATE_SPARSE_ALIASED_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000008, VkImageCreateFlagBits.VK_IMAGE_CREATE_MUTABLE_FORMAT_BIT.valueOf(), VkImageCreateFlagBits.VK_IMAGE_CREATE_MUTABLE_FORMAT_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000010, VkImageCreateFlagBits.VK_IMAGE_CREATE_CUBE_COMPATIBLE_BIT.valueOf(), VkImageCreateFlagBits.VK_IMAGE_CREATE_CUBE_COMPATIBLE_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000400, VkImageCreateFlagBits.VK_IMAGE_CREATE_ALIAS_BIT.valueOf(), VkImageCreateFlagBits.VK_IMAGE_CREATE_ALIAS_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000040, VkImageCreateFlagBits.VK_IMAGE_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT.valueOf(), VkImageCreateFlagBits.VK_IMAGE_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000020, VkImageCreateFlagBits.VK_IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT.valueOf(), VkImageCreateFlagBits.VK_IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000080, VkImageCreateFlagBits.VK_IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT.valueOf(), VkImageCreateFlagBits.VK_IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000100, VkImageCreateFlagBits.VK_IMAGE_CREATE_EXTENDED_USAGE_BIT.valueOf(), VkImageCreateFlagBits.VK_IMAGE_CREATE_EXTENDED_USAGE_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000800, VkImageCreateFlagBits.VK_IMAGE_CREATE_PROTECTED_BIT.valueOf(), VkImageCreateFlagBits.VK_IMAGE_CREATE_PROTECTED_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000200, VkImageCreateFlagBits.VK_IMAGE_CREATE_DISJOINT_BIT.valueOf(), VkImageCreateFlagBits.VK_IMAGE_CREATE_DISJOINT_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00001000, VkImageCreateFlagBits.VK_IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT.valueOf(), VkImageCreateFlagBits.VK_IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT.toString() + " has an unexpected value.");
        assertEquals(0x00002000, VkImageCreateFlagBits.VK_IMAGE_CREATE_CORNER_SAMPLED_BIT_NV.valueOf(), VkImageCreateFlagBits.VK_IMAGE_CREATE_CORNER_SAMPLED_BIT_NV.toString() + " has an unexpected value.");
        assertEquals(0x00004000, VkImageCreateFlagBits.VK_IMAGE_CREATE_SUBSAMPLED_BIT_EXT.valueOf(), VkImageCreateFlagBits.VK_IMAGE_CREATE_SUBSAMPLED_BIT_EXT.toString() + " has an unexpected value.");
        assertEquals(VkImageCreateFlagBits.VK_IMAGE_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT.valueOf(), VkImageCreateFlagBits.VK_IMAGE_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT_KHR.valueOf(), VkImageCreateFlagBits.VK_IMAGE_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT_KHR.toString() + " has an unexpected value.");
        assertEquals(VkImageCreateFlagBits.VK_IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT.valueOf(), VkImageCreateFlagBits.VK_IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT_KHR.valueOf(), VkImageCreateFlagBits.VK_IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT_KHR.toString() + " has an unexpected value.");
        assertEquals(VkImageCreateFlagBits.VK_IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT.valueOf(), VkImageCreateFlagBits.VK_IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT_KHR.valueOf(), VkImageCreateFlagBits.VK_IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT_KHR.toString() + " has an unexpected value.");
        assertEquals(VkImageCreateFlagBits.VK_IMAGE_CREATE_EXTENDED_USAGE_BIT.valueOf(), VkImageCreateFlagBits.VK_IMAGE_CREATE_EXTENDED_USAGE_BIT_KHR.valueOf(), VkImageCreateFlagBits.VK_IMAGE_CREATE_EXTENDED_USAGE_BIT_KHR.toString() + " has an unexpected value.");
        assertEquals(VkImageCreateFlagBits.VK_IMAGE_CREATE_DISJOINT_BIT.valueOf(), VkImageCreateFlagBits.VK_IMAGE_CREATE_DISJOINT_BIT_KHR.valueOf(), VkImageCreateFlagBits.VK_IMAGE_CREATE_DISJOINT_BIT_KHR.toString() + " has an unexpected value.");
        assertEquals(VkImageCreateFlagBits.VK_IMAGE_CREATE_ALIAS_BIT.valueOf(), VkImageCreateFlagBits.VK_IMAGE_CREATE_ALIAS_BIT_KHR.valueOf(), VkImageCreateFlagBits.VK_IMAGE_CREATE_ALIAS_BIT_KHR.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkImageCreateFlagBits.VK_IMAGE_CREATE_FLAG_BITS_MAX_ENUM.valueOf(), VkImageCreateFlagBits.VK_IMAGE_CREATE_FLAG_BITS_MAX_ENUM.toString() + " has an unexpected value.");
    }
}
