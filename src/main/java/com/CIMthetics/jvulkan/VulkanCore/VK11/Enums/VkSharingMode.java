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
package com.CIMthetics.jvulkan.VulkanCore.VK11.Enums;

public enum VkSharingMode
{
    VK_SHARING_MODE_EXCLUSIVE(0),
    VK_SHARING_MODE_CONCURRENT(1),
    VK_SHARING_MODE_BEGIN_RANGE(VK_SHARING_MODE_EXCLUSIVE.valueOf()),
    VK_SHARING_MODE_END_RANGE(VK_SHARING_MODE_CONCURRENT.valueOf()),
    VK_SHARING_MODE_RANGE_SIZE((VK_SHARING_MODE_CONCURRENT.valueOf() - VK_SHARING_MODE_EXCLUSIVE.valueOf() + 1)),
    VK_SHARING_MODE_MAX_ENUM(0x7FFFFFFF);

    private int value;
    
    private VkSharingMode(int value) { this.value = value; }
    
    public int valueOf() { return value; }

    static VkSharingMode fromValue(int inputValue)
    {
        VkSharingMode result = null;
        
        switch(inputValue)
        {
            case 0:
                result = VK_SHARING_MODE_EXCLUSIVE;
                break;
            case 1:
                result = VK_SHARING_MODE_CONCURRENT;
                break;
            case 0x7FFFFFFF:
                result = VK_SHARING_MODE_MAX_ENUM;
                break;
        }

        if (inputValue == (VK_SHARING_MODE_CONCURRENT.valueOf() - VK_SHARING_MODE_EXCLUSIVE.valueOf() + 1))
            result = VK_SHARING_MODE_RANGE_SIZE;
        
        if (result == null)
            throw new IllegalArgumentException("Illegal value specified for this Enum.");

        return result;
    }
}
