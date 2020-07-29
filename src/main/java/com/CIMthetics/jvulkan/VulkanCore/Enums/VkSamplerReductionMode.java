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

public enum VkSamplerReductionMode
{
    VK_SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE(0),
    VK_SAMPLER_REDUCTION_MODE_MIN(1),
    VK_SAMPLER_REDUCTION_MODE_MAX(2),
    VK_SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE_EXT(VK_SAMPLER_REDUCTION_MODE_WEIGHTED_AVERAGE.valueOf()),
    VK_SAMPLER_REDUCTION_MODE_MIN_EXT(VK_SAMPLER_REDUCTION_MODE_MIN.valueOf()),
    VK_SAMPLER_REDUCTION_MODE_MAX_EXT(VK_SAMPLER_REDUCTION_MODE_MAX.valueOf()),
    VK_SAMPLER_REDUCTION_MODE_MAX_ENUM_EXT(0x7FFFFFFF);

    private int value;
    
    private VkSamplerReductionMode(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
