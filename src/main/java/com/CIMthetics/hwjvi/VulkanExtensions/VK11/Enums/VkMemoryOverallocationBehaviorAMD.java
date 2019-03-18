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

public enum VkMemoryOverallocationBehaviorAMD
{
    VK_MEMORY_OVERALLOCATION_BEHAVIOR_DEFAULT_AMD(0),
    VK_MEMORY_OVERALLOCATION_BEHAVIOR_ALLOWED_AMD(1),
    VK_MEMORY_OVERALLOCATION_BEHAVIOR_DISALLOWED_AMD(2),
    VK_MEMORY_OVERALLOCATION_BEHAVIOR_BEGIN_RANGE_AMD(VK_MEMORY_OVERALLOCATION_BEHAVIOR_DEFAULT_AMD.valueOf()),
    VK_MEMORY_OVERALLOCATION_BEHAVIOR_END_RANGE_AMD(VK_MEMORY_OVERALLOCATION_BEHAVIOR_DISALLOWED_AMD.valueOf()),
    VK_MEMORY_OVERALLOCATION_BEHAVIOR_RANGE_SIZE_AMD(VK_MEMORY_OVERALLOCATION_BEHAVIOR_DISALLOWED_AMD.valueOf() - VK_MEMORY_OVERALLOCATION_BEHAVIOR_DEFAULT_AMD.valueOf() + 1),
    VK_MEMORY_OVERALLOCATION_BEHAVIOR_MAX_ENUM_AMD(0x7FFFFFFF);

    private int value;
    
    private VkMemoryOverallocationBehaviorAMD(int value) { this.value = value; }
    
    public int valueOf() { return value; }

}
