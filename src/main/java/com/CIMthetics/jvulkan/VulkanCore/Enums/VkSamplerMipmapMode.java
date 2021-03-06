/*
 * Copyright 2019-2020 Douglas Kaip
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

public enum VkSamplerMipmapMode
{
    VK_SAMPLER_MIPMAP_MODE_NEAREST(0),
    VK_SAMPLER_MIPMAP_MODE_LINEAR(1),
    VK_SAMPLER_MIPMAP_MODE_MAX_ENUM(0x7FFFFFFF);

    private int value;
    
    private VkSamplerMipmapMode(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
