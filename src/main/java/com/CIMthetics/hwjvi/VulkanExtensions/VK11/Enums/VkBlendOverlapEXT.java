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
package com.CIMthetics.hwjvi.VulkanExtensions.VK11.Enums;

public enum VkBlendOverlapEXT
{
    VK_BLEND_OVERLAP_UNCORRELATED_EXT(0),
    VK_BLEND_OVERLAP_DISJOINT_EXT(1),
    VK_BLEND_OVERLAP_CONJOINT_EXT(2),
    VK_BLEND_OVERLAP_BEGIN_RANGE_EXT(VK_BLEND_OVERLAP_UNCORRELATED_EXT.valueOf()),
    VK_BLEND_OVERLAP_END_RANGE_EXT(VK_BLEND_OVERLAP_CONJOINT_EXT.valueOf()),
    VK_BLEND_OVERLAP_RANGE_SIZE_EXT((VK_BLEND_OVERLAP_CONJOINT_EXT.valueOf() - VK_BLEND_OVERLAP_UNCORRELATED_EXT.valueOf() + 1)),
    VK_BLEND_OVERLAP_MAX_ENUM_EXT(0x7FFFFFFF);

    private int value;
    
    private VkBlendOverlapEXT(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
