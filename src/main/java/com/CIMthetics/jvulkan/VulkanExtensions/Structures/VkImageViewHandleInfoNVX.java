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
package com.CIMthetics.jvulkan.VulkanExtensions.Structures;

import com.CIMthetics.jvulkan.VulkanCore.Enums.VkDescriptorType;
import com.CIMthetics.jvulkan.VulkanCore.Enums.VkStructureType;
import com.CIMthetics.jvulkan.VulkanCore.Handles.VkImageView;
import com.CIMthetics.jvulkan.VulkanCore.Handles.VkSampler;
import com.CIMthetics.jvulkan.VulkanCore.Structures.CreateInfos.VulkanCreateInfoStructure;

public class VkImageViewHandleInfoNVX extends VulkanCreateInfoStructure
{
    private VkImageView         imageView;
    private VkDescriptorType    descriptorType;
    private VkSampler           sampler;

    public VkImageViewHandleInfoNVX()
    {
        super(VkStructureType.VK_STRUCTURE_TYPE_IMAGE_VIEW_HANDLE_INFO_NVX);
    }

    public VkImageView getImageView()
    {
        return imageView;
    }

    public void setImageView(VkImageView imageView)
    {
        this.imageView = imageView;
    }

    public VkDescriptorType getDescriptorType()
    {
        return descriptorType;
    }

    public void setDescriptorType(VkDescriptorType descriptorType)
    {
        this.descriptorType = descriptorType;
    }

    public VkSampler getSampler()
    {
        return sampler;
    }

    public void setSampler(VkSampler sampler)
    {
        this.sampler = sampler;
    }

}
