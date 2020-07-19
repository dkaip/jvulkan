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

public enum VkSubgroupFeatureFlagBits
{
    VK_SUBGROUP_FEATURE_BASIC_BIT(0x00000001),
    VK_SUBGROUP_FEATURE_VOTE_BIT(0x00000002),
    VK_SUBGROUP_FEATURE_ARITHMETIC_BIT(0x00000004),
    VK_SUBGROUP_FEATURE_BALLOT_BIT(0x00000008),
    VK_SUBGROUP_FEATURE_SHUFFLE_BIT(0x00000010),
    VK_SUBGROUP_FEATURE_SHUFFLE_RELATIVE_BIT(0x00000020),
    VK_SUBGROUP_FEATURE_CLUSTERED_BIT(0x00000040),
    VK_SUBGROUP_FEATURE_QUAD_BIT(0x00000080),
    VK_SUBGROUP_FEATURE_PARTITIONED_BIT_NV(0x00000100),
    VK_SUBGROUP_FEATURE_FLAG_BITS_MAX_ENUM(0x7FFFFFFF);

    private int value;
    
    private VkSubgroupFeatureFlagBits(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
