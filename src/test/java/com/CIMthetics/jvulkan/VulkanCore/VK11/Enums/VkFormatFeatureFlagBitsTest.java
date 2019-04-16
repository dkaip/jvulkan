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

class VkFormatFeatureFlagBitsTest
{
    @Test
    void testNumberOfElements()
    {
        VkFormatFeatureFlagBits[] values = VkFormatFeatureFlagBits.values();
        assertEquals(36, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }


    @Test
    void testValues()
    {
        assertEquals(0x00000001, VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_SAMPLED_IMAGE_BIT.valueOf(), VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_SAMPLED_IMAGE_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000002, VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_STORAGE_IMAGE_BIT.valueOf(), VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_STORAGE_IMAGE_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000004, VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT.valueOf(), VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_STORAGE_IMAGE_ATOMIC_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000008, VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_UNIFORM_TEXEL_BUFFER_BIT.valueOf(), VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_UNIFORM_TEXEL_BUFFER_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000010, VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_BIT.valueOf(), VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000020, VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_ATOMIC_BIT.valueOf(), VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_STORAGE_TEXEL_BUFFER_ATOMIC_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000040, VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_VERTEX_BUFFER_BIT.valueOf(), VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_VERTEX_BUFFER_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000080, VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BIT.valueOf(), VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000100, VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT.valueOf(), VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_COLOR_ATTACHMENT_BLEND_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000200, VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT.valueOf(), VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_DEPTH_STENCIL_ATTACHMENT_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000400, VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_BLIT_SRC_BIT.valueOf(), VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_BLIT_SRC_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000800, VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_BLIT_DST_BIT.valueOf(), VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_BLIT_DST_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00001000, VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT.valueOf(), VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00004000, VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_TRANSFER_SRC_BIT.valueOf(), VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_TRANSFER_SRC_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00008000, VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_TRANSFER_DST_BIT.valueOf(), VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_TRANSFER_DST_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00020000, VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_MIDPOINT_CHROMA_SAMPLES_BIT.valueOf(), VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_MIDPOINT_CHROMA_SAMPLES_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00040000, VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_BIT.valueOf(), VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00080000, VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER_BIT.valueOf(), VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00100000, VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_BIT.valueOf(), VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00200000, VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_BIT.valueOf(), VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00400000, VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_DISJOINT_BIT.valueOf(), VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_DISJOINT_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00800000, VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_COSITED_CHROMA_SAMPLES_BIT.valueOf(), VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_COSITED_CHROMA_SAMPLES_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00002000, VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_IMG.valueOf(), VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_IMG.toString() + " has an unexpected value.");
        assertEquals(0x00010000, VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_MINMAX_BIT_EXT.valueOf(), VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_MINMAX_BIT_EXT.toString() + " has an unexpected value.");
        assertEquals(0x01000000, VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_FRAGMENT_DENSITY_MAP_BIT_EXT.valueOf(), VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_FRAGMENT_DENSITY_MAP_BIT_EXT.toString() + " has an unexpected value.");
        assertEquals(VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_TRANSFER_SRC_BIT.valueOf(), VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_TRANSFER_SRC_BIT_KHR.valueOf(), VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_TRANSFER_SRC_BIT_KHR.toString() + " has an unexpected value.");
        assertEquals(VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_TRANSFER_DST_BIT.valueOf(), VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_TRANSFER_DST_BIT_KHR.valueOf(), VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_TRANSFER_DST_BIT_KHR.toString() + " has an unexpected value.");
        assertEquals(VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_MIDPOINT_CHROMA_SAMPLES_BIT.valueOf(), VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_MIDPOINT_CHROMA_SAMPLES_BIT_KHR.valueOf(), VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_MIDPOINT_CHROMA_SAMPLES_BIT_KHR.toString() + " has an unexpected value.");
        assertEquals(VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_BIT.valueOf(), VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_BIT_KHR.valueOf(), VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_LINEAR_FILTER_BIT_KHR.toString() + " has an unexpected value.");
        assertEquals(VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER_BIT.valueOf(), VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER_BIT_KHR.valueOf(), VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_SEPARATE_RECONSTRUCTION_FILTER_BIT_KHR.toString() + " has an unexpected value.");
        assertEquals(VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_BIT.valueOf(), VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_BIT_KHR.valueOf(), VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_BIT_KHR.toString() + " has an unexpected value.");
        assertEquals(VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_BIT.valueOf(), VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_BIT_KHR.valueOf(), VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_SAMPLED_IMAGE_YCBCR_CONVERSION_CHROMA_RECONSTRUCTION_EXPLICIT_FORCEABLE_BIT_KHR.toString() + " has an unexpected value.");
        assertEquals(VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_DISJOINT_BIT.valueOf(), VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_DISJOINT_BIT_KHR.valueOf(), VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_DISJOINT_BIT_KHR.toString() + " has an unexpected value.");
        assertEquals(VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_COSITED_CHROMA_SAMPLES_BIT.valueOf(), VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_COSITED_CHROMA_SAMPLES_BIT_KHR.valueOf(), VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_COSITED_CHROMA_SAMPLES_BIT_KHR.toString() + " has an unexpected value.");
        assertEquals(VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_IMG.valueOf(), VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_EXT.valueOf(), VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_CUBIC_BIT_EXT.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_FLAG_BITS_MAX_ENUM.valueOf(), VkFormatFeatureFlagBits.VK_FORMAT_FEATURE_FLAG_BITS_MAX_ENUM.toString() + " has an unexpected value.");
    }
}
