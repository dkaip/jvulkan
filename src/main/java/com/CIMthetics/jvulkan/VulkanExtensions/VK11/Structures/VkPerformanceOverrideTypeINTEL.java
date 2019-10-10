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
package com.CIMthetics.jvulkan.VulkanExtensions.VK11.Structures;

public enum VkPerformanceOverrideTypeINTEL
{
    VK_PERFORMANCE_OVERRIDE_TYPE_NULL_HARDWARE_INTEL(0),
    VK_PERFORMANCE_OVERRIDE_TYPE_FLUSH_GPU_CACHES_INTEL(1),
    VK_PERFORMANCE_OVERRIDE_TYPE_BEGIN_RANGE_INTEL(VK_PERFORMANCE_OVERRIDE_TYPE_NULL_HARDWARE_INTEL.valueOf()),
    VK_PERFORMANCE_OVERRIDE_TYPE_END_RANGE_INTEL(VK_PERFORMANCE_OVERRIDE_TYPE_FLUSH_GPU_CACHES_INTEL.valueOf()),
    VK_PERFORMANCE_OVERRIDE_TYPE_RANGE_SIZE_INTEL(VK_PERFORMANCE_OVERRIDE_TYPE_FLUSH_GPU_CACHES_INTEL.valueOf() - VK_PERFORMANCE_OVERRIDE_TYPE_NULL_HARDWARE_INTEL.valueOf() + 1),
    VK_PERFORMANCE_OVERRIDE_TYPE_MAX_ENUM_INTEL(0x7FFFFFFF);

    private int value;
    
    private VkPerformanceOverrideTypeINTEL(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
