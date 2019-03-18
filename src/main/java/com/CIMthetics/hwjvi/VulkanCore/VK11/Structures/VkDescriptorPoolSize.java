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
package com.CIMthetics.hwjvi.VulkanCore.VK11.Structures;

import com.CIMthetics.hwjvi.VulkanCore.VK11.Enums.VkDescriptorType;

public class VkDescriptorPoolSize
{
    private VkDescriptorType    type;
    private int                 descriptorCount;
    
    public VkDescriptorPoolSize() {}
    
    public VkDescriptorPoolSize(VkDescriptorType type, int descriptorCount)
    {
        this.type            = type;
        this.descriptorCount = descriptorCount;
    }

    public VkDescriptorType getType()
    {
        return type;
    }

    public void setType(VkDescriptorType type)
    {
        this.type = type;
    }

    public int getDescriptorCount()
    {
        return descriptorCount;
    }

    public void setDescriptorCount(int descriptorCount)
    {
        this.descriptorCount = descriptorCount;
    }
    
}
