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

public enum VkSamplerYcbcrRange
{
    VK_SAMPLER_YCBCR_RANGE_ITU_FULL(0),
    VK_SAMPLER_YCBCR_RANGE_ITU_NARROW(1),
    VK_SAMPLER_YCBCR_RANGE_ITU_FULL_KHR(VK_SAMPLER_YCBCR_RANGE_ITU_FULL.valueOf()),
    VK_SAMPLER_YCBCR_RANGE_ITU_NARROW_KHR(VK_SAMPLER_YCBCR_RANGE_ITU_NARROW.valueOf()),
    VK_SAMPLER_YCBCR_RANGE_BEGIN_RANGE(VK_SAMPLER_YCBCR_RANGE_ITU_FULL.valueOf()),
    VK_SAMPLER_YCBCR_RANGE_END_RANGE(VK_SAMPLER_YCBCR_RANGE_ITU_NARROW.valueOf()),
    VK_SAMPLER_YCBCR_RANGE_RANGE_SIZE((VK_SAMPLER_YCBCR_RANGE_ITU_NARROW .valueOf()- VK_SAMPLER_YCBCR_RANGE_ITU_FULL.valueOf() + 1)),
    VK_SAMPLER_YCBCR_RANGE_MAX_ENUM(0x7FFFFFFF);

    private int value;
    
    private VkSamplerYcbcrRange(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
