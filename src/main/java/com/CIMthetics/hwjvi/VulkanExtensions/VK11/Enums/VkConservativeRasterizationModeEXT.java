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

public enum VkConservativeRasterizationModeEXT
{
    VK_CONSERVATIVE_RASTERIZATION_MODE_DISABLED_EXT(0),
    VK_CONSERVATIVE_RASTERIZATION_MODE_OVERESTIMATE_EXT(1),
    VK_CONSERVATIVE_RASTERIZATION_MODE_UNDERESTIMATE_EXT(2),
    VK_CONSERVATIVE_RASTERIZATION_MODE_BEGIN_RANGE_EXT(VK_CONSERVATIVE_RASTERIZATION_MODE_DISABLED_EXT.valueOf()),
    VK_CONSERVATIVE_RASTERIZATION_MODE_END_RANGE_EXT(VK_CONSERVATIVE_RASTERIZATION_MODE_UNDERESTIMATE_EXT.valueOf()),
    VK_CONSERVATIVE_RASTERIZATION_MODE_RANGE_SIZE_EXT((VK_CONSERVATIVE_RASTERIZATION_MODE_UNDERESTIMATE_EXT.valueOf() - VK_CONSERVATIVE_RASTERIZATION_MODE_DISABLED_EXT.valueOf() + 1)),
    VK_CONSERVATIVE_RASTERIZATION_MODE_MAX_ENUM_EXT(0x7FFFFFFF);

    private int value;
    
    private VkConservativeRasterizationModeEXT(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
