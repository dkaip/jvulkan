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

class VkSubgroupFeatureFlagBitsTest
{
    @Test
    void testNumberOfElements()
    {
        VkSubgroupFeatureFlagBits[] values = VkSubgroupFeatureFlagBits.values();
        assertEquals(10, values.length, "This enum has the wrong number of entries in it. Did it change without this test being updated?");
    }


    @Test
    void testValues()
    {
        assertEquals(0x00000001, VkSubgroupFeatureFlagBits.VK_SUBGROUP_FEATURE_BASIC_BIT.valueOf(), VkSubgroupFeatureFlagBits.VK_SUBGROUP_FEATURE_BASIC_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000002, VkSubgroupFeatureFlagBits.VK_SUBGROUP_FEATURE_VOTE_BIT.valueOf(), VkSubgroupFeatureFlagBits.VK_SUBGROUP_FEATURE_VOTE_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000004, VkSubgroupFeatureFlagBits.VK_SUBGROUP_FEATURE_ARITHMETIC_BIT.valueOf(), VkSubgroupFeatureFlagBits.VK_SUBGROUP_FEATURE_ARITHMETIC_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000008, VkSubgroupFeatureFlagBits.VK_SUBGROUP_FEATURE_BALLOT_BIT.valueOf(), VkSubgroupFeatureFlagBits.VK_SUBGROUP_FEATURE_BALLOT_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000010, VkSubgroupFeatureFlagBits.VK_SUBGROUP_FEATURE_SHUFFLE_BIT.valueOf(), VkSubgroupFeatureFlagBits.VK_SUBGROUP_FEATURE_SHUFFLE_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000020, VkSubgroupFeatureFlagBits.VK_SUBGROUP_FEATURE_SHUFFLE_RELATIVE_BIT.valueOf(), VkSubgroupFeatureFlagBits.VK_SUBGROUP_FEATURE_SHUFFLE_RELATIVE_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000040, VkSubgroupFeatureFlagBits.VK_SUBGROUP_FEATURE_CLUSTERED_BIT.valueOf(), VkSubgroupFeatureFlagBits.VK_SUBGROUP_FEATURE_CLUSTERED_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000080, VkSubgroupFeatureFlagBits.VK_SUBGROUP_FEATURE_QUAD_BIT.valueOf(), VkSubgroupFeatureFlagBits.VK_SUBGROUP_FEATURE_QUAD_BIT.toString() + " has an unexpected value.");
        assertEquals(0x00000100, VkSubgroupFeatureFlagBits.VK_SUBGROUP_FEATURE_PARTITIONED_BIT_NV.valueOf(), VkSubgroupFeatureFlagBits.VK_SUBGROUP_FEATURE_PARTITIONED_BIT_NV.toString() + " has an unexpected value.");
        assertEquals(0x7FFFFFFF, VkSubgroupFeatureFlagBits.VK_SUBGROUP_FEATURE_FLAG_BITS_MAX_ENUM.valueOf(), VkSubgroupFeatureFlagBits.VK_SUBGROUP_FEATURE_FLAG_BITS_MAX_ENUM.toString() + " has an unexpected value.");
    }
}
