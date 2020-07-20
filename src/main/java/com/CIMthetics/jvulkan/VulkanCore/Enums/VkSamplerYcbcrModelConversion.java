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

public enum VkSamplerYcbcrModelConversion
{
    VK_SAMPLER_YCBCR_MODEL_CONVERSION_RGB_IDENTITY(0),
    VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_IDENTITY(1),
    VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_709(2),
    VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_601(3),
    VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_2020(4),
    VK_SAMPLER_YCBCR_MODEL_CONVERSION_RGB_IDENTITY_KHR(VK_SAMPLER_YCBCR_MODEL_CONVERSION_RGB_IDENTITY.valueOf()),
    VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_IDENTITY_KHR(VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_IDENTITY.valueOf()),
    VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_709_KHR(VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_709.valueOf()),
    VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_601_KHR(VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_601.valueOf()),
    VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_2020_KHR(VK_SAMPLER_YCBCR_MODEL_CONVERSION_YCBCR_2020.valueOf()),
    VK_SAMPLER_YCBCR_MODEL_CONVERSION_MAX_ENUM(0x7FFFFFFF);

    private int value;
    
    private VkSamplerYcbcrModelConversion(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
