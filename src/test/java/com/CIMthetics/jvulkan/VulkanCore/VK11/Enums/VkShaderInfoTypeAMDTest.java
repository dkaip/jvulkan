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

class VkShaderInfoTypeAMDTest
{
    @Test
    void testNumberOfElements()
    {
        VkShaderInfoTypeAMD[] values = VkShaderInfoTypeAMD.values();
        assertEquals(7, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }


    @Test
    void testValues()
    {
        assertEquals(0, VkShaderInfoTypeAMD.VK_SHADER_INFO_TYPE_STATISTICS_AMD.valueOf(), VkShaderInfoTypeAMD.VK_SHADER_INFO_TYPE_STATISTICS_AMD.toString() + " has an unexpected value.");
        assertEquals(1, VkShaderInfoTypeAMD.VK_SHADER_INFO_TYPE_BINARY_AMD.valueOf(), VkShaderInfoTypeAMD.VK_SHADER_INFO_TYPE_BINARY_AMD.toString() + " has an unexpected value.");
        assertEquals(2, VkShaderInfoTypeAMD.VK_SHADER_INFO_TYPE_DISASSEMBLY_AMD.valueOf(), VkShaderInfoTypeAMD.VK_SHADER_INFO_TYPE_DISASSEMBLY_AMD.toString() + " has an unexpected value.");
        assertEquals(VkShaderInfoTypeAMD.VK_SHADER_INFO_TYPE_STATISTICS_AMD.valueOf(), VkShaderInfoTypeAMD.VK_SHADER_INFO_TYPE_BEGIN_RANGE_AMD.valueOf(), VkShaderInfoTypeAMD.VK_SHADER_INFO_TYPE_BEGIN_RANGE_AMD.toString() + " has an unexpected value.");
        assertEquals(VkShaderInfoTypeAMD.VK_SHADER_INFO_TYPE_DISASSEMBLY_AMD.valueOf(), VkShaderInfoTypeAMD.VK_SHADER_INFO_TYPE_END_RANGE_AMD.valueOf(), VkShaderInfoTypeAMD.VK_SHADER_INFO_TYPE_END_RANGE_AMD.toString() + " has an unexpected value.");
        assertEquals((VkShaderInfoTypeAMD.VK_SHADER_INFO_TYPE_DISASSEMBLY_AMD.valueOf() - VkShaderInfoTypeAMD.VK_SHADER_INFO_TYPE_STATISTICS_AMD.valueOf() + 1), VkShaderInfoTypeAMD.VK_SHADER_INFO_TYPE_RANGE_SIZE_AMD.valueOf(), VkShaderInfoTypeAMD.VK_SHADER_INFO_TYPE_RANGE_SIZE_AMD.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkShaderInfoTypeAMD.VK_SHADER_INFO_TYPE_MAX_ENUM_AMD.valueOf(), VkShaderInfoTypeAMD.VK_SHADER_INFO_TYPE_MAX_ENUM_AMD.toString() + " has an unexpected value.");
    }
}
