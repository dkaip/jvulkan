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
package com.CIMthetics.jvulkan.VulkanCore.Structures;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkImageFormatProperties2 extends VulkanCreateInfoStructure
{
    private VkImageFormatProperties imageFormatProperties = new VkImageFormatProperties();

    public VkImageFormatProperties2()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_IMAGE_FORMAT_PROPERTIES_2);
    }

    public VkImageFormatProperties getImageFormatProperties()
    {
        return imageFormatProperties;
    }

    public void setImageFormatProperties(
            VkImageFormatProperties imageFormatProperties)
    {
        this.imageFormatProperties = imageFormatProperties;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\nVkImageFormatProperties2\n"));
        sb.append(String.format("    imageFormatProperties:%s\n", imageFormatProperties == null ? "null" : imageFormatProperties.toString()));
        
        return sb.toString();
    }
}
