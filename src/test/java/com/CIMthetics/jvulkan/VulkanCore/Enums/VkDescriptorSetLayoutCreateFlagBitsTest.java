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

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkDescriptorSetLayoutCreateFlagBits;

class VkDescriptorSetLayoutCreateFlagBitsTest
{
    @Test
    void testNumberOfElements()
    {
        VkDescriptorSetLayoutCreateFlagBits[] values = VkDescriptorSetLayoutCreateFlagBits.values();
        assertEquals(3, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }


    @Test
    void testValues()
    {
        assertEquals(0x00000001, VkDescriptorSetLayoutCreateFlagBits.VK_DESCRIPTOR_SET_LAYOUT_CREATE_PUSH_DESCRIPTOR_BIT_KHR.valueOf(), VkDescriptorSetLayoutCreateFlagBits.VK_DESCRIPTOR_SET_LAYOUT_CREATE_PUSH_DESCRIPTOR_BIT_KHR.toString() + " has an unexpected value.");
        assertEquals(0x00000002, VkDescriptorSetLayoutCreateFlagBits.VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT_EXT.valueOf(), VkDescriptorSetLayoutCreateFlagBits.VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT_EXT.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkDescriptorSetLayoutCreateFlagBits.VK_DESCRIPTOR_SET_LAYOUT_CREATE_FLAG_BITS_MAX_ENUM.valueOf(), VkDescriptorSetLayoutCreateFlagBits.VK_DESCRIPTOR_SET_LAYOUT_CREATE_FLAG_BITS_MAX_ENUM.toString() + " has an unexpected value.");
    }
}
