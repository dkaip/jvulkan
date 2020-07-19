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

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkFormat;

class VkFormatTest
{
    @Test
    void testNumberOfElements()
    {
        VkFormat[] values = VkFormat.values();
        assertEquals(265, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }


    @Test
    void testValues()
    {
        assertEquals(0, VkFormat.VK_FORMAT_UNDEFINED.valueOf(), VkFormat.VK_FORMAT_UNDEFINED.toString() + " has an unexpected value.");
        assertEquals(1, VkFormat.VK_FORMAT_R4G4_UNORM_PACK8.valueOf(), VkFormat.VK_FORMAT_R4G4_UNORM_PACK8.toString() + " has an unexpected value.");
        assertEquals(2, VkFormat.VK_FORMAT_R4G4B4A4_UNORM_PACK16.valueOf(), VkFormat.VK_FORMAT_R4G4B4A4_UNORM_PACK16.toString() + " has an unexpected value.");
        assertEquals(3, VkFormat.VK_FORMAT_B4G4R4A4_UNORM_PACK16.valueOf(), VkFormat.VK_FORMAT_B4G4R4A4_UNORM_PACK16.toString() + " has an unexpected value.");
        assertEquals(4, VkFormat.VK_FORMAT_R5G6B5_UNORM_PACK16.valueOf(), VkFormat.VK_FORMAT_R5G6B5_UNORM_PACK16.toString() + " has an unexpected value.");
        assertEquals(5, VkFormat.VK_FORMAT_B5G6R5_UNORM_PACK16.valueOf(), VkFormat.VK_FORMAT_B5G6R5_UNORM_PACK16.toString() + " has an unexpected value.");
        assertEquals(6, VkFormat.VK_FORMAT_R5G5B5A1_UNORM_PACK16.valueOf(), VkFormat.VK_FORMAT_R5G5B5A1_UNORM_PACK16.toString() + " has an unexpected value.");
        assertEquals(7, VkFormat.VK_FORMAT_B5G5R5A1_UNORM_PACK16.valueOf(), VkFormat.VK_FORMAT_B5G5R5A1_UNORM_PACK16.toString() + " has an unexpected value.");
        assertEquals(8, VkFormat.VK_FORMAT_A1R5G5B5_UNORM_PACK16.valueOf(), VkFormat.VK_FORMAT_A1R5G5B5_UNORM_PACK16.toString() + " has an unexpected value.");
        assertEquals(9, VkFormat.VK_FORMAT_R8_UNORM.valueOf(), VkFormat.VK_FORMAT_R8_UNORM.toString() + " has an unexpected value.");
        assertEquals(10, VkFormat.VK_FORMAT_R8_SNORM.valueOf(), VkFormat.VK_FORMAT_R8_SNORM.toString() + " has an unexpected value.");
        assertEquals(11, VkFormat.VK_FORMAT_R8_USCALED.valueOf(), VkFormat.VK_FORMAT_R8_USCALED.toString() + " has an unexpected value.");
        assertEquals(12, VkFormat.VK_FORMAT_R8_SSCALED.valueOf(), VkFormat.VK_FORMAT_R8_SSCALED.toString() + " has an unexpected value.");
        assertEquals(13, VkFormat.VK_FORMAT_R8_UINT.valueOf(), VkFormat.VK_FORMAT_R8_UINT.toString() + " has an unexpected value.");
        assertEquals(14, VkFormat.VK_FORMAT_R8_SINT.valueOf(), VkFormat.VK_FORMAT_R8_SINT.toString() + " has an unexpected value.");
        assertEquals(15, VkFormat.VK_FORMAT_R8_SRGB.valueOf(), VkFormat.VK_FORMAT_R8_SRGB.toString() + " has an unexpected value.");
        assertEquals(16, VkFormat.VK_FORMAT_R8G8_UNORM.valueOf(), VkFormat.VK_FORMAT_R8G8_UNORM.toString() + " has an unexpected value.");
        assertEquals(17, VkFormat.VK_FORMAT_R8G8_SNORM.valueOf(), VkFormat.VK_FORMAT_R8G8_SNORM.toString() + " has an unexpected value.");
        assertEquals(18, VkFormat.VK_FORMAT_R8G8_USCALED.valueOf(), VkFormat.VK_FORMAT_R8G8_USCALED.toString() + " has an unexpected value.");
        assertEquals(19, VkFormat.VK_FORMAT_R8G8_SSCALED.valueOf(), VkFormat.VK_FORMAT_R8G8_SSCALED.toString() + " has an unexpected value.");
        assertEquals(20, VkFormat.VK_FORMAT_R8G8_UINT.valueOf(), VkFormat.VK_FORMAT_R8G8_UINT.toString() + " has an unexpected value.");
        assertEquals(21, VkFormat.VK_FORMAT_R8G8_SINT.valueOf(), VkFormat.VK_FORMAT_R8G8_SINT.toString() + " has an unexpected value.");
        assertEquals(22, VkFormat.VK_FORMAT_R8G8_SRGB.valueOf(), VkFormat.VK_FORMAT_R8G8_SRGB.toString() + " has an unexpected value.");
        assertEquals(23, VkFormat.VK_FORMAT_R8G8B8_UNORM.valueOf(), VkFormat.VK_FORMAT_R8G8B8_UNORM.toString() + " has an unexpected value.");
        assertEquals(24, VkFormat.VK_FORMAT_R8G8B8_SNORM.valueOf(), VkFormat.VK_FORMAT_R8G8B8_SNORM.toString() + " has an unexpected value.");
        assertEquals(25, VkFormat.VK_FORMAT_R8G8B8_USCALED.valueOf(), VkFormat.VK_FORMAT_R8G8B8_USCALED.toString() + " has an unexpected value.");
        assertEquals(26, VkFormat.VK_FORMAT_R8G8B8_SSCALED.valueOf(), VkFormat.VK_FORMAT_R8G8B8_SSCALED.toString() + " has an unexpected value.");
        assertEquals(27, VkFormat.VK_FORMAT_R8G8B8_UINT.valueOf(), VkFormat.VK_FORMAT_R8G8B8_UINT.toString() + " has an unexpected value.");
        assertEquals(28, VkFormat.VK_FORMAT_R8G8B8_SINT.valueOf(), VkFormat.VK_FORMAT_R8G8B8_SINT.toString() + " has an unexpected value.");
        assertEquals(29, VkFormat.VK_FORMAT_R8G8B8_SRGB.valueOf(), VkFormat.VK_FORMAT_R8G8B8_SRGB.toString() + " has an unexpected value.");
        assertEquals(30, VkFormat.VK_FORMAT_B8G8R8_UNORM.valueOf(), VkFormat.VK_FORMAT_B8G8R8_UNORM.toString() + " has an unexpected value.");
        assertEquals(31, VkFormat.VK_FORMAT_B8G8R8_SNORM.valueOf(), VkFormat.VK_FORMAT_B8G8R8_SNORM.toString() + " has an unexpected value.");
        assertEquals(32, VkFormat.VK_FORMAT_B8G8R8_USCALED.valueOf(), VkFormat.VK_FORMAT_B8G8R8_USCALED.toString() + " has an unexpected value.");
        assertEquals(33, VkFormat.VK_FORMAT_B8G8R8_SSCALED.valueOf(), VkFormat.VK_FORMAT_B8G8R8_SSCALED.toString() + " has an unexpected value.");
        assertEquals(34, VkFormat.VK_FORMAT_B8G8R8_UINT.valueOf(), VkFormat.VK_FORMAT_B8G8R8_UINT.toString() + " has an unexpected value.");
        assertEquals(35, VkFormat.VK_FORMAT_B8G8R8_SINT.valueOf(), VkFormat.VK_FORMAT_B8G8R8_SINT.toString() + " has an unexpected value.");
        assertEquals(36, VkFormat.VK_FORMAT_B8G8R8_SRGB.valueOf(), VkFormat.VK_FORMAT_B8G8R8_SRGB.toString() + " has an unexpected value.");
        assertEquals(37, VkFormat.VK_FORMAT_R8G8B8A8_UNORM.valueOf(), VkFormat.VK_FORMAT_R8G8B8A8_UNORM.toString() + " has an unexpected value.");
        assertEquals(38, VkFormat.VK_FORMAT_R8G8B8A8_SNORM.valueOf(), VkFormat.VK_FORMAT_R8G8B8A8_SNORM.toString() + " has an unexpected value.");
        assertEquals(39, VkFormat.VK_FORMAT_R8G8B8A8_USCALED.valueOf(), VkFormat.VK_FORMAT_R8G8B8A8_USCALED.toString() + " has an unexpected value.");
        assertEquals(40, VkFormat.VK_FORMAT_R8G8B8A8_SSCALED.valueOf(), VkFormat.VK_FORMAT_R8G8B8A8_SSCALED.toString() + " has an unexpected value.");
        assertEquals(41, VkFormat.VK_FORMAT_R8G8B8A8_UINT.valueOf(), VkFormat.VK_FORMAT_R8G8B8A8_UINT.toString() + " has an unexpected value.");
        assertEquals(42, VkFormat.VK_FORMAT_R8G8B8A8_SINT.valueOf(), VkFormat.VK_FORMAT_R8G8B8A8_SINT.toString() + " has an unexpected value.");
        assertEquals(43, VkFormat.VK_FORMAT_R8G8B8A8_SRGB.valueOf(), VkFormat.VK_FORMAT_R8G8B8A8_SRGB.toString() + " has an unexpected value.");
        assertEquals(44, VkFormat.VK_FORMAT_B8G8R8A8_UNORM.valueOf(), VkFormat.VK_FORMAT_B8G8R8A8_UNORM.toString() + " has an unexpected value.");
        assertEquals(45, VkFormat.VK_FORMAT_B8G8R8A8_SNORM.valueOf(), VkFormat.VK_FORMAT_B8G8R8A8_SNORM.toString() + " has an unexpected value.");
        assertEquals(46, VkFormat.VK_FORMAT_B8G8R8A8_USCALED.valueOf(), VkFormat.VK_FORMAT_B8G8R8A8_USCALED.toString() + " has an unexpected value.");
        assertEquals(47, VkFormat.VK_FORMAT_B8G8R8A8_SSCALED.valueOf(), VkFormat.VK_FORMAT_B8G8R8A8_SSCALED.toString() + " has an unexpected value.");
        assertEquals(48, VkFormat.VK_FORMAT_B8G8R8A8_UINT.valueOf(), VkFormat.VK_FORMAT_B8G8R8A8_UINT.toString() + " has an unexpected value.");
        assertEquals(49, VkFormat.VK_FORMAT_B8G8R8A8_SINT.valueOf(), VkFormat.VK_FORMAT_B8G8R8A8_SINT.toString() + " has an unexpected value.");
        assertEquals(50, VkFormat.VK_FORMAT_B8G8R8A8_SRGB.valueOf(), VkFormat.VK_FORMAT_B8G8R8A8_SRGB.toString() + " has an unexpected value.");
        assertEquals(51, VkFormat.VK_FORMAT_A8B8G8R8_UNORM_PACK32.valueOf(), VkFormat.VK_FORMAT_A8B8G8R8_UNORM_PACK32.toString() + " has an unexpected value.");
        assertEquals(52, VkFormat.VK_FORMAT_A8B8G8R8_SNORM_PACK32.valueOf(), VkFormat.VK_FORMAT_A8B8G8R8_SNORM_PACK32.toString() + " has an unexpected value.");
        assertEquals(53, VkFormat.VK_FORMAT_A8B8G8R8_USCALED_PACK32.valueOf(), VkFormat.VK_FORMAT_A8B8G8R8_USCALED_PACK32.toString() + " has an unexpected value.");
        assertEquals(54, VkFormat.VK_FORMAT_A8B8G8R8_SSCALED_PACK32.valueOf(), VkFormat.VK_FORMAT_A8B8G8R8_SSCALED_PACK32.toString() + " has an unexpected value.");
        assertEquals(55, VkFormat.VK_FORMAT_A8B8G8R8_UINT_PACK32.valueOf(), VkFormat.VK_FORMAT_A8B8G8R8_UINT_PACK32.toString() + " has an unexpected value.");
        assertEquals(56, VkFormat.VK_FORMAT_A8B8G8R8_SINT_PACK32.valueOf(), VkFormat.VK_FORMAT_A8B8G8R8_SINT_PACK32.toString() + " has an unexpected value.");
        assertEquals(57, VkFormat.VK_FORMAT_A8B8G8R8_SRGB_PACK32.valueOf(), VkFormat.VK_FORMAT_A8B8G8R8_SRGB_PACK32.toString() + " has an unexpected value.");
        assertEquals(58, VkFormat.VK_FORMAT_A2R10G10B10_UNORM_PACK32.valueOf(), VkFormat.VK_FORMAT_A2R10G10B10_UNORM_PACK32.toString() + " has an unexpected value.");
        assertEquals(59, VkFormat.VK_FORMAT_A2R10G10B10_SNORM_PACK32.valueOf(), VkFormat.VK_FORMAT_A2R10G10B10_SNORM_PACK32.toString() + " has an unexpected value.");
        assertEquals(60, VkFormat.VK_FORMAT_A2R10G10B10_USCALED_PACK32.valueOf(), VkFormat.VK_FORMAT_A2R10G10B10_USCALED_PACK32.toString() + " has an unexpected value.");
        assertEquals(61, VkFormat.VK_FORMAT_A2R10G10B10_SSCALED_PACK32.valueOf(), VkFormat.VK_FORMAT_A2R10G10B10_SSCALED_PACK32.toString() + " has an unexpected value.");
        assertEquals(62, VkFormat.VK_FORMAT_A2R10G10B10_UINT_PACK32.valueOf(), VkFormat.VK_FORMAT_A2R10G10B10_UINT_PACK32.toString() + " has an unexpected value.");
        assertEquals(63, VkFormat.VK_FORMAT_A2R10G10B10_SINT_PACK32.valueOf(), VkFormat.VK_FORMAT_A2R10G10B10_SINT_PACK32.toString() + " has an unexpected value.");
        assertEquals(64, VkFormat.VK_FORMAT_A2B10G10R10_UNORM_PACK32.valueOf(), VkFormat.VK_FORMAT_A2B10G10R10_UNORM_PACK32.toString() + " has an unexpected value.");
        assertEquals(65, VkFormat.VK_FORMAT_A2B10G10R10_SNORM_PACK32.valueOf(), VkFormat.VK_FORMAT_A2B10G10R10_SNORM_PACK32.toString() + " has an unexpected value.");
        assertEquals(66, VkFormat.VK_FORMAT_A2B10G10R10_USCALED_PACK32.valueOf(), VkFormat.VK_FORMAT_A2B10G10R10_USCALED_PACK32.toString() + " has an unexpected value.");
        assertEquals(67, VkFormat.VK_FORMAT_A2B10G10R10_SSCALED_PACK32.valueOf(), VkFormat.VK_FORMAT_A2B10G10R10_SSCALED_PACK32.toString() + " has an unexpected value.");
        assertEquals(68, VkFormat.VK_FORMAT_A2B10G10R10_UINT_PACK32.valueOf(), VkFormat.VK_FORMAT_A2B10G10R10_UINT_PACK32.toString() + " has an unexpected value.");
        assertEquals(69, VkFormat.VK_FORMAT_A2B10G10R10_SINT_PACK32.valueOf(), VkFormat.VK_FORMAT_A2B10G10R10_SINT_PACK32.toString() + " has an unexpected value.");
        assertEquals(70, VkFormat.VK_FORMAT_R16_UNORM.valueOf(), VkFormat.VK_FORMAT_R16_UNORM.toString() + " has an unexpected value.");
        assertEquals(71, VkFormat.VK_FORMAT_R16_SNORM.valueOf(), VkFormat.VK_FORMAT_R16_SNORM.toString() + " has an unexpected value.");
        assertEquals(72, VkFormat.VK_FORMAT_R16_USCALED.valueOf(), VkFormat.VK_FORMAT_R16_USCALED.toString() + " has an unexpected value.");
        assertEquals(73, VkFormat.VK_FORMAT_R16_SSCALED.valueOf(), VkFormat.VK_FORMAT_R16_SSCALED.toString() + " has an unexpected value.");
        assertEquals(74, VkFormat.VK_FORMAT_R16_UINT.valueOf(), VkFormat.VK_FORMAT_R16_UINT.toString() + " has an unexpected value.");
        assertEquals(75, VkFormat.VK_FORMAT_R16_SINT.valueOf(), VkFormat.VK_FORMAT_R16_SINT.toString() + " has an unexpected value.");
        assertEquals(76, VkFormat.VK_FORMAT_R16_SFLOAT.valueOf(), VkFormat.VK_FORMAT_R16_SFLOAT.toString() + " has an unexpected value.");
        assertEquals(77, VkFormat.VK_FORMAT_R16G16_UNORM.valueOf(), VkFormat.VK_FORMAT_R16G16_UNORM.toString() + " has an unexpected value.");
        assertEquals(78, VkFormat.VK_FORMAT_R16G16_SNORM.valueOf(), VkFormat.VK_FORMAT_R16G16_SNORM.toString() + " has an unexpected value.");
        assertEquals(79, VkFormat.VK_FORMAT_R16G16_USCALED.valueOf(), VkFormat.VK_FORMAT_R16G16_USCALED.toString() + " has an unexpected value.");
        assertEquals(80, VkFormat.VK_FORMAT_R16G16_SSCALED.valueOf(), VkFormat.VK_FORMAT_R16G16_SSCALED.toString() + " has an unexpected value.");
        assertEquals(81, VkFormat.VK_FORMAT_R16G16_UINT.valueOf(), VkFormat.VK_FORMAT_R16G16_UINT.toString() + " has an unexpected value.");
        assertEquals(82, VkFormat.VK_FORMAT_R16G16_SINT.valueOf(), VkFormat.VK_FORMAT_R16G16_SINT.toString() + " has an unexpected value.");
        assertEquals(83, VkFormat.VK_FORMAT_R16G16_SFLOAT.valueOf(), VkFormat.VK_FORMAT_R16G16_SFLOAT.toString() + " has an unexpected value.");
        assertEquals(84, VkFormat.VK_FORMAT_R16G16B16_UNORM.valueOf(), VkFormat.VK_FORMAT_R16G16B16_UNORM.toString() + " has an unexpected value.");
        assertEquals(85, VkFormat.VK_FORMAT_R16G16B16_SNORM.valueOf(), VkFormat.VK_FORMAT_R16G16B16_SNORM.toString() + " has an unexpected value.");
        assertEquals(86, VkFormat.VK_FORMAT_R16G16B16_USCALED.valueOf(), VkFormat.VK_FORMAT_R16G16B16_USCALED.toString() + " has an unexpected value.");
        assertEquals(87, VkFormat.VK_FORMAT_R16G16B16_SSCALED.valueOf(), VkFormat.VK_FORMAT_R16G16B16_SSCALED.toString() + " has an unexpected value.");
        assertEquals(88, VkFormat.VK_FORMAT_R16G16B16_UINT.valueOf(), VkFormat.VK_FORMAT_R16G16B16_UINT.toString() + " has an unexpected value.");
        assertEquals(89, VkFormat.VK_FORMAT_R16G16B16_SINT.valueOf(), VkFormat.VK_FORMAT_R16G16B16_SINT.toString() + " has an unexpected value.");
        assertEquals(90, VkFormat.VK_FORMAT_R16G16B16_SFLOAT.valueOf(), VkFormat.VK_FORMAT_R16G16B16_SFLOAT.toString() + " has an unexpected value.");
        assertEquals(91, VkFormat.VK_FORMAT_R16G16B16A16_UNORM.valueOf(), VkFormat.VK_FORMAT_R16G16B16A16_UNORM.toString() + " has an unexpected value.");
        assertEquals(92, VkFormat.VK_FORMAT_R16G16B16A16_SNORM.valueOf(), VkFormat.VK_FORMAT_R16G16B16A16_SNORM.toString() + " has an unexpected value.");
        assertEquals(93, VkFormat.VK_FORMAT_R16G16B16A16_USCALED.valueOf(), VkFormat.VK_FORMAT_R16G16B16A16_USCALED.toString() + " has an unexpected value.");
        assertEquals(94, VkFormat.VK_FORMAT_R16G16B16A16_SSCALED.valueOf(), VkFormat.VK_FORMAT_R16G16B16A16_SSCALED.toString() + " has an unexpected value.");
        assertEquals(95, VkFormat.VK_FORMAT_R16G16B16A16_UINT.valueOf(), VkFormat.VK_FORMAT_R16G16B16A16_UINT.toString() + " has an unexpected value.");
        assertEquals(96, VkFormat.VK_FORMAT_R16G16B16A16_SINT.valueOf(), VkFormat.VK_FORMAT_R16G16B16A16_SINT.toString() + " has an unexpected value.");
        assertEquals(97, VkFormat.VK_FORMAT_R16G16B16A16_SFLOAT.valueOf(), VkFormat.VK_FORMAT_R16G16B16A16_SFLOAT.toString() + " has an unexpected value.");
        assertEquals(98, VkFormat.VK_FORMAT_R32_UINT.valueOf(), VkFormat.VK_FORMAT_R32_UINT.toString() + " has an unexpected value.");
        assertEquals(99, VkFormat.VK_FORMAT_R32_SINT.valueOf(), VkFormat.VK_FORMAT_R32_SINT.toString() + " has an unexpected value.");
        assertEquals(100, VkFormat.VK_FORMAT_R32_SFLOAT.valueOf(), VkFormat.VK_FORMAT_R32_SFLOAT.toString() + " has an unexpected value.");
        assertEquals(101, VkFormat.VK_FORMAT_R32G32_UINT.valueOf(), VkFormat.VK_FORMAT_R32G32_UINT.toString() + " has an unexpected value.");
        assertEquals(102, VkFormat.VK_FORMAT_R32G32_SINT.valueOf(), VkFormat.VK_FORMAT_R32G32_SINT.toString() + " has an unexpected value.");
        assertEquals(103, VkFormat.VK_FORMAT_R32G32_SFLOAT.valueOf(), VkFormat.VK_FORMAT_R32G32_SFLOAT.toString() + " has an unexpected value.");
        assertEquals(104, VkFormat.VK_FORMAT_R32G32B32_UINT.valueOf(), VkFormat.VK_FORMAT_R32G32B32_UINT.toString() + " has an unexpected value.");
        assertEquals(105, VkFormat.VK_FORMAT_R32G32B32_SINT.valueOf(), VkFormat.VK_FORMAT_R32G32B32_SINT.toString() + " has an unexpected value.");
        assertEquals(106, VkFormat.VK_FORMAT_R32G32B32_SFLOAT.valueOf(), VkFormat.VK_FORMAT_R32G32B32_SFLOAT.toString() + " has an unexpected value.");
        assertEquals(107, VkFormat.VK_FORMAT_R32G32B32A32_UINT.valueOf(), VkFormat.VK_FORMAT_R32G32B32A32_UINT.toString() + " has an unexpected value.");
        assertEquals(108, VkFormat.VK_FORMAT_R32G32B32A32_SINT.valueOf(), VkFormat.VK_FORMAT_R32G32B32A32_SINT.toString() + " has an unexpected value.");
        assertEquals(109, VkFormat.VK_FORMAT_R32G32B32A32_SFLOAT.valueOf(), VkFormat.VK_FORMAT_R32G32B32A32_SFLOAT.toString() + " has an unexpected value.");
        assertEquals(110, VkFormat.VK_FORMAT_R64_UINT.valueOf(), VkFormat.VK_FORMAT_R64_UINT.toString() + " has an unexpected value.");
        assertEquals(111, VkFormat.VK_FORMAT_R64_SINT.valueOf(), VkFormat.VK_FORMAT_R64_SINT.toString() + " has an unexpected value.");
        assertEquals(112, VkFormat.VK_FORMAT_R64_SFLOAT.valueOf(), VkFormat.VK_FORMAT_R64_SFLOAT.toString() + " has an unexpected value.");
        assertEquals(113, VkFormat.VK_FORMAT_R64G64_UINT.valueOf(), VkFormat.VK_FORMAT_R64G64_UINT.toString() + " has an unexpected value.");
        assertEquals(114, VkFormat.VK_FORMAT_R64G64_SINT.valueOf(), VkFormat.VK_FORMAT_R64G64_SINT.toString() + " has an unexpected value.");
        assertEquals(115, VkFormat.VK_FORMAT_R64G64_SFLOAT.valueOf(), VkFormat.VK_FORMAT_R64G64_SFLOAT.toString() + " has an unexpected value.");
        assertEquals(116, VkFormat.VK_FORMAT_R64G64B64_UINT.valueOf(), VkFormat.VK_FORMAT_R64G64B64_UINT.toString() + " has an unexpected value.");
        assertEquals(117, VkFormat.VK_FORMAT_R64G64B64_SINT.valueOf(), VkFormat.VK_FORMAT_R64G64B64_SINT.toString() + " has an unexpected value.");
        assertEquals(118, VkFormat.VK_FORMAT_R64G64B64_SFLOAT.valueOf(), VkFormat.VK_FORMAT_R64G64B64_SFLOAT.toString() + " has an unexpected value.");
        assertEquals(119, VkFormat.VK_FORMAT_R64G64B64A64_UINT.valueOf(), VkFormat.VK_FORMAT_R64G64B64A64_UINT.toString() + " has an unexpected value.");
        assertEquals(120, VkFormat.VK_FORMAT_R64G64B64A64_SINT.valueOf(), VkFormat.VK_FORMAT_R64G64B64A64_SINT.toString() + " has an unexpected value.");
        assertEquals(121, VkFormat.VK_FORMAT_R64G64B64A64_SFLOAT.valueOf(), VkFormat.VK_FORMAT_R64G64B64A64_SFLOAT.toString() + " has an unexpected value.");
        assertEquals(122, VkFormat.VK_FORMAT_B10G11R11_UFLOAT_PACK32.valueOf(), VkFormat.VK_FORMAT_B10G11R11_UFLOAT_PACK32.toString() + " has an unexpected value.");
        assertEquals(123, VkFormat.VK_FORMAT_E5B9G9R9_UFLOAT_PACK32.valueOf(), VkFormat.VK_FORMAT_E5B9G9R9_UFLOAT_PACK32.toString() + " has an unexpected value.");
        assertEquals(124, VkFormat.VK_FORMAT_D16_UNORM.valueOf(), VkFormat.VK_FORMAT_D16_UNORM.toString() + " has an unexpected value.");
        assertEquals(125, VkFormat.VK_FORMAT_X8_D24_UNORM_PACK32.valueOf(), VkFormat.VK_FORMAT_X8_D24_UNORM_PACK32.toString() + " has an unexpected value.");
        assertEquals(126, VkFormat.VK_FORMAT_D32_SFLOAT.valueOf(), VkFormat.VK_FORMAT_D32_SFLOAT.toString() + " has an unexpected value.");
        assertEquals(127, VkFormat.VK_FORMAT_S8_UINT.valueOf(), VkFormat.VK_FORMAT_S8_UINT.toString() + " has an unexpected value.");
        assertEquals(128, VkFormat.VK_FORMAT_D16_UNORM_S8_UINT.valueOf(), VkFormat.VK_FORMAT_D16_UNORM_S8_UINT.toString() + " has an unexpected value.");
        assertEquals(129, VkFormat.VK_FORMAT_D24_UNORM_S8_UINT.valueOf(), VkFormat.VK_FORMAT_D24_UNORM_S8_UINT.toString() + " has an unexpected value.");
        assertEquals(130, VkFormat.VK_FORMAT_D32_SFLOAT_S8_UINT.valueOf(), VkFormat.VK_FORMAT_D32_SFLOAT_S8_UINT.toString() + " has an unexpected value.");
        assertEquals(131, VkFormat.VK_FORMAT_BC1_RGB_UNORM_BLOCK.valueOf(), VkFormat.VK_FORMAT_BC1_RGB_UNORM_BLOCK.toString() + " has an unexpected value.");
        assertEquals(132, VkFormat.VK_FORMAT_BC1_RGB_SRGB_BLOCK.valueOf(), VkFormat.VK_FORMAT_BC1_RGB_SRGB_BLOCK.toString() + " has an unexpected value.");
        assertEquals(133, VkFormat.VK_FORMAT_BC1_RGBA_UNORM_BLOCK.valueOf(), VkFormat.VK_FORMAT_BC1_RGBA_UNORM_BLOCK.toString() + " has an unexpected value.");
        assertEquals(134, VkFormat.VK_FORMAT_BC1_RGBA_SRGB_BLOCK.valueOf(), VkFormat.VK_FORMAT_BC1_RGBA_SRGB_BLOCK.toString() + " has an unexpected value.");
        assertEquals(135, VkFormat.VK_FORMAT_BC2_UNORM_BLOCK.valueOf(), VkFormat.VK_FORMAT_BC2_UNORM_BLOCK.toString() + " has an unexpected value.");
        assertEquals(136, VkFormat.VK_FORMAT_BC2_SRGB_BLOCK.valueOf(), VkFormat.VK_FORMAT_BC2_SRGB_BLOCK.toString() + " has an unexpected value.");
        assertEquals(137, VkFormat.VK_FORMAT_BC3_UNORM_BLOCK.valueOf(), VkFormat.VK_FORMAT_BC3_UNORM_BLOCK.toString() + " has an unexpected value.");
        assertEquals(138, VkFormat.VK_FORMAT_BC3_SRGB_BLOCK.valueOf(), VkFormat.VK_FORMAT_BC3_SRGB_BLOCK.toString() + " has an unexpected value.");
        assertEquals(139, VkFormat.VK_FORMAT_BC4_UNORM_BLOCK.valueOf(), VkFormat.VK_FORMAT_BC4_UNORM_BLOCK.toString() + " has an unexpected value.");
        assertEquals(140, VkFormat.VK_FORMAT_BC4_SNORM_BLOCK.valueOf(), VkFormat.VK_FORMAT_BC4_SNORM_BLOCK.toString() + " has an unexpected value.");
        assertEquals(141, VkFormat.VK_FORMAT_BC5_UNORM_BLOCK.valueOf(), VkFormat.VK_FORMAT_BC5_UNORM_BLOCK.toString() + " has an unexpected value.");
        assertEquals(142, VkFormat.VK_FORMAT_BC5_SNORM_BLOCK.valueOf(), VkFormat.VK_FORMAT_BC5_SNORM_BLOCK.toString() + " has an unexpected value.");
        assertEquals(143, VkFormat.VK_FORMAT_BC6H_UFLOAT_BLOCK.valueOf(), VkFormat.VK_FORMAT_BC6H_UFLOAT_BLOCK.toString() + " has an unexpected value.");
        assertEquals(144, VkFormat.VK_FORMAT_BC6H_SFLOAT_BLOCK.valueOf(), VkFormat.VK_FORMAT_BC6H_SFLOAT_BLOCK.toString() + " has an unexpected value.");
        assertEquals(145, VkFormat.VK_FORMAT_BC7_UNORM_BLOCK.valueOf(), VkFormat.VK_FORMAT_BC7_UNORM_BLOCK.toString() + " has an unexpected value.");
        assertEquals(146, VkFormat.VK_FORMAT_BC7_SRGB_BLOCK.valueOf(), VkFormat.VK_FORMAT_BC7_SRGB_BLOCK.toString() + " has an unexpected value.");
        assertEquals(147, VkFormat.VK_FORMAT_ETC2_R8G8B8_UNORM_BLOCK.valueOf(), VkFormat.VK_FORMAT_ETC2_R8G8B8_UNORM_BLOCK.toString() + " has an unexpected value.");
        assertEquals(148, VkFormat.VK_FORMAT_ETC2_R8G8B8_SRGB_BLOCK.valueOf(), VkFormat.VK_FORMAT_ETC2_R8G8B8_SRGB_BLOCK.toString() + " has an unexpected value.");
        assertEquals(149, VkFormat.VK_FORMAT_ETC2_R8G8B8A1_UNORM_BLOCK.valueOf(), VkFormat.VK_FORMAT_ETC2_R8G8B8A1_UNORM_BLOCK.toString() + " has an unexpected value.");
        assertEquals(150, VkFormat.VK_FORMAT_ETC2_R8G8B8A1_SRGB_BLOCK.valueOf(), VkFormat.VK_FORMAT_ETC2_R8G8B8A1_SRGB_BLOCK.toString() + " has an unexpected value.");
        assertEquals(151, VkFormat.VK_FORMAT_ETC2_R8G8B8A8_UNORM_BLOCK.valueOf(), VkFormat.VK_FORMAT_ETC2_R8G8B8A8_UNORM_BLOCK.toString() + " has an unexpected value.");
        assertEquals(152, VkFormat.VK_FORMAT_ETC2_R8G8B8A8_SRGB_BLOCK.valueOf(), VkFormat.VK_FORMAT_ETC2_R8G8B8A8_SRGB_BLOCK.toString() + " has an unexpected value.");
        assertEquals(153, VkFormat.VK_FORMAT_EAC_R11_UNORM_BLOCK.valueOf(), VkFormat.VK_FORMAT_EAC_R11_UNORM_BLOCK.toString() + " has an unexpected value.");
        assertEquals(154, VkFormat.VK_FORMAT_EAC_R11_SNORM_BLOCK.valueOf(), VkFormat.VK_FORMAT_EAC_R11_SNORM_BLOCK.toString() + " has an unexpected value.");
        assertEquals(155, VkFormat.VK_FORMAT_EAC_R11G11_UNORM_BLOCK.valueOf(), VkFormat.VK_FORMAT_EAC_R11G11_UNORM_BLOCK.toString() + " has an unexpected value.");
        assertEquals(156, VkFormat.VK_FORMAT_EAC_R11G11_SNORM_BLOCK.valueOf(), VkFormat.VK_FORMAT_EAC_R11G11_SNORM_BLOCK.toString() + " has an unexpected value.");
        assertEquals(157, VkFormat.VK_FORMAT_ASTC_4x4_UNORM_BLOCK.valueOf(), VkFormat.VK_FORMAT_ASTC_4x4_UNORM_BLOCK.toString() + " has an unexpected value.");
        assertEquals(158, VkFormat.VK_FORMAT_ASTC_4x4_SRGB_BLOCK.valueOf(), VkFormat.VK_FORMAT_ASTC_4x4_SRGB_BLOCK.toString() + " has an unexpected value.");
        assertEquals(159, VkFormat.VK_FORMAT_ASTC_5x4_UNORM_BLOCK.valueOf(), VkFormat.VK_FORMAT_ASTC_5x4_UNORM_BLOCK.toString() + " has an unexpected value.");
        assertEquals(160, VkFormat.VK_FORMAT_ASTC_5x4_SRGB_BLOCK.valueOf(), VkFormat.VK_FORMAT_ASTC_5x4_SRGB_BLOCK.toString() + " has an unexpected value.");
        assertEquals(161, VkFormat.VK_FORMAT_ASTC_5x5_UNORM_BLOCK.valueOf(), VkFormat.VK_FORMAT_ASTC_5x5_UNORM_BLOCK.toString() + " has an unexpected value.");
        assertEquals(162, VkFormat.VK_FORMAT_ASTC_5x5_SRGB_BLOCK.valueOf(), VkFormat.VK_FORMAT_ASTC_5x5_SRGB_BLOCK.toString() + " has an unexpected value.");
        assertEquals(163, VkFormat.VK_FORMAT_ASTC_6x5_UNORM_BLOCK.valueOf(), VkFormat.VK_FORMAT_ASTC_6x5_UNORM_BLOCK.toString() + " has an unexpected value.");
        assertEquals(164, VkFormat.VK_FORMAT_ASTC_6x5_SRGB_BLOCK.valueOf(), VkFormat.VK_FORMAT_ASTC_6x5_SRGB_BLOCK.toString() + " has an unexpected value.");
        assertEquals(165, VkFormat.VK_FORMAT_ASTC_6x6_UNORM_BLOCK.valueOf(), VkFormat.VK_FORMAT_ASTC_6x6_UNORM_BLOCK.toString() + " has an unexpected value.");
        assertEquals(166, VkFormat.VK_FORMAT_ASTC_6x6_SRGB_BLOCK.valueOf(), VkFormat.VK_FORMAT_ASTC_6x6_SRGB_BLOCK.toString() + " has an unexpected value.");
        assertEquals(167, VkFormat.VK_FORMAT_ASTC_8x5_UNORM_BLOCK.valueOf(), VkFormat.VK_FORMAT_ASTC_8x5_UNORM_BLOCK.toString() + " has an unexpected value.");
        assertEquals(168, VkFormat.VK_FORMAT_ASTC_8x5_SRGB_BLOCK.valueOf(), VkFormat.VK_FORMAT_ASTC_8x5_SRGB_BLOCK.toString() + " has an unexpected value.");
        assertEquals(169, VkFormat.VK_FORMAT_ASTC_8x6_UNORM_BLOCK.valueOf(), VkFormat.VK_FORMAT_ASTC_8x6_UNORM_BLOCK.toString() + " has an unexpected value.");
        assertEquals(170, VkFormat.VK_FORMAT_ASTC_8x6_SRGB_BLOCK.valueOf(), VkFormat.VK_FORMAT_ASTC_8x6_SRGB_BLOCK.toString() + " has an unexpected value.");
        assertEquals(171, VkFormat.VK_FORMAT_ASTC_8x8_UNORM_BLOCK.valueOf(), VkFormat.VK_FORMAT_ASTC_8x8_UNORM_BLOCK.toString() + " has an unexpected value.");
        assertEquals(172, VkFormat.VK_FORMAT_ASTC_8x8_SRGB_BLOCK.valueOf(), VkFormat.VK_FORMAT_ASTC_8x8_SRGB_BLOCK.toString() + " has an unexpected value.");
        assertEquals(173, VkFormat.VK_FORMAT_ASTC_10x5_UNORM_BLOCK.valueOf(), VkFormat.VK_FORMAT_ASTC_10x5_UNORM_BLOCK.toString() + " has an unexpected value.");
        assertEquals(174, VkFormat.VK_FORMAT_ASTC_10x5_SRGB_BLOCK.valueOf(), VkFormat.VK_FORMAT_ASTC_10x5_SRGB_BLOCK.toString() + " has an unexpected value.");
        assertEquals(175, VkFormat.VK_FORMAT_ASTC_10x6_UNORM_BLOCK.valueOf(), VkFormat.VK_FORMAT_ASTC_10x6_UNORM_BLOCK.toString() + " has an unexpected value.");
        assertEquals(176, VkFormat.VK_FORMAT_ASTC_10x6_SRGB_BLOCK.valueOf(), VkFormat.VK_FORMAT_ASTC_10x6_SRGB_BLOCK.toString() + " has an unexpected value.");
        assertEquals(177, VkFormat.VK_FORMAT_ASTC_10x8_UNORM_BLOCK.valueOf(), VkFormat.VK_FORMAT_ASTC_10x8_UNORM_BLOCK.toString() + " has an unexpected value.");
        assertEquals(178, VkFormat.VK_FORMAT_ASTC_10x8_SRGB_BLOCK.valueOf(), VkFormat.VK_FORMAT_ASTC_10x8_SRGB_BLOCK.toString() + " has an unexpected value.");
        assertEquals(179, VkFormat.VK_FORMAT_ASTC_10x10_UNORM_BLOCK.valueOf(), VkFormat.VK_FORMAT_ASTC_10x10_UNORM_BLOCK.toString() + " has an unexpected value.");
        assertEquals(180, VkFormat.VK_FORMAT_ASTC_10x10_SRGB_BLOCK.valueOf(), VkFormat.VK_FORMAT_ASTC_10x10_SRGB_BLOCK.toString() + " has an unexpected value.");
        assertEquals(181, VkFormat.VK_FORMAT_ASTC_12x10_UNORM_BLOCK.valueOf(), VkFormat.VK_FORMAT_ASTC_12x10_UNORM_BLOCK.toString() + " has an unexpected value.");
        assertEquals(182, VkFormat.VK_FORMAT_ASTC_12x10_SRGB_BLOCK.valueOf(), VkFormat.VK_FORMAT_ASTC_12x10_SRGB_BLOCK.toString() + " has an unexpected value.");
        assertEquals(183, VkFormat.VK_FORMAT_ASTC_12x12_UNORM_BLOCK.valueOf(), VkFormat.VK_FORMAT_ASTC_12x12_UNORM_BLOCK.toString() + " has an unexpected value.");
        assertEquals(184, VkFormat.VK_FORMAT_ASTC_12x12_SRGB_BLOCK.valueOf(), VkFormat.VK_FORMAT_ASTC_12x12_SRGB_BLOCK.toString() + " has an unexpected value.");
        assertEquals(1000156000, VkFormat.VK_FORMAT_G8B8G8R8_422_UNORM.valueOf(), VkFormat.VK_FORMAT_G8B8G8R8_422_UNORM.toString() + " has an unexpected value.");
        assertEquals(1000156001, VkFormat.VK_FORMAT_B8G8R8G8_422_UNORM.valueOf(), VkFormat.VK_FORMAT_B8G8R8G8_422_UNORM.toString() + " has an unexpected value.");
        assertEquals(1000156002, VkFormat.VK_FORMAT_G8_B8_R8_3PLANE_420_UNORM.valueOf(), VkFormat.VK_FORMAT_G8_B8_R8_3PLANE_420_UNORM.toString() + " has an unexpected value.");
        assertEquals(1000156003, VkFormat.VK_FORMAT_G8_B8R8_2PLANE_420_UNORM.valueOf(), VkFormat.VK_FORMAT_G8_B8R8_2PLANE_420_UNORM.toString() + " has an unexpected value.");
        assertEquals(1000156004, VkFormat.VK_FORMAT_G8_B8_R8_3PLANE_422_UNORM.valueOf(), VkFormat.VK_FORMAT_G8_B8_R8_3PLANE_422_UNORM.toString() + " has an unexpected value.");
        assertEquals(1000156005, VkFormat.VK_FORMAT_G8_B8R8_2PLANE_422_UNORM.valueOf(), VkFormat.VK_FORMAT_G8_B8R8_2PLANE_422_UNORM.toString() + " has an unexpected value.");
        assertEquals(1000156006, VkFormat.VK_FORMAT_G8_B8_R8_3PLANE_444_UNORM.valueOf(), VkFormat.VK_FORMAT_G8_B8_R8_3PLANE_444_UNORM.toString() + " has an unexpected value.");
        assertEquals(1000156007, VkFormat.VK_FORMAT_R10X6_UNORM_PACK16.valueOf(), VkFormat.VK_FORMAT_R10X6_UNORM_PACK16.toString() + " has an unexpected value.");
        assertEquals(1000156008, VkFormat.VK_FORMAT_R10X6G10X6_UNORM_2PACK16.valueOf(), VkFormat.VK_FORMAT_R10X6G10X6_UNORM_2PACK16.toString() + " has an unexpected value.");
        assertEquals(1000156009, VkFormat.VK_FORMAT_R10X6G10X6B10X6A10X6_UNORM_4PACK16.valueOf(), VkFormat.VK_FORMAT_R10X6G10X6B10X6A10X6_UNORM_4PACK16.toString() + " has an unexpected value.");
        assertEquals(1000156010, VkFormat.VK_FORMAT_G10X6B10X6G10X6R10X6_422_UNORM_4PACK16.valueOf(), VkFormat.VK_FORMAT_G10X6B10X6G10X6R10X6_422_UNORM_4PACK16.toString() + " has an unexpected value.");
        assertEquals(1000156011, VkFormat.VK_FORMAT_B10X6G10X6R10X6G10X6_422_UNORM_4PACK16.valueOf(), VkFormat.VK_FORMAT_B10X6G10X6R10X6G10X6_422_UNORM_4PACK16.toString() + " has an unexpected value.");
        assertEquals(1000156012, VkFormat.VK_FORMAT_G10X6_B10X6_R10X6_3PLANE_420_UNORM_3PACK16.valueOf(), VkFormat.VK_FORMAT_G10X6_B10X6_R10X6_3PLANE_420_UNORM_3PACK16.toString() + " has an unexpected value.");
        assertEquals(1000156013, VkFormat.VK_FORMAT_G10X6_B10X6R10X6_2PLANE_420_UNORM_3PACK16.valueOf(), VkFormat.VK_FORMAT_G10X6_B10X6R10X6_2PLANE_420_UNORM_3PACK16.toString() + " has an unexpected value.");
        assertEquals(1000156014, VkFormat.VK_FORMAT_G10X6_B10X6_R10X6_3PLANE_422_UNORM_3PACK16.valueOf(), VkFormat.VK_FORMAT_G10X6_B10X6_R10X6_3PLANE_422_UNORM_3PACK16.toString() + " has an unexpected value.");
        assertEquals(1000156015, VkFormat.VK_FORMAT_G10X6_B10X6R10X6_2PLANE_422_UNORM_3PACK16.valueOf(), VkFormat.VK_FORMAT_G10X6_B10X6R10X6_2PLANE_422_UNORM_3PACK16.toString() + " has an unexpected value.");
        assertEquals(1000156016, VkFormat.VK_FORMAT_G10X6_B10X6_R10X6_3PLANE_444_UNORM_3PACK16.valueOf(), VkFormat.VK_FORMAT_G10X6_B10X6_R10X6_3PLANE_444_UNORM_3PACK16.toString() + " has an unexpected value.");
        assertEquals(1000156017, VkFormat.VK_FORMAT_R12X4_UNORM_PACK16.valueOf(), VkFormat.VK_FORMAT_R12X4_UNORM_PACK16.toString() + " has an unexpected value.");
        assertEquals(1000156018, VkFormat.VK_FORMAT_R12X4G12X4_UNORM_2PACK16.valueOf(), VkFormat.VK_FORMAT_R12X4G12X4_UNORM_2PACK16.toString() + " has an unexpected value.");
        assertEquals(1000156019, VkFormat.VK_FORMAT_R12X4G12X4B12X4A12X4_UNORM_4PACK16.valueOf(), VkFormat.VK_FORMAT_R12X4G12X4B12X4A12X4_UNORM_4PACK16.toString() + " has an unexpected value.");
        assertEquals(1000156020, VkFormat.VK_FORMAT_G12X4B12X4G12X4R12X4_422_UNORM_4PACK16.valueOf(), VkFormat.VK_FORMAT_G12X4B12X4G12X4R12X4_422_UNORM_4PACK16.toString() + " has an unexpected value.");
        assertEquals(1000156021, VkFormat.VK_FORMAT_B12X4G12X4R12X4G12X4_422_UNORM_4PACK16.valueOf(), VkFormat.VK_FORMAT_B12X4G12X4R12X4G12X4_422_UNORM_4PACK16.toString() + " has an unexpected value.");
        assertEquals(1000156022, VkFormat.VK_FORMAT_G12X4_B12X4_R12X4_3PLANE_420_UNORM_3PACK16.valueOf(), VkFormat.VK_FORMAT_G12X4_B12X4_R12X4_3PLANE_420_UNORM_3PACK16.toString() + " has an unexpected value.");
        assertEquals(1000156023, VkFormat.VK_FORMAT_G12X4_B12X4R12X4_2PLANE_420_UNORM_3PACK16.valueOf(), VkFormat.VK_FORMAT_G12X4_B12X4R12X4_2PLANE_420_UNORM_3PACK16.toString() + " has an unexpected value.");
        assertEquals(1000156024, VkFormat.VK_FORMAT_G12X4_B12X4_R12X4_3PLANE_422_UNORM_3PACK16.valueOf(), VkFormat.VK_FORMAT_G12X4_B12X4_R12X4_3PLANE_422_UNORM_3PACK16.toString() + " has an unexpected value.");
        assertEquals(1000156025, VkFormat.VK_FORMAT_G12X4_B12X4R12X4_2PLANE_422_UNORM_3PACK16.valueOf(), VkFormat.VK_FORMAT_G12X4_B12X4R12X4_2PLANE_422_UNORM_3PACK16.toString() + " has an unexpected value.");
        assertEquals(1000156026, VkFormat.VK_FORMAT_G12X4_B12X4_R12X4_3PLANE_444_UNORM_3PACK16.valueOf(), VkFormat.VK_FORMAT_G12X4_B12X4_R12X4_3PLANE_444_UNORM_3PACK16.toString() + " has an unexpected value.");
        assertEquals(1000156027, VkFormat.VK_FORMAT_G16B16G16R16_422_UNORM.valueOf(), VkFormat.VK_FORMAT_G16B16G16R16_422_UNORM.toString() + " has an unexpected value.");
        assertEquals(1000156028, VkFormat.VK_FORMAT_B16G16R16G16_422_UNORM.valueOf(), VkFormat.VK_FORMAT_B16G16R16G16_422_UNORM.toString() + " has an unexpected value.");
        assertEquals(1000156029, VkFormat.VK_FORMAT_G16_B16_R16_3PLANE_420_UNORM.valueOf(), VkFormat.VK_FORMAT_G16_B16_R16_3PLANE_420_UNORM.toString() + " has an unexpected value.");
        assertEquals(1000156030, VkFormat.VK_FORMAT_G16_B16R16_2PLANE_420_UNORM.valueOf(), VkFormat.VK_FORMAT_G16_B16R16_2PLANE_420_UNORM.toString() + " has an unexpected value.");
        assertEquals(1000156031, VkFormat.VK_FORMAT_G16_B16_R16_3PLANE_422_UNORM.valueOf(), VkFormat.VK_FORMAT_G16_B16_R16_3PLANE_422_UNORM.toString() + " has an unexpected value.");
        assertEquals(1000156032, VkFormat.VK_FORMAT_G16_B16R16_2PLANE_422_UNORM.valueOf(), VkFormat.VK_FORMAT_G16_B16R16_2PLANE_422_UNORM.toString() + " has an unexpected value.");
        assertEquals(1000156033, VkFormat.VK_FORMAT_G16_B16_R16_3PLANE_444_UNORM.valueOf(), VkFormat.VK_FORMAT_G16_B16_R16_3PLANE_444_UNORM.toString() + " has an unexpected value.");
        assertEquals(1000054000, VkFormat.VK_FORMAT_PVRTC1_2BPP_UNORM_BLOCK_IMG.valueOf(), VkFormat.VK_FORMAT_PVRTC1_2BPP_UNORM_BLOCK_IMG.toString() + " has an unexpected value.");
        assertEquals(1000054001, VkFormat.VK_FORMAT_PVRTC1_4BPP_UNORM_BLOCK_IMG.valueOf(), VkFormat.VK_FORMAT_PVRTC1_4BPP_UNORM_BLOCK_IMG.toString() + " has an unexpected value.");
        assertEquals(1000054002, VkFormat.VK_FORMAT_PVRTC2_2BPP_UNORM_BLOCK_IMG.valueOf(), VkFormat.VK_FORMAT_PVRTC2_2BPP_UNORM_BLOCK_IMG.toString() + " has an unexpected value.");
        assertEquals(1000054003, VkFormat.VK_FORMAT_PVRTC2_4BPP_UNORM_BLOCK_IMG.valueOf(), VkFormat.VK_FORMAT_PVRTC2_4BPP_UNORM_BLOCK_IMG.toString() + " has an unexpected value.");
        assertEquals(1000054004, VkFormat.VK_FORMAT_PVRTC1_2BPP_SRGB_BLOCK_IMG.valueOf(), VkFormat.VK_FORMAT_PVRTC1_2BPP_SRGB_BLOCK_IMG.toString() + " has an unexpected value.");
        assertEquals(1000054005, VkFormat.VK_FORMAT_PVRTC1_4BPP_SRGB_BLOCK_IMG.valueOf(), VkFormat.VK_FORMAT_PVRTC1_4BPP_SRGB_BLOCK_IMG.toString() + " has an unexpected value.");
        assertEquals(1000054006, VkFormat.VK_FORMAT_PVRTC2_2BPP_SRGB_BLOCK_IMG.valueOf(), VkFormat.VK_FORMAT_PVRTC2_2BPP_SRGB_BLOCK_IMG.toString() + " has an unexpected value.");
        assertEquals(1000054007, VkFormat.VK_FORMAT_PVRTC2_4BPP_SRGB_BLOCK_IMG.valueOf(), VkFormat.VK_FORMAT_PVRTC2_4BPP_SRGB_BLOCK_IMG.toString() + " has an unexpected value.");
        assertEquals(VkFormat.VK_FORMAT_G8B8G8R8_422_UNORM.valueOf(), VkFormat.VK_FORMAT_G8B8G8R8_422_UNORM_KHR.valueOf(), VkFormat.VK_FORMAT_G8B8G8R8_422_UNORM_KHR.toString() + " has an unexpected value.");
        assertEquals(VkFormat.VK_FORMAT_B8G8R8G8_422_UNORM.valueOf(), VkFormat.VK_FORMAT_B8G8R8G8_422_UNORM_KHR.valueOf(), VkFormat.VK_FORMAT_B8G8R8G8_422_UNORM_KHR.toString() + " has an unexpected value.");
        assertEquals(VkFormat.VK_FORMAT_G8_B8_R8_3PLANE_420_UNORM.valueOf(), VkFormat.VK_FORMAT_G8_B8_R8_3PLANE_420_UNORM_KHR.valueOf(), VkFormat.VK_FORMAT_G8_B8_R8_3PLANE_420_UNORM_KHR.toString() + " has an unexpected value.");
        assertEquals(VkFormat.VK_FORMAT_G8_B8R8_2PLANE_420_UNORM.valueOf(), VkFormat.VK_FORMAT_G8_B8R8_2PLANE_420_UNORM_KHR.valueOf(), VkFormat.VK_FORMAT_G8_B8R8_2PLANE_420_UNORM_KHR.toString() + " has an unexpected value.");
        assertEquals(VkFormat.VK_FORMAT_G8_B8_R8_3PLANE_422_UNORM.valueOf(), VkFormat.VK_FORMAT_G8_B8_R8_3PLANE_422_UNORM_KHR.valueOf(), VkFormat.VK_FORMAT_G8_B8_R8_3PLANE_422_UNORM_KHR.toString() + " has an unexpected value.");
        assertEquals(VkFormat.VK_FORMAT_G8_B8R8_2PLANE_422_UNORM.valueOf(), VkFormat.VK_FORMAT_G8_B8R8_2PLANE_422_UNORM_KHR.valueOf(), VkFormat.VK_FORMAT_G8_B8R8_2PLANE_422_UNORM_KHR.toString() + " has an unexpected value.");
        assertEquals(VkFormat.VK_FORMAT_G8_B8_R8_3PLANE_444_UNORM.valueOf(), VkFormat.VK_FORMAT_G8_B8_R8_3PLANE_444_UNORM_KHR.valueOf(), VkFormat.VK_FORMAT_G8_B8_R8_3PLANE_444_UNORM_KHR.toString() + " has an unexpected value.");
        assertEquals(VkFormat.VK_FORMAT_R10X6_UNORM_PACK16.valueOf(), VkFormat.VK_FORMAT_R10X6_UNORM_PACK16_KHR.valueOf(), VkFormat.VK_FORMAT_R10X6_UNORM_PACK16_KHR.toString() + " has an unexpected value.");
        assertEquals(VkFormat.VK_FORMAT_R10X6G10X6_UNORM_2PACK16.valueOf(), VkFormat.VK_FORMAT_R10X6G10X6_UNORM_2PACK16_KHR.valueOf(), VkFormat.VK_FORMAT_R10X6G10X6_UNORM_2PACK16_KHR.toString() + " has an unexpected value.");
        assertEquals(VkFormat.VK_FORMAT_R10X6G10X6B10X6A10X6_UNORM_4PACK16.valueOf(), VkFormat.VK_FORMAT_R10X6G10X6B10X6A10X6_UNORM_4PACK16_KHR.valueOf(), VkFormat.VK_FORMAT_R10X6G10X6B10X6A10X6_UNORM_4PACK16_KHR.toString() + " has an unexpected value.");
        assertEquals(VkFormat.VK_FORMAT_G10X6B10X6G10X6R10X6_422_UNORM_4PACK16.valueOf(), VkFormat.VK_FORMAT_G10X6B10X6G10X6R10X6_422_UNORM_4PACK16_KHR.valueOf(), VkFormat.VK_FORMAT_G10X6B10X6G10X6R10X6_422_UNORM_4PACK16_KHR.toString() + " has an unexpected value.");
        assertEquals(VkFormat.VK_FORMAT_B10X6G10X6R10X6G10X6_422_UNORM_4PACK16.valueOf(), VkFormat.VK_FORMAT_B10X6G10X6R10X6G10X6_422_UNORM_4PACK16_KHR.valueOf(), VkFormat.VK_FORMAT_B10X6G10X6R10X6G10X6_422_UNORM_4PACK16_KHR.toString() + " has an unexpected value.");
        assertEquals(VkFormat.VK_FORMAT_G10X6_B10X6_R10X6_3PLANE_420_UNORM_3PACK16.valueOf(), VkFormat.VK_FORMAT_G10X6_B10X6_R10X6_3PLANE_420_UNORM_3PACK16_KHR.valueOf(), VkFormat.VK_FORMAT_G10X6_B10X6_R10X6_3PLANE_420_UNORM_3PACK16_KHR.toString() + " has an unexpected value.");
        assertEquals(VkFormat.VK_FORMAT_G10X6_B10X6R10X6_2PLANE_420_UNORM_3PACK16.valueOf(), VkFormat.VK_FORMAT_G10X6_B10X6R10X6_2PLANE_420_UNORM_3PACK16_KHR.valueOf(), VkFormat.VK_FORMAT_G10X6_B10X6R10X6_2PLANE_420_UNORM_3PACK16_KHR.toString() + " has an unexpected value.");
        assertEquals(VkFormat.VK_FORMAT_G10X6_B10X6_R10X6_3PLANE_422_UNORM_3PACK16.valueOf(), VkFormat.VK_FORMAT_G10X6_B10X6_R10X6_3PLANE_422_UNORM_3PACK16_KHR.valueOf(), VkFormat.VK_FORMAT_G10X6_B10X6_R10X6_3PLANE_422_UNORM_3PACK16_KHR.toString() + " has an unexpected value.");
        assertEquals(VkFormat.VK_FORMAT_G10X6_B10X6R10X6_2PLANE_422_UNORM_3PACK16.valueOf(), VkFormat.VK_FORMAT_G10X6_B10X6R10X6_2PLANE_422_UNORM_3PACK16_KHR.valueOf(), VkFormat.VK_FORMAT_G10X6_B10X6R10X6_2PLANE_422_UNORM_3PACK16_KHR.toString() + " has an unexpected value.");
        assertEquals(VkFormat.VK_FORMAT_G10X6_B10X6_R10X6_3PLANE_444_UNORM_3PACK16.valueOf(), VkFormat.VK_FORMAT_G10X6_B10X6_R10X6_3PLANE_444_UNORM_3PACK16_KHR.valueOf(), VkFormat.VK_FORMAT_G10X6_B10X6_R10X6_3PLANE_444_UNORM_3PACK16_KHR.toString() + " has an unexpected value.");
        assertEquals(VkFormat.VK_FORMAT_R12X4_UNORM_PACK16.valueOf(), VkFormat.VK_FORMAT_R12X4_UNORM_PACK16_KHR.valueOf(), VkFormat.VK_FORMAT_R12X4_UNORM_PACK16_KHR.toString() + " has an unexpected value.");
        assertEquals(VkFormat.VK_FORMAT_R12X4G12X4_UNORM_2PACK16.valueOf(), VkFormat.VK_FORMAT_R12X4G12X4_UNORM_2PACK16_KHR.valueOf(), VkFormat.VK_FORMAT_R12X4G12X4_UNORM_2PACK16_KHR.toString() + " has an unexpected value.");
        assertEquals(VkFormat.VK_FORMAT_R12X4G12X4B12X4A12X4_UNORM_4PACK16.valueOf(), VkFormat.VK_FORMAT_R12X4G12X4B12X4A12X4_UNORM_4PACK16_KHR.valueOf(), VkFormat.VK_FORMAT_R12X4G12X4B12X4A12X4_UNORM_4PACK16_KHR.toString() + " has an unexpected value.");
        assertEquals(VkFormat.VK_FORMAT_G12X4B12X4G12X4R12X4_422_UNORM_4PACK16.valueOf(), VkFormat.VK_FORMAT_G12X4B12X4G12X4R12X4_422_UNORM_4PACK16_KHR.valueOf(), VkFormat.VK_FORMAT_G12X4B12X4G12X4R12X4_422_UNORM_4PACK16_KHR.toString() + " has an unexpected value.");
        assertEquals(VkFormat.VK_FORMAT_B12X4G12X4R12X4G12X4_422_UNORM_4PACK16.valueOf(), VkFormat.VK_FORMAT_B12X4G12X4R12X4G12X4_422_UNORM_4PACK16_KHR.valueOf(), VkFormat.VK_FORMAT_B12X4G12X4R12X4G12X4_422_UNORM_4PACK16_KHR.toString() + " has an unexpected value.");
        assertEquals(VkFormat.VK_FORMAT_G12X4_B12X4_R12X4_3PLANE_420_UNORM_3PACK16.valueOf(), VkFormat.VK_FORMAT_G12X4_B12X4_R12X4_3PLANE_420_UNORM_3PACK16_KHR.valueOf(), VkFormat.VK_FORMAT_G12X4_B12X4_R12X4_3PLANE_420_UNORM_3PACK16_KHR.toString() + " has an unexpected value.");
        assertEquals(VkFormat.VK_FORMAT_G12X4_B12X4R12X4_2PLANE_420_UNORM_3PACK16.valueOf(), VkFormat.VK_FORMAT_G12X4_B12X4R12X4_2PLANE_420_UNORM_3PACK16_KHR.valueOf(), VkFormat.VK_FORMAT_G12X4_B12X4R12X4_2PLANE_420_UNORM_3PACK16_KHR.toString() + " has an unexpected value.");
        assertEquals(VkFormat.VK_FORMAT_G12X4_B12X4_R12X4_3PLANE_422_UNORM_3PACK16.valueOf(), VkFormat.VK_FORMAT_G12X4_B12X4_R12X4_3PLANE_422_UNORM_3PACK16_KHR.valueOf(), VkFormat.VK_FORMAT_G12X4_B12X4_R12X4_3PLANE_422_UNORM_3PACK16_KHR.toString() + " has an unexpected value.");
        assertEquals(VkFormat.VK_FORMAT_G12X4_B12X4R12X4_2PLANE_422_UNORM_3PACK16.valueOf(), VkFormat.VK_FORMAT_G12X4_B12X4R12X4_2PLANE_422_UNORM_3PACK16_KHR.valueOf(), VkFormat.VK_FORMAT_G12X4_B12X4R12X4_2PLANE_422_UNORM_3PACK16_KHR.toString() + " has an unexpected value.");
        assertEquals(VkFormat.VK_FORMAT_G12X4_B12X4_R12X4_3PLANE_444_UNORM_3PACK16.valueOf(), VkFormat.VK_FORMAT_G12X4_B12X4_R12X4_3PLANE_444_UNORM_3PACK16_KHR.valueOf(), VkFormat.VK_FORMAT_G12X4_B12X4_R12X4_3PLANE_444_UNORM_3PACK16_KHR.toString() + " has an unexpected value.");
        assertEquals(VkFormat.VK_FORMAT_G16B16G16R16_422_UNORM.valueOf(), VkFormat.VK_FORMAT_G16B16G16R16_422_UNORM_KHR.valueOf(), VkFormat.VK_FORMAT_G16B16G16R16_422_UNORM_KHR.toString() + " has an unexpected value.");
        assertEquals(VkFormat.VK_FORMAT_B16G16R16G16_422_UNORM.valueOf(), VkFormat.VK_FORMAT_B16G16R16G16_422_UNORM_KHR.valueOf(), VkFormat.VK_FORMAT_B16G16R16G16_422_UNORM_KHR.toString() + " has an unexpected value.");
        assertEquals(VkFormat.VK_FORMAT_G16_B16_R16_3PLANE_420_UNORM.valueOf(), VkFormat.VK_FORMAT_G16_B16_R16_3PLANE_420_UNORM_KHR.valueOf(), VkFormat.VK_FORMAT_G16_B16_R16_3PLANE_420_UNORM_KHR.toString() + " has an unexpected value.");
        assertEquals(VkFormat.VK_FORMAT_G16_B16R16_2PLANE_420_UNORM.valueOf(), VkFormat.VK_FORMAT_G16_B16R16_2PLANE_420_UNORM_KHR.valueOf(), VkFormat.VK_FORMAT_G16_B16R16_2PLANE_420_UNORM_KHR.toString() + " has an unexpected value.");
        assertEquals(VkFormat.VK_FORMAT_G16_B16_R16_3PLANE_422_UNORM.valueOf(), VkFormat.VK_FORMAT_G16_B16_R16_3PLANE_422_UNORM_KHR.valueOf(), VkFormat.VK_FORMAT_G16_B16_R16_3PLANE_422_UNORM_KHR.toString() + " has an unexpected value.");
        assertEquals(VkFormat.VK_FORMAT_G16_B16R16_2PLANE_422_UNORM.valueOf(), VkFormat.VK_FORMAT_G16_B16R16_2PLANE_422_UNORM_KHR.valueOf(), VkFormat.VK_FORMAT_G16_B16R16_2PLANE_422_UNORM_KHR.toString() + " has an unexpected value.");
        assertEquals(VkFormat.VK_FORMAT_G16_B16_R16_3PLANE_444_UNORM.valueOf(), VkFormat.VK_FORMAT_G16_B16_R16_3PLANE_444_UNORM_KHR.valueOf(), VkFormat.VK_FORMAT_G16_B16_R16_3PLANE_444_UNORM_KHR.toString() + " has an unexpected value.");
        assertEquals(VkFormat.VK_FORMAT_UNDEFINED.valueOf(), VkFormat.VK_FORMAT_BEGIN_RANGE.valueOf(), VkFormat.VK_FORMAT_BEGIN_RANGE.toString() + " has an unexpected value.");
        assertEquals(VkFormat.VK_FORMAT_ASTC_12x12_SRGB_BLOCK.valueOf(), VkFormat.VK_FORMAT_END_RANGE.valueOf(), VkFormat.VK_FORMAT_END_RANGE.toString() + " has an unexpected value.");
        assertEquals((VkFormat.VK_FORMAT_ASTC_12x12_SRGB_BLOCK.valueOf() - VkFormat.VK_FORMAT_UNDEFINED.valueOf() + 1), VkFormat.VK_FORMAT_RANGE_SIZE.valueOf(), VkFormat.VK_FORMAT_RANGE_SIZE.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkFormat.VK_FORMAT_MAX_ENUM.valueOf(), VkFormat.VK_FORMAT_MAX_ENUM.toString() + " has an unexpected value.");
    }
}
