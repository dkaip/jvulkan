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
package com.CIMthetics.hwjvi.VulkanCore.VK11.Enums;

public enum VkShaderInfoTypeAMD
{
    VK_SHADER_INFO_TYPE_STATISTICS_AMD(0),
    VK_SHADER_INFO_TYPE_BINARY_AMD(1),
    VK_SHADER_INFO_TYPE_DISASSEMBLY_AMD(2),
    VK_SHADER_INFO_TYPE_BEGIN_RANGE_AMD(VK_SHADER_INFO_TYPE_STATISTICS_AMD.valueOf()),
    VK_SHADER_INFO_TYPE_END_RANGE_AMD(VK_SHADER_INFO_TYPE_DISASSEMBLY_AMD.valueOf()),
    VK_SHADER_INFO_TYPE_RANGE_SIZE_AMD((VK_SHADER_INFO_TYPE_DISASSEMBLY_AMD.valueOf() - VK_SHADER_INFO_TYPE_STATISTICS_AMD.valueOf() + 1)),
    VK_SHADER_INFO_TYPE_MAX_ENUM_AMD(0x7FFFFFFF);

    private int value;
    
    private VkShaderInfoTypeAMD(int value) { this.value = value; }
    
    public int valueOf() { return value; }
}
