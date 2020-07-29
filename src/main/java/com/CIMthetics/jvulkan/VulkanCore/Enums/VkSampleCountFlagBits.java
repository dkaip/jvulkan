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

public enum VkSampleCountFlagBits
{
    VK_SAMPLE_COUNT_1_BIT(0x00000001),
    VK_SAMPLE_COUNT_2_BIT(0x00000002),
    VK_SAMPLE_COUNT_4_BIT(0x00000004),
    VK_SAMPLE_COUNT_8_BIT(0x00000008),
    VK_SAMPLE_COUNT_16_BIT(0x00000010),
    VK_SAMPLE_COUNT_32_BIT(0x00000020),
    VK_SAMPLE_COUNT_64_BIT(0x00000040),
    VK_SAMPLE_COUNT_FLAG_BITS_MAX_ENUM(0x7FFFFFFF);

    private int value;
    
    private VkSampleCountFlagBits(int value) { this.value = value; }
    
    public int valueOf() { return value; }

    static VkSampleCountFlagBits fromValue(int inputValue)
    {
        VkSampleCountFlagBits result = null;
        
        switch(inputValue)
        {
            case 0x00000001:
                result = VK_SAMPLE_COUNT_1_BIT;
                break;
            case 0x00000002:
                result = VK_SAMPLE_COUNT_2_BIT;
                break;
            case 0x00000004:
                result = VK_SAMPLE_COUNT_4_BIT;
                break;
            case 0x00000008:
                result =  VK_SAMPLE_COUNT_8_BIT;
                break;
            case 0x00000010:
                result = VK_SAMPLE_COUNT_16_BIT;
                break;
            case 0x00000020:
                result = VK_SAMPLE_COUNT_32_BIT;
                break;
            case 0x00000040:
                result = VK_SAMPLE_COUNT_64_BIT;
                break;
        }

        if (result == null)
            throw new IllegalArgumentException("Illegal value specified for this Enum.");

        return result;
    }
}
