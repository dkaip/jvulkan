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
package com.CIMthetics.jvulkan.VulkanExtensions.VK11.Enums;

public enum VkValidationFeatureDisableEXT
{
    VK_VALIDATION_FEATURE_DISABLE_ALL_EXT(0),
    VK_VALIDATION_FEATURE_DISABLE_SHADERS_EXT(1),
    VK_VALIDATION_FEATURE_DISABLE_THREAD_SAFETY_EXT(2),
    VK_VALIDATION_FEATURE_DISABLE_API_PARAMETERS_EXT(3),
    VK_VALIDATION_FEATURE_DISABLE_OBJECT_LIFETIMES_EXT(4),
    VK_VALIDATION_FEATURE_DISABLE_CORE_CHECKS_EXT(5),
    VK_VALIDATION_FEATURE_DISABLE_UNIQUE_HANDLES_EXT(6),
    VK_VALIDATION_FEATURE_DISABLE_BEGIN_RANGE_EXT(VK_VALIDATION_FEATURE_DISABLE_ALL_EXT.valueOf()),
    VK_VALIDATION_FEATURE_DISABLE_END_RANGE_EXT(VK_VALIDATION_FEATURE_DISABLE_UNIQUE_HANDLES_EXT.valueOf()),
    VK_VALIDATION_FEATURE_DISABLE_RANGE_SIZE_EXT(VK_VALIDATION_FEATURE_DISABLE_UNIQUE_HANDLES_EXT.valueOf() - VK_VALIDATION_FEATURE_DISABLE_ALL_EXT.valueOf() + 1),
    VK_VALIDATION_FEATURE_DISABLE_MAX_ENUM_EXT(0x7FFFFFFF);

    private int value;
    
    private VkValidationFeatureDisableEXT(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
