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

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkShaderStageFlagBits;

class VkShaderStageFlagBitsTest
{
    @Test
    void testNumberOfElements()
    {
        VkShaderStageFlagBits[] values = VkShaderStageFlagBits.values();
        assertEquals(17, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }


    @Test
    void testValues()
    {
        assertEquals(0x00000001, VkShaderStageFlagBits.VK_SHADER_STAGE_VERTEX_BIT.valueOf(), VkShaderStageFlagBits.VK_SHADER_STAGE_VERTEX_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000002, VkShaderStageFlagBits.VK_SHADER_STAGE_TESSELLATION_CONTROL_BIT.valueOf(), VkShaderStageFlagBits.VK_SHADER_STAGE_TESSELLATION_CONTROL_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000004, VkShaderStageFlagBits.VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT.valueOf(), VkShaderStageFlagBits.VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000008, VkShaderStageFlagBits.VK_SHADER_STAGE_GEOMETRY_BIT.valueOf(), VkShaderStageFlagBits.VK_SHADER_STAGE_GEOMETRY_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000010, VkShaderStageFlagBits.VK_SHADER_STAGE_FRAGMENT_BIT.valueOf(), VkShaderStageFlagBits.VK_SHADER_STAGE_FRAGMENT_BIT.toString() + " has an unexpected value.");
        assertEquals(0x0000001F, VkShaderStageFlagBits.VK_SHADER_STAGE_ALL_GRAPHICS.valueOf(), VkShaderStageFlagBits.VK_SHADER_STAGE_ALL_GRAPHICS.toString() + " has an unexpected value.");
        assertEquals(0x00000020, VkShaderStageFlagBits.VK_SHADER_STAGE_COMPUTE_BIT.valueOf(), VkShaderStageFlagBits.VK_SHADER_STAGE_COMPUTE_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000040, VkShaderStageFlagBits.VK_SHADER_STAGE_TASK_BIT_NV.valueOf(), VkShaderStageFlagBits.VK_SHADER_STAGE_TASK_BIT_NV.toString() + " has an unexpected value.");
        assertEquals(0x00000080, VkShaderStageFlagBits.VK_SHADER_STAGE_MESH_BIT_NV.valueOf(), VkShaderStageFlagBits.VK_SHADER_STAGE_MESH_BIT_NV.toString() + " has an unexpected value.");
        assertEquals(0x00000100, VkShaderStageFlagBits.VK_SHADER_STAGE_RAYGEN_BIT_NV.valueOf(), VkShaderStageFlagBits.VK_SHADER_STAGE_RAYGEN_BIT_NV.toString() + " has an unexpected value.");
        assertEquals(0x00000200, VkShaderStageFlagBits.VK_SHADER_STAGE_ANY_HIT_BIT_NV.valueOf(), VkShaderStageFlagBits.VK_SHADER_STAGE_ANY_HIT_BIT_NV.toString() + " has an unexpected value.");
        assertEquals(0x00000400, VkShaderStageFlagBits.VK_SHADER_STAGE_CLOSEST_HIT_BIT_NV.valueOf(), VkShaderStageFlagBits.VK_SHADER_STAGE_CLOSEST_HIT_BIT_NV.toString() + " has an unexpected value.");
        assertEquals(0x00000800, VkShaderStageFlagBits.VK_SHADER_STAGE_MISS_BIT_NV.valueOf(), VkShaderStageFlagBits.VK_SHADER_STAGE_MISS_BIT_NV.toString() + " has an unexpected value.");
        assertEquals(0x00001000, VkShaderStageFlagBits.VK_SHADER_STAGE_INTERSECTION_BIT_NV.valueOf(), VkShaderStageFlagBits.VK_SHADER_STAGE_INTERSECTION_BIT_NV.toString() + " has an unexpected value.");
        assertEquals(0x00002000, VkShaderStageFlagBits.VK_SHADER_STAGE_CALLABLE_BIT_NV.valueOf(), VkShaderStageFlagBits.VK_SHADER_STAGE_CALLABLE_BIT_NV.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkShaderStageFlagBits.VK_SHADER_STAGE_ALL.valueOf(), VkShaderStageFlagBits.VK_SHADER_STAGE_ALL.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkShaderStageFlagBits.VK_SHADER_STAGE_FLAG_BITS_MAX_ENUM.valueOf(), VkShaderStageFlagBits.VK_SHADER_STAGE_FLAG_BITS_MAX_ENUM.toString() + " has an unexpected value.");
    }
}
